package sist.com.orm;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import sist.com.dao.BasicDao;
import sist.com.dto.BootBoardBean;
import sist.com.dto.DeptBean;
import sist.com.dto.PagingBean;

@Controller
@SessionAttributes(value= {"bootList","bList","info"})
public class AppleController {
	@Inject
	private BasicDao dao;
	@Resource
	private PagingBean pagingBean;
	
	@RequestMapping(value="crudTest.do")
	public String crudTestView(Model model) {
		model.addAttribute("deptList", dao.selectDeptList());
		return "mvcCrud/crudView";
	}
	
	
	@RequestMapping(value="loginFun.do")
	public String loginActionFun(String id, String pw,HttpSession session) {
		String dbpw=dao.memberIdCheck(id);
		if(pw.equals(dbpw)) {
			session.setAttribute("id", id);
			
			return "board";
		}
		
			return "redirect:sginin.jsp";
		
	}
	
	
	
	@RequestMapping(value="bootInsert.do")
	public String insertBoot(BootBoardBean bean,@RequestParam(value="file",required=false)MultipartFile file) {
		String fileName=file.getOriginalFilename();
		String locations="C:\\Users\\sist9\\Desktop\\spring2\\web\\src\\main\\webapp\\upload\\";  /*upload경로*/
		FileOutputStream fos=null;
		if(fileName.length()>0) {
			try {
				fos=new FileOutputStream(new File(locations+fileName));
				fos.write(file.getBytes());
				bean.setFileName(fileName);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				try {
					if(fos!=null)fos.close();				
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}
		System.out.println(bean);
		dao.insertBoot(bean);
		return "redirect:bootList.do";
	}//insertBoot
	
	
	
	
	
	
	
	/*@ModelAttribute(name="bList")
	public List<BootBoardBean>selectBoard(){
		return dao.selectBootBoard(null);
	}*/
	
	@RequestMapping(value="clickLict1.do")
	public String clickTest1() {
		return "redirect:mvcCrud/view1.jsp";
	}
	@RequestMapping(value="clickLict2.do")
	public String clickTest2() {
		return "redirect:mvcCrud/view2.jsp";
	}
	
	
	
	

	
	@RequestMapping(value="bootList.do")
	public String selectBoot(HttpServletRequest request,Model model, HttpSession session){
		pagingBean.makeProcess(request,model);
		return "board";
	}
	
	
	@RequestMapping(value="hitboard.do")
	public String updateHitBoard(@RequestParam(value="no",required=false,defaultValue="0")int no) {    //no가 들어오든 아니든 보여줘야 할 때 설정해주는 기본값?
		//dao.updateBoard(no);
		dao.updateHitBoard(no);
		return "redirect:infoBoard.do?no="+no+"&job=info";
		
	}
	
	@RequestMapping(value="infoBoard.do")
	
	public String infoBoard(@RequestParam(value="no",required=false,defaultValue="0")int no,Model model) { 
		model.addAttribute("info",dao.infoBoard(no));
		return "redirect:info.jsp";
		
	}
	
	@RequestMapping(value="transactionTest1.do")
	public String transView() {
		dao.insertDataUpdate(1, "AAA");
		
		return "transectionDemo/view";
	}
	
	@RequestMapping(value="deleteBoot.do")
	public String deleteBootFun(int no) {
		dao.deleteBoot(no);
		return "redirect:bootList.do";
	}
	
	@RequestMapping(value="downLoad.do")
	public ModelAndView downFile(@RequestParam(value="fileName")String fileName) {
		String locations="C:\\Users\\sist9\\Desktop\\spring2\\web\\src\\main\\webapp\\upload\\";
		File file=new File(locations.concat(fileName));
		
		return new ModelAndView("download","downloadFile",file);
	}
	
	@RequestMapping(value="jsonView.do")
	public String selectJsonDept(Model model) {
		model.addAttribute("dept",dao.selectDeptList());
		List<DeptBean>list=dao.selectDeptList();
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<list.size();i++) {
			DeptBean deptBean=list.get(i);
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("deptno", deptBean.getDeptno());
			jsonObject.put("dname", deptBean.getDname());
			jsonObject.put("loc", deptBean.getLoc());
			jsonArray.add(jsonObject);
			
		}//for
		model.addAttribute("json", jsonArray);
		return "ajaxJson/ajaxJsonResult";
		
	}
	
	
	
	

}








