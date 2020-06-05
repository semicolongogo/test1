package sist.com.orm;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sist.com.dao.BasicDao;
import sist.com.dto.BootBoardBean;
import sist.com.dto.DeptBean;
@RestController
public class AjaxController {
	
	@Resource
	private BasicDao dao;
	@RequestMapping(value="passwordCheck.do")
	public Map<String,String>getPassCheck(int no,String password){
		Map<String,String>map=new HashMap<String, String>();
		String dbPass=dao.getPassword(no);
		map.put("state", String.valueOf(dbPass!=null&& dbPass.equals(password)));
		return map;
	}
	@RequestMapping(value="ajaxMap.do")
	public String testFun1(HttpServletResponse response, @RequestParam(value="job",required=false,defaultValue="java")String job) throws IOException {
		
		if(job.equals("oracle2")) {
			return "<img src='/orm/upload/6.jpg'>";
		}else if(job.equals("jsp")) {
			return "<script>alert('Hello Spring')</script>";
		}else if(job.equals("oracle")) {
			response.sendRedirect("ajaxJson/ajaxView.jsp");
		}
		return "resetController Msg";
	}
	@RequestMapping(value="ajaxMap2.do")
	public Object infoAjax(String job){
		return dao.infoBoard(Integer.parseInt(job));
	}
	@RequestMapping(value="ajaxMap3.do")
	public List<DeptBean>selectBoot(){
		return dao.selectDeptList();
	}

}








