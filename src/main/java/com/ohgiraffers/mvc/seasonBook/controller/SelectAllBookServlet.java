package com.ohgiraffers.mvc.seasonBook.controller;

import com.ohgiraffers.mvc.seasonBook.model.dto.SeasonBookDTO;
import com.ohgiraffers.mvc.seasonBook.model.service.SeasonBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/seasonBook/list")
public class SelectAllBookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SeasonBookService seasonBookService = new SeasonBookService();
        List<SeasonBookDTO> bookList = seasonBookService.selectAllBook();

        String path = "";
        if (bookList != null && !bookList.isEmpty()) {
            path = "/WEB-INF/views/seasonBook/bookList.jsp";
            req.setAttribute("bookList", bookList);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "책 전체 목록이 조회되지 않았습니다.");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
