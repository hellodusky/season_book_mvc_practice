package com.ohgiraffers.mvc.seasonBook.model.service;

import com.ohgiraffers.mvc.seasonBook.model.dto.SeasonBookDTO;
import com.ohgiraffers.mvc.seasonBook.model.dao.SeasonBookMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.mvc.common.mybatis.Template.getSqlSession;

public class SeasonBookService {

    private SeasonBookMapper seasonBookMapper;
    public SeasonBookDTO selectedBook(String bookCode) {

        SqlSession sqlSession = getSqlSession();

        seasonBookMapper = sqlSession.getMapper(SeasonBookMapper.class);

        SeasonBookDTO seasonBook = seasonBookMapper.selectedBook(bookCode);

        sqlSession.close();

        return seasonBook;

    }

    public List<SeasonBookDTO> selectAllBook() {

        SqlSession sqlSession = getSqlSession();

        seasonBookMapper = sqlSession.getMapper(SeasonBookMapper.class);

        List<SeasonBookDTO> bookList = seasonBookMapper.selectAllBook();

        sqlSession.close();

        return bookList;
    }

    public int insertBook(SeasonBookDTO book) {

        SqlSession sqlSession = getSqlSession();

        seasonBookMapper = sqlSession.getMapper(SeasonBookMapper.class);

        int result = seasonBookMapper.insertBook(book);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int updateBook(SeasonBookDTO book) {

        SqlSession sqlSession = getSqlSession();

        seasonBookMapper = sqlSession.getMapper(SeasonBookMapper.class);

        int result = seasonBookMapper.updateBook(book);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;

    }

    public int deleteBook(SeasonBookDTO book) {

        SqlSession sqlSession = getSqlSession();

        seasonBookMapper = sqlSession.getMapper(SeasonBookMapper.class);

        int result = seasonBookMapper.deleteBook(book);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;

    }
}
