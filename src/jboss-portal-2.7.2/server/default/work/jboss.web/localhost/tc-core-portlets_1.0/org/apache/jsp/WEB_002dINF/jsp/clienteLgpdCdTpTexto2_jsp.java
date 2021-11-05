package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.drogaraia.tc.portlet.RequestUtils;
import javax.portlet.*;
import java.util.*;

public final class clienteLgpdCdTpTexto2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/portlet_2_0.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("<script>\n");
      out.write("       var textosConsentimento = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${textosConsentimentoJson}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\n");
      out.write("       var universUrl = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${universUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("       var lgpdFluxoAlternativoSMS = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lgpdFluxoAlternativoSMS}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("css/");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("perfilCliente.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("css/");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("viewLgpd.css\">\n");
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
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"viewLgpd\">\n");
      out.write("\t\n");
      out.write("<div id=\"modalLgpd\" class=\"modal-lgpd\">\n");
      out.write("  <div class=\"modal-content-lgpd\">\n");
      out.write("\t\t<div class=\"doisConsentimentos\">\n");
      out.write("\t        <div class=\"super-title-consent\">\n");
      out.write("\t            <h1>Consentimentos de uso de dados pessoais</h1>\n");
      out.write("\t\t\t\t<a class=\"informativo-lgpd\" onclick=\"imprimirInformativoLgpd()\">Imprimir informativo\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-print\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t        </div>\n");
      out.write("\t\n");
      out.write("\t        <div class=\"content-box\">\n");
      out.write("\t\n");
      out.write("<!-- \t            <div class=\"description-box\">\n");
      out.write("\t                Autorizo que o Grupo Raia-Drogasil (Droga Raia, Drogasil, Drogaria Onofre e 4Bio) trate (colete, processe e compartilhe) todos os meus dados pessoais para:\n");
      out.write("\t            </div> -->\n");
      out.write("\t            <form id=\"formCadastroAlteracaoLgpd\" name=\"formCadastroAlteracaoLgpd\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${actionValor}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" method=\"POST\">\n");
      out.write("\t                <input type=\"hidden\" name=\"idCliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t                <!-- programas de indústria e medicamentos de uso contínuo -->\n");
      out.write("\t                <div class=\"container-consent\">\n");
      out.write("\t\n");
      out.write("\t                    <label class=\"label-consent-title\">\n");
      out.write("\t                        <span>1</span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${textosConsentimento[0].dsTitulo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\t                    </label>\n");
      out.write("\t\n");
      out.write("\t                    <div class=\"content-consent\">\n");
      out.write("\t                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${textosConsentimento[0].dsTextoCompleto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" \n");
      out.write("\t                    </div>\n");
      out.write("\t                    <div class=\"check-consentimentos\">\n");
      out.write("                                <input type=\"checkbox\" name=\"campo-checkboxS1\" id=\"campo-checkboxS1\" onclick=\"openChecks1();capturaOn();clickConsentimento(this, 1)\">\n");
      out.write("\t                        <label class=\"aceito\">Aceito</label>\n");
      out.write("                                <input type=\"checkbox\" name=\"campo-checkboxN1\" id=\"campo-checkboxN1\" onclick=\"openChecks2();capturaOn();clickConsentimento(this, 1)\">\n");
      out.write("\t                        <label class=\"nAceito\">Não aceito</label>\n");
      out.write("\t                    </div>\n");
      out.write("\t\n");
      out.write("\t                    <div class=\"check-consentimentos\" id=\"checkField\" style=\"display: none\">\n");
      out.write("\t                    <hr>\n");
      out.write("                            <label class=\"description-text\">Descontos e beneficios</label>\n");
      out.write("                            <div class=\"check-container\">\n");
      out.write("                                <div class=\"content-check\">\n");
      out.write("                                    <div class=\"inputs\">\n");
      out.write("                                        <input type=\"checkbox\" name=\"campo-checkboxS2\" class=\"checkhour\" id=\"campo-checkboxS2\" onclick=\"clickConsentimento(this, 2)\">\n");
      out.write("                                        <label for=\"campo-checkbox1\" class=\"aceito\">Aceito</label>\n");
      out.write("                                        <input type=\"checkbox\" name=\"campo-checkboxN2\" id=\"campo-checkboxN2\" onclick=\"clickConsentimento(this, 2)\">\n");
      out.write("                                        <label for=\"campo-checkbox1\" class=\"nAceito\">Não aceito</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div> \n");
      out.write("\t                    <label class=\"description-text\">Meios de comunicação:</label>\n");
      out.write("\t                        <div class=\"check-container\">\n");
      out.write("\t                            <div class=\"content-check\">\n");
      out.write("\t                                <div class=\"label\">\n");
      out.write("\t                                    SMS\n");
      out.write("\t                                </div>\n");
      out.write("\t                                <div class=\"inputs\">\n");
      out.write("                                            <input type=\"checkbox\" name=\"campo-checkboxS4\" class=\"checkhour\" id=\"campo-checkboxS4\" onclick=\"clickConsentimento(this, 4);checkBoxComunicacaoMarketing(this)\">\n");
      out.write("\t                                    <label for=\"campo-checkbox1\" class=\"aceito\">Aceito</label>\n");
      out.write("                                            <input type=\"checkbox\" name=\"campo-checkboxN4\" id=\"campo-checkboxN4\" onclick=\"clickConsentimento(this, 4);checkBoxComunicacaoMarketing(this)\">\n");
      out.write("\t                                    <label for=\"campo-checkbox1\" class=\"nAceito\">Não aceito</label>\n");
      out.write("\t                                </div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"content-check\">\n");
      out.write("\t                                <div class=\"label\">\n");
      out.write("\t                                    E-mail\n");
      out.write("\t                                </div>\n");
      out.write("\t                                <div class=\"inputs\">\n");
      out.write("                                            <input type=\"checkbox\" name=\"campo-checkboxS5\"class=\"checkhour\" id=\"campo-checkboxS5\" onclick=\"clickConsentimento(this, 5);checkBoxComunicacaoMarketing(this)\">\n");
      out.write("\t                                    <label for=\"campo-checkbox1\" class=\"aceito\">Aceito</label>\n");
      out.write("                                            <input type=\"checkbox\" name=\"campo-checkboxN5\" id=\"campo-checkboxN5\" onclick=\"clickConsentimento(this, 5);checkBoxComunicacaoMarketing(this)\">\n");
      out.write("\t                                    <label for=\"campo-checkbox1\" class=\"nAceito\">Não aceito</label>\n");
      out.write("\t                                </div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"content-check\">\n");
      out.write("\t                                <div class=\"label\">\n");
      out.write("\t                                    Telefone\n");
      out.write("\t                                </div>\n");
      out.write("\t                                <div class=\"inputs\">\n");
      out.write("                                            <input type=\"checkbox\" name=\"campo-checkboxS6\" class=\"checkhour\"id=\"campo-checkboxS6\" onclick=\"clickConsentimento(this, 6);checkBoxComunicacaoMarketing(this)\">\n");
      out.write("\t                                    <label for=\"campo-checkbox1\" class=\"aceito\">Aceito</label>\n");
      out.write("                                            <input type=\"checkbox\" name=\"campo-checkboxN6\" id=\"campo-checkboxN6\" onclick=\"clickConsentimento(this, 6);checkBoxComunicacaoMarketing(this)\">\n");
      out.write("\t                                    <label for=\"campo-checkbox1\" class=\"nAceito\">Não aceito</label>\n");
      out.write("\t                                </div>\n");
      out.write("\t                            </div>\n");
      out.write("                                    <div class=\"content-check\">\n");
      out.write("\t                                <div class=\"label\">\n");
      out.write("\t                                    Notificações de aplicativos\n");
      out.write("\t                                </div>\n");
      out.write("\t                                <div class=\"inputs\">\n");
      out.write("                                            <input type=\"checkbox\" name=\"campo-checkboxS7\" class=\"checkhour\" id=\"campo-checkboxS7\" onclick=\"clickConsentimento(this, 7);checkBoxComunicacaoMarketing(this)\">\n");
      out.write("\t                                    <label for=\"campo-checkbox1\" class=\"aceito\">Aceito</label>\n");
      out.write("                                            <input type=\"checkbox\" name=\"campo-checkboxN7\" id=\"campo-checkboxN7\" onclick=\"clickConsentimento(this, 7);checkBoxComunicacaoMarketing(this)\">\n");
      out.write("\t                                    <label for=\"campo-checkbox1\" class=\"nAceito\">Não aceito</label>\n");
      out.write("\t                                </div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                        </div>\n");
      out.write("\t                    </div>      \n");
      out.write("\t                </div>\n");
      out.write("\t            \n");
      out.write("\t                <!-- programa de personalização de descontos e benefícios -->\n");
      out.write("\t                <div class=\"container-consent\">\n");
      out.write("\t                    <label class=\"label-consent-title orange\">\n");
      out.write("\t                        <span>2</span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${textosConsentimento[1].dsTitulo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\t                    </label>\n");
      out.write("\t\n");
      out.write("\t                    <div class=\"content-consent\">\n");
      out.write("\t                       ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${textosConsentimento[1].dsTextoCompleto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\t                    </div>\n");
      out.write("\t                    <div class=\"check-consentimentos\">\n");
      out.write("\t                        <input type=\"checkbox\" name=\"campo-checkboxS3\" id=\"campo-checkboxS3\" onclick=\"capturaOn();clickConsentimento(this, 3)\">\n");
      out.write("\t                        <label for=\"campo-checkbox3\" class=\"aceito\">Aceito</label>\n");
      out.write("\t                        <input type=\"checkbox\" name=\"campo-checkboxN3\" id=\"campo-checkboxN3\" onclick=\"capturaOn();clickConsentimento(this, 3)\">\n");
      out.write("\t                        <label for=\"campo-checkbox3\" class=\"nAceito\">Não aceito</label>\n");
      out.write("\t                    </div>\n");
      out.write("\t                </div>\n");
      out.write("\t        \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <div class=\"consent-buttons\">\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    \n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t            <div class=\"captura-box\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t         \t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t            </div>\n");
      out.write("\t        </div>\n");
      out.write("\t        </div>\n");
      out.write("        \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <div id=\"modalFinalCaptura\" class=\"modal-final-atendimento\" style=\"display:none\">        \n");
      out.write("        <div class=\"modal-content-final-atendimento\">\n");
      out.write("            <div class=\"titulo-atencao\">\n");
      out.write("                <p>atenção</p>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <img src=\"/tc-core-portlets_1.0/images/svg/IconeModalAlerta.svg\" class=\"icone-alerta-modal\" alt=\"\">\n");
      out.write("                <p class=\"texto-atencao\">\n");
      out.write("                    É muito importante não esquecer de captar as autorizações\n");
      out.write("                    de uso de dados no final do atendimento ao cliente.<br/><br/>\n");
      out.write("                    Para isso, clique no ícone do perfil do cliente, no canto\n");
      out.write("                    direito do menu, antes de finalizar o atendimento.\n");
      out.write("                </p>\n");
      out.write("                <input id=\"idCancelarConsentimento\" type=\"button\" class=\"btnAtencao\" onclick=\"cancelaConsentimento('operador')\" value=\"Ok, entendi\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div id=\"idDialogLgpdScanner\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t\t<div id=\"areaAppletLgpd\"></div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\t\n");
      out.write("\tvar clienteLgpdInitializer = {\n");
      out.write("\t\tinitialize : function (){\n");
      out.write("\t\t\tthis.popularCheckbox();\n");
      out.write("\t\t},\n");
      out.write("\t\t\n");
      out.write("\t\tpopularCheckbox : function (){\n");
      out.write("\t\t\tif (lgpdClienteJson.mapCons != undefined){\n");
      out.write("\t\t\t\tvar mapConsTratado = {};\n");
      out.write("\t\t\t\tfor (var i=0; i<lgpdClienteJson.mapCons.length; i++){\n");
      out.write("\t\t\t\t\tvar consentimento_i = lgpdClienteJson.mapCons[i];\n");
      out.write("\t\t\t\t\tmapConsTratado[consentimento_i.chave] = consentimento_i.valor;   \n");
      out.write("\t\t\t\t}\n");
      out.write("                                document.getElementById('campo-checkboxS1').checked = mapConsTratado[1] == 'S';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxN1').checked = mapConsTratado[1] == 'N';\t\t\t\t\t\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxS2').checked = mapConsTratado[2] == 'S';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxN2').checked = mapConsTratado[2] == 'N';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxS3').checked = mapConsTratado[3] == 'S';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxN3').checked = mapConsTratado[3] == 'N';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxS4').checked = mapConsTratado[4] == 'S';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxN4').checked = mapConsTratado[4] == 'N';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxS5').checked = mapConsTratado[5] == 'S';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxN5').checked = mapConsTratado[5] == 'N';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxS6').checked = mapConsTratado[6] == 'S';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxN6').checked = mapConsTratado[6] == 'N';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxS7').checked = mapConsTratado[7] == 'S';\n");
      out.write("\t\t\t\tdocument.getElementById('campo-checkboxN7').checked = mapConsTratado[7] == 'N';\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(mapConsTratado[1] == 'N'){\n");
      out.write("\t\t\t\t\tdocument.getElementById('checkField').style.display = \"block\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\tclienteLgpdInitializer.initialize();\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("</script>\n");
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(14,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/js/script-view-lgpd.js");
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(15,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(15,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 'raia/' : 'drogasil/'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(16,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(16,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LOGO_MARCA == '1' ? 'raia/' : 'drogasil/'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
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
        out.write('\n');
        out.write('	');
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(20,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty lgpdCliente}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<script>\n");
        out.write("\t\t\tlgpdClienteJson = {idCliente : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lgpdCliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(",\n");
        out.write("\t\t\t\tarquivoBase64 : \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lgpdCliente.arquivoBase64}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\",\n");
        out.write("\t\t\t\tdescTpAcao : \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lgpdCliente.descTpAcao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\",\n");
        out.write("\t\t\t\tmapCons:\n");
        out.write("\t\t\t\t[");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t]};\n");
        out.write("\t\t</script>\n");
        out.write("\t");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(26,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("type");
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(26,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(26,5) '${lgpdCliente.mapConsentimento}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${lgpdCliente.mapConsentimento}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(26,5) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("index");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("   \t\t\t\t\t{\n");
          out.write("   \t\t\t\t\t\tchave:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(", valor:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("   \t\t\t\t\t}\n");
          out.write("   \t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(30,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!index.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(157,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${btnHabilitado && !filialVersaoBtnConsentimento}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    \t<input id=\"idModalFinalCaptura\" type=\"button\" class=\"btnPadrao\" onclick=\"openModalFinalCaptura()\" value=\"Pegar os consentimentos no final do atendimento\">\n");
        out.write("                    ");
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(161,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!btnHabilitado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    \t<input id=\"idConsentimentoDepois\" type=\"button\" class=\"btnPadrao\" onclick=\"cancelaConsentimento('cliente')\" value=\"Cliente quer autorizar em outra oportunidade\">\n");
        out.write("                    ");
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(165,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!lgpdFluxoAlternativoSMS}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\n");
        out.write("\t\t            \t<input id=\"idCadastrarConsentimento\" type=\"button\" class=\"btnPadraoCaptura\" onclick=\"cadastrarConsentimento()\" value=\"Continuar e captar a biometria\"/>\n");
        out.write("\t                <span id=\"problemaBiometria\">\n");
        out.write("\t                    <a class=\"problemaBiometria\" onclick=\"problemaBiometria()\" id=\"idProblemaBiometria\">Problema na captação da biometria?</a>\n");
        out.write("\t                </span> \n");
        out.write("\t\t         \t");
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
    // /WEB-INF/jsp/clienteLgpdCdTpTexto2.jsp(171,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lgpdFluxoAlternativoSMS}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t         \t\t<input id=\"idCadastrarConsentimento\" type=\"button\" class=\"btnPadraoCaptura\" onclick=\"problemaBiometria()\" value=\"Continuar e enviar SMS\"/>\n");
        out.write("\t\t                <span id=\"problemaBiometria\">\n");
        out.write("\t\t                    <a class=\"problemaBiometria\" onclick=\"problemaSmsEToken(3)\" id=\"idProblemaBiometria\">Problema para enviar o SMS?</a>\n");
        out.write("\t\t                </span>\n");
        out.write("\t\t         \t");
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
}
