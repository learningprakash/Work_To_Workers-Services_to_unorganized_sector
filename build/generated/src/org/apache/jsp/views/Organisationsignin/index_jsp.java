package org.apache.jsp.views.Organisationsignin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../includes/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign In</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"../../OrganisationsigninC\" method=\"post\" >\n");
      out.write("            <table align=\"right\">\n");
      out.write("                <th colspan=\"2\">Fill The Details</th>\n");
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                        <td id=\"LabelName\">Name of Organisation:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"LabelName\">Organisation Id:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"User_Id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UserId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td id=\"LabelName\">Employee Name:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"EmployeeName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${EmployeeName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td id=\"LabelName\">Emp_Id:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"EmployeeId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${EmployeeId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td id=\"LabelPassword\">Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"Password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"20\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("\n");
      out.write("                     <td></td>\n");
      out.write("                     <td>\n");
      out.write("                      <input type=\"submit\"  name=\"SignIn\" value=\"Sign In\" />\n");
      out.write("                    </td>\n");
      out.write("                  </tr>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write(" <table align=\"left\">\n");
      out.write("                <th colspan=\"2\">This is Organisation SignIn</th>\n");
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                    <td id=\"LabelWorker_Id\">You Are Requested to Fill all the details for sign in <br> We Will Give You The Best Workers</td>\n");
      out.write("                 </tr>\n");
      out.write(" </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
