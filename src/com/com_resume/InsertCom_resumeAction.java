package com.com_resume;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.pass.Pass;
import com.utils.MyBatisUtil;

public class InsertCom_resumeAction extends ActionSupport {

	private int id;//收到的简历编号
	private int cid;//公司编号
	private int jid;//职位编号
	private String introduce;//自我介绍
	private String workedfor;//曾经工作过的公司
	private String workedtime;//工作过的时间
	private String graduatedfrom;//毕业于
	private String prize;//获奖经历
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getWorkedfor() {
		return workedfor;
	}
	public void setWorkedfor(String workedfor) {
		this.workedfor = workedfor;
	}
	public String getWorkedtime() {
		return workedtime;
	}
	public void setWorkedtime(String workedtime) {
		this.workedtime = workedtime;
	}
	public String getGraduatedfrom() {
		return graduatedfrom;
	}
	public void setGraduatedfrom(String graduatedfrom) {
		this.graduatedfrom = graduatedfrom;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String insertCom_resume() {
		try {
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
			
		
			Pass pass = new Pass();
			pass.setResumeid(getId());
			pass.setJid(getJid());
			pass.setState(0);
			pass.setPasstime(df.format(new Date()));
			String statement = "com.mapping.passMapper.selectall";
			Pass ps = new Pass();
			ps = sqlSession.selectOne(statement, pass);
			if(ps!=null){
				return ERROR;//得加ajax
			}
			statement = "com.mapping.passMapper.insert";
			sqlSession.insert(statement,pass);
			statement = "com.mapping.passMapper.select";
			int passid = sqlSession.selectOne(statement);
			
			Com_resume con_resume = new Com_resume();
			con_resume.setJobid(getJid());
			con_resume.setPassid(passid);
			con_resume.setIntroduce(getIntroduce());
			con_resume.setWorkedfor(getWorkedfor());
			con_resume.setWorkedtime(getWorkedtime());
			con_resume.setGraduatedfrom(getGraduatedfrom());
			con_resume.setPrize(getPrize());
			statement = "com.mapping.com_resumeMapper.insert";
			sqlSession.insert(statement,con_resume);
        	return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
}
