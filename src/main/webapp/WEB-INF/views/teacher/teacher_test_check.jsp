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
    <a href="/">로그인</a>
    <a href="/teacher/student/${teacher.ret_grade_age}/${teacher.ret_class_room}">담당반 학생 관리</a>
    <a href="/teacher/teacher_list">교사 연락 리스트</a>
    <a href="/teacher/student_list">전교생 명부</a>
    <a href="/teacher/assignment">과제 관리</a>
    <h1>학생 중간, 기말 시험 성적 입력 및 리스트</h1>
    <button type="button" id="insert" onclick="location.href='/teacher/test/score/${teacher.ret_grade_age}/${teacher.ret_class_room}'">점수 입력</button> <br>
    <thead>
        <tr>
            <td>이름</td>
            <tr>
                <td>총점</td>
            </tr>
            <tr>
                <td>학반평균</td>
            </tr>
            <tr>
                <td>전교평균</td>
            </tr>
            <tr>
                <td>학반등수</td>
            </tr>
            <tr>
                <td>전교등수</td>
            </tr>
        </tr>
    </thead>
    <br>
    <tbody>
        <tr>
            <td>
                <c:forEach items = "${list}" var = "list">
                ${list.res_name}
                </c:forEach>
            </td>
        </tr>
        <tr>
            여기에 이름, 총점, 반평균, 전교평균, 반등수, 전교등수 표시
        </tr>
    </tbody>
</body>
</html>