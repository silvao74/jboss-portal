package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.drogaraia.tc.portlet.RequestUtils;
import javax.portlet.*;
import java.util.*;

public final class atendimento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/portlet_2_0.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005factionURL;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005factionURL = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005factionURL.release();
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
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
      out.write('\n');
      br.com.drogaraia.tc.portlet.ConsultarClientePortlet2009 url = null;
      synchronized (_jspx_page_context) {
        url = (br.com.drogaraia.tc.portlet.ConsultarClientePortlet2009) _jspx_page_context.getAttribute("url", PageContext.PAGE_SCOPE);
        if (url == null){
          url = new br.com.drogaraia.tc.portlet.ConsultarClientePortlet2009();
          _jspx_page_context.setAttribute("url", url, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    FLAG_CARRINHO_EPHARMA  = '");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    FLAG_MAIS_FREQUENTES  = '");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    FLAG_MODAL_DESCONTO_PBM = '");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    FLAG_UNIVERS_IDENTIFICACAO_PLANO = '");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    FLAG_MODALCRMCRO = '");
      if (_jspx_meth_c_005fout_005f4(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    FLAG_MENU_PBM_ATENDIMENTO = '");
      if (_jspx_meth_c_005fout_005f5(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("    //cuponavelEpharma.setFlagCarrinhoEpharma(FLAG_CARRINHO_EPHARMA)\n");
      out.write("\n");
      out.write("    console.log(\"FLAG_CARRINHO_EPHARMA\",FLAG_CARRINHO_EPHARMA);\n");
      out.write("    console.log(\"FLAG_MAIS_FREQUENTES\",FLAG_MAIS_FREQUENTES);\n");
      out.write("    console.log(\"FLAG_MODAL_DESCONTO_PBM\",FLAG_MODAL_DESCONTO_PBM);\n");
      out.write("    console.log(\"FLAG_UNIVERS_IDENTIFICACAO_PLANO\",FLAG_UNIVERS_IDENTIFICACAO_PLANO );\n");
      out.write("    console.log(\"FLAG_MODALCRMCRO\",FLAG_MODALCRMCRO);\n");
      out.write("    console.log(\"FLAG_MENU_PBM_ATENDIMENTO\",FLAG_MENU_PBM_ATENDIMENTO);\n");
      out.write("\n");
      out.write("\n");
      out.write("    var baseURL = '");
      if (_jspx_meth_portlet_005factionURL_005f0(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    // JQuery\n");
      out.write("    $j(function () {\n");
      out.write("        $j(\"#txtEmpresa\").focusin(function () {\n");
      out.write("            // $j(\"#buttonMatricula\").css(\"display\", \"inline\");\n");
      out.write("            $j(\"#buttonCodRaia\").css(\"display\", \"none\");\n");
      out.write("            $j(\"#buttonCliente\").css(\"display\", \"none\");\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $j(\"#txtMatricula\").focusin(function () {\n");
      out.write("            // $j(\"#buttonMatricula\").css(\"display\", \"inline\");\n");
      out.write("            $j(\"#buttonCodRaia\").css(\"display\", \"none\");\n");
      out.write("            $j(\"#buttonCliente\").css(\"display\", \"none\");\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $j(\"#txtCodRaia\").focusin(function () {\n");
      out.write("            $j(\"#buttonCodRaia\").css(\"display\", \"inline\");\n");
      out.write("            $j(\"#buttonMatricula\").css(\"display\", \"none\");\n");
      out.write("            $j(\"#buttonCliente\").css(\"display\", \"none\");\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $j(\"#txtCpfAtendimento\").focusin(function () {\n");
      out.write("            $j(\"#buttonCliente\").css(\"display\", \"inline\");\n");
      out.write("            $j(\"#buttonMatricula\").css(\"display\", \"none\");\n");
      out.write("            $j(\"#buttonCodRaia\").css(\"display\", \"none\");\n");
      out.write("        });\n");
      out.write("        $j(\"#txtCpfUniversFacil\").focusin(function () {\n");
      out.write("            $j(\"#buttonCliente\").css(\"display\", \"inline\");\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    var listIdReserva = \"\";\n");
      out.write("\n");
      out.write("    // Executa funcao onStart na carga\n");
      out.write("    addLoadEvent(onstart);\n");
      out.write("\n");
      out.write("    // Tempo de Sessao - 5 minutos\n");
      out.write("    var sessionTime = 5 * (60000);\n");
      out.write("\n");
      out.write("    // Tempo de Sessao - 4 minutos\n");
      out.write("    var sessionTimeOneEtq = 5 * (50000);\n");
      out.write("\n");
      out.write("    function onstart() {\n");
      out.write("        \n");
      out.write("        // Poe foco no cliente\n");
      out.write("        shortcut.add(\"alt+c\", function () {\n");
      out.write("            document.getElementById('txtCpfAtendimento').focus();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Poe foco no produto\n");
      out.write("        shortcut.add(\"alt+p\", function () {\n");
      out.write("            document.getElementById('txtProduto').focus();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Session TimeOut - Vencimento da sessao\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Session TimeOut - Funcao de vencimento de sessao\n");
      out.write("    function sessionTimeOut() {\n");
      out.write("        /* if ( confirm(\"Sess\\u00e3o expirou - Deseja iniciar novo atendimento?\") ) {\n");
      out.write("\t\t\tnovoAtendimento();\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t// Session TimeOut - Inicia nova contagem de tempo\n");
      out.write("\t\t\tsetTimeout('sessionTimeOut();', sessionTime);\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}*/\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function sessionTimeOutEtqLembrete() {\n");
      out.write("        setTimeout('sessionTimeOutEtqLembrete();', sessionTimeOneEtq);\n");
      out.write("        var cdLogomarca = +LOGO_MARCA;\n");
      out.write("        var url = TERMINAL_CONSULTA_SERVICOS_URL + \"etiquetaLembrete\" + \"/pesquisaEtiquetaLembrete/\" + cdFilial + \"/\" + cdLogomarca;\n");
      out.write("        $j.ajax({\n");
      out.write("            type: 'GET',\n");
      out.write("            async: false,\n");
      out.write("            cache: false,\n");
      out.write("            contentType: 'application/json',\n");
      out.write("            url: url,\n");
      out.write("            success: function (ret) {\n");
      out.write("                if (ret.length > 0) {\n");
      out.write("                    var etq = '';\n");
      out.write("                    for (var i = 0; i < ret.length; i++) {\n");
      out.write("                        etq += '<tr class=\"campoEtiquetas\">'\n");
      out.write("                            + '<td>' + ret[i].dsAtendimento + '</td></tr>'\n");
      out.write("                    }\n");
      out.write("                    var tbEtiquetas = \"\";\n");
      out.write("                    tbEtiquetas = '<table><tr><td><h3 class=\"titulo\">Etiquetas  Pendentes para Impress&atilde;o</h3></td></tr></table>'\n");
      out.write("                        + '<table style=\"width:300px;background-color:#EDF0F0;border: 1px solid #FFFFFF\";>'\n");
      out.write("                        + etq\n");
      out.write("                        + '</table>';\n");
      out.write("                    document.getElementById('avisoLembreteEtiqueta').innerHTML = tbEtiquetas;\n");
      out.write("\n");
      out.write("                    $(\"#avisoLembreteEtiqueta\").dialog({\n");
      out.write("                        weight: 420,\n");
      out.write("                        modal: true,\n");
      out.write("                        autoOpen: true,\n");
      out.write("                        closeOnEscape: true\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            error: function (xhr, textStatus, thrownError) {\n");
      out.write("                toastr['warning']('Servi&ccedil;o indipon&iacute;vel no momento.', 'Etiquetas Faltantes')\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function buscaAtendente() {\n");
      out.write("\n");
      out.write("        var cdAtendente = document.getElementById('txtAtendente').value;\n");
      out.write("        if (cdAtendente == null || cdAtendente == \"\") {\n");
      out.write("            toastr['warning'](\"Um c&oacute;digo de atendente v&aacute;lido deve ser digitado.\", \"ATEN&Ccedil;&Atilde;O\");\n");
      out.write("            return\n");
      out.write("        }\n");
      out.write("        setCookie(\"cdAtendente\", cdAtendente);\n");
      out.write("        novoAtendimento('buscarAtendente');\n");
      out.write("        document.location.href = '/portal/tc/default/AtendimentoWindow?page=mainview&action=1&cdAtendente=' + cdAtendente;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function buscaCliente(clienteRecente) {\n");
      out.write("        // Limpa cesta de compras\n");
      out.write("        carrinhoCompras.limparDadosLocais();\n");
      out.write("        cuponavelSevenPdv.limparDadosLocais();\n");
      out.write("        cuponavelFuncional.limparDadosLocais();\n");
      out.write("        carrinhoComprasFP.limparDadosLocais();\n");
      out.write("        MyCart.clear();\n");
      out.write("        setCookie(\"isLembrete\", '');\n");
      out.write("        setCookie(\"arrayAutorizacao\", '');\n");
      out.write("\n");
      out.write("        if (!clienteRecente) {\n");
      out.write("            // obtem cpf digitado\n");
      out.write("            var cpf = document.getElementById('txtCpfAtendimento').value;\n");
      out.write("        } else {\n");
      out.write("            var cpf = clienteRecente.cpf\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        if (cpf.length > 0) {\n");
      out.write("            var ret = validarCPF(cpf);\n");
      out.write("\n");
      out.write("            // limpa Cpf\n");
      out.write("            cpf = cpf.replace(/[^\\d]/g, '');\n");
      out.write("\n");
      out.write("            // Valida Cpf e envia para processamento\n");
      out.write("            if (!ret) {\n");
      out.write("                toastr['warning']('Digite um CPF v&aacute;lido', 'ATEN&Ccedil;&Atilde;O')\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // var check = document.getElementById('optConvenio').checked;\n");
      out.write("\n");
      out.write("        // if(check){\n");
      out.write("        // \tbuscaCod();\n");
      out.write("        // }else{\n");
      out.write("\n");
      out.write("        if (clienteRecente) {\n");
      out.write("            clienteRecente.cart.recover = clienteRecente.cart.id\n");
      out.write("\n");
      out.write("            // atualiza atendente para carrinhos nao finalizados\n");
      out.write("            var infoAtendente = document.querySelector('#info div tr:last-child td')\n");
      out.write("            clienteRecente.cart.atendente = {\n");
      out.write("                'cdAtendente': +getCookie('cdAtendente'),\n");
      out.write("                'nmAtendente': (infoAtendente) ? infoAtendente.textContent.replace(/\"/g, '') : ''\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (clienteRecente.cart.status !== 'CONCLUIDO_TC') {\n");
      out.write("                MyCart.create([], clienteRecente.cart, true)\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            // else{\n");
      out.write("            // \tclienteRecente.cart.status = 'PENDENTE'\n");
      out.write("            // \tconsole.log('clonando carrinho', MyCart.create([], false, true))\n");
      out.write("            // \t// MyCart.create([],clienteRecente.cart,true)\n");
      out.write("            // }\n");
      out.write("            sessionStorage.setItem('_recoverCart', JSON.stringify(clienteRecente.cart))\n");
      out.write("        }\n");
      out.write("        document.location.href = '/portal/tc/cliente/ConsultaClienteWindow?page=mainview&action=1&atendimentoCpf=' + cpf;\n");
      out.write("        // }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function buscaClienteUnivers() {\n");
      out.write("    \tif(document.getElementById('nrCartao').value != '' && document.getElementById('txtCpfUniversFacil').value == ''){\n");
      out.write("    \t\tvalidaUniversAndMatriculaEmpresa();\n");
      out.write("    \t} else if(document.getElementById('txtCpfUniversFacil').value != '' && document.getElementById('nrCartao').value == ''){\n");
      out.write("    \t\tbuscaClienteUniversCpf();\n");
      out.write("    \t} else if(document.getElementById('txtCpfUniversFacil').value != '' && document.getElementById('nrCartao').value != ''){\n");
      out.write("    \t\ttoastr['warning']('Preencher apenas o ID Univers ou CPF', 'ATEN&Ccedil;&Atilde;O')\n");
      out.write("    \t}\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\tfunction buscaClienteUniversCpf(clienteRecente) {\n");
      out.write("\t // Limpa cesta de compras\n");
      out.write("        carrinhoCompras.limparDadosLocais();\n");
      out.write("        cuponavelSevenPdv.limparDadosLocais();\n");
      out.write("        cuponavelFuncional.limparDadosLocais();\n");
      out.write("        carrinhoComprasFP.limparDadosLocais();\n");
      out.write("        MyCart.clear();\n");
      out.write("        setCookie(\"isLembrete\", '');\n");
      out.write("        setCookie(\"arrayAutorizacao\", '');\n");
      out.write("     \tsetCookie(\"optTipo\", 'UNIVERS');\n");
      out.write("     \tvar cpf = '';\n");
      out.write("        if (!clienteRecente) {\n");
      out.write("            cpf = document.getElementById('txtCpfUniversFacil').value;\n");
      out.write("            var ret = validarCPF(cpf);\n");
      out.write("            if (!ret) {\n");
      out.write("                toastr['warning']('Digite um CPF v&aacute;lido', 'ATEN&Ccedil;&Atilde;O')\n");
      out.write("                return\n");
      out.write("            }\n");
      out.write("            cpf = cpf.replace(/\\D/g, '')\n");
      out.write("\t\t} else {\n");
      out.write("\t\t    cpf = clienteRecente.cpf\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("        document.location.href = '/portal/tc/cliente/ConsultaClienteWindow?page=mainview&action=1&cpf=' + cpf\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("    function buscaAvCliente() {\n");
      out.write("        // EQUIPARACAO TC - RAIA\n");
      out.write("        if (+LOGO_MARCA === 1) {\n");
      out.write("            setCookie(\"empresaUniversCodigo\", \"\");\n");
      out.write("        }\n");
      out.write("        document.location.href = '/portal/tc/cliente/ConsultaClienteWindow?page=mainview&action=1&atendimentoCpf=';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function buscaAvProduto() {\n");
      out.write("        document.location.href = '/portal/tc/produtoconsultasal/';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function buscaMatriculaEmpresa() {\n");
      out.write("\n");
      out.write("        if ((document.getElementById('txtEmpresa').value != \"\") && (document.getElementById('txtMatricula').value != \"\")) {\n");
      out.write("\n");
      out.write("            // Consulta por empresa matricula\n");
      out.write("            document.location.href = '/portal/tc/cliente/ConsultaClienteWindow?page=mainview&action=1&matricula=' +\n");
      out.write("                document.getElementById('txtMatricula').value + '&empresa=' + document.getElementById('txtEmpresa').value;\n");
      out.write("        } else {\n");
      out.write("            toastr['warning']('Os campos Empresa e Matr&iacute;cula devem estar preenchidos!');\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function buscaUnivers() {\n");
      out.write("        var optUnivers = (+LOGO_MARCA === 1) ? '3' : '4';\n");
      out.write("\n");
      out.write("        // EQUIPARACAO TC - RAIA\n");
      out.write("        if (+LOGO_MARCA === 1) {\n");
      out.write("            setCookie(\"empresaUniversCodigo\", $('#cdEmpresa').val());\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var cadastrarClienteUnimedVitoria = document.getElementById('cadastrarClienteUnimedVitoria').value;\n");
      out.write("        var cadastrarClienteUniversSaude = document.getElementById('cadastrarClienteUniversSaude').value;\n");
      out.write("        if (cadastrarClienteUniversSaude != 'true' && cadastrarClienteUnimedVitoria) {\n");
      out.write("            if (!matriculaValidaParaCadastroClienteUnimedVitoria()) {\n");
      out.write("                alert('Nr Plano Sa\\u00fade inv\\u00e1lido !');\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        if ((document.getElementById('nrCartao').value != \"\")) {\n");
      out.write("            document.location.href = '/portal/tc/cliente/ConsultaClienteWindow?page=mainview&action=1&cartao=' +\n");
      out.write("                document.getElementById('nrCartao').value;\n");
      out.write("        } else if ((document.getElementById('optUnivers').value === optUnivers) &&\n");
      out.write("            ((document.getElementById('txtEmpresa').value != \"\") &&\n");
      out.write("                (document.getElementById('txtMatricula').value != \"\")) &&\n");
      out.write("                cadastrarClienteUniversSaude != 'true') {\n");
      out.write("                var validaBin = false;\n");
      out.write("                if (document.getElementById('txtMatricula').value.length == 16){\n");
      out.write("                \tvalidaBin = listaCdEmpresaParaVerificarBin(document.getElementById('cdEmpresa').value);\n");
      out.write("                }\n");
      out.write("                document.location.href = '/portal/tc/cliente/ConsultaClienteWindow?page=mainview&action=1&matricula=' +\n");
      out.write("                document.getElementById('txtMatricula').value + '&empresa=' + document.getElementById('cdEmpresa').value +\n");
      out.write("                '&cadastrarClienteUnimedVitoria=' + cadastrarClienteUnimedVitoria+'&validaBin='+validaBin;\n");
      out.write("        } else if((document.getElementById('optUnivers').value === optUnivers) &&\n");
      out.write("        \t\tcadastrarClienteUniversSaude == 'true'){\n");
      out.write("                document.location.href = '/portal/tc/cliente/ConsultaClienteWindow?page=mainview&action=1&cpf=' +\n");
      out.write("                document.getElementById('txtCpfUniversSaude').value + '&cdEmpresa=' + document.getElementById('cdEmpresa').value + '&nmEmpresa=' + document.getElementById('txtEmpresa').value +\n");
      out.write("                '&nrBin=' + document.getElementById('nrBin').value + '&nrPosicaoInicBin=' + document.getElementById('nrPosicaoInicBin').value +\n");
      out.write("                '&nrDigitosBin=' + document.getElementById('nrDigitosBin').value + '&nrDigitosCartao=' + document.getElementById('nrDigitosCartao').value +\n");
      out.write("                '&cadastrarClienteUniversSaude=true&cadastrarClienteUnimedVitoria=false&cdContrato=' + document.getElementById('cdContrato').value;\n");
      out.write("        } else {\n");
      out.write("            alert('Os campos ID Univers ou Empresa e ID Cliente devem estar preenchidos!');\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function matriculaValidaParaCadastroClienteUnimedVitoria() {\n");
      out.write("        var count = 0;\n");
      out.write("\n");
      out.write("        var nrBin = document.getElementById('nrBin').value;\n");
      out.write("        if (nrBin == null || nrBin == '') {\n");
      out.write("            console.log('nrBin nao cadastrado. [nrBin=' + nrBin + ']');\n");
      out.write("            count++;\n");
      out.write("        }\n");
      out.write("        var nrPosicaoInicBin = document.getElementById('nrPosicaoInicBin').value;\n");
      out.write("        if (nrPosicaoInicBin == null || nrPosicaoInicBin == '' || nrPosicaoInicBin == 0) {\n");
      out.write("            console.log('nrPosicaoInicBin nao cadastrado. [nrPosicaoInicBin=' + nrPosicaoInicBin + ']');\n");
      out.write("            count++;\n");
      out.write("        }\n");
      out.write("        var nrDigitosBin = document.getElementById('nrDigitosBin').value;\n");
      out.write("        if (nrDigitosBin == null || nrDigitosBin == '' || nrDigitosBin == 0) {\n");
      out.write("            console.log('nrDigitosBin nao cadastrado. [nrDigitosBin=' + nrDigitosBin + ']');\n");
      out.write("            count++;\n");
      out.write("        }\n");
      out.write("        var nrDigitosCartao = document.getElementById(\"nrDigitosCartao\").value;\n");
      out.write("        if (nrDigitosCartao == null || nrDigitosCartao == '' || nrDigitosCartao == 0) {\n");
      out.write("            console.log('nrDigitosCartao nao cadastrado. [nrDigitosCartao=' + nrDigitosCartao + ']');\n");
      out.write("            nrDigitosCartao = 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Valida cliente Univers sem parametros\n");
      out.write("        if (0 < count) {\n");
      out.write("            return matriculaValidaParaCadastroClienteUniversPadrao();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var matriculaDigitada = document.getElementById('txtMatricula').value;\n");
      out.write("        var startSubstring = 0;\n");
      out.write("        if (nrPosicaoInicBin > 0) {\n");
      out.write("            startSubstring = nrPosicaoInicBin - 1;\n");
      out.write("        }\n");
      out.write("        var nrBinDigitado = matriculaDigitada.substring(startSubstring, nrDigitosBin);\n");
      out.write("        return (nrBin == nrBinDigitado\n");
      out.write("            && (nrDigitosCartao == matriculaDigitada.length || nrDigitosCartao == 0));\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function matriculaValidaParaCadastroClienteUniversPadrao() {\n");
      out.write("        var matriculaDigitada = document.getElementById('txtMatricula').value;\n");
      out.write("        var nrDigitosCartao = document.getElementById(\"nrDigitosCartao\").value;\n");
      out.write("        var nrBin = document.getElementById('nrBin').value;\n");
      out.write("        var nrPosicaoInicBin = document.getElementById('nrPosicaoInicBin').value;\n");
      out.write("        var nrDigitosBin = document.getElementById('nrDigitosBin').value;\n");
      out.write("        if (nrBin == '' && nrPosicaoInicBin == 0 && nrPosicaoInicBin == 0\n");
      out.write("            && nrDigitosBin == 0 && nrDigitosCartao > 0) {\n");
      out.write("            console.log('Cliente UNIVERS padrao [' + matriculaDigitada + '].');\n");
      out.write("            nrBin = ['111111', '222222', '333333', '444444', '555555', '666666', '777777', '888888', '999999', '000000', '123456'];\n");
      out.write("            nrDigitosBin = 6;\n");
      out.write("            var nrBinDigitado = matriculaDigitada.substring(nrPosicaoInicBin, nrDigitosBin);\n");
      out.write("            for (var i in nrBin) {\n");
      out.write("                if (nrBin[i] === nrBinDigitado) return false;\n");
      out.write("            }\n");
      out.write("            return nrDigitosCartao == matriculaDigitada.length || nrDigitosCartao == 0;\n");
      out.write("        } else {\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function validaUniversAndMatriculaEmpresa() {\n");
      out.write("        if ($('#optUnivers').is(':checked')) {\n");
      out.write("\n");
      out.write("            var inputNrCartao = document.querySelector('#nrCartao')\n");
      out.write("            var inputCPF = document.querySelector('#txtCpfUniversSaude')\n");
      out.write("            var inputMatricula = document.querySelector('#txtMatricula')\n");
      out.write("\n");
      out.write("            if (!inputNrCartao.value && inputCPF) {\n");
      out.write("                if (!inputCPF.value) {\n");
      out.write("                    toastr.warning('Informe um CPF')\n");
      out.write("                    inputCPF.focus()\n");
      out.write("                    return\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!validarCPF(inputCPF.value)) {\n");
      out.write("                    toastr['warning']('Digite um CPF v&aacute;lido', 'ATEN&Ccedil;&Atilde;O')\n");
      out.write("                    inputCPF.focus()\n");
      out.write("                    return\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (!inputNrCartao.value &&\n");
      out.write("                !inputCPF &&\n");
      out.write("                inputMatricula &&\n");
      out.write("                !inputMatricula.value) {\n");
      out.write("                toastr.warning('Informe um n&uacute;mero de matr&iacute;cula')\n");
      out.write("                inputMatricula.focus()\n");
      out.write("                return\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            validaCheckBoxRaiaOuDrogasil();\n");
      out.write("            buscaUnivers();\n");
      out.write("            carrinhoCompras.limparDadosLocais();\n");
      out.write("            cuponavelSevenPdv.limparDadosLocais();\n");
      out.write("            cuponavelFuncional.limparDadosLocais();\n");
      out.write("\t        //cuponavelEpharma.limparDadosLocais();\n");
      out.write("            carrinhoComprasFP.limparDadosLocais();\n");
      out.write("            setCookie(\"arrayAutorizacao\", '');\n");
      out.write("        } else {\n");
      out.write("            buscaMatriculaEmpresa();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function validaCheckBoxRaiaOuDrogasil(){\n");
      out.write("    \tif(+LOGO_MARCA === 2){\n");
      out.write("    \t\tdocument.getElementById('optUnivers').value = 4;\n");
      out.write("    \t}\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function recolherCampoCpf() {\n");
      out.write("    \t$('#divCpfAtendimento').slideUp();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function recolherCampos() {\n");
      out.write("    \t//$('#divCpfAtendimento').slideUp();\n");
      out.write("    \tif (!$('#optUnivers').is(':checked')) {\n");
      out.write("        \t$('#labelMaisFrequente').hide();\n");
      out.write("\n");
      out.write("    \t}\n");
      out.write("   \t}\n");
      out.write("\n");
      out.write("    function limparRadios() {\n");
      out.write("    \t//$('#optPlus').attr('checked', false);\n");
      out.write("    \t$('#optSimples').attr('checked', false);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function populaPlSaude() {\n");
      out.write("        var idClientePlanoSaude = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idClientePlanoSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("        var cdOrigemClientePlanoSaude = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdOrigemClientePlanoSaude}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("        var idClienteUnivers = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("        var univers = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url.univers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("        var universChecked = $('#optUnivers').is(':checked');\n");
      out.write("\n");
      out.write("        if ((idClientePlanoSaude != '0' && idClientePlanoSaude != \"\") &&\n");
      out.write("            (cdOrigemClientePlanoSaude != '0' && cdOrigemClientePlanoSaude != \"\") &&\n");
      out.write("            (idClienteUnivers != '0' && idClienteUnivers != \"\") && universChecked) {\n");
      out.write("\n");
      out.write("            var url = univers + \"/autorizador/rest/univers/cliente/empresa/plano_saude?idCliente=\" + idClientePlanoSaude + \"&tpOrigem=\" + cdOrigemClientePlanoSaude;\n");
      out.write("\n");
      out.write("            $j.ajax({\n");
      out.write("                type: 'GET',\n");
      out.write("                contentType: 'application/x-javascript',\n");
      out.write("                url: url,\n");
      out.write("                jsonp: \"callback\",\n");
      out.write("                dataType: \"jsonp\",\n");
      out.write("                success: function (data) {\n");
      out.write("                    $('#showPlSaude').show();\n");
      out.write("                    $('#infoPlSaude').text(data.empresaVO.nmFantasia + ' - ');\n");
      out.write("\n");
      out.write("                    document.getElementById('nrCartao').disabled = true;\n");
      out.write("                    document.getElementById('txtCpfUniversFacil').disabled = true;\n");
      out.write("                    document.getElementById('txtEmpresa').disabled = true;\n");
      out.write("                    document.getElementById('txtMatricula').disabled = true;\n");
      out.write("                    document.getElementById('buttonMatricula').style.display = 'none';\n");
      out.write("                    document.getElementById('infoPlSaude').style.display = 'inline';\n");
      out.write("                    $('#clienteNaoEncontrado').text('Cliente selecionado!');\n");
      out.write("                },\n");
      out.write("                error: function (erro) {\n");
      out.write("                    console.log(erro);\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("        } else if ((idClienteUnivers != '0' && idClienteUnivers != \"\") && universChecked) {\n");
      out.write("            document.getElementById('nrCartao').disabled = true;\n");
      out.write("            document.getElementById('txtCpfUniversFacil').disabled = true;\n");
      out.write("            document.getElementById('txtEmpresa').disabled = true;\n");
      out.write("            document.getElementById('txtMatricula').disabled = true;\n");
      out.write("            document.getElementById('buttonMatricula').style.display = 'none';\n");
      out.write("            $('#clienteNaoEncontrado').text('Cliente selecionado!');\n");
      out.write("\n");
      out.write("        } else {\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("\tfunction buscaCod() {\n");
      out.write("\t\tif (+LOGO_MARCA === 1) {\n");
      out.write("\t\t\tbuscaCodRaia();\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tbuscaCodDrogasil();\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("    function buscaCodRaia() {\n");
      out.write("        setCookie(\"empresaUniversCodigo\", \"\");\n");
      out.write("        if (document.getElementById('txtCodRaia').value != \"\") {\n");
      out.write("            document.location.href = '/portal/tc/cliente/ConsultaClienteWindow?page=mainview&action=1&matricula=' +\n");
      out.write("                document.getElementById('txtCodRaia').value;\n");
      out.write("        } else {\n");
      out.write("            alert(\"O campo C\\u00f3d. Raia deve estar preenchido!\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function buscaCodDrogasil() {\n");
      out.write("        var idNr = \"\"\n");
      out.write("        var opc = \"\"\n");
      out.write("        var cpf = document.getElementById('txtCpfAtendimento').value;\n");
      out.write("        var cod = document.getElementById('txtCodRaia').value;\n");
      out.write("\n");
      out.write("        if ( (cod == \"\") && (cpf == \"\")) {\n");
      out.write("            alert(\"O campo C\\u00f3d.Drogasil ou CPF devem estar preenchidos!\");\n");
      out.write("        } else {\n");
      out.write("            if(cod == \"\"){\n");
      out.write("                idNr = cpf;\n");
      out.write("                opc = \"cpf\"\n");
      out.write("            }else{\n");
      out.write("                idNr = cod;\n");
      out.write("                opc = \"cod\"\n");
      out.write("            }\n");
      out.write("            document.location.href= '/portal/tc/cliente/ConsultaClienteWindow?page=mainview&action=1&id_nr=' + idNr+'&opcao='+ opc;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function focaMatricula() {\n");
      out.write("        // Poe foco na matricula\n");
      out.write("        document.getElementById('txtMatricula').focus();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function buscaProduto() {\n");
      out.write("        var produto = document.getElementById('txtProduto').value;\n");
      out.write("        sessionStorage.removeItem('descricaoProduto');\n");
      out.write("        if (produto == \"\") {\n");
      out.write("            toastr['warning'](\"Entre com um c&oacute;digo de produto ou EAN ou nome do produto.\", 'Aten&ccedil;&atilde;o');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if (produto.length < 3) {\n");
      out.write("            toastr['warning'](\"Busca com texto deve ter pelo menos 3 d&iacute;gitos.\", 'Aten&ccedil;&atilde;o');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if (!temEspecial(produto)){\n");
      out.write("        \ttoastr['warning'](\"Busca com texto n&atilde;o deve conter caracteres especiais.\", 'Aten&ccedil;&atilde;o');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if (isNumeric(produto)) {\n");
      out.write("            var urlProduto = '/portal/tc/produto/ConsultaProdutoWindow?page=mainview&action=1&tipoConsulta=porCodigo&codigo=' + produto;\n");
      out.write("        } else {\n");
      out.write("            var urlProduto = '/portal/tc/produto/ConsultaProdutoWindow?page=mainview&action=1&tipoConsulta=porDsProduto&descricaoProduto=' + produto;\n");
      out.write("            \n");
      out.write("            if (filialTemBuscaUnificadaReact === '-1') {\n");
      out.write("                if (document.formulario.optPesquisa[0].checked == true) {\n");
      out.write("                    var urlProduto = '/portal/tc/produto/ConsultaProdutoWindow?page=mainview&action=1&tipoConsulta=porDsProduto&descricaoProduto=' + produto;\n");
      out.write("                } else if (document.formulario.optPesquisa[1].checked == true) {\n");
      out.write("                    var urlProduto = '/portal/tc/produto/ConsultaProdutoWindow?page=mainview&action=1&tipoConsulta=porDsPrincipioAtivo&descricaoProduto=' + produto;\n");
      out.write("                } else if (document.formulario.optPesquisa[4].checked == true) {\n");
      out.write("                    var urlProduto = '/portal/tc/produto/ConsultaProdutoWindow?page=mainview&action=1&tipoConsulta=porDsPrincipioAtivo&descricaoProduto=' + produto + '&idClientePlanoSaude=' + getCookie(\"idClientePlanoSaude\");\n");
      out.write("                }\n");
      out.write("            } else {\n");
      out.write("                sessionStorage.setItem('descricaoProduto', produto);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        clearUrlProdutoVoltarCookie();\n");
      out.write("\n");
      out.write("        addUrlProdutoVoltarCookie(urlProduto);\n");
      out.write("        document.location.href = urlProduto;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function temEspecial(prod){\n");
      out.write("\t\tvar reg = /^[0-9A-Za-z]+$/;\n");
      out.write("\t\treturn (reg.test(prod.replace(/( )+/g, '')));\n");
      out.write("    \t\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function isNumeric(str) {\n");
      out.write("        var regExp = /^[0-9]+$/;\n");
      out.write("        return (regExp.test(str));\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function persisteInputs() {\n");
      out.write("        setCookie(\"txtCpfAtendimento\", document.getElementById(\"txtCpfAtendimento\").value);\n");
      out.write("        setCookie(\"txtMatricula\", document.getElementById(\"txtMatricula\").value);\n");
      out.write("        setCookie(\"txtEmpresa\", document.getElementById(\"txtEmpresa\").value);\n");
      out.write("        setCookie(\"txtProduto\", document.getElementById(\"txtProduto\").value);\n");
      out.write("        setCookie(\"txtCpfUniversFacil\", document.getElementById(\"txtCpfUniversFacil\").value);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function restauraInputs() {\n");
      out.write("        document.getElementById(\"txtCpfAtendimento\").value = getCookie(\"txtCpfAtendimento\");\n");
      out.write("        document.getElementById(\"txtMatricula\").value = getCookie(\"txtMatricula\");\n");
      out.write("        document.getElementById(\"txtEmpresa\").value = getCookie(\"txtEmpresa\");\n");
      out.write("        document.getElementById(\"txtProduto\").value = getCookie(\"txtProduto\");\n");
      out.write("        document.getElementById(\"txtCpfUniversFacil\").value = getCookie(\"txtCpfUniversFacil\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function limpaInputs() {\n");
      out.write("        setCookie(\"txtCpfAtendimento\", \"\");\n");
      out.write("        setCookie(\"txtMatricula\", \"\");\n");
      out.write("        setCookie(\"txtEmpresa\", \"\");\n");
      out.write("        setCookie(\"txtProduto\", \"\");\n");
      out.write("        setCookie(\"txtCpfUniversFacil\",\"\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function novoAtendimento(buscarAtendente) {\n");
      out.write("\n");
      out.write("        // Limpa as entradas\n");
      out.write("        limpaInputs();\n");
      out.write("\n");
      out.write("        // Coloca tipo de cliente na opcao origem\n");
      out.write("        setCookie(\"optTipo\", 'PLUS');\n");
      out.write("\n");
      out.write("        // Limpa cesta de compras\n");
      out.write("        carrinhoCompras.limparDadosLocais();\n");
      out.write("        cuponavelSevenPdv.limparDadosLocais();\n");
      out.write("        cuponavelFuncional.limparDadosLocais();\n");
      out.write("\t    cuponavelEpharma.limparDadosLocais();\n");
      out.write("        carrinhoComprasFP.limparDadosLocais();\n");
      out.write("        MyCart.clear()\n");
      out.write("        setCookie(\"isLembrete\", '');\n");
      out.write("        setCookie(\"arrayAutorizacao\", '');\n");
      out.write("\n");
      out.write("        // Fecha menu\n");
      out.write("        setCookie(\"switchmenu\", \"\");\n");
      out.write("\n");
      out.write("        //Limpa id plano saude\n");
      out.write("        setCookie(\"idClientePlano\", \"\");\n");
      out.write("        setCookie(\"nmPlSaudeTemp\", \"\");\n");
      out.write("        setCookie(\"nrPlSaudeTemp\", \"\");\n");
      out.write("        setCookie(\"idClienteUnivers\", \"\");\n");
      out.write("        setCookie(\"cartaoUnivers\", 0);\n");
      out.write("        setCookie(\"cpfUnivers\", \"\");\n");
      out.write("        setCookie(\"obrigaCPFUnivers\", 0);\n");
      out.write("        setCookie(\"empresaUnivers\", \"\");\n");
      out.write("        setCookie(\"empresaUniversCodigo\", \"\");\n");
      out.write("        setCookieFilial();\n");
      out.write("\n");
      out.write("        if (buscarAtendente != 'buscarAtendente') {\n");
      out.write("            // Desloga Atendente\n");
      out.write("            document.location.href = '/portal/tc/default/AtendimentoWindow?page=mainview&action=1&novoAtendimento=1';\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        console.log(\"[HOME TC - ALERTAS E NOVIDADES >>>>> \", filialHomeTCAlertasNovidades)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function setCookieFilial(){\n");
      out.write("        var url = TERMINAL_CONSULTA_SERVICOS_URL + \"consultaFilial/getFilial/\" + cdFilial;\n");
      out.write("        var filialCookie = getCookie('FILIAL').split('<C>');\n");
      out.write("        var senhaCookie = filialCookie[4];\n");
      out.write("        setCookie(\"FILIAL\", \"\");\n");
      out.write("        $j.ajax({\n");
      out.write("            type: 'GET',\n");
      out.write("            async: false,\n");
      out.write("            url: url,\n");
      out.write("            dataType: 'json',\n");
      out.write("            contentType: 'application/json',\n");
      out.write("            success: function(result) {\n");
      out.write("                var cdFilial = \"0\";\n");
      out.write("                var cdFilialHistorico = \"0\";\n");
      out.write("                var cdCompanhia = \"0\";\n");
      out.write("                var codigoCD = \"0\";\n");
      out.write("                var labelVlrSenior = (+LOGO_MARCA === 1) ? \"true\" : \"0\"; // EQUIPARACAO TC RAIA/DROGASIL\n");
      out.write("                var tpversoes = \"\";\n");
      out.write("                var dsEndereco = \"\";\n");
      out.write("                var nrEndereco = \"0\";\n");
      out.write("                var nrCnpj = \"0\";\n");
      out.write("\n");
      out.write("                // EQUIPARACAO TC - RAIA/DROGASIL\n");
      out.write("                if (+LOGO_MARCA === 1) {\n");
      out.write("                        cdFilial = \t\t\tresult.cdFilial;\n");
      out.write("                        cdFilialHistorico = result.cdFilialHistorico;\n");
      out.write("                        cdCompanhia = \t\tresult.cdCompanhia;\n");
      out.write("                        codigoCD = \t\t\tresult.codigoCD;\n");
      out.write("                        labelVlrSenior = \tresult.labelVlrSenior;\n");
      out.write("                        tpversoes = \t\tresult.versoes;\n");
      out.write("                        dsEndereco =    \tresult.dsEndereco;\n");
      out.write("                        nrEndereco =    \tresult.nrEndereco;\n");
      out.write("                        nrCnpj\t   =  \t\tresult.nrCnpj;\n");
      out.write("\n");
      out.write("\n");
      out.write("                    // Seta dados da filial no cookie\n");
      out.write("                    filial = cdFilial + '<C>' + result.nmFilial + '<C>' + result.pcDescGerFilial + '<C>'\n");
      out.write("                        + result.ccraia + '<C>' + senhaCookie + '<C>' + cdFilialHistorico + '<C>' + cdCompanhia + '<C>'\n");
      out.write("                        + codigoCD + '<C>' + labelVlrSenior + '<C>' + tpversoes + '<C>' + dsEndereco + '<C>' + nrEndereco + '<C>' + nrCnpj;\n");
      out.write("\n");
      out.write("                } else { // DROGASIL\n");
      out.write("\n");
      out.write("                        cdFilial = \t\t\tresult.cdFilial;\n");
      out.write("                        cdFilialHistorico = result.cdFilialHistorico;\n");
      out.write("                        cdCompanhia = \t\tresult.cdCompanhia;\n");
      out.write("                        ipDoze = \t\t \tresult.ipDoze;\n");
      out.write("                        codigoCD = \t\t\tresult.codigoCD;\n");
      out.write("                        labelVlrSenior = \tresult.labelVlrSenior;\n");
      out.write("                        tpversoes = \t\tresult.versoes;\n");
      out.write("                        dsEndereco =    \tresult.dsEndereco;\n");
      out.write("                        nrEndereco =    \tresult.nrEndereco;\n");
      out.write("                        nrCnpj\t   =  \t\tresult.nrCnpj;\n");
      out.write("\n");
      out.write("                    // Seta dados da filial no cookie\n");
      out.write("                    filial = cdFilial + '<C>' + result.nmFilial + '<C>' + result.pcDescGerFilial + '<C>'\n");
      out.write("                        + result.ccraia + '<C>' + senhaCookie + '<C>' + cdFilialHistorico + '<C>' + cdCompanhia + '<C>' + ipDoze + '<C>' +\n");
      out.write("                        + codigoCD + '<C>' + labelVlrSenior + '<C>' + tpversoes + '<C>' + dsEndereco + '<C>' + nrEndereco + '<C>' + nrCnpj;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                setCookie(\"FILIAL\", filial);\n");
      out.write("\n");
      out.write("                console.log(filial);\n");
      out.write("\n");
      out.write("            },\n");
      out.write("            error: function (erro){\n");
      out.write("                console.log(erro);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function tipoCliente(tipo) {\n");
      out.write("\n");
      out.write("        // PLUS \n");
      out.write("        // SIMPLES \n");
      out.write("        // UNIVERS \n");
      out.write("        // CONVENIO /*cancelado*/\n");
      out.write("\n");
      out.write("        setCookie(\"optTipo\", tipo);\n");
      out.write("\n");
      out.write("        $('#txtEmpresa').autocomplete('disable');\n");
      out.write("        $('#txtEmpresa').val('');\n");
      out.write("        $('#txtEmpresa').attr('title', '');\n");
      out.write("        $('#txtPlSaude').autocomplete('disable');\n");
      out.write("        $('#txtPlSaude').val('');\n");
      out.write("        $('#txtPlSaude').attr('title', '');\n");
      out.write("\n");
      out.write("        if (tipo == 'PLUS') {\n");
      out.write("            document.formulario.optTipo[0].checked = true;\n");
      out.write("\n");
      out.write("            document.getElementById('divAtendimento').style.height = 'auto';\n");
      out.write("            // document.getElementById('divAtendimento').style.float = 'left';\n");
      out.write("            document.getElementById('divCpfAtendimento').style.display = 'block';\n");
      out.write("            document.getElementById('buttonCliente').style.display = 'inline';\n");
      out.write("            document.getElementById('txtCpfAtendimento').disabled = false;\n");
      out.write("\n");
      out.write("\t\t\t// EQUIPARACAO TC - DROGASIL\n");
      out.write("\t\t\tif (+LOGO_MARCA === 1) {\n");
      out.write("\t\t\t\tsetCookie(\"cartaoUnivers\", 0);\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("            if (idCliente == null) {\n");
      out.write("                // Desativa produto\n");
      out.write("                if (filialTemBuscaUnificadaReact === '-1') {\n");
      out.write("                    document.getElementById('labelProduto').style.color = 'gray';\n");
      out.write("                    document.getElementById('labelPrincAtivo').style.color = 'gray';\n");
      out.write("                }\n");
      out.write("                document.getElementById('txtProduto').disabled = true;\n");
      out.write("                document.getElementById('buttonProduto').style.display = 'none';\n");
      out.write("            } else {\n");
      out.write("                // Ativa produto\n");
      out.write("                if (filialTemBuscaUnificadaReact === '-1') {\n");
      out.write("                    document.getElementById('labelProduto').style.color = 'black';\n");
      out.write("                    document.getElementById('labelPrincAtivo').style.color = 'black';\n");
      out.write("                }\n");
      out.write("                document.getElementById('txtProduto').disabled = false;\n");
      out.write("                document.getElementById('buttonProduto').style.display = 'inline';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            document.getElementById('buttonMatricula').style.display = 'none';\n");
      out.write("            document.getElementById('buttonCodRaia').style.display = 'none';\n");
      out.write("            // document.getElementById('labelEmpresa').style.display = 'block';\n");
      out.write("\n");
      out.write("            document.getElementById('labelCodRaia').style.display = 'block';\n");
      out.write("            document.getElementById('txtCodRaia').style.display = 'block';\n");
      out.write("\n");
      out.write("            // Ativa cliente\n");
      out.write("            document.getElementById('txtCpfAtendimento').style.display = 'inline';\n");
      out.write("            document.getElementById('txtCpfUniversFacil').style.display = 'inline';\n");
      out.write("            document.getElementById('LinkBuscaAvancada').style.display = 'inline';\n");
      out.write("            document.getElementById('labelCliente').style.display = 'inline';\n");
      out.write("            document.getElementById('buttonCliente').style.display = 'inline';\n");
      out.write("            document.getElementById('LinkBuscaAvancada').style.display = 'inline';\n");
      out.write("\n");
      out.write("            //mostra Label Matricula\n");
      out.write("            // document.getElementById(\"labelMatricula\").style.display = \"inline\";\n");
      out.write("\n");
      out.write("            //oculta Univers\n");
      out.write("            document.getElementById('labelEmpresaUnivers').style.display = 'none';\n");
      out.write("            document.getElementById('labelNrUnivers').style.display = 'none';\n");
      out.write("\t\t\tdocument.getElementById('idUnivers').style.display = 'none';\n");
      out.write("            document.getElementById('divCartao').style.display = 'none';\n");
      out.write("            document.getElementById('showPlSaude').style.display = 'none';\n");
      out.write("\n");
      out.write("            // Desativa matricula\n");
      out.write("            document.getElementById('txtMatricula').disabled = true;\n");
      out.write("\n");
      out.write("            // Desativa empresa\n");
      out.write("            document.getElementById('txtEmpresa').disabled = true;\n");
      out.write("\n");
      out.write("            // Desativa cod raia\n");
      out.write("            document.getElementById('txtCodRaia').disabled = true;\n");
      out.write("\n");
      out.write("            // Limpa Cliente Simples do toolbar\n");
      out.write("            if (document.getElementById('toolbarCliente') != null) {\n");
      out.write("                document.getElementById('toolbarCliente').innerHTML = '';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Poe foco no cliente\n");
      out.write("            document.getElementById('txtCpfAtendimento').focus();\n");
      out.write("\n");
      out.write("\n");
      out.write("        } else if (tipo === 'UNIVERS') {\n");
      out.write("\n");
      out.write("            document.formulario.optTipo[2].checked = true;\n");
      out.write("\n");
      out.write("            $('#txtEmpresa').autocomplete('enable');\n");
      out.write("            $('#txtEmpresa').unbind('keypress');\n");
      out.write("            $('#txtEmpresa').attr('title', 'Digite a empresa para pesquisa');\n");
      out.write("            $('#txtPlSaude').autocomplete('enable');\n");
      out.write("            $('#txtPlSaude').unbind('keypress');\n");
      out.write("            $('#txtPlSaude').attr('title', 'Digite o nome do Plano de Saude para pesquisa');\n");
      out.write("\n");
      out.write("            // document.getElementById('buttonMatricula').style.display = 'inline';\n");
      out.write("            document.getElementById('buttonCodRaia').style.display = 'inline';\n");
      out.write("            // document.getElementById('labelEmpresa').style.display = 'none';\n");
      out.write("\t\t\tdocument.getElementById('idUnivers').style.display = 'block';\n");
      out.write("            document.getElementById('showPlSaude').style.display = 'none';\n");
      out.write("\n");
      out.write("            // Desativa Cliente\n");
      out.write("            document.getElementById('divCpfAtendimento').style.display = 'none';\n");
      out.write("\t\t\tdocument.getElementById('txtCpfAtendimento').disabled = true;\n");
      out.write("\t\t\tdocument.getElementById('labelCliente').style.color = 'gray';\n");
      out.write("\t\t\tdocument.getElementById('buttonCliente').style.display = 'none';\t\t\t\n");
      out.write("\t\t\tdocument.getElementById('LinkBuscaAvancada').style.display = 'none';\n");
      out.write("\n");
      out.write("            // Desativa Cliente\n");
      out.write("            if (idCliente == null) {\n");
      out.write("                // Desativa produto\n");
      out.write("                if (filialTemBuscaUnificadaReact === '-1') {\n");
      out.write("                    document.getElementById('labelPrincAtivo').style.color = 'gray';\n");
      out.write("                    document.getElementById('labelProduto').style.color = 'gray';\t\t\n");
      out.write("                }\n");
      out.write("                document.getElementById('txtProduto').disabled = true;\n");
      out.write("                document.getElementById('buttonProduto').style.display = 'none';\n");
      out.write("                recolherCampoCpf();\n");
      out.write("            } else {\n");
      out.write("                // Ativa produto\n");
      out.write("                if (filialTemBuscaUnificadaReact === '-1') {\n");
      out.write("                    document.getElementById('txtProduto').disabled = false;\n");
      out.write("                    document.getElementById('labelProduto').style.color = 'black';\t\t\n");
      out.write("                }\n");
      out.write("\t\t\t\t// document.getElementById('labelPrincAtivo').style.color = 'black';\n");
      out.write("                document.getElementById('buttonProduto').style.display = 'inline';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            //Oculta Label Matricula\n");
      out.write("            // document.getElementById(\"labelMatricula\").style.display = \"none\";\n");
      out.write("\n");
      out.write("            //Oculta cod Raia\n");
      out.write("            document.getElementById('txtCodRaia').style.display = \"none\";\n");
      out.write("            document.getElementById('labelCodRaia').style.display = \"none\";\n");
      out.write("            document.getElementById('buttonCodRaia').style.display = \"none\";\n");
      out.write("            console.log('daleee!')\n");
      out.write("\n");
      out.write("            //Ativa  Univers\n");
      out.write("            document.getElementById('GroupNrUnivers').style.display = 'none';\n");
      out.write("            document.getElementById('labelNrUnivers').disabled = false;\n");
      out.write("            document.getElementById(\"labelNrUnivers\").style.display = \"inline\";\n");
      out.write("            document.getElementById('labelEmpresaUnivers').style.display = 'inline';\n");
      out.write("            document.getElementById('divCartao').style.display = 'block';\n");
      out.write("            document.getElementById('nrCartao').disabled = false;\n");
      out.write("            document.getElementById('txtCpfUniversFacil').disabled = false;\n");
      out.write("            document.getElementById('labelClienteUnivers').disabled = false;\n");
      out.write("\n");
      out.write("            removeFieldsPlanoUniversSaude()\n");
      out.write("\n");
      out.write("            // Ativa Matricula\n");
      out.write("            document.getElementById('txtMatricula').disabled = false;\n");
      out.write("\n");
      out.write("            // Ativa empresa\n");
      out.write("            document.getElementById('txtEmpresa').disabled = false;\n");
      out.write("            //document.getElementById('labelEmpresa').style.color = 'black';\n");
      out.write("\n");
      out.write("            // Limpa Cliente Simples do toolbar\n");
      out.write("            if (document.getElementById('toolbarCliente') != null) {\n");
      out.write("                document.getElementById('toolbarCliente').innerHTML = '';\n");
      out.write("            }\n");
      out.write("            // Poe foco ID Univers\n");
      out.write("            document.getElementById('nrCartao').focus();\n");
      out.write("\n");
      out.write("        } else if ('SIMPLES') {\n");
      out.write("\n");
      out.write("            document.formulario.optTipo[1].checked = true;\n");
      out.write("\n");
      out.write("            document.getElementById('buttonMatricula').style.display = 'none';\n");
      out.write("            document.getElementById('buttonCodRaia').style.display = 'none';\n");
      out.write("            document.getElementById('buttonProduto').style.display = 'inline';\n");
      out.write("            document.getElementById('txtCpfAtendimento').style.display = 'inline';\n");
      out.write("            //document.getElementById('divCpfAtendimento').style.display = 'inline';\n");
      out.write("\n");
      out.write("\t\t\t// EQUIPARACAO TC - DROGASIL\n");
      out.write("\t\t\tif (+LOGO_MARCA === 1) {\n");
      out.write("\t\t\t\tsetCookie(\"cartaoUnivers\", 0);\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("            //oculta Univers\n");
      out.write("\t\t\tdocument.getElementById('idUnivers').style.display = 'none';\n");
      out.write("            document.getElementById('labelEmpresaUnivers').style.display = 'none';\n");
      out.write("            document.getElementById('labelNrUnivers').style.display = 'none';\n");
      out.write("            document.getElementById('divCartao').style.display = 'none';\n");
      out.write("            document.getElementById('showPlSaude').style.display = 'none';\n");
      out.write("\n");
      out.write("            // Ativa produto\n");
      out.write("            document.getElementById('txtProduto').disabled = false;\n");
      out.write("            document.getElementById('buttonProduto').style.display = 'inline';\n");
      out.write("\n");
      out.write("            // Desativa Cliente\n");
      out.write("            document.getElementById('txtCpfAtendimento').disabled = true;\n");
      out.write("\t\t\tdocument.getElementById('labelCliente').style.color = 'gray';\n");
      out.write("            document.getElementById('buttonCliente').style.display = 'none';\n");
      out.write("            recolherCampoCpf();\n");
      out.write("\n");
      out.write("            // Desativa matricula\n");
      out.write("            document.getElementById('txtMatricula').disabled = true;\n");
      out.write("\t\t\tdocument.getElementById('buttonMatricula').style.display = 'none';\n");
      out.write("            document.getElementById('LinkBuscaAvancada').style.display = 'none';\n");
      out.write("\n");
      out.write("            // Desativa empresa\n");
      out.write("            document.getElementById('txtEmpresa').disabled = true;\n");
      out.write("            // document.getElementById('labelEmpresa').style.display = 'inline';\n");
      out.write("\n");
      out.write("            // Desativa cod raia\n");
      out.write("            document.getElementById('txtCodRaia').style.display = \"inline\";\n");
      out.write("            document.getElementById('labelCodRaia').style.display = \"inline\";\n");
      out.write("            document.getElementById('txtCodRaia').disabled = true;\n");
      out.write("\n");
      out.write("            // Seta Cliente Simples no toolbar\n");
      out.write("            if (document.getElementById('toolbarClienteLogado') != null) {\n");
      out.write("                document.getElementById('toolbarClienteLogado').innerHTML = 'CLIENTE SIMPLES';\n");
      out.write("            }\n");
      out.write("            else if (document.getElementById('toolbarCliente') != null) {\n");
      out.write("                document.getElementById('toolbarCliente').innerHTML = 'CLIENTE SIMPLES';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (LOGO_MARCA === 1) { // EQUIPARACAO TC - RAIA\n");
      out.write("                if (document.getElementById('toolbarOfertasEPontos') != null) {\n");
      out.write("\n");
      out.write("                    if (document.getElementById('ccraia') != null) {\n");
      out.write("                        document.getElementById('ccraia').style.display = 'none';\n");
      out.write("                    }\n");
      out.write("                    if (document.getElementById('vms') != null) {\n");
      out.write("                        document.getElementById('vms').style.display = 'none';\n");
      out.write("                    }\n");
      out.write("                    document.getElementById('oe').style.display = 'none';\n");
      out.write("                    document.getElementById('sep1').style.display = 'none';\n");
      out.write("                    document.getElementById('sep2').style.display = 'none';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Poe foco no produto\n");
      out.write("            document.getElementById('txtProduto').focus();\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    function removeFieldsPlanoUniversSaude() {\n");
      out.write("        [\n");
      out.write("            \"#indUniversSaude\",\n");
      out.write("            \"#labelCPFUnivers\",\n");
      out.write("            \"#txtCpfUniversSaude\",\n");
      out.write("        ].forEach(function(item){\n");
      out.write("            if($(item))\n");
      out.write("            $(item).remove();\n");
      out.write("        })\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function getEmpresa() {\n");
      out.write("        setCookie(\"empresaUnivers\", $('#txtEmpresa').val());\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function loadImage(value) {\n");
      out.write("    \tif (value.carteirinha != undefined) {\n");
      out.write("\t    \tvar imagemRetornada = value.carteirinha;\n");
      out.write("\t\t\t$('#imgCarteirinha').attr(\"src\", \"data:image/png;base64,\" +imagemRetornada);\n");
      out.write("      \t\t$('#dicaUnivers').hide();\n");
      out.write("      \t\t$('#identificarUnivers').hide();\n");
      out.write("\t\t\t$('#cardUniver').show();\n");
      out.write("\t\t\t$('#urlFormularioApoio').attr('href',URL_FORMS_UNIVERS);\n");
      out.write("    \t}\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    function atualizarDicasDePreenchimento() {\n");
      out.write("\t\tvar dicaAusente = true;\n");
      out.write("\t\tvar idCompletaAusente = true;\n");
      out.write("\t\tvar carteirinhaAusente = true;\n");
      out.write("    \tvar url = INTEGRADOR_PBM + \"/univers/obterDadosPlano/\"\n");
      out.write("    \tvar space = \"\";\n");
      out.write("    \tvar universSelecionada = $('#txtEmpresa').val();\n");
      out.write("    \tuniversSelecionada = universSelecionada.replace(\"  \", \" \");\n");
      out.write("    \t$('#nomeUnivers').text(universSelecionada);\n");
      out.write("    \t$('#txtEmpresa').val(universSelecionada);\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t$j.ajax({\n");
      out.write("    \t\turl: url,\n");
      out.write("    \t\ttype:'POST',\n");
      out.write("    \t    headers: {\n");
      out.write("    \t        'Accept': 'application/json',\n");
      out.write("    \t        'Content-Type': 'application/json'\n");
      out.write("    \t    },\n");
      out.write("    \t\tdata: JSON.stringify({\n");
      out.write("    \t\t\tnomeContrato: $('#txtEmpresa').val(),\n");
      out.write("    \t\t\tbandeira: LOGO_MARCA\n");
      out.write("    \t\t}),\n");
      out.write("    \t\tdataType: 'json',\n");
      out.write("    \t\tasync: false,\n");
      out.write("    \t\tsuccess: function(data) {\n");
      out.write("    \t\t\tif (data.tipoResposta == 'SUCESSO') {\n");
      out.write("\n");
      out.write("\t        \t\tif(data.dsIdentificadorComplementar != undefined && data.dsIdentificadorComplementar != \"\") {\n");
      out.write("\t        \t\t\t$(\"#divInformacaoPreenchimento\").show();\n");
      out.write("\t        \t\t\t$('#textoDeApoio').text(data.dsIdentificadorComplementar);\n");
      out.write("\t        \t\t\t$('#labelTextoDeApoio').text(\"Informao adicional: \" + data.dsIdentificadorComplementar);\n");
      out.write("\t        \t\t\tidCompletaAusente = false;\n");
      out.write("\t    \t\t\t} else {\n");
      out.write("\t    \t\t\t\t$(\"#divInformacaoPreenchimento\").hide();\n");
      out.write("\t    \t\t\t}\n");
      out.write("\n");
      out.write("\t        \t\tif(data.dsIdentificadorPreenchimento != undefined && data.dsIdentificadorPreenchimento != \"\") {\n");
      out.write("\t\t\t\t\t\t$(\"#divInformacaoPreenchimentoCampo\").show();\n");
      out.write("\t    \t\t\t\t$('#identificacaoUnivers').text(space.concat(data.dsIdentificadorPreenchimento));\n");
      out.write("\t    \t\t\t\t$('#labelIdentificaoUnivers').text(\"Identificao: \" + data.dsIdentificadorPreenchimento);\n");
      out.write("\t    \t\t\t\tdicaAusente = false;\n");
      out.write("\t    \t\t\t} else {\n");
      out.write("\t    \t\t\t\t$(\"#divInformacaoPreenchimentoCampo\").hide();\n");
      out.write("\t    \t\t\t}\n");
      out.write("\n");
      out.write("\t    \t\t\tif(data.carteirinha != undefined && data.carteirinha != \"\") {\n");
      out.write("\t    \t\t\t\tcarteirinhaAusente = false;\n");
      out.write("\t    \t\t\t\tloadImage(data);\n");
      out.write("\t    \t\t\t}\n");
      out.write("\n");
      out.write("    \t\t\t} else if (data.tipoResposta == 'ERRO') {\n");
      out.write("\n");
      out.write("    \t\t\t\tif (dicaAusente || idCompletaAusente) {\n");
      out.write("\t    \t\t\t\t$('#cardUniver').hide();\n");
      out.write("\t    \t\t\t\t$('#identificarUnivers').hide();\n");
      out.write("\t    \t\t\t\t$('#dicaUnivers').show();\n");
      out.write("\t    \t\t\t}\n");
      out.write("\n");
      out.write("\t    \t\t\tif (dicaAusente && idCompletaAusente) {\n");
      out.write("\t    \t\t\t\t$('#cardUniver').hide();\n");
      out.write("\t    \t\t\t\t$('#dicaUnivers').hide();\n");
      out.write("\t    \t\t\t\t$('#identificarUnivers').show();\n");
      out.write("\t        \t\t\t$(\"#divInformacaoPreenchimento\").hide();\n");
      out.write("\t        \t\t\t$(\"#divInformacaoPreenchimentoCampo\").hide();\n");
      out.write("\t    \t\t\t}\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t},\n");
      out.write("    \t\terror: function(error) {\n");
      out.write("    \t\t\tconsole.log(\"Erro ao chamar o servio do terminal de consulta services para carregar as dicas de preenchimento!\", error);\n");
      out.write("    \t\t}\n");
      out.write("\t\t});\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //combo empresa\n");
      out.write("    $j(document).ready(function () {\n");
      out.write("\n");
      out.write("    \tif(FLAG_MAIS_FREQUENTES == \"false\"){\n");
      out.write("        \t$(\"#maisFrequente\").hide()\n");
      out.write("    \t}\n");
      out.write("\n");
      out.write("       \tif ($('#optUnivers').is(':checked')) {\n");
      out.write("       \t\tvar  maisFrequentesCookie = getCookie('maisFrequentesCookie');\n");
      out.write("       \t\t$('#labelMaisFrequente').show();\n");
      out.write("    \t\t$(\"#universMaisFrequentes\").html(maisFrequentesCookie);\n");
      out.write("       \t}\n");
      out.write("\n");
      out.write("        jQuery.support.cors = true;\n");
      out.write("\n");
      out.write("        populaPlSaude();\n");
      out.write("        limparRadios();\n");
      out.write("        recolherCampos();\n");
      out.write("        var univers = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url.univers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("        var autorizadorUnivers = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${autorizadorUnivers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("        \n");
      out.write("        function atualizaCartoesClienteUnivers(request , response){\n");
      out.write("        \tvar cpf = request.term;\n");
      out.write("        \tvar url = univers + \"/autorizador/rest/univers/cliente/cpf&\" + cpf;\n");
      out.write("        \t\n");
      out.write("        }\n");
      out.write("\t\tfunction  buscaCliCpfUnivers(ret){\n");
      out.write("\t\t\tdocument.formcliente.submit();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function atualizarItens(request, response) {\n");
      out.write("            var empresa = request.term;\n");
      out.write("            var url = univers + \"/autorizador/rest/univers/empresa/\"+LOGO_MARCA+\"/\" + empresa + \"/jsonp\";\n");
      out.write("            $j.ajax({\n");
      out.write("                type: 'GET',\n");
      out.write("                contentType: 'application/x-javascript',\n");
      out.write("                url: url,\n");
      out.write("                jsonp: \"callback\",\n");
      out.write("                dataType: \"jsonp\"\n");
      out.write("            }).fail(function (erro) {\n");
      out.write("                alert(\"Servi\\u00e7o de Consulta Univers est\\u00e1 Indispon\\u00edvel no momento!\", \"Terminal de Consulta\");\n");
      out.write("                response();\n");
      out.write("                console.log(erro.response);\n");
      out.write("            }).done(function (data) {\n");
      out.write("                var items = [];\n");
      out.write("                $.each(data, function (key, val) {\n");
      out.write("                    var empresa = {\n");
      out.write("                        label: val.nmFilial,\n");
      out.write("                        value: val.nmFilial,\n");
      out.write("                        cdFilial: val.cdFilial\n");
      out.write("                        ,\n");
      out.write("                        flCadastroUnimedVitoria: val.flCadastroTc,\n");
      out.write("                        flUniversSaude: val.flUniversSaude,\n");
      out.write("                        cdContrato: val.cdContrato,\n");
      out.write("                        nrBin: val.nrBin,\n");
      out.write("                        nrPosicaoInicBin: val.nrPosicaoInicBin\n");
      out.write("                        ,\n");
      out.write("                        nrDigitosBin: val.nrDigitosBin,\n");
      out.write("                        nrDigitosCartao: val.nrDigitosCartao\n");
      out.write("                    };\n");
      out.write("                    items.push(empresa);\n");
      out.write("                });\n");
      out.write("                response(items);\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        function handleAutocomplete(event, ui) {\n");
      out.write("\n");
      out.write("            if (!ui.item) {\n");
      out.write("                removeFieldsPlanoUniversSaude()\n");
      out.write("                document.querySelector('#buttonMatricula').style.display = 'none';\n");
      out.write("                document.querySelector('#GroupNrUnivers').style.display = 'none';\n");
      out.write("                return\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if($(\"#cdEmpresa\").val() === ui.item.cdFilial.toString()) {\n");
      out.write("                return\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if(FLAG_MAIS_FREQUENTES == \"true\"){\n");
      out.write("                setEmpOpSaude(ui.item.label);\n");
      out.write("            }\n");
      out.write("            $(\"#cdEmpresa\").val(ui.item.cdFilial);\n");
      out.write("            $(\"#cadastrarClienteUnimedVitoria\").val(ui.item.flCadastroUnimedVitoria);\n");
      out.write("            $(\"#cadastrarClienteUniversSaude\").val(ui.item.flUniversSaude);\n");
      out.write("\n");
      out.write("            $(\"#cdContrato\").val(ui.item.cdContrato); // rever -- essa informacao nao vem quando a empresa selecionada eh a fake\n");
      out.write("            document.querySelector('#GroupNrUnivers').style.display = 'none';\n");
      out.write("\n");
      out.write("            if(ui.item.flUniversSaude){\n");
      out.write("                if(!document.querySelector(\"#txtCpfUniversSaude\")) {\n");
      out.write("                    $(\"#txtEmpresa\").after('<label id=\"labelCPFUnivers\" class=\"miniLabel\" for=\"txtCpfUniversSaude\">CPF</label><input name=\"txtCpfUniversSaude\" class=\"miniInput2\" id=\"txtCpfUniversSaude\" style=\"display: inline;\" onkeypress=\"Mascara(this,Cpf);\" onkeydown=\"javascript: event.keyCode == 13 ? validaUniversAndMatriculaEmpresa() : null\" whenEnterExec(event,buscaClienteUniversCpf); type=\"text\" maxlength=\"14\">');\n");
      out.write("                    $(\"#txtEmpresa\").after('<p id=\"indUniversSaude\">Plano Univers Sa&uacute;de</p>');\n");
      out.write("                }\n");
      out.write("                document.querySelector('#txtCpfUniversSaude').focus()\n");
      out.write("            } else {\n");
      out.write("                if($(\"#indUniversSaude\"))\n");
      out.write("                    $(\"#indUniversSaude\").remove();\n");
      out.write("                if($(\"#labelCPFUnivers\"))\n");
      out.write("                    $(\"#labelCPFUnivers\").remove();\n");
      out.write("                if($(\"#txtCpfUniversSaude\"))\n");
      out.write("                    $(\"#txtCpfUniversSaude\").remove();\n");
      out.write("\n");
      out.write("                document.querySelector('#GroupNrUnivers').style.display = 'block';\n");
      out.write("                document.querySelector('#txtMatricula').focus()\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            document.getElementById('buttonMatricula').style.display = 'inline';\n");
      out.write("\n");
      out.write("            $(\"#nrBin\").val(ui.item.nrBin);\n");
      out.write("            $(\"#nrPosicaoInicBin\").val(ui.item.nrPosicaoInicBin);\n");
      out.write("            $(\"#nrDigitosBin\").val(ui.item.nrDigitosBin);\n");
      out.write("            $(\"#nrDigitosCartao\").val(ui.item.nrDigitosCartao);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $('#txtEmpresa').autocomplete({\n");
      out.write("            source: atualizarItens,\n");
      out.write("            minLength: 3,\n");
      out.write("            change: function (event, ui) {\n");
      out.write("                console.log('CHANGE >>>>', ui, $(\"#cdEmpresa\").val(), ui.item)\n");
      out.write("                handleAutocomplete(event, ui) },\n");
      out.write("            select: function (event, ui) {\n");
      out.write("                console.log('SELECT >>>>', ui, $(\"#cdEmpresa\").val(), ui.item)\n");
      out.write("                handleAutocomplete(event, ui) }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        if(FLAG_MAIS_FREQUENTES == \"true\" || FLAG_UNIVERS_IDENTIFICACAO_PLANO == \"true\"){\n");
      out.write("            $('#txtEmpresa').focusout(function(){\n");
      out.write("                var url = INTEGRADOR_PBM + \"/univers/obterDadosPlano/\"\n");
      out.write("                var space = \" \";\n");
      out.write("                if($('#txtEmpresa').val() == \"\" || $('#txtEmpresa').val() == undefined) {\n");
      out.write("\n");
      out.write("                    $('#identificacaoUnivers').text('');\n");
      out.write("                    $('#textoDeApoio').text('');\n");
      out.write("                } else {\n");
      out.write("                    atualizarDicasDePreenchimento();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#txtEmpresa').keyup(function(){\n");
      out.write("                var typingTimer;\n");
      out.write("\n");
      out.write("                var doneTypingInterval = 250;\n");
      out.write("\n");
      out.write("                var url = INTEGRADOR_PBM + \"/univers/obterDadosPlano/\"\n");
      out.write("                var space = \"\";\n");
      out.write("\n");
      out.write("                clearTimeout(typingTimer);\n");
      out.write("\n");
      out.write("                if($('#txtEmpresa').val() == \"\" || $('#txtEmpresa').val() == undefined) {\n");
      out.write("\n");
      out.write("                    $('#identificacaoUnivers').text('');\n");
      out.write("                    $('#textoDeApoio').text('');\n");
      out.write("                    $('#labelIdentificaoUnivers').text('');\n");
      out.write("                    $('#labelTextoDeApoio').text('');\n");
      out.write("                    $('#nomeUnivers').text('');\n");
      out.write("                    $('#cardUniver').hide();\n");
      out.write("                    $('#dicaUnivers').hide();\n");
      out.write("                    $('#identificarUnivers').hide();\n");
      out.write("                } else {\n");
      out.write("                    typingTimer = setTimeout(function() {\n");
      out.write("                        atualizarDicasDePreenchimento();\n");
      out.write("                      }, doneTypingInterval);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          $('#optPlus').change(function() {\n");
      out.write("              if ($('#optPlus').is(':checked')) {\n");
      out.write("                  $('#divCpfAtendimento').slideDown();\n");
      out.write("              } else {\n");
      out.write("                  $('#divCpfAtendimento').slideUp();\n");
      out.write("              }\n");
      out.write("          });\n");
      out.write("\n");
      out.write("\n");
      out.write("          $('#optSimples').change(function() {\n");
      out.write("              if ($('#optPlus').is(':checked')) {\n");
      out.write("                  $('#divCpfAtendimento').slideUp();\n");
      out.write("              }\n");
      out.write("          });\n");
      out.write("\n");
      out.write("\n");
      out.write("          $('#optUnivers').change(function(){\n");
      out.write("\n");
      out.write("              if(FLAG_MAIS_FREQUENTES == \"true\"){\n");
      out.write("\n");
      out.write("                  $('#cardUniver').hide();\n");
      out.write("                  $('#dicaUnivers').hide();\n");
      out.write("                  $('#identificarUnivers').hide();\n");
      out.write("                  $('#universMaisFrequentes').html('');\n");
      out.write("\n");
      out.write("                  var url = INTEGRADOR_PBM + \"/univers/obterMaisFrequentes/\"\n");
      out.write("                  var payload = JSON.stringify({\n");
      out.write("                      filial: cdFilial\n");
      out.write("                  });\n");
      out.write("\n");
      out.write("                  var ul = \"<ul class='ulTop5'>\"\n");
      out.write("\n");
      out.write("                  if (this.checked == true) {\n");
      out.write("                       $.ajax({\n");
      out.write("                          url: url,\n");
      out.write("                          headers: {\n");
      out.write("                              'Accept': 'application/json',\n");
      out.write("                              'Content-Type': 'application/json'\n");
      out.write("                          },\n");
      out.write("                          type:'POST',\n");
      out.write("                          dataType: 'json',\n");
      out.write("                          data: payload,\n");
      out.write("                          success: function(data) {\n");
      out.write("                                if( data != undefined || data != \"\") {\n");
      out.write("                                    if(data.hasOwnProperty('maisFrequentes')\n");
      out.write("                                            && data.maisFrequentes.length > 0){\n");
      out.write("                                        $.each(data.maisFrequentes, function (index, value){\n");
      out.write("                                            idPlano = value.univers+index\n");
      out.write("                                            ul+= '<li onclick=\"setEmpOpSaude(\\''+value.univers+'\\')\">'+value.univers+'</li>';\n");
      out.write("                                           });\n");
      out.write("                                        ul+= \"</ul>\"\n");
      out.write("                                        $(\"#universMaisFrequentes\").html(ul);\n");
      out.write("                                        setCookie(\"maisFrequentesCookie\", ul);\n");
      out.write("                                        $('#labelMaisFrequente').show();\n");
      out.write("                                      $('#universMaisFrequentes').append(\"<br/>\");\n");
      out.write("                                    }else{\n");
      out.write("                                      $('#labelMaisFrequente').hide();\n");
      out.write("                                    }\n");
      out.write("                                } else {\n");
      out.write("                                  $('#labelMaisFrequente').hide();\n");
      out.write("                              }\n");
      out.write("                          }\n");
      out.write("                      });\n");
      out.write("                  } else {\n");
      out.write("                      $('#universMaisFrequentes').append(\"\");\n");
      out.write("                  }\n");
      out.write("\n");
      out.write("              }\n");
      out.write("\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        function atualizarItensPlanoSaude(request, response) {\n");
      out.write("            var plSaude = request.term;\n");
      out.write("            var url = univers + \"/autorizador/rest/univers/empresa/plano_saude/\" + plSaude;\n");
      out.write("\n");
      out.write("            $j.ajax({\n");
      out.write("                type: 'GET',\n");
      out.write("                contentType: 'application/x-javascript',\n");
      out.write("                url: url,\n");
      out.write("                jsonp: \"callback\",\n");
      out.write("                dataType: \"jsonp\"\n");
      out.write("            }).fail(function (erro) {\n");
      out.write("                alert('erro:' + erro.statusText);\n");
      out.write("                response();\n");
      out.write("                console.log(erro.response);\n");
      out.write("            }).done(function (data) {\n");
      out.write("                var items = [];\n");
      out.write("                $.each(data, function (key, val) {\n");
      out.write("                    var plSaude = {label: val.nmFantasia, value: val.nmFantasia, cdEmpresa: val.cdEmpresa};\n");
      out.write("                    items.push(plSaude);\n");
      out.write("                });\n");
      out.write("                response(items);\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $('#txtPlSaude').autocomplete({\n");
      out.write("            source: atualizarItensPlanoSaude,\n");
      out.write("            minLength: 2,\n");
      out.write("            select: function (event, ui) {\n");
      out.write("                $(\"#cdEmpresaPlSaude\").val(ui.item.cdEmpresa);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('#cardUniver').click(function(){\n");
      out.write("            $(\"#dialog-carteirinha\").dialog({\n");
      out.write("                autoOpen: true,\n");
      out.write("                maxWidth: 600,\n");
      out.write("                maxHeight: 600,\n");
      out.write("                width: 600,\n");
      out.write("                height: 500,\n");
      out.write("                modal: true,\n");
      out.write("                position: {\"top\":20},\n");
      out.write("                closeOnEscape: true\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('#dicaUnivers').click(function(){\n");
      out.write("            window.open(URL_FORMS_UNIVERS);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $('#identificarUnivers').click(function(){\n");
      out.write("            window.open(URL_FORMS_UNIVERS);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    function buscarPlanoSaude() {\n");
      out.write("        var univers = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url.univers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("        var cdPlanoSaude = $(\"#cdEmpresaPlSaude\").val();\n");
      out.write("        var cartaoPlanoSaude = $(\"#txtCartaoPlSaude\").val();\n");
      out.write("        var url = univers + \"/autorizador/rest/univers/cliente/plano_saude/?empresa=\" + cdPlanoSaude + \"&cartao=\" + cartaoPlanoSaude;\n");
      out.write("\n");
      out.write("        $j.ajax({\n");
      out.write("            type: 'GET',\n");
      out.write("            contentType: 'application/x-javascript',\n");
      out.write("            url: url,\n");
      out.write("            jsonp: \"callback\",\n");
      out.write("            dataType: \"jsonp\"\n");
      out.write("        }).fail(function (erro) {\n");
      out.write("            alert('erro:' + erro.statusText);\n");
      out.write("            response();\n");
      out.write("            console.log(erro.response);\n");
      out.write("        }).done(function (data) {\n");
      out.write("            var rendered;\n");
      out.write("\n");
      out.write("            if (data.length > 0) {\n");
      out.write("                var lista = {clientes: data};\n");
      out.write("                var template = $('#templatePlanoSaudeClientes').html();\n");
      out.write("                Mustache.parse(template);\n");
      out.write("                rendered = Mustache.render(template, lista);\n");
      out.write("            } else {\n");
      out.write("                rendered = \"<h3 align='center'>Nenhum cliente encontrado!</h3>\"\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $('#divTblPlanoSaudeCliente').html(rendered).dialog({\n");
      out.write("                height: 250,\n");
      out.write("                width: 420,\n");
      out.write("                modal: true,\n");
      out.write("                autoOpen: true,\n");
      out.write("                buttons: {\n");
      out.write("                    Cancel: function () {\n");
      out.write("                        $(\"#txtPlSaude\").val(\"\");\n");
      out.write("                        $(\"#txtCartaoPlSaude\").val(\"\");\n");
      out.write("                        $(this).dialog(\"close\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function apagaEmpOpSaude(){\n");
      out.write("\n");
      out.write("   \t\tvar valor = $(\"#txtEmpresa\").val();\n");
      out.write("   \t\tif(valor == \"\"){\n");
      out.write("   \t\t\tif(FLAG_MAIS_FREQUENTES == \"true\"){\n");
      out.write("   \t\t\t\t$(\"#maisFrequente\").show();\n");
      out.write("   \t\t\t}\n");
      out.write("   \t    \t$('#cdEmpresa').val(\"\")\n");
      out.write("   \t    \t$(\"#cardUniver\").hide();\n");
      out.write("   \t    \t$(\"#dicaUnivers\").hide();\n");
      out.write("   \t    \t$(\"#identificarUnivers\").hide();\n");
      out.write("   \t    \t$(\"#divInformacaoPreenchimento\").hide();\n");
      out.write("   \t    \t$(\"#divInformacaoPreenchimentoCampo\").hide();\n");
      out.write("  \t\t}\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    function vinculaPlanoSaude(idPlanoSaude, cdTpOrigem) {\n");
      out.write("        var idClienteUnivers = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idClienteUnivers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("        setCookie(\"nmPlSaudeTemp\", $('#txtPlSaude').val());\n");
      out.write("        setCookie(\"nrPlSaudeTemp\", $('#txtCartaoPlSaude').val());\n");
      out.write("        var univers = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url.univers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("\n");
      out.write("        if (idClienteUnivers != 0 && idClienteUnivers != \"\") {\n");
      out.write("\n");
      out.write("            setCookie(\"idClientePlanoSaude\", idPlanoSaude);\n");
      out.write("            var url = univers + \"/autorizador/rest/univers/cliente/vincula_plano_saude?idClienteBlueSky=\" + idClienteUnivers + \"&idClientePlanoSaude=\" + idPlanoSaude + \"&cdOrigemClientePlanoSaude=\" + cdTpOrigem;\n");
      out.write("\n");
      out.write("            $j.ajax({\n");
      out.write("                type: 'GET',\n");
      out.write("                contentType: 'application/x-javascript',\n");
      out.write("                url: url,\n");
      out.write("                jsonp: \"callback\",\n");
      out.write("                dataType: \"jsonp\",\n");
      out.write("                success: function () {\n");
      out.write("                    $('#infoPlSaude').text($('#txtPlSaude').val() + ' - ');\n");
      out.write("                    alert(\"Plano de Sa\\u00fade selecionado com sucesso!\");\n");
      out.write("                    $(\"#divTblPlanoSaudeCliente\").dialog(\"close\");\n");
      out.write("                },\n");
      out.write("                error: function (erro) {\n");
      out.write("                    console.log(erro);\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function loadDadosConvenio(convenio) {\n");
      out.write("    \tvar urlUnivers = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url.univers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("    \tvar url = urlUnivers + \"/autorizador/rest/univers/empresa/\"+LOGO_MARCA+\"/\" + convenio + \"/jsonp\";\n");
      out.write("    \tvar codFilial = '';\n");
      out.write("\n");
      out.write("        $j.ajax({\n");
      out.write("            type: 'GET',\n");
      out.write("            contentType: 'application/x-javascript',\n");
      out.write("            url: url,\n");
      out.write("            jsonp: \"callback\",\n");
      out.write("            dataType: \"jsonp\"\n");
      out.write("        }).fail(function (erro) {\n");
      out.write("  \t    \t$('#cdEmpresa').val('')\n");
      out.write("        }).done(function (data) {\n");
      out.write("            var items = [];\n");
      out.write("            $.each(data, function (key, val) {\n");
      out.write("          \t\tif(val.nmFilial == convenio){\n");
      out.write("          \t    \tcodFilial = val.cdFilial;\n");
      out.write("          \t\t}\n");
      out.write("            });\n");
      out.write("            console.log('cod-filial',codFilial);\n");
      out.write("  \t    \t$('#cdEmpresa').val(codFilial);\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function setEmpOpSaude(value){\n");
      out.write("    \tloadDadosConvenio(value);\n");
      out.write("    \t$('#cdEmpresa').val()\n");
      out.write("    \t$(\"#txtEmpresa\").val(value);\n");
      out.write("    \t$(\"#maisFrequente\").hide();\n");
      out.write("    \t$(\"#divInformacaoPreenchimento\").show();\n");
      out.write("    \t$(\"#divInformacaoPreenchimentoCampo\").show();\n");
      out.write("    \tatualizarDicasDePreenchimento();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script id=\"templatePlanoSaudeClientes\" type=\"x-tmpl-mustache\">\n");
      out.write("\t<table id=\"tabClientePlanoSaude\" class=\"tabZebrada tabHighlight\" align=\"center\"\n");
      out.write("\t\tcellpadding=\"2\" cellspacing=\"0\" style=\"border:0px solid #bd0000; margin: 0px; width: 100%; height:auto;\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>Nome</th>\n");
      out.write("\t\t\t\t\t\t<th>Cpf</th>\n");
      out.write("\t\t\t\t\t\t<th>Matricula</th>\n");
      out.write("\t\t\t\t\t\t<th>Empresa</th>\n");
      out.write("\t\t\t\t\t\t<th></th>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t{{#clientes}}\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t{{nmCliente}}\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t{{nrCnpjCpf}}\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t{{nrMatrFuncional}}\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t{{cdEmpresa}}\n");
      out.write("\t\t\t\t\t\t\t</td>\t\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" class=\"planoLink\" value=\"Confirmar \" onclick=\"vinculaPlanoSaude({{idCliente}}, {{cdTpOrigem}})\"/>\n");
      out.write("\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t  \t \t</tr>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t{{/clientes}}\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t</table> \n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("/css/jquery.alerts.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("/css/jquery-ui.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("/css/jquery.ui.autocomplete.css\" />\n");
      out.write("\n");
      out.write("<div id=\"menu\" style=\"display: inline;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"divTblPlanoSaudeCliente\"\n");
      out.write("    title=\"Selecione o Plano de Sa&uacute;de\"></div>\n");
      out.write("<div id=\"avisoLembreteEtiqueta\" style=\"display: none;\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"dialog-carteirinha\" title=\"Identifica&ccedil;&atilde;o de cliente Univers\" style=\"display: none;\">\n");
      out.write("  <h3 id=\"nomeUnivers\"></h3>\n");
      out.write("  <label id=\"labelIdentificaoUnivers\"></label>\n");
      out.write("  <p></p>\n");
      out.write("  <label id=\"labelTextoDeApoio\"></label>\n");
      out.write("  <br />\n");
      out.write("   <p style=\"border: 1px solid #EDEDED;background-color: #EDEDED;font-size: 14px;padding: 8px;\">\n");
      out.write("\n");
      out.write("  \t<i class=\"fa fa-exclamation-triangle\" style=\"float:left; margin:0 7px 50px 0; color: red\"></i>\n");
      out.write("\n");
      out.write("  \t\tAlguma informa&ccedil;&atilde;o est faltando ou incorreta?\n");
      out.write("\n");
      out.write("\t  \t<a id=\"urlFormularioApoio\" target=\"_blank\" style=\"color: red; font-weight: bold;\">\n");
      out.write("\t  \t\tAjude a corrigir\n");
      out.write("\t  \t</a>\n");
      out.write("  </p>\n");
      out.write("  <p></p>\n");
      out.write("  <div align=\"center\">\n");
      out.write("   <img id=\"imgCarteirinha\" width=\"400\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write('\n');
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/jsp/atendimento.jsp(9,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/js/jquery-1.5.1.min.js");
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
    // /WEB-INF/jsp/atendimento.jsp(10,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/js/jquery-ui.min.js");
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
    // /WEB-INF/jsp/atendimento.jsp(11,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/js/mustache.min.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/jsp/atendimento.jsp(12,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/js/json2.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
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
    // /WEB-INF/jsp/atendimento.jsp(16,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoAcessaEpharmaCarrinhoPbm}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
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
    // /WEB-INF/jsp/atendimento.jsp(17,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoAcessaUniversMaisFrequentesPbm}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/atendimento.jsp(18,31) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoAcessaModalDescontoPbm}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent(null);
    // /WEB-INF/jsp/atendimento.jsp(19,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoUniversIndentificacaoPlano}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent(null);
    // /WEB-INF/jsp/atendimento.jsp(20,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoModalCrmPbm}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/atendimento.jsp(21,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PBMMenuAtendimento}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
    return false;
  }

  private boolean _jspx_meth_portlet_005factionURL_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:actionURL
    org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag _jspx_th_portlet_005factionURL_005f0 = (org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag) _005fjspx_005ftagPool_005fportlet_005factionURL.get(org.jboss.portal.portlet.impl.jsr286.taglib.ActionURL286Tag.class);
    _jspx_th_portlet_005factionURL_005f0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005factionURL_005f0.setParent(null);
    int _jspx_eval_portlet_005factionURL_005f0 = _jspx_th_portlet_005factionURL_005f0.doStartTag();
    if (_jspx_eval_portlet_005factionURL_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_portlet_005fparam_005f0(_jspx_th_portlet_005factionURL_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_portlet_005factionURL_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_portlet_005factionURL_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005factionURL.reuse(_jspx_th_portlet_005factionURL_005f0);
    return false;
  }

  private boolean _jspx_meth_portlet_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_005factionURL_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag _jspx_th_portlet_005fparam_005f0 = (org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag) _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.get(org.jboss.portal.portlet.impl.jsr286.taglib.URLParameter286Tag.class);
    _jspx_th_portlet_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_005factionURL_005f0);
    // /WEB-INF/jsp/atendimento.jsp(33,38) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setName("page");
    // /WEB-INF/jsp/atendimento.jsp(33,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setValue("mainview");
    int _jspx_eval_portlet_005fparam_005f0 = _jspx_th_portlet_005fparam_005f0.doStartTag();
    if (_jspx_th_portlet_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
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
    // /WEB-INF/jsp/atendimento.jsp(89,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operadorVO != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        setTimeout('sessionTimeOut();', sessionTime);\n");
        out.write("        ");
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
    // /WEB-INF/jsp/atendimento.jsp(93,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operadorVO != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        setTimeout('sessionTimeOutEtqLembrete();', sessionTimeOneEtq);\n");
        out.write("        ");
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

  private boolean _jspx_meth_c_005furl_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/jsp/atendimento.jsp(1536,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/jsp/atendimento.jsp(1538,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /WEB-INF/jsp/atendimento.jsp(1540,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
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
    // /WEB-INF/jsp/atendimento.jsp(1545,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PBMMenuAtendimento == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t    <form name=\"formulario\">\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t<div\n");
        out.write("\t\t\tstyle=\"display: flex; justify-content: center; align-items: center; margin: 15px 0px 0px 0px;\">\n");
        out.write("\t\t\t<label class=\"miniLabel\" for=\"txtAtendente\"\n");
        out.write("\t\t\t\tstyle=\"padding: 0 5px 0 0;\">Atendente</label> <input\n");
        out.write("\t\t\t\tstyle=\"width: 100%\" type=\"password\" id=\"txtAtendente\"\n");
        out.write("\t\t\t\tname=\"txtAtendente\" maxlength=8\n");
        out.write("                   onkeypress=\"Mascara(this, Integer); whenEnterExec(event, buscaAtendente);\"/>\n");
        out.write("            <i id=\"buttonAtendenteOK\" class=\"fa fa-sign-in-alt buttonAtendimento\" onclick=\"buscaAtendente()\"></i>\n");
        out.write("        </div>\n");
        out.write("\n");
        out.write("        <div id=\"atendimento\" style=\"display: none;\">\n");
        out.write("            <div class=\"espacoDoAtendente\">\n");
        out.write("                <button id=\"btNovoAtendimento\" style=\"width: 100%;\" type=\"button\"\n");
        out.write("                    class=\"buttonRefreshBig\" onclick=\"novoAtendimento()\" data-collect=\"atendimento|clicou|novo_atendimento\">\n");
        out.write("                    <i class=\"fa fa-sync-alt\"></i> Novo Atendimento\n");
        out.write("                </button>\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("            <div id=\"identificaCliente\">\n");
        out.write("\t\t\t\t<div id=\"divLabelAtendimento\">\n");
        out.write("\t\t\t\t\t<p></p>\n");
        out.write("\t\t\t\t\t<label id=\"labelAtendimento\" class=\"miniLabelSeparadores\" style=\"width: 160px; padding: 5px 4px; height: auto;\">Identifica&ccedil;&atilde;o do Cliente</label>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("                <div id=\"divAtendimento\" style=\"width: 160px; padding: 5px 4px; height: auto;\">\n");
        out.write("                    <div class=\"divRadioAtendimento blocoRadio\" style=\"width: 160px; padding: 5px 4px; height: auto;\">\n");
        out.write("                        <input type=\"radio\" name=\"optTipo\" id=\"optPlus\"\n");
        out.write("                        onclick=\"tipoCliente('PLUS')\" value=\"0\" data-collect=\"atendimento|clicou|plus\" /> <label\n");
        out.write("                        class=\"miniLabel\" for=\"optPlus\" style=\"vertical-align: 20%;\">\n");
        out.write("                        ");
        if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </label>\n");
        out.write("                    </div>\n");
        out.write("                    <div id=\"divCpfAtendimento\" class=\"blocosAtendimento\" style=\"padding: 5px 4px; width: 160px; height: auto; display: block;\">\n");
        out.write("\n");
        out.write("                        <label id=\"labelCliente\" class=\"miniLabel\"\n");
        out.write("\t\t\t\t\t\t\tfor=\"txtCpfAtendimento\">CPF</label><br />\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<input\n");
        out.write("\t\t\t\t\t\t\t\tclass=\"miniInput2\"\n");
        out.write("\t\t\t\t\t\t\t\ttype=\"text\"\n");
        out.write("\t\t\t\t\t\t\t\tid=\"txtCpfAtendimento\"\n");
        out.write("\t\t\t\t\t\t\t\tmaxlength=\"14\"\n");
        out.write("\t\t\t\t\t\t\t\tname=\"txtCpfAtendimento\"\n");
        out.write("\t\t\t\t\t\t\t\tonkeypress=\"Mascara(this, Cpf); whenEnterExec(event, buscaCliente);\"\n");
        out.write("\t\t\t\t\t\t\t/>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t<div>\n");
        out.write("\t\t\t\t \t\t\t<label class=\"miniLabel\">\n");
        out.write("\t\t\t\t\t \t\t\t<a id=\"LinkBuscaAvancada\"\n");
        out.write("\t\t\t\t\t \t\t\t\thref=\"#\"\n");
        out.write("\t\t\t\t\t \t\t\t\tonClick=\"buscaAvCliente();\">\n");
        out.write("\t\t\t\t\t \t\t\t\tBusca avan&ccedil;ada\n");
        out.write("                                 </a>\n");
        out.write("                        </label>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("                    <button\n");
        out.write("                        type=\"button\"\n");
        out.write("                        name=\"buttonCliente\"\n");
        out.write("                        class=\"btnLeftMenuV1\"\n");
        out.write("                        id=\"buttonCliente\"\n");
        out.write("                        onclick=\"buscaCliente()\">\n");
        out.write("                            Identificar\n");
        out.write("                    </button>\n");
        out.write("\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("                <div class=\"divRadioAtendimento blocoRadio\" style=\"width: 160px; padding: 5px 4px; height: auto;\">\n");
        out.write("                    <input type=\"radio\" name=\"optTipo\" id=\"optUnivers\"\n");
        out.write("                            onclick=\"tipoCliente('UNIVERS')\" value=\"3\" data-collect=\"atendimento|clicou|univers\" /> <label\n");
        out.write("                            class=\"miniLabel\" for=\"optUnivers\" style=\"vertical-align: 20%;\">Univers</label>\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("                <div id=\"idUnivers\" class=\"blocosAtendimento\" style=\"width: 160px; padding: 5px 4px; height: auto;\">\n");
        out.write("                    <div id=\"divCartao\" style=\"display: none;\">\n");
        out.write("                        <label id=\"labelNrCartao\" class=\"miniLabel\" for=\"nrCartao\">Identifica&ccedil;&atilde;o Univers</label>\n");
        out.write("                        <input class=\"miniInput2\" type=\"text\" id=\"nrCartao\" name=\"nrCartao\" maxlength=\"12\" placeholder=\"Identifica&ccedil;&atilde;o Univers\"\n");
        out.write("                        onkeypress=\"Mascara(this, Integer); whenEnterExec(event, validaUniversAndMatriculaEmpresa);\"/>\n");
        out.write("\n");
        out.write("                        <span class=\"minilabelOu\" align=\"center\" style=\"font-weight: bold;\">OU</span>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <div id=\"divCpfAtendimento\"\n");
        out.write("                            style=\"display: flex; flex-direction: column; justify-content: space-between; background-color: #F2F2F2\">\n");
        out.write("                            <label id=\"labelClienteUnivers\" class=\"miniLabel\"\n");
        out.write("                                for=txtCpfUniversFacil style=\"display: block;\">CPF</label>\n");
        out.write("                            <div>\n");
        out.write("\n");
        out.write("                                <input class=\"miniInput2\" type=\"text\" id=\"txtCpfUniversFacil\"\n");
        out.write("                                    maxlength=\"14\" name=\"txtCpfUniversFacil\" placeholder=\"CPF\"\n");
        out.write("                                    onkeypress=\"Mascara(this, Cpf); whenEnterExec(event, buscaClienteUniversCpf);\">\n");
        out.write("\n");
        out.write("\n");
        out.write("                                        <button\n");
        out.write("                                            type=\"button\"\n");
        out.write("                                            name=\"buttonCliente\"\n");
        out.write("                                            class=\"btnLeftMenuV1 buttonAtendimento\"\n");
        out.write("                                            id=\"buttonCliente\"\n");
        out.write("                                            onclick=\"buscaClienteUnivers()\">\n");
        out.write("                                                Identificar\n");
        out.write("                                        </button>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                <p align=\"center\" class=\"minilabelOu\" style=\"font-weight: bold;\">OU</p>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("\t\t\t\t\t<div id=\"divEmpresa\">\n");
        out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"idClientePlanoSaude\"\n");
        out.write("\t\t\t\t\t\t\tname=\"idClientePlanoSaude\" /> <label id=\"labelEmpresaUnivers\" class=\"miniLabel\" for=\"txtEmpresa\">Empresa /\n");
        out.write("\t\t\t\t\t\t\tOp.Sa&uacute;de</label>\n");
        out.write("\t\t\t\t\t\t\t<input class=\"miniInput2 ui-autocomplete-input\" type=\"text\" id=\"txtEmpresa\" name=\"txtEmpresa\" maxlength=\"8\" placeholder=\"Empresa / Op.Sa&uacute;de\"\n");
        out.write("\t\t\t\t\t\t\tonblur=\"getEmpresa();\" onchange=\"apagaEmpOpSaude()\" title=\"\" autocomplete=\"off\" role=\"textbox\" aria-autocomplete=\"list\" aria-haspopup=\"true\" disabled=\"\" />\n");
        out.write("\t\t\t\t\t\t\t<input type=\"hidden\" id=\"cdEmpresa\" /> <input type=\"hidden\"\tid=\"cadastrarClienteUnimedVitoria\" /> <input type=\"hidden\" id=\"nrBin\" />\n");
        out.write("\t\t\t\t\t\t\t<input type=\"hidden\" id=\"nrPosicaoInicBin\" /> <input type=\"hidden\" id=\"nrDigitosBin\" /> <input type=\"hidden\" id=\"nrDigitosCartao\" />\n");
        out.write("\t\t\t\t\t\t\t<input type=\"hidden\" id=\"cadastrarClienteUnimedVitoria\"/>\n");
        out.write("\n");
        out.write("                        <div id=\"maisFrequente\" class=\"maisFrequente\">\n");
        out.write("                            <label id=\"labelMaisFrequente\" class=\"miniLabeFreq\" style=\"display: none;\">Mais frequentes</label>\n");
        out.write("                                <br />\n");
        out.write("                            <div id=\"universMaisFrequentes\" class=\"miniLabelUnivers\"></div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <label id=\"labelNrUnivers\" class=\"miniLabel\" for=\"txtMatricula\"\n");
        out.write("                            style=\"float: left\">Identifica&ccedil;&atilde;o</label> <input\n");
        out.write("                            class=\"miniInput2\" type=\"text\" id=\"txtMatricula\"\n");
        out.write("                            name=\"txtMatricula\" maxlength=\"24\"\n");
        out.write("                            onkeypress=\"whenEnterExec(event, validaUniversAndMatriculaEmpresa);\" />\n");
        out.write("\n");
        out.write("                        <div>\n");
        out.write("                            <div id=\"divInformacaoPreenchimentoCampo\"\n");
        out.write("                                style=\"display: none; flex-direction: column; justify-content: space-between;\">\n");
        out.write("                                <span>\n");
        out.write("                                    <label id=\"identificacaoUnivers\" class=\"labelInfoPreenchimento\" />\n");
        out.write("                                    <p></p>\n");
        out.write("                                </span>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        <div id=\"divInformacaoPreenchimento\"\n");
        out.write("                            style=\"display: none; flex-direction: column; justify-content: space-between;\">\n");
        out.write("                            <label id=\"textoDeApoio\" class=\"labelDica\" /> <br />\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("                    <div>\n");
        out.write("                        <button\n");
        out.write("                            type=\"button\"\n");
        out.write("                            name=\"buttonMatricula\"\n");
        out.write("                            class=\"btnLeftMenuV1 buttonAtendimento\"\n");
        out.write("                            id=\"buttonMatricula\"\n");
        out.write("                            onclick=\"validaUniversAndMatriculaEmpresa()\">\n");
        out.write("                                Identificar\n");
        out.write("                        </button>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("                    <div id=\"cardUniver\" style=\"display: none;\" class=\"carteirinhaArea\">\n");
        out.write("\t\t\t\t\t\t\t<span class=\"cardUniver-id-icon\"></span>\n");
        out.write("\t\t\t\t\t\t\t<p>DIFICULDADE EM IDENTIFICAR?</p>\n");
        out.write("\t\t\t\t\t\t\t<small>Ver carteirinha</small>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t<div id=\"dicaUnivers\" style=\"display: none;\" class=\"carteirinhaArea_Dica_Ausente\">\n");
        out.write("\t\t\t\t\t\t\t<span class=\"carteirinha-id-icon\"></span>\n");
        out.write("\t\t\t\t\t\t\t<p>TEM DICA COMO INSERIR ESSE DADO?</p>\n");
        out.write("\t\t\t\t\t\t\t<small>Compartilhe com todos</small>\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t<div id=\"identificarUnivers\" style=\"display: none;\" class=\"carteirinhaArea_Id_Plano\">\n");
        out.write("\t\t\t\t\t\t\t<span class=\"carteirinha-id-icon\"></span>\n");
        out.write("\t\t\t\t\t\t\t<p>SABE QUAL A IDENTIFICA&Ccedil;&Atilde;O ?</p>\n");
        out.write("\t\t\t\t\t\t\t<small>Compartilhe com todos</small>\n");
        out.write("\t\t\t\t\t\t</div>\n");
        out.write("\n");
        out.write("                        <div id=\"showPlSaude\" style=\"display: none;\">\n");
        out.write("                            <div id=\"plSaude\">\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t<label id=\"labelPlSaude\" class=\"miniLabel\" for=\"txtPlSaude\">\n");
        out.write("\t\t\t\t\t\t\t\t\tOperadora de Sa&uacute;de\n");
        out.write("\t\t\t\t\t\t\t\t</label>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t<br />\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<input id=\"txtPlSaude\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tclass=\"miniInput2 ui-autocomplete-input\" type=\"text\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"size: 15px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtPlSaude\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tmaxlength=\"6\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tautocomplete=\"off\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\trole=\"textbox\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\taria-autocomplete=\"list\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\taria-haspopup=\"true\"\n");
        out.write("\t\t\t\t\t\t\t\t\t/><br />\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"cdEmpresaPlSaude\"\n");
        out.write("\t\t\t\t\t\t\t\t\t/>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<label id=\"labelCartaoPlSaude\"\tfor=\"txtCartaoPlSaude\" class=\"miniLabel\">Nr Plano\n");
        out.write("\t\t\t\t\t\t\t\t\tSa&uacute;de</label><br />\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<input\n");
        out.write("\t\t\t\t\t\t\t\t\t\tid=\"txtCartaoPlSaude\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tclass=\"miniInput2\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\ttype=\"text\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tname=\"txtCartaoPlSaude\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"size: 24px\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tmaxlength=\"24\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\tonkeypress=\"whenEnterExec(event, buscarPlanoSaude);\"\n");
        out.write("\t\t\t\t\t\t\t\t\t/>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<div>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<button\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"button\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"buttonMatricula\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btnLeftMenuV1 buttonAtendimento\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"buttonPlSaude\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"buscarPlanoSaude()\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tIdentificar\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        <div>\n");
        out.write("                            <label id=\"labelCodRaia\" class=\"miniLabel\" for=\"txtCodRaia\"\n");
        out.write("                                style=\"display: block;\">Cod. Raia</label> <input\n");
        out.write("                                class=\"miniInputCodRaia\" type=\"text\" id=\"txtCodRaia\"\n");
        out.write("                                name=\"txtCodRaia\" maxlength=\"9\"\n");
        out.write("                                onkeypress=\"Mascara(this, Integer); whenEnterExec(event, buscaCod);\"\n");
        out.write("                                disabled=\"\" style=\"display: block;\"> <i\n");
        out.write("                                id=\"buttonCodRaia\" class=\"fa fa-search buttonAtendimento\"\n");
        out.write("                                onclick=\"buscaCod()\" style=\"display: none;\"></i>\n");
        out.write("                        </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("                        <div class=\"divRadioAtendimento blocoRadio\" style=\"width: 160px; padding: 5px 4px; height: auto;\">\n");
        out.write("                        <input type=\"radio\" name=\"optTipo\" id=\"optSimples\"\n");
        out.write("                            onclick=\"tipoCliente('SIMPLES')\" value=\"1\" data-collect=\"atendimento|clicou|simples\" />\n");
        out.write("                        <label\n");
        out.write("                            class=\"miniLabel txt-semcartao-menu\"\n");
        out.write("                            for=\"optSimples\" style=\"vertical-align: 20%;\">\n");
        out.write("                            ");
        if (_jspx_meth_c_005fif_005f7(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        </label>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("            <!-- radio produto/principio ativo -->\n");
        out.write("\n");
        out.write("            <div style=\"width: 147px; padding: 5px 4px; display: table; margin-bottom: 8px\">\n");
        out.write("                <div>\n");
        out.write("\t\t\t\t<p></p>\n");
        out.write("\t\t\t\t<label class=\"miniLabelSeparadores\" style=\"width: 160px; padding: 5px 4px; height: auto;\">Busca por produto</label>\n");
        out.write("\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("\t\t\t<div\n");
        out.write("\t\t\t\tstyle=\"width: 155px; display: table; text-align: center;\">\n");
        out.write("\t\t\t\t<input class=\"miniInput2\" type=\"text\" id=\"txtProduto\"\n");
        out.write("\t\t\t\t\tname=\"txtProduto\" maxlength=18\n");
        out.write("\t\t\t\t\tonkeypress=\"whenEnterExec(event, buscaProduto)\"\n");
        out.write("\t\t\t\t\tstyle=\"width: 160px; float: left;\" />\n");
        out.write("\n");
        out.write("\n");
        out.write("<!-- \t\t\t\t\t<i id=\"buttonProduto\"\n");
        out.write("\t\t\t\t\tclass=\"fa fa-search buttonAtendimento\" onclick=\"buscaProduto()\"></i> -->\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t<div style=\"width: 190px;\">\n");
        out.write("\t\t\t\t\t<input checked=\"checked\" type=\"radio\" name=\"optPesquisa\"\n");
        out.write("                        onclick=\"document.querySelector('#buttonProduto').dataset.collect = 'busca|clicou|buscar_produto'\"\n");
        out.write("\t\t\t\t\t\tid=\"optPesquisaPorProduto\" value=\"pesquisaPorProduto\" /> <label\n");
        out.write("\t\t\t\t\t\tclass=\"labelPesquisaProd\" for=\"optPesquisaPorProduto\" id=\"labelProduto\">Produto</label>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<input type=\"radio\" name=\"optPesquisa\"\n");
        out.write("\t\t\t\t\t\tid=\"optPesquisaPorPrincipioAtivo\"\n");
        out.write("\t\t\t\t\t\tvalue=\"pesquisaPorPrincipioAtivo\" /> <label class=\"labelPesquisaProd\"\n");
        out.write("\t\t\t\t\t\tfor=\"optPesquisaPorPrincipioAtivo\"\n");
        out.write("\t\t\t\t\t\tid=\"labelPrincAtivo\">Princ&iacute;pio Ativo</label>\n");
        out.write("\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("\t\t\t\t<button\n");
        out.write("\t\t\t\t\ttype=\"button\"\n");
        out.write("\t\t\t\t\tname=\"buttonProduto\"\n");
        out.write("\t\t\t\t\tclass=\"btnLeftMenuV1 buttonAtendimento\"\n");
        out.write("\t\t\t\t\tid=\"buttonProduto\"\n");
        out.write("\t\t\t\t\tonclick=\"buscaProduto()\">\n");
        out.write("\t\t\t\t\t\tBuscar\n");
        out.write("\t\t\t\t</button>\n");
        out.write("\n");
        out.write("        </div>\n");
        out.write("        </div>\n");
        out.write("    </form>\n");
        out.write("\t");
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

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/atendimento.jsp(1548,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty listaDeReservasCanceladas}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <script>\n");
        out.write("                if ('' !== listIdReserva || 0 < listIdReserva.length) {\n");
        out.write("                    dialogos.exibeInfo('A reserva de produtos ' + listIdReserva.substring(0, (listIdReserva.length - 2)) + ' foi cancelada pelo cliente.', {\n");
        out.write("                        'Sim': function () {\n");
        out.write("                            var url = '/portal/tc/reservaProduto/ReservaProdutoWindow?page=mainview&action=1&todasReservas=1&listIdReserva=' + listIdReserva;\n");
        out.write("                            $(location).attr('href', url);\n");
        out.write("                            $j(this).dialog(\"close\");\n");
        out.write("                        },\n");
        out.write("                        'Nao': function () {\n");
        out.write("                            $j(this).dialog(\"close\");\n");
        out.write("                        }\n");
        out.write("                    });\n");
        out.write("                }\n");
        out.write("            </script>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /WEB-INF/jsp/atendimento.jsp(1549,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("reserva");
    // /WEB-INF/jsp/atendimento.jsp(1549,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/atendimento.jsp(1549,12) '${listaDeReservasCanceladas}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaDeReservasCanceladas}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                ");
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("            ");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/atendimento.jsp(1550,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdReservaOrigem != 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <script>\n");
        out.write("                        listIdReserva += ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" +\", \";\n");
        out.write("                    </script>\n");
        out.write("                ");
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

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/atendimento.jsp(1601,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Cart&atilde;o Raia");
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

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/atendimento.jsp(1601,84) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Drogasil");
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

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/atendimento.jsp(1817,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Cliente Simples");
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

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/atendimento.jsp(1818,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("S/Cart&atilde;o");
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

  private boolean _jspx_meth_c_005fif_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent(null);
    // /WEB-INF/jsp/atendimento.jsp(1878,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PBMMenuAtendimento != true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("\t\t<form name=\"formulario\">\n");
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f10(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\t\t<div style=\"display: flex; justify-content: center; align-items: center; margin: 15px 0px 0px 0px;\">\n");
        out.write("\t\t\t<label class=\"miniLabel\" for=\"txtAtendente\" style=\"padding: 0 5px 0 0;\">Atendente</label>\n");
        out.write("            <input style=\"width: 100%\" type=\"password\" id=\"txtAtendente\" name=\"txtAtendente\" maxlength=8\n");
        out.write("                   onkeypress=\"Mascara(this, Integer); whenEnterExec(event, buscaAtendente);\"/>\n");
        out.write("            <i id=\"buttonAtendenteOK\" class=\"fa fa-sign-in-alt buttonAtendimento\" onclick=\"buscaAtendente()\"></i>\n");
        out.write("        </div>\n");
        out.write("\n");
        out.write("        <div id=\"atendimento\" style=\"display: none;\">\n");
        out.write("            <div class=\"espacoDoAtendente\">\n");
        out.write("\t\t\t\t<button id=\"btNovoAtendimento\" style=\"width: 100%;\" type=\"button\"\n");
        out.write("\t\t\t\t\tclass=\"buttonRefreshBig\" onclick=\"novoAtendimento()\">\n");
        out.write("\t\t\t\t\t<i class=\"fa fa-sync-alt\"></i> Novo Atendimento\n");
        out.write("\t\t\t\t</button>\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("            <!-- radio tipoCliente CARTAO / SIMPLES / UNIVERS -->\n");
        out.write("            <div id=\"identificaCliente\">\n");
        out.write("\t\t\t\t<div id=\"divAtendimento\" style=\"padding: 4px 4px 16px; height: auto;\">\n");
        out.write("\t\t\t\t\t<div class=\"divRadioAtendimento\">\n");
        out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"optTipo\" id=\"optPlus\" onclick=\"tipoCliente('PLUS')\" value=\"0\" />\n");
        out.write("                        <label class=\"miniLabel\" for=\"optPlus\" style=\"vertical-align: 20%;\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f12(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_005fif_005f13(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </label>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<div class=\"divRadioAtendimento\">\n");
        out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"optTipo\" id=\"optSimples\" onclick=\"tipoCliente('SIMPLES')\" value=\"1\" />\n");
        out.write("                        <label class=\"miniLabel\" for=\"optSimples\" style=\"vertical-align: 20%;\">\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f14(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_005fif_005f15(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("                    </div>\n");
        out.write("\n");
        out.write("             \t\t<div class=\"divRadioAtendimento\">\n");
        out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"optTipo\" id=\"optUnivers\" onclick=\"tipoCliente('UNIVERS')\" value=\"3\" />\n");
        out.write("                        <label class=\"miniLabel\" for=\"optUnivers\" style=\"vertical-align: 20%;\">Univers</label>\n");
        out.write("                \t</div>\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("                <!-- Identifica Cliente CARTAO/PLUS -->\n");
        out.write("                <div id=\"divCpfAtendimento\">\n");
        out.write("                    <label id=\"labelCliente\" class=\"miniLabel\" for=\"txtCpfAtendimento\">CPF</label><br/>\n");
        out.write("                    <input class=\"miniInput2\" type=\"text\" id=\"txtCpfAtendimento\" maxlength=\"14\" name=\"txtCpfAtendimento\" onkeypress=\"Mascara(this, Cpf); whenEnterExec(event, buscaCliente);\"/>\n");
        out.write("                    <i id=\"buttonCliente\" class=\"fa fa-sign-in-alt buttonAtendimento\" onclick=\"buscaCliente()\"></i>\n");
        out.write("                    <br/>\n");
        out.write("                    <label class=\"miniLabel\"><a id=\"LinkBuscaAvancada\" href=\"#\" onClick=\"buscaAvCliente();\">Busca avan&ccedil;ada</a></label>\n");
        out.write("                </div>\n");
        out.write("\n");
        out.write("                <!-- Identifica Cliente UNIVERS -->\n");
        out.write("                <div id=\"idUnivers\">\n");
        out.write("                    <div id=\"divCartao\" style=\"display: none;\">\n");
        out.write("\n");
        out.write("                        <label id=\"labelNrCartao\" class=\"miniLabel\" for=\"nrCartao\">Identifica&ccedil;&atilde;o Univers</label>\n");
        out.write("                        <div class=\"groupInputButton\">\n");
        out.write("                            <input class=\"miniInput2\" type=\"text\" id=\"nrCartao\" name=\"nrCartao\" maxlength=\"12\"\n");
        out.write("                            onkeypress=\"Mascara(this, Integer); whenEnterExec(event, validaUniversAndMatriculaEmpresa);\"/>\n");
        out.write("                            <i id=\"buttonCliente\" class=\"fa fa-search buttonAtendimento\" onclick=\"validaUniversAndMatriculaEmpresa()\"></i>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        <span class=\"divisor-or\"></span>\n");
        out.write("\n");
        out.write("                        <div id=\"divCpfAtendimento\"\n");
        out.write("                            style=\"display: flex; flex-direction: column; justify-content: space-between;\">\n");
        out.write("                            <label id=\"labelClienteUnivers\" class=\"miniLabel\" for=txtCpfUniversFacil style=\"display: block;\">CPF</label>\n");
        out.write("                            <div class=\"groupInputButton\">\n");
        out.write("                                <input class=\"miniInput2\" type=\"text\" id=\"txtCpfUniversFacil\"\n");
        out.write("                                maxlength=\"14\" name=\"txtCpfUniversFacil\"\n");
        out.write("                                onkeypress=\"Mascara(this, Cpf); whenEnterExec(event, buscaClienteUniversCpf);\">\n");
        out.write("\n");
        out.write("                                <i id=\"buttonCliente\" data-cy=\"buttonUniversFacil\" class=\"fa fa-search buttonAtendimento\" onclick=\"buscaClienteUnivers()\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        <span class=\"divisor-or\"></span>\n");
        out.write("                    </div>\n");
        out.write("                    <div id=\"divEmpresa\">\n");
        out.write("                        <input type=\"hidden\" id=\"idClientePlanoSaude\"\n");
        out.write("                        name=\"idClientePlanoSaude\" />\n");
        out.write("                        <input type=\"hidden\" id=\"cdEmpresa\" />\n");
        out.write("                        <input type=\"hidden\" id=\"cadastrarClienteUnimedVitoria\" />\n");
        out.write("                        <input type=\"hidden\" id=\"nrBin\" />\n");
        out.write("                        <input type=\"hidden\" id=\"nrPosicaoInicBin\" />\n");
        out.write("                        <input type=\"hidden\" id=\"nrDigitosBin\" />\n");
        out.write("                        <input type=\"hidden\" id=\"nrDigitosCartao\" />\n");
        out.write("                        <input type=\"hidden\" id=\"cadastrarClienteUniversSaude\" />\n");
        out.write("                        <input type=\"hidden\" id=\"cdContrato\" />\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <div class=\"container-univers\">\n");
        out.write("                            <div class=\"container-inputs\">\n");
        out.write("                                <label id=\"labelNrUnivers\" class=\"miniLabel\" for=\"txtMatricula\" style=\"float:left\">ID Cliente / Nr Pl. Sa&uacute;de /</label>\n");
        out.write("                                <label id=\"labelNrUnivers\" class=\"miniLabel\" for=\"txtNrCartao\" style=\"float:left\">N&deg; do Cart&atilde;o de Cr&eacute;dito</label>\n");
        out.write("                                <input class=\"miniInput2\" type=\"text\" id=\"txtMatricula\" name=\"txtMatricula\" maxlength=\"24\" onkeypress=\"whenEnterExec(event, validaUniversAndMatriculaEmpresa);\" />\n");
        out.write("\n");
        out.write("                                <label id=\"labelEmpresaUnivers\" class=\"miniLabel\" for=\"txtEmpresa\">Empresa / Op. de Sa&uacute;de</label>\n");
        out.write("                                <input class=\"miniInput2 ui-autocomplete-input\" type=\"text\" id=\"txtEmpresa\" name=\"txtEmpresa\" maxlength=\"8\"\n");
        out.write("                                onblur=\"getEmpresa();\" onchange=\"apagaEmpOpSaude()\" title=\"\" autocomplete=\"off\" role=\"textbox\" aria-autocomplete=\"list\" aria-haspopup=\"true\" disabled=\"\" />\n");
        out.write("\n");
        out.write("                                <!--\n");
        out.write("                                <div id=\"maisFrequente\" class=\"maisFrequente\">\n");
        out.write("                                    <label id=\"labelMaisFrequente\" class=\"miniLabeFreq\" style=\"display: none;\">Mais frequentes</label>\n");
        out.write("                                    <div id=\"universMaisFrequentes\" class=\"miniLabelUnivers\"></div>\n");
        out.write("                                </div>\n");
        out.write("                                -->\n");
        out.write("\n");
        out.write("                                <div id=\"GroupNrUnivers\">\n");
        out.write("                                    <label id=\"labelNrUnivers\" class=\"miniLabel\" for=\"txtMatricula\" style=\"float: left\">Identifica&ccedil;&atilde;o</label>\n");
        out.write("                                    <input class=\"miniInput2\" type=\"text\" id=\"txtMatricula\" name=\"txtMatricula\" maxlength=\"24\" onkeypress=\"whenEnterExec(event, validaUniversAndMatriculaEmpresa);\" />\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("                            <i id=\"buttonMatricula\" class=\"fa fa-search buttonAtendimento\" onclick=\"validaUniversAndMatriculaEmpresa()\" style=\"display: none;\"></i>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("                        <div>\n");
        out.write("                            <div id=\"divInformacaoPreenchimentoCampo\"\n");
        out.write("                                style=\"display: none; flex-direction: column; justify-content: space-between;\">\n");
        out.write("                                <span>\n");
        out.write("                                    <label id=\"identificacaoUnivers\" class=\"labelInfoPreenchimento\" />\n");
        out.write("                                    <p></p>\n");
        out.write("                                </span>\n");
        out.write("                            </div>\n");
        out.write("\n");
        out.write("                            <div id=\"divInformacaoPreenchimento\"\n");
        out.write("                                style=\"display: none; flex-direction: column; justify-content: space-between;\">\n");
        out.write("                                <label id=\"textoDeApoio\" class=\"labelDica\" /> <br />\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        <div id=\"cardUniver\" style=\"display: none; cursor: pointer;\" class=\"carteirinhaArea\"></div>\n");
        out.write("                        <div id=\"dicaUnivers\" style=\"display: none;\" class=\"carteirinhaArea_Dica_Ausente\"></div>\n");
        out.write("                        <div id=\"identificarUnivers\" style=\"display: none;\" class=\"carteirinhaArea_Id_Plano\"></div>\n");
        out.write("\n");
        out.write("                        <div id=\"showPlSaude\" style=\"display: none;\">\n");
        out.write("                            <div id=\"plSaude\">\n");
        out.write("                                <label id=\"labelPlSaude\" class=\"miniLabel\" for=\"txtPlSaude\">Operadora de Sa&uacute;de</label><br />\n");
        out.write("\n");
        out.write("                                <input id=\"txtPlSaude\" class=\"miniInput2 ui-autocomplete-input\" type=\"text\" style=\"size: 15px\" name=\"txtPlSaude\" maxlength=\"6\" title=\"\" autocomplete=\"off\" role=\"textbox\" aria-autocomplete=\"list\" aria-haspopup=\"true\"/><br />\n");
        out.write("\n");
        out.write("                                <input type=\"hidden\" id=\"cdEmpresaPlSaude\" />\n");
        out.write("\n");
        out.write("                                <label id=\"labelCartaoPlSaude\"\tfor=\"txtCartaoPlSaude\" class=\"miniLabel\">Nr Plano\n");
        out.write("                                Sa&uacute;de</label><br />\n");
        out.write("                                <input id=\"txtCartaoPlSaude\" class=\"miniInput2\" type=\"text\" name=\"txtCartaoPlSaude\" style=\"size: 24px\" maxlength=\"24\" onkeypress=\"whenEnterExec(event, buscarPlanoSaude);\"\n");
        out.write("                                />\n");
        out.write("\n");
        out.write("                                <i id=\"buttonPlSaude\" class=\"fa fa-search buttonAtendimento\" onclick=\"buscarPlanoSaude()\"></i>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        <div>\n");
        out.write("                            <label id=\"labelCodRaia\" class=\"miniLabel\" for=\"txtCodRaia\"\n");
        out.write("                                style=\"display: block;\">Cod. Raia</label> <input\n");
        out.write("                                class=\"miniInputCodRaia\" type=\"text\" id=\"txtCodRaia\"\n");
        out.write("                                name=\"txtCodRaia\" maxlength=\"9\"\n");
        out.write("                                onkeypress=\"Mascara(this, Integer); whenEnterExec(event, buscaCod);\"\n");
        out.write("                                disabled=\"\" style=\"display: block;\"> <i\n");
        out.write("                                id=\"buttonCodRaia\" class=\"fa fa-search buttonAtendimento\"\n");
        out.write("                                onclick=\"buscaCod()\" style=\"display: none;\"></i>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_005fif_005f16(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("            <div style=\"width: 155px; padding: 5px 0px; display: table;\">\n");
        out.write("                <label for=\"txtProduto\">Busca de produto</label>\n");
        out.write("                <input class=\"miniInput2\" type=\"text\" id=\"txtProduto\" name=\"txtProduto\" maxlength=18\n");
        out.write("                        onkeypress=\"whenEnterExec(event, buscaProduto)\" style=\"width: 122px; float:left;\"/>\n");
        out.write("                <i id=\"buttonProduto\" class=\"fa fa-search buttonAtendimento\"\n");
        out.write("                   data-collect=\"busca|clicou|buscar_produto\"\n");
        out.write("                   onclick=\"buscaProduto()\"></i>\n");
        out.write("            </div>\n");
        out.write("\n");
        out.write("        </div>\n");
        out.write("        </form>\n");
        out.write("    ");
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

  private boolean _jspx_meth_c_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /WEB-INF/jsp/atendimento.jsp(1882,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty listaDeReservasCanceladas}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fif_005f10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <script>\n");
        out.write("                if ('' !== listIdReserva || 0 < listIdReserva.length) {\n");
        out.write("                    dialogos.exibeInfo('A reserva de produtos ' + listIdReserva.substring(0, (listIdReserva.length - 2)) + ' foi cancelada pelo cliente.', {\n");
        out.write("                        'Sim': function () {\n");
        out.write("                            var url = '/portal/tc/reservaProduto/ReservaProdutoWindow?page=mainview&action=1&todasReservas=1&listIdReserva=' + listIdReserva;\n");
        out.write("                            $(location).attr('href', url);\n");
        out.write("                            $j(this).dialog(\"close\");\n");
        out.write("                        },\n");
        out.write("                        'Nao': function () {\n");
        out.write("                            $j(this).dialog(\"close\");\n");
        out.write("                        }\n");
        out.write("                    });\n");
        out.write("                }\n");
        out.write("            </script>\n");
        out.write("        ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f10);
    // /WEB-INF/jsp/atendimento.jsp(1883,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("reserva");
    // /WEB-INF/jsp/atendimento.jsp(1883,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/atendimento.jsp(1883,12) '${listaDeReservasCanceladas}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaDeReservasCanceladas}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                ");
          if (_jspx_meth_c_005fif_005f11(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\n");
          out.write("            ");
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

  private boolean _jspx_meth_c_005fif_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/atendimento.jsp(1884,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdReservaOrigem != 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <script>\n");
        out.write("                        listIdReserva += ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" +\", \";\n");
        out.write("                    </script>\n");
        out.write("                ");
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

  private boolean _jspx_meth_c_005fif_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /WEB-INF/jsp/atendimento.jsp(1928,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Cart&atilde;o Raia");
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

  private boolean _jspx_meth_c_005fif_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /WEB-INF/jsp/atendimento.jsp(1929,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
    if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Drogasil");
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

  private boolean _jspx_meth_c_005fif_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /WEB-INF/jsp/atendimento.jsp(1936,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Cliente Simples");
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

  private boolean _jspx_meth_c_005fif_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /WEB-INF/jsp/atendimento.jsp(1937,28) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
    if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("S/Cart&atilde;o");
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

  private boolean _jspx_meth_c_005fif_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /WEB-INF/jsp/atendimento.jsp(2073,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemBuscaUnificadaReact != true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <!-- radio produto/principio ativo -->\n");
        out.write("                <div style=\"width: 147px; padding: 5px 4px; display: table;\">\n");
        out.write("                    <div>\n");
        out.write("                        <input checked=\"checked\" type=\"radio\" name=\"optPesquisa\" id=\"optPesquisaPorProduto\"\n");
        out.write("                                onclick=\"document.querySelector('#buttonProduto').dataset.collect = 'busca|clicou|buscar_produto'\"\n");
        out.write("                                value=\"pesquisaPorProduto\"/>\n");
        out.write("                        <label class=\"miniLabel\" for=\"optPesquisaPorProduto\" style=\"vertical-align: 20%;\"\n");
        out.write("                                id=\"labelProduto\">Produto</label>\n");
        out.write("                    </div>\n");
        out.write("                    <div>\n");
        out.write("                        <input type=\"radio\" name=\"optPesquisa\" id=\"optPesquisaPorPrincipioAtivo\"\n");
        out.write("                                onclick=\"document.querySelector('#buttonProduto').dataset.collect = 'busca|clicou|buscar_p_ativo'\"\n");
        out.write("                                value=\"pesquisaPorPrincipioAtivo\"/>\n");
        out.write("                        <label class=\"miniLabel\" for=\"optPesquisaPorPrincipioAtivo\" style=\"vertical-align: 20%;\"\n");
        out.write("                                id=\"labelPrincAtivo\">Princ. Ativo</label>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write('\n');
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
    // /WEB-INF/jsp/atendimento.jsp(2137,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operadorVO != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <script type=\"text/javascript\" src=\"");
        if (_jspx_meth_c_005furl_005f7(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\" charset=\"UTF-8\"></script>\n");
        out.write("        <script>\n");
        out.write("            document.getElementById(\"atendimento\").style.display = \"inline\";\n");
        out.write("\n");
        out.write("            tipoCliente(getCookie(\"optTipo\"));\n");
        out.write("\n");
        out.write("            var identificaClienteForm = document.querySelector(\"#identificaCliente\")\n");
        out.write("\n");
        out.write("            /**\n");
        out.write("             * Oculta possibilidade de mudar\n");
        out.write("             * tipo de cliente quando logado\n");
        out.write("             */\n");
        out.write("            // if (cliente) {\n");
        out.write("            // \tidentificaClienteForm.style.display = 'none'\n");
        out.write("            // } else {\n");
        out.write("            // \tidentificaClienteForm.style.display = 'block'\n");
        out.write("            // }\n");
        out.write("        </script>\n");
        out.write("    ");
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

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/jsp/atendimento.jsp(2138,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f7.setValue("/js/script-clientes-recentes.js");
    int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
    if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/jsp/atendimento.jsp(2157,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operadorVO == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <script>\n");
        out.write("            var OperadorInvalido = '");
        if (_jspx_meth_c_005fout_005f6(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("';\n");
        out.write("\n");
        out.write("            if (OperadorInvalido != '')\n");
        out.write("                toastr['error'](\"Atendente Inv&aacute;lido\", \"ERRO\");\n");
        out.write("\n");
        out.write("            document.getElementById('atendimento').style.display = \"none\";\n");
        out.write("            document.getElementById('txtAtendente').focus();\n");
        out.write("        </script>\n");
        out.write("    ");
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

  private boolean _jspx_meth_c_005fout_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /WEB-INF/jsp/atendimento.jsp(2159,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${OperadorInvalido}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
    if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
    return false;
  }
}
