package sist.com.dto;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import sist.com.dao.BasicDao;

@Component
public class PagingBean {
	@Autowired
	BasicDao dao;
	@Resource
	StringBuffer sb;
	public void makeProcess(HttpServletRequest request,Model model) {
		HashMap<String, Object>map=new HashMap<String, Object>();
		String query=request.getParameter("query");
		String data=request.getParameter("data");
		List<Object>list=null;
	
		int pageScale=2;
		int totalRow=0;
		int totalPage=1;
		int currentPage=1;
		
		map.put("query", query);
		map.put("data", data);
		
		totalRow=dao.getTotalMember(map);
		
		totalPage=(totalPage=totalRow%pageScale==0?(totalRow/pageScale):(totalRow/pageScale)+1)==0?1:totalPage;
		
		try {
			currentPage=Integer.parseInt(request.getParameter("page"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		int start=1+(currentPage-1)*pageScale;
	    int end=pageScale+(currentPage-1)*pageScale;
	    int currentBlock=currentPage%pageScale==0?(currentPage/pageScale):(currentPage/pageScale)+1;
	    int startPage=1+(currentBlock-1)*pageScale;
	    int endPage=(pageScale+(currentBlock-1)*pageScale);
	    endPage=(endPage)>=totalPage?totalPage:endPage;
	    map.put("start",start);
	    map.put("end",end);	 
	    list=dao.selectBootBoard(map);
	    model.addAttribute("bootList", list);
	    sb.delete(0, sb.length());
	    sb.append("<ul class=\"pagination\">");
	    sb.append("<li><a href=\"bootList.do?page=1\">처음</a></li>");
	    if(currentBlock>1) {
	    sb.append("<li><a href=\"bootList.do?page="+(startPage-1)+"\">이전</a></li>");
	    }else {
	    	if(currentPage !=1) {
	    	sb.append("<li><a href=\"bootList.do?page="+(currentPage-1)+"\">이전</a></li>");	
	    	}
	    }
	    for(int i=startPage;i<=endPage;i++) {
	       if(currentPage!=i)
	       sb.append("<li><a href=\"bootList.do?page="+i+"\">"+(i)+"</a></li>");
	       else
	       sb.append("<li class=\"active\"><a href=\"#\">"+(i)+"</a></li>");   
	    }
	    
	    sb.append("<li><a href=\"#\">다음</a></li>");
	    sb.append("<li><a href=\"bootList.do?page="+(endPage)+"\">마지막</a></li>");
	    sb.append("</ul>");
	    
	    model.addAttribute("sb",sb);
	    
	}

}
