<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
    <h1>계절책방</h1>

    <hr>

    <h1>book_code로 책 정보 조회</h1>
    <form action="${pageContext.servletContext.contextPath}/seasonBook/select">
        <label>조회할 책 : </label>
        <input type="text" name="bookCode" id="bookCode">
        <button>조회하기</button>
    </form>

    <h1>책 전체 조회</h1>
    <button onclick="location.href='${pageContext.servletContext.contextPath}/seasonBook/list'">
        책 전체 조회하기
    </button>

    <hr>

    <h1>책 추가하기</h1>
    <form action="${ pageContext.servletContext.contextPath }/seasonBook/insert" method="post">
        책 제목 : <input type="text" name="bookName"><br>
        책 작가 : <input type="text" name="author"><br>
        책 장르 : <input type="text" name="bookCategory"><br>
        책 계절 코드 :
        <select name="seasonCode">
            <option value="1">봄</option>
            <option value="2">여름</option>
            <option value="3">가을</option>
            <option value="4">겨울</option>
        </select>
        <br>
        <button type="submit">등록하기</button>
    </form>
    <hr>

    <h1>책 수정하기</h1>
    <form action="${ pageContext.servletContext.contextPath }/seasonBook/update" method="post">
        책 코드 : <input type="text" name="bookCode"/>
        변경할 책 이름 : <input type="text" name="bookName"/>
        <button type="submit">책 제목 변경</button>
    </form>
    <hr>

    <h1>책 삭제하기</h1>
    <form action="${ pageContext.servletContext.contextPath }/seasonBook/delete" method="post">
        책 코드 : <input type="text" name="bookCode"/>
        <button type="submit">책 삭제</button>
    </form>
</body>
</html>
