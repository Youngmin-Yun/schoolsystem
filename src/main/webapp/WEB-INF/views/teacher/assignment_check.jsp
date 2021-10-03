<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/assignment.js"></script>
    <title>Document</title>
</head>
<body>
    <a href="/teacher">교사 메인</a>
    <a href="/teacher/student/${teacher.ret_grade_age}/${teacher.ret_class_room}">담당반 학생 관리</a>
    <a href="/teacher/teacher_list">교사 연락 리스트</a>
    <a href="/teacher/student_list">전교생 명부</a>
    ${teacher}
    <h1>학생 과제 제출 확인 및 점수 입력 리스트</h1>
    <h1>ajax쪽에서 에러남.....업로드 및 다운로드 공부가 필요한듯</h1>
    <tr>
        <td>과제 업로드 (확인)</td>
    </tr>
    <tr>
        <td class="assign">
            <form id="assignment">
                <input type="file" name="file" value="과제 선택">
                <button type="button" id="file_save">등록</button>
                <button type="button" id="fiel_delete" disabled>삭제</button>
            </form>
        </td>

    </tr>
</body>
</html>