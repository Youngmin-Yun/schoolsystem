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
    <a href="/teacher">교사 메인</a>
    <a href="/teacher/student/${teacher.ret_grade_age}/${teacher.ret_class_room}">담당반 학생 관리</a>
    <a href="/teacher/student_list">전교생 명부</a>
    <a href="/teacher/assignment">과제 관리</a>
    <a href="/teacher/test/${teacher.ret_grade_age}/${teacher.ret_class_room}">시험 관리</a>
    <h1>교내 교사 리스트</h1>
    <c:forEach items = "${list}" var = "list">
        <p>
            교사명 : ${list.ret_name} / 전화번호 : ${list.ret_phone} / 생일 :<fmt:formatDate value="${list.ret_birth}" pattern="yyyy년 MM월 dd일" /> 
            / 담당과목 : ${list.ret_subject} 
            / 담당 학년 : ${list.ret_grade_age} 학년 / 담당 반 : ${list.ret_class_room}반
        </p>
    </c:forEach>
</body>
</html>