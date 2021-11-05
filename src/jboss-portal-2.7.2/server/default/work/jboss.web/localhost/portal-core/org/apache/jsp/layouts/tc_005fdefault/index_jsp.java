package org.apache.jsp.layouts.tc_005fdefault;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jboss.portal.server.PortalConstants;
import java.util.ResourceBundle;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/theme/portal-layout.tld");
  }

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
      response.setContentType("text/html");
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
 ResourceBundle rb = ResourceBundle.getBundle("Resource", request.getLocale()); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title>");
      if (_jspx_meth_p_005ftitle_005f0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("   <!-- <meta http-equiv=\"Content-Type\" content=\"text/html;\"/> -->\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=11\" />\n");
      out.write("   <!-- inject the theme, default to the Renewal theme if nothing is selected for the portal or the page -->\n");
      out.write("   ");
      if (_jspx_meth_p_005ftheme_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("   <script src='//10.1.50.58:8080/raia/adrumConfig.js' type='text/javascript' charset='UTF-8'></script>\n");
      out.write("   <script src='//cdn.appdynamics.com/adrum/adrum-latest.js' type='text/javascript' charset='UTF-8'></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"body\">\n");
      out.write("\n");
      out.write("<div id=\"portal-container\">\n");
      out.write("   <div id=\"sizer\">\n");
      out.write("      <div id=\"expander\">\n");
      out.write("         <div id=\"logoName\"></div>\n");
      out.write("         <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" id=\"header-container\">\n");
      out.write("            <tr> \n");
      out.write("               <td align=\"center\" valign=\"top\" id=\"header\">\n");
      out.write("                  <!-- Utility controls -->\n");
      out.write("                  ");
      if (_jspx_meth_p_005fregion_005f0(_jspx_page_context))
        return;
      out.write("\t\t \t\t  \n");
      out.write("                  <!-- navigation tabs and such\n");
      out.write("                  ");
      if (_jspx_meth_p_005fregion_005f1(_jspx_page_context))
        return;
      out.write(" -->\n");
      out.write("                  <div id=\"spacer\"></div>\n");
      out.write("               </td>\n");
      out.write("            </tr>\n");
      out.write("         </table>\n");
      out.write("         <div id=\"content-container\">\n");
      out.write("     \t");
      if (_jspx_meth_p_005fregion_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <!-- insert the content of the 'left' region of the page, and assign the css selector id 'regionA' -->\n");
      out.write("            ");
      if (_jspx_meth_p_005fregion_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <!-- insert the content of the 'center' region of the page, and assign the css selector id 'regionB' -->\n");
      out.write("            ");
      if (_jspx_meth_p_005fregion_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <hr class=\"cleaner\"/>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"footer-container\" class=\"portal-copyright\">\n");
      out.write("<hr size=\"1\"/>\n");
      out.write("<a class=\"portal-copyright\" href=\"#\">RaiaDrogasil S.A. - Todos os direitos reservados</a><br/>\n");
      out.write("</div>\n");
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

  private boolean _jspx_meth_p_005ftitle_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:title
    org.jboss.portal.theme.tag.TitleTagHandler _jspx_th_p_005ftitle_005f0 = new org.jboss.portal.theme.tag.TitleTagHandler();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_p_005ftitle_005f0);
    _jspx_th_p_005ftitle_005f0.setJspContext(_jspx_page_context);
    // /layouts/tc_default/index.jsp(11,11) name = default type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005ftitle_005f0.setDefault("Terminal de consulta");
    _jspx_th_p_005ftitle_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_p_005ftitle_005f0);
    return false;
  }

  private boolean _jspx_meth_p_005ftheme_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:theme
    org.jboss.portal.theme.tag.ThemeTagHandler _jspx_th_p_005ftheme_005f0 = new org.jboss.portal.theme.tag.ThemeTagHandler();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_p_005ftheme_005f0);
    _jspx_th_p_005ftheme_005f0.setJspContext(_jspx_page_context);
    // /layouts/tc_default/index.jsp(15,3) name = themeName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005ftheme_005f0.setThemeName("renewal");
    _jspx_th_p_005ftheme_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_p_005ftheme_005f0);
    return false;
  }

  private boolean _jspx_meth_p_005fregion_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:region
    org.jboss.portal.theme.tag.RegionTagHandler _jspx_th_p_005fregion_005f0 = new org.jboss.portal.theme.tag.RegionTagHandler();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f0);
    _jspx_th_p_005fregion_005f0.setJspContext(_jspx_page_context);
    // /layouts/tc_default/index.jsp(31,18) name = regionName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f0.setRegionName("info");
    // /layouts/tc_default/index.jsp(31,18) name = regionID type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f0.setRegionID("info");
    _jspx_th_p_005fregion_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f0);
    return false;
  }

  private boolean _jspx_meth_p_005fregion_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:region
    org.jboss.portal.theme.tag.RegionTagHandler _jspx_th_p_005fregion_005f1 = new org.jboss.portal.theme.tag.RegionTagHandler();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f1);
    _jspx_th_p_005fregion_005f1.setJspContext(_jspx_page_context);
    // /layouts/tc_default/index.jsp(33,18) name = regionName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f1.setRegionName("navigation");
    // /layouts/tc_default/index.jsp(33,18) name = regionID type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f1.setRegionID("navigation");
    _jspx_th_p_005fregion_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f1);
    return false;
  }

  private boolean _jspx_meth_p_005fregion_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:region
    org.jboss.portal.theme.tag.RegionTagHandler _jspx_th_p_005fregion_005f2 = new org.jboss.portal.theme.tag.RegionTagHandler();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f2);
    _jspx_th_p_005fregion_005f2.setJspContext(_jspx_page_context);
    // /layouts/tc_default/index.jsp(39,6) name = regionName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f2.setRegionName("toolbar");
    // /layouts/tc_default/index.jsp(39,6) name = regionID type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f2.setRegionID("toolbar");
    _jspx_th_p_005fregion_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f2);
    return false;
  }

  private boolean _jspx_meth_p_005fregion_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:region
    org.jboss.portal.theme.tag.RegionTagHandler _jspx_th_p_005fregion_005f3 = new org.jboss.portal.theme.tag.RegionTagHandler();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f3);
    _jspx_th_p_005fregion_005f3.setJspContext(_jspx_page_context);
    // /layouts/tc_default/index.jsp(41,12) name = regionName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f3.setRegionName("left");
    // /layouts/tc_default/index.jsp(41,12) name = regionID type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f3.setRegionID("regionA");
    _jspx_th_p_005fregion_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f3);
    return false;
  }

  private boolean _jspx_meth_p_005fregion_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:region
    org.jboss.portal.theme.tag.RegionTagHandler _jspx_th_p_005fregion_005f4 = new org.jboss.portal.theme.tag.RegionTagHandler();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f4);
    _jspx_th_p_005fregion_005f4.setJspContext(_jspx_page_context);
    // /layouts/tc_default/index.jsp(43,12) name = regionName type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f4.setRegionName("center");
    // /layouts/tc_default/index.jsp(43,12) name = regionID type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_p_005fregion_005f4.setRegionID("regionB");
    _jspx_th_p_005fregion_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_p_005fregion_005f4);
    return false;
  }
}
