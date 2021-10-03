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
    <a href="/teacher">교사 메인</a>
    <a href="/teacher/student/${teacher.ret_grade_age}/${teacher.ret_class_room}">담당반 학생 관리</a>
    <a href="/teacher/teacher_list">교사 연락 리스트</a>
    <a href="/teacher/assignment">과제 관리</a>
    <h1>전교생의 학생 리스트 확인</h1>
    <c:forEach items = '${list}' var="list">
    <p>이름 : ${list.res_name} 연락처 : ${list.res_phone} 보호자 연락처 : ${list.res_phone2} 주소 : ${list.res_address}
        학년 : 
        <c:if test = "${list.res_age == 17}"> 1 학년</c:if>
        <c:if test = "${list.res_age == 18}"> 2 학년</c:if>
        <c:if test = "${list.res_age == 19}"> 3 학년</c:if>
         반 : ${list.res_class_room} 반
    </p>
    </c:forEach>
</body>
</html>