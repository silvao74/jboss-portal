package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.drogaraia.tc.portlet.RequestUtils;
import javax.portlet.*;
import java.util.List;

public final class modalUSaudeAviso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/portlet_2_0.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<img src=\"/tc-core-portlets_1.0/images/alert.svg\" />\n");
      out.write("<div class=\"modal-usaude-aviso-container\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h1>Deseja cadastrar este <br>cliente no programa Univers Sa&uacute;de?</h1>\n");
      out.write("\t\t\t<p>O plano de sa&uacute;de deste cliente faz parte do programa Univers Sa&uacute;de.<br>\n");
      out.write("\t\t\t\t<b>Pergunte ao cliente se ele quer ser cadastrado para obter descontos especiais.</b>\n");
      out.write("\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"buttons-container\">\n");
      out.write("\t\t\t\t<button class=\"secundary\" \n");
      out.write("\t\t\t\tonclick=\"novoAtendimento()\" id=\"btnUsaudeCancelar\" name=\"btnUsaudeCancelar\">\n");
      out.write("\t\t\t\t\tAgora n&atilde;o\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<button \n");
      out.write("\t\t\t\t\tonclick=\"redirecionamento()\" id=\"btnUsaudeCadastrar\" name=\"btnUsaudeCadastrar\">\n");
      out.write("\t\t\t\t\tCadastrar\n");
      out.write("\t\t\t\t</button>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("\t\t\t\n");
      out.write("<script>\n");
      out.write("\tfunction redirecionamento(){\n");
      out.write("\t\tif(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${abrirEditar}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\n");
      out.write("\t\t\tdocument.location.href = '/portal/tc/cliente/ConsultarClienteWindow?action=1&cadastrarCarteirinhaUniversSaude=true&cadastrarClienteUniversSaude=true&nmCliente=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nmCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&cpfParam=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpfUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&cdEmpresaUniversSaude=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdEmpresaUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nmEmpresaUniversSaude=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nmEmpresaUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&cdContratoUniversSaude=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdContratoUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&universSaudeCadastrado=false&nrPosicaoInicBin=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrPosicaoInicBin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nrDigitosBin=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrDigitosBin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nrBin=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrBin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nrDigitosCartao=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrDigitosCartao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("\t\t\t\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tdocument.location.href = '/portal/tc/cadcli/CadastrarClienteWindow?action=1&cadastrarClienteUniversSaude=true&cpfParam=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpfUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&cdEmpresaUniversSaude=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdEmpresaUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nmEmpresaUniversSaude=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nmEmpresaUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&cdContratoUniversSaude=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdContratoUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&universSaudeCadastrado=false&nrPosicaoInicBin=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrPosicaoInicBin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nrDigitosBin=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrDigitosBin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nrBin=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrBin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nrDigitosCartao=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrDigitosCartao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction maskIt(w,e,m,r,a) {\n");
      out.write("\t    // Cancela se o evento for Backspace\n");
      out.write("\t    if (!e) var e = window.event\n");
      out.write("\t    if (e.keyCode) code = e.keyCode;\n");
      out.write("\t    else if (e.which) code = e.which;\n");
      out.write("\t    \n");
      out.write("\t    // Variaveis da funcao\n");
      out.write("\t    var txt  = (!r) ? w.value.replace(/[^\\d]+/gi,'') : w.value.replace(/[^\\d]+/gi,'').reverse();\n");
      out.write("\t    var mask = (!r) ? m : m.reverse();\n");
      out.write("\t    var pre  = (a ) ? a.pre : \"\";\n");
      out.write("\t    var pos  = (a ) ? a.pos : \"\";\n");
      out.write("\t\tvar ret  = \"\";\n");
      out.write("\t\t\n");
      out.write("\t\tif (w.value == \"\"){\n");
      out.write("\t\t\talert ('Preencha o campo com a data de entrada');    \n");
      out.write("\t\t\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t    if(code == 9 || code == 8 || txt.length == mask.replace(/[^#]+/g,'').length) return false;\n");
      out.write("\t\n");
      out.write("\t    // Loop na mascara para aplicar os caracteres\n");
      out.write("\t    for(var x=0,y=0, z=mask.length;x<z && y<txt.length;) {\n");
      out.write("\t\t\tif (mask.charAt(x)!='#') {\n");
      out.write("\t\t\t\tret += mask.charAt(x); x++;\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tret += txt.charAt(y); y++; x++;\n");
      out.write("\t\t\t}\n");
      out.write("\t    }\n");
      out.write("\t    \n");
      out.write("\t    // Retorno da funcao\n");
      out.write("\t    ret = (!r) ? ret : ret.reverse()        \n");
      out.write("\t    w.value = pre+ret+pos;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction closeModal() {\n");
      out.write("\t\t$(\".modal-usaude-aviso-container\").closest('.ui-dialog-content').dialog(\"close\");\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/jsp/modalUSaudeAviso.jsp(82,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/js/script-modal-crm-pbm.js");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
