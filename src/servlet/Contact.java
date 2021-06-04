package servlet;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet/contact" })
public class Contact extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String email = request.getParameter("email");
		String content = request.getParameter("content");
		String[] magazines = request.getParameterValues("magazine");
		String requestDocs = request.getParameter("requestDocs");
		
		ContactBean c = new ContactBean();
		c.setName(name);
		c.setCompany(company);
		c.setEmail(email);
		c.setContent(content);
		c.setMagazines(magazines);
		c.setRequestDocs(requestDocs);
		
		request.setAttribute("contact", c);
		
		request.getRequestDispatcher("../jsp/confirm.jsp").forward(request, response);

//		if (requestDocs.equals("Yes")) {
//			request.getRequestDispatcher("../jsp/request-docs.jsp").forward(request, response);
//		}
//
//		Page.header(out);
//
//		out.println("<p>氏名: " + name + "</p>");
//		if (company != null) {
//			out.println("<p>会社: " + company + "</p>");
//		}
//		out.println("<p>メールアドレス: " + email + "</p>");
//		out.println("<p>お問い合わせ内容</p><p>" + content + "</p>");
//
//		out.println("<p>メルマガ: ");
//		if (magazines != null) {
//			for (String magazine : magazines) {
//				out.println("「" + magazine + "」");
//			}
//		} else {
//			out.println("なし");
//		}
//		out.println("</p>");
//
//		Page.footer(out);
	}

}
