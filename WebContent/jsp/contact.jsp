<%@ page contentType = "text/html; charset=UTF-8" %>
<%@ include file = "../header.html" %>

<form action="../servlet/contact" method="post">
	<p>お問い合わせフォーム</p>
	
	<p>
		氏名（必須）
		<input type="text" name="name" required>
	</p>
	
	<p>
		会社名
		<input type="text" name= "company">
	</p>
	
	<p>
		メールアドレス（必須）
		<input type= "email" name="email" required>
	</p>
	
	<p>
		お問い合わせ内容
	</p>
	<textarea name="content" cols="30" rows="5"></textarea>

	
	<p>
		メルマガの受信を希望しますか？
		<input type="checkbox" name="magazine" value="総合案内">総合案内
		<input type="checkbox" name="magazine" value="セミナー案内">セミナー案内
		<input type="checkbox" name="magazine" value="求人採用情報">求人採用情報
	</p>
	
	<p>
		資料の請求を行いますか？
		<input type="radio" name="requestDocs" value="Yes" checked>Yes
		<input type="radio" name="requestDocs" value="No">No
	</p>
	
	<input type="submit" value="確認">
</form>

<%@ include file="../footer.html" %>