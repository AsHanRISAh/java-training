/**
 * 
 */
package ola.com.booking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ola.com.booking.model.Ride;
import ola.com.booking.service.RideService;
import ola.com.booking.service.impl.RideServiceImpl;

/**
 * @author User1
 *
 */

@WebServlet("/Ride")
public class RideServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	RideService rideService = new RideServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//u have userId
		
		if (req.getParameter("action").equals("book")) {
			Ride ride = new Ride();
			java.util.Date date = new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
			ride.setDate(sqlDate);
			//String routeId=String.
		//	String id=req.getParameter("routeId");
			//ride.setRouteId(id);
		//	ride.setRouteId(req.getAttribute("routeId"));
			int id = Integer.parseInt((String) req.getAttribute("USER_ID"));
			ride.setRouteId(req.getParameter("routeId"));
			ride.setUserId(req.getParameter("userId"));
			
			rideService.BookRide(ride);
			req.setAttribute("userId", id);
			req.setAttribute("ride", rideService.getRide());
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/ride.jsp");
			rd.forward(req, resp);
		}
		//System.out.println(req.getParameter("action"));
	}

}
