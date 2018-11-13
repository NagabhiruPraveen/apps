package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Player;

/**
 * Servlet implementation class Demo5
 */
@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Set<Player> players = new HashSet<>();
		Player p1 = new Player(1,"kowshik",1000,20000,2000,true);
		Player p2 = new Player(2,"Dhoni",300,10000,2,false);
		Player p3 = new Player(3,"virat",250,11000,22,false);
		Player p4 = new Player(4,"Rohit",180,8000,20,false);
		Player p5 = new Player(5,"Yuvi",286,8487,300,false);
		Player p6 = new Player(6,"pant",4,700,0,false);
		Player p7 = new Player(7,"Hardik",60,1800,100,false);
		Player p8 = new Player(8,"Dada",320,12000,170,false);
		Player p9 = new Player(9,"Bajji",316,2000,320,false);
		Player p10 = new Player(10,"Bhuvneshwar",100,1200,200,false);
		Player p11= new Player(11,"Bumrah",85,155,220,false);
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		players.add(p9);
		players.add(p10);
		players.add(p11);
		response.setContentType("text/html");
		double total=0.0;
		double average=0.0;
		out.println("<table>");
		out.println("<tr><th>PlayerId</th><th>Name</th><th>no.of matches</th><th>TotalRuns</th><th>Wickets</th><th>CaptianStatus</th><th>Average</th>");
		for (Player player : players) {
			out.println("<tr>");
			out.println("<td>"+player.getPlayerId()+"</td>");
			out.println("<td>"+player.getPlayerName()+"</td>");
			out.println("<td>"+player.getNumberOfMatches()+"</td>");
			out.println("<td>"+player.getTotalRunsScored()+"</td>");
		    out.println("<td>"+player.getNoOfWickets()+"</td>");
			out.println("<td>"+player.isCaptian()+"</td");
			out.println("<td"+player.getBattingRating()+"</td");
			out.println("</tr>");
			
		}
		out.println("</table>");
		
	}

}
