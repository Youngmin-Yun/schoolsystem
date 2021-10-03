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
    ${admin}
    이름 : ${admin.ad_name}
    이메일 : ${admin.ad_email}
    주소 : ${admin.ad_address}
    전화번호 : ${admin.ad_phone}
    생일 : <fmt:formatDate value="${admin.ad_birth}" pattern="yyyy년 MM월 dd일" />
    <button type="button" id="change" onclick="location.href='/admin/info/change'">내 정보 수정</button>
    <td>
        <button type="button" id="change" onclick="location.href='/teacher'">뒤로가기</button>
    </td>
</body>
</html>