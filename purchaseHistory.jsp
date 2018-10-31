<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="robots" content="noindex, nofollow" />
<link rel="stylesheet" href="./css/i1810a.css">
<title>商品購入履歴一覧画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="main-contents">
		<div id="page-name">
			<h1>商品購入履歴一覧画面</h1>
		</div>
		<s:if test="#session.purchaseHistoryInfoDtoList.size()>0">
			<s:iterator value="#session.purchaseHistoryInfoDtoList">
				<div class="history-box">
					<div class="border"></div>
					<div class="history-layaut-left">
						<img
							src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'
							class="history-img" />
					</div>

					<div class="cart-layaut-right"><h3>
						<s:label value="商品名" />
						:
						<s:property value="productName" />
						<br>
						<s:label value="ふりがな" />
						:
						<s:property value="productNameKana" />
						<br>
						<s:label value="値段" />
						:
						<s:property value="price" />
						円<br>
						<s:label value="発売会社名" />
						:
						<s:property value="releaseCompany" />
						<br>
						<s:label value="発売年月日" />
						:
						<s:property value="releaseDate" />
						<br>
					</h3></div>
				</div>
			</s:iterator>
			<div class="border"></div>
			<br>

			<div class="submit-btn-box-all">
				<div id="contents-btn-set">
					<s:form action="DeletePurchaseHistoryAction">
						<s:submit value="削除" class="submit-btn-login" />
					</s:form>
					<br>
				</div>
			</div>
		</s:if>
		<s:else>
			<div class="center">
			<div class="info">
				<h3>商品購入履歴情報はありません。</h3>
			</div>
			</div>
		</s:else>
	</div>

	<s:include value="footer.jsp" />
</body>
</html>