package com.greedy.section01.xmlconfig;

import static com.greedy.section01.xmlconfig.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

public class MemberService {

	private final MemberDAO memberDAO;
	
	public MemberService() {
		this.memberDAO = new MemberDAO();
	}

	public boolean registNewMember(MemberDTO member) {
		
		SqlSession sqlSession = getSqlSession();
		
		int result = memberDAO.insertMember(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}
	

}
