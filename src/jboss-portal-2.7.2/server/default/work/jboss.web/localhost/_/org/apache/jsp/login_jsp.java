package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.portal.identity.UserStatus;
import java.util.ResourceBundle;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

   ResourceBundle rb = ResourceBundle.getBundle("Resource", request.getLocale());

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("   <title>");
      out.print( rb.getString("LOGIN_TITLE")  );
      out.write("</title>\n");
      out.write("   <script src=\"/tc-gerencia-core-portlets_1.0/js/script-menu.js\" type=\"text/javascript\"></script>\n");
      out.write("   <script>\n");
      out.write("   function setFocusOnLoginForm() {\n");
      out.write("      try {\n");
      out.write("         document.loginform.j_username.focus();\n");
      out.write("      }\n");
      out.write("      catch (e) {\n");
      out.write("      }\n");
      out.write("   }\n");
      out.write("\n");
      out.write("//    alert(\"antes:\"+getCookie(\"FILIAL_GERENCIA\"));\n");
      out.write("\n");
      out.write("      setCookie(\"FILIAL_GERENCIA\", '');\n");
      out.write("\n");
      out.write("//    alert(\"depois:\"+getCookie(\"FILIAL_GERENCIA\"));\n");
      out.write("\n");
      out.write("   </script>\n");
      out.write("\n");
      out.write("   <META HTTP-EQUIV=\"Refresh\" CONTENT=\"600;\">\n");
      out.write("\n");
      out.write("   <link rel=\"stylesheet\" href=\"/portal-core/css/portal_style.css\" type=\"text/css\" />\n");
      out.write("   <link rel=\"stylesheet\" href=\"/portal-core/css/login.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id='body' onload=\"setFocusOnLoginForm();\">\n");
      out.write("\n");
      out.write("<div id=\"portal-container\">\n");
      out.write("   <div id=\"sizer\">\n");
      out.write("      <div id=\"expander\">\n");
      out.write("\n");
      out.write("<div id=\"logoName\"></div>\n");
      out.write("<div style=\"width: 100%; height: 130px; background: url(&quot;/tc-gerencia-core-portlets_1.0/images/backgroundGerencia.gif&quot;) repeat-x scroll left center transparent;\">  \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("\n");
      out.write("   <label style=\"font: bold 16px arial,sans-serif; color: rgb(51, 102, 153);\" align=\"center\">Bem vindo ao </label>\n");
      out.write("   <label style=\"font: bold 18px arial,sans-serif; color: rgb(51, 102, 153);\" align=\"center\"><b><i>TC Mais</i></b> !</label>\n");
      out.write("\n");
      out.write("   <div class=\"login-content\" style=\"width: 100%; height: 50px;>\n");
      out.write("\n");
      out.write("      <div class=\"error-message\"\n");
      out.write("           style=\"");
      out.print((request.getAttribute(!UserStatus.OK.equals("org.jboss.portal.userStatus") ? "" : "display:none")));
      out.write(";\">\n");
      out.write("           ");


               if (UserStatus.DISABLE.equals(request.getAttribute("org.jboss.portal.userStatus")))
               {
                  out.println(rb.getString("ACCOUNT_DISABLED"));
               }
               else if (UserStatus.WRONGPASSWORD.equals(request.getAttribute("org.jboss.portal.userStatus")) || UserStatus.UNEXISTING.equals(request.getAttribute("org.jboss.portal.userStatus")))
               {
                  out.println(rb.getString("ACCOUNT_INEXISTING_OR_WRONG_PASSWORD"));
               }
               else if (UserStatus.NOTASSIGNEDTOROLE.equals(request.getAttribute("org.jboss.portal.userStatus")))
               {
                  out.println(rb.getString("ACCOUNT_NOTASSIGNEDTOROLE"));
               }
			
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <form method=\"post\" action=\"");
      out.print( response.encodeURL("j_security_check") );
      out.write("\" name=\"loginform\" id=\"loginForm\"\n");
      out.write("            target=\"_parent\">\n");
      out.write("         <div align=\"right\" style=\"width: 230px;\" class=\"form-field\">\n");
      out.write("            <label for=\"j_username\">");
      out.print( rb.getString("LOGIN_USERNAME") );
      out.write("</label>\n");
      out.write("               <input type=\"text\" maxlength=\"50\" name=\"j_username\" id=\"j_username\" value=\"\"/>\n");
      out.write("         </div>\n");
      out.write("         <div align=\"right\" style=\"width: 230px;\" class=\"form-field\">\n");
      out.write("            <label for=\"j_password\">");
      out.print( rb.getString("LOGIN_PASSWORD") );
      out.write("</label>\n");
      out.write("               &nbsp;&nbsp;<input type=\"password\" maxlength=\"20\" name=\"j_password\" id=\"j_password\" value=\"\"/>\n");
      out.write("         </div><br class=\"clear\"/>\n");
      out.write("         <div class=\"button-container\"><br class=\"clear\"/>\n");
      out.write("            <input style=\"");
      out.print((request.getParameter("loginheight") != null ? "" : "display:none"));
      out.write(";\" type=\"button\" name=\"cancel\" value=\"");
      out.print( rb.getString("LOGIN_CANCEL")  );
      out.write("\" class=\"cancel-button\" onclick=\"window.parent.hideContentModal('login-modal');\"/>\n");
      out.write("            <br class=\"clear\"/>\n");
      out.write("            <input style=\"");
      out.print((request.getParameter("loginheight") != null ? "" : "right:10px"));
      out.write(";\" type=\"submit\" name=\"login\" value=\"");
      out.print( rb.getString("LOGIN_SUBMIT")  );
      out.write("\" class=\"\"/>\n");
      out.write("         </div>\n");
      out.write("         <br class=\"clear\"/>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"portal-copyright\" id=\"footer-container\">\n");
      out.write("<hr size=\"1\">\n");
      out.write("<a href=\"#\" class=\"portal-copyright\">Raia S.A. - Todos os direitos reservados</a><br>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
