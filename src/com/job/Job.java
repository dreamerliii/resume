package com.job;

/*
 * ��˾����Ƹ��ְλ
 * �ڹ�˾������Ϣ����ֻ����jobname
 * �����ȥ��ʾְλ������Ϣ
 */
public class Job {

	private int jid;//ְλid
	private int id;//������˾id
	private String jobname;//ְλ����
	private String name;//��˾����
	private String jobtel;//ְλ�������ŵ绰
	private String recruitment;//��Ƹ��Ϣ
	private String begintime;//��ʼʱ�� Ӧ����xxxx-xx-xx��ʽ�洢
	private String endtime;//����ʱ�� Ӧ����xxxx-xx-xx��ʽ�洢
	
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
