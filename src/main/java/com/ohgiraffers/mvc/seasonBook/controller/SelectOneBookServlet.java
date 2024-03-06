package com.ohgiraffers.mvc.seasonBook.controller;

import com.ohgiraffers.mvc.seasonBook.model.dto.SeasonBookDTO;
import com.ohgiraffers.mvc.seasonBook.model.service.SeasonBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/seasonBook/select")
public class SelectOneBookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookCode = req.getParameter("bookCode");

        SeasonBookService seasonBookService = new SeasonBookService();
        SeasonBookDTO selectCode = seasonBookService.selectedBook(bookCode);

        String path = "";
        if (selectCode != null) {
            path = "/WEB-INF/views/seasonBook/showBookInfo.jsp";
            req.setAttribute("selectedBook", selectCode);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "해당 코드를 가진 책은 존재하지 않습니다.");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
