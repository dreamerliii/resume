package com.resume;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.job.Job;
import com.opensymphony.xwork2.ActionSupport;
import com.user.DisplayUser;
import com.user.User;
import com.utils.MyBatisUtil;
public class displayResumeAction extends ActionSupport {
	private List id = new ArrayList();//简历id
	private List uid = new ArrayList();//用户id
	private List introduce = new ArrayList();//自我介绍
	private List workedfor = new ArrayList();//曾经工作过的公司
	private List workedtime = new ArrayList();//工作过的时间
	private List graduatedfrom = new ArrayList();//毕业于
	private List prize = new ArrayList();//获奖经历
	private int page = 0;
	private int next;
	private int number;
	private List jid = new ArrayList();//职位id
	private List cid = new ArrayList();//公司id
	private List comname = new ArrayList();//所属公司id
	private List jobname = new ArrayList();//职位名称
	
	public List getJid() {
		return jid;
	}
	public void setJid(List jid) {
		this.jid = jid;
	}
	public List getCid() {
		return cid;
	}
	public void setCid(List cid) {
		this.cid = cid;
	}
	public List getComname() {
		return comname;
	}
	public void setComname(List comname) {
		this.comname = comname;
	}
	public List getJobname() {
		return jobname;
	}
	public void setJobname(List jobname) {
		this.jobname = jobname;
	}
	
	public List getId() {
		return id;
	}
	public void setId(List id) {
		this.id = id;
	}
	public List getUid() {
		return uid;
	}
	public void setUid(List uid) {
		this.uid = uid;
	}
	public List getIntroduce() {
		return introduce;
	}
	public void setIntroduce(List introduce) {
		this.introduce = introduce;
	}
	public List getWorkedfor() {
		return workedfor;
	}
	public void setWorkedfor(List workedfor) {
		this.workedfor = workedfor;
	}
	public List getWorkedtime() {
		return workedtime;
	}
	public void setWorkedtime(List workedtime) {
		this.workedtime = workedtime;
	}
	public List getGraduatedfrom() {
		return graduatedfrom;
	}
	public void setGraduatedfrom(List graduatedfrom) {
		this.graduatedfrom = graduatedfrom;
	}
	public List getPrize() {
		return prize;
	}
	public void setPrize(List prize) {
		this.prize = prize;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int displayResume(){
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
			User user = new User();
			/*user.setId(2);*/
			request.getSession().setAttribute("userid", 2);
			DisplayUser displayUser = new DisplayUser(); 
			user=displayUser.displayUsers(2);
			request.getSession().setAttribute("name", user.getName());
			request.getSession().setAttribute("male", user.getMale());
			request.getSession().setAttribute("age", user.getAge());
			request.getSession().setAttribute("location", user.getLocation());
			request.getSession().setAttribute("tel", user.getTel());
			request.getSession().setAttribute("email", user.getEmail());
			request.getSession().setAttribute("want1", user.getWant1());
			request.getSession().setAttribute("want2", user.getWant2());
			request.getSession().setAttribute("want3", user.getWant3());
			if(next==1){
				setPage(getPage()+1);
			}else if(next==0){
				setPage(getPage()-1);
			}else{
				setPage(getNumber());
			}
			Resume resume = new Resume();
			if(getPage()<=0){
    			setPage(1);
    		}
    		resume.setUid(2);
    		resume.setSize(10);
    		String length = "com.mapping.resumeMapper.selectmax";
			int size = sqlSession.selectOne(length,resume);
			int large = (size/10)+1;
			
			if((getPage()-1)*10>=size)
			{
				resume.setSize(size%10);
				setPage((size/10)+1);
			}
			resume.setPage((getPage()-1)*10);
			System.out.println("qwe"+large);
    		request.getSession().setAttribute("large", large);
    		request.getSession().setAttribute("page", getPage());
    		String statement = "com.mapping.resumeMapper.select";
    		List<Resume> resumelist = new ArrayList();
    		resumelist = sqlSession.selectList(statement,resume);
    		System.out.println(resumelist.size());
    		
    		String state = "com.mapping.jobMapper.selectall";
			List<Job> joblist = new ArrayList();
			joblist = sqlSession.selectList(state);
    		int w=0;
    		
    		while(w<joblist.size()){
    			jid.add(joblist.get(w).getJid());
    			cid.add(joblist.get(w).getId());
  			    comname.add(joblist.get(w).getName());
  			    jobname.add(joblist.get(w).getJobname());
    			w++;
    		}
    		
    		sqlSession.close();
    		int i=0;
    		System.out.println(resumelist);
    		while(i<resumelist.size()){
    			
    			id.add(resumelist.get(i).getId());
  			    uid.add(2);
    			introduce.add(resumelist.get(i).getIntroduce());
    			workedfor.add(resumelist.get(i).getWorkedfor());
    			workedtime.add(resumelist.get(i).getWorkedtime());
    			graduatedfrom.add(resumelist.get(i).getGraduatedfrom());
    			prize.add(resumelist.get(i).getPrize());
    			i++;
    		}
    		return 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}
	
	public String execute(){
		int i = displayResume();
		if(i == 0)
			return "success";
		else
			return "error";
	}
}
