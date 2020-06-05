package sist.com.orm;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import sist.com.dto.UserException;

@Controller
public class BasicController {
	 
	
	//cmd=input--->InputAction--->execute--->ActionForWard
	
	@RequestMapping(value="mvcSpring/input.do")
	public String formInput(Model model,@RequestParam(name="name",required=false,defaultValue="異섏닔�옣")String name,@RequestParam(name="age",required=false,defaultValue="0")int age) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);		
    	return "mvcSpring/mvcEx1View";
    	
	}		
	@RequestMapping(value="location.do")
	public void locationFun(Model model) {
		model.addAttribute("msg", "HelloSpring");
		//return "mvcSpring/mvcEx1View2";
	}
	@RequestMapping(value="login.do")
	public String loginProcess(String id,String pw,HttpSession session,HttpServletRequest request) {
		if(id.equals("Admin")&& pw.equals("1234")) {
			session.setAttribute("id", id);
			session.setMaxInactiveInterval(60);
			return "redirect:memberList.do";
		}
		return "redirect:jsp/adminLogin.jsp";
	}
	@RequestMapping(value="memberList.do")
	public String memberListAction(Model model) {
		model.addAttribute("list", "MessageList");
		return "jsp/list";
	}
	@RequestMapping(value="logout.do")
	public String logoutProcess(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "redirect:jsp/adminLogin.jsp";
	}
	@RequestMapping(value="logout1.do")
	public String logoutAction(HttpSession session) {
		session.invalidate();
		return "redirect:signin.jsp";
	}
	
	@RequestMapping(value="loggetCook.do")
	public String loginView(@CookieValue(value="idCheck",required=false,defaultValue="")String idCheck,Model model) {
		model.addAttribute("idCheck", idCheck);
		return "jsp/adminLogin";
	}
	@RequestMapping(value="loginCheck.do")
	public String logProcess(String id,String checker,Model model,HttpServletResponse response) {
		Cookie cook=new Cookie("idCheck", id);
		cook.setMaxAge(checker!=null?30:0);
		response.addCookie(cook);
		
		return "";
	}
	
	@RequestMapping(value="nullProcess.do")
	public String locationException1() {		
	   String str=null;
	   str.charAt(0);
	   return "mvcSpring/resultExView";
	}
	
	@RequestMapping(value="calssCastProcess.do")
	public String locationException2() {		
		   String str=(String)new Object();//Object
		   return "mvcSpring/resultExView";
		}
	
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView commandProcess(NullPointerException e) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("exception", e);
		mv.setViewName("mvcSpring/exceptionView");
		return mv;
	}
	@ExceptionHandler(ClassCastException.class)
	public ModelAndView commandProcess2(ClassCastException e) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("exception", e);
		mv.setViewName("mvcSpring/exceptionView");
		return mv;
	}	
	@RequestMapping(value="userProcess.do")
	public String userEx(int port) throws UserException {
		if(port>=3000 && port<=5000) {
			throw new UserException("port 3000~5000 제외");
		}
		 return "mvcSpring/resultExView";
	}
	@ExceptionHandler(UserException.class)	
	public ModelAndView commandProcess3(UserException e) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("exception", e);
		mv.setViewName("mvcSpring/exceptionView");
		return mv;
	}	
	
	
	
	
	

}







