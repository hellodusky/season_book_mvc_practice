package com.ohgiraffers.mvc.seasonBook.model.dao;

import com.ohgiraffers.mvc.seasonBook.model.dto.SeasonBookDTO;

import java.util.List;

public interface SeasonBookMapper {
    public SeasonBookDTO selectedBook(String bookCode);

    List<SeasonBookDTO> selectAllBook();

    int insertBook(SeasonBookDTO book);

    int updateBook(SeasonBookDTO book);

    int deleteBook(SeasonBookDTO book);
}
