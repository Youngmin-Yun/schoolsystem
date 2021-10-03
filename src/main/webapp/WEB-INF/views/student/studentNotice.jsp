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
    <a href="/student">학생 메인</a>
    <a href="/student/${student.res_age}/${student.res_class_room}">같은 반 친구들</a>
    <a href="#">과제 제출</a>
    <a href="#">중간/기말 점수 확인</a>

    <h1>학생페이지</h1>
    <h2>학교 공지사항</h2>
    <c:forEach items="${eventList}" var="list">
        <p>날짜 :
            <fmt:formatDate value="${list.ad_event_date}" pattern="yyyy년 MM월 dd일" /> / 행사 내용 :
            ${list.ad_event_content}
        </p>
    </c:forEach>
    <h2>우리반 공지사항</h2>
    <c:forEach items="${classEvent}" var="classEvent">
        <p>날짜 :
            <fmt:formatDate value="${classEvent.nc_date}" pattern="yyyy년 MM월 dd일" /> / 공지 제목 : ${classEvent.nc_title} / 공지 내용 :
            ${classEvent.nc_content}
        </p>
    </c:forEach>
    학반 공지사항 (담임이 작성하는 내용)
</body>
</html>