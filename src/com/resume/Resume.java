package com.resume;
/*
 * 个人（非管理员）简历信息表，在登录时应判断
 * 在个人信息界面可点击查看
 */
public class Resume {
	private int id;//简历id
	private int uid;//用户id
	private String introduce;//自我介绍
	private String workedfor;//曾经工作过的公司
	private String workedtime;//工作过的时间
	private String graduatedfrom;//毕业于
	private String prize;//获奖经历
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
