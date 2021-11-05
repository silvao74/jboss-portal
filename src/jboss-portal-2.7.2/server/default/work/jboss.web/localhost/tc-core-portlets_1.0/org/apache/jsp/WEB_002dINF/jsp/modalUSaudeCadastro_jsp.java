package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.drogaraia.tc.portlet.RequestUtils;
import javax.portlet.*;
import java.util.List;

public final class modalUSaudeCadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@500;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<div id=\"modalUSaudeCadastro\">\n");
      out.write("<!--  style=\"display: none; padding: 0px; margin: 0px;\"> -->\n");
      out.write("\t\t<div class=\"form-header\">\n");
      out.write("\t\t\t<h1>Adicione o cliente no programa Univers Saúde</h1>\n");
      out.write("\t\t\t<p> <small>*</small> Preenchimento obrigatório</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"recipe-data-container\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"input-container\">\n");
      out.write("\t\t\t<label for=\"nmEmpresa\" id=\"labelNmEmpresa\">Nome do plano de saúde<small>*</small></label>\n");
      out.write("\t\t\t<input id=\"nmEmpresa\" name=\"nmEmpresa\" size=\"22\" maxlength=\"20\" disabled type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nmEmpresaUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("\t\t\t<input id=\"idnmEmpresa\" name=\"idnmEmpresa\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdEmpresaUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<input id=\"nrPosicIniBin\" name=\"nrPosicIniBin\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrPosicaoInicBin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("\t\t\t<input id=\"nrDigBin\" name=\"nrDigBin\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrDigitosBin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("\t\t\t<input id=\"bin\" name=\"bin\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrBin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("\t\t\t<input id=\"nrDigCartao\" name=\"nrDigCartao\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nrDigitosCartao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"input-container\">\n");
      out.write("\t\t\t<label for=\"nrCarteirinha\" id=\"labelNrCarteirinha\">Nº da carteirinha<small>*</small></label>\n");
      out.write("\t\t\t<input id=\"nrCart\" name=\"nrCarteirinha\" type=\"number\" size=\"23\" onKeyPress=\"Mascara(this,Integer);\" \n");
      out.write("\t\t\t\t\tmaxlength=\"30\" onkeyup=\"habilitarCampoAdcionar()\"/>\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t<div id=\"input-nrCarteirinhaConfirmacao\" class=\"input-container input-nova-validacao\">\t\n");
      out.write("\t\t\t<label for=\"nrCarteirinhaConfirmacao\" id=\"labelNrCarteirinhaConfirmacao\">Confirme o nº da carteirinha<small>*</small></label>\n");
      out.write("\t\t\t<input id=\"nrCartConfirma\" name=\"nrCarteirinhaConfirmacao\" type=\"number\" size=\"23\" onKeyPress=\"Mascara(this,Integer);\" \n");
      out.write("\t\t\t\t\tmaxlength=\"30\" onkeyup=\"habilitarCampoAdcionar()\" onpaste=\"return false\" ondrop=\"return false\"/>\t\n");
      out.write("\t\t\t<div class=\"simbolo-validacao\"></div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t<tr style=\"height:15px;\">\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<div class=\"error-carteirinha-invalida\" style=\"width: 226px; max-width: 226px;\">\n");
      out.write("\t\t\t\t\t\t<span id=\"error-cart\" name=\"error-carteirinha\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- BOTOES -->\n");
      out.write("\t\t<div class=\"buttons-container-register\">\n");
      out.write("\t\t\t<button id=\"botaoCancelarModalUniversSaude\"  onclick=\"novoAtendimento()\">\n");
      out.write("\t\t\t\tCancelar\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<button id=\"botaoInfoDescUniversSaude\"  name=\"botaoInformarDescontoUniversSaude\" disabled onclick=\"adicionarCarteirinha()\">\n");
      out.write("\t\t\t\tAdicionar\n");
      out.write("\t\t\t</button>\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\tfunction adicionarCarteirinha(){\n");
      out.write("\t\n");
      out.write("\t\tif(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cadastrarCarteirinhaUniversSaude!=null}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("){\n");
      out.write("\t\t\tvar msg = cadastrarNovoUniversSaude(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdEmpresaUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nmCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpfUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(", document.getElementById(\"nrCart\").value, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdContratoUniversSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(");\n");
      out.write("\t\t\tif (msg==''){\n");
      out.write("\t\t\t\talert(\"Univers saúde \" + document.getElementById('nmEmpresa').value + \" adicionado com sucesso.\")\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tdocument.getElementById(\"nrCarteirinhaUniversSaude\").value = document.getElementById(\"nrCartConfirma\").value;\n");
      out.write("\t\t$(\"#modalUSaudeCadastro\").closest('.ui-dialog-content').dialog(\"close\");\n");
      out.write("\t}\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\tfunction habilitarCampoAdcionar(){\n");
      out.write("\n");
      out.write("\t\tif (validarNumeroCarteirinha()) {\n");
      out.write("\t\t\tif (validaBinEmpresa()) {\n");
      out.write("\t\t\t\tdocument.getElementById(\"botaoInfoDescUniversSaude\").disabled = false;\n");
      out.write("\t\t\t\tdocument.getElementById(\"botaoInfoDescUniversSaude\").classList.add('available');\n");
      out.write("\t\t\t\treturn\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tmostrarBinInvalido();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tdocument.getElementById(\"botaoInfoDescUniversSaude\").disabled = true;\t\n");
      out.write("\t\tdocument.getElementById(\"botaoInfoDescUniversSaude\").classList.remove('available');\n");
      out.write("\n");
      out.write("\t}\t\n");
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
      out.write("\t\t$(\"#modalUSaudeCadastro\").closest('.ui-dialog-content').dialog(\"close\");\n");
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
    // /WEB-INF/jsp/modalUSaudeCadastro.jsp(137,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
