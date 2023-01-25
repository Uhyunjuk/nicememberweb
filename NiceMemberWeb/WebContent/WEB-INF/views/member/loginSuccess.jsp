<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	<h1>로그인 성공!</h1>
	<span id="member-id-span">${memberId }</span>>님 환영합니다<br>
	<input type="hidden" id="member-id" value="${memberId }">

	<a href="/member/myInfo.kh?member-id=${memberId }">마이페이지</a>
	<a href="javascript:void(0);" onclick="removeCheck();">회원탈퇴</a>
	<!-- a 태그의 링크기능 무효화 -->
	
</body>
</html>