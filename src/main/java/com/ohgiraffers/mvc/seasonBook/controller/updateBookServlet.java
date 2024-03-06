package com.ohgiraffers.mvc.seasonBook.controller;

import com.ohgiraffers.mvc.seasonBook.model.dto.SeasonBookDTO;
import com.ohgiraffers.mvc.seasonBook.model.service.SeasonBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/seasonBook/update")
public class updateBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String bookCode = req.getParameter("bookCode");
        String bookName = req.getParameter("bookName");

        SeasonBookDTO seasonBookDTO = new SeasonBookDTO();
        seasonBookDTO.setBookCode(bookCode);
        seasonBookDTO.setBookName(bookName);

        SeasonBookService seasonBookService = new SeasonBookService();
        int result = seasonBookService.updateBook(seasonBookDTO);

        if (result > 0) {
            resp.sendRedirect(req.getContextPath() + "/seasonBook/select?bookCode="+bookCode);
        } else {
            req.setAttribute("message", "책 정보 수정에 실패했습니다 ㅠㅠ");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }
    }
}
