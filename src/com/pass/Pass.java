package com.pass;
/*
 * ����Ͷ�ͼ�¼�����ڼ�¼������״̬����Ϣ
 * ����ͬһ���������Զ��Ͷ�ͣ������ô˱�����
 * �ڸ�����Ϣ����鿴��Ͷ�ͼ�����״̬������ʱ����
 */
public class Pass {

	private int id;//Ͷ�ͼ�¼id
	private int resumeid;//Ͷ�͵ļ���id
	private int jid;//���͵���ְλid
	private String passtime;//Ͷ��ʱ�䣬���ڱ�֤û�й�ʱ��
	private int state;//����״̬���������ѷ���(0)�����ܾ�(1)������������(2)
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
