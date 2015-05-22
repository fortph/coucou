package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Personne;
import beans.PersonneDAo;

public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controleur() {

	}
	
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Récupération de l'action demandée
		String action = request.getParameter("action");
		// Par défaut page d'accueil
		String jspPage ="/webAtrio/index.jsp" ;

		if ((action == null) || (action.length() < 1)) {
			action = "default";

		}
		if ("default".equals(action)) {
			jspPage = "/webAtrio/index.jsp";
		}
		
		else if ("liste".equals(action)) {
			PersonneDAo dao = new PersonneDAo();
			List<Personne> maListe = dao.getListe();
			System.out.println("coucou ");

			HttpSession session = request.getSession();
		
			for(int x=0;x<maListe.size();x++)	
			session.setAttribute("nom"+x, maListe.get(x));
	
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			Personne nouvelle = new Personne(nom, prenom);
			session.setAttribute(nom+prenom, nouvelle);
			
			
			jspPage="/listepersonnes.jsp";
			
		}
		
		
		

		/* ____________________________________________________________________________________________ */
		/**********************************************************************************************/
		/******* Envoyer la page correspondante à la demande ********************/
		/**********************************************************************************************/
		getServletContext().getRequestDispatcher(jspPage).forward(request,
				response);
		
		}
	
	
	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
