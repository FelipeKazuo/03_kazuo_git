package br.com.seniorsolution.gay;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public IndexServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			int p = Integer.parseInt(request.getParameter("p"));
			String resposta = "";
			if (p == 0) {
				resposta = "Você não está nem um pouco puto";
			} else if (p >= 1 && p <= 3) {
				resposta = "Você está começando a ficar puto";
			} else if (p >= 4 && p <= 6) {
				resposta = "Você está puto";
			} else if (p >= 7 && p <= 9) {
				resposta = "Você está MUITO puto";
			} else {
				resposta = "Você está EXTREMAMENTE PUTAÇO!";
			}
			System.out.println(p);
			
			request.setAttribute("message", resposta);
			request.getRequestDispatcher("bravo.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("message", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("bravo.jsp").forward(request, response);
		}
	}

}