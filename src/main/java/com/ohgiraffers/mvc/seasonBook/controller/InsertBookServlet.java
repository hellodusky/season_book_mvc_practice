package com.ohgiraffers.mvc.seasonBook.controller;

import com.ohgiraffers.mvc.seasonBook.model.dto.SeasonBookDTO;
import com.ohgiraffers.mvc.seasonBook.model.service.SeasonBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/seasonBook/insert")
public class InsertBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String bookName = req.getParameter("bookName");
        String author = req.getParameter("author");
        String bookCategory = req.getParameter("bookCategory");
        int seasonCode = Integer.parseInt(req.getParameter("seasonCode"));

        SeasonBookDTO book = new SeasonBookDTO();
        book.setBookName(bookName);
        book.setAuthor(author);
        book.setBookCategory(bookCategory);
        book.setSeasonCode(seasonCode);

        SeasonBookService seasonBookService = new SeasonBookService();
        int result = seasonBookService.insertBook(book);

        if(result > 0) {
            resp.sendRedirect(req.getContextPath() + "/seasonBook/list");
        } else {
            req.setAttribute("message", "신규 책 등록에 실패했습니다 ㅠㅠ");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }
    }
}
