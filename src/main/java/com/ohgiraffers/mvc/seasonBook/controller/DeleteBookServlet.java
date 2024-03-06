package com.ohgiraffers.mvc.seasonBook.controller;

import com.ohgiraffers.mvc.seasonBook.model.dto.SeasonBookDTO;
import com.ohgiraffers.mvc.seasonBook.model.service.SeasonBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/seasonBook/delete")
public class DeleteBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String bookCode = req.getParameter("bookCode");

        SeasonBookDTO seasonBookDTO = new SeasonBookDTO();
        seasonBookDTO.setBookCode(bookCode);

        SeasonBookService seasonBookService = new SeasonBookService();
        int result = seasonBookService.deleteBook(seasonBookDTO);

        if (result > 0) {
            resp.sendRedirect(req.getContextPath() + "/seasonBook/list");
        } else {
            req.setAttribute("message", "직원 정보 삭제에 실패했습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }
    }
}
