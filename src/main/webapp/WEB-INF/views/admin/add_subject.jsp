<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/subject.js"></script>
    <title>Document</title>
</head>

<body>
    <a href="/admin/teacher/list">교사 리스트</a>
    <a href="/admin/student/list">학생 리스트</a>
    <a href="/admin">행정실</a>
    <h1>학년별 교육과목 관리</h1>
    <h2>학년별 교육과목 입력</h2>
    <tr>
        <td><input type="text" id="grade" placeholder="학년"></td>
        <td><input type="text" id="subject" placeholder="과목"></td>
        <button type="button" id="save">등록</button>
    </tr>
    <h2>학년별 교육과목 리스트</h2>
    <c:forEach items="${list}" var='list'>
        학년 : <c:if test="${list.sb_grade==19}">3학년</c:if>
        <c:if test="${list.sb_grade==18}">2학년</c:if>
        <c:if test="${list.sb_grade==17}">1학년</c:if>
        / 과목 : ${list.sb_subject} <br>
    </c:forEach>
</body>

</html>