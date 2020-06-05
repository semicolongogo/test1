package sist.com.basic.di8;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServletAction {
	/*@Resource(name="action") java*/
	/*@Autowired*/
	/*@Inject*/
	/*@Resource(name="action")*/
	private Action action;
	/*@Autowired*/
	/*@Inject*/
	
	public ServletAction(Action action) {
		super();
		this.action = action;
	}

	public Action getAction() {
		return action;
	}
   /* @Resource*/
	/*@Inject*/
	/*@Autowired*/
	public void setAction(Action action) {
		this.action = action;
	}
	/*@Autowired*/
	/*@Inject*/
	@Resource
	public void fjasdkf(Action action) {
		this.action=action;
	}

	@Override
	public String toString() {
		return "ServletAction [action=" + action + "]";
	}
	
	

}
