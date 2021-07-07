package kr.green.test.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.test.vo.BoardVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList();

	BoardVO getBoard(@Param("num")Integer num);
}