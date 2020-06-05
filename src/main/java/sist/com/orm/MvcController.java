package sist.com.orm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import sist.com.dto.ParamBean;

@Controller
public class MvcController {
	
/*	@RequestMapping(value="/mvcSpring/headerAction.do")
	public String headerRead() {
		//return "mvcEx2Result";   //-->view reserve를 탄다
		//return "redirect:mvcEx2Result.jsp";
		return "mvcSpring/mvcEx2Result";
	}*/
	
	
	@RequestMapping(value="/headerAction.do")
	public String headerRead(@RequestHeader("Accept")String acceptType,
			@RequestHeader("Host")String host,
			@RequestHeader(value="User-Agent",required=false,defaultValue="my")String userAgent,Model model) {
		model.addAttribute("acceptType",acceptType);
		model.addAttribute("Host",host);
		model.addAttribute("User-Agent",userAgent);
		
	return "mvcSpring/mvcEx2Result";
	}
	
	@RequestMapping(value="/headerAction2.do")
	public String headerRead2(@RequestHeader Map<String, String>map,ModelMap model) {
		model.addAttribute("map",map);
		return "mvcSpring/mvcEx2Result2";
	}
	
	@RequestMapping(value="cookieTest.do")
	public String cookieDemo(@RequestParam(value="color",required=false,defaultValue="White")String color,HttpServletResponse response,Model model) {
		Cookie cookie=new Cookie("color", color);
		cookie.setMaxAge(30);
		response.addCookie(cookie);
		model.addAttribute("color",color);
	
		return "mvcSpring/colorView";
		
	}
	
	@RequestMapping(value="cookieCheck.do")
	public String cookieCheckPro(@CookieValue(value="color",required=false,defaultValue="white")String cookie,Model model) {
		model.addAttribute("color",cookie);
		
		return "mvcSpring/colorCookie";
	}
	
	@ModelAttribute(name="strMsg")
	public List<String>stringMsg(){
		List<String>list=new ArrayList<String>();
		list.add("딸기");
		list.add("수박");
		list.add("멜론");
		return list;
	}
	
	
	
	
	/*------mvcEx4-------*/
	//dispatcher
	@RequestMapping(value="mvcLocation1.do",method=RequestMethod.GET)
	public String locationFun1(Model model) {
		model.addAttribute("msg","HelloSpring");
		return "mvcSpring/mvcEx4Result";  //디스패처로 가는거라 view reserve를 탐 (자동으로 .jsp붙음)
	}
	
	//redirect
	@RequestMapping(value="mvcLocation2.do",method=RequestMethod.GET)   //a태그는 get방식이기 때문에 POST로 받으면 에러
	public String locationFun2(Model model) {
		model.addAttribute("msg","HelloSpring");
		return "redirect:mvcSpring/mvcEx4Result.jsp";	//redirect로 보냄
	}
	
	@RequestMapping(value="mvcLocation3.do",method=RequestMethod.GET)
	public String locationFun3(@ModelAttribute(name="param") ParamBean bean, Model model) {
		HashMap<String, String>map=new HashMap<String,String>();
		map.put("a", "Action");
		map.put("b", "Bean");
		map.put("c", "Crud");
		System.out.println(bean);
		model.addAttribute("map",map);
		return "mvcSpring/mvcEx4Result";
	}
	
/*	@RequestMapping(value="mvcSpring/mvcLocation4.do")
	public String locationFun4() {
		return "redirect:mvcSpring/mvcEx4Result.jsp";
		
	}*/ 
	
/*	@RequestMapping(value="mvcSpring/mvcLocation4.do")
	public String locationFun4() {
		return "mvcSpring/mvcEx4Result";
		
	}*/
	
	@RequestMapping(value="mvcSpring/mvcLocation4.do")
	public String locationFun4(String job,int no,Model model,RedirectAttributes ar) {
		ar.addAttribute("job", job);
		ar.addAttribute("no", no);
		
		/*model.addAttribute("job",job);
		model.addAttribute("no",no);*/
		return "redirect:/mvcSpring/mvcEx4Result.jsp?job=info&no=5";
	}
	//action을 redirect할때는 addFlashAttribute씀
	
/*	@RequestMapping(value="mvcSpring/mvcLocation5.do")
	public String locationFun5(String msg,String data,RedirectAttributes ar) {
		
		ar.addAttribute("msg", msg);
		ar.addAttribute("data", data);
		return "redirect:/mvcSpring/mvcEx4Result.jsp";
		
		
	}*/
	
	@RequestMapping(value="mvcSpring/mvcLocation5.do")
	public String locationFun5(String msg,String data,RedirectAttributes ar) {
		
		/*ar.addAttribute("msg", msg);
		ar.addAttribute("data", data);*/
		
		ar.addFlashAttribute("msg",msg);
		ar.addFlashAttribute("data",data);  //많은 양을 처리할 때 적합
		
		return "redirect:/mvcSpring.do";
	}
	
	@RequestMapping(value="mvcSpring.do")
	public String locactionFun5(@RequestParam(value="msg",required=false,defaultValue="")String msg,
			@RequestParam(value="data",required=false,defaultValue="")String data,HttpServletRequest request) {
		  Map<String, Object>map= (Map<String, Object>) RequestContextUtils.getInputFlashMap(request);
		  System.out.println(map.get("msg"));
		  System.out.println(map.get("data"));
		  
		return "";
	}

}
