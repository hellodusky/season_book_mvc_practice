<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>책 전체 조회</title>
</head>
<body>
<h1>책 전체 조회</h1>
<table>
    <tr>
        <th>책 번호</th>
        <th>책 이름</th>
        <th>작가</th>
        <th>장르</th>
        <th>계절 코드</th>
    </tr>
    <c:forEach items="${ bookList }" var="book">
        <tr>
            <td>${ book.bookCode }</td>
            <td>${ book.bookName }</td>
            <td>${ book.author }</td>
            <td>${ book.bookCategory }</td>
            <td>${ book.seasonCode }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
