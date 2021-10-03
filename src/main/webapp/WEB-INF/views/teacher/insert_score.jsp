<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/insert_score.js"></script>
    <title>Document</title>
</head>

<body>
    <button type="button" id="change" onclick="location.href='/teacher'">뒤로가기</button>
    <h1>점수 입력</h1>
    <select name="semester" id="semester">
        <option value="1">1학기</option>
        <option value="2">2학기</option>
    </select>
    <select name="term" id="term">
        <option value="1">중간고사</option>
        <option value="2">기말고사</option>
    </select>
    
    <tr>
        <td>
                <c:forEach items="${list}" var="list">
                    ${list.res_name}
                    <c:forEach items="${s_list}" var="s_list">
                        <c:if test = "${s_list.sb_grade==teacher.ret_grade_age}">
                            <span>
                                <span>${s_list.sb_subject} 점수</span>
                                <input type="text" id="#" >
                            </span>
                        </c:if>
                    </c:forEach>
                    <input type="text" id="age" value = "${teacher.ret_grade_age}" hidden>
                    <input type="text" id="score">
                    <button id="btn" data-stu-seq="" >입력</button>
                </c:forEach>
        </td>
    </tr>
</body>

</html>