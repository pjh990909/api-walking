package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.YysDao;
import com.javaex.vo.YysVo;

@Service
public class YysService {

	@Autowired
	private YysDao yysDao;

	// 리스트 가져오기
	public List<YysVo> exeCourseList(String users_no) {
		System.out.println("YysService.exeCourseList()");

		List<YysVo> coursebookList = yysDao.coursebookList(users_no);

		return coursebookList;
	}

	// 리스트 가져오기
	public List<YysVo> exeCoursefList(String users_no) {
		System.out.println("YysService.exeCoursefList()");

		List<YysVo> coursebookfList = yysDao.coursebookfList(users_no);

		return coursebookfList;
	}

	// 리스트 가져오기
	public List<YysVo> exeCoursereviewList(int course_no) {
		System.out.println("YysService.exeCoursereviewList()");

		List<YysVo> coursereviewList = yysDao.coursereviewList(course_no);

		return coursereviewList;
	}

	// 저장
	public int exereviewupdate(YysVo yysVo) {
		System.out.println("YysService.exereviewupdate()");

		// 등록
		int count = yysDao.reviewinsert(yysVo);

		return count;
	}

	// 즐겨찾기 해당 정보 가져오기
	public YysVo exeonefavoritesinfo(YysVo yVo) {
		System.out.println("YysService.exeonefavoritesinfo()");

		YysVo yysVo = yysDao.favoritesOne(yVo);

		return yysVo;
	}

	// 즐겨찾기 저장
	public int exefavoritesupdate(YysVo yysVo) {
		System.out.println("YysService.exefavoritesupdate()");

		int count = yysDao.favoritesinsert(yysVo);

		return count;
	}

	// 즐겨찾기 삭제
	public int exefavoritesdelete(YysVo yysVo) {
		System.out.println("YysService.exefavoritesdelete()");

		// 등록
		int count = yysDao.favoritesdelete(yysVo);

		return count;
	}

	// 즐겨찾기 저장
	public int exelikeupdate(YysVo yysVo) {
		System.out.println("YysService.exelikeupdate()");

		int count = yysDao.likeinsert(yysVo);

		return count;
	}

	// 즐겨찾기 삭제
	public int exelikedelete(YysVo yysVo) {
		System.out.println("YysService.exelikedelete()");

		// 등록
		int count = yysDao.likedelete(yysVo);

		return count;
	}

}
