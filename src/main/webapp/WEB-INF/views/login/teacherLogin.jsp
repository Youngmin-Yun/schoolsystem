<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="/assets/css/reset.css">
        <link rel="stylesheet" href="/assets/css/login.css">
        <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="/assets/js/teacherLogin.js"></script>
        <title>Document</title>
    </head>
    <body>
        <h1 class="login_title">교사 로그인</h1>
        <div class="login_form">
            <input type="text" placeholder="아이디" id = "user_id">
            <input type="password" placeholder="비밀번호" id = "user_pwd">
        </div>
        <div class="button">
            <button id = "btn">로그인</button>
            <button id = "regist" onclick="location.href='/regist/teacher'">회원가입</button>
        </div>
    </body>
    </html>