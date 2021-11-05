package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.drogaraia.tc.portlet.RequestUtils;
import javax.portlet.*;
import java.util.List;

public final class modalDescontoPbm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/portlet_2_0.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
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
      out.write("<div id=\"dialogMostrarDescontosPbm\" style=\"display: none; padding: 0px; margin: 0px; z-index: 1001;\">\r\n");
      out.write("\t\t<input id=\"eanProdutoModal\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t<input id=\"eanFilialModal\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t<input id=\"eanPmcModal\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t<input id=\"cdFilial\" type=\"hidden\" value='");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<input id=\"idClienteModal\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t<input id=\"cdEmpresaModal\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t<input id=\"cdPbm\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t<input id=\"objProduto\" type=\"hidden\" value=\"\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"contentDireito\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"headerContentDireito\" id=\"headerContentDireitoModal\">\r\n");
      out.write("\t\t\t\t<img src=\"/tc-core-portlets_1.0/images/ico_logo_funcional_modal_desconto.png\" width=\"84\" height=\"24\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<p class=\"contentDireitoProgramaLabel\">Programa:</p>\r\n");
      out.write("\t\t\t<p class=\"contentDireitoProgramaNomePrograma\" id=\"contentDireitoProgramaNomePrograma\"></p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"dadosContato\" id=\"dadosContatoModal\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"dadosContatoItem\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/tc-core-portlets_1.0/images/ico_monitor_modal_desconto.svg\" width=\"22\"/>\r\n");
      out.write("\t\t\t\t\t<span class=\"dadosSitePrograma\" id=\"dadosSitePrograma\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"dadosContatoItem\" style=\"max-width: 122px; text-overflow: clip; white-space: nowrap; width: 100%; overflow: hidden;\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/tc-core-portlets_1.0/images/ico_phone_modal_desconto.svg\" width=\"18\"/>\r\n");
      out.write("\t\t\t\t\t<span class=\"dadosContatoInfo Telefone\" id=\"dadosContatoInfoTelefone\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"dadosContatoItem\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/tc-core-portlets_1.0/images/ico_relogio_modal_desconto.svg\" width=\"20\"/>\r\n");
      out.write("\t\t\t\t\t<span class=\"dadosContatoInfoSegSab\" id=\"dadosContatoInfoSegSab\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"dadosContatoCliente\">\r\n");
      out.write("\t\t\t\t<div class=\"dadosContatoClienteInfoImg\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"dadosContatoClienteInfoGeral\">\r\n");
      out.write("\t\t\t\t\t<p class=\"dadosContatoClienteInfoLabel\" id=\"dadosContatoClienteInfoLabel\">\r\n");
      out.write("\t\t\t\t\t\tCliente: \r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"dadosContatoClienteInfoNome\" id=\"dadosContatoClienteInfoNome\"></p>\r\n");
      out.write("\t\t\t\t\t<span class=\"dadosContatoClienteInfoProdutoNaoCadstrado\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"pVerificandoCliente\" id=\"statusCadastradoPrograma\">\r\n");
      out.write("\t\t\t\t\t\t\tVerificando o cliente...\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<span class=\"dadosContatoClienteTenteNovamente\" id=\"dadosContatoClienteTenteNovamente\">\r\n");
      out.write("\t\t\t\t\t\t<p style=\"margin-top: 8px; display: block; cursor: pointer; display: none;\" class=\"pTenteNovamente\" onclick=\"tenteNovamenteVerificaCliente()\">\r\n");
      out.write("\t\t\t\t\t\t\tTentar novamente\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"botaoModalDescontoPbm\">\r\n");
      out.write("\t\t\t\t<button class=\"botaoModalDescontoCadastrarCliente\"  \r\n");
      out.write("\t\t\t\t\t\tonclick=\"exibeModalCadastroCliente()\" \r\n");
      out.write("\t\t\t\t\t\tid=\"botaoModalDescontoCadastrarCliente\">\r\n");
      out.write("\t\t\t\t\tCadastrar cliente\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<button class=\"botaoModalDescontoCadastrarProduto\"  \r\n");
      out.write("\t\t\t\t\t\tonclick=\"exibeModalCadastroCliente()\" \r\n");
      out.write("\t\t\t\t\t\tid=\"botaoModalDescontoCadastrarProduto\">\r\n");
      out.write("\t\t\t\t\tCadastrar produto\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<button \r\n");
      out.write("\t\t\t\t\tclass=\"botaoModalDescontoGerarAutorizacao\"\r\n");
      out.write("\t\t\t\t\tonclick=\"closeDialogMostraDescontosPbm();preAutorizarPelaModal()\"\r\n");
      out.write("\t\t\t\t\tid=\"botaoModalDescontoGerarAutorizacao\">\r\n");
      out.write("\t\t\t\t\tGerar autoriza&ccedil;&atilde;o\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"contentEsquerdo\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"dialogDescontoPbmTitulo\" class=\"dialogDescontoPbmTitulo\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\tRegras de desconto do laborat&oacute;rio\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p id=\"modalDescontoNomeProduto\"></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"dialogDescontoMsgCustomPbmCustom\"></div>\r\n");
      out.write("\t\t<div id=\"dialogDescontoMsgCustomPbmHeader\"></div>\r\n");
      out.write("\t\t<div id=\"divTodosDescontos\" class=\"divTodosDescontos\"></div>\r\n");
      out.write("\t\t<div id=\"dialogDescontoMsgCustomPbmFooter\"></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var recalcTabInfoPos = function () {\r\n");
      out.write("\tvar tabInfo = document.querySelector('.tabInfo')\r\n");
      out.write("\tvar props = tabInfo.getBoundingClientRect()\r\n");
      out.write("    if (props.top <= 0){\r\n");
      out.write("        tabInfo.classList.add('fixed')\r\n");
      out.write("        if(window.scrollY !== undefined) {\r\n");
      out.write("            tabInfo.style.top = window.scrollY - ");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write(" + 'px'\r\n");
      out.write("        } else {\r\n");
      out.write("            tabInfo.style.setAttribute('top', window.pageYOffset - ");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write(" + 'px')\r\n");
      out.write("        }\r\n");
      out.write("    } else {\r\n");
      out.write("\t\ttabInfo.classList.remove('fixed')\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("document.addEventListener('scroll', function(){recalcTabInfoPos()})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function exibeModalCadastroCliente(){\r\n");
      out.write("\tlocalStorage.setItem('dadosProdutoModal',JSON.stringify(produtoSelecionado))\r\n");
      out.write("\t$(\"#dialogMostrarDescontosPbm\").dialog(\"close\");\r\n");
      out.write("\tcriarJanelaCadastro($(\"#idClienteModal\").val(), $(\"#eanProdutoModal\").val(), 0, 0, true, $(\"#cdEmpresaModal\").val(), $(\"#cdPbm\").val());\t\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function closeDialogMostraDescontosPbm(){\r\n");
      out.write("\t$(\"#dialogMostrarDescontosPbm\").dialog(\"close\");\r\n");
      out.write("\t//validarElegibilidadeCuponavel(this.produtoSelecionado.ean, cliente.cdCliente, cliente.cpf)\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function preAutorizarPelaModal() {\r\n");
      out.write("\tif(produtoSelecionado.hasOwnProperty('descGer') != true){\r\n");
      out.write("\t\tprodutoSelecionado.descGer = '0';\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tif (modalCrmCroPbm.validarElegibilidade(produtoSelecionado.codigoCategoria)) {\r\n");
      out.write("\t\tmodalCrmCroPbm.init(7);\r\n");
      out.write("\t\tmodalCrmCroPbm.acionar();\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tcuponavelFuncional.addItemNoCarrinho(produtoSelecionado,null);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/jsp/modalDescontoPbm.jsp(12,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialVO.cdFilial}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/modalDescontoPbm.jsp(101,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t\t\t\t<img class=\"headerContentDireitoImgDuvida\" id=\"headerContentDireitoModal\" src=\"/tc-core-portlets_1.0/images/svg/icon-desc-raia.svg\"/>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/modalDescontoPbm.jsp(106,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t\t\t\t<img class=\"headerContentDireitoImgDuvida\" id=\"headerContentDireitoModal\" src=\"/tc-core-portlets_1.0/images/svg/icon-desc-drogasil.svg\"/>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent(null);
    // /WEB-INF/jsp/modalDescontoPbm.jsp(135,49) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 90 : 126}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent(null);
    // /WEB-INF/jsp/modalDescontoPbm.jsp(137,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 90 : 126}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }
}
