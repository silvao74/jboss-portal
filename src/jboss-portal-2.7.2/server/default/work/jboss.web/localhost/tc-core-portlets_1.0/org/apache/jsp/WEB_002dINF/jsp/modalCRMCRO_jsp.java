package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.drogaraia.tc.portlet.RequestUtils;
import javax.portlet.*;
import java.util.List;

public final class modalCRMCRO_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/portlet_2_0.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"modalCRMCROPBM\" style=\"display: none; padding: 0px; margin: 0px;\">\r\n");
      out.write("\t<div class=\"conteudoModalCrmCroPbm\">\r\n");
      out.write("\t\t<div class=\"cabecalhoModalCrmCroPbm\">\r\n");
      out.write("\t\t\t<h3>Informar dados da receita</h3>\r\n");
      out.write("\t\t\t<p>O laboratório precisa de informações adicionais para</p>\r\n");
      out.write("\t\t\t<p>autorizar o desconto.</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container-radio\">\r\n");
      out.write("\t\t\t<div class=\"block-container radioLeft\">\r\n");
      out.write("\t\t\t\t<label for=\"conselho\"></label>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<div class=\"radioBoxLeft\">\r\n");
      out.write("\t\t\t\t\t<div class=\"block-container\">\t\r\n");
      out.write("\t\t\t\t\t\t<input selected=\"true\" maxlength=\"10\" type=\"radio\" id=\"crm\" name=\"tpCr\" value=\"1\">\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"block-container\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"tpCr\">CRM</label>\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"radioBoxLeft\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"block-container\">\r\n");
      out.write("\t\t\t\t\t\t<input selected=\"false\" type=\"radio\" id=\"cro\" name=\"tpCr\" value=\"2\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"block-container\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"tpCr\">CRO</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t<!-- <select id=\"tpCr\" name=\"tpCr\">\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">CRM</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">CRO</option>\r\n");
      out.write("\t\t\t\t</select> -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"dados-receita-container\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"block-container\">\r\n");
      out.write("\t\t\t<label for=\"dataReceita\">Data da receita</label>\r\n");
      out.write("\t\t\t<input id=\"dataReceitaCRMCRO\" name=\"dataReceita\" size=\"10\" maxlength=\"10\" type=\"text\" pattern=\"dd/mm/yyyy\" \r\n");
      out.write("\t\t\t\tvalue=\"");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\" onchange=\"verificaDataCRMCRO()\" onKeyPress=\"Mascara(this,Data);\"\r\n");
      out.write("\t\t\t/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<!-- value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_page_context))
        return;
      out.write("\" onkeyup=\"maskIt(this,event,'##/##/####')\" -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"block-container\">\r\n");
      out.write("\t\t\t<label for=\"cr\" id=\"labelCr\">Digite o CRM</label>\r\n");
      out.write("\t\t\t<input id=\"cr\" name=\"cr\" size=\"10\" maxlength=\"10\" type=\"text\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"block-container\">\r\n");
      out.write("\t\t\t<label for=\"ufCr\">UF</label>\r\n");
      out.write("\t\t\t<input placeholder=\"Selecione o estado\" id=\"ufCr\" class=\"ufCrStyle\" list=\"ufCrList\" maxlength=\"2\"/>\r\n");
      out.write("\t\t\t<datalist  name=\"ufCrList\" class=\"ufCrStyle\" id=\"ufCrList\" style=\"width:205px;\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<option value=\"AC\">AC</option>\r\n");
      out.write("\t\t\t\t<option value=\"AP\">AP</option>\r\n");
      out.write("\t\t\t\t<option value=\"BA\">BA</option>\r\n");
      out.write("\t\t\t\t<option value=\"AL\">AL</option>\r\n");
      out.write("\t\t\t\t<option value=\"AM\">AM</option>\r\n");
      out.write("\t\t\t\t<option value=\"CE\">CE</option>\r\n");
      out.write("\t\t\t\t<option value=\"DF\">DF</option>\r\n");
      out.write("\t\t\t\t<option value=\"ES\">ES</option>\r\n");
      out.write("\t\t\t\t<option value=\"GO\">GO</option>\r\n");
      out.write("\t\t\t\t<option value=\"MA\">MA</option>\r\n");
      out.write("\t\t\t\t<option value=\"MG\">MG</option>\r\n");
      out.write("\t\t\t\t<option value=\"MS\">MS</option>\r\n");
      out.write("\t\t\t\t<option value=\"MT\">MT</option>\r\n");
      out.write("\t\t\t\t<option value=\"PA\">PA</option>\r\n");
      out.write("\t\t\t\t<option value=\"PB\">PB</option>\r\n");
      out.write("\t\t\t\t<option value=\"PE\">PE</option>\r\n");
      out.write("\t\t\t\t<option value=\"PI\">PI</option>\r\n");
      out.write("\t\t\t\t<option value=\"PR\">PR</option>\r\n");
      out.write("\t\t\t\t<option value=\"RJ\">RJ</option>\r\n");
      out.write("\t\t\t\t<option value=\"RN\">RN</option>\r\n");
      out.write("\t\t\t\t<option value=\"RS\">RS</option>\r\n");
      out.write("\t\t\t\t<option value=\"RO\">RO</option>\r\n");
      out.write("\t\t\t\t<option value=\"RR\">RR</option>\r\n");
      out.write("\t\t\t\t<option value=\"SC\">SC</option>\r\n");
      out.write("\t\t\t\t<option value=\"SE\">SE</option>\r\n");
      out.write("\t\t\t\t<option value=\"SP\">SP</option>\r\n");
      out.write("\t\t\t\t<option value=\"TO\">TO</option>\r\n");
      out.write("\t\t\t</datalist >\r\n");
      out.write("\t\t\t<i id=\"imgemLupaCrmCro\"  class=\"fa fa-search buttonAtendimento\" title=\"Buscar Medico\" onclick=\"\" style=\"cursor:pointer; display:inline; margin-top:10px;\" > </i>\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("<!-- \t\t\t<i id=\"imgemLupaCrmCro\"  class=\"fa fa-search buttonAtendimento\" title=\"Buscar Medico\" onclick=\"\" style=\"cursor:pointer; display:inline;\" > </i>\t\t -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"identificacaoMedico\">\r\n");
      out.write("\t\t\t<label id=\"lblNomeMedico\" for=\"nomeMedico\">Nome do(a) m&eacute;dico(a)</label>\r\n");
      out.write("\t\t\t<select id=\"nomeDoMedico\" disabled name=\"nomeDoMedico\" placeholder=\"Nome do m&eacute;dico(a)\" class=\"medicoNome\">\r\n");
      out.write("\t\t\t\t<option value=\"\" disabled selected>Nome do(a) m?dico(a) </option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- BOTOES -->\r\n");
      out.write("\t\t<div class=\"buttons-container\">\r\n");
      out.write("\t\t\t<button id=\"botaoCancelarModalCRMCRO\">\r\n");
      out.write("\t\t\t\tCancelar\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<button id=\"botaoAdicionarSemDescontoCRMCRO\">\r\n");
      out.write("\t\t\t\tAdicionar sem desconto\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<button id=\"botaoInformarDescontoCRMCRO\">\r\n");
      out.write("\t\t\t\tInformar dados\r\n");
      out.write("\t\t\t</button>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function verificaDataCRMCRO () {    \r\n");
      out.write("\t\tvar dataentrada = document.getElementById(\"dataReceitaCRMCRO\").value;\r\n");
      out.write("\t\tvar patternValidaData = /^(((0[1-9]|[12][0-9]|3[01])([-.\\/])(0[13578]|10|12)([-.\\/])(\\d{4}))|(([0][1-9]|[12][0-9]|30)([-.\\/])(0[469]|11)([-.\\/])(\\d{4}))|((0[1-9]|1[0-9]|2[0-8])([-.\\/])(02)([-.\\/])(\\d{4}))|((29)(\\.|-|\\/)(02)([-.\\/])([02468][048]00))|((29)([-.\\/])(02)([-.\\/])([13579][26]00))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][0][48]))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][2468][048]))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][13579][26])))$/;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (dataentrada == \"\") {\r\n");
      out.write("\t\t\talert('Preencha o campo com a data da receita');\r\n");
      out.write("\t\t\t$j('#dataReceitaCRMCRO').val('');\t\t\t\r\n");
      out.write("\t\t\tvalidaData = false;\r\n");
      out.write("\t\t} else if (!patternValidaData.test(dataentrada)) {\r\n");
      out.write("\t\t\talert(\"Digite a data no formato Dia/Mes/Ano\");\t\t\t\r\n");
      out.write("\t\t\t$j('#dataReceitaCRMCRO').val('');\t\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"dataReceitaCRMCRO\").value = \"\";\r\n");
      out.write("\t\t\tvalidaData = false;\r\n");
      out.write("\t\t} else {\t\t\t\r\n");
      out.write("\t\t\tvalidaData = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction maskIt(w,e,m,r,a) {\r\n");
      out.write("\t    // Cancela se o evento for Backspace\r\n");
      out.write("\t    if (!e) var e = window.event\r\n");
      out.write("\t    if (e.keyCode) code = e.keyCode;\r\n");
      out.write("\t    else if (e.which) code = e.which;\r\n");
      out.write("\t    \r\n");
      out.write("\t    // Variaveis da funcao\r\n");
      out.write("\t    var txt  = (!r) ? w.value.replace(/[^\\d]+/gi,'') : w.value.replace(/[^\\d]+/gi,'').reverse();\r\n");
      out.write("\t    var mask = (!r) ? m : m.reverse();\r\n");
      out.write("\t    var pre  = (a ) ? a.pre : \"\";\r\n");
      out.write("\t    var pos  = (a ) ? a.pos : \"\";\r\n");
      out.write("\t\tvar ret  = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (w.value == \"\"){\r\n");
      out.write("\t\t\talert ('Preencha o campo com a data de entrada');    \r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t    if(code == 9 || code == 8 || txt.length == mask.replace(/[^#]+/g,'').length) return false;\r\n");
      out.write("\t\r\n");
      out.write("\t    // Loop na mascara para aplicar os caracteres\r\n");
      out.write("\t    for(var x=0,y=0, z=mask.length;x<z && y<txt.length;) {\r\n");
      out.write("\t\t\tif (mask.charAt(x)!='#') {\r\n");
      out.write("\t\t\t\tret += mask.charAt(x); x++;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tret += txt.charAt(y); y++; x++;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t    // Retorno da funcao\r\n");
      out.write("\t    ret = (!r) ? ret : ret.reverse()        \r\n");
      out.write("\t    w.value = pre+ret+pos;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /WEB-INF/jsp/modalCRMCRO.jsp(49,11) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setType("date");
    // /WEB-INF/jsp/modalCRMCRO.jsp(49,11) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/modalCRMCRO.jsp(49,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${receita.data}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent(null);
    // /WEB-INF/jsp/modalCRMCRO.jsp(52,15) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setType("date");
    // /WEB-INF/jsp/modalCRMCRO.jsp(52,15) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/modalCRMCRO.jsp(52,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataNascimento}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/jsp/modalCRMCRO.jsp(178,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
