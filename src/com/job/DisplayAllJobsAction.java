/*package com.job;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.resume.Resume;
import com.utils.MyBatisUtil;

public class DisplayAllJobsAction extends ActionSupport {
	private List cid = new ArrayList();//职位id
	private List comname = new ArrayList();//所属公司id
	private List jobname = new ArrayList();//职位名称
	
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
	public int displayAllJobs() {
		try {
			SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
			String state = "com.mapping.jobMapper.selectall";
			List<Job> joblist = new ArrayList();
			joblist = sqlSession.selectList(state);
			sqlSession.close();
    		int w=0;
    		System.out.println("asdasd");
    		while(w<joblist.size()){
    			cid.add(joblist.get(w).getId());
  			    comname.add(joblist.get(w).getComname());
  			    jobname.add(joblist.get(w).getJobname());
    			w++;
    		}
        	return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	public String execute(){
		int i = displayAllJobs();
		if(i == 0)
			return "success";
		else
			return "error";
	}
}
*/