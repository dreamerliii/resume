package com.pass;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.opensymphony.xwork2.ActionSupport;
import com.utils.MyBatisUtil;

public class InsertPassAction extends ActionSupport {
	private int resumeid;//投送的简历id
	private int jid;//发送到的公司id
	private String passtime;//投送时间，用于保证没有过时间
	private int state;//简历状态，包括：已发送(0)，被拒绝(1)，被邀请面试(2)
	public int getResumeid() {
		return resumeid;
	}
	public void setResumeid(int resumeid) {
		this.resumeid = resumeid;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getPasstime() {
		return passtime;
	}
	public void setPasstime(String passtime) {
		this.passtime = passtime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public String insertPass() {
		try {
			/*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
			String statement = "com.mapping.passMapper.insert";
        	Pass pass = new Pass();
        	pass.setJid(getJid());
        	pass.setResumeid(getResumeid());
        	pass.setPasstime(df.format(new Date()));
        	pass.setState(0);
        	//执行查询操作，将查询结果自动封装成User返回
        	sqlSession.insert(statement, pass);
        	sqlSession.close();
        	System.out.println("INSERT OK");*/
			System.out.println(getResumeid());
        	return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
}
