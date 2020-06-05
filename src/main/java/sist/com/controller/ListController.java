package sist.com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ListController  extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelAndView=new ModelAndView();
		ArrayList<String>list=new ArrayList<String>();
		list.add("java");
		list.add("oracle");
		list.add("xml");
		list.add("jsp");
		list.add("spring");
		modelAndView.setViewName("mvcLocation/listView");
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	

}





