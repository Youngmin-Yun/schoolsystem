<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/notice_teacher.js"></script>
    <title>Document</title>
</head>
<body>
    이름 : ${teacher.ret_name}
    이메일 : ${teacher.ret_email}
    주소 : ${teacher.ret_address}
    전화번호 : ${teacher.ret_phone}
    생일 : <fmt:formatDate value="${teacher.ret_birth}" pattern="yyyy년 MM월 dd일" />
    담당 과목 : ${teacher.ret_subject}
    학년 : ${teacher.ret_grade_age}
    학반 : ${teacher.ret_class_room}
    <button type="button" id="change" onclick="location.href='/teacher/my_info/change'">내 정보 수정</button>
    <td>
        <button type="button" id="change" onclick="location.href='/teacher'">뒤로가기</button>
    </td>
</body>
</html>