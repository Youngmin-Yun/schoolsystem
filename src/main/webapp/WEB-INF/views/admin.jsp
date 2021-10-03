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
    <h1>행정실</h1>
    <a href="/admin/teacher/list">교사 리스트</a>
    <a href="/admin/student/list">학생 리스트</a>
    <a href="admin/subject/list">학생 교육 과목 관리</a>
    <a href="/admin/info">내 정보</a>
    <a href="#" id = "logout">로그아웃</a>
    <h2>학사 일정 등록</h2>
    <form id="event">
        <input type="date" id="date">
        <input type="text" id="content" placeholder="행사 내용">
        <button type="button" id="save">등록</button>
    </form>
    <h2>학사 일정 기간별 검색</h2>
    <tr>
        <td>기간 시작일</td>
        <td><input type="date" id="firstdate"></td>
        <br>
        <td>기간 종료일</td>
        <td><input type="date" id="enddate"></td>
        <td>
            <button id="search">조회</button>
        </td>
        <td>
        </td>
    </tr>
    <h2>학사 일정 현황</h2>
    <tr>

        <c:forEach items="${e_list}" var="list">
            <p>날짜 :
                <fmt:formatDate value="${list.ad_event_date}" pattern="yyyy년 MM월 dd일" /> / 행사 내용 :
                ${list.ad_event_content}
            </p>
            <button class="delete" data-seq="${list.ad_seq}">삭제</button>
            <td>
                <input type="date" class="changeDate">
                <input type="text" class="changeEvent" placeholder="행사 수정 내용 입력란">
                <button class="change" date-seq="${list.ad_seq}">수정</button>
            </td>
        </c:forEach>
    </tr>
</body>

</html>