package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.LebVo;

@Repository
public class LebDao {

	@Autowired
	private SqlSession sqlSession;


}
