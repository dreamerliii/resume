package com.user;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.utils.MyBatisUtil;

public class UpdateUserAction extends ActionSupport {
	private int id;//�û����
	private String name;//����
	private int age;//����
	private String location;//���ڳ���
	private String tel;//�绰
	private String email;//����
	private String want1;//��Ҫ�ĸ�λ1
	private String want2;//��Ҫ�ĸ�λ2
	private String want3;//��Ҫ�ĸ�λ3
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWant1() {
		return want1;
	}
	public void setWant1(String want1) {
		this.want1 = want1;
	}
	public String getWant2() {
		return want2;
	}
	public void setWant2(String want2) {
		this.want2 = want2;
	}
	public String getWant3() {
		return want3;
	}
	public void setWant3(String want3) {
		this.want3 = want3;
	}
	public String updateUser(){
		HttpServletRequest request = ServletActionContext.getRequest();
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.mapping.userMapper.update";
		User user = new User();
		user.setId(getId());
		user.setName(getName());
		user.setAge(getAge());
		user.setLocation(getLocation());
		user.setTel(getTel());
		user.setEmail(getEmail());
		user.setWant1(getWant1());
		user.setWant2(getWant2());
		user.setWant3(getWant3());
		sqlSession.update(statement, user);
		return SUCCESS;
	}
}
