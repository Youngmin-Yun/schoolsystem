<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/admin.js"></script>
    <title>Document</title>
</head>

<body>
    <h1>학생페이지</h1>
    <a href="/student/${student.res_age}/${student.res_class_room}">같은 반 친구들</a>
    <a href="/student/classNotice/${student.res_age}/${student.res_class_room}">공지사항</a>
    <a href="#">과제 제출</a>
    <a href="#">중간/기말 점수 확인</a>
    <a href="#" id = "logout">로그아웃</a>
    <h1>내 정보</h1>
    ${student.res_seq}
    이름 : ${student.res_name}
    전화번호 : ${student.res_phone}
    보호자 전화번호 : ${student.res_phone2}
    주소 : ${student.res_address}
    생일 : <fmt:formatDate value="${student.res_birth}" pattern="yyyy년 MM월 dd일" />
    <button type="button" id="change" onclick="location.href='/student/info/change'">내 정보 수정</button>

</body>

</html>