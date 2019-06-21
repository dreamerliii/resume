package com.com_resume;
/*公司收到的简历表
 *为了保证用户修改自己的简历的时候公司收到的简历不会有改动 
 *基本信息与简历表相同
 *当公司查看收到的简历的时候调用
 */
public class Com_resume {

	private int id;//收到的简历编号
	private int jobid;//公司编号
	private int passid;//发来简历的用户编号
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
	
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public int getPassid() {
		return passid;
	}
	public void setPassid(int passid) {
		this.passid = passid;
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
	
}
