package com.greedy.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {

	public int insertMember(SqlSession sqlSession, MemberDTO member) {

		return sqlSession.insert("MemberMapper.insertMember", member);
	}

}
