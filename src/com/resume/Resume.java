package com.resume;
/*
 * ���ˣ��ǹ���Ա��������Ϣ���ڵ�¼ʱӦ�ж�
 * �ڸ�����Ϣ����ɵ���鿴
 */
public class Resume {
	private int id;//����id
	private int uid;//�û�id
	private String introduce;//���ҽ���
	private String workedfor;//�����������Ĺ�˾
	private String workedtime;//��������ʱ��
	private String graduatedfrom;//��ҵ��
	private String prize;//�񽱾���
	private int page;
	private int size;
	private int state;
	
	@Override
	public String toString() {
		return "Resume [id=" + id + ", uid=" + uid + ", introduce=" + introduce
				+ ", workedfor=" + workedfor + ", workedtime=" + workedtime
				+ ", graduatedfrom=" + graduatedfrom + ", prize=" + prize
				+ ", page=" + page + ", size=" + size + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
}
