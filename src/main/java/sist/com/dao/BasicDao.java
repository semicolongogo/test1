package sist.com.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sist.com.dto.BootBoardBean;
import sist.com.dto.DeptBean;
import sist.com.dto.ParamBean;
@Component
public class BasicDao  extends SqlSessionDaoSupport{

	@Autowired
	protected void initDao(SqlSessionTemplate st) throws Exception {
		// TODO Auto-generated method stub
		this.setSqlSessionTemplate(st);
	}	
	
	public List<DeptBean>selectDeptList(){
		return this.getSqlSession().selectList("selectDeptList");
	}
	public String memberIdCheck(String id) {
		return this.getSqlSession().selectOne("memberIdCheck",id);
	}
	public void insertBoot(BootBoardBean bean) {
		this.getSqlSession().insert("insertBoot", bean);
	}
	
	public List<Object> selectBootBoard(HashMap<String, Object>map){
		return this.getSqlSession().selectList("selectBootBoard",map);
		
	}
	
	public void updateHitBoard(int no) {
		this.getSqlSession().update("updateHitBoard",no);
	}
	
	public Object infoBoard(int no) {
		return this.getSqlSession().selectOne("infoBoard",no);
	}

	public void insertDataUpdate(int no,String msg) {		//위에처럼 try catch 안 해도 알아서 롤백하거나 커밋 해줌
		this.getSqlSession().insert("insertDataUpdate",new ParamBean(no,msg));
		this.getSqlSession().update("updateInsert",new ParamBean(1,"KKK"));
	}
	
	public String getPassword(int no) {
		return this.getSqlSession().selectOne("getPassword",no);
	}
	
	public void deleteBoot(int no) {
		this.getSqlSession().delete("deleteBoot",no);
	}
	
	public Integer getTotalMember(HashMap<String, Object>map) {
		return this.getSqlSession().selectOne("sist.com.bean.apple.getTotalMember",map);
	}
	

}





