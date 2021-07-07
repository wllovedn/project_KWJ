package kr.green.test.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.test.vo.MemberVO;

public interface MemberDAO {

	MemberVO getMember(@Param("id")String id);

	void signup(@Param("user")MemberVO user);
	
}