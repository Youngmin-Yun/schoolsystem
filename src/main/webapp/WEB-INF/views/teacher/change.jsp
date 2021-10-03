<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/teacher_change.js"></script>
    <title>Document</title>
</head>
<body>
    <h1>내 정보 수정</h1>
    <table class="join_table">
        <tbody>
            <input type="text" id = "user_seq" value="${teacher.ret_seq}" hidden disabled>
            <tr>
                <td>아이디</td>
                <td colspan="3">
                    <input type="text" id="user_id" value="${teacher.ret_id}">
                </td>
                <td>
                    <button id="chk_id">중복확인</button>
                </td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td colspan="3">
                    <input type="password" id="user_pwd" value="${teacher.ret_pwd}">
                </td>
            </tr>
            <tr>
                <td>비밀번호 확인</td>
                <td colspan="3">
                    <input type="password" class="user_pwd_confirm">
                </td>
            </tr>
            <tr>
                <td>이름</td>
                <td colspan="3">
                    <input type="text" id="user_name" value="${teacher.ret_name}">
                </td>
            </tr>
            <tr>
                <td>이메일</td>
                <td colspan="3">
                    <input type="text" id="user_email" value="${teacher.ret_email}">
                </td>
                <td>
                    <button id="chk_email">중복확인</button>
                </td>
            </tr>
            <tr>
                <td>주소</td>
                <td colspan="3">
                    <input type="text"  id="user_address" value="${teacher.ret_address}">
                </td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td colspan="3">
                    <input type="text"  id="user_phone" value="${teacher.ret_phone}">
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    <button id="mode">수정</button>
                </td>
                <td>
                    <button type="button" id="change" onclick="location.href='/teacher'">뒤로가기</button>
                </td>
            </tr>
        </tbody>
    </table>
</body>
</html>