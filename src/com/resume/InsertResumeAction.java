package com.resume;

import org.apache.ibatis.session.SqlSession;
import com.opensymphony.xwork2.ActionSupport;
import com.utils.MyBatisUtil;
public class InsertResumeAction extends ActionSupport {
	private int uid;//用户id
	private String introduce;//自我介绍
	private String workedfor;//曾经工作过的公司
	private String workedtime;//工作过的时间
	private String graduatedfrom;//毕业于
	private String prize;//获奖经历
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public String insertResume() {
		try {
			SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
			String statement = "com.mapping.resumeMapper.insert";
        	Resume resume = new Resume();
        	resume.setUid(3);
        	resume.setIntroduce(getIntroduce());
        	resume.setWorkedfor(getWorkedfor());
        	resume.setWorkedtime(getWorkedtime());
        	resume.setGraduatedfrom(getGraduatedfrom());
        	resume.setPrize(getPrize());
        	//执行查询操作，将查询结果自动封装成User返回
        	sqlSession.insert(statement, resume);
        	sqlSession.close();
        	System.out.println("INSERT OK");
        
        	return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
}
