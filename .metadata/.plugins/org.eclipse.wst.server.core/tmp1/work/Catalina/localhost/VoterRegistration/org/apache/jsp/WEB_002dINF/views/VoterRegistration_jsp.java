/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2019-03-18 07:44:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VoterRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>VoterId Registration</title>\r\n");
      out.write("s\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"\">\r\n");
      out.write("\r\n");
      out.write("<form action=\"\">\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<header style=\"background-color:#354E9A; height:95px;width:52%;padding-left:80px;margin-left:245px\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<header style=\"background-color:white; height:2px;width:43.5%;padding-top:0px;margin-left:395px\"></header>\r\n");
      out.write("<header style=\"background-color:orange; height:30px;width:32.5%;padding-right:1px;margin-left:426px\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h4><b><font color=\"white\" align=\"center\" >Register Your Vote</font></b></h4>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table background=\"\" width=\"45%\"  height=\"50\" cellpadding=\"2\" height=\"80%\" width=\"50%\" align=\"center\"\r\n");
      out.write("cellspacing=\"15\" colspan=\"2\" background=\"\">\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><b><font color=\"sky blue\">First Name</font></b> <font color=\"red\"><strong>*</strong></font></td> \r\n");
      out.write("<td><input type=\"text\"  id=\"firstName\" name=\"firstName\" placeholder=\"First Name\" size=\"40\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><b><font color=\"sky blue\">Middle Name</font></b></td> \r\n");
      out.write("<td><input type=text  id=\"middleName\" name=\"middleName\" placeholder=\"Middle Name\" size=\"40\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><b><font color=\"sky blue\">Last Name:</font></b> <font color=\"red\"><strong>*</strong></font></td> \r\n");
      out.write("<td><input type=\"text\"  id=\"lastName\" name=\"lastName\" placeholder=\"Last Name\" size=\"40\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><b><font color=\"sky blue\">Father Name:</font></b> <font color=\"red\"><strong>*</strong></font></td> \r\n");
      out.write("<td><input type=\"text\"  id=\"fatherName\" name=\"fatherName\" placeholder=\"Father Name\" size=\"40\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>  \r\n");
      out.write("<td class=\"tdLabel\"><label for=\"register_gender\" class=\"label\"><font color=\"sky blue\"><b>Gender</b></font></label></td>  \r\n");
      out.write("    <td>  \r\n");
      out.write("<input type=\"radio\" name=\"gender\" id=\"male\" value=\"male\"/>  \r\n");
      out.write("<label for=\"male\">Male</label>  \r\n");
      out.write("<input type=\"radio\" name=\"gender\" id=\"female\" value=\"female\"/>  \r\n");
      out.write("<label for=\"female\">Female</label> \r\n");
      out.write("<input type=\"radio\" name=\"gender\" id=\"other\" value=\"other\"/>  \r\n");
      out.write("<label for=\"other\">Other</label> \r\n");
      out.write("    </td>  \r\n");
      out.write("</tr> \r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><b><font color=\"sky blue\">Date Of Birth:</font></b> <font color=\"red\"><strong>*</strong></font></td> \r\n");
      out.write("<td><input type=\"date\"  id=\"dateOfBirth\" name=\"dateOfBirth\" size=\"40\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><b><font color=\"sky blue\">Address:</font></b> <font color=\"red\"><strong>*</strong></font></td> \r\n");
      out.write("<td><textarea name=\"address\" id=address rows=\"3\" cols=\"29\"></textarea></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><b><font color=\"sky blue\">Constituency:</font></b> <font color=\"red\"><strong>*</strong></font></td> \r\n");
      out.write("<td><input type=\"text\"  id=\"constituency\" name=\"constituency\" placeholder=\"Constituency\" size=\"40\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"submit\" value=\"Register\" style=\"background-color:orange;border:2px;padding:5px;color:white;font-weight: bold\"/>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
