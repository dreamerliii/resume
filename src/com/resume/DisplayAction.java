package com.resume;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public class DisplayAction {
	private int id;//����id
	private String introduce;//���ҽ���
	private String workedfor;//�����������Ĺ�˾
	private String workedtime;//��������ʱ��
	private String graduatedfrom;//��ҵ��
	private String prize;//�񽱾���
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public int display(){
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			
			request.getSession().setAttribute("id", getId());
			request.getSession().setAttribute("introduce", getIntroduce());
			request.getSession().setAttribute("workedfor", getWorkedfor());
			request.getSession().setAttribute("workedtime", getWorkedtime());
			request.getSession().setAttribute("graduatedfrom", getGraduatedfrom());
			request.getSession().setAttribute("prize", getPrize());
    		return 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	public String execute(){
		int i = display();
		if(i == 0)
			return "success";
		else
			return "error";
	}
	
}
