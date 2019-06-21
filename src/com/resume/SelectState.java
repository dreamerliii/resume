package com.resume;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.user.User;
import com.utils.MyBatisUtil;

public class SelectState extends ActionSupport {
	private int id;
	private List uid = new ArrayList();
	private List introduce  = new ArrayList();
	private List state  = new ArrayList();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List getUid() {
		return uid;
	}
	public void setUid(List uid) {
		this.uid = uid;
	}
	public List getIntroduce() {
		return introduce;
	}
	public void setIntroduce(List introduce) {
		this.introduce = introduce;
	}
	public List getState() {
		return state;
	}
	public void setState(List state) {
		this.state = state;
	}
	public int selectState(){
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			
			SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
			String statement = "com.mapping.resumeMapper.selectstate";
			List<Resume> resumelist = new ArrayList();
			
			resumelist = sqlSession.selectList(statement, getId());
			int i=0;
			while(i<resumelist.size()){
				uid.add(resumelist.get(i).getId());
				introduce.add(resumelist.get(i).getIntroduce());
				System.out.println(resumelist.get(i).getIntroduce());
				state.add(resumelist.get(i).getState());
				i++;
			}
			sqlSession.close();
    		return 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	public String execute(){
		int i = selectState();
		if(i == 0)
			return "success";
		else
			return "error";
	}
}
