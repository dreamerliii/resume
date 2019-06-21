package com.pass;
/*
 * 简历投送记录表，用于记录简历的状态等信息
 * 由于同一个简历可以多次投送，所以用此表区分
 * 在个人信息界面查看已投送简历的状态和数量时调用
 */
public class Pass {

	private int id;//投送记录id
	private int resumeid;//投送的简历id
	private int jid;//发送到的职位id
	private String passtime;//投送时间，用于保证没有过时间
	private int state;//简历状态，包括：已发送(0)，被拒绝(1)，被邀请面试(2)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
}
