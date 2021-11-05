package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lembrete_002dmedicamento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"lembrete_medicamento_id\" style=\"display:none;width:431px;height:511px;left:468px;top:109px;\" class=\"dialogoFlutuante\">\n");
      out.write("\t<style>\n");
      out.write("\t\t.tdField {\n");
      out.write("\t\t    border-bottom: solid thin; display: table-cell; font-weight: bold; \n");
      out.write("\t\t}\n");
      out.write("\t\t.tdLabel {\n");
      out.write("\t\t    align:left;text-align:left;\n");
      out.write("\t\t}\n");
      out.write("\t\t.tbLembrete {\n");
      out.write("\t\t    width:425px;padding-left:6px;padding-bottom:8px;\n");
      out.write("\t\t}\n");
      out.write("        .divValidations {\n");
      out.write("            background:#00889A;\n");
      out.write("            border-color:white;border-width:3px;border-style:solid;\n");
      out.write("            height:62px;width:416px;padding:3px;display:none;\n");
      out.write("        }\n");
      out.write("\t</style>\n");
      out.write("\t<div class=\"dlgTopo\" onmousedown=\"dlgMove('lembrete_medicamento_id');\" onmouseup=\"clrDlgMove();\"> \n");
      out.write("\t\t<span class=\"dlgNome\">Configuração de Lembretes por APP</span>\n");
      out.write("    \t<div class=\"dlgFechar\" onclick=\"escondeDialogo('lembrete_medicamento_id')\">X</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"lembrete_medicamento_idCorpo\" class=\"dlgCorpo\" style=\"height:485px; text-align:start; padding-top:8px;\">\n");
      out.write("\t<label title=\"Lembrete de tomada de medicamento\" style=\"font-size:14px\">\n");
      out.write("        <b>Para configurar o lembrete confirme os dados abaixo:</b>\n");
      out.write("    </label>\n");
      out.write("    <br>\n");
      out.write("    <table class=\"tbLembrete\" cellspacing=\"0\" border=\"0\">\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdCpfLabel\" class=\"tdField tdLabel\" nowrap=\"nowrap\">\n");
      out.write("                    CPF:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdCpf\" class=\"tdField tdLeft\" nowrap=\"nowrap\">\n");
      out.write("                    <input type=\"text\"  id='txtCpf' readonly maxlength=\"10\" style=\"width:90px\" onKeyPress=\"Mascara(this,Cpf);\"/>\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdCelularLabel\" class=\"tdField tdLabel\" nowrap=\"nowrap\">\n");
      out.write("                    Celular:\n");
      out.write("                </td>\n");
      out.write("                <td id = \"tdCelular\" class=\"tdField tdLabel\" nowrap=\"nowrap\">\n");
      out.write("\t\t\t\t\t<div style=\"width:101%;\">\n");
      out.write("\t\t\t\t\t   <input type=\"text\" id=\"txtPrefixo\" value=\"\" style=\"width:20%;margin:0;\" onBlur=\"require(this,'Prefixo');minLenField(this,2,'Prefixo');\"/>\n");
      out.write("\t\t\t\t\t   <input type=\"text\" id=\"txtCelular\" value=\"\" style=\"width:75%;margin:0;float:right;\" onBlur=\"require(this,'Celular');minLenField(this,8,'Celular');\" maxlength=\"10\" onkeypress=\"Mascara(this,Celular);\" placeholder=\"digite o celular\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdClienteLabel\" class=\"tdField tdLabel\" nowrap=\"nowrap\">\n");
      out.write("                    Cliente:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdCliente\" class=\"tdField tdLabel\" nowrap=\"nowrap\" colspan=3>\n");
      out.write("                    <input type=\"text\" id='txtCliente' value='' style=\"width:100%\" maxlength=\"40\" placeholder=\"digite o nome do cliente\" onBlur=\"require(this,'Nome do Cliente');\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <label title=\"Medicamento Selecionado\" style=\"font-size:14px;\">\n");
      out.write("        <b>Medicamento selecionado para a configuração dos lembretes:</b>\n");
      out.write("    </label>\n");
      out.write("    <br>\n");
      out.write("    <table class=\"tbLembrete\" id=\"tableMedicamentoSelecionado\" cellspacing=\"0\" border=\"0\">\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdProdutoLabel\" class=\"tdField tdLabel\" style=\"width:50px;\">\n");
      out.write("                    Produto:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdProduto\" class=\"tdField tdLabel\" colspan=\"3\">\n");
      out.write("                \t<input type=\"hidden\" id='hdCdProduto' value='' />\n");
      out.write("                    <input type=\"text\" id='txtProduto' readonly disabled maxlength=\"50\" style=\"width:100%;background-color:#eeeeee;\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdDosagemLabel\" class=\"tdField tdLabel\" style=\"width:50px;\">\n");
      out.write("                    Dosagem:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdDosagem\" class=\"tdField tdLabel\">\n");
      out.write("                    <input type=\"text\" id='txtDosagem' readonly disabled maxlength=\"6\" style=\"width:90%;background-color:#eeeeee;\"/>\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdUnidadeDeMedidaLabel\" class=\"tdField\" style=\"width:125px;align:right;text-align:right;\">\n");
      out.write("                    Unid. de Medida:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdUnidadeDeMedida\" class=\"tdField\" style=\"text-align:right;\">\n");
      out.write("                    <input type=\"text\" id='txtUnidadeDeMedida' readonly disabled maxlength=\"6\" style=\"width:100%;background-color:#eeeeee;\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <label title=\"Lembrete de Recompra\" style=\"font-size:14px;\">\n");
      out.write("        <b>Lembrete de <font color='#00889A'>recompra</font> do medicamento:</b>\n");
      out.write("    </label>\n");
      out.write("    <br>\n");
      out.write("    <table class=\"tbLembrete\" id=\"tableLembreDeRecompra\" cellspacing=\"0\" border=\"0\">\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdLembreteDeRecompraLabel\" class=\"tdField tdLabel\" colspan=\"4\">\n");
      out.write("                    Ao cadastrar o cliente receberá o lembrete 5 dias antes do término do tratamento. Por favor não esqueça de confirmar o celular do cliente.\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdDataSugestaoLabel\" class=\"tdField tdLabel\" style=\"width:50px;\">\n");
      out.write("                    Data da Recompra:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdDataSugestao\" class=\"tdField tdLabel\">\n");
      out.write("                    <input type=\"text\" id='txtSugestaoRecompra' readonly disabled maxlength=\"6\" style=\"background-color:#eeeeee;\"/>\n");
      out.write("                </td>\n");
      out.write("                <td class=\"tdField tdLabel\">\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdCadastrarRecompra\" class=\"tdField\" style=\"width: 146px;\">\n");
      out.write("                    <input type=\"checkbox\" id='btCadastrarRecompra'/>\n");
      out.write("                    <label class=\"label\" style=\"margin-right:0px;font-size:11px;padding: 4px 6px 6px 6px;\">Cadastrar Recompra</label>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    <label title=\"Lembrete de uso\" style=\"font-size:14px;\">\n");
      out.write("        <b>Lembrete de <font color='#00889A'>uso</font> do medicamento:</b>\n");
      out.write("    </label>\n");
      out.write("    <br>\n");
      out.write("    <table class=\"tbLembrete\" id=\"tableLembreDeUso\" cellspacing=\"0\" border=\"0\">\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdLembreteDeUsoLabel\" class=\"tdField tdLabel\" colspan=\"3\">\n");
      out.write("                    Para configurar o lembrete confirme os dados abaixo e ao cadastrar o cliente receberá as notificações conforme os parâmetros informados.\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdDtInicioLabel\" class=\"tdField tdLabel\" style=\"width:65px\">\n");
      out.write("                    Dt. Inicio:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdDtInicio\" class=\"tdField tdLabel\" colspan=\"2\">\n");
      out.write("                    <input type=\"text\" id='dtInicio' maxlength=\"10\" onBlur=\"minLenField(this,10,'Data de Recompra');\" onKeyPress=\"Mascara(this,Data);\" placeholder=\"digite a data\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdTomarLabel\" class=\"tdField tdLabel\" style=\"width:65px\">\n");
      out.write("                    Tomar:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdTomar\" class=\"tdField tdLabel\" colspan=\"2\">\n");
      out.write("                    <input type=\"text\" id='txtTomar' maxlength=\"6\" onKeyPress=\"Mascara(this,Integer);\" placeholder=\"digite a quantidade\"/>\n");
      out.write("                    <input type=\"text\" id=\"txtFormaFarma\" readonly disabled style=\"background-color:#eeeeee; width: 166px;\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdACadaLabel\" class=\"tdField tdLabel\" style=\"width:65px\">\n");
      out.write("                    A cada:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdACada\" class=\"tdField tdLabel\" colspan=\"2\">\n");
      out.write("                    <input type=\"text\" id='txtACada' maxlength=\"6\" onKeyPress=\"Mascara(this,Integer);\" placeholder=\"digite o período\"/>\n");
      out.write("                    <select id=\"ddlACada\" class=\"tdField tdLabel\" style=\"width:172px;font-weight:normal;display:inline-block;\">\n");
      out.write("                      <option value=\"2\">horas</option>\n");
      out.write("                      <option value=\"3\">dias</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"tdDataRecompraLabel\" class=\"tdField tdLabel\" style=\"width:65px\">\n");
      out.write("                    Hr. Inicio:\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdHrInicio\" class=\"tdField tdLabel\">\n");
      out.write("                    <input type=\"text\" id='hrInicio' maxlength=\"5\" onBlur=\"minLenField(this,4,'Hora Inicio');\" onKeyPress=\"Mascara(this,Hora);\" placeholder=\"digite o horário\"/>\n");
      out.write("                </td>\n");
      out.write("                <td id=\"tdCadastrarUso\" class=\"tdField\">\n");
      out.write("                    <input type=\"checkbox\" id='btCadastrarUso'/>\n");
      out.write("                    <label class=\"label\" style=\"margin-right:0px;font-size:11px;padding: 4px 6px 6px 6px;\">Cadastrar Uso</label>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\" id=\"tdButtonProduto\" class=\"tdField\">\n");
      out.write("                    <input type=\"button\" id=\"buttonProduto\" class =\"btnPadrao\" onclick=\"configurarLembrete()\" value=\"Configurar\" />\n");
      out.write("                    <img id=\"imgAjaxLoaderLembrete\" style=\"vertical-align: middle; display: none;\" src=\"/tc-core-portlets_1.0/images/ajaxLoader.gif\"/>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("\t<div id=\"divValidations\" class=\"divValidations\">\n");
      out.write("\t\t<table>\n");
      out.write("\t\t    <tbody>\n");
      out.write("\t\t\t\t<tr style=\"line-height: 15px\">\n");
      out.write("\t\t        \t<td style=\"border-width:0;text-align:left;\">\n");
      out.write("\t\t    \t\t\t<span id=\"validationMsg1\" style=\"color:white;display:none;\"></span>\n");
      out.write("\t\t        \t</td>\n");
      out.write("\t\t    \t</tr>\n");
      out.write("\t\t    \t<tr style=\"line-height: 15px\">\n");
      out.write("\t\t        \t<td style=\"border-width:0;text-align:left;\">\n");
      out.write("\t\t    \t\t\t<span id=\"validationMsg2\" style=\"color:white;display:none;\"></span>\n");
      out.write("\t\t        \t</td>\n");
      out.write("\t\t    \t</tr>\n");
      out.write("\t\t    \t<tr style=\"line-height: 15px\">\n");
      out.write("\t\t        \t<td style=\"border-width:0;text-align:left;\">\n");
      out.write("\t\t        \t\t<span id=\"validationMsg3\" style=\"color:white;display:none;\"></span>\n");
      out.write("\t\t        \t</td>\n");
      out.write("\t\t    \t</tr>\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
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
}
