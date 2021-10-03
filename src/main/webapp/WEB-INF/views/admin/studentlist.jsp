<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/studentlist.js"></script>
    <title>Document</title>
</head>
<body>
    <h1>학생명부</h1>
    <a href="/admin">행정실</a>
    <a href="/admin/teacher/list">교사 리스트</a>
    <form action="class">
    <button type="button" class=insert_one>1학년 반배정</button>
    <button type="button" class=insert_two>2학년 반배정</button>
    <button type="button" class=insert_three>3학년 반배정</button>

    <c:forEach items = "${s_list}" var ="admin">
        <p>학생명 : ${admin.res_name} / 이메일 : ${admin.res_email} / 생년월일 : <fmt:formatDate value="${admin.res_birth}" pattern="yyyy년 MM월 dd일" /> / 주소 : ${admin.res_address} / 
        연락처 : ${admin.res_phone} / 보호자 연락처 : ${admin.res_phone2}
        / 학년 : <c:if test ="${admin.res_age==19}">3학년</c:if>
        <c:if test ="${admin.res_age==18}">2학년</c:if>
        <c:if test ="${admin.res_age==17}">1학년</c:if>
        <c:if test ="${admin.res_age >=20}">졸업생</c:if>  
        / 반 : ${admin.res_class_room} 반</p>
     </c:forEach>
    </form>
 
</body>
</html>