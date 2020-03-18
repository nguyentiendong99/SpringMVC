<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>STUDENT MANAGER</h1>
	<form action="student-mgr.htm" method="post">
		<div>ho va ten</div>
		<input name="name">
		<div>Diem trung binh</div>
		<input name="mark">
		<div>chuyen nganh</div>
		<label><input name="major" type="radio" value="APP" />Ung dung
			phan mem</label> <label><input name="major" type="radio" value="WEB" />thiet
			ke trang web</label>
		<hr>

		${message}
		<hr>
		<button name="btnInsert">them</button>
		<button name="btnUpdate">cap nhat</button>
		<button name="btnDelete">xoa</button>
		<button name="btnReset">sua lai</button>
	</form>
	<hr>
	<table border="1" style="width: 100%">
		<tr>
			<th>Ho va ten</th>
			<th>Diem trung binh</th>
			<th>CHuyen nghanh</th>
			<th></th>
		</tr>
		<tr>
			<td>Nguyen Tien Dong</td>
			<td>7.8</td>
			<td>DTVT</td>
			<td><a style="color: red;" href="student-mgr.htm?lnkedit">Sua</a></td>

		</tr>
	</table>
</body>
</html>