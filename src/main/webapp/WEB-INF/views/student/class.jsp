<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <title>Document</title>
</head>
<body>
    <a href="/student">학반 메인 화면</a>
    <h1>같은 반 친구들</h1>    
    <c:forEach items = "${list}" var = "list">
        이름 : ${list.res_name} / 전화번호 : ${list.res_phone} / 주소 : ${list.res_address} / 생일 : <fmt:formatDate value="${list.res_birth}" pattern="yyyy년 MM월 dd일" /> <br>
    </c:forEach>
    
</body>
</html>