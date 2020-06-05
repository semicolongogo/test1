<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>관리자</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=7" />
<meta http-equiv="imagetoolbar" content="no" />
<link href="../css/contents.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../public/js/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="../public/js/design.js"></script>
</head>
<body >
	<div id="wrapper">
	
		<div id="header">
			<div class="topInfoWrap">
				<div class="topInfoArea clfix">
					<div class="loginWrap">
						<span class="fir">2012.05.17</span>
						<span>13:30:22</span>
						<span><em>OOO님</em> 좋은 하루 되세요</span>
						<a href="" class="btnLogout"><img src="../img/common/btn_logout.gif" alt="로그아웃" /></a>
					</div>
				</div>
			</div>
			<div class="gnbSubWrap">
				
			</div>
		</div>
		
		<div id="container">
			<div id="contentsWrap" class="contentsWrap">
				<div class="contents">
					<h1 class="title">회원가입</h1>
					<div class="tbWrapRt" style="padding-right: 250px; margin-top: 100px;">
						<table class="bbsWrite mgb10"  >
								<caption></caption>
								<colgroup>
									<col width="95" />
									<col />
								</colgroup>
								<tbody>
								<tr>
									<th>이름</th>
									<td><input type="text" name="" class="inputText" size="30" /></td>
								</tr>
								<tr>
									<th>아이디</th>
									<td><input type="text" name="" class="inputText" size="30" /> <span class="buttonFuc"><a href="#">중복체크</a></span></td>
								</tr>
								<tr>
									<th>비밀번호</th>
									<td><input type="text" name="" class="inputText" size="30" /></td>
								</tr>
								<tr>
									<th>비밀번호 확인</th>
									<td><input type="text" name="" class="inputText" size="30" /></td>
								</tr>
								<tr>
									<th>성별</th>
									<td>
										<label for="male"><input type="radio" class="inputRadio" name="sex" id="male" />남</label>
										<label for="female"><input type="radio" class="inputRadio" name="sex" id="female" />여</label>
									</td>
								</tr>
								<tr>
									<th>생년월일</th>
									<td>
										<input type="text" name="" class="inputText" size="10" /> 년
										<input type="text" name="" class="inputText" size="10" /> 월
										<input type="text" name="" class="inputText" size="10" /> 일
									</td>
								</tr>
								<tr>
									<th>주소</th>
									<td class="alignM">
										<p class="mgb3">
											<input type="text" name="" class="inputText" size="10" /> - <input type="text" name="" class="inputText" size="10" /> <span class="buttonFuc"><a href="#">우편번호</a></span>
										</p>
										<p class="mgb3">
											<input type="text" name="" class="inputText" size="50" />
										</p>
									</td>
								</tr>
								<tr>
									<th>이메일</th>
									<td><input type="text" name="" class="inputText" size="30" /></td>
								</tr>
								<tr>
									<th>전화번호</th>
									<td>
										<input type="text" name="" class="inputText" size="10" /> - 
										<input type="text" name="" class="inputText" size="10" /> - 
										<input type="text" name="" class="inputText" size="10" />
									</td>
								</tr>
								<tr>
									<th>휴대폰번호</th>
									<td>
										<input type="text" name="" class="inputText" size="10" /> - 
										<input type="text" name="" class="inputText" size="10" /> - 
										<input type="text" name="" class="inputText" size="10" />
									</td>
								</tr>
								</tbody>
							</table>
							<div class="agr mgb15">
								<span class="button"><a href="#">등록</a></span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>