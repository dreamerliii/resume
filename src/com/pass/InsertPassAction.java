package com.pass;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.opensymphony.xwork2.ActionSupport;
import com.utils.MyBatisUtil;

public class InsertPassAction extends ActionSupport {
	private int resumeid;//Ͷ�͵ļ���id
	private int jid;//���͵��Ĺ�˾id
	private String passtime;//Ͷ��ʱ�䣬���ڱ�֤û�й�ʱ��
	private int state;//����״̬���������ѷ���(0)�����ܾ�(1)������������(2)
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
        	//ִ�в�ѯ����������ѯ����Զ���װ��User����
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
