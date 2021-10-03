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
    <a href="/teacher/student/${teacher.ret_grade_age}/${teacher.ret_class_room}">담당반 학생 관리</a>
    <a href="/teacher/teacher_list">교사 연락 리스트</a>
    <a href="/teacher/student_list">전교생 명부</a>
    <a href="teacher/assignment">과제 관리</a>
    <a href="/teacher/test/${teacher.ret_grade_age}/${teacher.ret_class_room}">시험 관리</a>
    <a href="/teacher/my_info">내 정보</a>
    <a href="#" id = "logout">로그아웃</a>
    <h2>교내 행사 일정</h2>
    <c:forEach items="${eventList}" var="list">
            <p>날짜 :
                <fmt:formatDate value="${list.ad_event_date}" pattern="yyyy년 MM월 dd일" /> / 행사 내용 :
                ${list.ad_event_content}
            </p>
    </c:forEach>
    <h2>공지사항</h2>
    <tr>
        <a href="/teacher/notice">글쓰기</a>
    </tr>
    <c:forEach items = "${notice}" var = "notice">
        <p>
            날짜 : <fmt:formatDate value="${notice.noti_date}" pattern="yyyy년 MM월 dd일" />  / 제목 : ${notice.noti_title} / 내용 : ${notice.noti_content}
            / 작성자 : ${notice.ret_name} / 작성일 : <fmt:formatDate value="${notice.noti_reg_dt}" pattern="yyyy년 MM월 dd일 HH:mm:ss" />
        </p>
    </c:forEach>
</body>
</html>