import java.io.*; 
import javax.servlet.*;
import javax.servlet.http.*;


/** Basic servlet that prints a message on the page a number of times
 *  Document   : Simple Servlet to return HTML
 *  Created on : October 1, 2016
 *  Author     : David A. Theimer
 *  
 */

public class Assignment2 extends HttpServlet
{
  
  int repeatCount = 1;
  private String message;
  private String defaultMessage = "No Message";
  
  public void init(ServletConfig config)
      throws ServletException
  {
    super.init(config);
    message = config.getInitParameter("message");
    if (message == null)
    {
        message = defaultMessage;
    }
    try
    {
        String repeatString = config.getInitParameter("repeats");
        repeats = Integer. parseInt(repeatString);
    }
    catch (NumberFormatException nfe)
    {
        
    }
    
    public void doGet(HttpServletRequest request,
                HttpServletResponse response)
      throws ServletException, IOException
  {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    string title = "Assignment #2 - The ShowMessage Servlet";
    out.println(ServletUtilities.headWithTitle(tile) 
    + "<!doctype html public \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n"
    + "<html>\n"
    + "<head>\n"
    + "  <title>CIS 419 - Assignment #2</title>\n"
    + "</head>\n"
    + "<body>\n"
    + "<h1>" + title + "</h1>\n");
        
    for (int i = 0; i <= repeatCount; i++)
    {       
        out.println(message + "<br>"\n");            
    }    
    
    out.println("</body>\n"
    + "</html>");
  }  
}
