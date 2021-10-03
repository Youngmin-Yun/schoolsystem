<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/classNotice.js"></script>
    <title>Document</title>
</head>
<body>
    <a href="/teacher">교사 메인</a>
    <a href="/teacher/teacher_list">교사 연락 리스트</a>
    <a href="/teacher/student_list">전교생 명부</a>
    <a href="/teacher/assignment">과제 관리</a>
    <a href="/teacher/test/${teacher.ret_grade_age}/${teacher.ret_class_room}">시험 관리</a>
    <h1>학반 공지사항 입력</h1>
    <div class="notic_class">
        <div class="notice">
            <tr>
                <td>날짜 선택</td>
                <td><input type="date" id = "date"></td>
                <td>제목 <input type="text" id = "title"></td>
                <td><input type="text" id = "class_room" value="${teacher.ret_class_room}" hidden></td>
                <td><input type="text" id = "grade" value="${teacher.ret_grade_age}" hidden></td>
                <br>
                <td>내용 : <textarea id="contents" cols="30" rows="10"></textarea></td>
                <td><button type="button" id="save">등록</button></td>
                
            </tr>
        </div>
    </div>
    <h1>담당 학생 목록</h1>
    <c:forEach items = "${list}" var = "list">
        이름 : ${list.res_name} 연락처 : ${list.res_phone} 보호자 연락처 : ${list.res_phone2} 주소 : ${list.res_address} 생일 : <fmt:formatDate value="${list.res_birth}" pattern="yyyy년 MM월 dd일" /> <br>
    </c:forEach>
</body>
</html>