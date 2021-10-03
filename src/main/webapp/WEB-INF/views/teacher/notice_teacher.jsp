<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/notice_teacher.js"></script>
    <title>Document</title>
</head>
<body>
    <h1>공지사항 입력</h1>
    <a href="/teacher">돌아가기</a>
    <div class="notic">
        <div class="date">
            <tr>
                <td>날짜 선택</td>
                <td><input type="date" id = "date"></td>
                <td>제목 <input type="text" id = "title"></td>
                <td>글쓴이 : <input type = "text" id = "name" value="${teacher.ret_seq}" hidden>${teacher.ret_name}</td>
                <br>
                <td>내용 : <textarea id="contents" cols="30" rows="10"></textarea></td>
                <td><button type="button" id="save">등록</button></td>
                
            </tr>
        </div>
    </div>
</body>
</html>