<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
<title>Board Detail</title>
</head>
<body>
	<div class="container mt-3 mb-5">
		<div class="row">
			<div class="col-12">
				<div class="card">
					<div class="card-header">게시글 상세정보</div>
					<div class="card-body">
						<table class="table">
							<colgroup>
								<col width="15%">
								<col width="35%">
								<col width="15%">
								<col width="35%">
							</colgroup>
							<tbody>
								<tr>
									<th>번호</th>
									<td>${board.no }</td>
									<th>등록일</th>
									<td><fmt:formatDate value="${board.createdDate }"/></td>
								</tr>
								<tr>
									<th>제목</th>
									<td><c:out value="${board.title }" /></td>
									<th>작성자</th>
									<td><c:out value="${board.writer }" /></td>
								</tr>
								<tr>
									<th>최근변경일</th>
									<td><fmt:formatDate value="${board.updatedDate }" /></td>
									<th>조회수</th>
									<td>${board.likes }</td>
								</tr>
								<tr>
									<th>첨부파일</th>
									<td colspan="3">
										<c:choose>
											<c:when test="${empty board.filename }">없음</c:when>
											<c:otherwise>
												<strong>${board.originalFilename }</strong> <!-- 중복방지용 13자리 숫자를 잘라서 출력 (EL의 이름은 getter이름 기준) -->
												<a href="download.do?no=${board.no }" class="btn btn-outline-primary btn-sm">다운로드</a>
											</c:otherwise>
										</c:choose>
									</td>
								</tr>
								<tr>
									<th>내용</th>
									<td colspan="3"><c:out value="${board.content }" /></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="card-footer">
						<div class="d-flex justify-content-between">
							<div>
								<a href="modify.do?no=${board.no }"  class="btn btn-warning">수정</a>
								<button class="btn btn-danger" data-toggle="modal" data-target="#modal-password-form" >삭제</button>
							</div>
							<div>
								<a href="list.do" class="btn btn-primary">목록</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- The Modal -->
		<div class="modal" id="modal-password-form">
		 	<div class="modal-dialog modal-sm">
			<form id="password-form" method="post" action="delete.do">		
				<input type="hidden" name="no" value="${board.no} ">
		    	<div class="modal-content">
		      	<div class="modal-header">
		        	<h4 class="modal-title">비밀번호 확인</h4>
		        	<button type="button" class="close" data-dismiss="modal">&times;</button>
		      	</div>
		
		      	<div class="modal-body">
		      		<div class="form-group">
		      			<label>비밀번호</label>
		      			<input type="password" class="form-control" name="password">
		      		</div>
		      	</div>
		
		      	<div class="modal-footer">
		        	<button type="button" class="btn btn-danger" data-dismiss="modal">닫기</button>
		        	<button type="submit" class="btn btn-primary" id="btn-confirm" disabled >확인</button>
		      	</div>
		
		    	</div>
		    </form>
		  	</div>
		</div>
	</div>
<script type="text/javascript" src="/resources/jquery/jquery.min.js"></script>	
<script type="text/javascript" src="/resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function(){
	$(":input[name=password]").keyup(function(){
		if ($(this).val() != "") {
			$("#btn-confirm").prop("disabled", false);	// 비활성화 취소
		} else {
			$("#btn-confirm").prop("disabled", true);	// 비활성화 적용
		}
	})
})
</script>

</body>
</html>