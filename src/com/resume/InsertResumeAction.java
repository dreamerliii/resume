package com.resume;

import org.apache.ibatis.session.SqlSession;
import com.opensymphony.xwork2.ActionSupport;
import com.utils.MyBatisUtil;
public class InsertResumeAction extends ActionSupport {
	private int uid;//�û�id
	private String introduce;//���ҽ���
	private String workedfor;//�����������Ĺ�˾
	private String workedtime;//��������ʱ��
	private String graduatedfrom;//��ҵ��
	private String prize;//�񽱾���
	
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
	public String insertResume() {
		try {
			SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
			String statement = "com.mapping.resumeMapper.insert";
        	Resume resume = new Resume();
        	resume.setUid(3);
        	resume.setIntroduce(getIntroduce());
        	resume.setWorkedfor(getWorkedfor());
        	resume.setWorkedtime(getWorkedtime());
        	resume.setGraduatedfrom(getGraduatedfrom());
        	resume.setPrize(getPrize());
        	//ִ�в�ѯ����������ѯ����Զ���װ��User����
        	sqlSession.insert(statement, resume);
        	sqlSession.close();
        	System.out.println("INSERT OK");
        
        	return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
}
