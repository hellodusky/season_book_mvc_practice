<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>책 정보</title>
</head>
<body>
    <h1>${ param.bookCode }번 책의 정보</h1>
    <h4>책 이름 : ${ selectedBook.bookName }</h4>
    <h4>계절 코드 : ${ selectedBook.seasonCode }</h4>
    <h4>작가 : ${ selectedBook.author }</h4>
    <h4>장르 : ${ selectedBook.bookCategory }</h4>
</body>
</html>
