package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clienteOperacoes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/portlet_2_0.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005factionURL;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005factionURL = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fportlet_005factionURL.release();
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      //  portlet:defineObjects
      org.jboss.portal.portlet.impl.jsr286.taglib.DefineObjects286Tag _jspx_th_portlet_005fdefineObjects_005f0 = (org.jboss.portal.portlet.impl.jsr286.taglib.DefineObjects286Tag) _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.DefineObjects286Tag.class);
      _jspx_th_portlet_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_portlet_005fdefineObjects_005f0 = _jspx_th_portlet_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_portlet_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.reuse(_jspx_th_portlet_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.reuse(_jspx_th_portlet_005fdefineObjects_005f0);
      javax.portlet.PortletConfig portletConfig = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    window.dataLayer = window.dataLayer || [];\r\n");
      out.write("    pushUserInfo(clienteCompleto.cliente.idCliente, cdFilial);\r\n");
      out.write("    pushPageInfo('/portal/tc/clienteoperacoes/?perfil','/home-cliente');\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("css/");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("padraoNovo.css\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    table.tbCadastro, td {\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    table.tbCadastro, tr {\r\n");
      out.write("        text-align: left;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    table.tbCadastro {\r\n");
      out.write("        /* width:55px; */\r\n");
      out.write("        border-collapse: separate;\r\n");
      out.write("        border-spacing: 5px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    input[readOnly] {\r\n");
      out.write("        background-color: #EBEBE4;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t$j.fn.extend({\r\n");
      out.write("\t propAttr: $j.fn.prop || $j.fn.attr\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("    var enderecos = new Array();\r\n");
      out.write("    var enderecoAtual = 0;\r\n");
      out.write("    var filhos = new Array();\r\n");
      out.write("    var telefonesConjuge = new Array();\r\n");
      out.write("    var flagFilhos = 1;\r\n");
      out.write("    var ETIQUETA_CARTAO = 1;\r\n");
      out.write("    var ETIQUETA_FORMULARIO = 2;\r\n");
      out.write("    var cidades = new Array();\r\n");
      out.write("    var isAderenciaRecompra = false;\r\n");
      out.write("    var versaoMsCustomerSemEntradaDados = '");
      if (_jspx_meth_c_005fout_005f5(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $j(function () {\r\n");
      out.write("        $j('#ficharioCliente').criarFichario();\r\n");
      out.write("        $j('#ficharioCliente').mudarTab(\"Titular\");\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function gravarEmail() {\r\n");
      out.write("        if ($j('#email').val() == '') {\r\n");
      out.write("            jAlert(\"O campo e-mail \\u00e9 obrigat\\u00f3rio <br>Caso o cliente n\\u00e3o tenha e-mail <br>Cadastrar <b>raiaraia@drogaraia.com.br</b>\", \"Cadastro de Cliente\", function (r) {\r\n");
      out.write("            });\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (!checkMail($j('#email').val())) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var oldEmail = '");
      if (_jspx_meth_c_005fout_005f6(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        var email = $j('#email').val();\r\n");
      out.write("\r\n");
      out.write("        if (oldEmail != $j('#email').val()) {\r\n");
      out.write("            var idCliente = '");
      if (_jspx_meth_c_005fout_005f7(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("            var URL = contextoUrl + \"AjaxServlet?acao=GRAVAR_EMAIL&email=\" + email + \"&idCliente=\" + idCliente + \"&cdFilial=\" + cdFilial + \"&cdOperador=\" + cdOperador;\r\n");
      out.write("            funcaoDeRetornoAjax = callBackEmail;\r\n");
      out.write("            ajaxCall(URL);\r\n");
      out.write("        }\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function callBackEmail(ret) {\r\n");
      out.write("        if (ret.substring(0, 4) == \"ERRO\") {\r\n");
      out.write("            jAlert(\"ERRO !!!\", \"Cadastro de Cliente\");\r\n");
      out.write("        } else {\r\n");
      out.write("            jAlert(\"Email atualizado com sucesso\", \"Cadastro de Cliente\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function alteraCliente() {\r\n");
      out.write("        validaEntTitular();\r\n");
      out.write("        vldCampos = validarCamposCadastroCliente(false, false);\r\n");
      out.write("        if (!vldCampos) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        vldCamposAlterados = verificarCamposAlteradosCadastroCliente(clienteCadastro);\r\n");
      out.write("        if (vldCamposAlterados) {\r\n");
      out.write("            if(isAderenciaRecompra){\r\n");
      out.write("                ativaAderenciaRecompra();\r\n");
      out.write("            }\r\n");
      out.write("            if(versaoMsCustomerSemEntradaDados == 'true'){\r\n");
      out.write("            \tif (null != clientePesquisado.lastUpdateSource && '' != clientePesquisado.lastUpdateSource && clientePesquisado.lastUpdateSource != 'TC'){\r\n");
      out.write("\t\t\t\t\teditandoTelefoneMicroServico(clienteCadastro);\r\n");
      out.write("\t\t\t\t\tjAlert('Telefone atualizado com sucesso.', 'Editar Cliente');\r\n");
      out.write("\t\t\t\t\tgotoPerfilCompleto();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("            \teditandoDadosPrincipais(clienteCadastro);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("            }else{\r\n");
      out.write("            $j(\"#formAlteraCadastro\").submit();\r\n");
      out.write("            }\r\n");
      out.write("        } else {\r\n");
      out.write("            jAlert('Cadastro n\\u00e3o foi alterado!', \"Cadastro de Cliente\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function validaEntTitular(){\r\n");
      out.write("\t    var tpEnd = document.getElementById('tpEnd').value;\r\n");
      out.write("\t    var tpEndTitular = document.getElementById('tpEndTitular').value;\r\n");
      out.write("    \tif(tpEnd == null || tpEnd == \"\" || tpEnd == \"0\" ){\r\n");
      out.write("\t\t\tif(tpEndTitular != \"\" || tpEndTitular != null){\r\n");
      out.write("\t\t\t\tdocument.getElementById('tpEnd').value = tpEndTitular;\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t\t}\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function printTitular(tipo) {\r\n");
      out.write("\r\n");
      out.write("        var nome = '");
      if (_jspx_meth_c_005fout_005f8(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        var cdCliente = '");
      if (_jspx_meth_c_005fout_005f9(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fout_005f10(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        var mesAno = '");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        var rg = '");
      if (_jspx_meth_c_005fout_005f11(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        var cpf = '");
      if (_jspx_meth_c_005fout_005f12(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        var tipoCartao = '");
      if (_jspx_meth_c_005fout_005f13(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        var novoCliente = 'false';\r\n");
      out.write("        if (cpf == \"\") { \r\n");
      out.write("            cpf = \"00000000000\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        // EQUIPARACAO TC - RAIA/DROGASIL\r\n");
      out.write("        if (+LOGO_MARCA === 1) {\r\n");
      out.write("            var codBarra = null;\r\n");
      out.write("            if (tipoCartao == \"SENIOR\") {\r\n");
      out.write("                codBarra = \"8950248\";\r\n");
      out.write("            } else {\r\n");
      out.write("                codBarra = \"9720975\";\r\n");
      out.write("            }\r\n");
      out.write("            codBarra += cdCliente;\r\n");
      out.write("            codBarra += mesAno.replace('/', '');\r\n");
      out.write("        } else {\r\n");
      out.write("            var codBarra = '");
      if (_jspx_meth_c_005fout_005f14(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        if (tipo == 'FORM') {\r\n");
      out.write("            tipoEtiqueta = ETIQUETA_FORMULARIO;\r\n");
      out.write("        } else {\r\n");
      out.write("            tipoEtiqueta = ETIQUETA_CARTAO;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        startApplet();\r\n");
      out.write("\r\n");
      out.write("        versaoImpressoraBrother = '");
      if (_jspx_meth_c_005fout_005f15(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\r\n");
      out.write("        if (versaoImpressoraBrother == 'true') {\r\n");
      out.write("            document.getElementById('appletTc').imprimirEtiquetaCartao(nome, cdCliente, mesAno, codBarra, rg, cpf, cdFilial, tipoCartao, tipoEtiqueta);\r\n");
      out.write("        } else {\r\n");
      out.write("            document.getElementById('appletTc').imprimirEtiquetaCartaoEpson(nome, cdCliente, mesAno, codBarra, rg, cpf, cdFilial, tipoCartao, tipoEtiqueta);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function printAdicional() {\r\n");
      out.write("        var nome = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicionais[0].nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("        var cdCliente = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicionais[0].cartao.cdCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("' + '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicionais[0].cartao.dgCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("        var mesAno = '");
      if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        var codBarra = null;\r\n");
      out.write("        var rg = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicionais[0].rg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("        var cpf = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicionais[0].cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("        cpf = removeChar(cpf, \".\");\r\n");
      out.write("        cpf = removeChar(cpf, \"-\");\r\n");
      out.write("        var tipoCartao = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicionais[0].cartao.cdTipoCartao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("        var novoCliente = 'false';\r\n");
      out.write("\r\n");
      out.write("        if (cpf == \"\") cpf = \"00000000000\";\r\n");
      out.write("\r\n");
      out.write("        if (tipoCartao == \"SENIOR\") {\r\n");
      out.write("            codBarra = \"8950248\";\r\n");
      out.write("        } else {\r\n");
      out.write("            codBarra = \"9720975\";\r\n");
      out.write("        }\r\n");
      out.write("        codBarra += cdCliente;\r\n");
      out.write("        codBarra += mesAno.replace('/', '');\r\n");
      out.write("        codBarra += \"000000000000000000\";\r\n");
      out.write("\r\n");
      out.write("        var tipoEtiqueta = ETIQUETA_CARTAO;\r\n");
      out.write("\r\n");
      out.write("        startApplet();\r\n");
      out.write("        document.getElementById('appletTc').imprimirEtiquetaCartaoEpson(nome, cdCliente, mesAno, codBarra, rg, cpf, cdFilial, tipoCartao, tipoEtiqueta);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function printCartaoRdMed() {\r\n");
      out.write("        var nome = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("        var crm = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nrCartaoPbmr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("        var empresa = getCookie(\"empresaUnivers\");\r\n");
      out.write("        alert(\"Aguarde impress\\u00e3o de Etiqueta Cart\\u00e3o RDMed\");\r\n");
      out.write("        startApplet();\r\n");
      out.write("        document.getElementById('appletTc').imprimirEtiquetaCartaoRdMed(nome, empresa, crm);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function liberaCamposEdicao(i) {\r\n");
      out.write("        document.getElementById(\"btnImg\" + i).style.display = \"inline\";\r\n");
      out.write("        document.getElementById(\"btn\" + i).style.display = \"none\";\r\n");
      out.write("        document.getElementById(\"nome\" + i).readOnly = false;\r\n");
      out.write("        document.getElementById(\"dtNascimento\" + i).readOnly = false;\r\n");
      out.write("        document.getElementById(\"email\" + i).readOnly = false;\r\n");
      out.write("        document.getElementById(\"tpTelefone\" + i).disabled = false;\r\n");
      out.write("        document.getElementById(\"nrPrefixo\" + i).readOnly = false;\r\n");
      out.write("        document.getElementById(\"telefone\" + i).readOnly = false;\r\n");
      out.write("        document.getElementById(\"sexo\" + i).disabled = false;\r\n");
      out.write("        document.getElementById(\"relacionamento\" + i).disabled = false;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $j('#mostraNome' + i).css(\"display\", \"none\");\r\n");
      out.write("        $j('#mostraDtNascimento' + i).css(\"display\", \"none\");\r\n");
      out.write("        $j('#mostraEmail' + i).css(\"display\", \"none\");\r\n");
      out.write("        $j('#mostraTpTelefone' + i).css(\"display\", \"none\");\r\n");
      out.write("        $j('#mostraNrPrefixo' + i).css(\"display\", \"none\");\r\n");
      out.write("        $j('#mostraTelefone' + i).css(\"display\", \"none\");\r\n");
      out.write("        $j('#mostraSexo' + i).css(\"display\", \"none\");\r\n");
      out.write("        $j('#mostraRelacionamento' + i).css(\"display\", \"none\");\r\n");
      out.write("        $j('#btnExcluir' + i).css(\"display\", \"none\");\r\n");
      out.write("\r\n");
      out.write("        $j('#nome' + i).css('display', 'inline');\r\n");
      out.write("        $j('#dtNascimento' + i).css('display', 'inline');\r\n");
      out.write("        $j('#email' + i).css('display', 'inline');\r\n");
      out.write("        $j('#tpTelefone' + i).css('display', 'inline');\r\n");
      out.write("        $j('#nrPrefixo' + i).css('display', 'inline');\r\n");
      out.write("        $j('#telefone' + i).css('display', 'inline');\r\n");
      out.write("        $j('#sexo' + i).css('display', 'inline');\r\n");
      out.write("        $j('#relacionamento' + i).css('display', 'inline');\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function validaCamposPreenchidos(relacionamento, sexo, nome, dtNascimento, tpTelefone, nrPrefixo, telefone, email) {\r\n");
      out.write("        if (relacionamento == 0) {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (sexo == 0) {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if ((nome == \"\" || nome == \" \") || (!checkNomeCadCliAdicional(nome))) {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (dtNascimento == \"\" || dtNascimento == \" \") {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (tpTelefone == 0) {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (nrPrefixo == \"\" || nrPrefixo == \" \" || nrPrefixo.length < 2) {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (telefone == \"\" || telefone == \" \" || telefone.length <= 7) {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (email == \"\" || email == \" \") {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else {\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function poupulaDialogAlteracaoAdicional(i) {\r\n");
      out.write("\r\n");
      out.write("        var idCliente = document.getElementById(\"idCliente\" + i).value;\r\n");
      out.write("        var cpf = document.getElementById(\"cpf\" + i).value;\r\n");
      out.write("        var nome = $j('#nome' + i).val().replace(/[áàâãÁÀÂÃ]/g, 'a').replace(/[éèêÉÈÊ]/g, 'e').replace(/[óòôõÒÓÔÕ]/g, 'o').replace(/[úùûÚÙÛ]/g, 'u').replace(/[çÇ]/g, 'c');\r\n");
      out.write("        var dtNascimento = document.getElementById(\"dtNascimento\" + i).value;\r\n");
      out.write("        var email = document.getElementById(\"email\" + i).value;\r\n");
      out.write("        var tpTelefone = document.getElementById(\"tpTelefone\" + i).value;\r\n");
      out.write("        var nrPrefixo = document.getElementById(\"nrPrefixo\" + i).value;\r\n");
      out.write("        var telefone = document.getElementById(\"telefone\" + i).value;\r\n");
      out.write("        var sexo = document.getElementById(\"sexo\" + i).value;\r\n");
      out.write("        var relacionamento = document.getElementById(\"relacionamento\" + i).value;\r\n");
      out.write("\r\n");
      out.write("        $('#txtRevisaNomeAlteracao').val(nome);\r\n");
      out.write("        $('#txtRevisaDtNascimentoAlteracao').val(dtNascimento);\r\n");
      out.write("        $('#txtRevisaDDDAlteracao').val(nrPrefixo);\r\n");
      out.write("        $('#txtRevisaTelefoneAlteracao').val(telefone);\r\n");
      out.write("        $('#txtRevisaEmailAlteracao').val(email);\r\n");
      out.write("\r\n");
      out.write("        $('#selectRevisaTpRelacionamentoAlteracao').val(relacionamento);\r\n");
      out.write("        $('#selectRevisaTpTelefoneAlteracao').val(tpTelefone);\r\n");
      out.write("        $('#selectRevisaSexoAlteracao').val(sexo);\r\n");
      out.write("        $('#txtRevisaCpfAlteracao').val(cpf);\r\n");
      out.write("        $('#txtRevisaIdClienteAlteracao').val(idCliente);\r\n");
      out.write("\r\n");
      out.write("        escondeInputsDialogRevisaAdicional();\r\n");
      out.write("\r\n");
      out.write("        if ((nome == \"\" || nome == \" \") || (!checkNomeCadCliAdicional(nome))) {\r\n");
      out.write("            $('#divRevisaNomeAlteracao').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (dtNascimento == \"\" || dtNascimento == \" \") {\r\n");
      out.write("            $('#divRevisaDtNascimentoAlteracao').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (nrPrefixo == \"\" || nrPrefixo == \" \" || nrPrefixo.length < 2) {\r\n");
      out.write("            $('#divRevisaDDDAlteracao').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (telefone == \"\" || telefone == \" \" || telefone.length <= 7) {\r\n");
      out.write("            $('#divRevisaTelefoneAlteracao').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (email == \"\" || email == \" \") {\r\n");
      out.write("            $('#divRevisaEmailAlteracao').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function alteraAdicional(i) {\r\n");
      out.write("        var idClienteTitular = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("        var idCliente = document.getElementById(\"idCliente\" + i).value;\r\n");
      out.write("        var cpf = document.getElementById(\"cpf\" + i).value;\r\n");
      out.write("        var nome = $j('#nome' + i).val().replace(/[áàâãÁÀÂÃ]/g, 'a').replace(/[éèêÉÈÊ]/g, 'e').replace(/[óòôõÒÓÔÕ]/g, 'o').replace(/[úùûÚÙÛ]/g, 'u').replace(/[çÇ]/g, 'c');\r\n");
      out.write("        var dtNascimento = document.getElementById(\"dtNascimento\" + i).value;\r\n");
      out.write("        var email = document.getElementById(\"email\" + i).value;\r\n");
      out.write("        var tpTelefone = document.getElementById(\"tpTelefone\" + i).value;\r\n");
      out.write("        var nrPrefixo = document.getElementById(\"nrPrefixo\" + i).value;\r\n");
      out.write("        var telefone = document.getElementById(\"telefone\" + i).value;\r\n");
      out.write("        var sexo = document.getElementById(\"sexo\" + i).value;\r\n");
      out.write("        var relacionamento = document.getElementById(\"relacionamento\" + i).value;\r\n");
      out.write("\r\n");
      out.write("        var retornoValidacao = validaCamposPreenchidos(relacionamento, sexo, nome, dtNascimento, tpTelefone, nrPrefixo, telefone, email);\r\n");
      out.write("        if (retornoValidacao == true) {\r\n");
      out.write("            var url = \"");
      if (_jspx_meth_portlet_005factionURL_005f0(_jspx_page_context))
        return;
      out.write("&acao=alterarAdicional&nome=\" + nome + \"&dtNascimento=\" + dtNascimento + \"&sexo=\" + sexo + \"&tpRelacionamento=\" + relacionamento + \"&telefone=\" + telefone + \"&tpTelefone=\" + tpTelefone + \"&email=\" + email + \"&idCliente=\" + idCliente + \"&nrPrefixo=\" + nrPrefixo + \"&idClienteTitular=\" + idClienteTitular;\r\n");
      out.write("            document.location.href = url;\r\n");
      out.write("        } else {\r\n");
      out.write("            $(\"#dialogRevisarAlteracaoAdicional\").dialog({\r\n");
      out.write("                width: \"600\",\r\n");
      out.write("                height: 500,\r\n");
      out.write("                modal: true,\r\n");
      out.write("                buttons: {\r\n");
      out.write("                    Salvar: revisarAlteracaoAdicional, Cancelar: function () {\r\n");
      out.write("                        $(\"#dialogRevisarAlteracaoAdicional\").dialog('close');\r\n");
      out.write("                        return;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            poupulaDialogAlteracaoAdicional(i);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        document.getElementById(\"nome\" + i).readOnly = true;\r\n");
      out.write("        document.getElementById(\"dtNascimento\" + i).readOnly = true;\r\n");
      out.write("        document.getElementById(\"email\" + i).readOnly = true;\r\n");
      out.write("        document.getElementById(\"tpTelefone\" + i).disabled = true;\r\n");
      out.write("        document.getElementById(\"nrPrefixo\" + i).readOnly = true;\r\n");
      out.write("        document.getElementById(\"telefone\" + i).readOnly = true;\r\n");
      out.write("        document.getElementById(\"sexo\" + i).disabled = true;\r\n");
      out.write("        document.getElementById(\"relacionamento\" + i).readOnly = true;\r\n");
      out.write("        document.getElementById(\"btnImg\" + i).style.display = \"none\";\r\n");
      out.write("        document.getElementById(\"btn\" + i).style.display = \"inline\";\r\n");
      out.write("\r\n");
      out.write("        $('#mostraNome' + i).css(\"display\", \"inline\");\r\n");
      out.write("        $('#mostraDtNascimento' + i).css(\"display\", \"inline\");\r\n");
      out.write("        $('#mostraEmail' + i).css(\"display\", \"inline\");\r\n");
      out.write("        $('#mostraTpTelefone' + i).css(\"display\", \"inline\");\r\n");
      out.write("        $('#mostraNrPrefixo' + i).css(\"display\", \"inline\");\r\n");
      out.write("        $('#mostraTelefone' + i).css(\"display\", \"inline\");\r\n");
      out.write("        $('#mostraSexo' + i).css(\"display\", \"inline\");\r\n");
      out.write("        $('#mostraRelacionamento' + i).css(\"display\", \"inline\");\r\n");
      out.write("        $('#btnExcluir' + i).css(\"display\", \"inline\");\r\n");
      out.write("\r\n");
      out.write("        $('#nome' + i).css('display', 'none');\r\n");
      out.write("        $('#dtNascimento' + i).css('display', 'none');\r\n");
      out.write("        $('#email' + i).css('display', 'none');\r\n");
      out.write("        $('#tpTelefone' + i).css('display', 'none');\r\n");
      out.write("        $('#nrPrefixo' + i).css('display', 'none');\r\n");
      out.write("        $('#telefone' + i).css('display', 'none');\r\n");
      out.write("        $('#sexo' + i).css('display', 'none');\r\n");
      out.write("        $('#relacionamento' + i).css('display', 'none');\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function removerAcentos(newStringComAcento) {\r\n");
      out.write("        var string = newStringComAcento;\r\n");
      out.write("        var mapaAcentosHex = {\r\n");
      out.write("            a: /[\\xE0-\\xE6]/g,\r\n");
      out.write("            e: /[\\xE8-\\xEB]/g,\r\n");
      out.write("            i: /[\\xEC-\\xEF]/g,\r\n");
      out.write("            o: /[\\xF2-\\xF6]/g,\r\n");
      out.write("            u: /[\\xF9-\\xFC]/g,\r\n");
      out.write("            c: /\\xE7/g,\r\n");
      out.write("            n: /\\xF1/g\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        for (var letra in mapaAcentosHex) {\r\n");
      out.write("            var expressaoRegular = mapaAcentosHex[letra];\r\n");
      out.write("            string = string.replace(expressaoRegular, letra);\r\n");
      out.write("        }\r\n");
      out.write("        return string;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function revisarAlteracaoAdicional() {\r\n");
      out.write("        var nome = $('txtRevisaNomeAlteracao').val().replace(/[áàâãÁÀÂÃ]/g, 'a').replace(/[éèêÉÈÊ]/g, 'e').replace(/[óòôõÒÓÔÕ]/g, 'o').replace(/[úùûÚÙÛ]/g, 'u').replace(/[çÇ]/g, 'c');\r\n");
      out.write("        var dtNascimento = $('#txtRevisaDtNascimentoAlteracao').val();\r\n");
      out.write("        var nrPrefixo = $('#txtRevisaDDDAlteracao').val();\r\n");
      out.write("        var telefone = $('#txtRevisaTelefoneAlteracao').val();\r\n");
      out.write("        var email = $('#txtRevisaEmailAlteracao').val();\r\n");
      out.write("\r\n");
      out.write("        var relacionamento = $('#selectRevisaTpRelacionamentoAlteracao').val();\r\n");
      out.write("        var tpTelefone = $('#selectRevisaTpTelefoneAlteracao').val();\r\n");
      out.write("        var sexo = $('#selectRevisaSexoAlteracao').val();\r\n");
      out.write("        var cpf = $('#txtRevisaCpfAlteracao').val();\r\n");
      out.write("        var idClienteTitular = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("        var idCliente = $('#txtRevisaIdClienteAlteracao').val();\r\n");
      out.write("\r\n");
      out.write("        if ((nome == \"\" || nome == \" \") || (!checkNomeCadCliAdicional(nome))) {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (dtNascimento == \"\" || dtNascimento == \" \") {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (nrPrefixo == \"\" || nrPrefixo == \" \" || nrPrefixo.length < 2) {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (telefone == \"\" || telefone == \" \" || telefone.length <= 7) {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else if (email == \"\" || email == \" \") {\r\n");
      out.write("            return false;\r\n");
      out.write("        } else {\r\n");
      out.write("            var url = \"");
      if (_jspx_meth_portlet_005factionURL_005f1(_jspx_page_context))
        return;
      out.write("&acao=alterarAdicional&nome=\" + nome + \"&dtNascimento=\" + dtNascimento + \"&sexo=\" + sexo + \"&tpRelacionamento=\" + relacionamento + \"&telefone=\" + telefone + \"&tpTelefone=\" + tpTelefone + \"&email=\" + email + \"&idCliente=\" + idCliente + \"&nrPrefixo=\" + nrPrefixo + \"&idClienteTitular=\" + idClienteTitular;\r\n");
      out.write("            document.location.href = url;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function consultaCpfAdicional(obj) {\r\n");
      out.write("        var cpf = document.getElementById('numCpfAdicional').value;\r\n");
      out.write("        if (cpf.length > 0) {\r\n");
      out.write("            var ret = validarCPF(cpf);\r\n");
      out.write("            cpf = removeChar(cpf, \".\");\r\n");
      out.write("            cpf = removeChar(cpf, \"-\");\r\n");
      out.write("            if (!ret) {\r\n");
      out.write("                return false;\r\n");
      out.write("            } else {\r\n");
      out.write("                var url = \"");
      if (_jspx_meth_portlet_005factionURL_005f2(_jspx_page_context))
        return;
      out.write("&acao=consultarAdicional&cpfParam=\" + cpf;\r\n");
      out.write("                document.location.href = url;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function enterExec(evt, funcao) {\r\n");
      out.write("        var code = (window.event) ? evt.keyCode : evt.which;\r\n");
      out.write("        if (code == 13) {\r\n");
      out.write("            funcao.call();\r\n");
      out.write("            return false;\r\n");
      out.write("        } else {\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function verificaNulo(param) {\r\n");
      out.write("        try {\r\n");
      out.write("            if (eval(param) == null) {\r\n");
      out.write("                return \"\";\r\n");
      out.write("            } else {\r\n");
      out.write("                return param;\r\n");
      out.write("            }\r\n");
      out.write("        } catch (err) {\r\n");
      out.write("            return param;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function populaConjuge(nome, dataNascimento, rg, cpf, sexo, email) {\r\n");
      out.write("        var formNome = document.getElementById('txtNomeConjuge');\r\n");
      out.write("        var formDtNasc = document.getElementById('dtNascConjuge');\r\n");
      out.write("        var formRg = document.getElementById('numRgConjuge');\r\n");
      out.write("        var formCpf = document.getElementById('numCpfConjuge');\r\n");
      out.write("        var formEmail = document.getElementById('emailConjuge');\r\n");
      out.write("        var formSexo = document.getElementById('txtSexoConjuge');\r\n");
      out.write("\r\n");
      out.write("        formNome.innerHTML = nome;\r\n");
      out.write("        formDtNasc.innerHTML = dataNascimento;\r\n");
      out.write("        formRg.innerHTML = rg;\r\n");
      out.write("        formCpf.innerHTML = verificaNulo(cpf);\r\n");
      out.write("        formEmail.innerHTML = verificaNulo(email);\r\n");
      out.write("        formCpf.innerHTML = Mascara(formCpf.innerHTML, Cpf, 1);\r\n");
      out.write("        formSexo.innerHTML = sexo;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $j(function () {\r\n");
      out.write("        var countItens = countItensRecompra(cdFilial,idCliente);\r\n");
      out.write("        isAderenciaRecompra = countItens > 0;\r\n");
      out.write("        if(isAderenciaRecompra){\r\n");
      out.write("            isRecompraAderenciaAtivada(idCliente);\r\n");
      out.write("            $('#tdChkRecompra').css('display', '');\r\n");
      out.write("        } else {\r\n");
      out.write("            $('#tdChkRecompra').css('display', 'none');\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function ativaAderenciaRecompra(){\r\n");
      out.write("        var chkRecompra = document.getElementById(\"chkRecompra\").checked;\r\n");
      out.write("        var aderencia = countItensRecompra(cdFilial,idCliente);\r\n");
      out.write("        if(chkRecompra != undefined || chkRecompra != null || idCliente != null || idCliente != undefined){\r\n");
      out.write("            gravarDesativaAderenciaRecompra(chkRecompra, idCliente);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // EQUIPARACAO TC - RAIA/DROGASIL\r\n");
      out.write("    if(+LOGO_MARCA === 1) {\r\n");
      out.write("        var uiDialogTitlebarBackgroundColor = \"#0F8293\"\r\n");
      out.write("    } else {\r\n");
      out.write("        var uiDialogTitlebarBackgroundColor = \"#E23D41\"\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $j(function () {\r\n");
      out.write("        $(\"#btnExlcuirBeneficios\").click(function () {\r\n");
      out.write("            $(\"#dialogExcluir\").dialog({\r\n");
      out.write("                height: 230,\r\n");
      out.write("                width: 730,\r\n");
      out.write("                position: {my: \"right center\", at: \"right center\", of: window}\r\n");
      out.write("            }).show().prev(\".ui-dialog-titlebar\").css(\"background\", uiDialogTitlebarBackgroundColor).css(\"color\", \"white\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"#btnInserirBeneficios\").click(function () {\r\n");
      out.write("            $(\"#dialogInserir\").dialog({\r\n");
      out.write("                height: 230,\r\n");
      out.write("                width: 730,\r\n");
      out.write("                position: {my: \"right center\", at: \"right center\", of: window}\r\n");
      out.write("            }).show().prev(\".ui-dialog-titlebar\").css(\"background\", uiDialogTitlebarBackgroundColor).css(\"color\", \"white\");\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    // populaComboPBM = []\r\n");
      out.write("    // ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("    var saudeSeguradoras = [];\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div id=\"dialogExcluir\" title=\"EXCLUIR BENEF&Iacute;CIOS\" style=\"display: none;\">\r\n");
      out.write("    <table width=\"100%\" cellspacing=\"5\" cellpadding=\"0\" class=\"adicionarExcluirBeneficios ");
      if (_jspx_meth_c_005fout_005f51(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("           style=\"font-family: sans-serif; font-size: 10px; color: #3D3333\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"3\" align=\"center\" class=\"titleSection\">\r\n");
      out.write("                <b>BENEF&Iacute;CIOS DO CLIENTE</b>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tr style=\"font-size: 11.5px\">\r\n");
      out.write("            <th style=\"background: #696C6C; color: white; text-align: center\">CART&Atilde;O RD</th>\r\n");
      out.write("            <th style=\"background: #696C6C; color: white; text-align: center\">PBM / PROGRAMA DA IND&Uacute;STRIA</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td style=\"background: #E9E9EE; width: 50% \"><b>\r\n");
      out.write("                <ol style=\"list-style-type: square\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </ol>\r\n");
      out.write("            </b></td>\r\n");
      out.write("            <td style=\"background: #E9E9EE; width: 50%\"><b>\r\n");
      out.write("                <b>\r\n");
      out.write("                    <ol style=\"list-style-type: square\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f12(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </b>\r\n");
      out.write("            </b></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr style=\"font-size: 11.5px\">\r\n");
      out.write("            <th style=\"background: #696C6C; color: white; text-align: center\">UNIVERS</th>\r\n");
      out.write("            <th style=\"background: #696C6C; color: white; text-align: center\"></th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"background: #E9E9EE\">\r\n");
      out.write("                <b>\r\n");
      out.write("                    <ol style=\"list-style-type: square\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f13(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </b>\r\n");
      out.write("            </td>\r\n");
      out.write("\r\n");
      out.write("            <td style=\"background: #E9E9EE\">\r\n");
      out.write("                <b>\r\n");
      out.write("                    &nbsp;\r\n");
      out.write("                </b>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"dialogInserir\" title=\"INSERIR BENEF&Iacute;CIOS\" style=\"display: none;\">\r\n");
      out.write("    <table border=\"1\" width=\"100%\" cellspacing=\"5\" cellpadding=\"0\"\r\n");
      out.write("    class=\"adicionarExcluirBeneficios ");
      if (_jspx_meth_c_005fout_005f52(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("           style=\"font-family: sans-serif; font-size: 10px; color: #3D3333\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td colspan=\"2\" align=\"center\" class=\"titleSection\">\r\n");
      out.write("                <b>Novo Perfil</b>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tr style=\"font-size: 11.5px\">\r\n");
      out.write("            <th style=\"background: #696C6C; color: white; text-align: center\">Tipo Perfil</th>\r\n");
      out.write("            <th style=\"background: #696C6C; color: white; text-align: center\">Perfil</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <form>\r\n");
      out.write("                <td align=\"center\" style=\"width: 50%\">\r\n");
      out.write("                    <select style=\"width: 70%\" id=\"selectTipoPerfil\" onchange=\"selectOpt(this)\">\r\n");
      out.write("                        <option value=\"0\">--------Selecione--------</option>\r\n");
      out.write("                        <option value=\"2\">PBM/Prog. Ind&uacute;stria</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td align=\"center\" style=\"width: 50%\">\r\n");
      out.write("                    <select style=\"width: 70%; display: none\" id=\"selectTipoSubPerfilPBM\">\r\n");
      out.write("                        <option value=\"0\">--------Selecione--------</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f14(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <input id=\"searchSeguradora\" type=\"text\" placeholder=\"Digite o nome PBM/Prog.Industria\"\r\n");
      out.write("                           style=\"width: 70%; display: none\">\r\n");
      out.write("                    <input id=\"valueSeguradora\" type=\"text\" style=\"width: 70%; display: none\">\r\n");
      out.write("                    <script>\r\n");
      out.write("                        $(function () {\r\n");
      out.write("                            // var saudeSeguradoras = [];\r\n");
      out.write("                            // ");
      if (_jspx_meth_c_005fforEach_005f15(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            $(\"#searchSeguradora\").autocomplete({\r\n");
      out.write("                                appendTo: $j('#dialogInserir'),\r\n");
      out.write("                                source: saudeSeguradoras,\r\n");
      out.write("                                focus: function (event, ui) {\r\n");
      out.write("                                    event.preventDefault();\r\n");
      out.write("                                    $(this).val(ui.item.label);\r\n");
      out.write("                                },\r\n");
      out.write("                                select: function (event, ui) {\r\n");
      out.write("                                    event.preventDefault();\r\n");
      out.write("                                    $('#valueSeguradora').val(ui.item.value);\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("                        });\r\n");
      out.write("                    </script>\r\n");
      out.write("                </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </br>\r\n");
      out.write("    </br>\r\n");
      out.write("    </br>\r\n");
      out.write("    <div align=\"center\">\r\n");
      out.write("        <input type=\"button\" class=\"button120\" id=\"btnGravarBeneficios\" value=\"Gravar Perfil\"\r\n");
      out.write("               onclick=\"gravarTipoPerfil()\"/>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"dialogRevisarCadastro\" title=\"Cadastro de Cliente\" style=\"display: none\">\r\n");
      out.write("        <form id=\"formAlteraCadastro\" name=\"formAlteraCadastro\"\r\n");
      out.write("              action=\"");
      if (_jspx_meth_portlet_005factionURL_005f4(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              method=\"POST\">\r\n");
      out.write("            <h3 align=\"center\">Campos n&atilde;o informados ou inv&aacute;lidos</h3>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <b>\r\n");
      out.write("                <div id=\"nmClienteVal\" style=\"display: none\">\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f27(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Nome\r\n");
      out.write("                    <input type=\"text\" name=\"txtNomeVal\" id=\"txtNomeVal\" size=\"40\" maxlength=\"30\"/>\r\n");
      out.write("                    <div id=\"nomeMsgVal\" name=\"nomeMsgVal\" style=\"color: #C50830\">Nome n&atilde;o informado ou inv&aacute;lido</div>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"numRgVal\" style=\"display: none\">\r\n");
      out.write("                    RG\r\n");
      out.write("                    <input type=\"text\" name=\"txtNumRgVal\" id=\"txtNumRgVal\" size=\"12\" maxlength=\"10\"/>\r\n");
      out.write("                    <div id=\"rgMsgVal\" name=\"rgMsgVal\" style=\"color: #C50830\">RG n&atilde;o informado</div>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"dtNascVal\" style=\"display: none\">\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f28(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Data Nascimento\r\n");
      out.write("                    <input type=\"text\" name=\"txtDtNascVal\" id=\"txtDtNascVal\" size=\"15\" maxlength=\"15\"\r\n");
      out.write("                           onKeyPress=\"Mascara(this,Data);\"/>\r\n");
      out.write("                    <div id=\"dtNascMsgVal\" name=\"dtNascMsgVal\" style=\"color: #C50830\">O cliente deve possuir no m&iacute;nimo\r\n");
      out.write("                        15 anos de idade.\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"sexoVal\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    Sexo\r\n");
      out.write("                    <select id=\"txtSexoVal\" name=\"txtSexoVal\">\r\n");
      out.write("                        <option value=\"I\" selected=\"selected\">--</option>\r\n");
      out.write("                        <option value=\"F\" label=\"Feminino\">F</option>\r\n");
      out.write("                        <option value=\"M\" label=\"Masculino\">M</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <div id=\"sexoMsgVal\" name=\"sexoMsgVal\" style=\"color: #C50830\">Sexo n&atilde;o informado</div>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"beneficioVal\" style=\"display: none\">\r\n");
      out.write("                    Benef&iacute;cio\r\n");
      out.write("                    <input type=\"text\" name=\"txtBeneficioVal\" id=\"txtBeneficioVal\"\r\n");
      out.write("                           onKeyPress=\"Mascara(this, Beneficio);\" size=\"15\" maxlength=\"13\"/>\r\n");
      out.write("                    <div id=\"beneficioMsgVal\" name=\"beneficioMsgVal\" style=\"color: #C50830\">Beneficio n&atilde;o informado ou\r\n");
      out.write("                        inv&aacute;lido\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"emailVal\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f29(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Email\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"text\" name=\"txtEmailVal\" id=\"txtEmailVal\" size=\"40\" maxlength=\"100\"/>\r\n");
      out.write("                        <div id=\"emailMsgVal\" name=\"emailMsgVal\" style=\"color: #C50830\">Email n&atilde;o informado ou\r\n");
      out.write("                            inv&aacute;lido!\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </b>\r\n");
      out.write("            <div id=\"telefone1Val\" style=\"display: none\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f30(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                            Tipo Telefone\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f31(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                            DDD\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f32(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                            Telefone\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <select id=\"tpTel1Val\" name=\"tpTel1Val\">\r\n");
      out.write("                                <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                                <option value=\"1\" label=\"Residencial\">Residencial</option>\r\n");
      out.write("                                <option value=\"2\" label=\"Comercial\">Comercial</option>\r\n");
      out.write("                                <option value=\"3\" label=\"Celular\">Celular</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numDddVal\" id=\"numDddVal\" onKeyPress=\"Mascara(this, Telefone);\"\r\n");
      out.write("                                   size=\"4\" maxlength=\"3\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numTelVal\" id=\"numTelVal\" onKeyPress=\"Mascara(this, Telefone);\"\r\n");
      out.write("                                   size=\"13\" maxlength=\"10\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <div id=\"tel1MsgVal\" name=\"tel1MsgVal\" style=\"color: #C50830\">Tipo, DDD ou Telefone n&atilde;o\r\n");
      out.write("                                informado\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"telefone2Val\" style=\"display: none\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Tipo Telefone 2</td>\r\n");
      out.write("                        <td>DDD 2</td>\r\n");
      out.write("                        <td>Telefone 2</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <select id=\"tpTel2Val\" name=\"tpTel2Val\">\r\n");
      out.write("                                <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                                <option value=\"1\" label=\"Residencial\">Residencial</option>\r\n");
      out.write("                                <option value=\"2\" label=\"Comercial\">Comercial</option>\r\n");
      out.write("                                <option value=\"3\" label=\"Celular\">Celular</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numDdd2Val\" id=\"numDdd2Val\" onKeyPress=\"Mascara(this, Telefone);\"\r\n");
      out.write("                                   size=\"4\" maxlength=\"3\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numTel2Val\" id=\"numTel2Val\" onKeyPress=\"Mascara(this, Telefone);\"\r\n");
      out.write("                                   size=\"13\" maxlength=\"10\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <div id=\"tel2MsgVal\" name=\"tel2MsgVal\" style=\"color: #C50830\">Tipo, DDD ou Telefone n&atilde;o\r\n");
      out.write("                                informado\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"enderecoVal\" style=\"display: none\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>CEP</td>\r\n");
      out.write("                        <td>Tipo Endere&ccedil;o</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numCepVal\" id=\"numCepVal\"\r\n");
      out.write("                                   onKeyPress=\"Mascara(this,Cep); whenEnterExec(event, buscaNovoCepDialog);\"\r\n");
      out.write("                                   onblur=\"buscaNovoCepDialog();\" size=\"10\" maxlength=\"9\"/>\r\n");
      out.write("                            <span class=\"input-group-addon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img name=\"verificarCEPVal\" id=\"verificarCEPVal\"\r\n");
      out.write("                                                                 onclick=\"buscaNovoCepDialog()\" type=\"button\"\r\n");
      out.write("                                                                 title=\"Buscar cep\" value=\"Buscar\"\r\n");
      out.write("                                                                 src=\"");
      if (_jspx_meth_c_005furl_005f33(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("                                                                 style=\"cursor: pointer\" ;/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <select id=\"tpEndVal\" name=\"tpEndVal\">\r\n");
      out.write("                                <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f16(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Logradouro</td>\r\n");
      out.write("                        <td>N&uacute;mero</td>\r\n");
      out.write("                        <td>Complemento</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"txtLograVal\" id=\"txtLograVal\" size=\"31\" maxlength=\"60\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numNumeroVal\" id=\"numNumeroVal\" onKeyPress=\"Mascara(this,Integer);\"\r\n");
      out.write("                                   size=\"6\" maxlength=\"4\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"txtComplVal\" id=\"txtComplVal\" size=\"15\" maxlength=\"20\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Bairro</td>\r\n");
      out.write("                        <td>Cidade</td>\r\n");
      out.write("                        <td>UF</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"txtBairroVal\" id=\"txtBairroVal\" size=\"31\" maxlength=\"30\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"txtCidadeVal\" id=\"txtCidadeVal\" size=\"31\" maxlength=\"30\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"txtUfVal\" id=\"txtUfVal\" size=\"3\" maxlength=\"2\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                <b>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <div id=\"endMsgVal\" name=\"endMsgVal\" style=\"color: #C50830\">Campos obrigat&oacute;rios ao informar\r\n");
      out.write("                        endere&ccedil;o: CEP, Tipo Endere&ccedil;o, Logradouro, N&uacute;mero, Bairro, Cidade e UF.\r\n");
      out.write("                    </div>\r\n");
      out.write("                </b>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- NOVA DIALOG PARA RECADASTRAR EMAIL E TELEFONES -->\r\n");
      out.write("    <div id=\"dialogAtualizacaoDadosContato\" title=\"Atualiza&ccedil;&atilde;o de dados cadastrais\" style=\"display: none\">\r\n");
      out.write("        <form id=\"formAtualizacaoDadosContato\" name=\"formAtualizacaoDadosContato\"\r\n");
      out.write("              action=\"");
      if (_jspx_meth_portlet_005factionURL_005f5(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              method=\"POST\">\r\n");
      out.write("            <input type=\"hidden\" class=\"acao\" name=\"acao\" value=\"ATUALIZADADOSCONTATO\"/>\r\n");
      out.write("            <div id=\"emailAtualizacao\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f34(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                            Email\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"txtEmailAtualizacao\" id=\"txtEmailAtualizacao\" size=\"40\"\r\n");
      out.write("                                   maxlength=\"100\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"telefone1Atualizacao\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f35(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                            Tipo Telefone\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f36(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                            DDD\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f37(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                            Telefone\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <select id=\"tpTel1Atualizacao\" name=\"tpTel1Atualizacao\">\r\n");
      out.write("                                <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                                <option value=\"1\" label=\"Residencial\">Residencial</option>\r\n");
      out.write("                                <option value=\"2\" label=\"Comercial\">Comercial</option>\r\n");
      out.write("                                <option value=\"3\" label=\"Celular\">Celular</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numDddAtualizacao\" id=\"numDddAtualizacao\"\r\n");
      out.write("                                   onKeyPress=\"Mascara(this, Telefone);\" size=\"4\" maxlength=\"3\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numTelAtualizacao\" id=\"numTelAtualizacao\"\r\n");
      out.write("                                   onKeyPress=\"Mascara(this, Telefone);\" size=\"13\" maxlength=\"10\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"telefone2Atualizacao\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Tipo Telefone 2</td>\r\n");
      out.write("                        <td>DDD 2</td>\r\n");
      out.write("                        <td>Telefone 2</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <select id=\"tpTel2Atualizacao\" name=\"tpTel2Atualizacao\">\r\n");
      out.write("                                <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                                <option value=\"1\" label=\"Residencial\">Residencial</option>\r\n");
      out.write("                                <option value=\"2\" label=\"Comercial\">Comercial</option>\r\n");
      out.write("                                <option value=\"3\" label=\"Celular\">Celular</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numDdd2Atualizacao\" id=\"numDdd2Atualizacao\"\r\n");
      out.write("                                   onKeyPress=\"Mascara(this, Telefone);\" size=\"4\" maxlength=\"3\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <input type=\"text\" name=\"numTel2Atualizacao\" id=\"numTel2Atualizacao\"\r\n");
      out.write("                                   onKeyPress=\"Mascara(this, Telefone);\" size=\"13\" maxlength=\"10\"/>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- FIM NOVA DIALOG -->\r\n");
      out.write("    <div id=\"dialogoNovoEnderecoTitular\" title=\"Novo Endere&ccedil;o\" style=\"display: none\">\r\n");
      out.write("        <form id=\"formNovoEndereco\" name=\"formNovoEndereco\"\r\n");
      out.write("              action=\"");
      if (_jspx_meth_portlet_005factionURL_005f6(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              method=\"POST\">\r\n");
      out.write("            <br/>\r\n");
      out.write("            <b>\r\n");
      out.write("                <div id=\"enderecoTitular\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>CEP</td>\r\n");
      out.write("                            <td>Tipo Endere&ccedil;o</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <input type=\"text\" name=\"numCepTitular\" id=\"numCepTitular\"\r\n");
      out.write("                                       onKeyPress=\"Mascara(this,Cep); whenEnterExec(event, buscaNovoCepDialogTitular);\"\r\n");
      out.write("                                       onblur=\"buscaNovoCepDialogTitular();\" size=\"10\" maxlength=\"9\"/>\r\n");
      out.write("                                <span class=\"input-group-addon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"verificarCEPTitular\"\r\n");
      out.write("                                                                     onclick=\"buscaNovoCepDialogTitular()\" type=\"button\"\r\n");
      out.write("                                                                     title=\"Buscar cep\" value=\"Buscar\"\r\n");
      out.write("                                                                     src=\"");
      if (_jspx_meth_c_005furl_005f38(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("                                                                     style=\"cursor: pointer\" ;/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <select id=\"tpEndTitular\" name=\"tpEndTitular\">\r\n");
      out.write("                                    <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_005fforEach_005f17(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div id='msgCep' style=\"font:bold; color: #C50830; display:none;\">CEP n&atilde;o informado\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div id='msgTpEndereco' style=\"font:bold; color: #C50830; display:none;\">Tipo de\r\n");
      out.write("                                    endere&ccedil;o n&atilde;o informado\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Logradouro</td>\r\n");
      out.write("                            <td>N&uacute;mero</td>\r\n");
      out.write("                            <td>Complemento</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <input type=\"text\" name=\"txtLograTitular\" id=\"txtLograTitular\" size=\"31\"\r\n");
      out.write("                                       maxlength=\"60\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <input type=\"text\" name=\"numNumeroTitular\" id=\"numNumeroTitular\"\r\n");
      out.write("                                       onKeyPress=\"Mascara(this,Integer);\" size=\"6\" maxlength=\"4\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <input type=\"text\" name=\"txtComplTitular\" id=\"txtComplTitular\" size=\"15\"\r\n");
      out.write("                                       maxlength=\"20\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div id='msgLogradouro' style=\"font:bold; color: #C50830; display:none;\">Logradouro n&atilde;o\r\n");
      out.write("                                    informado\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td colspan=\"2\">\r\n");
      out.write("                                <div id='msgNumero' style=\"font:bold; color: #C50830; display:none;\">N&uacute;mero do endere&ccedil;o\r\n");
      out.write("                                    n&atilde;o informado\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>Bairro</td>\r\n");
      out.write("                            <td>UF</td>\r\n");
      out.write("                            <td>Cidade</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <input type=\"text\" name=\"txtBairroTitular\" id=\"txtBairroTitular\" size=\"31\"\r\n");
      out.write("                                       maxlength=\"30\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <select name=\"txtUfTitular\" id=\"txtUfTitular\" onchange=\"pupulaComboCidades()\">\r\n");
      out.write("                                    <option value=\"\" selected=\"selected\">Selecione</option>\r\n");
      out.write("                                    <option value=\"AC\">AC</option>\r\n");
      out.write("                                    <option value=\"AL\">AL</option>\r\n");
      out.write("                                    <option value=\"AM\">AM</option>\r\n");
      out.write("                                    <option value=\"AP\">AP</option>\r\n");
      out.write("                                    <option value=\"BA\">BA</option>\r\n");
      out.write("                                    <option value=\"CE\">CE</option>\r\n");
      out.write("                                    <option value=\"DF\">DF</option>\r\n");
      out.write("                                    <option value=\"ES\">ES</option>\r\n");
      out.write("                                    <option value=\"GO\">GO</option>\r\n");
      out.write("                                    <option value=\"MA\">MA</option>\r\n");
      out.write("                                    <option value=\"MG\">MG</option>\r\n");
      out.write("                                    <option value=\"MS\">MS</option>\r\n");
      out.write("                                    <option value=\"MT\">MT</option>\r\n");
      out.write("                                    <option value=\"PA\">PA</option>\r\n");
      out.write("                                    <option value=\"PB\">PB</option>\r\n");
      out.write("                                    <option value=\"PE\">PE</option>\r\n");
      out.write("                                    <option value=\"PI\">PI</option>\r\n");
      out.write("                                    <option value=\"PR\">PR</option>\r\n");
      out.write("                                    <option value=\"RJ\">RJ</option>\r\n");
      out.write("                                    <option value=\"RN\">RN</option>\r\n");
      out.write("                                    <option value=\"RS\">RS</option>\r\n");
      out.write("                                    <option value=\"RO\">RO</option>\r\n");
      out.write("                                    <option value=\"RR\">RR</option>\r\n");
      out.write("                                    <option value=\"SC\">SC</option>\r\n");
      out.write("                                    <option value=\"SE\">SE</option>\r\n");
      out.write("                                    <option value=\"SP\">SP</option>\r\n");
      out.write("                                    <option value=\"TO\">TO</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <select name=\"txtCidadeTitular\" id=\"txtCidadeTitular\"/>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div id='msgBairro' style=\"font:bold; color: #C50830; display:none;\">Bairro n&atilde;o\r\n");
      out.write("                                    informado\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div id='msgCidade' style=\"font:bold; color: #C50830; display:none;\">Cidade n&atilde;o\r\n");
      out.write("                                    informada\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div id='msgUf' style=\"font:bold; color: #C50830; display:none;\">UF n&atilde;o informado</div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"dialogRevisarCadastroAdicional\" title=\"Cadastro de Adicional\" style=\"display: none\">\r\n");
      out.write("        <form id=\"formAlteraCadastroAdicional\" name=\"formAlteraCadastroAdicional\"\r\n");
      out.write("              action=\"");
      if (_jspx_meth_portlet_005factionURL_005f7(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              method=\"POST\">\r\n");
      out.write("            <h3 align=\"center\">Campos n&atilde;o informados ou inv&aacute;lidos</h3>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <b>\r\n");
      out.write("                <div id=\"divRevisaCpf\" style=\"display: none\">\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f39(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    CPF &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaCpf\" maxlength=\"14\" onKeyPress=\"Mascara(this,Cpf);\" size=\"20\"/>\r\n");
      out.write("                    <div id=\"msgRevisaCpf\" style=\"color: #C50830\">&nbsp;CPF n&atilde;o informado</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaNome\" style=\"display: none\">\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f40(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Nome &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaNome\" size=\"40\" maxlength=\"30\"/>\r\n");
      out.write("                    <div id=\"msgRevisaNome\" style=\"color: #C50830\">&nbsp;Nome n&atilde;o informado ou inv&aacute;lido</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaDtNascimento\" style=\"display: none\">\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f41(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Data Nascimento &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaDtNascimento\" size=\"15\" maxlength=\"15\"\r\n");
      out.write("                           onKeyPress=\"Mascara(this,Data);\"/>\r\n");
      out.write("                    <div id=\"msgRevisaDtNascimento\" name=\"dtNascMsgVal\" style=\"color: #C50830\">&nbsp;Data Nascimento n&atilde;o\r\n");
      out.write("                        informada ou inv&aacute;lida\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaSexo\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f42(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Sexo &nbsp;\r\n");
      out.write("                    <select id=\"selectRevisaSexo\">\r\n");
      out.write("                        <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                        <option value=\"F\" label=\"Feminino\">F</option>\r\n");
      out.write("                        <option value=\"M\" label=\"Masculino\">M</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <div id=\"msgRevisaoSexo\" style=\"color: #C50830\">&nbsp;Sexo n&atilde;o informado</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaTpRelacionamento\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f43(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Tipo de Relacionamento &nbsp;\r\n");
      out.write("                    <select id=\"selectRevisaTpRelacionamento\">\r\n");
      out.write("                        <option value=\"0\">--</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f18(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <div id=\"msgRevisaoTpRelacionamento\" style=\"color: #C50830\">&nbsp;Tipo de Relacionamento n&atilde;o\r\n");
      out.write("                        informado\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaTpTelefone\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f44(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Tipo de Telefone &nbsp;\r\n");
      out.write("                    <select id=\"selectRevisaTpTelefone\">\r\n");
      out.write("                        <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                        <option value=\"1\" label=\"Residencial\">Residencial</option>\r\n");
      out.write("                        <option value=\"2\" label=\"Comercial\">Comercial</option>\r\n");
      out.write("                        <option value=\"3\" label=\"Celular\">Celular</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <div id=\"msgRevisaoTpTelefone\" style=\"color: #C50830\">&nbsp;Tipo telefone n&atilde;o informado</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaDDD\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f45(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    DDD &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaDDD\" onKeyPress=\"Mascara(this, Telefone);\" size=\"4\" maxlength=\"3\"/>\r\n");
      out.write("                    <div id=\"msgRevisaDDD\" style=\"color: #C50830\">&nbsp;DDD n&atilde;o informado ou inv&aacute;lido!</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaTelefone\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f46(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Telefone &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaTelefone\" onkeyup=\"Mascara(this, Telefone);\" maxlength=\"10\"/>\r\n");
      out.write("                    <div id=\"msgRevisaTelefone\" style=\"color: #C50830\">&nbsp;Telefone n&atilde;o informado ou inv&aacute;lido!</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaEmail\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f47(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Email &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaEmail\" size=\"40\" maxlength=\"100\"/>\r\n");
      out.write("                    <div id=\"msgRevisaEmail\" style=\"color: #C50830\">&nbsp;Email n&atilde;o informado ou inv&aacute;lido!</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaTpRelacionamentoAlteracao\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f48(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Tipo de Relacionamento &nbsp;\r\n");
      out.write("                    <select id=\"selectRevisaTpRelacionamentoAlteracao\">\r\n");
      out.write("                        <option value=\"0\">--</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f19(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <div id=\"msgRevisaoTpRelacionamentoAlteracao\" style=\"color: #C50830\">&nbsp;Tipo de Relacionamento\r\n");
      out.write("                        n&atilde;o informado\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("            </b>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    <div id=\"dialogRevisarAlteracaoAdicional\" title=\"Edi&ccedil;&atilde;o de Adicional\" style=\"display: none\">\r\n");
      out.write("        <form id=\"formAlteraAlteraAdicional\"\r\n");
      out.write("              action=\"");
      if (_jspx_meth_portlet_005factionURL_005f8(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("              method=\"POST\">\r\n");
      out.write("            <h3 align=\"center\">Campos n&atilde;o informados ou inv&aacute;lidos</h3>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <b>\r\n");
      out.write("                <div id=\"divRevisaNomeAlteracao\" style=\"display: none\">\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f49(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Nome &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaNomeAlteracao\" size=\"40\" maxlength=\"30\"/>\r\n");
      out.write("                    <div id=\"msgRevisaNomeAlteracao\" style=\"color: #C50830\">&nbsp;Nome n&atilde;o informado ou inv&aacute;lido!</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaDtNascimentoAlteracao\" style=\"display: none\">\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f50(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Data Nascimento &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaDtNascimentoAlteracao\" size=\"15\" maxlength=\"15\"\r\n");
      out.write("                           onKeyPress=\"Mascara(this,Data);\"/>\r\n");
      out.write("                    <div id=\"msgRevisaDtNascimentoAlteracao\" name=\"dtNascMsgVal\" style=\"color: #C50830\">&nbsp;Data\r\n");
      out.write("                        Nascimento n&atilde;o informada ou inv&aacute;lida\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaDDDAlteracao\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f51(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    DDD &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaDDDAlteracao\" onKeyPress=\"Mascara(this, Telefone);\" size=\"4\"\r\n");
      out.write("                           maxlength=\"3\"/>\r\n");
      out.write("                    <div id=\"msgRevisaDDDAlteracao\" style=\"color: #C50830\">&nbsp;DDD n&atilde;o informado ou inv&aacute;lido!</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id='divRevisaTelefoneAlteracao' style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f52(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Telefone &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaTelefoneAlteracao\" onkeyup=\"Mascara(this, Telefone);\"\r\n");
      out.write("                           maxlength=\"10\"/>\r\n");
      out.write("                    <div id=\"msgRevisaTelefoneAlteracao\" style=\"color: #C50830\">&nbsp;Telefone n&atilde;o informado ou\r\n");
      out.write("                        inv&aacute;lido!\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaEmailAlteracao\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f53(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Email &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaEmailAlteracao\" size=\"40\" maxlength=\"100\"/>\r\n");
      out.write("                    <div id=\"msgRevisaEmailAlteracao\" style=\"color: #C50830\">&nbsp;Email n&atilde;o informado ou inv&aacute;lido!\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaCpfAlteracao\" style=\"display: none\">\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f54(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    CPF &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaCpfAlteracao\" maxlength=\"14\" onKeyPress=\"Mascara(this,Cpf);\"\r\n");
      out.write("                           size=\"20\"/>\r\n");
      out.write("                    <div id=\"msgRevisaCpfAlteracao\" style=\"color: #C50830\">&nbsp;CPF n&atilde;o informado</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaIdClienteAlteracao\" style=\"display: none\">\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f55(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    &nbsp;\r\n");
      out.write("                    <input type=\"text\" id=\"txtRevisaIdClienteAlteracao\" maxlength=\"14\" onKeyPress=\"Mascara(this,Cpf);\"\r\n");
      out.write("                           size=\"20\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaTpTelefoneAlteracao\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f56(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Tipo de Telefone &nbsp;\r\n");
      out.write("                    <select id=\"selectRevisaTpTelefoneAlteracao\">\r\n");
      out.write("                        <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                        <option value=\"1\" label=\"Residencial\">Residencial</option>\r\n");
      out.write("                        <option value=\"2\" label=\"Comercial\">Comercial</option>\r\n");
      out.write("                        <option value=\"3\" label=\"Celular\">Celular</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <div id=\"msgRevisaoTpTelefoneAlteracao\" style=\"color: #C50830\">&nbsp;Tipo telefone n&atilde;o informado\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <div id=\"divRevisaSexoAlteracao\" style=\"display: none\">\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <img align=\"top\" src=\"");
      if (_jspx_meth_c_005furl_005f57(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    Sexo &nbsp;\r\n");
      out.write("                    <select id=\"selectRevisaSexoAlteracao\">\r\n");
      out.write("                        <option value=\"0\" selected=\"selected\">--</option>\r\n");
      out.write("                        <option value=\"F\" label=\"Feminino\">F</option>\r\n");
      out.write("                        <option value=\"M\" label=\"Masculino\">M</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <div id=\"msgRevisaoSexoAlteracao\" style=\"color: #C50830\">&nbsp;Sexo n&atilde;o informado</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("            </b>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function selectOpt(selecionado) {\r\n");
      out.write("        if (selecionado.value == 0) {\r\n");
      out.write("            document.getElementById(\"searchSeguradora\").style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("        } else if (selecionado.value == 1) {\r\n");
      out.write("            document.getElementById(\"selectTipoSubPerfilPBM\").style.display = \"block\";\r\n");
      out.write("            document.getElementById(\"searchSeguradora\").style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("        } else if (selecionado.value == 2) {\r\n");
      out.write("            document.getElementById(\"searchSeguradora\").style.display = \"block\";\r\n");
      out.write("            document.getElementById(\"selectTipoSubPerfilPBM\").style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("        } else if (selecionado.value == 4) {\r\n");
      out.write("            document.getElementById(\"selectTipoSubPerfilPBM\").style.display = \"none\";\r\n");
      out.write("            document.getElementById(\"searchSeguradora\").style.display = \"none\";\r\n");
      out.write("        } else {\r\n");
      out.write("            document.getElementById(\"selectTipoSubPerfilPBM\").style.display = \"none\";\r\n");
      out.write("            document.getElementById(\"searchSeguradora\").style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deletarProgIndustria(cdsPerfil, cdsCnpjCpf) {\r\n");
      out.write("        if (cdsCnpjCpf == null || cdsCnpjCpf == '') {\r\n");
      out.write("            jAlert(\"Cliente sem CPF, n\\u00e3o \\u00e9 poss\\u00edvel excluir perfil!\", \"Cadastro de Cliente\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var cdTipoPerfilCliente = 4;\r\n");
      out.write("        var perfil;\r\n");
      out.write("        $j(function () {\r\n");
      out.write("            perfil = $j($j(\"#tblCli tr\")[0]).find('span.perfilSpan').text();\r\n");
      out.write("        });\r\n");
      out.write("        document.location.href = '/portal/tc/clienteoperacoes/ClienteOperacoesWindow?page=mainview&action=1&cdsCnpjCpf=' + cdsCnpjCpf + '&cdsPerfil=' + cdsPerfil + '&cdTipoPerfilCliente=' + cdTipoPerfilCliente + '&perfil=' + perfil + '&acao=deletarProgIndustria';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deletarPlanoSaudeSeguradora(cdsPerfil, cdsCnpjCpf, perfilTipo) {\r\n");
      out.write("        if (cdsCnpjCpf == null || cdsCnpjCpf == '') {\r\n");
      out.write("            jAlert(\"Cliente sem CPF, n\\u00e3o \\u00e9 poss\\u00edvel excluir perfil!\", \"Cadastro de Cliente\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var acao = '&acao=deletarPlanoSaude';\r\n");
      out.write("        var cdPerfilTipo = 5;// PlanoSaude\r\n");
      out.write("        if ('SEGURADORA' == perfilTipo) {\r\n");
      out.write("            cdPerfilTipo = 2;\r\n");
      out.write("            acao = '&acao=deletarSeguradora';\r\n");
      out.write("        }\r\n");
      out.write("        else if ('PROGRAMA_INDUSTRIA_DESATIVADO' == perfilTipo) {\r\n");
      out.write("            cdPerfilTipo = 4;\r\n");
      out.write("            acao = '&acao=deletarProgIndustriaDes';\r\n");
      out.write("        }\r\n");
      out.write("        else if ('PROGRAMA_INDUSTRIA' == perfilTipo) {\r\n");
      out.write("            cdPerfilTipo = 8;\r\n");
      out.write("            acao = '&acao=deletarProgIndustria';\r\n");
      out.write("        }\r\n");
      out.write("        var perfil;\r\n");
      out.write("        $j(function () {\r\n");
      out.write("            perfil = $j($j(\"#tblCli tr\")[0]).find('span.perfilSpan').text();\r\n");
      out.write("        });\r\n");
      out.write("        document.location.href = '/portal/tc/clienteoperacoes/ClienteOperacoesWindow?page=mainview&action=1&cdsCnpjCpf=' + cdsCnpjCpf + '&cdsPerfil=' + cdsPerfil + '&cdTipoPerfilCliente=' + cdPerfilTipo + '&perfil=' + perfil + acao;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deletarPBM(cdsPerfil, cdsCnpjCpf) {\r\n");
      out.write("        if (cdsCnpjCpf == null || cdsCnpjCpf == '') {\r\n");
      out.write("            jAlert(\"Cliente sem CPF, n\\u00e3o \\u00e9 poss\\u00edvel excluir perfil!\", \"Cadastro de Cliente\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var cdTipoPerfilCliente = 1;\r\n");
      out.write("        var perfil;\r\n");
      out.write("        $j(function () {\r\n");
      out.write("            perfil = $j($j(\"#tblCli tr\")[0]).find('span.perfilSpan').text();\r\n");
      out.write("        });\r\n");
      out.write("        document.location.href = '/portal/tc/clienteoperacoes/ClienteOperacoesWindow?page=mainview&action=1&cdsCnpjCpf=' + cdsCnpjCpf + '&cdsPerfil=' + cdsPerfil + '&cdTipoPerfilCliente=' + cdTipoPerfilCliente + '&perfil=' + perfil + '&acao=deletarPBM';\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function gravarTipoPerfil() {\r\n");
      out.write("\r\n");
      out.write("        var cdsCnpjCpf = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("        if (cdsCnpjCpf == null || cdsCnpjCpf == '') {\r\n");
      out.write("            jAlert(\"Cliente sem CPF, n\\u00e3o \\u00e9 poss\\u00edvel inserir perfil!\", \"Cadastro de Cliente\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var selector = document.getElementById('selectTipoPerfil');\r\n");
      out.write("        var cdTipoPerfilCliente = selector[selector.selectedIndex].value;\r\n");
      out.write("\r\n");
      out.write("        if (cdTipoPerfilCliente == 1) {\r\n");
      out.write("            var selector1 = document.getElementById('selectTipoSubPerfilPBM');\r\n");
      out.write("            var cdsPerfil = selector1[selector1.selectedIndex].value;\r\n");
      out.write("            var dsPerfil = selector1[selector1.selectedIndex].text;\r\n");
      out.write("            if (cdsPerfil <= 0) {\r\n");
      out.write("                jAlert(\"Selecione uma op\\u00e7o\\u00e3!\", \"Cadastro de Cliente\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f20(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            $j(function () {\r\n");
      out.write("                perfil = $j($j(\"#tblCli tr\")[0]).find('span.perfilSpan').text();\r\n");
      out.write("            });\r\n");
      out.write("            document.location.href = '/portal/tc/clienteoperacoes/ClienteOperacoesWindow?page=mainview&action=1&cdsCnpjCpf=' + cdsCnpjCpf + '&cdsPerfil=' + cdsPerfil + '&cdTipoPerfilCliente=' + cdTipoPerfilCliente + '&dsPerfil=' + dsPerfil + '&perfil=' + perfil + '&acao=gravarPBM';\r\n");
      out.write("\r\n");
      out.write("        } else if (cdTipoPerfilCliente == 2) {\r\n");
      out.write("\r\n");
      out.write("            var cdsPerfil = $j('#valueSeguradora').val();\r\n");
      out.write("            var dsPerfil = $j('#searchSeguradora').val();\r\n");
      out.write("\r\n");
      out.write("            if (cdsPerfil <= 0) {\r\n");
      out.write("                jAlert(\"Selecione uma op\\u00e7o\\u00e3!\", \"Cadastro de Cliente\");\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            var tipo = cdsPerfil.split(\";\")[0];\r\n");
      out.write("            var cdsPerfilSplit = cdsPerfil.split(\";\")[1];\r\n");
      out.write("\r\n");
      out.write("            if (tipo == 2) {\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f21(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            else {\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f22(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $j(function () {\r\n");
      out.write("                perfil = $j($j(\"#tblCli tr\")[0]).find('span.perfilSpan').text();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            document.location.href = '/portal/tc/clienteoperacoes/ClienteOperacoesWindow?page=mainview&action=1&cdsCnpjCpf=' + cdsCnpjCpf + '&cdsPerfil=' + cdsPerfilSplit + '&cdTipoPerfilCliente=' + tipo + '&dsPerfil=' + dsPerfil + '&perfil=' + perfil + '&acao=gravarSeguradora';\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function populaDadosContatoCliente(clienteCadastro) {\r\n");
      out.write("        if (clienteCadastro != null && clienteCadastro != undefined) {\r\n");
      out.write("            document.getElementById('txtEmailAtualizacao').value = verificaNulo(clienteCadastro.cliente.email);\r\n");
      out.write("            // telefones\r\n");
      out.write("            if (clienteCadastro.telefones != null\r\n");
      out.write("                && clienteCadastro.telefones != undefined\r\n");
      out.write("                && clienteCadastro.telefones.length > 0) {\r\n");
      out.write("                var tpTel = new Array();\r\n");
      out.write("                var formNumDddAtualizacao = document.getElementById('numDddAtualizacao');\r\n");
      out.write("                var formNumTelAtualizacao = document.getElementById('numTelAtualizacao');\r\n");
      out.write("                var formNumDdd2Atualizacao = document.getElementById('numDdd2Atualizacao');\r\n");
      out.write("                var formNumTel2Atualizacao = document.getElementById('numTel2Atualizacao');\r\n");
      out.write("                for (cont = 0; cont < clienteCadastro.telefones.length; cont++) {\r\n");
      out.write("                    var ddd = clienteCadastro.telefones[cont].ddd;\r\n");
      out.write("                    var tel = clienteCadastro.telefones[cont].tel;\r\n");
      out.write("                    tpTel[cont] = clienteCadastro.telefones[cont].tpTel;\r\n");
      out.write("                    if (cont == 0) {\r\n");
      out.write("                        formNumDddAtualizacao.value = ddd;\r\n");
      out.write("                        formNumTelAtualizacao.value = tel;\r\n");
      out.write("                    }\r\n");
      out.write("                    if (cont == 1) {\r\n");
      out.write("                        formNumDdd2Atualizacao.value = ddd;\r\n");
      out.write("                        formNumTel2Atualizacao.value = tel;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                for (i = 1; i <= tpTel.length; i++) {\r\n");
      out.write("                    if (document.getElementById(\"tpTel\" + i + \"Atualizacao\") != null) {\r\n");
      out.write("                        var formtpTelAtualizacao = document.getElementById(\"tpTel\" + i + \"Atualizacao\");\r\n");
      out.write("                        formtpTelAtualizacao.value = tpTel[i - 1];\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function atualizarDadosContato() {\r\n");
      out.write("        var email = document.getElementById('txtEmailAtualizacao').value;\r\n");
      out.write("        var tpTel = document.getElementById('tpTel1Atualizacao').value;\r\n");
      out.write("        var numDdd = document.getElementById('numDddAtualizacao').value;\r\n");
      out.write("        var numTel = document.getElementById('numTelAtualizacao').value;\r\n");
      out.write("        if (email != null && email != \"\"\r\n");
      out.write("            && tpTel != null && tpTel != \"\"\r\n");
      out.write("            && numDdd != null && numDdd != \"\"\r\n");
      out.write("            && numTel != null && numTel != \"\") {\r\n");
      out.write("            $j(\"#formAtualizacaoDadosContato\").submit();\r\n");
      out.write("        } else {\r\n");
      out.write("            alert(\"Preencha os campos obrigat\\u00f3rios.\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<!-- SCRIPT PARA EXIBIR DIALOG DE ATUALIZACAO DE DADOS CADASTRAIS -->\r\n");
      out.write("<script>\r\n");
      out.write("    var atualizacaoDadosContato = '");
      if (_jspx_meth_c_005fout_005f58(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("    if (atualizacaoDadosContato == \"true\") {\r\n");
      out.write("        populaDadosContatoCliente(clienteCadastro)\r\n");
      out.write("        $(\"#dialogAtualizacaoDadosContato\").dialog({\r\n");
      out.write("            width: 450,\r\n");
      out.write("            height: 220,\r\n");
      out.write("            modal: true,\r\n");
      out.write("            buttons: {Salvar: atualizarDadosContato}\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $('#salvarAdicional').click(function () {\r\n");
      out.write("        var cpf = $('#numCpfAdicional').val();\r\n");
      out.write("        var nome = $j('#txtNomeAdicional').val().replace(/[áàâãÁÀÂÃ]/g, 'a').replace(/[éèêÉÈÊ]/g, 'e').replace(/[óòôõÒÓÔÕ]/g, 'o').replace(/[úùûÚÙÛ]/g, 'u').replace(/[çÇ]/g, 'c');\r\n");
      out.write("        var rg = $('#numRgAdicional').val();\r\n");
      out.write("        var dtNascimento = $('#dtNascAdicional').val();\r\n");
      out.write("        var sexo = $('#txtSexoAdicional').val();\r\n");
      out.write("        var tpRelacionamento = $('#txtTpRelacionamentoAdicional').val();\r\n");
      out.write("        var telefone = $('#numTelAdicional').val();\r\n");
      out.write("        var tpTelefone = $('#tpTelAdicional').val();\r\n");
      out.write("        var nrPrefixo = $('#nrPrefixoAdicional').val();\r\n");
      out.write("        var email = $('#emailAdicional').val();\r\n");
      out.write("        var idCliente = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0].idCliente == undefined ? 0 : listAdicional[0].idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("        var idClienteTitular = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\r\n");
      out.write("        var idClienteTitularDoAdicionalPesquisado = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0].idClienteTitular == undefined ? 0 : listAdicional[0].idClienteTitular}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("        if (idClienteTitularDoAdicionalPesquisado != null && idClienteTitularDoAdicionalPesquisado > 0) {\r\n");
      out.write("            jAlert('CPF j\\u00e1 cadastrado como adicional.', \"Cadastro de Cliente\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var retornoValidacao = validaInclusaoAdicional(cpf, nome, dtNascimento, sexo, tpRelacionamento, telefone, tpTelefone, nrPrefixo, email, idCliente, idClienteTitular, rg);\r\n");
      out.write("\r\n");
      out.write("        if (retornoValidacao == true) {\r\n");
      out.write("            var url = \"");
      if (_jspx_meth_portlet_005factionURL_005f9(_jspx_page_context))
        return;
      out.write("&acao=salvarAdicional&cpf=\" + cpf + \"&nome=\" + nome + \"&rg=\" + rg + \"&dtNascimento=\" + dtNascimento + \"&sexo=\" + sexo + \"&tpRelacionamento=\" + tpRelacionamento + \"&telefone=\" + telefone + \"&tpTelefone=\" + tpTelefone + \"&email=\" + email + \"&idCliente=\" + idCliente + \"&idClienteTitular=\" + idClienteTitular + \"&nrPrefixo=\" + nrPrefixo;\r\n");
      out.write("            document.location.href = url;\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function validaInclusaoAdicional(cpf, nome, dtNascimento, sexo, tpRelacionamento, telefone, tpTelefone, nrPrefixo, email, idCliente, idClienteTitular, rg) {\r\n");
      out.write("\r\n");
      out.write("        if ((cpf == \"\" || cpf == \" \") || (tpRelacionamento == 0) || (sexo == 0) || (nome == \"\" || nome == \" \") || (!checkNomeCadCliAdicional(nome)) || (dtNascimento == \"\" || dtNascimento == \" \") ||\r\n");
      out.write("            (tpTelefone == 0 || telefone.length <= 7) || (nrPrefixo == \"\" || nrPrefixo == \" \" || nrPrefixo.length < 2) || (telefone == \"\" || telefone == \" \") ||\r\n");
      out.write("            (email == \"\" || email == \" \")) {\r\n");
      out.write("\r\n");
      out.write("            montaDialogRevisaoAdicional(cpf, nome, dtNascimento, sexo, tpRelacionamento, telefone, tpTelefone, nrPrefixo, email, idCliente, idClienteTitular, rg);\r\n");
      out.write("            $j(\"#dialogRevisarCadastroAdicional\").dialog({\r\n");
      out.write("                width: \"600\",\r\n");
      out.write("                height: 500,\r\n");
      out.write("                modal: true,\r\n");
      out.write("                buttons: {Salvar: revisarCadastroAdicional, Cancelar: fecharDialogRevisaoAdicional}\r\n");
      out.write("            });\r\n");
      out.write("        } else {\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function checkNomeCadCliAdicional(nm) {\r\n");
      out.write("        var er = new RegExp(/^[A-Za-záàâãéèêíïóôõöúçÁÀÂÃÉÈÍÏÓÔÕÖÚÇ\\s]+$/);\r\n");
      out.write("        var ret = false;\r\n");
      out.write("\r\n");
      out.write("        if (typeof (nm) == \"string\") {\r\n");
      out.write("            if (er.test(nm) || (nm == \"\")) {\r\n");
      out.write("                ret = true;\r\n");
      out.write("            }\r\n");
      out.write("        } else if (typeof (nm) == \"object\") {\r\n");
      out.write("            if (er.test(nm.value) || (nm.value == \"\")) {\r\n");
      out.write("                ret = true;\r\n");
      out.write("            }\r\n");
      out.write("        } else {\r\n");
      out.write("            ret = false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return ret;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function fecharDialogRevisaoAdicional() {\r\n");
      out.write("        $(\"#dialogRevisarCadastroAdicional\").dialog('close');\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function montaDialogRevisaoAdicional(cpf, nome, dtNascimento, sexo, tpRelacionamento, telefone, tpTelefone, nrPrefixo, email, idCliente, idClienteTitular, rg) {\r\n");
      out.write("\r\n");
      out.write("        $j('#txtRevisaCpf').val(cpf);\r\n");
      out.write("        $j('#txtRevisaNome').val(nome).replace(/[áàâãÁÀÂÃ]/g, 'a').replace(/[éèêÉÈÊ]/g, 'e').replace(/[óòôõÒÓÔÕ]/g, 'o').replace(/[úùûÚÙÛ]/g, 'u').replace(/[çÇ]/g, 'c');\r\n");
      out.write("        $j('#txtRevisaDtNascimento').val(dtNascimento);\r\n");
      out.write("        $j('#selectRevisaSexo').val(sexo);\r\n");
      out.write("        $j('#selectRevisaTpRelacionamento').val(tpRelacionamento);\r\n");
      out.write("        $j('#selectRevisaTpTelefone').val(tpTelefone);\r\n");
      out.write("        $j('#txtRevisaDDD').val(nrPrefixo);\r\n");
      out.write("        $j('#txtRevisaTelefone').val(telefone);\r\n");
      out.write("        $j('#txtRevisaEmail').val(email);\r\n");
      out.write("\r\n");
      out.write("        escondeInputsDialogRevisaAdicional();\r\n");
      out.write("\r\n");
      out.write("        if (cpf == \"\" || cpf == \" \") {\r\n");
      out.write("            $('#divRevisaCpf').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (tpRelacionamento == 0) {\r\n");
      out.write("            $('#divRevisaTpRelacionamento').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (sexo == 0) {\r\n");
      out.write("            $('#divRevisaSexo').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if ((nome == \"\" || nome == \" \") || (!checkNomeCadCliAdicional(nome))) {\r\n");
      out.write("            $('#divRevisaNome').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (dtNascimento == \"\" || dtNascimento == \" \") {\r\n");
      out.write("            $('#divRevisaDtNascimento').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (tpTelefone == 0) {\r\n");
      out.write("            $('#divRevisaTpTelefone').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (nrPrefixo == \"\" || nrPrefixo == \" \" || nrPrefixo.length < 2) {\r\n");
      out.write("            $('#divRevisaDDD').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (telefone == \"\" || telefone == \" \" || telefone.length <= 7) {\r\n");
      out.write("            $('#divRevisaTelefone').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("        if (email == \"\" || email == \" \") {\r\n");
      out.write("            $('#divRevisaEmail').css('display', 'block');\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function revisarCadastroAdicional() {\r\n");
      out.write("        var cpf = $j('#txtRevisaCpf').val();\r\n");
      out.write("        var nome = $j('#txtRevisaNome').val().replace(/[áàâãÁÀÂÃ]/g, 'a').replace(/[éèêÉÈÊ]/g, 'e').replace(/[óòôõÒÓÔÕ]/g, 'o').replace(/[úùûÚÙÛ]/g, 'u').replace(/[çÇ]/g, 'c');\r\n");
      out.write("        var dtNascimento = $j('#txtRevisaDtNascimento').val();\r\n");
      out.write("        var sexo = $j('#selectRevisaSexo').val();\r\n");
      out.write("        var tpRelacionamento = $j('#selectRevisaTpRelacionamento').val();\r\n");
      out.write("        var tpTelefone = $j('#selectRevisaTpTelefone').val();\r\n");
      out.write("        var nrPrefixo = $j('#txtRevisaDDD').val();\r\n");
      out.write("        var telefone = $j('#txtRevisaTelefone').val();\r\n");
      out.write("        var email = $j('#txtRevisaEmail').val();\r\n");
      out.write("        var rg = $j('#numRgAdicional').val();\r\n");
      out.write("        var idCliente =");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0].idCliente == undefined ? 0 : listAdicional[0].idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("        var idClienteTitular =");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\r\n");
      out.write("        var retornoValidacao = validaInclusaoAdicionalDialog(cpf, nome, dtNascimento, sexo, tpRelacionamento, tpTelefone, nrPrefixo, telefone, email);\r\n");
      out.write("        if (retornoValidacao == true) {\r\n");
      out.write("            var url = \"");
      if (_jspx_meth_portlet_005factionURL_005f10(_jspx_page_context))
        return;
      out.write("&acao=salvarAdicional&cpf=\" + cpf + \"&nome=\" + nome + \"&rg=\" + rg + \"&dtNascimento=\" + dtNascimento + \"&sexo=\" + sexo + \"&tpRelacionamento=\" + tpRelacionamento + \"&telefone=\" + telefone + \"&tpTelefone=\" + tpTelefone + \"&email=\" + email + \"&idCliente=\" + idCliente + \"&idClienteTitular=\" + idClienteTitular + \"&nrPrefixo=\" + nrPrefixo;\r\n");
      out.write("            document.location.href = url;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function validaInclusaoAdicionalDialog(cpf, nome, dtNascimento, sexo, tpRelacionamento, tpTelefone, nrPrefixo, telefone, email) {\r\n");
      out.write("\r\n");
      out.write("        if (cpf == \"\" || cpf == \" \") {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (tpRelacionamento == 0) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (sexo == 0) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if ((nome == \"\" || nome == \" \") || (!checkNomeCadCliAdicional(nome))) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (dtNascimento == \"\" || dtNascimento == \" \") {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (tpTelefone == 0) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (nrPrefixo == \"\" || nrPrefixo == \" \" || nrPrefixo.length < 2) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (telefone == \"\" || telefone == \" \" || telefone.length <= 7) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        if (email == \"\" || email == \" \") {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function escondeInputsDialogRevisaAdicional() {\r\n");
      out.write("        $j('#divRevisaCpf').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaTpRelacionamento').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaSexo').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaNome').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaDtNascimento').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaTpTelefone').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaDDD').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaTelefone').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaEmail').css('display', 'none');\r\n");
      out.write("\r\n");
      out.write("        $j('#divRevisaCpfAlteracao').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaTpRelacionamentoAlteracao').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaSexoAlteracao').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaNomeAlteracao').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaDtNascimentoAlteracao').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaTpTelefoneAlteracao').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaDDDAlteracao').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaTelefoneAlteracao').css('display', 'none');\r\n");
      out.write("        $j('#divRevisaEmailAlteracao').css('display', 'none');\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function cadNovoEndTitular() {\r\n");
      out.write("        abrirDialogoEnderecoTitular();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function popularCampos() {\r\n");
      out.write("        populaEnderecoTitular();\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function excluirAdicional(idClienteAdicional) {\r\n");
      out.write("        dialogos.exibeInfo('Deseja realmente excluir o adicional do cliente?', {\r\n");
      out.write("            'Sim': function () {\r\n");
      out.write("                $j(this).dialog(\"close\");\r\n");
      out.write("                deletaAdicional(idClienteAdicional);\r\n");
      out.write("            },\r\n");
      out.write("            'Nao': function () {\r\n");
      out.write("                $j(this).dialog(\"close\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deletaAdicional(idClienteAdicional) {\r\n");
      out.write("        var url = \"");
      if (_jspx_meth_portlet_005factionURL_005f11(_jspx_page_context))
        return;
      out.write("&acao=excluirAdicional&idCliente=\" + idClienteAdicional;\r\n");
      out.write("        document.location.href = url;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function pupulaComboCidades() {\r\n");
      out.write("        cidades.splice(0);\r\n");
      out.write("        var URL = contextoUrl + \"AjaxServlet?acao=pesquisaCidades&uf=\" + $(\"#txtUfTitular\").val();\r\n");
      out.write("        funcaoDeRetornoAjax = callBackCidades;\r\n");
      out.write("        ajaxCall(URL);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function callBackCidades(ret) {\r\n");
      out.write("        if (ret == \"ERRO\") {\r\n");
      out.write("            jAlert(\"ERRO !!!\", \"Lista de cidades\");\r\n");
      out.write("        } else {\r\n");
      out.write("            ret = ret.replace(\"[\", \"\").replace(\"]\", \"\");\r\n");
      out.write("            cidades = ret.split(\",\");\r\n");
      out.write("            $('#txtCidadeTitular').find('option').remove().end().append('<option value=\"\">Selecione</option>').val(\"\");\r\n");
      out.write("            var select = document.getElementById('txtCidadeTitular');\r\n");
      out.write("            for (var i = 0; cidades.length > i; i++) {\r\n");
      out.write("                var opt = document.createElement('option');\r\n");
      out.write("                opt.value = cidades[i];\r\n");
      out.write("                opt.innerHTML = cidades[i];\r\n");
      out.write("                select.appendChild(opt);\r\n");
      out.write("                if (cidadeSeletedByCEP == cidades[i]) {\r\n");
      out.write("                    $('#txtCidadeTitular').find('option').remove().end().append('<option  value=\"' + cidadeSeletedByCEP + '\">' + cidadeSeletedByCEP + '</option>').val(cidadeSeletedByCEP);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $j(function () {\r\n");
      out.write("        if(isAderenciaRecompra){\r\n");
      out.write("            var chkRecompra = document.getElementById(\"chkRecompra\");\r\n");
      out.write("            var chkRecompraDefault = document.getElementById(\"chkRecompraDefault\");\r\n");
      out.write("\r\n");
      out.write("            if(chkRecompra != null && chkRecompraDefault != null){\r\n");
      out.write("                chkRecompra.checked = HasAderenciaRecompra;\r\n");
      out.write("                chkRecompraDefault.checked = HasAderenciaRecompra;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        var selectTipoEmissor = '");
      if (_jspx_meth_c_005fout_005f59(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("        document.getElementById('selectTipoEmissor').value = selectTipoEmissor;\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- FIM DO SCRIPT -->\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f38(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f39(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f44(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(8,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\r\n");
        out.write("<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
        out.write("<script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\r\n");
        out.write("<script type=\"text/javascript\" src=\"");
        if (_jspx_meth_c_005furl_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\" charset=\"UTF-8\"></script>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsp/clienteOperacoes.jsp(12,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/js/script-carrinho-autorizacoes.js");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(21,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/js/cadastro-ms-customer.js");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(22,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(22,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 'raia/' : 'drogasil/'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
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
    // /WEB-INF/jsp/clienteOperacoes.jsp(45,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.telefones != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    clienteCompleto.telefones = []\r\n");
        out.write("    ");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(47,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("telefone");
    // /WEB-INF/jsp/clienteOperacoes.jsp(47,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(47,4) '${cliente.telefones}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cliente.telefones}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/clienteOperacoes.jsp(47,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    tel = {\r\n");
          out.write("        'tpTel': '");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("',\r\n");
          out.write("        'ddd': '");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("',\r\n");
          out.write("        'idTelefone': '");
          if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("',\r\n");
          out.write("        'tel': '");
          if (_jspx_meth_c_005fout_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("'\r\n");
          out.write("    };\r\n");
          out.write("    clienteCompleto.telefones.push(tel);\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/clienteOperacoes.jsp(49,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.cdTipoTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/clienteOperacoes.jsp(50,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrPrefixo}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/clienteOperacoes.jsp(51,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.idTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/clienteOperacoes.jsp(52,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f5.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(74,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${versaoMsCustomerSemEntradaDados}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(80,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        $j('#ficharioCliente').mudarTab(\"Adicional\");\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(83,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty mensagemAdicionalSucesso}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        dialogos.exibeInfo('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mensagemAdicionalSucesso}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</br> Deseja imprimir a etiqueta do cart&atilde;o?', {\r\n");
        out.write("            'Sim': function () {\r\n");
        out.write("                $j(this).dialog(\"close\");\r\n");
        out.write("                printAdicional();\r\n");
        out.write("            },\r\n");
        out.write("            'Nao': function () {\r\n");
        out.write("                $j(this).dialog(\"close\");\r\n");
        out.write("            }\r\n");
        out.write("        });\r\n");
        out.write("        $j('#ficharioCliente').mudarTab(\"Adicional\");\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(96,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty mensagemAdicionalAlteradoSucesso}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        jAlert('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mensagemAdicionalAlteradoSucesso}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("', \"Cadastro de Adicional do Cliente\");\r\n");
        out.write("        $j('#ficharioCliente').mudarTab(\"Adicional\");\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(101,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty mensagemExclusaoAdicionalSucesso}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        jAlert('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mensagemExclusaoAdicionalSucesso}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("', \"Cadastro de Adicional do Cliente\");\r\n");
        out.write("        $j('#ficharioCliente').mudarTab(\"Adicional\");\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(106,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty mensagemAdicionalErro}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        jAlert('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mensagemAdicionalErro}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("', \"Cadastro de Adicional do Cliente\");\r\n");
        out.write("        $j('#ficharioCliente').mudarTab(\"Adicional\");\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f6.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(122,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
    if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f7.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(126,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f7 = _jspx_th_c_005fout_005f7.doStartTag();
    if (_jspx_th_c_005fout_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f8.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(181,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f8 = _jspx_th_c_005fout_005f8.doStartTag();
    if (_jspx_th_c_005fout_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f9.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(182,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.cdCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f9 = _jspx_th_c_005fout_005f9.doStartTag();
    if (_jspx_th_c_005fout_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f10.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(182,69) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.dgCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f10 = _jspx_th_c_005fout_005f10.doStartTag();
    if (_jspx_th_c_005fout_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f10);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(183,22) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM");
    // /WEB-INF/jsp/clienteOperacoes.jsp(183,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataCadastro}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f11.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(184,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.rg}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f11 = _jspx_th_c_005fout_005f11.doStartTag();
    if (_jspx_th_c_005fout_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f12.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(185,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cpf}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f12 = _jspx_th_c_005fout_005f12.doStartTag();
    if (_jspx_th_c_005fout_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f13.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(186,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.tipoCartao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f13 = _jspx_th_c_005fout_005f13.doStartTag();
    if (_jspx_th_c_005fout_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f14.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(203,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.nrCartaoClienteLogomarca}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f14 = _jspx_th_c_005fout_005f14.doStartTag();
    if (_jspx_th_c_005fout_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f15 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f15.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(214,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f15.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${versaoImpressoraBrother}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f15 = _jspx_th_c_005fout_005f15.doStartTag();
    if (_jspx_th_c_005fout_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f15);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(226,22) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setPattern("dd/MM");
    // /WEB-INF/jsp/clienteOperacoes.jsp(226,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicionais[0].dataCadastro}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f0 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f0.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f0 = _jspx_th_portlet_005factionURL_005f0.doStartTag();
    if (_jspx_th_portlet_005factionURL_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f0);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f1 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f1.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f1 = _jspx_th_portlet_005factionURL_005f1.doStartTag();
    if (_jspx_th_portlet_005factionURL_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f1);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f2 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f2.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f2 = _jspx_th_portlet_005factionURL_005f2.doStartTag();
    if (_jspx_th_portlet_005factionURL_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(574,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(574,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(574,7) '${populaComboPBM}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${populaComboPBM}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    // populaComboPBM.push({ cdPbm: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.cdPbm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\", dsPbm: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.dsPbm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"})\r\n");
          out.write("    // ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(579,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("item");
    // /WEB-INF/jsp/clienteOperacoes.jsp(579,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(579,4) '${requestScope['populaComboPlanoDeSaudeSeguradora']}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope['populaComboPlanoDeSaudeSeguradora']}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    saudeSeguradoras.push({label: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', value: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.cdChave}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'});\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(586,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${limpaTela == null && CADASTRO_OK == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fif_005f7, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("    ");
        if (_jspx_meth_c_005fchoose_005f1(_jspx_th_c_005fif_005f7, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/jsp/clienteOperacoes.jsp(588,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erroAlteracaoCliente != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <script>\r\n");
        out.write("                jAlert('");
        if (_jspx_meth_c_005fout_005f16(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("', \"Cadastro de Cliente\");\r\n");
        out.write("            </script>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/jsp/clienteOperacoes.jsp(590,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f16.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${erroAlteracaoCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f16 = _jspx_th_c_005fout_005f16.doStartTag();
    if (_jspx_th_c_005fout_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fwhen_005f12(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(596,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("            <!-- BEGIN CONTENT PERFIL -->\r\n");
        out.write("            ");
        if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_005fif_005f9(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("            <script src=\"");
        if (_jspx_meth_c_005furl_005f7(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\"></script>\r\n");
        out.write("\r\n");
        out.write("            <div id=\"perfil-content\"></div>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("            <!-- BEGIN TABS CADASTRO -->\r\n");
        out.write("            <div id=\"main\" style=\"display: none\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("            <script>\r\n");
        out.write("            \tvar lojaFilialVersaoCustomerMS = '");
        if (_jspx_meth_c_005fout_005f17(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("                var versaoMsCustomerSemEntradaDados = '");
        if (_jspx_meth_c_005fout_005f18(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\r\n");
        out.write("                if(lojaFilialVersaoCustomerMS == 'true' && versaoMsCustomerSemEntradaDados == 'false'){\r\n");
        out.write("        \t\t\tvar cpf = clienteCompleto.cliente.cpf;\r\n");
        out.write("        \t\t\tvar idCliente = clienteCompleto.cliente.idCliente;\r\n");
        out.write("    \t\t\t\tdocument.location.href= '/portal/tc/cadcli/CadastrarClienteWindow?action=1&cpfParam=' + cpf + '&idCliente=' + idCliente;\r\n");
        out.write("                } else {\r\n");
        out.write("                    document.querySelector('#main').setAttribute('style', 'display:block; width: 95%')\r\n");
        out.write("                }\r\n");
        out.write("            </script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                <div align=\"left\">\r\n");
        out.write("                    <table width=\"95%\">\r\n");
        out.write("                        <tr>\r\n");
        out.write("                            <td align=\"left\">\r\n");
        out.write("                                <h1>Cadastro de Cliente</h1>\r\n");
        out.write("                            </td>\r\n");
        out.write("                            <td align=\"right\" rowspan=\"2\">\r\n");
        out.write("                                <input id=\"txtDtCadastramento\" name=\"txtDtCadastramento\" disabled=\"disabled\"\r\n");
        out.write("                                       style=\"border: none;width: 47%; float: right; font-size: 11px; font-weight: bold; color: black; width: 500px\"/>\r\n");
        out.write("                            </td>\r\n");
        out.write("                        </tr>\r\n");
        out.write("                    </table>\r\n");
        out.write("                </div>\r\n");
        out.write("                <div id=\"ficharioCliente\" style=\"height: 250; width: 800px\">\r\n");
        out.write("                    <div id=\"Titular\" class=\"abaConteudo ");
        if (_jspx_meth_c_005fout_005f19(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\" style=\"height: 100%;\">\r\n");
        out.write("                        <br/>\r\n");
        out.write("                        <form id=\"formAlteraCadastro\" name=\"formAlteraCadastro\"\r\n");
        out.write("                              action=\"");
        if (_jspx_meth_portlet_005factionURL_005f3(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\"\r\n");
        out.write("                              method=\"POST\">\r\n");
        out.write("                            <input type=\"hidden\" class=\"acao\" name=\"acao\" value=\"ALTERACADASTRO\"/>\r\n");
        out.write("                            <input type=\"hidden\" name=\"realCpf\" id=\"realCpf\">\r\n");
        out.write("                            <input type=\"hidden\" name=\"searchString\" id=\"searchString\"/>\r\n");
        out.write("                            <input type=\"hidden\" name=\"origemDados\" id=\"origemDados\"/>\r\n");
        out.write("                            <input type=\"hidden\" name=\"cdCliente\" id=\"cdCliente\"/>\r\n");
        out.write("                            <input type=\"hidden\" name=\"cdTipoCartao\" id=\"cdTipoCartao\"/>\r\n");
        out.write("                            <input type=\"hidden\" name=\"dgCliente\" id=\"dgCliente\"/>\r\n");
        out.write("                            <input type=\"hidden\" name=\"tipoCartao\" id=\"tipoCartao\"/>\r\n");
        out.write("                            <input type=\"hidden\" name=\"idCliente\" id=\"idCliente\"/>\r\n");
        out.write("                            <input type=\"hidden\" name=\"chkRecompraDefault\" id=\"chkRecompraDefault\"/>\r\n");
        out.write("\r\n");
        out.write("                            <div class=\"titleSection\">\r\n");
        out.write("                                <b>\r\n");
        out.write("                                    <i>DADOS PESSOAIS</i>\r\n");
        out.write("                                </b>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <br/>\r\n");
        out.write("                            <div>\r\n");
        out.write("                                <table width='60%'>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>CPF</td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f8(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Nome\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"text\" name=\"numCpf\" id=\"numCpf\" readOnly=\"true\" size=\"20\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"text\" name=\"txtNome\" id=\"txtNome\" size=\"40\" maxlength=\"30\" onkeypress=\"enableSave();\" onkeyup=\"return alteraMinusculasNovo(this);\"\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_005fif_005f10(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write(" />\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr style=\"height:15px;\">\r\n");
        out.write("                                        <td></td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <div class=\"error\" style=\"width: 379px;\">\r\n");
        out.write("                                                <span id=\"error-nome\"></span>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div>\r\n");
        out.write("                                <table width='60%'>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>RG</td>\r\n");
        out.write("                                        <td>Emissor</td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f9(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Data Nascimento\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            Sexo\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>Benef&iacute;cio</td>\r\n");
        out.write("                                        <td>Pensionista</td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"text\" name=\"numRg\" id=\"numRg\"\r\n");
        out.write("                                                   onKeyPress=\"Mascara(this,Integer); enableSave();\" size=\"12\"\r\n");
        out.write("                                                   maxlength=\"10\"\r\n");
        out.write("                                                   ");
        if (_jspx_meth_c_005fif_005f11(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write(" />\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<select style=\"width: 100px;\" id=\"selectTipoEmissor\" name=\"selectTipoEmissor\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f12(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write(">\r\n");
        out.write("                                                <option value=\"0\" selected=\"selected\">----Selecione----</option>\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </select>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_005fchoose_005f2(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <select id=\"txtSexo\" name=\"txtSexo\" onchange=\"enableSave();\" ");
        if (_jspx_meth_c_005fif_005f13(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write(">\r\n");
        out.write("                                                <option value=\"I\" selected=\"selected\">--</option>\r\n");
        out.write("                                                <option value=\"F\" label=\"Feminino\">F</option>\r\n");
        out.write("                                                <option value=\"M\" label=\"Masculino\">M</option>\r\n");
        out.write("                                            </select>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"text\" name=\"beneficio\" id=\"beneficio\"\r\n");
        out.write("                                                   onKeyPress=\"Mascara(this, Beneficio); enableSave();\" size=\"15\"\r\n");
        out.write("                                                   maxlength=\"13\" ");
        if (_jspx_meth_c_005fif_005f14(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"checkbox\" name=\"chkInss\" id=\"chkInss\" onclick=\"enableSave();\"\r\n");
        out.write("                                            \t");
        if (_jspx_meth_c_005fif_005f15(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr  style=\"height:15px;\">\r\n");
        out.write("                                        <td colspan=\"2\">\r\n");
        out.write("                                            <div class=\"error\" style=\"width: 125px;\">\r\n");
        out.write("                                                <span id=\"error-rg\"></span>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <br/>\r\n");
        out.write("                            <div class=\"titleSection\">\r\n");
        out.write("                                <b>\r\n");
        out.write("                                    <i>DADOS DE CONTATO</i>\r\n");
        out.write("                                </b>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <br/>\r\n");
        out.write("                            <div>\r\n");
        out.write("                                <table width='60%'>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td nowrap>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f10(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Tipo Telefone\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <img align=\"left\" src=\"");
        if (_jspx_meth_c_005furl_005f11(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            DDD\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f12(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Telefone\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td nowrap>Tipo Telefone</td>\r\n");
        out.write("                                        <td>DDD</td>\r\n");
        out.write("                                        <td>Telefone</td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <select id=\"tpTel1\" name=\"tpTel1\" onchange=\"enableSave();\">\r\n");
        out.write("                                                <option value=\"0\" selected=\"selected\">--</option>\r\n");
        out.write("                                                <option value=\"1\" label=\"Residencial\">Residencial</option>\r\n");
        out.write("                                                <option value=\"2\" label=\"Comercial\">Comercial</option>\r\n");
        out.write("                                                <option value=\"3\" label=\"Celular\">Celular</option>\r\n");
        out.write("                                                <option value=\"8\" label=\"Celular LGPD\">Celular LGPD</option>\r\n");
        out.write("                                            </select>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"text\" name=\"numDdd\" id=\"numDdd\"\r\n");
        out.write("                                                   onKeyPress=\"Mascara(this, Telefone); enableSave();\" size=\"4\"\r\n");
        out.write("                                                   maxlength=\"2\" onblur=\"validarDDDNovo(this)\" />\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"text\" name=\"numTel\" id=\"numTel\"\r\n");
        out.write("                                                   onKeyPress=\"Mascara(this, Telefone); enableSave();\" size=\"13\"\r\n");
        out.write("                                                   maxlength=\"10\"  onblur=\"validarTelefoneNovo(1, $('#tpTel1 option:selected').text() == 'Celular' ? true : false)\" />\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <select id=\"tpTel2\" name=\"tpTel2\" onchange=\"enableSave();\">\r\n");
        out.write("                                                <option value=\"0\" selected=\"selected\">--</option>\r\n");
        out.write("                                                <option value=\"1\" label=\"Residencial\">Residencial</option>\r\n");
        out.write("                                                <option value=\"2\" label=\"Comercial\">Comercial</option>\r\n");
        out.write("                                                <option value=\"3\" label=\"Celular\">Celular</option>\r\n");
        out.write("                                                <option value=\"8\" label=\"Celular LGPD\">Celular LGPD</option>\r\n");
        out.write("                                            </select>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"text\" name=\"numDdd2\" id=\"numDdd2\"\r\n");
        out.write("                                                   onKeyPress=\"Mascara(this, Telefone); enableSave();\" size=\"4\"\r\n");
        out.write("                                                   maxlength=\"3\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"text\" name=\"numTel2\" id=\"numTel2\"\r\n");
        out.write("                                                   onKeyPress=\"Mascara(this, Telefone); enableSave();\" size=\"13\"\r\n");
        out.write("                                                   maxlength=\"10\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td colspan=\"3\">\r\n");
        out.write("                                            <div class=\"error\" style=\"width: 220px; max-width: 220px;\">\r\n");
        out.write("                                                <span id=\"error-numTel\" name=\"error-numTel\"/>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                                <table width='60%'>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f13(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Email\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"text\" name=\"email\" id=\"email\" size=\"65\" maxlength=\"50\"\r\n");
        out.write("                                                   onkeypress=\"enableSave();\" onkeyup=\"validarEmailNovo()\"\r\n");
        out.write("                                                   ");
        if (_jspx_meth_c_005fif_005f16(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write(" />\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr style=\"height:15px;\">\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <div class=\"error\" style=\"width: 156px; max-width: 156px;\">\r\n");
        out.write("                                                <span id=\"error-email\" name=\"error-email\"/>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            </br>\r\n");
        out.write("                            <div class=\"titleSection\">\r\n");
        out.write("                                <b>\r\n");
        out.write("                                    <i>ENDERE&Ccedil;O</i>\r\n");
        out.write("                                </b>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <br/>\r\n");
        out.write("                            <div>\r\n");
        out.write("                                <table width=\"70%\">\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <th>Tipo</th>\r\n");
        out.write("                                        <th>CEP</th>\r\n");
        out.write("                                        <th>Logradouro</th>\r\n");
        out.write("                                        <th>N&uacute;mero</th>\r\n");
        out.write("                                        <th>Complemento</th>\r\n");
        out.write("                                        <th>Bairro</th>\r\n");
        out.write("                                        <th>Cidade</th>\r\n");
        out.write("                                        <th>UF</th>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td style=\"display: none\">\r\n");
        out.write("                                            <input id=\"tpEnd\" name=\"tpEnd\" onkeypress=\"enableSave();\"/>\r\n");
        out.write("                                            <input name=\"numCep\" id=\"numCep\" onkeypress=\"enableSave();\"/>\r\n");
        out.write("                                            <input name=\"txtLogra\" id=\"txtLogra\" onkeypress=\"enableSave();\">\r\n");
        out.write("                                            <input name=\"numNumero\" id=\"numNumero\" onkeypress=\"enableSave();\">\r\n");
        out.write("                                            <input name=\"txtCompl\" id=\"txtCompl\" onkeypress=\"enableSave();\">\r\n");
        out.write("                                            <input name=\"txtBairro\" id=\"txtBairro\" onkeypress=\"enableSave();\">\r\n");
        out.write("                                            <input name=\"txtCidade\" id=\"txtCidade\" onkeypress=\"enableSave();\">\r\n");
        out.write("                                            <input name=\"txtUf\" id=\"txtUf\" onkeypress=\"enableSave();\">\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td nowrap style=\"font-weight: normal\" id=\"tpEnd1\" name=\"tpEnd1\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td nowrap style=\"font-weight: normal\" name=\"numCep1\" id=\"numCep1\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td nowrap style=\"font-weight: normal\" name=\"txtLogra1\" id=\"txtLogra1\"></td>\r\n");
        out.write("                                        <td nowrap style=\"font-weight: normal\" name=\"numNumero1\" id=\"numNumero1\"></td>\r\n");
        out.write("                                        <td nowrap style=\"font-weight: normal\" name=\"txtCompl1\" id=\"txtCompl1\"></td>\r\n");
        out.write("                                        <td nowrap style=\"font-weight: normal\" name=\"txtBairro1\" id=\"txtBairro1\"></td>\r\n");
        out.write("                                        <td nowrap style=\"font-weight: normal\" name=\"txtCidade1\" id=\"txtCidade1\"></td>\r\n");
        out.write("                                        <td nowrap style=\"font-weight: normal\" name=\"txtUf1\" id=\"txtUf1\"></td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                                <br>\r\n");
        out.write("                                <table width='70%'>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td nowrap>\r\n");
        out.write("                                            <input type=\"checkbox\" name=\"chkEmail\" id=\"chkEmail\"\r\n");
        out.write("                                                   style=\"margin-left: 5px;\" onclick=\"enableSave();\"/>\r\n");
        out.write("                                            <label for=\"chkEmail\">Aceito Receber Informa&ccedil;&otilde;es e Promo&ccedil;&otilde;es</label>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr id=\"tdChkRecompra\" style=\"display: none\">\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input type=\"checkbox\" name=\"chkRecompra\" id=\"chkRecompra\" style=\"margin-left: 5px;\"/>\r\n");
        out.write("                                            <label for=\"chkRecompra\">Ativar Lembretes de Recompra (somente clientes do programa de uso cont&iacute;nuo)</label>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td style=\"color: #C50830\">\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f14(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Preenchimento obrigat&oacute;rio\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td nowrap style=\"float: right; width: 340px\">\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_005fchoose_005f3(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_005fif_005f17(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </form>\r\n");
        out.write("                    </div>\r\n");
        out.write("\r\n");
        out.write("                    <input type=\"hidden\" name=\"idCustomerMongo\" id=\"idCustomerMongo\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCustomerMongo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\r\n");
        out.write("                    <br/>\r\n");
        out.write("                    ");
        if (_jspx_meth_c_005fif_005f18(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            </div>\r\n");
        out.write("            <!-- END TABS CADASTRO -->\r\n");
        out.write("\r\n");
        out.write("            <script>\r\n");
        out.write("                clientePesquisado = null;\r\n");
        out.write("                enderecoPesquisado = null;\r\n");
        out.write("                telefonesPesquisados = new Array();\r\n");
        out.write("\r\n");
        out.write("            </script>\r\n");
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_005fif_005f28(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_005fif_005f29(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_005fif_005f30(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_005fif_005f31(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("            <script>\r\n");
        out.write("                clienteCadastro = {\r\n");
        out.write("                    'cliente': clientePesquisado,\r\n");
        out.write("                    'endereco': enderecoPesquisado,\r\n");
        out.write("                    'telefones': telefonesPesquisados\r\n");
        out.write("                };\r\n");
        out.write("                populaCliente(clienteCadastro);\r\n");
        out.write("            </script>\r\n");
        out.write("             \r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(600,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <link rel=\"stylesheet\" href=\"");
        if (_jspx_meth_c_005furl_005f3(_jspx_th_c_005fif_005f8, _jspx_page_context))
          return true;
        out.write("\" />\r\n");
        out.write("                <link rel=\"stylesheet\" href=\"");
        if (_jspx_meth_c_005furl_005f4(_jspx_th_c_005fif_005f8, _jspx_page_context))
          return true;
        out.write("\" />\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /WEB-INF/jsp/clienteOperacoes.jsp(601,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/css/raia/perfilCliente.css");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /WEB-INF/jsp/clienteOperacoes.jsp(602,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/css/raia/viewLgpd.css");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(604,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <link rel=\"stylesheet\" href=\"");
        if (_jspx_meth_c_005furl_005f5(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\" />\r\n");
        out.write("                <link rel=\"stylesheet\" href=\"");
        if (_jspx_meth_c_005furl_005f6(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\" />\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /WEB-INF/jsp/clienteOperacoes.jsp(605,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/css/drogasil/perfilCliente.css");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /WEB-INF/jsp/clienteOperacoes.jsp(606,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/css/drogasil/viewLgpd.css");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(609,25) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f7.setValue("/js/script-perfil-cliente.js");
    int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
    if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f17 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(619,47) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f17.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoCustomerMS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f17 = _jspx_th_c_005fout_005f17.doStartTag();
    if (_jspx_th_c_005fout_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f17);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(620,55) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f18.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${versaoMsCustomerSemEntradaDados}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f18 = _jspx_th_c_005fout_005f18.doStartTag();
    if (_jspx_th_c_005fout_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(648,57) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f19.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(LOGO_MARCA == '1') ? 'raia' : 'drogasil' }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f19 = _jspx_th_c_005fout_005f19.doStartTag();
    if (_jspx_th_c_005fout_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f19);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f3 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    int _jspx_eval_portlet_005factionURL_005f3 = _jspx_th_portlet_005factionURL_005f3.doStartTag();
    if (_jspx_eval_portlet_005factionURL_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_portlet_005fparam_005f0(_jspx_th_portlet_005factionURL_005f3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_portlet_005factionURL_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_portlet_005factionURL_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f3);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005factionURL_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag _jspx_th_portlet_005fparam_005f0 = (org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag) _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag.class);
    _jspx_th_portlet_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f3);
    // /WEB-INF/jsp/clienteOperacoes.jsp(651,57) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setName("page");
    // /WEB-INF/jsp/clienteOperacoes.jsp(651,57) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setValue("mainview");
    int _jspx_eval_portlet_005fparam_005f0 = _jspx_th_portlet_005fparam_005f0.doStartTag();
    if (_jspx_th_portlet_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(675,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f8.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
    if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(685,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${null != cliente.lastUpdateSource && cliente.lastUpdateSource != 'TC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("readonly");
        int evalDoAfterBody = _jspx_th_c_005fif_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(704,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f9.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
    if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(718,51) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${null != cliente.lastUpdateSource && cliente.lastUpdateSource != 'TC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("readonly");
        int evalDoAfterBody = _jspx_th_c_005fif_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(722,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${null != cliente.lastUpdateSource && cliente.lastUpdateSource != 'TC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(724,48) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("emissor");
    // /WEB-INF/jsp/clienteOperacoes.jsp(724,48) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(724,48) '${comboEmissor}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${comboEmissor}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emissor}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_005fout_005f20(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("</option>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/jsp/clienteOperacoes.jsp(725,79) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f20.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emissor}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f20 = _jspx_th_c_005fout_005f20.doStartTag();
    if (_jspx_th_c_005fout_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
    if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    // /WEB-INF/jsp/clienteOperacoes.jsp(731,48) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdTipoCadastramentoCliente == 11 && obrigaCpf == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <input type=\"text\" name=\"dtNasc\" id=\"dtNasc\" size=\"15\"\r\n");
        out.write("                                                           onkeypress=\"Mascara(this, Data); enableSave();\"\r\n");
        out.write("                                                           maxlength=\"10\"/>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <input type=\"text\" name=\"dtNasc\" id=\"dtNasc\" readOnly=\"true\"\r\n");
        out.write("                                                           size=\"15\" onkeypress=\"enableSave();\"/>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(743,105) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${null != cliente.lastUpdateSource && cliente.lastUpdateSource != 'TC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
    if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(752,66) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${null != cliente.lastUpdateSource && cliente.lastUpdateSource != 'TC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("readonly");
        int evalDoAfterBody = _jspx_th_c_005fif_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(756,45) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${null != cliente.lastUpdateSource && cliente.lastUpdateSource != 'TC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
    if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(779,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f10.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
    if (_jspx_th_c_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(783,67) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f11.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f11 = _jspx_th_c_005furl_005f11.doStartTag();
    if (_jspx_th_c_005furl_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(787,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f12.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f12 = _jspx_th_c_005furl_005f12.doStartTag();
    if (_jspx_th_c_005furl_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(845,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f13.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f13 = _jspx_th_c_005furl_005f13.doStartTag();
    if (_jspx_th_c_005furl_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(853,51) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${null != cliente.lastUpdateSource && cliente.lastUpdateSource != 'TC'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("readonly");
        int evalDoAfterBody = _jspx_th_c_005fif_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(926,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f14.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f14 = _jspx_th_c_005furl_005f14.doStartTag();
    if (_jspx_th_c_005furl_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    int _jspx_eval_c_005fchoose_005f3 = _jspx_th_c_005fchoose_005f3.doStartTag();
    if (_jspx_eval_c_005fchoose_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_005fwhen_005f3(_jspx_th_c_005fchoose_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_005fwhen_005f4(_jspx_th_c_005fchoose_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
    // /WEB-INF/jsp/clienteOperacoes.jsp(931,48) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdTipoCadastramentoCliente != 11}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
    if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <input id=\"btCad\" type=\"button\" class=\"btnPadrao\" value=\"Salvar\"\r\n");
        out.write("                                                           onclick=\"alteraCliente();\" style=\"float: left;\"/>\r\n");
        out.write("                                                    <input type=\"button\" class=\"btnPadrao\" value=\"Novo endere&ccedil;o\"\r\n");
        out.write("                                                           id=\"novoEndereco\" onclick=\"cadNovoEndTitular()\"\r\n");
        out.write("                                                           style=\"float: left;\"/>\r\n");
        out.write("                                                    <input type=\"button\" class=\"btnPadrao\" name=\"printCartaoTitular\"\r\n");
        out.write("                                                           id=\"printCartaoTitular\" value=\"Etiq. Cart&atilde;o\"\r\n");
        out.write("                                                           onclick=\"printTitular('CARTAO')\" style=\"float: left;\"/>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
    // /WEB-INF/jsp/clienteOperacoes.jsp(941,48) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdTipoCadastramentoCliente == 11 && obrigaCpf == 1 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
    if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <input type=\"button\" class=\"btnPadrao\" name=\"printUniversRaiaMed\"\r\n");
        out.write("                                                           id=\"printUniversRaiaMed\" value=\"Etiq. Cart&atilde;o\"\r\n");
        out.write("                                                           onclick=\"printCartaoRdMed()\" style=\"float: left;\"/>\r\n");
        out.write("                                                    <input id=\"btCad\" type=\"button\" class=\"btnPadrao\" value=\"Salvar\"\r\n");
        out.write("                                                           onclick=\"alteraCliente();\" style=\"float: left;\"/>\r\n");
        out.write("                                                    <input type=\"button\" class=\"btnPadrao\" value=\"Novo endere&ccedil;o\"\r\n");
        out.write("                                                           id=\"novoEndereco\" onclick=\"cadNovoEndTitular()\"\r\n");
        out.write("                                                           style=\"float: left;\"/>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    <h4 style=\"color: red;\">* Os dados do cadastro Univers n&atilde;o podem ser\r\n");
        out.write("                                                        alterados, <br/>Para atualizar os dados do cliente fa&ccedil;a a\r\n");
        out.write("                                                        identifica&ccedil;&atilde;o pelo CPF</h4>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(957,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${null != cliente.lastUpdateSource && cliente.lastUpdateSource != 'TC' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
    if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            \t<br/><br/>\r\n");
        out.write("                                                <h4 style=\"color: red;\">*Os campos bloqueados s&oacute; podem ser alterados nos canais App,Site ou Stix.</h4>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f17);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(971,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdTipoCadastramentoCliente != 11}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f18 = _jspx_th_c_005fif_005f18.doStartTag();
    if (_jspx_eval_c_005fif_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <div id=\"Adicional\" class=\"abaConteudo ");
        if (_jspx_meth_c_005fout_005f21(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"\r\n");
        out.write("                         style=\"height: 403px; display: none; overflow: hidden; overflow-x:auto;overflow-y:auto\">\r\n");
        out.write("                        <div>\r\n");
        out.write("                            <div class=\"titleSection\">\r\n");
        out.write("                                <b>\r\n");
        out.write("                                    <i>DADOS PESSOAIS</i>\r\n");
        out.write("                                </b>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <br/>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <div>\r\n");
        out.write("                            <table width='60%'>\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <td>CPF</td>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f15(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                        Nome\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        <input type=\"text\"\r\n");
        out.write("                                               value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0] != null ? listAdicional[0].cpfComMascara : ' '}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("                                               name=\"numCpfAdicional\" id=\"numCpfAdicional\" maxlength=\"14\"\r\n");
        out.write("                                               onKeyPress=\"Mascara(this,Cpf); enterExec(event, consultaCpfAdicional);\"\r\n");
        out.write("                                               size=\"20\"\r\n");
        out.write("                                               ");
        if (_jspx_meth_c_005fif_005f19(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write(" />\r\n");
        out.write("                                        <span class=\"input-group-addon\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<img id=\"buttonCpfCadastroAdicional\" onclick=\"consultaCpfAdicional()\"\r\n");
        out.write("                                                 type=\"button\" title=\"Buscar cliente\"\r\n");
        out.write("                                                 src=\"");
        if (_jspx_meth_c_005furl_005f16(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"\r\n");
        out.write("                                                 style=\"cursor: pointer\" ;\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                    <td>\r\n");
        out.write("                                        <input type=\"text\" name=\"txtNomeAdicional\" id=\"txtNomeAdicional\"\r\n");
        out.write("                                               value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0] != null ? listAdicional[0].nome : ' '}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("                                               size=\"40\" maxlength=\"30\" style=\"width: 210px\"/>\r\n");
        out.write("                                    </td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <table width='60%'>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>RG</td>\r\n");
        out.write("                                        <td nowrap>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f17(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Data Nascimento\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f18(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Sexo\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td nowrap>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f19(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Tipo de Relacionamento\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0] != null ? listAdicional[0].rg : ' '}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("                                                   type=\"text\" name=\"numRgAdicional\" id=\"numRgAdicional\"\r\n");
        out.write("                                                   onKeyPress=\"Mascara(this,Integer);\" size=\"12\" maxlength=\"10\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input value='");
        if (_jspx_meth_fmt_005fformatDate_005f2(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("'\r\n");
        out.write("                                                   type=\"text\" name=\"dtNascAdicional\" id=\"dtNascAdicional\" size=\"15\"\r\n");
        out.write("                                                   onkeypress=\"Mascara(this,Data);\" maxlength=\"10\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <select id=\"txtSexoAdicional\" name=\"txtSexoAdicional\">\r\n");
        out.write("                                                <option value=\"0\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0] == null ? 'selected=\"selected\"' : ' '}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">\r\n");
        out.write("                                                    --\r\n");
        out.write("                                                </option>\r\n");
        out.write("                                                <option value=\"F\"\r\n");
        out.write("                                                        label=\"Feminino\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0].sexo == 'F' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">\r\n");
        out.write("                                                    F\r\n");
        out.write("                                                </option>\r\n");
        out.write("                                                <option value=\"M\"\r\n");
        out.write("                                                        label=\"Masculino\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0].sexo == 'M' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">\r\n");
        out.write("                                                    M\r\n");
        out.write("                                                </option>\r\n");
        out.write("                                            </select>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <select id=\"txtTpRelacionamentoAdicional\"\r\n");
        out.write("                                                    name=\"txtTpRelacionamentoAdicional\">\r\n");
        out.write("                                                <option value=\"0\" selected=\"selected\">--</option>\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_005fforEach_005f4(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            </select>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                                <table width='60%'>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f20(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Tipo\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td nowrap>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f21(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            DDD\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f22(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            Telefone\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <img align=\"top\" src=\"");
        if (_jspx_meth_c_005furl_005f23(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\"/>\r\n");
        out.write("                                            E-mail\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <select id=\"tpTelAdicional\" name=\"tpTelAdicional\">\r\n");
        out.write("                                                <option value=\"0\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0] == null ? 'selected=\"selected\"' : ' '}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">\r\n");
        out.write("                                                    --\r\n");
        out.write("                                                </option>\r\n");
        out.write("                                                <option value=\"1\"\r\n");
        out.write("                                                        label=\"Residencial\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0].telefones[0].cdTipoTelefone == '1' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">\r\n");
        out.write("                                                    Residencial\r\n");
        out.write("                                                </option>\r\n");
        out.write("                                                <option value=\"2\"\r\n");
        out.write("                                                        label=\"Comercial\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0].telefones[0].cdTipoTelefone == '2' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">\r\n");
        out.write("                                                    Comercial\r\n");
        out.write("                                                </option>\r\n");
        out.write("                                                <option value=\"3\"\r\n");
        out.write("                                                        label=\"Celular\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0].telefones[0].cdTipoTelefone == '3' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("                                                        onchange=\"Mascara(this, Telefone);\">Celular\r\n");
        out.write("                                                </option>\r\n");
        out.write("                                            </select>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0] != null ? listAdicional[0].telefones[0].nrPrefixo : ' '}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("                                                   type=\"text\" name=\"nrPrefixoAdicional\" id=\"nrPrefixoAdicional\"\r\n");
        out.write("                                                   onKeyPress=\"Mascara(this, Telefone);\" maxlength=\"3\"\r\n");
        out.write("                                                   style=\"width: 40px\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0] != null ? listAdicional[0].telefones[0].nrTelefone : ' '}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("                                                   type=\"text\" name=\"numTelAdicional\" id=\"numTelAdicional\"\r\n");
        out.write("                                                   onfocus=\"Mascara(this, Telefone);\" size=\"17\" maxlength=\"10\"\r\n");
        out.write("                                                   onkeypress=\"Mascara(this, Telefone);\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <input value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0] != null ? listAdicional[0].email : ' '}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("                                                   type=\"text\" name=\"emailAdicional\" id=\"emailAdicional\" size=\"65\"\r\n");
        out.write("                                                   maxlength=\"100\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td>\r\n");
        out.write("                                            <br>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                    <tr>\r\n");
        out.write("                                        <td align=\"center\" colspan=\"5\">\r\n");
        out.write("                                            <input type=\"button\" class=\"btnPadrao\" name=\"salvarAdiciona\"\r\n");
        out.write("                                                   id=\"salvarAdicional\" title=\"Incluir adicional\" value=\"Incluir\"/>\r\n");
        out.write("                                        </td>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <br/>\r\n");
        out.write("                        <div class=\"titleSection\">\r\n");
        out.write("                            <b>\r\n");
        out.write("                                <i>ADICIONAIS CADASTRADOS</i>\r\n");
        out.write("                            </b>\r\n");
        out.write("                        </div>\r\n");
        out.write("                        <br/>\r\n");
        out.write("                        <div style=\"height: 155px; overflow-x: scroll;\">\r\n");
        out.write("                            <table>\r\n");
        out.write("                                ");
        if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_005fforEach_005f5(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </table>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                    <div id=\"Beneficios\" class=\"abaConteudo ");
        if (_jspx_meth_c_005fout_005f22(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\" style=\"display: none; padding-top: 0; height: 100%\">\r\n");
        out.write("\r\n");
        out.write("                        <table>\r\n");
        out.write("                            <tr>\r\n");
        out.write("                                <td style=\"width: 90%\" cellspacing=\"1\">\r\n");
        out.write("                                    <table width=\"100%\" cellspacing=\"5\" cellpadding=\"0\"\r\n");
        out.write("                                           style=\"font-family: sans-serif; font-size: 10px; color: #3D3333\">\r\n");
        out.write("                                        <thead>\r\n");
        out.write("                                        <tr>\r\n");
        out.write("                                            <td colspan=\"2\" align=\"center\" class=\"titleSection\">\r\n");
        out.write("                                                <b>BENEF&Iacute;CIOS DO CLIENTE</b>\r\n");
        out.write("                                            </td>\r\n");
        out.write("                                        </tr>\r\n");
        out.write("                                        </thead>\r\n");
        out.write("                                        <tr style=\"font-size: 11.5px\">\r\n");
        out.write("                                            <th style=\"background: #696C6C; color: white; text-align: center\">CART&Atilde;O\r\n");
        out.write("                                            </th>\r\n");
        out.write("                                            <th style=\"background: #696C6C; color: white; text-align: center\">PBM /\r\n");
        out.write("                                                PROGRAMA DA IND&Uacute;STRIA\r\n");
        out.write("                                            </th>\r\n");
        out.write("                                        </tr>\r\n");
        out.write("                                        <tr>\r\n");
        out.write("                                            <td style=\"background: #E9E9EE; width: 50%\">\r\n");
        out.write("                                                <b>\r\n");
        out.write("                                                    <ol style=\"list-style-type: square\">\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_005fforEach_005f7(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    </ol>\r\n");
        out.write("                                                </b>\r\n");
        out.write("                                            </td>\r\n");
        out.write("                                            <td style=\"background: #E9E9EE; width: 50%\">\r\n");
        out.write("                                                <b>\r\n");
        out.write("                                                    <ol style=\"list-style-type: square\">\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_005fforEach_005f8(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    </ol>\r\n");
        out.write("                                                </b>\r\n");
        out.write("                                            </td>\r\n");
        out.write("                                        </tr>\r\n");
        out.write("                                        <tr style=\"font-size: 11.5px\">\r\n");
        out.write("                                            <th style=\"background: #696C6C; color: white; text-align: center\">UNIVERS\r\n");
        out.write("                                            </th>\r\n");
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_005fif_005f22(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_005fif_005f23(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </tr>\r\n");
        out.write("                                        <tr>\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_005fif_005f24(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            <td style=\"background: #E9E9EE; width: 50%\">\r\n");
        out.write("                                                <b>\r\n");
        out.write("                                                    <ol style=\"list-style-type: square\">\r\n");
        out.write("                                                        ");
        if (_jspx_meth_c_005fforEach_005f9(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    </ol>\r\n");
        out.write("                                                </b>\r\n");
        out.write("                                            </td>\r\n");
        out.write("                                            \r\n");
        out.write("                                            ");
        if (_jspx_meth_c_005fif_005f27(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        </tr>\r\n");
        out.write("                                    </table>\r\n");
        out.write("                                </td>\r\n");
        out.write("                                <td valign=\"bottom\" align=\"right\">\r\n");
        out.write("                                    <div align=\"right\">\r\n");
        out.write("                                        <input type=\"button\" class=\"");
        if (_jspx_meth_c_005fout_005f23(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\" id=\"btnExlcuirBeneficios\"\r\n");
        out.write("                                               value=\"Excluir Benef&iacute;cios\"/>\r\n");
        out.write("                                        </br>\r\n");
        out.write("                                        </br>\r\n");
        out.write("                                        <input type=\"button\" class=\"");
        if (_jspx_meth_c_005fout_005f24(_jspx_th_c_005fif_005f18, _jspx_page_context))
          return true;
        out.write("\" id=\"btnInserirBeneficios\"\r\n");
        out.write("                                               value=\"Simular Benef&iacute;cios\"/>\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </td>\r\n");
        out.write("                            </tr>\r\n");
        out.write("                        </table>\r\n");
        out.write("                    </div>\r\n");
        out.write("                </div>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f21 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(972,59) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f21.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(LOGO_MARCA == '1') ? 'raia' : 'drogasil' }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f21 = _jspx_th_c_005fout_005f21.doStartTag();
    if (_jspx_th_c_005fout_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f21);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(987,62) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f15.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f15 = _jspx_th_c_005furl_005f15.doStartTag();
    if (_jspx_th_c_005furl_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(998,47) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0] != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f19 = _jspx_th_c_005fif_005f19.doStartTag();
    if (_jspx_eval_c_005fif_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("readonly");
        int evalDoAfterBody = _jspx_th_c_005fif_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1002,54) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f16.setValue("/images/buttons/search-2-16.png");
    int _jspx_eval_c_005furl_005f16 = _jspx_th_c_005furl_005f16.doStartTag();
    if (_jspx_th_c_005furl_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1017,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f17.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f17 = _jspx_th_c_005furl_005f17.doStartTag();
    if (_jspx_th_c_005furl_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f17);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1021,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f18.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f18 = _jspx_th_c_005furl_005f18.doStartTag();
    if (_jspx_th_c_005furl_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f19 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1025,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f19.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f19 = _jspx_th_c_005furl_005f19.doStartTag();
    if (_jspx_th_c_005furl_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f19);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1036,58) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f2.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1036,58) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listAdicional[0].dataNascimento}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f2 = _jspx_th_fmt_005fformatDate_005f2.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1059,48) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("tipoRelacionamento");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1059,48) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1059,48) '${listaTipoRelacionamento}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaTipoRelacionamento}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoRelacionamento.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoRelacionamento.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f20 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1069,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f20.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f20 = _jspx_th_c_005furl_005f20.doStartTag();
    if (_jspx_th_c_005furl_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f21 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1073,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f21.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f21 = _jspx_th_c_005furl_005f21.doStartTag();
    if (_jspx_th_c_005furl_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f21);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f22 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1077,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f22.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f22 = _jspx_th_c_005furl_005f22.doStartTag();
    if (_jspx_th_c_005furl_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f22);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f23 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1081,66) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f23.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f23 = _jspx_th_c_005furl_005f23.doStartTag();
    if (_jspx_th_c_005furl_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f23);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1145,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1145,32) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1145,32) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/clienteOperacoes.jsp(1145,32) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("page");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1146,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVar("adicional");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1146,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1146,32) '${adicionais}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${adicionais}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <th style=\"display: none\">ID CLIENTE</th>\r\n");
          out.write("                                        <th>Nome</th>\r\n");
          out.write("                                        <th>CPF</th>\r\n");
          out.write("                                        <th>Dt.Nascimento</th>\r\n");
          out.write("                                        <th>E-mail</th>\r\n");
          out.write("                                        <th>Tipo Telefone</th>\r\n");
          out.write("                                        <th>DDD</th>\r\n");
          out.write("                                        <th>Telefone</th>\r\n");
          out.write("                                        <th>Sexo</th>\r\n");
          out.write("                                        <th>Relacionamento</th>\r\n");
          out.write("                                        <th></th>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <td style=\"display: none\">\r\n");
          out.write("                                            <input type=\"text\" id=\"idCliente");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"true\"\r\n");
          out.write("                                                   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <input type=\"text\" id=\"nome");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"true\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("                                                   style=\"width: 200px; display: none;\"/>\r\n");
          out.write("                                            <label style=\"font-weight: normal\"\r\n");
          out.write("                                                   id='mostraNome");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <label style=\"font-weight: normal; width: 80px;\" id='mostraCPF");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'>\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_005fchoose_005f4(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("\r\n");
          out.write("                                            </label>\r\n");
          out.write("                                            <input type=\"text\" id=\"cpf");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"true\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("                                                   style=\"display: none\"/>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <input type=\"text\" id=\"dtNascimento");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"true\"\r\n");
          out.write("                                                   value='");
          if (_jspx_meth_fmt_005fformatDate_005f3(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("'\r\n");
          out.write("                                                   style=\"width: 70px; display: none;\" onkeypress=\"Mascara(this,Data);\"\r\n");
          out.write("                                                   maxlength=\"10\"/>\r\n");
          out.write("                                            <label style=\"font-weight: normal\" id='mostraDtNascimento");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'>\r\n");
          out.write("                                                ");
          if (_jspx_meth_fmt_005fformatDate_005f4(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("\r\n");
          out.write("                                            </label>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <input type=\"text\" id=\"email");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"true\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("                                                   style=\"width: 200px; display: none;\" maxlength=\"50\"/>\r\n");
          out.write("                                            <label style=\"font-weight: normal\"\r\n");
          out.write("                                                   id='mostraEmail");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <select id=\"tpTelefone");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" name=\"tpTelefone\" disabled=\"true\"\r\n");
          out.write("                                                    style=\"display: none;\">\r\n");
          out.write("                                                <option value=\"1\"\r\n");
          out.write("                                                        label=\"Residencial\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.cdTipoTelefone == '1' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                                                    Residencial\r\n");
          out.write("                                                </option>\r\n");
          out.write("                                                <option value=\"2\"\r\n");
          out.write("                                                        label=\"Comercial\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.cdTipoTelefone == '2' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                                                    Comercial\r\n");
          out.write("                                                </option>\r\n");
          out.write("                                                <option value=\"3\"\r\n");
          out.write("                                                        label=\"Celular\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.cdTipoTelefone == '3' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                                                    Celular\r\n");
          out.write("                                                </option>\r\n");
          out.write("                                            </select>\r\n");
          out.write("                                            <label style=\"font-weight: normal\" id='mostraTpTelefone");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'>\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_005fchoose_005f5(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("\r\n");
          out.write("                                            </label>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <input type=\"text\" id=\"nrPrefixo");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"true\"\r\n");
          out.write("                                                   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("                                                   style=\"width: 20px; display: none;\" maxlength=\"3\"/>\r\n");
          out.write("                                            <label style=\"font-weight: normal\"\r\n");
          out.write("                                                   id='mostraNrPrefixo");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <input type=\"text\" id=\"telefone");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" readonly=\"true\"\r\n");
          out.write("                                                   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("                                                   style=\"width: 60px; display: none;\"\r\n");
          out.write("                                                   onfocus=\"Mascara(this, Telefone);\"\r\n");
          out.write("                                                   onkeypress=\"Mascara(this, Telefone);\" maxlength=\"10\"/>\r\n");
          out.write("                                            <label style=\"font-weight: normal\" id='mostraTelefone");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'>\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_005fchoose_005f6(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("\r\n");
          out.write("                                            </label>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <select id=\"sexo");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" disabled=\"true\" style=\"display: none;\">\r\n");
          out.write("                                                <option value=\"F\"\r\n");
          out.write("                                                        label=\"Feminino\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.sexo == 'F' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                                                    F\r\n");
          out.write("                                                </option>\r\n");
          out.write("                                                <option value=\"M\"\r\n");
          out.write("                                                        label=\"Masculino\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.sexo == 'M' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(">\r\n");
          out.write("                                                    M\r\n");
          out.write("                                                </option>\r\n");
          out.write("                                            </select>\r\n");
          out.write("                                            <label style=\"font-weight: normal\" id='mostraSexo");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'>\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_005fchoose_005f7(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("\r\n");
          out.write("                                            </label>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <select id=\"relacionamento");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" disabled=\"true\" style=\"display: none;\">\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_005fforEach_005f6(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("\r\n");
          out.write("                                            </select>\r\n");
          out.write("                                            <label style=\"font-weight: normal\"\r\n");
          out.write("                                                   id='mostraRelacionamento");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.tipoRelacionamentoCliente.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <div id=\"div");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                                <img id=\"btnImg");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" title=\"Salvar altera&ccedil;&atilde;o\"\r\n");
          out.write("                                                     style=\"display: none; cursor: pointer;\"\r\n");
          out.write("                                                     src='");
          if (_jspx_meth_c_005furl_005f24(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("'\r\n");
          out.write("                                                     onclick=\"alteraAdicional(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\" style=\"cursor: pointer;\"/>\r\n");
          out.write("                                                <img id=\"btn");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" title=\"Editar adicional\"\r\n");
          out.write("                                                     onclick=\"liberaCamposEdicao(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\"\r\n");
          out.write("                                                     src='");
          if (_jspx_meth_c_005furl_005f25(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("'\r\n");
          out.write("                                                     style=\"cursor: pointer;\"/>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td nowrap>\r\n");
          out.write("                                            <div>\r\n");
          out.write("                                                <img id=\"btnExcluir");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" title=\"Excluir adicional\"\r\n");
          out.write("                                                     onclick=\"excluirAdicional(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\"\r\n");
          out.write("                                                     src='");
          if (_jspx_meth_c_005furl_005f26(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("'\r\n");
          out.write("                                                     style=\"cursor: pointer;\"/>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                    ");
          if (_jspx_meth_c_005fset_005f1(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    int _jspx_eval_c_005fchoose_005f4 = _jspx_th_c_005fchoose_005f4.doStartTag();
    if (_jspx_eval_c_005fchoose_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_005fwhen_005f5(_jspx_th_c_005fchoose_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f4);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1174,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.cpf != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f5 = _jspx_th_c_005fwhen_005f5.doStartTag();
    if (_jspx_eval_c_005fwhen_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <script>\r\n");
        out.write("                                                            v = '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("';\r\n");
        out.write("                                                            v = v.replace(/\\D/g, \"\");\r\n");
        out.write("                                                            v = v.replace(/(\\d{3})(\\d)/, \"$1.$2\");\r\n");
        out.write("                                                            v = v.replace(/(\\d{3})(\\d)/, \"$1.$2\");\r\n");
        out.write("                                                            v = v.replace(/(\\d{3})(\\d{1,2})$/, \"$1-$2\");\r\n");
        out.write("                                                            document.getElementById(\"mostraCPF");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\").innerText = v;\r\n");
        out.write("                                                        </script>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1191,58) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f3.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1191,58) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.dataNascimento}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f3 = _jspx_th_fmt_005fformatDate_005f3.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1195,48) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f4.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1195,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f4.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.dataNascimento}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f4 = _jspx_th_fmt_005fformatDate_005f4.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f5 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    int _jspx_eval_c_005fchoose_005f5 = _jspx_th_c_005fchoose_005f5.doStartTag();
    if (_jspx_eval_c_005fchoose_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_005fwhen_005f6(_jspx_th_c_005fchoose_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_005fwhen_005f7(_jspx_th_c_005fchoose_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_005fwhen_005f8(_jspx_th_c_005fchoose_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1223,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.cdTipoTelefone == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f6 = _jspx_th_c_005fwhen_005f6.doStartTag();
    if (_jspx_eval_c_005fwhen_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        Residencial\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1226,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.cdTipoTelefone == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f7 = _jspx_th_c_005fwhen_005f7.doStartTag();
    if (_jspx_eval_c_005fwhen_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        Comercial\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1229,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.cdTipoTelefone == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f8 = _jspx_th_c_005fwhen_005f8.doStartTag();
    if (_jspx_eval_c_005fwhen_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        Celular\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f6 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    int _jspx_eval_c_005fchoose_005f6 = _jspx_th_c_005fchoose_005f6.doStartTag();
    if (_jspx_eval_c_005fchoose_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_005fwhen_005f9(_jspx_th_c_005fchoose_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f6);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1250,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.nrTelefone != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f9 = _jspx_th_c_005fwhen_005f9.doStartTag();
    if (_jspx_eval_c_005fwhen_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <script>\r\n");
        out.write("                                                            v = '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.telefone.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("';\r\n");
        out.write("                                                            v = v.replace(/\\D/g, \"\");\r\n");
        out.write("                                                            // v=v.replace(/^(\\d\\d)(\\d)/g,\"($1) $2\");\r\n");
        out.write("                                                            if (v.length > 8) {\r\n");
        out.write("                                                                v = v.replace(/(\\d{5})(\\d)/, \"$1-$2\");\r\n");
        out.write("                                                            } else {\r\n");
        out.write("                                                                v = v.replace(/(\\d{4})(\\d)/, \"$1-$2\");\r\n");
        out.write("                                                            }\r\n");
        out.write("                                                            document.getElementById(\"mostraTelefone");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\").innerText = v;\r\n");
        out.write("                                                        </script>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f7 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    int _jspx_eval_c_005fchoose_005f7 = _jspx_th_c_005fchoose_005f7.doStartTag();
    if (_jspx_eval_c_005fchoose_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_005fwhen_005f10(_jspx_th_c_005fchoose_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
          return true;
        out.write("\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_005fwhen_005f11(_jspx_th_c_005fchoose_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f7);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1279,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.sexo == 'F'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f10 = _jspx_th_c_005fwhen_005f10.doStartTag();
    if (_jspx_eval_c_005fwhen_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        Feminino\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f7);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1282,52) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adicional.sexo == 'M'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f11 = _jspx_th_c_005fwhen_005f11.doStartTag();
    if (_jspx_eval_c_005fwhen_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        Masculino\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1290,48) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setVar("tipoRelacionamento");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1290,48) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1290,48) '${listaTipoRelacionamento}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaTipoRelacionamento}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f6 = _jspx_th_c_005fforEach_005f6.doStartTag();
      if (_jspx_eval_c_005fforEach_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoRelacionamento.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoRelacionamento.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f6.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f24 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1301,58) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f24.setValue("/images/buttons/save-16.png");
    int _jspx_eval_c_005furl_005f24 = _jspx_th_c_005furl_005f24.doStartTag();
    if (_jspx_th_c_005furl_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f24);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f25 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1305,58) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f25.setValue("/images/buttons/edit-2-16.png");
    int _jspx_eval_c_005furl_005f25 = _jspx_th_c_005furl_005f25.doStartTag();
    if (_jspx_th_c_005furl_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f25);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f26 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1313,58) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f26.setValue("/images/buttons/x-mark-16.png");
    int _jspx_eval_c_005furl_005f26 = _jspx_th_c_005furl_005f26.doStartTag();
    if (_jspx_th_c_005furl_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f26);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1318,36) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1318,36) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1318,36) '${i + 1}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${i + 1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/clienteOperacoes.jsp(1318,36) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setScope("page");
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f22 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1323,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f22.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(LOGO_MARCA == '1') ? 'raia' : 'drogasil' }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f22 = _jspx_th_c_005fout_005f22.doStartTag();
    if (_jspx_th_c_005fout_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f22);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1348,56) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1348,56) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1348,56) '${perfis}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perfis}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f7 = _jspx_th_c_005fforEach_005f7.doStartTag();
      if (_jspx_eval_c_005fforEach_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_005fif_005f20(_jspx_th_c_005fforEach_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f7))
            return true;
          out.write("\r\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f7.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f7);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1349,60) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ 'Cartao_RD' == i.perfilTipo }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f20 = _jspx_th_c_005fif_005f20.doStartTag();
    if (_jspx_eval_c_005fif_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <li>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.dsPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</li>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1359,56) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f8.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1359,56) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f8.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1359,56) '${perfis}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perfis}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f8 = _jspx_th_c_005fforEach_005f8.doStartTag();
      if (_jspx_eval_c_005fforEach_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_005fif_005f21(_jspx_th_c_005fforEach_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f8))
            return true;
          out.write("\r\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f8.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f8);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1360,60) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ 'PLANO_SAUDE' == i.perfilTipo || 'SEGURADORA' == i.perfilTipo || 'PROGRAMA_INDUSTRIA' == i.perfilTipo }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f21 = _jspx_th_c_005fif_005f21.doStartTag();
    if (_jspx_eval_c_005fif_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <li>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.dsPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</li>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f21);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1372,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f22 = _jspx_th_c_005fif_005f22.doStartTag();
    if (_jspx_eval_c_005fif_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<th style=\"background: #696C6C; color: white; text-align: center\"></th>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f22);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1373,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f23 = _jspx_th_c_005fif_005f23.doStartTag();
    if (_jspx_eval_c_005fif_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<!-- <th style=\"background: #696C6C; color: white; text-align: center\">PBM</th>  -->");
        int evalDoAfterBody = _jspx_th_c_005fif_005f23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f23);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1376,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f24 = _jspx_th_c_005fif_005f24.doStartTag();
    if (_jspx_eval_c_005fif_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            ");
        out.write("\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f24);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1394,56) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f9.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1394,56) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f9.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1394,56) '${perfis}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perfis}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f9 = _jspx_th_c_005fforEach_005f9.doStartTag();
      if (_jspx_eval_c_005fforEach_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_005fif_005f25(_jspx_th_c_005fforEach_005f9, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f9))
            return true;
          out.write("\r\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f9.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f9);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1395,60) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ 'UNIVERS' == i.perfilTipo }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f25 = _jspx_th_c_005fif_005f25.doStartTag();
    if (_jspx_eval_c_005fif_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                <li>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.dsPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        if (_jspx_meth_c_005fif_005f26(_jspx_th_c_005fif_005f25, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f9))
          return true;
        out.write("</li>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f25);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f25);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1396,81) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f26 = _jspx_th_c_005fif_005f26.doStartTag();
    if (_jspx_eval_c_005fif_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(' ');
        out.write('-');
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.dsPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" CPF: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.cdsCnpjCpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write('/');
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.vlUnivers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        int evalDoAfterBody = _jspx_th_c_005fif_005f26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f26);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f27 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1403,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f27 = _jspx_th_c_005fif_005f27.doStartTag();
    if (_jspx_eval_c_005fif_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <td style=\"background: #E9E9EE; width: 50%\">\r\n");
        out.write("                                                <b>&nbsp;</b>\r\n");
        out.write("                                            </td>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f27);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f23 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1413,68) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f23.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 'button120' : 'btnPadrao'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f23 = _jspx_th_c_005fout_005f23.doStartTag();
    if (_jspx_th_c_005fout_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f23);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f24 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f18);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1417,68) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f24.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 'button120' : 'btnPadrao'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f24 = _jspx_th_c_005fout_005f24.doStartTag();
    if (_jspx_th_c_005fout_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f24);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f28 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1436,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f28 = _jspx_th_c_005fif_005f28.doStartTag();
    if (_jspx_eval_c_005fif_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <script>\r\n");
        out.write("\r\n");
        out.write("                    clientePesquisado = {\r\n");
        out.write("                        'nome': '");
        if (_jspx_meth_c_005fout_005f25(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'dataNascimento': '");
        if (_jspx_meth_fmt_005fformatDate_005f5(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'rg': '");
        if (_jspx_meth_c_005fout_005f26(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'cpf': '");
        if (_jspx_meth_c_005fout_005f27(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'sexo': '");
        if (_jspx_meth_c_005fout_005f28(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'email': '");
        if (_jspx_meth_c_005fout_005f29(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'idClienteTitular': '");
        if (_jspx_meth_c_005fout_005f30(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'nrBeneficio': '");
        if (_jspx_meth_c_005fout_005f31(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'ufRg': '");
        if (_jspx_meth_c_005fout_005f32(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'flPensionista': '");
        if (_jspx_meth_c_005fout_005f33(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'flPromocao': '");
        if (_jspx_meth_c_005fout_005f34(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'dataCadastro': '");
        if (_jspx_meth_fmt_005fformatDate_005f6(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'dataUltimaAtualizacao': '");
        if (_jspx_meth_fmt_005fformatDate_005f7(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'cdTipoCadastramentoCliente': '");
        if (_jspx_meth_c_005fout_005f35(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'flLgpdDescBeneficio': '");
        if (_jspx_meth_c_005fout_005f36(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'flLgpdPbm': '");
        if (_jspx_meth_c_005fout_005f37(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'lastUpdateSource': '");
        if (_jspx_meth_c_005fout_005f38(_jspx_th_c_005fif_005f28, _jspx_page_context))
          return true;
        out.write("'\r\n");
        out.write("                    };\r\n");
        out.write("                </script>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f28);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f25 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1440,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f25.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f25 = _jspx_th_c_005fout_005f25.doStartTag();
    if (_jspx_th_c_005fout_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f25);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1441,43) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f5.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1441,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f5.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataNascimento}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f5 = _jspx_th_fmt_005fformatDate_005f5.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f26 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1442,31) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f26.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.rg}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f26 = _jspx_th_c_005fout_005f26.doStartTag();
    if (_jspx_th_c_005fout_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f26);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f27 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1443,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f27.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cpf}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f27 = _jspx_th_c_005fout_005f27.doStartTag();
    if (_jspx_th_c_005fout_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f27);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f28 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1444,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f28.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.sexo}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f28 = _jspx_th_c_005fout_005f28.doStartTag();
    if (_jspx_th_c_005fout_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f28);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f29 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1445,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f29.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f29 = _jspx_th_c_005fout_005f29.doStartTag();
    if (_jspx_th_c_005fout_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f29);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f30 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f30.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1446,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f30.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idClienteTitular}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f30 = _jspx_th_c_005fout_005f30.doStartTag();
    if (_jspx_th_c_005fout_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f30);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f31 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f31.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1447,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f31.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nrBeneficio}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f31 = _jspx_th_c_005fout_005f31.doStartTag();
    if (_jspx_th_c_005fout_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f31);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f32 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f32.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1448,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f32.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.ufRg}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f32 = _jspx_th_c_005fout_005f32.doStartTag();
    if (_jspx_th_c_005fout_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f32);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f33 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f33.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1449,42) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f33.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flPensionista}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f33 = _jspx_th_c_005fout_005f33.doStartTag();
    if (_jspx_th_c_005fout_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f33);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f34 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f34.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1450,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f34.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flPromocao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f34 = _jspx_th_c_005fout_005f34.doStartTag();
    if (_jspx_th_c_005fout_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f34);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1451,41) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f6.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1451,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f6.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataCadastro}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f6 = _jspx_th_fmt_005fformatDate_005f6.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f6);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1452,50) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f7.setPattern("dd/MM/yyyy HH:mm:ss");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1452,50) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f7.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataUltimaAtualizacao}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f7 = _jspx_th_fmt_005fformatDate_005f7.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f35 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f35.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1453,55) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f35.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdTipoCadastramentoCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f35 = _jspx_th_c_005fout_005f35.doStartTag();
    if (_jspx_th_c_005fout_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f35);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f36 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f36.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1454,48) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f36.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flLgpdDescBeneficio}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f36 = _jspx_th_c_005fout_005f36.doStartTag();
    if (_jspx_th_c_005fout_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f36);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f37 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f37.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1455,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f37.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flLgpdPbm}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f37 = _jspx_th_c_005fout_005f37.doStartTag();
    if (_jspx_th_c_005fout_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f37);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f28, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f38 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f38.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f28);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1456,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f38.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.lastUpdateSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f38 = _jspx_th_c_005fout_005f38.doStartTag();
    if (_jspx_th_c_005fout_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f38);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f29 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1460,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.telefones != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f29 = _jspx_th_c_005fif_005f29.doStartTag();
    if (_jspx_eval_c_005fif_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_c_005fforEach_005f10(_jspx_th_c_005fif_005f29, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f29);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f29);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1461,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f10.setVar("telefone");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1461,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f10.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1461,16) '${cliente.telefones}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cliente.telefones}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/clienteOperacoes.jsp(1461,16) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f10.setVarStatus("loop");
    int[] _jspx_push_body_count_c_005fforEach_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f10 = _jspx_th_c_005fforEach_005f10.doStartTag();
      if (_jspx_eval_c_005fforEach_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <script>\r\n");
          out.write("                        tel = {\r\n");
          out.write("                            'tpTel': '");
          if (_jspx_meth_c_005fout_005f39(_jspx_th_c_005fforEach_005f10, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f10))
            return true;
          out.write("',\r\n");
          out.write("                            'ddd': '");
          if (_jspx_meth_c_005fout_005f40(_jspx_th_c_005fforEach_005f10, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f10))
            return true;
          out.write("',\r\n");
          out.write("                            'idTelefone': '");
          if (_jspx_meth_c_005fout_005f41(_jspx_th_c_005fforEach_005f10, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f10))
            return true;
          out.write("',\r\n");
          out.write("                            'tel': '");
          if (_jspx_meth_c_005fout_005f42(_jspx_th_c_005fforEach_005f10, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f10))
            return true;
          out.write("'\r\n");
          out.write("                        };\r\n");
          out.write("                        telefonesPesquisados[\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loop.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"] = tel;\r\n");
          out.write("                    </script>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f10.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f39 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f39.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f10);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1464,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f39.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.cdTipoTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f39 = _jspx_th_c_005fout_005f39.doStartTag();
    if (_jspx_th_c_005fout_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f39);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f40 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f40.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f10);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1465,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f40.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrPrefixo}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f40 = _jspx_th_c_005fout_005f40.doStartTag();
    if (_jspx_th_c_005fout_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f40);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f41 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f41.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f10);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1466,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f41.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.idTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f41 = _jspx_th_c_005fout_005f41.doStartTag();
    if (_jspx_th_c_005fout_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f41);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f42 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f42.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f10);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1467,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f42.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f42 = _jspx_th_c_005fout_005f42.doStartTag();
    if (_jspx_th_c_005fout_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f42);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f30 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f30.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1473,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listEnderecos != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f30 = _jspx_th_c_005fif_005f30.doStartTag();
    if (_jspx_eval_c_005fif_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <script>\r\n");
        out.write("                    enderecoPesquisado = {\r\n");
        out.write("                        'logradouro': '");
        if (_jspx_meth_c_005fout_005f43(_jspx_th_c_005fif_005f30, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'numero': '");
        if (_jspx_meth_c_005fout_005f44(_jspx_th_c_005fif_005f30, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'complemento': '");
        if (_jspx_meth_c_005fout_005f45(_jspx_th_c_005fif_005f30, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'bairro': '");
        if (_jspx_meth_c_005fout_005f46(_jspx_th_c_005fif_005f30, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'cep': '");
        if (_jspx_meth_c_005fout_005f47(_jspx_th_c_005fif_005f30, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'cidade': '");
        if (_jspx_meth_c_005fout_005f48(_jspx_th_c_005fif_005f30, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'estado': '");
        if (_jspx_meth_c_005fout_005f49(_jspx_th_c_005fif_005f30, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                        'tipoEndereco': '");
        if (_jspx_meth_c_005fout_005f50(_jspx_th_c_005fif_005f30, _jspx_page_context))
          return true;
        out.write("'\r\n");
        out.write("                    };\r\n");
        out.write("                </script>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f30);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f43 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f43.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f30);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1476,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f43.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listEnderecos[0].logradouro}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f43 = _jspx_th_c_005fout_005f43.doStartTag();
    if (_jspx_th_c_005fout_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f43);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f44 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f44.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f30);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1477,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f44.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listEnderecos[0].numero}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f44 = _jspx_th_c_005fout_005f44.doStartTag();
    if (_jspx_th_c_005fout_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f44);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f45 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f45.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f30);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1478,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f45.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listEnderecos[0].complemento}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f45 = _jspx_th_c_005fout_005f45.doStartTag();
    if (_jspx_th_c_005fout_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f45);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f46(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f46 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f46.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f30);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1479,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f46.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listEnderecos[0].bairro}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f46 = _jspx_th_c_005fout_005f46.doStartTag();
    if (_jspx_th_c_005fout_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f46);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f47 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f47.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f30);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1480,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f47.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listEnderecos[0].cep}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f47 = _jspx_th_c_005fout_005f47.doStartTag();
    if (_jspx_th_c_005fout_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f47);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f48 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f48.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f30);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1481,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f48.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listEnderecos[0].cidade}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f48 = _jspx_th_c_005fout_005f48.doStartTag();
    if (_jspx_th_c_005fout_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f48);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f49(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f49 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f49.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f30);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1482,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f49.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listEnderecos[0].uf}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f49 = _jspx_th_c_005fout_005f49.doStartTag();
    if (_jspx_th_c_005fout_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f49);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f50(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f30, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f50 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f50.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f30);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1483,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f50.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listEnderecos[0].sgTipoEndereco}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f50 = _jspx_th_c_005fout_005f50.doStartTag();
    if (_jspx_th_c_005fout_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f50);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f31 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f31.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1487,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f31.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpfClienteUniverCadastradoNoTc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f31 = _jspx_th_c_005fif_005f31.doStartTag();
    if (_jspx_eval_c_005fif_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <script>\r\n");
        out.write("                    setCookie(\"cpfUnivers\", ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpfClienteUniverCadastradoNoTc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(");\r\n");
        out.write("                </script>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f31);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f12 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1504,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f12 = _jspx_th_c_005fwhen_005f12.doStartTag();
    if (_jspx_eval_c_005fwhen_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <script> jAlert(\"Consultar Cliente : Por favor, identifique um cliente primeiro.\", \"Cadastro de Cliente\")</script>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f51 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f51.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f51.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1510,90) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f51.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(LOGO_MARCA == '1') ? 'raia' : 'drogasil' }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f51 = _jspx_th_c_005fout_005f51.doStartTag();
    if (_jspx_th_c_005fout_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f51);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f11 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f11.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1526,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f11.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1526,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f11.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1526,20) '${perfis}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perfis}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f11 = _jspx_th_c_005fforEach_005f11.doStartTag();
      if (_jspx_eval_c_005fforEach_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        ");
          if (_jspx_meth_c_005fif_005f32(_jspx_th_c_005fforEach_005f11, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f11))
            return true;
          out.write("\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f11.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f32 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f32.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f11);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1527,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f32.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ 'Cartao_RD' == i.perfilTipo }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f32 = _jspx_th_c_005fif_005f32.doStartTag();
    if (_jspx_eval_c_005fif_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.dsPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;</li>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f32);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f12 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f12.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1536,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f12.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1536,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f12.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1536,24) '${perfis}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perfis}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f12 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f12 = _jspx_th_c_005fforEach_005f12.doStartTag();
      if (_jspx_eval_c_005fforEach_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            ");
          if (_jspx_meth_c_005fif_005f33(_jspx_th_c_005fforEach_005f12, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f12))
            return true;
          out.write("\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f12.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f12.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f12);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f33 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f33.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f12);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1537,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f33.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ 'PLANO_SAUDE' == i.perfilTipo || 'SEGURADORA' == i.perfilTipo || 'PROGRAMA_INDUSTRIA' == i.perfilTipo || 'PROGRAMA_INDUSTRIA_DESATIVADO' == i.perfilTipo }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f33 = _jspx_th_c_005fif_005f33.doStartTag();
    if (_jspx_eval_c_005fif_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.dsPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;<input type=\"image\"\r\n");
        out.write("                                                                    src=\"/tc-core-portlets_1.0/images/icoBtnExluir.png\"\r\n");
        out.write("                                                                    alt=\"excluir\" style=\"vertical-align: middle;\"\r\n");
        out.write("                                                                    width=\"12\" height=\"12\"\r\n");
        out.write("                                                                    onclick=\"deletarPlanoSaudeSeguradora('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.cdsPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("', '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.cdsCnpjCpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.perfilTipo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("' )\"</input>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f33);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f13 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f13.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1559,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f13.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1559,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f13.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1559,24) '${perfis}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perfis}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f13 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f13 = _jspx_th_c_005fforEach_005f13.doStartTag();
      if (_jspx_eval_c_005fforEach_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            ");
          if (_jspx_meth_c_005fif_005f34(_jspx_th_c_005fforEach_005f13, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f13))
            return true;
          out.write("\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f13.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f13[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f13.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f13.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f13);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f34 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f34.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f13);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1560,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f34.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ 'UNIVERS' == i.perfilTipo }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f34 = _jspx_th_c_005fif_005f34.doStartTag();
    if (_jspx_eval_c_005fif_005f34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.dsPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;</li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f34);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f52 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f52.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f52.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1578,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f52.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(LOGO_MARCA == '1') ? 'raia' : 'drogasil' }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f52 = _jspx_th_c_005fout_005f52.doStartTag();
    if (_jspx_th_c_005fout_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f52);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f14 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f14.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1602,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f14.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1602,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f14.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1602,24) '${populaComboPBM}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${populaComboPBM}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f14 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f14 = _jspx_th_c_005fforEach_005f14.doStartTag();
      if (_jspx_eval_c_005fforEach_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.cdPbm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.dsPbm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f14.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f14[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f14.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f14.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f14);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f15 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f15.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1612,31) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f15.setVar("item");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1612,31) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f15.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1612,31) '${requestScope['populaComboPlanoDeSaudeSeguradora']}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope['populaComboPlanoDeSaudeSeguradora']}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f15 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f15 = _jspx_th_c_005fforEach_005f15.doStartTag();
      if (_jspx_eval_c_005fforEach_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            // saudeSeguradoras.push({label: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', value: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.cdChave}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("'});\r\n");
          out.write("                            // ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f15.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f15[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f15.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f15.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f15);
    }
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f4 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f4.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f4 = _jspx_th_portlet_005factionURL_005f4.doStartTag();
    if (_jspx_eval_portlet_005factionURL_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_portlet_005fparam_005f1(_jspx_th_portlet_005factionURL_005f4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_portlet_005factionURL_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_portlet_005factionURL_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f4);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005factionURL_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag _jspx_th_portlet_005fparam_005f1 = (org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag) _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag.class);
    _jspx_th_portlet_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f4);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1642,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f1.setName("page");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1642,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f1.setValue("mainview");
    int _jspx_eval_portlet_005fparam_005f1 = _jspx_th_portlet_005fparam_005f1.doStartTag();
    if (_jspx_th_portlet_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f27 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f27.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1648,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f27.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f27 = _jspx_th_c_005furl_005f27.doStartTag();
    if (_jspx_th_c_005furl_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f27);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f28 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f28.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1661,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f28.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f28 = _jspx_th_c_005furl_005f28.doStartTag();
    if (_jspx_th_c_005furl_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f28);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f29 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f29.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1691,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f29.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f29 = _jspx_th_c_005furl_005f29.doStartTag();
    if (_jspx_th_c_005furl_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f29);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f30 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f30.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f30.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1706,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f30.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f30 = _jspx_th_c_005furl_005f30.doStartTag();
    if (_jspx_th_c_005furl_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f30);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f31 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f31.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f31.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1710,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f31.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f31 = _jspx_th_c_005furl_005f31.doStartTag();
    if (_jspx_th_c_005furl_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f31);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f32 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f32.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f32.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1714,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f32.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f32 = _jspx_th_c_005furl_005f32.doStartTag();
    if (_jspx_th_c_005furl_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f32);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f33 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f33.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f33.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1792,70) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f33.setValue("/images/buttons/search-2-16.png");
    int _jspx_eval_c_005furl_005f33 = _jspx_th_c_005furl_005f33.doStartTag();
    if (_jspx_th_c_005furl_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f33);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f16 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f16.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1799,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f16.setVar("tp");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1799,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f16.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1799,32) '${listTipoEndereco}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listTipoEndereco}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f16 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f16 = _jspx_th_c_005fforEach_005f16.doStartTag();
      if (_jspx_eval_c_005fforEach_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tp.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_005fout_005f53(_jspx_th_c_005fforEach_005f16, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f16))
            return true;
          out.write("</option>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f16.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f16[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f16.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f16.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f16);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f53(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f53 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f53.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f16);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1800,65) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f53.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tp.descricao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f53 = _jspx_th_c_005fout_005f53.doStartTag();
    if (_jspx_th_c_005fout_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f53);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f5 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f5.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f5 = _jspx_th_portlet_005factionURL_005f5.doStartTag();
    if (_jspx_eval_portlet_005factionURL_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_portlet_005fparam_005f2(_jspx_th_portlet_005factionURL_005f5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_portlet_005factionURL_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_portlet_005factionURL_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f5);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005factionURL_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag _jspx_th_portlet_005fparam_005f2 = (org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag) _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag.class);
    _jspx_th_portlet_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f5);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1855,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f2.setName("page");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1855,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f2.setValue("mainview");
    int _jspx_eval_portlet_005fparam_005f2 = _jspx_th_portlet_005fparam_005f2.doStartTag();
    if (_jspx_th_portlet_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f34 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f34.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f34.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1862,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f34.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f34 = _jspx_th_c_005furl_005f34.doStartTag();
    if (_jspx_th_c_005furl_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f34);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f35 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f35.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f35.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1876,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f35.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f35 = _jspx_th_c_005furl_005f35.doStartTag();
    if (_jspx_th_c_005furl_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f35);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f36 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f36.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f36.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1880,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f36.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f36 = _jspx_th_c_005furl_005f36.doStartTag();
    if (_jspx_th_c_005furl_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f36);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f37 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f37.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f37.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1884,50) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f37.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f37 = _jspx_th_c_005furl_005f37.doStartTag();
    if (_jspx_th_c_005furl_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f37);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f6 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f6.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f6.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f6 = _jspx_th_portlet_005factionURL_005f6.doStartTag();
    if (_jspx_eval_portlet_005factionURL_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_portlet_005fparam_005f3(_jspx_th_portlet_005factionURL_005f6, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_portlet_005factionURL_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_portlet_005factionURL_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f6);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005factionURL_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag _jspx_th_portlet_005fparam_005f3 = (org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag) _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag.class);
    _jspx_th_portlet_005fparam_005f3.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f6);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1940,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f3.setName("page");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1940,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f3.setValue("mainview");
    int _jspx_eval_portlet_005fparam_005f3 = _jspx_th_portlet_005fparam_005f3.doStartTag();
    if (_jspx_th_portlet_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f38 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f38.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f38.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1959,74) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f38.setValue("/images/buttons/search-2-16.png");
    int _jspx_eval_c_005furl_005f38 = _jspx_th_c_005furl_005f38.doStartTag();
    if (_jspx_th_c_005furl_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f38);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f17 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f17.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1966,36) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f17.setVar("tp");
    // /WEB-INF/jsp/clienteOperacoes.jsp(1966,36) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f17.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(1966,36) '${listTipoEndereco}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listTipoEndereco}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f17 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f17 = _jspx_th_c_005fforEach_005f17.doStartTag();
      if (_jspx_eval_c_005fforEach_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tp.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_005fout_005f54(_jspx_th_c_005fforEach_005f17, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f17))
            return true;
          out.write("</option>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f17.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f17[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f17.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f17.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f17);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f54(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f54 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f54.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f17);
    // /WEB-INF/jsp/clienteOperacoes.jsp(1967,69) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f54.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tp.descricao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f54 = _jspx_th_c_005fout_005f54.doStartTag();
    if (_jspx_th_c_005fout_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f54);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f7 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f7.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f7.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f7 = _jspx_th_portlet_005factionURL_005f7.doStartTag();
    if (_jspx_eval_portlet_005factionURL_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_portlet_005fparam_005f4(_jspx_th_portlet_005factionURL_005f7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_portlet_005factionURL_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_portlet_005factionURL_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f7);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005factionURL_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag _jspx_th_portlet_005fparam_005f4 = (org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag) _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag.class);
    _jspx_th_portlet_005fparam_005f4.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f7);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2085,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f4.setName("page");
    // /WEB-INF/jsp/clienteOperacoes.jsp(2085,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f4.setValue("mainview");
    int _jspx_eval_portlet_005fparam_005f4 = _jspx_th_portlet_005fparam_005f4.doStartTag();
    if (_jspx_th_portlet_005fparam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f39 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f39.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f39.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2091,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f39.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f39 = _jspx_th_c_005furl_005f39.doStartTag();
    if (_jspx_th_c_005furl_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f39);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f40 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f40.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f40.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2098,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f40.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f40 = _jspx_th_c_005furl_005f40.doStartTag();
    if (_jspx_th_c_005furl_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f40);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f41 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f41.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f41.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2105,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f41.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f41 = _jspx_th_c_005furl_005f41.doStartTag();
    if (_jspx_th_c_005furl_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f41);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f42 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f42.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f42.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2116,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f42.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f42 = _jspx_th_c_005furl_005f42.doStartTag();
    if (_jspx_th_c_005furl_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f42);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f43 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f43.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f43.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2128,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f43.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f43 = _jspx_th_c_005furl_005f43.doStartTag();
    if (_jspx_th_c_005furl_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f43);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f18 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f18.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2132,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f18.setVar("tipoRelacionamento");
    // /WEB-INF/jsp/clienteOperacoes.jsp(2132,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f18.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(2132,24) '${listaTipoRelacionamento}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaTipoRelacionamento}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f18 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f18 = _jspx_th_c_005fforEach_005f18.doStartTag();
      if (_jspx_eval_c_005fforEach_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoRelacionamento.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoRelacionamento.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f18.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f18[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f18.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f18.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f18);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f44 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f44.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f44.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2143,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f44.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f44 = _jspx_th_c_005furl_005f44.doStartTag();
    if (_jspx_th_c_005furl_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f44);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f45 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f45.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f45.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2156,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f45.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f45 = _jspx_th_c_005furl_005f45.doStartTag();
    if (_jspx_th_c_005furl_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f45);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f46 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f46.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f46.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2164,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f46.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f46 = _jspx_th_c_005furl_005f46.doStartTag();
    if (_jspx_th_c_005furl_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f46);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f47 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f47.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f47.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2172,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f47.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f47 = _jspx_th_c_005furl_005f47.doStartTag();
    if (_jspx_th_c_005furl_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f47);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f48 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f48.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f48.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2180,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f48.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f48 = _jspx_th_c_005furl_005f48.doStartTag();
    if (_jspx_th_c_005furl_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f48);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f19 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f19.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2184,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f19.setVar("tipoRelacionamento");
    // /WEB-INF/jsp/clienteOperacoes.jsp(2184,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f19.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(2184,24) '${listaTipoRelacionamento}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaTipoRelacionamento}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f19 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f19 = _jspx_th_c_005fforEach_005f19.doStartTag();
      if (_jspx_eval_c_005fforEach_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoRelacionamento.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoRelacionamento.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f19.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f19[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f19.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f19.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f19);
    }
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f8 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f8.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f8.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f8 = _jspx_th_portlet_005factionURL_005f8.doStartTag();
    if (_jspx_eval_portlet_005factionURL_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_portlet_005fparam_005f5(_jspx_th_portlet_005factionURL_005f8, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_portlet_005factionURL_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_portlet_005factionURL_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f8);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005factionURL_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag _jspx_th_portlet_005fparam_005f5 = (org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag) _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag.class);
    _jspx_th_portlet_005fparam_005f5.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f8);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2199,41) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f5.setName("page");
    // /WEB-INF/jsp/clienteOperacoes.jsp(2199,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f5.setValue("mainview");
    int _jspx_eval_portlet_005fparam_005f5 = _jspx_th_portlet_005fparam_005f5.doStartTag();
    if (_jspx_th_portlet_005fparam_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f49 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f49.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f49.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2205,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f49.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f49 = _jspx_th_c_005furl_005f49.doStartTag();
    if (_jspx_th_c_005furl_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f49);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f50 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f50.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f50.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2212,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f50.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f50 = _jspx_th_c_005furl_005f50.doStartTag();
    if (_jspx_th_c_005furl_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f50);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f51 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f51.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f51.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2223,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f51.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f51 = _jspx_th_c_005furl_005f51.doStartTag();
    if (_jspx_th_c_005furl_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f51);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f52 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f52.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f52.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2232,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f52.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f52 = _jspx_th_c_005furl_005f52.doStartTag();
    if (_jspx_th_c_005furl_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f52);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f53 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f53.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f53.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2243,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f53.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f53 = _jspx_th_c_005furl_005f53.doStartTag();
    if (_jspx_th_c_005furl_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f53);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f54 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f54.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f54.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2251,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f54.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f54 = _jspx_th_c_005furl_005f54.doStartTag();
    if (_jspx_th_c_005furl_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f54);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f55(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f55 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f55.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f55.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2259,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f55.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f55 = _jspx_th_c_005furl_005f55.doStartTag();
    if (_jspx_th_c_005furl_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f55);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f56 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f56.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f56.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2267,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f56.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f56 = _jspx_th_c_005furl_005f56.doStartTag();
    if (_jspx_th_c_005furl_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f56);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f57 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f57.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f57.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2281,42) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f57.setValue("/images/bullet_orange.png");
    int _jspx_eval_c_005furl_005f57 = _jspx_th_c_005furl_005f57.doStartTag();
    if (_jspx_th_c_005furl_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f57);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f20 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f20.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2389,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f20.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(2389,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f20.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(2389,12) '${perfis}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perfis}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f20 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f20 = _jspx_th_c_005fforEach_005f20.doStartTag();
      if (_jspx_eval_c_005fforEach_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_005fif_005f35(_jspx_th_c_005fforEach_005f20, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f20))
            return true;
          out.write("\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f20.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f20[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f20.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f20.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f20);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f20)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f35 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f35.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f20);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2390,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f35.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ 'PBM' == i.perfilTipo}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f35 = _jspx_th_c_005fif_005f35.doStartTag();
    if (_jspx_eval_c_005fif_005f35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            var cdsPerfilLista = ");
        if (_jspx_meth_c_005fout_005f55(_jspx_th_c_005fif_005f35, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f20))
          return true;
        out.write(";\r\n");
        out.write("            if (cdsPerfilLista == cdsPerfil) {\r\n");
        out.write("                jAlert(\"Benef\\u00edcio j\\u00e1 cadastrado!\", \"Cadastro de Cliente\");\r\n");
        out.write("                return;\r\n");
        out.write("            }\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f35);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f55(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f35, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f20)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f55 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f55.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f35);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2391,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f55.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.cdsPerfil}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f55 = _jspx_th_c_005fout_005f55.doStartTag();
    if (_jspx_th_c_005fout_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f55);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f21 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f21.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2416,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f21.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(2416,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f21.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(2416,16) '${perfis}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perfis}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f21 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f21 = _jspx_th_c_005fforEach_005f21.doStartTag();
      if (_jspx_eval_c_005fforEach_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                ");
          if (_jspx_meth_c_005fif_005f36(_jspx_th_c_005fforEach_005f21, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f21))
            return true;
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f21.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f21[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f21.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f21.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f21);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f21, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f21)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f36 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f36.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f21);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2417,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f36.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ 'SEGURADORA' == i.perfilTipo}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f36 = _jspx_th_c_005fif_005f36.doStartTag();
    if (_jspx_eval_c_005fif_005f36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                var cdsPerfilLista = ");
        if (_jspx_meth_c_005fout_005f56(_jspx_th_c_005fif_005f36, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f21))
          return true;
        out.write(";\r\n");
        out.write("                if (cdsPerfilLista == cdsPerfilSplit) {\r\n");
        out.write("                    jAlert(\"Benef\\u00edcio j\\u00e1 cadastrado!\", \"Cadastro de Cliente\");\r\n");
        out.write("                    return;\r\n");
        out.write("                }\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f36);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f56(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f36, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f21)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f56 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f56.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f36);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2418,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f56.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.cdsPerfil}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f56 = _jspx_th_c_005fout_005f56.doStartTag();
    if (_jspx_th_c_005fout_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f56);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f22 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f22.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2427,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f22.setVar("i");
    // /WEB-INF/jsp/clienteOperacoes.jsp(2427,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f22.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteOperacoes.jsp(2427,16) '${perfis}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${perfis}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f22 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f22 = _jspx_th_c_005fforEach_005f22.doStartTag();
      if (_jspx_eval_c_005fforEach_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                ");
          if (_jspx_meth_c_005fif_005f37(_jspx_th_c_005fforEach_005f22, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f22))
            return true;
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f22.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f22[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f22.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f22.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f22);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f22, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f22)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f37 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f37.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f22);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2428,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f37.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ 'PLANO_SAUDE' == i.perfilTipo}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f37 = _jspx_th_c_005fif_005f37.doStartTag();
    if (_jspx_eval_c_005fif_005f37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                var cdsPerfilLista = ");
        if (_jspx_meth_c_005fout_005f57(_jspx_th_c_005fif_005f37, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f22))
          return true;
        out.write(";\r\n");
        out.write("                if (cdsPerfilLista == cdsPerfilSplit) {\r\n");
        out.write("                    jAlert(\"Benef\\u00edcio j\\u00e1 cadastrado!\", \"Cadastro de Cliente\");\r\n");
        out.write("                    return;\r\n");
        out.write("                }\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f37);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f57(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f37, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f22)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f57 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f57.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f37);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2429,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f57.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.cdsPerfil}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f57 = _jspx_th_c_005fout_005f57.doStartTag();
    if (_jspx_th_c_005fout_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f57);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f58(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f58 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f58.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f58.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2498,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f58.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${atualizacaoDadosContato}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f58 = _jspx_th_c_005fout_005f58.doStartTag();
    if (_jspx_th_c_005fout_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f58);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f9 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f9.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f9.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f9 = _jspx_th_portlet_005factionURL_005f9.doStartTag();
    if (_jspx_th_portlet_005factionURL_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f9);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f10 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f10.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f10.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f10 = _jspx_th_portlet_005factionURL_005f10.doStartTag();
    if (_jspx_th_portlet_005factionURL_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f10);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f11 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f11.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f11.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f11 = _jspx_th_portlet_005factionURL_005f11.doStartTag();
    if (_jspx_th_portlet_005factionURL_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL_005fnobody.reuse(_jspx_th_portlet_005factionURL_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f59(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f59 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f59.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f59.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2760,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f59.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${selectTipoEmissor}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f59 = _jspx_th_c_005fout_005f59.doStartTag();
    if (_jspx_th_c_005fout_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f59);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f59);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f38 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f38.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f38.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2766,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f38.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${btnOfertas=='true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f38 = _jspx_th_c_005fif_005f38.doStartTag();
    if (_jspx_eval_c_005fif_005f38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <script>\r\n");
        out.write("        abrirPopUpCompletarCadastro();\r\n");
        out.write("    </script>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f38);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f39 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f39.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f39.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2773,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f39.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CADASTRO_OK != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f39 = _jspx_th_c_005fif_005f39.doStartTag();
    if (_jspx_eval_c_005fif_005f39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <!-- EQUIPARACAO TC / RAIA -->\r\n");
        out.write("    ");
        if (_jspx_meth_c_005fif_005f40(_jspx_th_c_005fif_005f39, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("    <!-- EQUIPARACAO TC / DROGASIL -->\r\n");
        out.write("    ");
        if (_jspx_meth_c_005fif_005f41(_jspx_th_c_005fif_005f39, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_005fif_005f39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f39);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f39, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f40 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f40.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f39);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2775,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f40.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f40 = _jspx_th_c_005fif_005f40.doStartTag();
    if (_jspx_eval_c_005fif_005f40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div></div>\r\n");
        out.write("            <script>\r\n");
        out.write("                jAlert('Cadastro alterado com sucesso!', \"Cadastro de Cliente\");\r\n");
        out.write("                $('#txtProduto').focus();\r\n");
        out.write("            </script>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f40.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f40);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f39, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f41 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f41.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f39);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2784,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f41.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f41 = _jspx_th_c_005fif_005f41.doStartTag();
    if (_jspx_eval_c_005fif_005f41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f42(_jspx_th_c_005fif_005f41, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f43(_jspx_th_c_005fif_005f41, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f41);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f41, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f42 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f42.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f41);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2785,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f42.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdTipoCadastramentoCliente != 12}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f42 = _jspx_th_c_005fif_005f42.doStartTag();
    if (_jspx_eval_c_005fif_005f42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div></div>\r\n");
        out.write("            <script>\r\n");
        out.write("                jAlert('Cadastro alterado com sucesso!', \"Cadastro de Cliente\");\r\n");
        out.write("                $('#txtProduto').focus();\r\n");
        out.write("            </script>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f42);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f41, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f43 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f43.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f41);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2793,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f43.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdTipoCadastramentoCliente == 12}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f43 = _jspx_th_c_005fif_005f43.doStartTag();
    if (_jspx_eval_c_005fif_005f43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div></div>\r\n");
        out.write("            <script>\r\n");
        out.write("                cliente = {\r\n");
        out.write("                    'nome': '");
        if (_jspx_meth_c_005fout_005f60(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                    'cartao': '");
        if (_jspx_meth_c_005fout_005f61(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fout_005f62(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                    'tipoCartao': '");
        if (_jspx_meth_c_005fout_005f63(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                    'dataCadastro': '");
        if (_jspx_meth_fmt_005fformatDate_005f8(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                    'rg': '");
        if (_jspx_meth_c_005fout_005f64(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                    'cpf': '");
        if (_jspx_meth_c_005fout_005f65(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        out.write("',\r\n");
        out.write("                    'nrCartaoClienteLogomarca': '");
        if (_jspx_meth_c_005fout_005f66(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        out.write("'\r\n");
        out.write("                };\r\n");
        out.write("                exibirImpressaoEtiqueta(cliente);\r\n");
        out.write("            </script>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f43.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f43);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f60(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f60 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f60.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2797,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f60.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f60 = _jspx_th_c_005fout_005f60.doStartTag();
    if (_jspx_th_c_005fout_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f60);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f60);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f61(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f61 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f61.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2798,31) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f61.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.cdCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f61 = _jspx_th_c_005fout_005f61.doStartTag();
    if (_jspx_th_c_005fout_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f61);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f61);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f62(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f62 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f62.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2798,75) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f62.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.dgCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f62 = _jspx_th_c_005fout_005f62.doStartTag();
    if (_jspx_th_c_005fout_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f62);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f62);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f63(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f63 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f63.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2799,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f63.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.tipoCartao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f63 = _jspx_th_c_005fout_005f63.doStartTag();
    if (_jspx_th_c_005fout_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f63);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2800,37) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f8.setPattern("dd/MM");
    // /WEB-INF/jsp/clienteOperacoes.jsp(2800,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f8.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataCadastro}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f8 = _jspx_th_fmt_005fformatDate_005f8.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f64(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f64 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f64.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2801,27) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f64.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.rg}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f64 = _jspx_th_c_005fout_005f64.doStartTag();
    if (_jspx_th_c_005fout_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f64);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f65(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f65 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f65.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2802,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f65.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cpf}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f65 = _jspx_th_c_005fout_005f65.doStartTag();
    if (_jspx_th_c_005fout_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f65);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f66(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f66 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f66.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2803,49) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f66.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.nrCartaoClienteLogomarca}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f66 = _jspx_th_c_005fout_005f66.doStartTag();
    if (_jspx_th_c_005fout_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f66);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f44 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f44.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f44.setParent(null);
    // /WEB-INF/jsp/clienteOperacoes.jsp(2811,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f44.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${limpaTela != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f44 = _jspx_th_c_005fif_005f44.doStartTag();
    if (_jspx_eval_c_005fif_005f44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <div></div>\r\n");
        out.write("    <script>$('#txtProduto').focus();</script>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f44.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f44);
    return false;
  }
}
