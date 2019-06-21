package com.job;

/*
 * 公司想招聘的职位
 * 在公司基本信息界面只出现jobname
 * 点击进去显示职位基本信息
 */
public class Job {

	private int jid;//职位id
	private int id;//所属公司id
	private String jobname;//职位名称
	private String name;//公司名称
	private String jobtel;//职位所属部门电话
	private String recruitment;//招聘信息
	private String begintime;//开始时间 应该以xxxx-xx-xx格式存储
	private String endtime;//结束时间 应该以xxxx-xx-xx格式存储
	
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobtel() {
		return jobtel;
	}
	public void setJobtel(String jobtel) {
		this.jobtel = jobtel;
	}
	public String getRecruitment() {
		return recruitment;
	}
	public void setRecruitment(String recruitment) {
		this.recruitment = recruitment;
	}
	public String getBegintime() {
		return begintime;
	}
	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
}
