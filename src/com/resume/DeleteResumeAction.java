package com.resume;

import org.apache.ibatis.session.SqlSession;

import com.opensymphony.xwork2.ActionSupport;
import com.utils.MyBatisUtil;

public class DeleteResumeAction extends ActionSupport {
	private int id;//����id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String deleteResume() {
		try {
			SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
			String statement = "com.mapping.resumeMapper.delete";
        	Resume resume = new Resume();
        	resume.setId(getId());
        	//ִ�в�ѯ����������ѯ����Զ���װ��User����
        	sqlSession.delete(statement, resume);
        	sqlSession.close();
        	System.out.println("DELETE OK");
        
        	return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
}
