<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/teacherlist.js"></script>
    <title>Document</title>
</head>
<body>
    <h1>교사 명부</h1>
    <a href="/admin">행정실</a>
    <a href="/admin/student/list">학생 리스트</a>
        <p>교사명 <input type="text" class="teacher" placeholder="교사명을 입력해주세요"></p>
        <p>학년 <select name="grade" class="grade">
            <option value="17">1학년</option>
            <option value="18">2학년</option>
            <option value="19">3학년</option>
        </select></p>
        <p>반 <input type="text" class="classroom" placeholder="반의 숫자를 입력하세요"></p>
        <button class="btn">입력</button>
    <c:forEach items = "${t_list}" var ="admin">
        <p>교사명 : ${admin.ret_name} / 과목명 : ${admin.ret_subject} / 생년월일 : <fmt:formatDate value="${admin.ret_birth}" pattern="yyyy년 MM월 dd일" /> / 주소 : ${admin.ret_address} / 
        연락처 : ${admin.ret_phone} / 담당 학년 : <c:if test = "${admin.ret_grade_age==17}">1학년</c:if> <c:if test = "${admin.ret_grade_age==18}">2학년</c:if> <c:if test = "${admin.ret_grade_age==19}">3학년</c:if>
         / 반 : ${admin.ret_class_room}반</p>
    </c:forEach>
</body>
</html>