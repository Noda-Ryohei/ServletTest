<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="../header.html" %>

<%@ page import="servlet.ContactBean" %>

<% ContactBean c = (ContactBean) request.getAttribute("contact"); %>

<p>内容の確認</p>
<p>氏名: <%=c.getName() %></p>
<p>会社: <%=c.getCompany() %></p>
<p>メールアドレス: <%=c.getEmail() %></p>
<p>お問い合わせ内容: <%=c.getContent() %></p>
<p>メルマガ:
	<% String[] magazines = c.getMagazines(); %>
	<% if (magazines != null) { %>
		<% for (String magazine : magazines) { %>
			「<%=magazine %>」
		<% } %>
	<% } else { %>
		なし
	<% } %>
</p>
<p>資料請求: <%=c.getRequestDocs() %></p>

<% if (c.getRequestDocs().equals("Yes")) { %>
	<p>
 		この度は資料請求いただきありがとうございます。<br>
 		<a href="#" target="_blank" rel="noopener noreferrer">こちら</a>
 		から資料のダウンロードが可能です。
 	</p>
<% } %>

<p>以上の内容で間違いなければ、送信ボタンを押してください。</p>
<form action="#" method="post">
	<input type="submit" value="送信">
</form>

<%@ include file="../footer.html" %>