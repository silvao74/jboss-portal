package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.drogaraia.tc.portlet.RequestUtils;
import javax.portlet.*;
import br.com.drogaraia.tc.vo.Cliente;

public final class toolbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/portlet_2_0.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005factionURL;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005factionURL = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fportlet_005factionURL.release();
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link id=\"myLink\" rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("css/");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("estilo.css\"/>\n");
      out.write("<link id=\"vizinhancaStylesheet\" rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("<link id=\"reservaEstLjStylesheet\" rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("css/reserva-estoque-loja-iframe.css\" />\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t// Obtem Variaveis de Ambiente\n");
      out.write("\tvar LOGO_MARCA = '");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\tvar ofertasExclusivasUrl = '");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar ccraiaUrl = '");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar terminalConsultaServicosUrl = '");
      if (_jspx_meth_c_005fout_005f4(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var TERMINAL_CONSULTA_SERVICOS_URL = '");
      if (_jspx_meth_c_005fout_005f5(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var integracaoServicoUrl = '");
      if (_jspx_meth_c_005fout_005f6(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var EMISSOR_NFE_WEB_URL = '");
      if (_jspx_meth_c_005fout_005f7(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar FARMACIA_POPULAR_SERVICOS_URL = '");
      if (_jspx_meth_c_005fout_005f8(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar FARMACIA_POPULAR_IMAGENS_URL = '");
      if (_jspx_meth_c_005fout_005f9(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar appTime = 1 * (60000);\n");
      out.write("\tvar qtdPedidos = 0;\n");
      out.write("\tvar blink = true;\n");
      out.write("\tvar celularPesquisado = new Array(1);\n");
      out.write("\tvar urlNovaPaginaEstoqueProximidade = '");
      if (_jspx_meth_c_005fout_005f10(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar urlNovoCadastroClientePbmr = '");
      if (_jspx_meth_c_005fout_005f11(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar hostFastPassServices =  '");
      if (_jspx_meth_c_005fout_005f12(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var hostUltimasComprasPbm = '");
      if (_jspx_meth_c_005fout_005f13(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar urlHomePerfilCliente =  '");
      if (_jspx_meth_c_005fout_005f14(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var hostCarrinhoServices =  '");
      if (_jspx_meth_c_005fout_005f15(_jspx_page_context))
        return;
      out.write("'; //'http://10.1.55.94:8082'\n");
      out.write("\tvar hostOfexServices =  '");
      if (_jspx_meth_c_005fout_005f16(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var hostInclusaoNrCartaoBeneficio = '");
      if (_jspx_meth_c_005fout_005f17(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar fileUploadHost = '");
      if (_jspx_meth_c_005fout_005f18(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar fileUploadPort = '");
      if (_jspx_meth_c_005fout_005f19(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar RDAUTORIZADOR_URL = '");
      if (_jspx_meth_c_005fout_005f20(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var clienteEspecial = '");
      if (_jspx_meth_c_005fout_005f21(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var produtoEstoqueApiUrl = '");
      if (_jspx_meth_c_005fout_005f22(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("    var hostQtdeEstoque = '");
      if (_jspx_meth_c_005fout_005f23(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\tvar MICROSERVICE_BACKOMMERCE_URL = '");
      if (_jspx_meth_c_005fout_005f24(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var hostInclusaoNrCartaoBeneficio = '");
      if (_jspx_meth_c_005fout_005f25(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar hostHistoricoCarrinhosUltimaHora = '");
      if (_jspx_meth_c_005fout_005f26(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var filialTemFPCemPorcentoBalcao = '");
      if (_jspx_meth_c_005fout_005f27(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar hostPerfilReact = '");
      if (_jspx_meth_c_005fout_005f28(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var hostHubReceitaDigital = '");
      if (_jspx_meth_c_005fout_005f29(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\tvar NFEUTILITIESDONWLOAD_URL = '");
      if (_jspx_meth_c_005fout_005f30(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\n");
      out.write("\tvar RDAUTHORIZATORCUSTOMER_URL = '");
      if (_jspx_meth_c_005fout_005f31(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar lojaFilialVersaoCustomerMS = '");
      if (_jspx_meth_c_005fout_005f32(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar versaoMsCustomerSemEntradaDados = '");
      if (_jspx_meth_c_005fout_005f33(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar INTEGRADOR_PBM = '");
      if (_jspx_meth_c_005fout_005f34(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar lojaVersaoClienteLgpd = '");
      if (_jspx_meth_c_005fout_005f35(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\tvar filialVersaoGa = '");
      if (_jspx_meth_c_005fout_005f36(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialVersaoImpressaoPreAutorizacao = '");
      if (_jspx_meth_c_005fout_005f37(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialVersaoEstornoAutorizacao = '");
      if (_jspx_meth_c_005fout_005f38(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialVersaoReservaApp = '");
      if (_jspx_meth_c_005fout_005f39(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialVersaoReservaAppEntreLojas = '");
      if (_jspx_meth_c_005fout_005f40(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialVersaoReservaAppEntreLojasAlertaSonoro = '");
      if (_jspx_meth_c_005fout_005f41(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialVersaoReservaAppEntreLojasModal = '");
      if (_jspx_meth_c_005fout_005f42(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\tvar filialTemFarmaciaPopularReact = '");
      if (_jspx_meth_c_005fout_005f43(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialTemFarmaciaPopularReactPerfil = '");
      if (_jspx_meth_c_005fout_005f44(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialTemFarmaciaPopularReactProdutos = '");
      if (_jspx_meth_c_005fout_005f45(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialTemFarmaciaPopularReactReutilizarImagem = '");
      if (_jspx_meth_c_005fout_005f46(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var entregaVizinhanca = '");
      if (_jspx_meth_c_005fout_005f47(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var filialTemMsFarmaciaPopularBalcao = '");
      if (_jspx_meth_c_005fout_005f48(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var filialTemFiltroBuscaProdutos = '");
      if (_jspx_meth_c_005fout_005f49(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("    var filialReimpressaoCupomFp = '");
      if (_jspx_meth_c_005fout_005f50(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialHomeTCAlertasNovidades = '");
      if (_jspx_meth_c_005fout_005f51(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar filialTemMsComprovanteDataSusu = '");
      if (_jspx_meth_c_005fout_005f52(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("\tvar filialTemMsFarmaciaPopular = '");
      if (_jspx_meth_c_005fout_005f53(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("\tvar universURL = '");
      if (_jspx_meth_c_005fout_005f54(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\tvar filialTemBuscaUnificadaReact = '");
      if (_jspx_meth_c_005fout_005f55(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar FLAG_MODALCRMCRO = '");
      if (_jspx_meth_c_005fout_005f56(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar FLAG_MODAL_DESCONTO_PBM = '");
      if (_jspx_meth_c_005fout_005f57(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar versaoHistoricoComprasCartaoUniversSaldo = '");
      if (_jspx_meth_c_005fout_005f58(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tlocalStorage.removeItem('fpScannerReact');\n");
      out.write("    var contadorEnvioSmsLgpd = 0;\n");
      out.write("    var lojaVersaoTcLgpdOfexIgnoraCons = '");
      if (_jspx_meth_c_005fout_005f59(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script>\n");
      out.write("    // Abreviação do JQuery para evitar conflito\n");
      out.write("\tvar $j = jQuery.noConflict();\n");
      out.write("\t$j.support.cors = true;\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- FontAwesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("<!-- FontAwesome -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("css/");
      if (_jspx_meth_c_005fout_005f60(_jspx_page_context))
        return;
      out.write("dialogoGerenciaPbm.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write("css/receitaControlado.css\" />\n");
      out.write("\n");
      out.write("<!-- LEMBRETES -->\n");
      out.write("<script>\n");
      out.write("    var LEMBRETES_SERVICOS_URL = '");
      if (_jspx_meth_c_005fout_005f61(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f10(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f11(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f12(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f13(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f14(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f15(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<!-- LEMBRETES -->\n");
      out.write("\n");
      out.write("<!-- Tooltip -->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f16(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f17(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f18(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f19(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f20(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f21(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f22(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f23(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("\n");
      out.write("<!-- TC -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f24(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f25(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f26(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f27(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f28(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f29(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f30(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f31(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f32(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f33(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f34(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f35(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f36(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f37(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f38(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f39(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f40(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f41(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f42(_jspx_page_context))
        return;
      out.write("\" charset=\"ISO-8859-1\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f43(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f44(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f45(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f46(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f47(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f48(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f49(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f50(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f51(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f52(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f53(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f54(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f55(_jspx_page_context))
        return;
      out.write("\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f56(_jspx_page_context))
        return;
      out.write("\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f57(_jspx_page_context))
        return;
      out.write("\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f58(_jspx_page_context))
        return;
      out.write("\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f59(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("\n");
      out.write("<!-- templates -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f60(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f61(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f62(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f63(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f64(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f65(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<!-- introjs -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f66(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f67(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("\n");
      out.write("<!-- piloto -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f68(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("\n");
      out.write("<!-- APOIO AO TRATAMENTO -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f69(_jspx_page_context))
        return;
      out.write("css/");
      if (_jspx_meth_c_005fout_005f62(_jspx_page_context))
        return;
      out.write("apoioTratamento.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f70(_jspx_page_context))
        return;
      out.write("css/");
      if (_jspx_meth_c_005fout_005f63(_jspx_page_context))
        return;
      out.write("relApoioTtratamento.css\"/>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f71(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function buscarDadosFarmaceutico(loginFarmaceutico) {\n");
      out.write("\tvar contextoUrlPortlet = '");
      if (_jspx_meth_c_005furl_005f72(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar URL = contextoUrlPortlet\n");
      out.write("\t\t\t+ \"AjaxServlet?acao=BUSCAR_DADOS_FARMACEUTICO\" + \"&idLoginOracle=\"\n");
      out.write("\t\t\t+ loginFarmaceutico;\n");
      out.write("\tfuncaoDeRetornoAjax = buscarDadosFarmaceuticoRet\n");
      out.write("\tajaxCall(URL)\n");
      out.write("}\n");
      out.write("\n");
      out.write("function validaSenhaFarmaceutico(idLogin, dsSenha) {\n");
      out.write("\tvar contextoUrlPortlet = '");
      if (_jspx_meth_c_005furl_005f73(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\tvar URL = contextoUrlPortlet\n");
      out.write("\t\t\t+ \"AjaxServlet?acao=VALIDAR_SENHA_FARMACEUTICO&idLoginOracleFarma=\"\n");
      out.write("\t\t\t+ idLogin + \"&dsSenhaFarma=\" + dsSenha;\n");
      out.write("\tfuncaoDeRetornoAjax = autorizacaoFarmaceutico\n");
      out.write("\tajaxCall(URL)\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- toastr -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f74(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f75(_jspx_page_context))
        return;
      out.write("\"/>\n");
      out.write("<script>\n");
      out.write("\ttoastr.options = {\n");
      out.write("\t\t\"closeButton\": false,\n");
      out.write("\t\t\"debug\": false,\n");
      out.write("\t\t\"newestOnTop\": true,\n");
      out.write("\t\t\"progressBar\": true,\n");
      out.write("\t\t\"positionClass\": \"toast-bottom-right\",\n");
      out.write("\t\t\"preventDuplicates\": false,\n");
      out.write("\t\t\"onclick\": null,\n");
      out.write("\t\t\"showDuration\": \"300\",\n");
      out.write("\t\t\"hideDuration\": \"1000\",\n");
      out.write("\t\t\"timeOut\": \"8000\",\n");
      out.write("\t\t\"extendedTimeOut\": \"2000\",\n");
      out.write("\t\t\"showEasing\": \"swing\",\n");
      out.write("\t\t\"hideEasing\": \"linear\",\n");
      out.write("\t\t\"showMethod\": \"fadeIn\",\n");
      out.write("\t\t\"hideMethod\": \"fadeOut\"\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\twindow.dataLayer = window.dataLayer || [];\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- Refresh na primeira execucao -->\n");
      out.write("<script>\n");
      out.write("\tif ('");
      if (_jspx_meth_c_005furl_005f76(_jspx_page_context))
        return;
      out.write("'.search(\"jsessionid\") > 0) {\n");
      out.write("\t\tdocument.location.href = \"/portal/tc/\";\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tHandlebars.registerHelper('decimal', function (number) {\n");
      out.write("\t\tif (typeof(number) === 'function') {\n");
      out.write("\t\t\tnumber = number();\n");
      out.write("\t\t}\n");
      out.write("\t\treturn parseFloat(number).toFixed(2).replace('.', ',');\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tHandlebars.registerHelper('ifEquals', function(visibilityAutorizacaoSevenPdv) {\n");
      out.write("\t\tif (cuponavelFuncional.getIntegracaoHabilitadaFuncional() == false && visibilityAutorizacaoSevenPdv == 'inline') {\n");
      out.write("\t\t\treturn '<input type=\"button\" class=\"buttonMid\" style=\"margin-left: 5px; display:{{visibilityAutorizacaoSevenPdv}}\" name=\"exibirAutorizacao\" id=\"exibirAutorizacao\" value=\"Autoriza&ccedil;&atilde;o\" title=\"Exibir n&uacute;mero da Autoriza&ccedil;&atilde;o\" onclick=\"cuponavelSevenPdv.exibirAutorizacao()\" />';\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t/**\n");
      out.write("     * Lê o template e retorna o html com os dados aplicados.\n");
      out.write("\t *\n");
      out.write("\t * @see https://api.jquery.com/category/selectors/\n");
      out.write("\t * @param {string} template Seletor jquery do template\n");
      out.write("\t * @param {object} dados Objeto com os dados a aplicar no template\n");
      out.write("\t * @return\n");
      out.write("\t */\n");
      out.write("\t \t \n");
      out.write("\t function entregaVizinhanca(){\n");
      out.write("\t\t\n");
      out.write("\t\tvar endereco = '");
      if (_jspx_meth_c_005fout_005f64(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("\t\t\tvar nomeCliente = clienteCompleto.cliente.nome\n");
      out.write("\t\t\tvar cpfCliente = clienteCompleto.cliente.cpf\n");
      out.write("\t\tvar telefoneCliente = '");
      if (_jspx_meth_c_005fout_005f65(_jspx_page_context))
        return;
      out.write("'\n");
      out.write("\t\t\n");
      out.write("\t\tvar carrinhoEntregaVizinhanca = []\n");
      out.write("\t\t\tvar valorTotalEntregaVizinhanca = 0;\n");
      out.write("\t\t\n");
      out.write("\t\tfor (i = 0; i < carrinho.length; i++) {\t\t\n");
      out.write("\t\t\tvar item = {\n");
      out.write("\t\t\t\t\tnome : carrinho[i][2],\n");
      out.write("\t\t\t\t\tqtd : carrinho[i][4],\n");
      out.write("\t\t\t\t\t\tvalor : ((MyCart.precoFinal(MyCart.get()[i])).value * carrinho[i][4]).toFixed(2).replace(\".\", \",\"),\n");
      out.write("\t\t\t\t\tcod: carrinho[i][1]\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tcarrinhoEntregaVizinhanca.push(item)\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvalorTotalEntregaVizinhanca += ((MyCart.precoFinal(MyCart.get()[i]).value) * carrinho[i][4])\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\tmostrarDetalhesEntregaVizinhaca(endereco,nomeCliente,cpfCliente,telefoneCliente,carrinhoEntregaVizinhanca,valorTotalEntregaVizinhanca.toFixed(2))\t\n");
      out.write("\t}\n");
      out.write("\t\t \n");
      out.write("\tfunction carregarModalApoioTratamentoCadastro(){\n");
      out.write("\t\t\tvar nomeCliente = clienteCompleto.cliente.nome\n");
      out.write("\t\t\tmostrarModalApoioTratamentoCadastro(nomeCliente)\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction parseTemplate(templateSelector, dados) {\n");
      out.write("        var source = $j(templateSelector).html();\n");
      out.write("\t\tvar template = Handlebars.compile(source);\n");
      out.write("\t\treturn template(dados);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tcuponavelSevenPdv.setIntegracaoHabilitada(");
      if (_jspx_meth_c_005fout_005f66(_jspx_page_context))
        return;
      out.write(");\n");
      out.write("\tcuponavelSevenPdv.setUrl('");
      if (_jspx_meth_c_005fout_005f67(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\tcuponavelFuncional.setIntegracaoHabilitadaFuncional(");
      if (_jspx_meth_c_005fout_005f68(_jspx_page_context))
        return;
      out.write(");\n");
      out.write("\tcuponavelFuncional.setUrl('");
      if (_jspx_meth_c_005fout_005f69(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\t\n");
      out.write("\tcuponavelEpharma.setIntegracaoHabilitadaEpharma(");
      if (_jspx_meth_c_005fout_005f70(_jspx_page_context))
        return;
      out.write(");\n");
      out.write("\tcuponavelEpharma.setUrl('");
      if (_jspx_meth_c_005fout_005f71(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("\n");
      out.write("\t\n");
      out.write("    // Abreviação do JQuery para evitar conflito\n");
      out.write("\tvar $j = jQuery.noConflict();\n");
      out.write("\t$j.support.cors = true;\n");
      out.write("\thabilitaAjaxIE8();\n");
      out.write("\n");
      out.write("\tportalUrl = '");
      if (_jspx_meth_c_005furl_005f77(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\n");
      out.write("\tvar arrayReservaApp;\n");
      out.write("\n");
      out.write("\tvar endApplet;\n");
      out.write("\n");
      out.write("\t// JQuery \n");
      out.write("\t$j(function() {\n");
      out.write("\t\t// $j('#theCestaDeCompras').disableTextSelect();\n");
      out.write("\n");
      out.write("\t\t$j('.tabZebrada').tabZebra();\n");
      out.write("\t\t$j('.tabHighlight').tabHighlight();\n");
      out.write("\n");
      out.write("\t\tif ($j.browser.msie == true) {\n");
      out.write("\t\t\t$j('input').bind('focus', function() {\n");
      out.write("\t\t\t\t$j(this).addClass('ieFocus');\n");
      out.write("\t\t\t}).bind('blur', function() {\n");
      out.write("\t\t\t\t$j(this).removeClass('ieFocus');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tvar ccraiaPreAprovado = '");
      if (_jspx_meth_c_005fout_005f72(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\tvar flagNovoCliente = '");
      if (_jspx_meth_c_005fout_005f73(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\t\tif ((ccraiaPreAprovado == 1) && flagNovoCliente) {\n");
      out.write("\t\t\tccraiaFrame();\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t$j.postmessage.bind(\"oferecimento\", function(data) {\n");
      out.write("\n");
      out.write("\t\t\tfechaCCRaiaFrame();\n");
      out.write("\n");
      out.write("\t\t\tif (data == 'aceito') {\n");
      out.write("\t\t\t\t$j('#ccraia').remove();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tvar baseURL = '");
      if (_jspx_meth_portlet_005factionURL_005f0(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\tcontextoUrl = '");
      if (_jspx_meth_c_005furl_005f78(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\tvar cdOperador;\n");
      out.write("\tvar idCliente;\n");
      out.write("\n");
      out.write("\tvar existsReservaPendente = false;\n");
      out.write("\tvar carrinho = new Array();\n");
      out.write("\tvar carrinhoFP = new Array();\n");
      out.write("\n");
      out.write("\tvar indx = 0;\n");
      out.write("\tvar indxCdProduto = 1;\n");
      out.write("\tvar indxDsProduto = 2;\n");
      out.write("\tvar indxPmc = 3;\n");
      out.write("\tvar indxQtd = 4;\n");
      out.write("\tvar indxPercDescGer = 5;\n");
      out.write("\tvar indxColor = 6;\n");
      out.write("\tvar produtoPromocao = 7;\n");
      out.write("\n");
      out.write("\tvar winOE;\n");
      out.write("\n");
      out.write("\tfunction abreClienteOperacoesPerfilCompleto() {\n");
      out.write("\t\tdocument.location.href = '/portal/tc/clienteoperacoes/ClienteOperacoesWindow?page=mainview&action=1&perfil=' + perfil + '&acao=perfilCompleto&botaoOE=true';\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction dataDiferencaEmDias(data1, data2) {\n");
      out.write("\t\tvar diferencaMilissegundos = Math.abs(data1 - data2);\n");
      out.write("\t\tvar milissegundos1dia = 1000 * 60 * 60 * 24;\n");
      out.write("\t\tvar diferencaDias = Math.round(diferencaMilissegundos/milissegundos1dia);\n");
      out.write("\t\treturn diferencaDias;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction getDataUltimaAtualizacaoDoCliente() {\n");
      out.write("\t\tif(clienteCompleto.cliente){\n");
      out.write("\t\t\tvar dia = clienteCompleto.cliente.dataUltimaAtualizacao.substr(0, 2);\n");
      out.write("\t\t\tvar mes = clienteCompleto.cliente.dataUltimaAtualizacao.substr(3, 2);\n");
      out.write("\t\t\tvar ano = clienteCompleto.cliente.dataUltimaAtualizacao.substr(6, 4);\n");
      out.write("\t\t\treturn new Date(ano, (mes-1), dia);\n");
      out.write("\t\t}\n");
      out.write("\t\treturn null;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("    function exibirAderencia(idCliente) {\n");
      out.write("    \tbuscarItensRecompra(cdFilial, idCliente);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\tfunction carregarOferta(idCliente) {\n");
      out.write("\t\tif(lojaVersaoTcLgpdOfexIgnoraCons == 'false'){\n");
      out.write("\t\t\tif (lojaVersaoClienteLgpd == 'true' && undefined != clientePesquisado.flLgpdDescBeneficio\n");
      out.write("\t\t\t\t&& clientePesquisado.flLgpdDescBeneficio == 'false'\n");
      out.write("\t\t\t\t\t&& validaOfexPadrao() == false ){\n");
      out.write("\t\t\t\tabrirAvisoBloqueioLgpd(1);\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tvar pcCadastroCompleto = parseFloat(clienteCompleto.cliente.pcCadastroCompleto || 0);\n");
      out.write("\t\tvar dataUltimaAtualizacao = getDataUltimaAtualizacaoDoCliente();\n");
      out.write("\t\tvar hoje = new Date();\n");
      out.write("\t\tvar qtdeDias18meses = 540;\n");
      out.write("\t\tvar qtdeDias06meses = 180;\n");
      out.write("\t\tvar cdTipoCartao = clienteCompleto.cliente.cdTipoCartao;\n");
      out.write("\n");
      out.write("        var aderenciaTratamentoRecompra = buscarItensRecompra(cdFilial, idCliente);\n");
      out.write("\n");
      out.write("\t\tvar cpfCliente = '");
      if (_jspx_meth_c_005fout_005f74(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\n");
      out.write("\t\tvar tipoCartaoPermitido = (+LOGO_MARCA === 1) \n");
      out.write("\t\t\t? (cdTipoCartao == 1 || cdTipoCartao == 2) // RAIA\n");
      out.write("\t\t\t: (cdTipoCartao == 5 || cdTipoCartao == 6) // DROGASIL\n");
      out.write("\n");
      out.write("\t\t// regra apenas para cliente plus e senior --univers nao entra\n");
      out.write("\t\tif ((aderenciaTratamentoRecompra == null || aderenciaTratamentoRecompra == undefined || aderenciaTratamentoRecompra.length == 0) && tipoCartaoPermitido) {\n");
      out.write("\t\t\t//cliente com cadastro comlpeto e data ultima atualizacao superior ou igual  a 18 meses\n");
      out.write("\t\t\tif (pcCadastroCompleto == 100 && dataDiferencaEmDias(hoje, dataUltimaAtualizacao) >= qtdeDias18meses) {\n");
      out.write("\t\t\t\tabreClienteOperacoesPerfilCompleto(); \n");
      out.write("                //cliente com cadastro incompleto e com data ultima atualização superior ou igual a 06 meses\n");
      out.write("\t\t\t} else if (pcCadastroCompleto != 100 && dataDiferencaEmDias(hoje, dataUltimaAtualizacao) >= qtdeDias06meses) {\t\t\n");
      out.write("\t\t\t\tif (clienteCompleto.cliente.atualizarCadastroPorMotivoRecusa == 'true') {\n");
      out.write("\t\t\t\t\tabreConsultaClienteBtnOfertas();\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\tlimpaTela();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tdocument.getElementById('txtProduto').focus();\n");
      out.write("\t\t\t\t// Abre OE sempre na mesma janela\n");
      out.write("\t\t\t\twindow.open(ofertasExclusivasUrl + '?idCliente=' + idCliente\n");
      out.write("                    + '&cdFilial=' + cdFilial + '&cdOperador=' + cdOperador + '&cpfCliente=' + cpfCliente,\n");
      out.write("\t\t\t\t\t\t\"winOE\", \"resizable=0,width=150,height=180,location=no\");\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tdocument.getElementById('txtProduto').focus();\n");
      out.write("\t\twindow.open(ofertasExclusivasUrl + '?idCliente=' + idCliente\n");
      out.write("            + '&cdFilial=' + cdFilial + '&cdOperador=' + cdOperador + '&cpfCliente=' + cpfCliente,\n");
      out.write("\t\t\t\t\"winOE\", \"resizable=0,width=150,height=180,location=no\");\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction ccraiaFrame() {\n");
      out.write("\n");
      out.write("\t\tfechaMenu();\n");
      out.write("\n");
      out.write("\t\tvar ifrmUrl = ccraiaUrl + '?tc2009=true&idCliente=' + idCliente\n");
      out.write("\t\t\t\t+ '&cdFilial=' + cdFilial + '&cdOperador=' + cdOperador;\n");
      out.write("\n");
      out.write("\t\tvar iframe = '<iframe id=\"ccraiaIFrame\" src=\"' + ifrmUrl\n");
      out.write("\t\t\t\t+ '\" width=\"96.5%\" height=\"600\"></iframe>';\n");
      out.write("\n");
      out.write("\t\t$j(\"#ccraiaFrame\").html(iframe);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction fechaCCRaiaFrame() {\n");
      out.write("\t\t$j(\"#ccraiaFrame\").html(\"\");\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("    function carregarPra() {\n");
      out.write("\n");
      out.write("        document.location.href = '/portal/tc/pra/ConsultaPraWindow?page=mainview&action=1';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\tfunction limparCliente() {\n");
      out.write("\t\tdocument.location.href = '/portal/tc/default/ToolbarWindow?page=mainview&action=1&clrCliente=1';\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction showPerfil() {\n");
      out.write("\n");
      out.write("\t\tvar x = document.body.offsetWidth - 40;\n");
      out.write("\t\tvar y = 75;\n");
      out.write("\n");
      out.write("\t\tvar perfilCliente = document.getElementById(\"perfilCliente\");\n");
      out.write("\n");
      out.write("\t\tif (perfilCliente.style.visibility == 'hidden'\n");
      out.write("\t\t\t\t|| perfilCliente.style.visibility == '') {\n");
      out.write("\n");
      out.write("\t\t\tperfilCliente.style.left = (x - 400) + \"px\";\n");
      out.write("\t\t\tperfilCliente.style.top = (y + 20) + \"px\";\n");
      out.write("\n");
      out.write("\t\t\tperfilCliente.style.visibility = \"visible\";\n");
      out.write("\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tperfilCliente.style.visibility = \"hidden\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction goToPerfil() {\n");
      out.write("\t\t// location.href = '/portal/tc/cliente/'\n");
      out.write("\t\tif(+urlHomePerfilCliente !== -1) {\n");
      out.write("\t\t\tlocation.href = urlHomePerfilCliente + '?page=mainview&action=1&atendimentoCpf='+null\n");
      out.write("\t\t\t\t+'&redirectLgpd=perfil&idCliente='+clienteCompleto.cliente.idCliente;// '/portal/tc/clienteoperacoes/?perfil'\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tmontaPerfil()\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("    function montaPerfil() {\n");
      out.write("\t\tvar backgroundColorPerfil = (+LOGO_MARCA === 1) ? '#35A2A8' : '#E23D41';\n");
      out.write("        var listaPerfil = '");
      if (_jspx_meth_c_005fout_005f75(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("        var listaTipoPerfil = '");
      if (_jspx_meth_c_005fout_005f76(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("        if ((listaPerfil != undefined) && (listaPerfil != null)) {\n");
      out.write("            if ((listaTipoPerfil != undefined) && (listaTipoPerfil != null)) {\n");
      out.write("                var dlgPerfil = \"dlgPerfil\";\n");
      out.write("                var valores = listaPerfil.split(';');\n");
      out.write("                var valoresTipo = listaTipoPerfil.split(';');\n");
      out.write("                var tamRowspan = valores.length + 1;\n");
      out.write("                var larguraPerfil = 350;\n");
      out.write("                var alturaPerfil = valores.length * 17;\n");
      out.write("                var larguraPerfilCorpo = 350;\n");
      out.write("                var aux = 0;\n");
      out.write("                var dlgPerfilClienteCorpo =\n");
      out.write("//                     '<table width=\"350\"> ';\n");
      out.write("                    '<table id=\"tbPerfilCorpo\" style=\"width:'+larguraPerfilCorpo+';\"> ';\n");
      out.write("                for (var i = 0; i <= valores.length; i++) {\n");
      out.write("                    dlgPerfilClienteCorpo = dlgPerfilClienteCorpo +\n");
      out.write("                        '<tr style=\"line-height: 1.2;\"> ';\n");
      out.write("                    if (i == 0) {\n");
      out.write("                        dlgPerfilClienteCorpo = dlgPerfilClienteCorpo +\n");
      out.write("                            '<td align=\"center\"; rowspan=\"' + tamRowspan + '\"; style=\"background-color: '+backgroundColorPerfil+';\"><label class=\"labelPerfil\">Perfil</label></td>';\n");
      out.write("                    } else {\n");
      out.write("                        dlgPerfilClienteCorpo = dlgPerfilClienteCorpo +\n");
      out.write("                            '<td></td><td align=\"left\"; style=\"background-color: #696C6C\";><label class=\"label10\">' + valoresTipo[aux] + '</label></td> ';\n");
      out.write("                        dlgPerfilClienteCorpo = dlgPerfilClienteCorpo +\n");
      out.write("                            '<td></td><td align=\"left\"; style=\"background-color: #BCC7C7\";><label class=\"label10Perfil\">' + valores[aux++] + '</label></td> ';\n");
      out.write("                        dlgPerfilClienteCorpo = dlgPerfilClienteCorpo + '</tr> ';\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                dlgPerfilClienteCorpo = dlgPerfilClienteCorpo +\n");
      out.write("                '</table>';\n");
      out.write("                criaDialogoPerfil(dlgPerfil, \"Perfil\", dlgPerfilClienteCorpo, larguraPerfil, alturaPerfil);\n");
      out.write("                exibeDialogoPerfil(dlgPerfil);\n");
      out.write("                exibePainelLembretes();\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\tfunction montaCarrinho() {\n");
      out.write("\t\tvar carSize = getCookie('carrinhoLength');\n");
      out.write("\t\t//cart = icone do carrinho / theCestaDeCompras = popup do carrinho\n");
      out.write("\t\tif (parseInt(carSize) > 0) {\n");
      out.write("\t\t\tdocument.getElementById(\"cart\").style.visibility = \"visible\";\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tdocument.getElementById(\"cart\").style.visibility = \"hidden\";\n");
      out.write("\t\t\t// document.getElementById(\"theCestaDeCompras\").style.visibility = \"hidden\";\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tvar valorTotal = 0.00;\n");
      out.write("\t\tvar produtos = carrinhoCompras.getProdutos();\n");
      out.write("\t\t$j.each(produtos, function(idx, item) {\n");
      out.write("\t\t    valorTotal += item.precoQtd();\n");
      out.write("\t\t});\n");
      out.write("\t\tvar dadosCarrinho = {\n");
      out.write("\t\t\t'produtos': produtos,\n");
      out.write("\t\t\t'valorTotal': valorTotal,\n");
      out.write("\t\t\t'visibilityAutorizacaoSevenPdv': cuponavelSevenPdv.hasAutorizacao() ? \"inline\" : \"none\"\n");
      out.write("\t\t};\n");
      out.write("\n");
      out.write("\t\t// var carrinhoHtml = parseTemplate('#template-carrinhoCompras', dadosCarrinho);\n");
      out.write("\t\t// $j('#theCestaDeCompras').html(carrinhoHtml);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction showCart(){\n");
      out.write("\t\tvar carSize = getCookie('carrinhoLength');\n");
      out.write("\t\t//cart = icone do carrinho / theCestaDeCompras = popup do carrinho\n");
      out.write("\t\tif (parseInt(carSize) > 0) {\n");
      out.write("\t\t\tdocument.getElementById(\"cart\").style.visibility = \"visible\";\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tdocument.getElementById(\"cart\").style.visibility = \"hidden\";\n");
      out.write("\t\t\t// document.getElementById(\"theCestaDeCompras\").style.visibility = \"hidden\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction boxPbmCarrinhoViewAutorizacaoPbm(){\n");
      out.write("\t\tif (lojaVersaoClienteLgpd == 'true' && (typeof clientePesquisado != 'undefined') && (typeof clientePesquisado.flLgpdPbm != 'undefined')\n");
      out.write("\t\t\t\t&& clientePesquisado.flLgpdPbm == 'false'){\n");
      out.write("\t\t\tabrirAvisoBloqueioLgpd(3);\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\tboxPbmCarrinho();\n");
      out.write("\t\tviewAutorizacaoPbm();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("    function boxPbmCarrinho() {\n");
      out.write("\n");
      out.write("        var formAut = document.getElementById(\"nrAutPbmValue\");\n");
      out.write("        var formCr = document.getElementById(\"nrCrPbm\");\n");
      out.write("        var formCdPbm = document.getElementById(\"nrCrPbm\");\n");
      out.write("        var formDsPbm = $(\"#dsPbm option:selected\");\n");
      out.write("        var dadosCarrinho = {\n");
      out.write("            'nrAut': formAut==null?\"\": formAut.value,\n");
      out.write("            'nrCr':  formCr==null?\"\": formCr.value,\n");
      out.write("            'cdPbm':  formCdPbm==null?\"\": formCdPbm.value,\n");
      out.write("            'dsPbm':  formDsPbm==null?\"\": formDsPbm.text()\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var carrinhoHtml = parseTemplate('#template-carrinhoPbm', dadosCarrinho);\n");
      out.write("        var windowHeight = 280;\n");
      out.write("\n");
      out.write("        var transacaoSevenPdv = cuponavelSevenPdv.getTransacao();\n");
      out.write("        var nrCrSeven = cuponavelSevenPdv.getProfissional()==null?'':cuponavelSevenPdv.getProfissional().codigo;\n");
      out.write("        if (transacaoSevenPdv!=null) {\n");
      out.write("            addItemCarrinhoPbm(5,'TRN CENTRE',transacaoSevenPdv.nrCentral,nrCrSeven,false);\n");
      out.write("\t\t}\n");
      out.write("        \n");
      out.write("        var transacaoFuncionalCard = cuponavelFuncional.getTransacao();\n");
      out.write("        var nrCrFunc = cuponavelFuncional.getProfissional()==null?'':cuponavelFuncional.getProfissional().codigo;\n");
      out.write("        if(transacaoFuncionalCard != null){\n");
      out.write("        \taddItemCarrinhoPbm(7,'FUNCIONALCARD',transacaoFuncionalCard.nrCentral,nrCrFunc,false);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("\n");
      out.write("       \tvar transacaoEpharma = cuponavelEpharma.getTransacao();\n");
      out.write("       \tvar nrCrEph = cuponavelEpharma.getProfissional()==null?'':cuponavelEpharma.getProfissional().codigo;\n");
      out.write("       \tif(transacaoEpharma != null){\n");
      out.write("       \t\taddItemCarrinhoPbm(1,'EPHARMA',transacaoEpharma.nrCentral,nrCrEph,false);\n");
      out.write("       \t}\n");
      out.write("        \n");
      out.write("        if(getCookie('arrayAutorizacao') != \"\"){\n");
      out.write("\t        var outrasTransacoes = JSON.parse(getCookie('arrayAutorizacao'));\n");
      out.write("\t        for (i in outrasTransacoes) {\n");
      out.write("\t        \taddItemCarrinhoPbm(outrasTransacoes[i].CD_PBM,outrasTransacoes[i].DS_PBM,outrasTransacoes[i].NR_AUTORIZACAO_PBM,outrasTransacoes[i].NR_CR,false);\n");
      out.write("\t        }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        //var transacaoFP = carrinhoComprasFP.getTransacao();\n");
      out.write("        var crmFP = getCookieFP(\"transacaoCrm\");\n");
      out.write("        var autorizacaoFP = carrinhoComprasFP.getAutorizacao();\n");
      out.write("        if(autorizacaoFP != null && crmFP != null){\n");
      out.write("        \taddItemCarrinhoPbm(6,'FARMACIA POPULAR', autorizacaoFP.nrAutorizacao, crmFP, false);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var windowWidth = 450;\n");
      out.write("        criaDialogoCarrinhoPbm(idMainDlg, \"Autoriza&ccedil;&atilde;o\", carrinhoHtml, windowWidth, windowHeight);\n");
      out.write("        var isVisible = exibeDialogoCarrinhoPbm(idMainDlg);\n");
      out.write("        viewAutorizacaoPbm(arrayItensAdded);\n");
      out.write("        \n");
      out.write("        if(transacaoFuncionalCard != null && isVisible){\n");
      out.write("\t        verificaExisteItemFuncional(arrayItensAdded,transacaoFuncionalCard,nrCrFunc);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        if(transacaoEpharma != null && isVisible) {\n");
      out.write("        \tverificaExisteItemEpharma(arrayItensAdded,transacaoEpharma,nrCrEph);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\t// altera quantidade do item\n");
      out.write("\tfunction changeQtd(indx) {\n");
      out.write("\t\tdocument.getElementById('lblQtd' + indx).style.display = 'none';\n");
      out.write("\t\tdocument.getElementById('txtQtd' + indx).style.display = 'inline';\n");
      out.write("\t\tdocument.getElementById('txtQtd' + indx).focus();\n");
      out.write("\t\tdocument.getElementById('txtQtd' + indx).select();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t// atualiza quantidade\n");
      out.write("\tfunction updateQtd(indx) {\n");
      out.write("\t\tvar produto = carrinhoCompras.getProdutoByIndex(indx);\n");
      out.write("\t\tvar novaQtde = document.getElementById('txtQtd' + indx).value;\n");
      out.write("\t\tatualizaQuantidadeProdutoNoCarrinho(novaQtde, produto);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction removeItem(indx) {\n");
      out.write("\t\tvar produto = carrinhoCompras.getProdutoByIndex(indx);\n");
      out.write("\t\tif (!(lojaVersaoClienteLgpd == 'true' && undefined != clientePesquisado.flLgpdPbm && clientePesquisado.flLgpdPbm == 'false'\n");
      out.write("\t\t\t&& clientePesquisado.flLgpdDescBeneficio == 'false')){\n");
      out.write("\t        if (cuponavelSevenPdv.canHandle(produto) && produto.descGer == '0') {\n");
      out.write("\t\t\t\tcuponavelSevenPdv.removeItemNoCarrinho(produto);\n");
      out.write("\t\t\t}else if(cuponavelFuncional.canHandle(produto) && produto.descGer == '0'){\n");
      out.write("\t\t\t\tcuponavelFuncional.removeItemNoCarrinho(produto);\n");
      out.write("\t\t\t}else if(cuponavelEpharma.canHandle(produto) && produto.descGer == '0') {\n");
      out.write("\t\t\t\tcuponavelEpharma.removeItemNoCarrinho(produto);\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tcarrinhoCompras.remover(produto);\n");
      out.write("\t\t\t\tcarrinhoCompras.salvar();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tcarrinhoCompras.remover(produto);\n");
      out.write("\t\t\tcarrinhoCompras.salvar();\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tMyCart.delete(produto);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction incItem(indx) {\n");
      out.write("\t\tvar produto = carrinhoCompras.getProdutoByIndex(indx);\n");
      out.write("\t\tvar novaQtde = produto.pQtd + 1;\n");
      out.write("        produto.novaQtd = novaQtde;\n");
      out.write("\t\tatualizaQuantidadeProdutoNoCarrinho(novaQtde, produto);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction decItem(indx) {\n");
      out.write("\t\tvar produto = carrinhoCompras.getProdutoByIndex(indx);\n");
      out.write("\t\tif (produto.produtoPromocao == 'LMPM' && produto.pQtd == '3') {\n");
      out.write("            toastr['warning']('O produto &eacute; da promo&ccedil;&atilde;o LMPM quantidade min&iacute;ma de produtos &eacute; 3 para este valor','Aten&ccedil;&atilde;o');\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\tvar novaQtde = produto.pQtd - 1;\n");
      out.write("\t\t\tatualizaQuantidadeProdutoNoCarrinho(novaQtde, produto);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\tfunction atualizaQuantidadeProdutoNoCarrinho(novaQtde, produto) {\n");
      out.write("\n");
      out.write("\t\tif (novaQtde < 1) {\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tproduto.pQtd = parseInt(novaQtde);\n");
      out.write("\t\tif (!(lojaVersaoClienteLgpd == 'true' && undefined != clientePesquisado.flLgpdPbm && clientePesquisado.flLgpdPbm == 'false'\n");
      out.write("\t\t\t&& clientePesquisado.flLgpdDescBeneficio == 'false')){\n");
      out.write("        if (cuponavelSevenPdv.canHandle(produto) && produto.descGer == '0') {\n");
      out.write("\t\t\tcuponavelSevenPdv.atualizaItemNoCarrinho(produto);\n");
      out.write("\t\t} else if(cuponavelFuncional.canHandle(produto) && produto.descGer == '0'){\n");
      out.write("\t\t\tcuponavelFuncional.atualizaItemNoCarrinho(produto);\n");
      out.write("\t\t}else if(cuponavelEpharma.canHandle(produto) && produto.descGer == '0'){\n");
      out.write("\t\t\t\tcuponavelEpharma.atualizaItemNoCarrinho(produto); \n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tcarrinhoCompras.atualizar(produto);\n");
      out.write("\t\t\tcarrinhoCompras.salvar();\n");
      out.write("\t\t}\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tcarrinhoCompras.atualizar(produto);\n");
      out.write("\t\t\tcarrinhoCompras.salvar();\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction geraAutorizacao() {\n");
      out.write("\t\tvar txtPametros = \"?acao=DESCONTO_GRAVAR_DESCONTO&cdFilial=\" + cdFilial\n");
      out.write("\t\t\t\t+ \"&cdOperador=\" + cdOperador + \"&produtos=\" + this.carrinhoDg\n");
      out.write("\t\t\t\t+ \"&idCliente=\" + idCliente + \"&vlConcorrente=\" + vlConcorrente\n");
      out.write("\t\t\t\t+ \"&vlLiquido=\" + vlLiquido + \"&idLoginOracleGer=\" + loginGerente\n");
      out.write("\t\t\t\t+ \"&percDescGerMax=\" + percDescGerMax;\n");
      out.write("\n");
      out.write("\t\tvar URL = contextoUrl + \"AjaxServlet\" + txtPametros;\n");
      out.write("\n");
      out.write("\t\tfuncaoDeRetornoAjax = retDescontoAutorizacao;\n");
      out.write("\n");
      out.write("\t\tajaxCall(URL, false);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction retDescontoAutorizacao(ret) {\n");
      out.write("\t\tif (ret.substring(0, 4) == \"ERRO\") {\n");
      out.write("            toastr['error'](\"Erro no Desconto Ger&ecirc;ncia!\");\n");
      out.write("\n");
      out.write("\t\t} else if (ret.substring(0, 14) == \"Não autorizado\" || ret.substring(0, 14) == \"Nao autorizado\") {\n");
      out.write("            toastr['warning'](\"N&atilde;o autorizado\");\n");
      out.write("\t\t\tconsole.log(ret);\n");
      out.write("\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tthis.cdAutorizacao = ret.substring(0, 12);\n");
      out.write("\n");
      out.write("\t\t\tstartApplet();\n");
      out.write("\n");
      out.write("            var retorno = document.getElementById('appletTc').descontoGerencia(dsFilial,cdOperador, idCliente, this.cartaoCliente,'");
      if (_jspx_meth_c_005fout_005f77(_jspx_page_context))
        return;
      out.write("', this.carrinhoDg, cdAutorizacao, LOGO_MARCA);\n");
      out.write("            alert(retorno);\n");
      out.write("\t\t\tnovoAtendimento();\n");
      out.write("\t\t} \n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction sleep(milliseconds) {\n");
      out.write("\t\tvar start = new Date().getTime();\n");
      out.write("\t\tfor (var i = 0; i < 1e7; i++) {\n");
      out.write("\t\t\tif ((new Date().getTime() - start) > milliseconds) {\n");
      out.write("\t\t\t\tbreak;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction imprimeDescGer() {\n");
      out.write("        document.querySelector(\".descGerPrint\").disabled = true;\n");
      out.write("\t\tform = document.forms[\"formulario\"];\n");
      out.write("\t\tform.setAttribute(\"onsubmit\", \"checkApplet()\");\n");
      out.write("\n");
      out.write("\t\tthis.carrinhoDg = \"\";\n");
      out.write("\t\tthis.cartaoCliente = \"\";\n");
      out.write("\n");
      out.write("\t\tif ('");
      if (_jspx_meth_c_005fout_005f78(_jspx_page_context))
        return;
      out.write("'.length > 0) {\n");
      out.write("\t\t\tthis.cartaoCliente = '");
      if (_jspx_meth_c_005fout_005f79(_jspx_page_context))
        return;
      out.write('-');
      if (_jspx_meth_c_005fout_005f80(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tvar descGer = 0;\n");
      out.write("        var countGerencia = 0;\n");
      out.write("        var autorizacaoPbmGerada = false;\n");
      out.write("\n");
      out.write("\t\tfor (var l = 0; l < carrinho.length; l++) {\n");
      out.write("\n");
      out.write("\t\t\tdescGer = carrinho[l][5];\n");
      out.write("\n");
      out.write("\t\t\tif (descGer > 0) {\n");
      out.write("\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][1] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][2] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][3] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][4] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][5] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][6] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][7] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][8] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][9] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][12] + '<C>';\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + carrinho[l][17];\n");
      out.write("\n");
      out.write("\t\t\t\tthis.carrinhoDg = this.carrinhoDg + '<L>';\n");
      out.write("\n");
      out.write("                var pbm = carrinho[l][11];\n");
      out.write("                var sessionCar = JSON.parse(sessionStorage.getItem(\"myCart\"));\n");
      out.write("                if(sessionCar[l].descGerenciaPBM != undefined && sessionCar[l].cdProduto == carrinho[l][1]){\n");
      out.write("\t                if ((pbm == 1 || pbm == 5 || pbm == 7) && countGerencia == 0) {\n");
      out.write("\t                    geraAutorizacaoPbmCarrinhoNovo();\n");
      out.write("\t                    autorizacaoPbmGerada = true;\n");
      out.write("\t                    countGerencia = 1;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\tif (this.carrinhoDg != \"\") {\n");
      out.write("            // Obtem descricao da filial\n");
      out.write("\t\t\tdsFilial = getCookie(\"FILIAL\").split('<C>')[1];\n");
      out.write("\t\t\tcdFilial = getCookie(\"FILIAL\").split('<C>')[0];\n");
      out.write("\n");
      out.write("\t\t\tgeraAutorizacao();\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tgeraAutorizacaoPbmCarrinhoNovo();\n");
      out.write("\t\t\tMyCart.run();\n");
      out.write("\t\t\tnovoAtendimento();\n");
      out.write("\t\t\tautorizacaoPbmGerada = true;\n");
      out.write("\t\t}\n");
      out.write("\t\tsetCookie(\"contextDesconto\", '');\n");
      out.write("\t\tMyCart.run();\n");
      out.write("        if(!autorizacaoPbmGerada){\n");
      out.write("\t\t\tgeraAutorizacaoPbmCarrinhoNovo();\n");
      out.write("\t\t}\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\tfunction consultaReserva() {\n");
      out.write("\t\tdisplayHideToolbar($j('#idAlertPedidoUrgente'),'pedidoCompreRetUrgenteBackground');\n");
      out.write("\t\tdisplayHideToolbar($j('#idAlertPedidoAprovados'),'pedidoCompreRetAprovadosBackground');\n");
      out.write(" \t    var ret = buscarReservaProdutoPorFilial(cdFilial);\n");
      out.write(" \t    if(ret){\n");
      out.write(" \t    \tvar retorno = ret.toString().replace(/,/g, \";\");\n");
      out.write("\t\t\tretReservaProduto(retorno);\n");
      out.write(" \t    }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction consultarPedidosCompreRetireEmAberto(){\n");
      out.write("\t\t$j('#qtReserva').text('');\n");
      out.write("\t\t$j('#idQtReserva').hide();\n");
      out.write("\t\tdisplayHideToolbar($j('#idAlertPedidoUrgente'),'pedidoCompreRetUrgenteBackground');\n");
      out.write("\t\tdisplayHideToolbar($j('#idAlertPedidoAprovados'),'pedidoCompreRetAprovadosBackground');\n");
      out.write("\t\tdisplayHideToolbar($j('#idAlertPedidoRetirada'),'alertPedidoRetiradaBackground');\n");
      out.write("\n");
      out.write("\t\tvar ret = buscarPedidosCompreRetireEmAberto(cdFilial);\n");
      out.write("\t\tif(ret){\n");
      out.write("\t\t\tvar retorno = ret.toString().replace(/,/g, \";\");\n");
      out.write("\t\t\tretQtdPedidosCompreRetireMp(retorno);\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction consultarReservasEntreLojas(){\n");
      out.write("\t\tdisplayHideToolbar($j('#idAlertPedidoUrgente'),'pedidoCompreRetUrgenteBackground');\n");
      out.write("\t\tdisplayHideToolbar($j('#idAlertPedidoAprovados'),'pedidoCompreRetAprovadosBackground');\n");
      out.write("\t\tdisplayHideToolbar($j('#idAlertPedidoRetirada'),'alertPedidoRetiradaBackground');\n");
      out.write("\n");
      out.write("\t\tvar ret = buscarReservaEntreLojas(cdFilial);\n");
      out.write("\t\tif(ret){\n");
      out.write("\t\t\tvar retorno = ret.toString().replace(/,/g, \";\");\n");
      out.write("\t\t\tretReservaEntreLojas(retorno);\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("function retReservaEntreLojas(ret) {\n");
      out.write("\t\tif (ret.substring(0, 5) == \"false\") {\n");
      out.write("\t\t\ttoastr['error'](\"Erro ao Consultar a Reserva entre Lojas!\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tarrayReservaApp = ret.split(\";\");\n");
      out.write("\t\t\tdisplayAlertaToolbar(arrayReservaApp);\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tfunction retQtdPedidosCompreRetireMp(ret) {\n");
      out.write("\t\tif (ret.substring(0, 5) == \"false\") {\n");
      out.write("\t\t\ttoastr['error'](\"Erro ao Consultar a Reserva!\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tvar msg = '';\n");
      out.write("\t\t\tarrayReservaApp = ret.split(\";\");\n");
      out.write("\t\t\tvar time = arrayReservaApp[0];\n");
      out.write("\t\t\tqtdPedidos = arrayReservaApp[1];\n");
      out.write("\t\t\tif(time < 0){\n");
      out.write("\t\t\t\ttime = 0;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tif(qtdPedidos > 0){\n");
      out.write("\t\t\t\tvar properties = {\n");
      out.write("\t\t\t\t\tcolor : (+LOGO_MARCA === 1) ? 'green' : '#E23D41'\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t\t$j('#idQtReserva').show();\n");
      out.write("\t\t\t\tif(qtdPedidos > 1){\n");
      out.write("\t\t\t\t\t$j('#qtReserva').text(qtdPedidos + ' PEDIDOS PENDENTES - '+time+' MIN.');\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t$j('#qtReserva').text(qtdPedidos + ' PEDIDO PENDENTE - '+time+' MIN.');\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tvar backgroundColorDivToolbar = (+LOGO_MARCA === 1) ? 'rgb(166,25,46)' : 'rgb(197,192,184)';\n");
      out.write("\n");
      out.write("\t\t\t\t$j('#divToolbar').css('background', backgroundColorDivToolbar);\n");
      out.write("\t\t\t\t$j('#qtReserva').attr( \"title\", msg );\n");
      out.write("\t\t\t\t$j('#qtReserva').show();\n");
      out.write("\n");
      out.write("\t\t\t\tif(blink){\n");
      out.write("\t\t\t\t\tvar el = $j('#qtReserva');\n");
      out.write("\t\t\t\t\tel.pulse(properties, { pulses : -1 });\n");
      out.write("\t\t\t\t\tblink = false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$j('#idQtReserva').pulse('destroy');\n");
      out.write("\t\t\t\tvar backgroundColorDivToolbar = (+LOGO_MARCA === 1) ? 'rgb(0,140,149)' : 'rgb(192,38,53)';\n");
      out.write("\t\t\t\t$j('#qtReserva').pulse('destroy');\n");
      out.write("\t\t\t\t$j('#divToolbar').css('background', backgroundColorDivToolbar);\n");
      out.write("\t\t\t\tblink = true;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction retReservaProduto(ret) {\n");
      out.write("\t\tif (ret.substring(0, 5) == \"false\") {\n");
      out.write("\t\t\ttoastr['error'](\"Erro ao Consultar a Reserva!\");\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\tvar msg = '';\n");
      out.write("\t\t\tarrayReservaApp = ret.split(\";\");\n");
      out.write("\t\t\tvar time = arrayReservaApp[0];\n");
      out.write("\t\t\tqtdPedidos = arrayReservaApp[1];\n");
      out.write("\t\t\tif(time < 0){\n");
      out.write("\t\t\t\ttime = 0;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tif(qtdPedidos > 0){\n");
      out.write("\t\t\t\tvar properties = {\n");
      out.write("\t\t\t\t   color : (+LOGO_MARCA === 1) ? 'green' : '#E23D41'\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t\t$j('#idQtReserva').show();\n");
      out.write("\t\t\t\tif(qtdPedidos > 1){\n");
      out.write("\t\t\t\t\t$j('#qtReserva').text(qtdPedidos + ' RESERVAS PENDENTES - '+time+' MIN.');\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t$j('#qtReserva').text(qtdPedidos + ' RESERVA PENDENTE - '+time+' MIN.');\n");
      out.write("\t\t\t\t}\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\tvar backgroundColorDivToolbar = (+LOGO_MARCA === 1) ? 'rgb(166,25,46)' : 'rgb(197,192,184)';\n");
      out.write("\n");
      out.write("\t\t\t\t$j('#divToolbar').css('background', backgroundColorDivToolbar);\n");
      out.write("\t\t\t\t$j('#qtReserva').attr( \"title\", msg );\n");
      out.write("\t\t\t\t$j('#qtReserva').show();\n");
      out.write("\n");
      out.write("\t\t\t\tif(blink){\n");
      out.write("\t\t\t\t\tvar el = $j('#qtReserva');\n");
      out.write("\t\t\t\t\tel.pulse(properties, { pulses : -1 });\n");
      out.write("\t\t\t\t\tblink = false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tvar backgroundColorDivToolbar = (+LOGO_MARCA === 1) ? 'rgb(0,140,149)' : 'rgb(192,38,53)';\n");
      out.write("\t\t\t\t$j('#qtReserva').pulse('destroy');\n");
      out.write("\t\t\t\t$j('#idQtReserva').pulse('destroy');\n");
      out.write("\t\t\t\t$j('#divToolbar').css('background', backgroundColorDivToolbar);\n");
      out.write("\t\t\t\tblink = true;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction redirectStatus(){\n");
      out.write("\t\tcdOperador = '");
      if (_jspx_meth_c_005fout_005f81(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\tif(cdOperador != \"\"){\n");
      out.write("\t\t\t\tabreCompreRetireAproRej();\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction redirectStatusNovoLayout(){\n");
      out.write("\t\tcdOperador = '");
      if (_jspx_meth_c_005fout_005f82(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\tif(cdOperador != \"\"){\n");
      out.write("\t\t\t\tvar url = HREF_CR_SEPARAR_FATURAR;\n");
      out.write("\t\t\t\tdocument.location.href = url;\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction displayAlertaToolbar(array){\n");
      out.write("\t\tvar idAlertPedidoUrgente = $j('#idAlertPedidoUrgente');\n");
      out.write("\t\tvar idTxtAlertPedidoUrgente = $j('#idTxtAlertPedidoUrgente');\n");
      out.write("\t\tvar idAlertPedidoAprovado = $j('#idAlertPedidoAprovados');\n");
      out.write("\t\tvar idTxtAlertPedidoAprovado = $j('#idTxtAlertPedidoAprovados');\n");
      out.write("\n");
      out.write("\t\tvar idAlertPedidoRetirada = $j('#idAlertPedidoRetirada');\n");
      out.write("\t\tvar idTxtAlertPedidoRetirada = $j('#idTxtAlertPedidoRetirada');\n");
      out.write("\n");
      out.write("\t\tvar msgTxtAlertPedidoAprovado = '';\n");
      out.write("\t\tvar msgTxtAlertPedidoUrgente = '';\n");
      out.write("\t\tvar msgTxtAlertPendenteRetirada = '';\n");
      out.write("\n");
      out.write("\t\tvar msgUrgente = '';\n");
      out.write("\t\tif(array.length > 2 ){\n");
      out.write("\t\t\tvar qtdReservaTc = array[1];\n");
      out.write("\t\t\tvar qtdReservaAprovada = array[2];\n");
      out.write("\t\t\tvar qdtReservaPendenteRetirada = array[3];\n");
      out.write("\t\t\tif(qtdReservaTc > 0){\n");
      out.write("\t\t\t\texistsReservaPendente = true;\n");
      out.write("\t\t\t\tvar timeReservaTc = array[0];\n");
      out.write("\t\t\t\tif(timeReservaTc < 0){\n");
      out.write("\t\t\t\t\ttimeReservaTc = 0;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tmsgTxtAlertPedidoUrgente = qtdReservaTc + ' APROVAR RESERVAS' + ' - ' + timeReservaTc + ' MIN ';\n");
      out.write("\t\t\t\tif(qtdReservaTc == 1){\n");
      out.write("\t\t\t\t\tmsgUrgente = 'Há ' + qtdReservaTc + ' reserva de estoque, aguardando confirmação.';\n");
      out.write("\t\t\t\t} else {\n");
      out.write("\t\t\t\t\tmsgUrgente = 'Há ' + qtdReservaTc + ' reservas de estoque, aguardando confirmação.';\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tdisplayShowToolbar(idAlertPedidoUrgente,'pedidoCompreRetUrgenteBackground');\n");
      out.write("\t\t\t\tif('true' == filialVersaoReservaAppEntreLojasAlertaSonoro){\n");
      out.write("\t\t\t\t\tplayAlertaSonoro();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\texistsReservaPendente = false;\n");
      out.write("\t\t\t\tdisplayHideToolbar(idAlertPedidoUrgente,'pedidoCompreRetUrgenteBackground');\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tif(qtdReservaAprovada > 0){\n");
      out.write("\t\t\t\tmsgTxtAlertPedidoAprovado = qtdReservaAprovada + ' RESERVAS ENVIADAS';\n");
      out.write("\t\t\t\tdisplayShowToolbar(idAlertPedidoAprovado,'pedidoCompreRetAprovadosBackground');\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tdisplayHideToolbar(idAlertPedidoAprovado,'pedidoCompreRetAprovadosBackground');\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tif(qdtReservaPendenteRetirada > 0 && (qtdReservaTc <= 0 || qtdReservaAprovada <= 0)){\n");
      out.write("\t\t\t\tmsgTxtAlertPendenteRetirada = qdtReservaPendenteRetirada + ' RETIRADA DE RESERVAS';\n");
      out.write("\t\t\t\tdisplayShowToolbar(idAlertPedidoRetirada,'alertPedidoRetiradaBackground');\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tdisplayHideToolbar(idAlertPedidoRetirada,'alertPedidoRetiradaBackground');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tdisplayHideToolbar(idAlertPedidoUrgente,'pedidoCompreRetUrgenteBackground');\n");
      out.write("\t\t\tdisplayHideToolbar(idAlertPedidoAprovado,'pedidoCompreRetAprovadosBackground');\n");
      out.write("\t\t\tdisplayHideToolbar(idAlertPedidoRetirada,'alertPedidoRetiradaBackground');\n");
      out.write("\t\t}\n");
      out.write("\t\tidTxtAlertPedidoUrgente.text(msgTxtAlertPedidoUrgente);\n");
      out.write("\t\tidTxtAlertPedidoUrgente.attr( \"title\", msgUrgente );\n");
      out.write("\t\tidTxtAlertPedidoAprovado.text(msgTxtAlertPedidoAprovado);\n");
      out.write("\t\tidTxtAlertPedidoRetirada.text(msgTxtAlertPendenteRetirada);\n");
      out.write("\t};\n");
      out.write("\n");
      out.write("\tfunction playAlertaSonoro(){\n");
      out.write("\t\tsetInterval(function(){\n");
      out.write("\t\t\tif(existsReservaPendente){\n");
      out.write("\t\t\t\tvar audio = document.querySelector('#alertaReservaAprovada');\n");
      out.write("\t\t\t\taudio.play();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},5000);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction displayShowToolbar(id,background) {\n");
      out.write("\t\tid.show();\n");
      out.write("\t\tformatBackgroundPedido(id, true, background);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction displayHideToolbar(id,background) {\n");
      out.write("\t\tid.hide();\n");
      out.write("\t\tformatBackgroundPedido(id, false, background);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction formatBackgroundPedido(id, isShow, background) {\n");
      out.write("\t   if (isShow){\n");
      out.write("\t   \t   id.addClass(background);\n");
      out.write("\t   } else {\n");
      out.write("\t       id.removeClass(background);\n");
      out.write("\t   }\n");
      out.write("\t}\n");
      out.write("\tfunction formatBackgroundPedidoUrgente(id, isShow, background) {\n");
      out.write("\t   var background = 'pedidoCompreRetUrgenteBackground';\n");
      out.write("\t   if (isShow){\n");
      out.write("\t   \t   id.addClass(background);\n");
      out.write("\t   } else {\n");
      out.write("\t       id.removeClass(background);\n");
      out.write("\t   }\n");
      out.write("\t}\n");
      out.write("\t    \n");
      out.write("\tfunction formatBackgroundPedidoAprovados(id, isShow) {\n");
      out.write("\t   var background = 'pedidoCompreRetAprovadosBackground';\n");
      out.write("\t   if (isShow){\n");
      out.write("\t   \t   id.addClass(background);\n");
      out.write("\t   } else {\n");
      out.write("\t       id.removeClass(background);\n");
      out.write("\t   }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction maskCpfCliente(clienteCpf) {\n");
      out.write("\t\tif(!isStringEmpty(clienteCpf)){\n");
      out.write("\t\t    clienteCpf = clienteCpf.replace( /\\D/g , \"\");\n");
      out.write("\t\t    clienteCpf = clienteCpf.replace( /(\\d{3})(\\d)/ , \"$1.$2\");\n");
      out.write("\t\t    clienteCpf = clienteCpf.replace( /(\\d{3})(\\d)/ , \"$1.$2\");\n");
      out.write("\t\t    clienteCpf = clienteCpf.replace( /(\\d{3})(\\d{1,2})$/ , \"$1-$2\");\n");
      out.write("\t\t    document.getElementById(\"cpfCliente\").innerHTML = clienteCpf + \"&nbsp;-&nbsp;\";\n");
      out.write("\t\t} else {\n");
      out.write("\t\t    var elem = document.getElementById(\"nomeCliente\");\n");
      out.write("    \t\telem.className = \"\";\n");
      out.write("    \t\telem.removeAttribute(\"title\");\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<script id=\"template-carrinhoCompras\" type=\"text/x-handlebars-template\">\n");
      out.write("\t<div class=\"dlgTopo\" style=\"margin-top: 2px;\">\n");
      out.write("\t\t<span class=\"dlgNome\">COMPRAS:</span>\n");
      out.write("\n");
      out.write("\t\t<img id=\"imgCarrinhoLoad\" \n");
      out.write("\t\tstyle=\"vertical-align: middle; display: none; margin-top: 2px; float: right;\" \n");
      out.write("\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f79(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<table class=\"font11listaresult\" id=\"tabCesta\" width=\"400\" border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"0\" >\n");
      out.write("\t\t<tr class=\"cestaDeComprasTotal\">\n");
      out.write("\t\t\t<th align=\"left\">&nbsp;</th>\n");
      out.write("\t\t\t<th align=\"left\">C&oacute;digo</th>\n");
      out.write("\t\t\t<th align=\"left\">Descri&ccedil;&atilde;o</th>\n");
      out.write("\t\t\t<th align=\"center\">Unit&aacute;rio R$</th>\n");
      out.write("\t\t\t<th align=\"center\">R$</th>\n");
      out.write("\t\t\t<th align=\"right\">Qtd.</th>\n");
      out.write("\t\t\t<th align=\"center\">&nbsp;</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t{{#produtos}}\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th align=\"left\" class=\"alteraCursor\" style=\"color: #DD0000\" onclick=\"removeItem('{{@index}}')\"><b>X</b></th>\n");
      out.write("\t\t\t<td align=\"left\"><b>{{cdProduto}}</b></td>\n");
      out.write("\t\t\t<td align=\"left\"><b>{{dsProduto}}</b></td>\n");
      out.write("\t\t\t<td id=\"precoUni_{{@index}}\" align=\"center\"><b>{{decimal precoLiquido}}</b></td>\n");
      out.write("\t\t\t<td id=\"precoQtd_{{@index}}\" align=\"right\"><b>{{decimal precoQtd}}</b></td>\n");
      out.write("\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t<b>\n");
      out.write("\t\t\t\t<span id=\"lblQtd{{@index}}\" class=\"alteraCursor\" style=\"display: inline;\" \n");
      out.write("\t\t\t\t\tonclick=\"changeQtd('{{@index}}')\">\n");
      out.write("\t\t\t\t\t{{pQtd}}\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t<input id=\"txtQtd{{@index}}\" \n");
      out.write("\t\t\t\t\t\tstyle=\"display: none; width: 15px; text-align: right; background-color: #F3F5FB;\" type=\"text\" \n");
      out.write("\t\t\t\t\t\tvalue=\"{{pQtd}}\" onblur=\"montaCarrinho();\" \n");
      out.write("\t\t\t\t\t\tonkeypress=\"whenEnterOrEscExec(event, updateQtd, {{@index}}, montaCarrinho)\"/>\n");
      out.write("\t\t\t</b>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td align=\"center\" style=\"color: #009900\">\n");
      out.write("\t\t\t\t<span class=\"alteraCursor\" onclick=\"incItem('{{@index}}')\">\n");
      out.write("\t\t\t\t\t<img id=\"incItem_{{@index}}\" src=\"");
      if (_jspx_meth_c_005furl_005f80(_jspx_page_context))
        return;
      out.write("/images/buttons/buttonMais.gif\"/>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t&nbsp;\n");
      out.write("\t\t\t\t<span class=\"alteraCursor\" onclick=\"decItem('{{@index}}')\">\n");
      out.write("\t\t\t\t\t<img id=\"decItem_{{@index}}\" src=\"");
      if (_jspx_meth_c_005furl_005f81(_jspx_page_context))
        return;
      out.write("/images/buttons/buttonMenos.gif\"/>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t{{/produtos}}\n");
      out.write("\t\t<tr class=\"cestaDeComprasTotal\" style=\"font-size: 12px; color: #0077BB\" height=23>\n");
      out.write("\t\t\t<th colspan=\"3\" align=\"left\">\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"buttonMid descGerPrint\" style=\"margin-left: 5px;\" name=\"descGerPrint\" id=\"descGerPrint\"\n");
      out.write("\t\t\t\t\t   value=\"Finalizar\" title=\"Finaliza compra e imprime desconto ger&ecirc;ncia\"\n");
      out.write("\t\t\t\t\t   onclick=\"imprimeDescGer()\"/>\n");
      out.write("\t\t\t{{#ifEquals visibilityAutorizacaoSevenPdv}}\n");
      out.write("\t\t\t{{/ifEquals}}\n");
      out.write("\t\t\t</th>\n");
      out.write("\t\t\t<th align=\"right\">TOTAL:&nbsp;</th>\n");
      out.write("\t\t\t<th colspan=\"4\" align=\"center\">R$ {{decimal valorTotal}}</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script id=\"template-carrinhoPbm\" type=\"text/x-handlebars-template\">\n");
      out.write("\t<div class=\"dlgTopo\" style=\"margin-top: 2px;\">\n");
      out.write("\t\t<span class=\"dlgNome\">Autoriza&ccedil;&atilde;o PBM</span>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div>\n");
      out.write("\n");
      out.write("\t\t<table style=\"border-bottom: dashed\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>Editar autoriza&ccedil;&atilde;o\n");
      out.write("\t    \t\t<span class=\"alteraCursor\" onclick=\"exibeDialogoCarrinhoPbm('dlgCarrinhoPbm');openEditarAutorizacao();\">\n");
      out.write("\t\t\t\t\t<img src=\"");
      if (_jspx_meth_c_005furl_005f82(_jspx_page_context))
        return;
      out.write("/images/buttons/edit-2-16.png\"/>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table></div>\n");
      out.write("\t<br/>\n");
      out.write("\t<div id=\"divNovaAutorizacaoPbm\">\n");
      out.write("\t\t<table id=\"tabPbm\" width=\"330\" border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"0\"  >\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th align=\"left\">Autoriza&ccedil;&atilde;o</th>\n");
      out.write("\t\t\t\t<th align=\"left\">PBM</th>\n");
      out.write("\t\t\t\t<th align=\"left\">CRM</th>\n");
      out.write("\t\t\t\t<th align=\"center\">&nbsp;</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td align=\"left\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\n");
      out.write("                <td align=\"left\">\n");
      out.write("\t\t\t\t\t<select name=\"dsPbm\" id=\"dsPbm\" onkeypress=\"whenEnterExec(event, focaNrCrPbm)\">\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td align=\"left\">\n");
      out.write("\t\t\t\t\t<input id=\"nrCrPbm\" type=\"text\" size=\"7\" value=\"{{nrCr}}\" onKeyPress=\"Mascara(this,Integer); whenEnterExec(event, focaIncluirPbm)\"/>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t<span class=\"alteraCursor\" onclick=\"incluirAutPbm()\">\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      if (_jspx_meth_c_005furl_005f83(_jspx_page_context))
        return;
      out.write("/images/buttons/green_check.png\"/>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<div id=\"dlgCarrinhoPbmViewAdded\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</script>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"divToolbar\" style=\"width:100%; height:30px;\">\n");
      out.write("\t<form action=\"/portal/tc/produto/ConsultaProdutoWindow\" method=\"GET\" style=\"margin:0px;height: 30px\">\n");
      out.write("\n");
      out.write("\t    ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t    ");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t    ");
      if (_jspx_meth_c_005fset_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<input type=\"hidden\" name=\"action\" value=\"1\"/>\n");
      out.write("\n");
      out.write("        <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flLgpdTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"apoioTratamentoLgpd\"/>\n");
      out.write("\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flLgpdApp}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"lembreteRecompraAppLgpd\"/>\n");
      out.write("\n");
      out.write("\t\t<table id=\"tblCli\" width=\"100%\" border=\"0\" class=\"tbBorderSpacing\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t<td id=\"tdPerfilCliente\" align=\"right\">\n");
      out.write("\t\t\t\t\t<span id=\"perfilClienteCompleto\" class=\"perfilSpan\" style=\"display:none\" >");
      if (_jspx_meth_c_005fout_005f83(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<span id=\"toolbarCliente\" class=\"toolbarCliente\"\n");
      out.write("\t\t\t\t\t  style=\"float: right; display: none\">&nbsp;</span>\n");
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<td align=\"right\" style=\"width: 25px;\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- BEGIN Cart -->\n");
      out.write("\t\t\t\t\t<div id=\"myCart\" class=\"myCart ");
      if (_jspx_meth_c_005fif_005f16(_jspx_page_context))
        return;
      out.write(" \">\n");
      out.write("\t\t\t\t\t\t<div id=\"movable-box\" class=\"container-cart\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"drag-point\" class=\"title-bar drag-handle\">\n");
      out.write("\t\t\t\t\t\t\t\tCarrinho<i id=\"myCart-btnFechar\" class=\"fa fa-minus\" onclick=\"MyCart.close()\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container-cartList\">\n");
      out.write("\t\t\t\t\t\t\t\t<table class=\"table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- thead -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Código</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Descrição</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Qtd.</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>PMC</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>%</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>Unitário</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>R$</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>CRM</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"total\">TOTAL: <span id=\"myCartTotal\"></span></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"saving\">Voc&ecirc; est&aacute; economizando <span id=\"myCartSave\"></span></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- // DESABILITADO\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"selectPaymentTypes\">Selecione a forma de pagamento</h3>\n");
      out.write("\t\t\t\t\t\t\t-->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cart-footer\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!--\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"payment-types\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li id=\"myCart-btCaixa\" onclick=\"MyCart.setPaymentType('pdv')\"><i class=\"fa fa-cash-register\"></i> Caixa</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f17(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t-->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!-- fastPass bt -->\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f18(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f19(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_005fif_005f20(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--\n");
      out.write("                                    <button id=\"myCart-btImprimir\" type=\"button\" onclick=\"window.print()\" class=\"button print\">\n");
      out.write("                                        <i class=\"fa fa-print\"></i>\n");
      out.write("                                        <span>Imprimir</span>\n");
      out.write("                                    </button>\n");
      out.write("                                    -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tFinalizar atendimento e efetuar pagamento no PDV\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f21(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f22(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"pdv_col\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"button print descGerPrint\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"pushPurchase(); imprimeDescGer();\" name=\"descGerPrint\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"myCart-btFinalizar\" data-tooltip=\"Finalizar e pagar no PDV\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-cash-register\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span>Finalizar</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"shadowBox\" class=\"shadow-box\" onclick=\"MyCart.close()\">&nbsp;</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- END Cart -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"ccraiaFrame\"\n");
      out.write("\tstyle=\"position: fixed; z-index: 20000; top: 55px; left: 190px; width: 750px;\"></div>\n");
      out.write("\n");
      out.write("<div id=\"vmsFrame\"\n");
      out.write("\tstyle=\"position: fixed; z-index: 20000; top: 55px; left: 190px; width: 800px;\"></div>\n");
      out.write("\t\n");
      out.write("<!-- <div id=\"theCestaDeCompras\" class=\"cestaDeCompras\"></div> -->\n");
      out.write("\n");
      out.write("<div id=\"nroCartoPbmr\" style=\"display:none\">\n");
      out.write("\t<span id=\"nroCartao\" value=\"\"></span>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"dialogMensagem\" style=\"display:none\">\n");
      out.write("\t<p>\n");
      out.write("\t\t<span class=\"dlgIcon imgInfo\"></span>\n");
      out.write("\t\t<span class=\"dlgIcon imgErro\"></span>\n");
      out.write("\t\t<span id=\"mensagem\"></span>\n");
      out.write("\t</p>\n");
      out.write("</div>\n");
      out.write("<div id=\"template-carrinhoPbmEditar\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- DIALOG - RESERVA DE PRODUTO -->\n");
      out.write("<div id=\"idDialogReservaEstLjFrame\" class=\"dialog dialog-iframe-content\" style=\"display: none\">\n");
      out.write("\t<div class=\"div-iframe-size\" id=\"reservaEstLjFrame\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      if (_jspx_meth_c_005fif_005f23(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fif_005f24(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fif_005f25(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fif_005f26(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tcarrinhoCompras.importar();\n");
      out.write("\tmontaCarrinho();\n");
      out.write("\tvar isLembrete = getCookie(\"isLembrete\");\n");
      out.write("\tif(isLembrete){\n");
      out.write("\t\tdocument.getElementById('lembrete').style.display = 'inline';\n");
      out.write("\t}\n");
      out.write("    if(clienteEspecial == 'true'){\n");
      out.write("\t\t$j('#toolbarClienteLogado').css('color', '#ffa90b');\n");
      out.write("\t}else{\n");
      out.write("\t\t$j('#toolbarClienteLogado').css('color', '#ffffff');\n");
      out.write("\t}\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tvar testMyCart_db = JSON.parse(sessionStorage.getItem('myCart_db'))\n");
      out.write("\tvar cliente = (clienteCompleto && clienteCompleto.cliente) ? clienteCompleto.cliente : null\n");
      out.write("\tif(\n");
      out.write("\t\t\t(cliente && !testMyCart_db) ||\n");
      out.write("\t\t\t(cliente && testMyCart_db && testMyCart_db.cliente.cpf !== cliente.cpf)\n");
      out.write("\t) {\n");
      out.write("\t\t\n");
      out.write("\t\tif(!/\\?mode=view&idCliente=[\\d]+&action=e&windowstate=normal/.test(location.search)){\n");
      out.write("\t\t\tsessionStorage.removeItem('myCart_db')\n");
      out.write("\t\t\tMyCart.request()\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t// COPIAR CPF\n");
      out.write("    var cpfToClipboard = function() {\n");
      out.write("        var content = (+LOGO_MARCA === 1) ? clienteCompleto.cliente.cpf : cliente.cpf\n");
      out.write("        var body = document.querySelector('body')\n");
      out.write("        var input = document.createElement('input')\n");
      out.write("        input.value = content\n");
      out.write("        input.setAttribute('id','tempContainerDataToClipboard')\n");
      out.write("        body.appendChild(input)\n");
      out.write("        var dataToClipboard = document.querySelector('#tempContainerDataToClipboard')\n");
      out.write("        dataToClipboard.select()\n");
      out.write("        dataToClipboard.style.border = 0\n");
      out.write("        dataToClipboard.style.backgroundColor = 'transparent'\n");
      out.write("        dataToClipboard.style.color = 'transparent'\n");
      out.write("        document.execCommand('copy')\n");
      out.write("        try {\n");
      out.write("            dataToClipboard.removeNode()\n");
      out.write("        } catch (err) {\n");
      out.write("            dataToClipboard.remove()\n");
      out.write("        }\n");
      out.write("        toastr['info']('Use Ctrl+V para colar','CPF copiado com sucesso')\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div class=\"fpass\">\n");
      out.write("\t<div class=\"lightbox\">\n");
      out.write("\t\t<div class=\"card waiting-payment\">\n");
      out.write("\t\t\t<div class=\"header\">Pagamento FastPass</div>\n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>");
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
    // /WEB-INF/jsp/toolbar.jsp(8,57) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
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
    // /WEB-INF/jsp/toolbar.jsp(8,79) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 'raia/' : 'drogasil/'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
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
    // /WEB-INF/jsp/toolbar.jsp(9,71) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/css/entregavizinhanca.css");
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
    // /WEB-INF/jsp/toolbar.jsp(10,73) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
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
    // /WEB-INF/jsp/toolbar.jsp(11,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<script>\n");
        out.write("\t/**\n");
        out.write("\t * ATUALIZA FAVICON\n");
        out.write("\t */\n");
        out.write("\tfunction setFavicon() {\n");
        out.write("\t\tvar path = \"/tc-core-portlets_1.0/images/favicons/\"\n");
        out.write("\t\tvar faviconsList = [\n");
        out.write("\t\t\t{rel:\"apple-touch-icon\", sizes:\"180x180\", href: path + \"apple-touch-icon.png\" },\n");
        out.write("\t\t\t{rel:\"icon\", type:\"image/png\", sizes:\"32x32\", href: path + \"favicon-32x32.png\"},\n");
        out.write("\t\t\t{rel:\"icon\", type:\"image/png\", sizes:\"16x16\", href: path + \"favicon-16x16.png\"},\n");
        out.write("\t\t\t{rel:\"manifest\", href: path + \"site.webmanifest\"}\n");
        out.write("\t\t]\n");
        out.write("\n");
        out.write("\t\tvar oldLink = document.querySelector('head link[rel=\"shortcut icon\"]')\n");
        out.write("\t\tif (oldLink){\n");
        out.write("\t\t\tif (oldLink.removeNode) { oldLink.removeNode() }\n");
        out.write("\t\t\telse { oldLink.remove() }\n");
        out.write("\t\t}\n");
        out.write("\t\tvar head = document.querySelector('head')\n");
        out.write("\n");
        out.write("\t\tfor(var n = 0; n < faviconsList.length; n++){\n");
        out.write("\t\t\tvar link = document.createElement('link')\n");
        out.write("\t\t\tlink.setAttribute('rel', faviconsList[n].rel)\n");
        out.write("\t\t\tif (faviconsList[n].type)\n");
        out.write("\t\t\t\tlink.setAttribute('type',faviconsList[n].type)\n");
        out.write("\t\t\tif (faviconsList[n].sizes)\n");
        out.write("\t\t\t\tlink.setAttribute('sizes',faviconsList[n].sizes)\n");
        out.write("\t\t\tlink.setAttribute('href',faviconsList[n].href)\n");
        out.write("\t\t\thead.appendChild(link)\n");
        out.write("\t\t}\n");
        out.write("\t}\n");
        out.write("\tsetFavicon()\n");
        out.write("</script>\n");
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

  private boolean _jspx_meth_c_005fout_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(49,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(51,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ofertasExclusivasUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(52,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ccraiaUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(53,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${terminalConsultaServicosUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(54,42) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${terminalConsultaServicosUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
    if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
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
    // /WEB-INF/jsp/toolbar.jsp(55,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${integracaoServicoUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(56,31) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emissorNFeWebUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(57,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${farmaciaPopularServicosUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(58,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${farmaciaPopularImagensUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(63,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlNovaPaginaEstoqueProximidade}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f10 = _jspx_th_c_005fout_005f10.doStartTag();
    if (_jspx_th_c_005fout_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f10);
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
    // /WEB-INF/jsp/toolbar.jsp(64,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlNovoCadastroClientePbmr}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(65,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostFastPassServices}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(66,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostHistoricoComprasPbm}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(67,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${urlHomePerfilCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(68,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f15.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostCarrinhoServices}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f15 = _jspx_th_c_005fout_005f15.doStartTag();
    if (_jspx_th_c_005fout_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f16.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(69,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f16.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostOfexServices}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f16 = _jspx_th_c_005fout_005f16.doStartTag();
    if (_jspx_th_c_005fout_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f17 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f17.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(70,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f17.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostInclusaoNrCartaoBeneficio}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f17 = _jspx_th_c_005fout_005f17.doStartTag();
    if (_jspx_th_c_005fout_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f17);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f18.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(71,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f18.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fileUploadHost}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f18 = _jspx_th_c_005fout_005f18.doStartTag();
    if (_jspx_th_c_005fout_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f19.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(72,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f19.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fileUploadPort}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f19 = _jspx_th_c_005fout_005f19.doStartTag();
    if (_jspx_th_c_005fout_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f20.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(73,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f20.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdAutorizadorUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f20 = _jspx_th_c_005fout_005f20.doStartTag();
    if (_jspx_th_c_005fout_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f21 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f21.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(74,27) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f21.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${clienteEspecial}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f21 = _jspx_th_c_005fout_005f21.doStartTag();
    if (_jspx_th_c_005fout_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f21);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f22 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f22.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(75,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f22.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produtoEstoqueApiUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f22 = _jspx_th_c_005fout_005f22.doStartTag();
    if (_jspx_th_c_005fout_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f22);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f23 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f23.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(77,27) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f23.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostQtdeEstoque}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f23 = _jspx_th_c_005fout_005f23.doStartTag();
    if (_jspx_th_c_005fout_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f23);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f24 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f24.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(79,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f24.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${microserviceBackommerceUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f24 = _jspx_th_c_005fout_005f24.doStartTag();
    if (_jspx_th_c_005fout_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f24);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f25 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f25.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(80,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f25.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostInclusaoNrCartaoBeneficio}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f25 = _jspx_th_c_005fout_005f25.doStartTag();
    if (_jspx_th_c_005fout_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f25);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f26 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f26.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(81,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f26.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostHistoricoCarrinhosUltimaHora}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f26 = _jspx_th_c_005fout_005f26.doStartTag();
    if (_jspx_th_c_005fout_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f26);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f27 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f27.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(82,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f27.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemFPCemPorcentoBalcao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f27 = _jspx_th_c_005fout_005f27.doStartTag();
    if (_jspx_th_c_005fout_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f27);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f28 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f28.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(83,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f28.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemPerfilReact}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f28 = _jspx_th_c_005fout_005f28.doStartTag();
    if (_jspx_th_c_005fout_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f28);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f29 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f29.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(84,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f29.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hostHubReceitaDigital}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f29 = _jspx_th_c_005fout_005f29.doStartTag();
    if (_jspx_th_c_005fout_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f29);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f30 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f30.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f30.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(86,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f30.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nfeutilitiesDownloadUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f30 = _jspx_th_c_005fout_005f30.doStartTag();
    if (_jspx_th_c_005fout_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f30);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f31 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f31.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f31.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(88,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f31.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdAuthorizatorCustomerUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f31 = _jspx_th_c_005fout_005f31.doStartTag();
    if (_jspx_th_c_005fout_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f31);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f32 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f32.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f32.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(89,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f32.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoCustomerMS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f32 = _jspx_th_c_005fout_005f32.doStartTag();
    if (_jspx_th_c_005fout_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f32);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f33 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f33.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f33.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(90,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f33.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${versaoMsCustomerSemEntradaDados}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f33 = _jspx_th_c_005fout_005f33.doStartTag();
    if (_jspx_th_c_005fout_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f33);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f34 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f34.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f34.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(91,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f34.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${integracaoPbmUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f34 = _jspx_th_c_005fout_005f34.doStartTag();
    if (_jspx_th_c_005fout_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f34);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f35 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f35.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f35.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(92,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f35.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaVersaoClienteLgpd}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f35 = _jspx_th_c_005fout_005f35.doStartTag();
    if (_jspx_th_c_005fout_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f35);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f36 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f36.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f36.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(94,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f36.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialVersaoGa}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f36 = _jspx_th_c_005fout_005f36.doStartTag();
    if (_jspx_th_c_005fout_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f36);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f37 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f37.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f37.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(95,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f37.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialVersaoImpressaoPreAutorizacao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f37 = _jspx_th_c_005fout_005f37.doStartTag();
    if (_jspx_th_c_005fout_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f37);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f38 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f38.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f38.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(96,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f38.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialVersaoEstornoAutorizacao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f38 = _jspx_th_c_005fout_005f38.doStartTag();
    if (_jspx_th_c_005fout_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f38);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f39 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f39.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f39.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(97,31) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f39.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaVersaoReserva}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f39 = _jspx_th_c_005fout_005f39.doStartTag();
    if (_jspx_th_c_005fout_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f39);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f40 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f40.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f40.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(98,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f40.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialVersaoReservaAppEntreLojas}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f40 = _jspx_th_c_005fout_005f40.doStartTag();
    if (_jspx_th_c_005fout_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f40);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f41 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f41.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f41.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(99,53) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f41.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialVersaoReservaAppEntreLojasAlertaSonoro}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f41 = _jspx_th_c_005fout_005f41.doStartTag();
    if (_jspx_th_c_005fout_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f41);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f42 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f42.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f42.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(100,46) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f42.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialVersaoReservaAppEntreLojasModal}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f42 = _jspx_th_c_005fout_005f42.doStartTag();
    if (_jspx_th_c_005fout_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f42);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f43 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f43.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f43.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(102,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f43.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemFarmaciaPopularReact}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f43 = _jspx_th_c_005fout_005f43.doStartTag();
    if (_jspx_th_c_005fout_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f43);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f44 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f44.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f44.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(103,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f44.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemFarmaciaPopularReactPerfil}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f44 = _jspx_th_c_005fout_005f44.doStartTag();
    if (_jspx_th_c_005fout_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f44);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f45 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f45.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f45.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(104,46) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f45.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemFarmaciaPopularReactProdutos}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f45 = _jspx_th_c_005fout_005f45.doStartTag();
    if (_jspx_th_c_005fout_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f45);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f46 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f46.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f46.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(105,54) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f46.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemFarmaciaPopularReactReutilizarImagem}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f46 = _jspx_th_c_005fout_005f46.doStartTag();
    if (_jspx_th_c_005fout_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f46);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f47 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f47.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f47.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(106,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f47.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entregaVizinhanca}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f47 = _jspx_th_c_005fout_005f47.doStartTag();
    if (_jspx_th_c_005fout_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f47);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f48 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f48.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f48.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(107,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f48.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemMsFarmaciaPopularBalcao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f48 = _jspx_th_c_005fout_005f48.doStartTag();
    if (_jspx_th_c_005fout_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f48);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f49 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f49.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f49.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(108,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f49.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemFiltroBuscaProdutos}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f49 = _jspx_th_c_005fout_005f49.doStartTag();
    if (_jspx_th_c_005fout_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f49);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f50 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f50.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f50.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(109,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f50.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialReimpressaoCupomFp}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f50 = _jspx_th_c_005fout_005f50.doStartTag();
    if (_jspx_th_c_005fout_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f50);
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
    // /WEB-INF/jsp/toolbar.jsp(110,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f51.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialHomeTCAlertasNovidades}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f51 = _jspx_th_c_005fout_005f51.doStartTag();
    if (_jspx_th_c_005fout_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f51);
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
    // /WEB-INF/jsp/toolbar.jsp(111,39) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f52.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemMsComprovanteDatasus}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f52 = _jspx_th_c_005fout_005f52.doStartTag();
    if (_jspx_th_c_005fout_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f52);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f53 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f53.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f53.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(112,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f53.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemMsFarmaciaPopular}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f53 = _jspx_th_c_005fout_005f53.doStartTag();
    if (_jspx_th_c_005fout_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f53);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f54 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f54.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f54.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(113,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f54.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${universUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f54 = _jspx_th_c_005fout_005f54.doStartTag();
    if (_jspx_th_c_005fout_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f54);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f55(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f55 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f55.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f55.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(115,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f55.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTemBuscaUnificadaReact}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f55 = _jspx_th_c_005fout_005f55.doStartTag();
    if (_jspx_th_c_005fout_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f55);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f56 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f56.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f56.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(116,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f56.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoModalCrmPbm}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f56 = _jspx_th_c_005fout_005f56.doStartTag();
    if (_jspx_th_c_005fout_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f56);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f57 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f57.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f57.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(117,32) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f57.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoAcessaModalDescontoPbm}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/toolbar.jsp(118,49) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f58.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${versaoHistoricoComprasCartaoUniversSaldo}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f58 = _jspx_th_c_005fout_005f58.doStartTag();
    if (_jspx_th_c_005fout_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f58);
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
    // /WEB-INF/jsp/toolbar.jsp(121,42) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f59.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaVersaoTcLgpdOfexIgnoraCons}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f59 = _jspx_th_c_005fout_005f59.doStartTag();
    if (_jspx_th_c_005fout_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f59);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f59);
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
    // /WEB-INF/jsp/toolbar.jsp(124,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/js/boxPromocaoProdutos.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
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
    // /WEB-INF/jsp/toolbar.jsp(125,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/js/jquery-1.5.1.min.js");
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
    // /WEB-INF/jsp/toolbar.jsp(133,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/css/fontawesome-free-5.7.2-all.min.css");
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
    // /WEB-INF/jsp/toolbar.jsp(135,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f60(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f60 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f60.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f60.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(135,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f60.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 'raia/' : 'drogasil/'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f60 = _jspx_th_c_005fout_005f60.doStartTag();
    if (_jspx_th_c_005fout_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f60);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f60);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f7.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(136,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f7.setValue("/");
    int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
    if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f61(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f61 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f61.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f61.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(140,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f61.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lembretesServicosUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f61 = _jspx_th_c_005fout_005f61.doStartTag();
    if (_jspx_th_c_005fout_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f61);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f61);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f8.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(142,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f8.setValue("/js/moment.min.js");
    int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
    if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f9.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(143,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f9.setValue("/js/lembretes/lembretes-constantes.js");
    int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
    if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f10.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(144,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f10.setValue("/js/lembretes/lembretes-rest-helper.js");
    int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
    if (_jspx_th_c_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f11.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(145,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f11.setValue("/js/lembretes/lembretes-validador-parametros.js");
    int _jspx_eval_c_005furl_005f11 = _jspx_th_c_005furl_005f11.doStartTag();
    if (_jspx_th_c_005furl_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f12.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(146,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f12.setValue("/js/lembretes/lembretes-validador.js");
    int _jspx_eval_c_005furl_005f12 = _jspx_th_c_005furl_005f12.doStartTag();
    if (_jspx_th_c_005furl_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f13.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(147,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f13.setValue("/js/lembretes/cadastro-lembretes.js");
    int _jspx_eval_c_005furl_005f13 = _jspx_th_c_005furl_005f13.doStartTag();
    if (_jspx_th_c_005furl_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f14.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(148,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f14.setValue("/js/lembretes/painel-lembretes.js");
    int _jspx_eval_c_005furl_005f14 = _jspx_th_c_005furl_005f14.doStartTag();
    if (_jspx_th_c_005furl_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f15.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(149,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f15.setValue("/js/lembretes/menu-criar-lembrete.js");
    int _jspx_eval_c_005furl_005f15 = _jspx_th_c_005furl_005f15.doStartTag();
    if (_jspx_th_c_005furl_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f16.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(154,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f16.setValue("/css/jquery-ui.css");
    int _jspx_eval_c_005furl_005f16 = _jspx_th_c_005furl_005f16.doStartTag();
    if (_jspx_th_c_005furl_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f17 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f17.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(155,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f17.setValue("/js/jquery-1.10.2.js");
    int _jspx_eval_c_005furl_005f17 = _jspx_th_c_005furl_005f17.doStartTag();
    if (_jspx_th_c_005furl_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f17);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f18 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f18.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(156,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f18.setValue("/js/jquery-ui-1.11.4.js");
    int _jspx_eval_c_005furl_005f18 = _jspx_th_c_005furl_005f18.doStartTag();
    if (_jspx_th_c_005furl_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f19 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f19.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(157,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f19.setValue("/js/jquery.pulse.min.js");
    int _jspx_eval_c_005furl_005f19 = _jspx_th_c_005furl_005f19.doStartTag();
    if (_jspx_th_c_005furl_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f20 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f20.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(158,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f20.setValue("/js/jquery.pulse.js");
    int _jspx_eval_c_005furl_005f20 = _jspx_th_c_005furl_005f20.doStartTag();
    if (_jspx_th_c_005furl_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f21 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f21.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(160,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f21.setValue("/js/jquery.postmessage.js");
    int _jspx_eval_c_005furl_005f21 = _jspx_th_c_005furl_005f21.doStartTag();
    if (_jspx_th_c_005furl_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f21);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f22 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f22.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(161,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f22.setValue("/js/jquery.tcPlugin.js");
    int _jspx_eval_c_005furl_005f22 = _jspx_th_c_005furl_005f22.doStartTag();
    if (_jspx_th_c_005furl_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f22);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f23 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f23.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(162,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f23.setValue("/js/jquery.alerts.js");
    int _jspx_eval_c_005furl_005f23 = _jspx_th_c_005furl_005f23.doStartTag();
    if (_jspx_th_c_005furl_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f23);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f24 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f24.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(165,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f24.setValue("/js/boxPromocaoProdutos.js");
    int _jspx_eval_c_005furl_005f24 = _jspx_th_c_005furl_005f24.doStartTag();
    if (_jspx_th_c_005furl_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f24);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f25 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f25.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(166,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f25.setValue("/js/script-menu.js");
    int _jspx_eval_c_005furl_005f25 = _jspx_th_c_005furl_005f25.doStartTag();
    if (_jspx_th_c_005furl_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f25);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f26 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f26.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(168,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f26.setValue("/js/script-cadastro-cliente.js");
    int _jspx_eval_c_005furl_005f26 = _jspx_th_c_005furl_005f26.doStartTag();
    if (_jspx_th_c_005furl_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f26);
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
    // /WEB-INF/jsp/toolbar.jsp(169,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f27.setValue("/js/validators.js");
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
    // /WEB-INF/jsp/toolbar.jsp(170,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f28.setValue("/js/shortcut.js");
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
    // /WEB-INF/jsp/toolbar.jsp(171,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f29.setValue("/js/handlebars-v4.0.2.js");
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
    // /WEB-INF/jsp/toolbar.jsp(172,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f30.setValue("/js/json2.js");
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
    // /WEB-INF/jsp/toolbar.jsp(173,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f31.setValue("/js/shortcut.js");
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
    // /WEB-INF/jsp/toolbar.jsp(174,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f32.setValue("/js/script-carrinho.js");
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
    // /WEB-INF/jsp/toolbar.jsp(175,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f33.setValue("/js/script-cuponavel.js");
    int _jspx_eval_c_005furl_005f33 = _jspx_th_c_005furl_005f33.doStartTag();
    if (_jspx_th_c_005furl_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f33);
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
    // /WEB-INF/jsp/toolbar.jsp(176,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f34.setValue("/js/script-cupPbmr.js");
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
    // /WEB-INF/jsp/toolbar.jsp(177,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f35.setValue("/js/script-cuponavelSevenPdv.js");
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
    // /WEB-INF/jsp/toolbar.jsp(178,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f36.setValue("/js/script-dialogos.js");
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
    // /WEB-INF/jsp/toolbar.jsp(179,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f37.setValue("/js/script-tc30.js");
    int _jspx_eval_c_005furl_005f37 = _jspx_th_c_005furl_005f37.doStartTag();
    if (_jspx_th_c_005furl_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f37);
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
    // /WEB-INF/jsp/toolbar.jsp(180,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f38.setValue("/js/script-carrinho-autorizacoes.js");
    int _jspx_eval_c_005furl_005f38 = _jspx_th_c_005furl_005f38.doStartTag();
    if (_jspx_th_c_005furl_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f38);
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
    // /WEB-INF/jsp/toolbar.jsp(181,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f39.setValue("/js/script-my-cart.squad.js");
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
    // /WEB-INF/jsp/toolbar.jsp(182,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f40.setValue("/js/script-tc-servicos.js");
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
    // /WEB-INF/jsp/toolbar.jsp(183,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f41.setValue("/js/script-cuponavelFuncional.js");
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
    // /WEB-INF/jsp/toolbar.jsp(184,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f42.setValue("/js/script-cuponavelEpharma.js");
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
    // /WEB-INF/jsp/toolbar.jsp(185,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f43.setValue("/js/base64.js");
    int _jspx_eval_c_005furl_005f43 = _jspx_th_c_005furl_005f43.doStartTag();
    if (_jspx_th_c_005furl_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f43);
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
    // /WEB-INF/jsp/toolbar.jsp(186,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f44.setValue("/js/fast-pass.js");
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
    // /WEB-INF/jsp/toolbar.jsp(187,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f45.setValue("/js/script-compre-retire.js");
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
    // /WEB-INF/jsp/toolbar.jsp(188,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f46.setValue("/js/script-estoque-transito.js");
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
    // /WEB-INF/jsp/toolbar.jsp(190,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f47.setValue("/js/script-carrinho-fp.js");
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
    // /WEB-INF/jsp/toolbar.jsp(191,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f48.setValue("/js/script-farmaciaPopular.js");
    int _jspx_eval_c_005furl_005f48 = _jspx_th_c_005furl_005f48.doStartTag();
    if (_jspx_th_c_005furl_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f48);
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
    // /WEB-INF/jsp/toolbar.jsp(192,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f49.setValue("/js/autorizador-microservice.js");
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
    // /WEB-INF/jsp/toolbar.jsp(193,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f50.setValue("/js/script-desc-gerencia-pbm.js");
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
    // /WEB-INF/jsp/toolbar.jsp(194,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f51.setValue("/js/script-regraDesconto.js");
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
    // /WEB-INF/jsp/toolbar.jsp(195,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f52.setValue("/js/script-mensagemDesconto.js");
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
    // /WEB-INF/jsp/toolbar.jsp(196,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f53.setValue("/js/produtoSelecionado.js");
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
    // /WEB-INF/jsp/toolbar.jsp(197,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f54.setValue("/js/script-modal-pbm-desconto.js");
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
    // /WEB-INF/jsp/toolbar.jsp(198,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f55.setValue("/js/perfect-scrollbar.min.js");
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
    // /WEB-INF/jsp/toolbar.jsp(199,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f56.setValue("/js/regrasDeDesconto/script-programa-da-industria.js");
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
    // /WEB-INF/jsp/toolbar.jsp(200,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f57.setValue("/js/regrasDeDesconto/script-tipos-regras-desconto.js");
    int _jspx_eval_c_005furl_005f57 = _jspx_th_c_005furl_005f57.doStartTag();
    if (_jspx_th_c_005furl_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f57);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f58(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f58 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f58.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f58.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(201,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f58.setValue("/js/regrasDeDesconto/script-regra-de-desconto.js");
    int _jspx_eval_c_005furl_005f58 = _jspx_th_c_005furl_005f58.doStartTag();
    if (_jspx_th_c_005furl_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f58);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f59(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f59 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f59.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f59.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(202,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f59.setValue("/js/script-lojaspiloto.js");
    int _jspx_eval_c_005furl_005f59 = _jspx_th_c_005furl_005f59.doStartTag();
    if (_jspx_th_c_005furl_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f59);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f59);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f60(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f60 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f60.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f60.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(205,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f60.setValue("/js/mustache.min.js");
    int _jspx_eval_c_005furl_005f60 = _jspx_th_c_005furl_005f60.doStartTag();
    if (_jspx_th_c_005furl_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f60);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f60);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f61(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f61 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f61.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f61.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(207,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f61.setValue("/js/script-tc-piloto.js");
    int _jspx_eval_c_005furl_005f61 = _jspx_th_c_005furl_005f61.doStartTag();
    if (_jspx_th_c_005furl_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f61);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f61);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f62(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f62 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f62.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f62.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(208,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f62.setValue("/css/tc-piloto.css");
    int _jspx_eval_c_005furl_005f62 = _jspx_th_c_005furl_005f62.doStartTag();
    if (_jspx_th_c_005furl_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f62);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f62);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f63(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f63 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f63.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f63.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(210,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f63.setValue("/js/googleAnalytics/ga-global.js");
    int _jspx_eval_c_005furl_005f63 = _jspx_th_c_005furl_005f63.doStartTag();
    if (_jspx_th_c_005furl_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f63);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f64(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f64 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f64.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f64.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(211,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f64.setValue("/js/entrega-vizinhanca.js");
    int _jspx_eval_c_005furl_005f64 = _jspx_th_c_005furl_005f64.doStartTag();
    if (_jspx_th_c_005furl_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f64);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f65(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f65 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f65.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f65.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(212,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f65.setValue("/js/script-reserva-estoque-loja.js");
    int _jspx_eval_c_005furl_005f65 = _jspx_th_c_005furl_005f65.doStartTag();
    if (_jspx_th_c_005furl_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f65);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f66(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f66 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f66.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f66.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(214,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f66.setValue("/introjs/intro.min.js");
    int _jspx_eval_c_005furl_005f66 = _jspx_th_c_005furl_005f66.doStartTag();
    if (_jspx_th_c_005furl_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f66);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f67(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f67 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f67.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f67.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(215,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f67.setValue("/introjs/introjs.min.css");
    int _jspx_eval_c_005furl_005f67 = _jspx_th_c_005furl_005f67.doStartTag();
    if (_jspx_th_c_005furl_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f67);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f67);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f68(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f68 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f68.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f68.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(218,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f68.setValue("/js/script-lojaspiloto.js");
    int _jspx_eval_c_005furl_005f68 = _jspx_th_c_005furl_005f68.doStartTag();
    if (_jspx_th_c_005furl_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f68);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f68);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f69(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f69 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f69.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f69.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(221,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f69.setValue("/");
    int _jspx_eval_c_005furl_005f69 = _jspx_th_c_005furl_005f69.doStartTag();
    if (_jspx_th_c_005furl_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f69);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f69);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f62(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f62 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f62.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f62.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(221,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f62.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 'raia/' : 'drogasil/'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f62 = _jspx_th_c_005fout_005f62.doStartTag();
    if (_jspx_th_c_005fout_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f62);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f62);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f70(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f70 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f70.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f70.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(222,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f70.setValue("/");
    int _jspx_eval_c_005furl_005f70 = _jspx_th_c_005furl_005f70.doStartTag();
    if (_jspx_th_c_005furl_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f70);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f70);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f63(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f63 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f63.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f63.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(222,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f63.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 'raia/' : 'drogasil/'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f63 = _jspx_th_c_005fout_005f63.doStartTag();
    if (_jspx_th_c_005fout_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f63);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f71(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f71 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f71.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f71.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(224,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f71.setValue("/js/apoioTratamento.js");
    int _jspx_eval_c_005furl_005f71 = _jspx_th_c_005furl_005f71.doStartTag();
    if (_jspx_th_c_005furl_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f71);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f71);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f72(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f72 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f72.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f72.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(228,27) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f72.setValue("/");
    int _jspx_eval_c_005furl_005f72 = _jspx_th_c_005furl_005f72.doStartTag();
    if (_jspx_th_c_005furl_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f72);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f72);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f73(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f73 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f73.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f73.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(237,27) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f73.setValue("/");
    int _jspx_eval_c_005furl_005f73 = _jspx_th_c_005furl_005f73.doStartTag();
    if (_jspx_th_c_005furl_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f73);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f73);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f74(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f74 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f74.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f74.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(247,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f74.setValue("/toastr/toastr.min.js");
    int _jspx_eval_c_005furl_005f74 = _jspx_th_c_005furl_005f74.doStartTag();
    if (_jspx_th_c_005furl_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f74);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f74);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f75(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f75 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f75.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f75.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(248,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f75.setValue("/toastr/toastr.min.css");
    int _jspx_eval_c_005furl_005f75 = _jspx_th_c_005furl_005f75.doStartTag();
    if (_jspx_th_c_005furl_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f75);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f75);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f76(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f76 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f76.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f76.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(275,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f76.setValue("/");
    int _jspx_eval_c_005furl_005f76 = _jspx_th_c_005furl_005f76.doStartTag();
    if (_jspx_th_c_005furl_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f76);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f76);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f64(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f64 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f64.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f64.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(305,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f64.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${enderecoCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f64 = _jspx_th_c_005fout_005f64.doStartTag();
    if (_jspx_th_c_005fout_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f64);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f65(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f65 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f65.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f65.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(308,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f65.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefoneCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f65 = _jspx_th_c_005fout_005f65.doStartTag();
    if (_jspx_th_c_005fout_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f65);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f66(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f66 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f66.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f66.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(341,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f66.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${habilitaIntegracaoSevenPdv}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f66 = _jspx_th_c_005fout_005f66.doStartTag();
    if (_jspx_th_c_005fout_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f66);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f67(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f67 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f67.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f67.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(342,27) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f67.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${integracaoPbmUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f67 = _jspx_th_c_005fout_005f67.doStartTag();
    if (_jspx_th_c_005fout_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f67);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f67);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f68(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f68 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f68.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f68.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(343,53) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f68.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${habilitaIntegracaoFuncional}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f68 = _jspx_th_c_005fout_005f68.doStartTag();
    if (_jspx_th_c_005fout_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f68);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f68);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f69(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f69 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f69.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f69.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(344,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f69.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${integracaoPbmUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f69 = _jspx_th_c_005fout_005f69.doStartTag();
    if (_jspx_th_c_005fout_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f69);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f69);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f70(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f70 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f70.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f70.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(346,49) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f70.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${habilitaIntegracaoEpharma}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f70 = _jspx_th_c_005fout_005f70.doStartTag();
    if (_jspx_th_c_005fout_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f70);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f70);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f71(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f71 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f71.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f71.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(347,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f71.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${integracaoPbmUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f71 = _jspx_th_c_005fout_005f71.doStartTag();
    if (_jspx_th_c_005fout_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f71);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f71);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f77(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f77 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f77.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f77.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(355,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f77.setValue("/applet");
    int _jspx_eval_c_005furl_005f77 = _jspx_th_c_005furl_005f77.doStartTag();
    if (_jspx_th_c_005furl_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f77);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f77);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f72(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f72 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f72.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f72.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(376,27) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f72.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CCRAIA_PREAPROVADO}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f72 = _jspx_th_c_005fout_005f72.doStartTag();
    if (_jspx_th_c_005fout_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f72);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f72);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f73(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f73 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f73.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f73.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(377,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f73.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flagNovoCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f73 = _jspx_th_c_005fout_005f73.doStartTag();
    if (_jspx_th_c_005fout_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f73);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f73);
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
    // /WEB-INF/jsp/toolbar.jsp(394,35) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setName("page");
    // /WEB-INF/jsp/toolbar.jsp(394,35) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setValue("mainview");
    int _jspx_eval_portlet_005fparam_005f0 = _jspx_th_portlet_005fparam_005f0.doStartTag();
    if (_jspx_th_portlet_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f78(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f78 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f78.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f78.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(396,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f78.setValue("/");
    int _jspx_eval_c_005furl_005f78 = _jspx_th_c_005furl_005f78.doStartTag();
    if (_jspx_th_c_005furl_005f78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f78);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f78);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f74(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f74 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f74.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f74.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(459,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f74.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cpf}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f74 = _jspx_th_c_005fout_005f74.doStartTag();
    if (_jspx_th_c_005fout_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f74);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f74);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f75(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f75 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f75.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f75.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(554,27) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f75.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaPerfil}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f75 = _jspx_th_c_005fout_005f75.doStartTag();
    if (_jspx_th_c_005fout_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f75);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f75);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f76(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f76 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f76.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f76.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(555,31) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f76.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaTipoPerfil}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f76 = _jspx_th_c_005fout_005f76.doStartTag();
    if (_jspx_th_c_005fout_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f76);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f76);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f77(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f77 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f77.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f77.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(807,131) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f77.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataOracle}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f77 = _jspx_th_c_005fout_005f77.doStartTag();
    if (_jspx_th_c_005fout_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f77);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f77);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f78(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f78 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f78.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f78.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(830,7) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f78.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.cdCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f78 = _jspx_th_c_005fout_005f78.doStartTag();
    if (_jspx_th_c_005fout_005f78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f78);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f78);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f79(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f79 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f79.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f79.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(831,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f79.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.cdCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f79 = _jspx_th_c_005fout_005f79.doStartTag();
    if (_jspx_th_c_005fout_005f79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f79);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f79);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f80(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f80 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f80.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f80.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(831,70) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f80.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.dgCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f80 = _jspx_th_c_005fout_005f80.doStartTag();
    if (_jspx_th_c_005fout_005f80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f80);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f80);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f81(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f81 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f81.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f81.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1025,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f81.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdOperador}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f81 = _jspx_th_c_005fout_005f81.doStartTag();
    if (_jspx_th_c_005fout_005f81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f81);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f81);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f82(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f82 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f82.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f82.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1034,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f82.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdOperador}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f82 = _jspx_th_c_005fout_005f82.doStartTag();
    if (_jspx_th_c_005fout_005f82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f82);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f82);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f79(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f79 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f79.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f79.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1171,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f79.setValue("/images/ajaxLoader.gif");
    int _jspx_eval_c_005furl_005f79 = _jspx_th_c_005furl_005f79.doStartTag();
    if (_jspx_th_c_005furl_005f79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f79);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f79);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f80(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f80 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f80.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f80.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1205,39) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f80.setValue("/");
    int _jspx_eval_c_005furl_005f80 = _jspx_th_c_005furl_005f80.doStartTag();
    if (_jspx_th_c_005furl_005f80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f80);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f80);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f81(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f81 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f81.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f81.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1209,39) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f81.setValue("/");
    int _jspx_eval_c_005furl_005f81 = _jspx_th_c_005furl_005f81.doStartTag();
    if (_jspx_th_c_005furl_005f81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f81);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f81);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f82(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f82 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f82.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f82.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1239,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f82.setValue("/");
    int _jspx_eval_c_005furl_005f82 = _jspx_th_c_005furl_005f82.doStartTag();
    if (_jspx_th_c_005furl_005f82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f82);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f82);
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
    // /WEB-INF/jsp/toolbar.jsp(1255,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<input id=\"nrAutPbmValue\" type=\"text\" size=\"15\" value=\"{{nrAut}}\" onkeyup=\"maskIt(this,event,'####################'); whenEnterExec(event, focaSelectPbm)\"/>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1258,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<input id=\"nrAutPbmValue\" type=\"text\" size=\"15\" value=\"{{nrAut}}\" onKeyPress=\"Mascara(this,Integer); whenEnterExec(event, focaSelectPbm)\"/>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005furl_005f83(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f83 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f83.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f83.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1273,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f83.setValue("/");
    int _jspx_eval_c_005furl_005f83 = _jspx_th_c_005furl_005f83.doStartTag();
    if (_jspx_th_c_005furl_005f83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f83);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f83);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1289,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("isAtivadaReservaAppEntreLojas");
    // /WEB-INF/jsp/toolbar.jsp(1289,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/toolbar.jsp(1289,5) '${filialVersaoReservaAppEntreLojas != null && filialVersaoReservaAppEntreLojas == 'true'}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${filialVersaoReservaAppEntreLojas != null && filialVersaoReservaAppEntreLojas == 'true'}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/toolbar.jsp(1289,5) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("page");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1290,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("isAtivadaReservaApp");
    // /WEB-INF/jsp/toolbar.jsp(1290,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/toolbar.jsp(1290,5) '${(lojaVersaoCompreRetire!=null && lojaVersaoCompreRetire=='true') && FilialVO != null && versaoNovoLayoutCompreRetireMP != 'true'}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${(lojaVersaoCompreRetire!=null && lojaVersaoCompreRetire=='true') && FilialVO != null && versaoNovoLayoutCompreRetireMP != 'true'}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/toolbar.jsp(1290,5) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setScope("page");
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1291,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("isAtivadoNovoLayoutCompreRetire");
    // /WEB-INF/jsp/toolbar.jsp(1291,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/toolbar.jsp(1291,5) '${((lojaVersaoCompreRetire!=null && lojaVersaoCompreRetire=='true')) && FilialVO != null && versaoNovoLayoutCompreRetireMP == 'true'}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${((lojaVersaoCompreRetire!=null && lojaVersaoCompreRetire=='true')) && FilialVO != null && versaoNovoLayoutCompreRetireMP == 'true'}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/toolbar.jsp(1291,5) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setScope("page");
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f2);
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
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
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
    // /WEB-INF/jsp/toolbar.jsp(1300,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isAtivadaReservaApp}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<td id=\"idQtReserva\" align=\"left\" class=\"quantidadeReserva\" >\n");
        out.write("\t\t\t\t\t\t\t<span id=\"qtReserva\" class=\"toolbar tooltipTC\" onclick=\"redirectStatus();\" style=\"display:none; cursor: pointer; width: 100%;\"></span>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/jsp/toolbar.jsp(1305,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isAtivadoNovoLayoutCompreRetire}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<td id=\"idQtReserva\" align=\"left\" class=\"quantidadeReserva\" >\n");
        out.write("\t\t\t\t\t\t\t<span id=\"qtReserva\" class=\"toolbar tooltipTC\" onclick=\"redirectStatusNovoLayout();\" style=\"display:none; cursor: pointer; width: 100%;\"></span>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<td style=\"width: 190px;\"></td>\n");
        out.write("\t\t\t\t\t\t<script>\n");
        out.write("\t\t\t\t\t\t\tvar backgroundColorDivToolbar = (+LOGO_MARCA === 1) ? 'rgb(0,140,149)' : 'rgb(192,38,53)';\n");
        out.write("\t\t\t\t\t\t\t$j('#divToolbar').css('background', backgroundColorDivToolbar);\n");
        out.write("\t\t\t\t\t\t</script>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1318,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isAtivadaReservaAppEntreLojas}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<td id=\"idAlertPedidoUrgente\" align=\"center\" class=\"pedidoCompreRetUrgente\" onclick=\"redirectStatusReservaProduto('reservaPendente', cdOperador);\">\n");
        out.write("\t\t\t\t\t\t<audio id=\"alertaReservaAprovada\" src=\"");
        if (_jspx_meth_c_005furl_005f84(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("/assets/success.mp3\"></audio>\n");
        out.write("\t\t\t\t\t\t<span id=\"idTxtAlertPedidoUrgente\" class=\"toolbar tooltipTC\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td id=\"idAlertPedidoAprovados\" align=\"center\" class=\"pedidoCompreRetAprovados\" onclick=\"redirectStatusReservaProduto('reservaAprovada', cdOperador);\" style=\"display:none;\">\n");
        out.write("\t\t\t\t\t\t<span id=\"idTxtAlertPedidoAprovados\" class=\"toolbar tooltipTC\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td id=\"idAlertPedidoRetirada\" align=\"center\" class=\"alertPedidoRetirada\" onclick=\"redirectStatusReservaProduto('reservaRetirada', cdOperador);\" style=\"display:none;\">\n");
        out.write("\t\t\t\t\t\t<span id=\"idTxtAlertPedidoRetirada\" class=\"toolbar tooltipTC\"></span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005furl_005f84(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f84 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f84.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /WEB-INF/jsp/toolbar.jsp(1320,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f84.setValue("/");
    int _jspx_eval_c_005furl_005f84 = _jspx_th_c_005furl_005f84.doStartTag();
    if (_jspx_th_c_005furl_005f84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f84);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f84);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f83(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f83 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f83.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f83.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1331,79) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f83.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaPerfilCompleto}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f83 = _jspx_th_c_005fout_005f83.doStartTag();
    if (_jspx_th_c_005fout_005f83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f83);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f83);
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
    // /WEB-INF/jsp/toolbar.jsp(1334,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"display:none\">\n");
        out.write("\t\t\t\t\t\t<script>\n");
        out.write("\t\t\t\t\t\t\tidCliente = '");
        if (_jspx_meth_c_005fout_005f84(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\n");
        out.write("\t\t\t\t\t\t\tvar clientePesquisado = {\n");
        out.write("\t\t\t\t\t\t\t\t'idCliente': '");
        if (_jspx_meth_c_005fout_005f85(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'cdCliente' : '");
        if (_jspx_meth_c_005fout_005f86(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'cdEmpresa': '");
        if (_jspx_meth_c_005fout_005f87(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'atualizarCadastroPorMotivoRecusa': '");
        if (_jspx_meth_c_005fout_005f88(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'pcCadastroCompleto': '");
        if (_jspx_meth_c_005fout_005f89(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'nome': '");
        if (_jspx_meth_c_005fout_005f90(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'dataNascimento': '");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'rg': '");
        if (_jspx_meth_c_005fout_005f91(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'cpf': '");
        if (_jspx_meth_c_005fout_005f92(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'sexo': '");
        if (_jspx_meth_c_005fout_005f93(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'email': '");
        if (_jspx_meth_c_005fout_005f94(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'celularLgpd': '");
        if (_jspx_meth_c_005fout_005f95(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'idClienteTitular': '");
        if (_jspx_meth_c_005fout_005f96(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'nrBeneficio': '");
        if (_jspx_meth_c_005fout_005f97(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'ufRg': '");
        if (_jspx_meth_c_005fout_005f98(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'flPensionista': '");
        if (_jspx_meth_c_005fout_005f99(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'flPromocao': '");
        if (_jspx_meth_c_005fout_005f100(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'dataCadastro': '");
        if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'dataUltimaAtualizacao': '");
        if (_jspx_meth_fmt_005fformatDate_005f2(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("\t\t\t\t\t\t\t\t'cdTipoCartao': '");
        if (_jspx_meth_c_005fout_005f101(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("                                'idClienteUnivers': '");
        if (_jspx_meth_c_005fout_005f102(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("                                'flLgpdDescBeneficio': '");
        if (_jspx_meth_c_005fout_005f103(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("                                'flLgpdPbm': '");
        if (_jspx_meth_c_005fout_005f104(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("',\n");
        out.write("                                'cdGrupoCliente': '");
        if (_jspx_meth_c_005fout_005f105(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("'\n");
        out.write("\t\t\t\t\t\t\t\t};\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\twindow.clientePesquisado = clientePesquisado;\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\tclienteCompleto = {\n");
        out.write("\t\t\t\t\t\t\t\t'cliente': clientePesquisado,\n");
        out.write("\t\t\t\t\t\t\t\t'celular': celularPesquisado,\n");
        out.write("\t\t\t\t\t\t\t\t'beneficios': {\n");
        out.write("\t\t\t\t\t\t\t\t\ttipo: '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaTipoPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'.split(';'),\n");
        out.write("\t\t\t\t\t\t\t\t\tlista: '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaPerfil}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'.split(';')\n");
        out.write("\t\t\t\t\t\t\t\t}\n");
        out.write("\t\t\t\t\t\t\t};\n");
        out.write("\t\t\t\t\t\t\tvar cartaoUnivers = '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.nrCartaoUnivers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("';\n");
        out.write("\t\t\t\t\t\t\tsetCookie(\"cartaoUnivers\", cartaoUnivers);\n");
        out.write("\t\t\t\t\t\t</script>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"max-width: 100%; text-align: center; white-space: nowrap;\">\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t<!-- BT CUPOM/O.E. // EQUIPARACAO TC - RAIA DROGASIL -->\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f7(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        \n");
        out.write("\t                    ");
        if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t<!-- BT CUPOM/O.E. // EQUIPARACAO TC - RAIA DROGASIL -->\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f9(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f10(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"width: 45%; white-space: nowrap;\">\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f11(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td align=\"right\" style=\"width: auto; white-space: nowrap;\">\n");
        out.write("\t                    <span id=\"toolbarClienteLogado\" class=\"toolbarClienteLogado\"\n");
        out.write("\t\t\t\t\t\t\t  style=\" max-width: 100%; text-align: center; white-space: nowrap;\">\n");
        out.write("\t\t\t\t\t\t\t  <span id=\"cpfCliente\" onclick=\"cpfToClipboard()\" style=\"cursor: pointer;\" class=\"tooltip\" data-tooltip=\"Clique para copiar o CPF\"></span>\n");
        out.write("\t\t\t\t\t\t\t\t<span>\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fchoose_005f1(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t                            ");
        if (_jspx_meth_c_005fchoose_005f2(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t</span>\n");
        out.write("\t\t\t\t\t\t\t\t<span id=\"infoPlSaude\" style=\"display:none\"></span>\n");
        out.write("\t\t\t\t\t\t\t\t<span id=\"nomeCliente\" class=\"nowrapToolbar spanNomeClienteToolbar\" title=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fout_005f113(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t</span>\n");
        out.write("\t\t\t\t\t\t\t\t<script>maskCpfCliente('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("');</script>\t\n");
        out.write("\t\t\t\t\t\t\t\t<span class=\"tooltip-bottom\" data-tooltip=\"Clique para exibir o perfil\">\n");
        out.write("                                    <i class=\"fa fa-user\" id=\"btPerfilCliente\" onclick=\"goToPerfil();\" style=\"cursor: pointer\"></i>\n");
        out.write("                                </span>\n");
        out.write("\t\t\t\t\t\t\t </span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td align=\"right\" width=\"50px\">\n");
        out.write("\t\t\t\t\t\t<div id=\"progressbar_regua_cad_cli\"style=\"width: 50px; background: transparent;height: 15px;border: solid white 1px;\" class=\"ui-progressbar-value\"></div>\n");
        out.write("\t\t\t\t\t\t<span id=\"idCliente\" style=\"display:none\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\n");
        out.write("\t\t\t\t\t\t<span id=\"cdTipoCartaoToolBar\" style=\"display:none\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.cdTipoCartao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\n");
        out.write("\t\t\t\t\t\t<span id=\"clienteCpf\" style=\"display:none\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\n");
        out.write("\t\t\t\t\t\t<span id=\"clienteDtNascimento\" style=\"display:none\">");
        if (_jspx_meth_fmt_005fformatDate_005f3(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("</span>\n");
        out.write("\t\t\t\t\t\t<span id=\"clienteNroCartaoPbmr\" style=\"display:none\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nrCartaoPbmr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fout_005f84(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f84 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f84.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1337,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f84.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f84 = _jspx_th_c_005fout_005f84.doStartTag();
    if (_jspx_th_c_005fout_005f84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f84);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f84);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f85(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f85 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f85.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1339,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f85.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f85 = _jspx_th_c_005fout_005f85.doStartTag();
    if (_jspx_th_c_005fout_005f85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f85);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f85);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f86(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f86 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f86.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1340,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f86.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.cdCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f86 = _jspx_th_c_005fout_005f86.doStartTag();
    if (_jspx_th_c_005fout_005f86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f86);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f86);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f87(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f87 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f87.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1341,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f87.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdEmpresa}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f87 = _jspx_th_c_005fout_005f87.doStartTag();
    if (_jspx_th_c_005fout_005f87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f87);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f87);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f88(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f88 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f88.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1342,45) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f88.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.atualizarCadastroPorMotivoRecusa}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f88 = _jspx_th_c_005fout_005f88.doStartTag();
    if (_jspx_th_c_005fout_005f88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f88);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f88);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f89(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f89 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f89.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1343,31) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f89.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.pcCadastroCompleto}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f89 = _jspx_th_c_005fout_005f89.doStartTag();
    if (_jspx_th_c_005fout_005f89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f89);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f89);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f90(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f90 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f90.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1344,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f90.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f90 = _jspx_th_c_005fout_005f90.doStartTag();
    if (_jspx_th_c_005fout_005f90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f90);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f90);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1345,27) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/toolbar.jsp(1345,27) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataNascimento}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f91(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f91 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f91.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1346,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f91.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.rg}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f91 = _jspx_th_c_005fout_005f91.doStartTag();
    if (_jspx_th_c_005fout_005f91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f91);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f91);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f92(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f92 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f92.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f92.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1347,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f92.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cpf}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f92 = _jspx_th_c_005fout_005f92.doStartTag();
    if (_jspx_th_c_005fout_005f92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f92);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f92);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f93(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f93 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f93.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1348,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f93.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.sexo}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f93 = _jspx_th_c_005fout_005f93.doStartTag();
    if (_jspx_th_c_005fout_005f93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f93);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f93);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f94(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f94 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f94.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f94.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1349,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f94.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f94 = _jspx_th_c_005fout_005f94.doStartTag();
    if (_jspx_th_c_005fout_005f94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f94);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f94);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f95(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f95 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f95.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f95.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1350,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f95.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${celularLgpd}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f95 = _jspx_th_c_005fout_005f95.doStartTag();
    if (_jspx_th_c_005fout_005f95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f95);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f95);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f96(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f96 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f96.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f96.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1351,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f96.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idClienteTitular}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f96 = _jspx_th_c_005fout_005f96.doStartTag();
    if (_jspx_th_c_005fout_005f96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f96);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f96);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f97(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f97 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f97.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f97.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1352,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f97.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nrBeneficio}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f97 = _jspx_th_c_005fout_005f97.doStartTag();
    if (_jspx_th_c_005fout_005f97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f97);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f97);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f98(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f98 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f98.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f98.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1353,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f98.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.ufRg}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f98 = _jspx_th_c_005fout_005f98.doStartTag();
    if (_jspx_th_c_005fout_005f98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f98);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f98);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f99(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f99 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f99.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f99.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1354,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f99.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flPensionista}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f99 = _jspx_th_c_005fout_005f99.doStartTag();
    if (_jspx_th_c_005fout_005f99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f99);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f99);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f100(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f100 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f100.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f100.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1355,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f100.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flPromocao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f100 = _jspx_th_c_005fout_005f100.doStartTag();
    if (_jspx_th_c_005fout_005f100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f100);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f100);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1356,25) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/toolbar.jsp(1356,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataCadastro}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1357,34) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f2.setPattern("dd/MM/yyyy HH:mm:ss");
    // /WEB-INF/jsp/toolbar.jsp(1357,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataUltimaAtualizacao}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f2 = _jspx_th_fmt_005fformatDate_005f2.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f101(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f101 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f101.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f101.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1358,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f101.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.cdTipoCartao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f101 = _jspx_th_c_005fout_005f101.doStartTag();
    if (_jspx_th_c_005fout_005f101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f101);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f101);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f102(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f102 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f102.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f102.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1359,53) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f102.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idClienteUnivers}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f102 = _jspx_th_c_005fout_005f102.doStartTag();
    if (_jspx_th_c_005fout_005f102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f102);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f102);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f103(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f103 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f103.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f103.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1360,56) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f103.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flLgpdDescBeneficio}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f103 = _jspx_th_c_005fout_005f103.doStartTag();
    if (_jspx_th_c_005fout_005f103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f103);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f103);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f104(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f104 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f104.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f104.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1361,46) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f104.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.flLgpdPbm}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f104 = _jspx_th_c_005fout_005f104.doStartTag();
    if (_jspx_th_c_005fout_005f104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f104);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f104);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f105(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f105 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f105.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f105.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1362,51) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f105.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdGrupoCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f105 = _jspx_th_c_005fout_005f105.doStartTag();
    if (_jspx_th_c_005fout_005f105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f105);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f105);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1382,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty cliente.nrCartaoPbmr}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<input type=\"button\" class=\"buttonMini\" name=\"vms\" id=\"vms\" value=\"VMS\"\n");
        out.write("\t\t\t\t\t\t\t\t   onClick=\"vmsPrintCartao()\" style=\"display:none\"/>\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1387,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty cliente.nrCartaoPbmr}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<input type=\"button\" class=\"buttonMini\" name=\"vms\" id=\"vms\" value=\"VMS\"\n");
        out.write("\t\t\t\t\t\t\t\t   onClick=\"vmsPrintCartao()\" style=\"display:\"/>\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1393,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<input type=\"button\" class=\"buttonMidNovo\" name=\"oe\" id=\"oe\"\n");
        out.write("\t\t\t\t\t\t\tvalue=\"O.E.\" onclick=\"carregarOferta('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\"/>\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1398,21) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '2' && lojaVersaoOfex != null && lojaVersaoOfex == 'true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <input type=\"button\" class=\"buttonMidNovo\" name=\"oe\" id=\"oe\" \n");
        out.write("                            value=\"CUPOM\" onclick=\"carregarOferta('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\"/>\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1404,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(lojaVersaoOfex != null && lojaVersaoOfex == 'true') || LOGO_MARCA == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<input type=\"button\" class=\"buttonMidNovo\" name=\"lembrete\" id=\"lembrete\" value=\"LEMBRETE\" style=\"display:none\"\n");
        out.write("\t\t\t\t\t\t        onclick=\"exibirAderencia('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\"/>\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1409,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CCRAIA_OFERECER == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<input type=\"button\" class=\"buttonMini\" name=\"ccraia\" id=\"ccraia\"\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"CCR\" onclick=\"ccraiaFrame();\" />\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1416,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${versaoApoioTratamento!=null && versaoApoioTratamento=='true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<div>\n");
        out.write("\t\t\t\t\t\t\t\t<input type=\"button\" class=\"buttonApoioTratamento\" name=\"apoioTratamento\" id=\"apoioTratamento\" value=\"APOIO AO TRATAMENTO\" onclick=\"abreModalLoginFarmaceutico()\">\n");
        out.write("\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f3(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/jsp/toolbar.jsp(1428,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdTipoCadastramentoCliente eq 11 && cliente.clienteCpfStatus eq 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fout_005f106(_jspx_th_c_005fwhen_005f2, _jspx_page_context))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_005fout_005f107(_jspx_th_c_005fwhen_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<script>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar idClienteUnivers = '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idClienteUnivers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("';\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsetCookie(\"idClienteUnivers\", idClienteUnivers);\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</script>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fout_005f106(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f106 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f106.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f106.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    // /WEB-INF/jsp/toolbar.jsp(1429,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f106.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.nrCartaoClienteLogomarca}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f106 = _jspx_th_c_005fout_005f106.doStartTag();
    if (_jspx_th_c_005fout_005f106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f106);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f106);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f107(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f107 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f107.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f107.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    // /WEB-INF/jsp/toolbar.jsp(1429,76) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f107.setValue(new String("- UNIVERS"));
    int _jspx_eval_c_005fout_005f107 = _jspx_th_c_005fout_005f107.doStartTag();
    if (_jspx_th_c_005fout_005f107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f107);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f107);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /WEB-INF/jsp/toolbar.jsp(1436,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cdTipoCadastramentoCliente eq 11 && cliente.clienteCpfStatus eq 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
    if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fout_005f108(_jspx_th_c_005fwhen_005f3, _jspx_page_context))
          return true;
        out.write("&nbsp;");
        if (_jspx_meth_c_005fout_005f109(_jspx_th_c_005fwhen_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<script>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar idClienteUnivers = '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idClienteUnivers}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("';\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsetCookie(\"idClienteUnivers\", idClienteUnivers);\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</script>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fout_005f108(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f108 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f108.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f108.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
    // /WEB-INF/jsp/toolbar.jsp(1437,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f108.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.nrCartaoClienteLogomarca}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f108 = _jspx_th_c_005fout_005f108.doStartTag();
    if (_jspx_th_c_005fout_005f108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f108);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f108);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f109(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f109 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f109.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f109.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
    // /WEB-INF/jsp/toolbar.jsp(1437,76) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f109.setValue(new String("- UNIVERS RDMED"));
    int _jspx_eval_c_005fout_005f109 = _jspx_th_c_005fout_005f109.doStartTag();
    if (_jspx_th_c_005fout_005f109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f109);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f109);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fout_005f110(_jspx_th_c_005fotherwise_005f1, _jspx_page_context))
          return true;
        out.write('-');
        if (_jspx_meth_c_005fout_005f111(_jspx_th_c_005fotherwise_005f1, _jspx_page_context))
          return true;
        out.write("&nbsp;\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<script>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsetCookie(\"idClienteUnivers\", \"\");\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</script>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fout_005f110(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f110 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f110.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f110.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
    // /WEB-INF/jsp/toolbar.jsp(1445,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f110.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.cdCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f110 = _jspx_th_c_005fout_005f110.doStartTag();
    if (_jspx_th_c_005fout_005f110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f110);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f110);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f111(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f111 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f111.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f111.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
    // /WEB-INF/jsp/toolbar.jsp(1445,56) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f111.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.dgCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f111 = _jspx_th_c_005fout_005f111.doStartTag();
    if (_jspx_th_c_005fout_005f111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f111);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f111);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
    if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f4(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fwhen_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    // /WEB-INF/jsp/toolbar.jsp(1454,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.cdTipoCartao == 6}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
    if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("PREFERENCIAL -");
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

  private boolean _jspx_meth_c_005fotherwise_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_005fout_005f112(_jspx_th_c_005fotherwise_005f2, _jspx_page_context))
          return true;
        out.write(" &nbsp;-&nbsp;");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f112(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f112 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f112.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f112.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f2);
    // /WEB-INF/jsp/toolbar.jsp(1455,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f112.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cartao.tipoCartao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f112 = _jspx_th_c_005fout_005f112.doStartTag();
    if (_jspx_th_c_005fout_005f112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f112);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f112);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f113(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f113 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f113.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f113.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1461,9) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f113.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f113 = _jspx_th_c_005fout_005f113.doStartTag();
    if (_jspx_th_c_005fout_005f113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f113);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f113);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/toolbar.jsp(1474,58) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f3.setPattern("yyyyMMdd");
    // /WEB-INF/jsp/toolbar.jsp(1474,58) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataNascimento}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f3 = _jspx_th_fmt_005fformatDate_005f3.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1484,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f13(_jspx_th_c_005fif_005f12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
    // /WEB-INF/jsp/toolbar.jsp(1485,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${versaoCarrinhoPBM!=null && versaoCarrinhoPBM=='true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
    if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<td align=\"right\" style=\"width: 23px;\">\n");
        out.write("\t\t\t\t\t\t\t<img src=\"");
        if (_jspx_meth_c_005furl_005f85(_jspx_th_c_005fif_005f13, _jspx_page_context))
          return true;
        out.write("/images/carrinho_pbm");
        if (_jspx_meth_c_005fout_005f114(_jspx_th_c_005fif_005f13, _jspx_page_context))
          return true;
        out.write(".png\" title=\"Clique para inserir autorização PBM\" onclick=\"boxPbmCarrinhoViewAutorizacaoPbm(); \" style=\"cursor: pointer;\"/>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005furl_005f85(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f85 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f85.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f13);
    // /WEB-INF/jsp/toolbar.jsp(1487,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f85.setValue("/");
    int _jspx_eval_c_005furl_005f85 = _jspx_th_c_005furl_005f85.doStartTag();
    if (_jspx_th_c_005furl_005f85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f85);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f85);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f114(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f114 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f114.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f114.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f13);
    // /WEB-INF/jsp/toolbar.jsp(1487,55) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f114.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f114 = _jspx_th_c_005fout_005f114.doStartTag();
    if (_jspx_th_c_005fout_005f114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f114);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f114);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f14.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1493,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<input type=\"button\" class=\"buttonCart\" name=\"cart\" id=\"cart\"\n");
        out.write("\t\t\t\t\t\t\t   onclick=\"carrinhoCompras.mostrar(); showCart(); pushPageInfo('/portal/tc','/carrinho')\" style=\"margin-top: -2px\"/>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f15.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1497,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
    if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<input type=\"button\" class=\"buttonCart\" name=\"cart\" id=\"cart\"\n");
        out.write("\t\t\t\t\t\t\t   onclick=\"carrinhoCompras.mostrar(); pushCheckout(); pushPageInfo('/portal/tc','/carrinho')\"/>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f16.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1505,36) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("clienteAvulso");
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

  private boolean _jspx_meth_c_005fif_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f17.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1541,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ hostFastPassServices != '-1' && cliente.cartao.cdCliente > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
    if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li id=\"myCart-btFastPass\" onclick=\"MyCart.setPaymentType('fastpass')\"><i class=\"fa fa-paper-plane\"></i> FastPass</li>\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f18.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1548,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ hostFastPassServices != '-1' && cliente.cartao.cdCliente > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f18 = _jspx_th_c_005fif_005f18.doStartTag();
    if (_jspx_eval_c_005fif_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<div class=\"fastPass fpass\" style=\"display:none\">\n");
        out.write("\n");
        out.write("                                    <!-- update checkbox -->\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"fastPass_col updateData\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- <input id=\"atualizarDados\" type=\"checkbox\" checked/> <label for=\"atualizarDados\">Atualizar dados?</label> -->\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<!-- email -->\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"divEmailFastPass\" class=\"fastPass_col\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div>E-mail (Para NF eletr&ocirc;nica)</div>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"emailFastPass\" id=\"emailFastPass\" onBlur=\"MyCart.validateAndSaveEmail()\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<!-- telefone -->\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"divTelefoneSMSFastPass\" class=\"fastPass_col\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div>Celular:</div>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"inputField\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"telefoneSMSFastPass\" id=\"telefoneSMSFastPass\" size=\"12\" maxlength=\"12\" onKeyPress=\"Mascara(this, formatarCelularEDdd)\" onInput=\"validateFastPassForm()\" onBlur=\"validateFastPassForm()\">\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<!-- send col -->\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"fastPass_col\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<button id=\"btnFastPass\" type=\"button\" onclick=\"fastPass()\" class=\"button print disabled tooltip\" data-tooltip=\"Gerar a Cesta Fast Pass\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-paper-plane fa-fastpass\"></i>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Enviar SMS</span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f19.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1582,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ hostFastPassServices != '-1' && cliente.cartao.cdCliente > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f19 = _jspx_th_c_005fif_005f19.doStartTag();
    if (_jspx_eval_c_005fif_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"actions pdv fpass\" style=\"display:none\">\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_005fif_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f20.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1585,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ hostFastPassServices == '-1' || !(cliente.cartao.cdCliente > 0)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f20 = _jspx_th_c_005fif_005f20.doStartTag();
    if (_jspx_eval_c_005fif_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"actions pdv fpass\" style=\"display:flex\">\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_005fif_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f21.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1596,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente != null && habilitaCapturaLgpd != null && habilitaCapturaLgpd == 'true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f21 = _jspx_th_c_005fif_005f21.doStartTag();
    if (_jspx_eval_c_005fif_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"pdv_col\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<button id=\"btnCapturarConsentimentos\" type=\"button\" class=\"button print\" name=\"btnCapturarConsentimentos\" onclick=\"abreAlteraConsentimento()\" data-tooltip=\"Consentimentos\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Capturar consentimentos</span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f22.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1604,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entregaVizinhanca == 'true' && entregaVizinhanca != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f22 = _jspx_th_c_005fif_005f22.doStartTag();
    if (_jspx_eval_c_005fif_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"pdv_col\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"button print\" type=\"button\" data-tooltip=\"Preencher romaneio\" onclick=\"entregaVizinhanca()\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span>Entrega Na Vizinhança</span>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f23.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1665,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdOperador != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f23 = _jspx_th_c_005fif_005f23.doStartTag();
    if (_jspx_eval_c_005fif_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<script>\n");
        out.write("\t\tcdOperador = '");
        if (_jspx_meth_c_005fout_005f115(_jspx_th_c_005fif_005f23, _jspx_page_context))
          return true;
        out.write("';\n");
        out.write("\t</script>\n");
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

  private boolean _jspx_meth_c_005fout_005f115(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f23, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f115 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f115.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f115.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f23);
    // /WEB-INF/jsp/toolbar.jsp(1667,16) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f115.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdOperador}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f115 = _jspx_th_c_005fout_005f115.doStartTag();
    if (_jspx_th_c_005fout_005f115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f115);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f115);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f24.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1670,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${versaoNovoLayoutCompreRetireMP != 'true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f24 = _jspx_th_c_005fif_005f24.doStartTag();
    if (_jspx_eval_c_005fif_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<script>\n");
        out.write("\t\tconsultaReserva();\n");
        out.write("\t\tidIntervalConsultarReservaApp = window.setInterval(\"consultaReserva()\", appTime);\n");
        out.write("\t</script>\n");
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

  private boolean _jspx_meth_c_005fif_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f25.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1676,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${versaoNovoLayoutCompreRetireMP != null && versaoNovoLayoutCompreRetireMP == 'true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f25 = _jspx_th_c_005fif_005f25.doStartTag();
    if (_jspx_eval_c_005fif_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<script>\n");
        out.write("\t\tconsultarPedidosCompreRetireEmAberto();\n");
        out.write("\t\tidIntervalConsultarReservaApp = window.setInterval(\"consultarPedidosCompreRetireEmAberto()\", appTime);\n");
        out.write("\t</script>\n");
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

  private boolean _jspx_meth_c_005fif_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f26.setParent(null);
    // /WEB-INF/jsp/toolbar.jsp(1682,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialVersaoReservaAppEntreLojas }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f26 = _jspx_th_c_005fif_005f26.doStartTag();
    if (_jspx_eval_c_005fif_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<script>\n");
        out.write("\t\tconsultarReservasEntreLojas();\n");
        out.write("\t\twindow.setInterval(\"consultarReservasEntreLojas()\", appTime);\n");
        out.write("\t</script>\n");
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
}
