package com.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.job.Job;
import com.opensymphony.xwork2.ActionSupport;
import com.resume.Resume;
import com.utils.MyBatisUtil;

public class DisplayUser extends ActionSupport {

	private int id;//用户编号
	private String username;//用户名
	private String password;//密码
	private String name;//姓名
	private int role;//用户身份
	private int male;//性别
	private int age;//年龄
	private String location;//所在城市
	private String tel;//电话
	private String email;//邮箱
	private String want1;//想要的岗位1
	private String want2;//想要的岗位2
	private String want3;//想要的岗位3
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getMale() {
		return male;
	}
	public void setMale(int male) {
		this.male = male;
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
	public User displayUsers(int id){
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "com.mapping.userMapper.select";
		User user = new User();
		user.setId(id);
		user = sqlSession.selectOne(statement, user);
		sqlSession.close();
		return user;
	}
	
	public int displayUser(){
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			
			request.getSession().setAttribute("id", getId());
			request.getSession().setAttribute("name", getName());
			request.getSession().setAttribute("male", getMale());
			request.getSession().setAttribute("age", getAge());
			request.getSession().setAttribute("location", getLocation());
			request.getSession().setAttribute("tel", getTel());
			request.getSession().setAttribute("email", getEmail());
			request.getSession().setAttribute("want1", getWant1());
			request.getSession().setAttribute("want2", getWant2());
			request.getSession().setAttribute("want3", getWant3());
    		return 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	public String execute(){
		int i = displayUser();
		if(i == 0)
			return "success";
		else
			return "error";
	}
}
