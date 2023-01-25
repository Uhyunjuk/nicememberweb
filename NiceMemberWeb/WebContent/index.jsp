<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나이쓰 멤버 웹!</title>
<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
	<c:if test="${sessionScope.memberId eq null }">
		<h1>나이쓰 멤버 웹 !</h1>
		<br>
		<div id="container">
			<h2>로그인 페이지</h2>
			<fieldset>
				<legend>로그인</legend>
				<form action="/member/login.kh" method="post">
					<input type="text" name="member-id" placeholder="ID"> <br>
					<input type="password" name="member-pw" placeholder="PW"> <br>

					<div id="login-area">
						<input type="submit" value="로그인"> <input type="reset"
							value="취소">
					</div>
				</form>
			</fieldset>
			<span><a href="/member/enrollView.kh">회원가입</a></span>
		</div>
		</div>
	</c:if>
	<c:if test="${sessionScope.memberId ne null }">
		<span id="member-span">${sessionScope.memberId}</span>님 환영합니다<br>
		<input type="hidden" id="member-id" value="${sessionScope.memberId}">
		<a href="/member/myInfo.kh?member-id=${sessionScope.memberId }">마이페이지</a>
		<a href="/member/logout.kh">로그아웃</a>
		<!-- a태그의 링크 기능 무효화 -->
		<a href="javascript:void(0);" onclick="removeCheck()">회원탈퇴</a>
	</c:if>

	<script>
		function removeCheck() {
			if (confirm("회원탈퇴를 하시겠습니까?")) {
				// 방법1 (input 태그 필요!)
				// 위에 있는 hidden input태그에서 갖고오는 방법
				//var memberId = document.querySelector("#member-id").value;

				// 방법 1을 쓰는데 굳이 input태그를 만들기 싫다면 span태그를 만들고id를 부여해서 가져와도 됨
				// var memberId = document.querySelector("#member-id-span").innerHTML;

				// 방법2
				// input태그 없이 쓸 수 있는 방법
				// 별로 좋은 방법은 ㄴㄴ
				var memberId = "${sessionScope.memberId }";
				location.href = "/member/remove.kh?member-id=" + memberId;
			}
		}
	</script>
</body>
</html>