package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crSepararFaturar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/portlet_2_0.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("css/reserva.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("css/");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("microPolo-compreRetire.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\n");
      out.write("\n");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fchoose_005f1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" charset=\"UTF-8\">\n");
      out.write("    var pedidoParcial = false;\n");
      out.write("    var jsonDataReservas = {};\n");
      out.write("    var listaAguardandoSeparacao = {};\n");
      out.write("    var listaAguardandoRetirada = {};\n");
      out.write("    var listaLotesDeDespacho;\n");
      out.write("    var listaTodosOsLotes;\n");
      out.write("    var listaPedidosMPComPendencias;\n");
      out.write("    var listaLotesAguardandoDepacho;\n");
      out.write("\tcontrolarTokenMicroPolo();\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    function setEndImpressaoReservaApp(bool) {\n");
      out.write("    \tendImpressaoReservaApp = bool;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("    // $(document).ready(function () {\n");
      out.write("    //     $(\".btnExpandir\").click(function () {\n");
      out.write("    //         var idReserva = $(this).data('idReserva');\n");
      out.write("    //         var cdTelevenda = $(this).data('cdTelevenda');\n");
      out.write("    //         $(\".\" + idReserva).toggle();\n");
      out.write("    //         $(\"#\" + idReserva).toggle();\n");
      out.write("    //         $(\"[name='\" + idReserva + \"']\").toggle();\n");
      out.write("    //         $(\"#tbl_hist_\" + idReserva).toggle();\n");
      out.write("    //         getHistorico(idReserva);\n");
      out.write("    //         formatDescPedido(idReserva);\n");
      out.write("    //         if(cdTelevenda != undefined){\n");
      out.write("\t//             verificarBtnImprimirEtiqueta(cdTelevenda);\n");
      out.write("    //         }\n");
      out.write("    //     });\n");
      out.write("    //     // Formatação de Tarja para Medicamento Controlado - C&C\n");
      out.write("\t// \tccIntializer.initialize();\n");
      out.write("\t// \t// Bloqueia o botao \"enter\"\n");
      out.write("\t// \tdocument.onkeypress = stopEnterKey;\n");
      out.write("    // });\n");
      out.write("\n");
      out.write("    function teclaEnter(evt, validaProduto, idReserva, cdReservaOrigem, cdOperador, cdEan, cdProduto, qtItens, count, i, cdFluxo, cdTelevenda, controlado) {\n");
      out.write("        var code = (window.event) ? evt.keyCode : evt.which;\n");
      out.write("        if (code == 13) {\n");
      out.write("            validaProduto(idReserva, cdReservaOrigem, cdOperador, cdEan, cdProduto, qtItens, count, i, cdFluxo, cdTelevenda, controlado);\n");
      out.write("            return false;\n");
      out.write("        } else\n");
      out.write("            return true;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function validaQtdProduto(evt, qtItens, count, i, cdEan, cdProduto, idReserva){\n");
      out.write("        var idElemento = \"\" + i + count + \"\";\n");
      out.write("     \tvar qtDisponivel = \"qtDisponivel-\" + cdEan + \"-\" + cdProduto + i + \"\";\n");
      out.write("    \tvar qtValor = document.getElementById(qtDisponivel).value;\n");
      out.write("        var imgAprovada = \"aprovada\" + i + count + cdProduto + \"\";\n");
      out.write("        var imgAprovadaParcial = \"aprovada\" + i + count + cdProduto + \"-\" + i + \"\";\n");
      out.write("        var imgReprovada = \"reprovada\" + i + count + cdEan + \"\";\n");
      out.write("        var idCheckbox = \"chk\" + i + count + \"\";\n");
      out.write("    \tif(qtValor>qtItens || qtValor==qtItens || qtValor==\"\" || qtValor==0){\n");
      out.write("    \t\tjAlert(\"Quantidade informada maior/igual que a pedida\");\n");
      out.write("        \tdocument.getElementById(imgAprovada).style.display = \"none\";\n");
      out.write("   \t\t\tdocument.getElementById(imgReprovada).style.display = \"block\";\n");
      out.write("   \t\t\tdocument.getElementById(imgAprovadaParcial).style.display = \"none\";\n");
      out.write("            document.getElementById(idCheckbox).checked = false;\n");
      out.write("            document.getElementById(qtDisponivel).style.display = \"block\";\n");
      out.write("            document.getElementById(qtDisponivel).focus();\n");
      out.write("            pedidoParcial = false;\n");
      out.write("            document.getElementById(idElemento).value = \"\";\n");
      out.write("    \t}else{\n");
      out.write("    \t\tdocument.getElementById(imgAprovada).style.display = \"none\";\n");
      out.write("   \t\t\tdocument.getElementById(imgReprovada).style.display = \"none\";\n");
      out.write("   \t\t\tdocument.getElementById(imgAprovadaParcial).style.display = \"block\";\n");
      out.write("            document.getElementById(idCheckbox).checked = true;\n");
      out.write("            pedidoParcial = true;\n");
      out.write("            document.getElementById(qtDisponivel).style.display = \"block\";\n");
      out.write("            document.getElementById(qtDisponivel).focus();\n");
      out.write("    \t}\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function validaProduto(idReserva, cdReservaOrigem, cdOperador, cdEan, cdProduto, qtItens, count, i, cdFluxo, cdTelevenda, controlado) {\n");
      out.write("        var idElemento = \"\" + i + count + \"\";\n");
      out.write("        var imgAprovada = \"aprovada\" + i + count + cdProduto + \"\";\n");
      out.write("        var imgAprovadaParcial = \"aprovada\" + i + count + cdProduto + \"-\" + i + \"\";\n");
      out.write("        var imgReprovada = \"reprovada\" + i + count + cdEan + \"\";\n");
      out.write("        var idCheckbox = \"chk\" + i + count + \"\";\n");
      out.write("        var txtValidacao = document.getElementById(idElemento).value;\n");
      out.write("        var idProximoElemento = \"\" + i + (count + 1) + \"\";\n");
      out.write("        var qtDisponivel = \"qtDisponivel-\" + cdEan + \"-\" + cdProduto + i + \"\";\n");
      out.write("        var cdFilial = filialTc.cdFilial;\n");
      out.write("\n");
      out.write("        if (txtValidacao == \"\") {\n");
      out.write("            document.getElementById(imgAprovada).style.display = \"none\";\n");
      out.write("            document.getElementById(imgReprovada).style.display = \"none\";\n");
      out.write("            document.getElementById(imgAprovadaParcial).style.display = \"none\";\n");
      out.write("            document.getElementById(qtDisponivel).style.display = \"none\";\n");
      out.write("            document.getElementById(idCheckbox).checked = false;\n");
      out.write("            document.getElementById(idElemento).focus();\n");
      out.write("            jAlert(\"Favor inserir um código ou um EAN do produto\");\n");
      out.write("        } else if (( txtValidacao == cdEan ) || ( txtValidacao == cdProduto )) {\n");
      out.write("            if (qtItens > 1) {\n");
      out.write("                dialogos.exibeInfo('A loja possui os ' + qtItens + ' produtos em estoque para efetuar a reserva/pedido?', {\n");
      out.write("                    'Sim': function () {\n");
      out.write("                        document.getElementById(imgAprovada).style.display = \"block\";\n");
      out.write("                        document.getElementById(imgReprovada).style.display = \"none\";\n");
      out.write("                        document.getElementById(imgAprovadaParcial).style.display = \"none\";\n");
      out.write("                        document.getElementById(idCheckbox).checked = true;\n");
      out.write("                        $j(this).dialog(\"close\");\n");
      out.write("                        document.getElementById(idProximoElemento).focus();\n");
      out.write("                    },\n");
      out.write("                    'Não': function () {\n");
      out.write("                    \tif(cdFluxo == 3){\n");
      out.write("\t\t\t                dialogos.exibeInfo('Você deseja fazer um pedido parcial?', {\n");
      out.write("\t                            'Sim': function () {\n");
      out.write("\t                            \tjAlert(\"Informe a quantidade dispon&iacute;vel do produto\");\n");
      out.write("\t\t\t                        document.getElementById(idCheckbox).checked = false;\n");
      out.write("\t\t\t                        document.getElementById(imgReprovada).style.display = \"block\";\n");
      out.write("\t\t\t                        document.getElementById(imgAprovada).style.display = \"none\";\n");
      out.write("\t\t\t                        $j(this).dialog(\"close\");\n");
      out.write("\t\t\t                        document.getElementById(qtDisponivel).style.display = \"block\";\n");
      out.write("\t\t\t                        document.getElementById(qtDisponivel).focus();\n");
      out.write("\t\t\t                        pedidoParcial = true;\n");
      out.write("\t                            },\n");
      out.write("\t                            'Não': function () {\n");
      out.write("\t                            \tpedidoParcial = false;\n");
      out.write("\t                            \tdocument.getElementById(idElemento).value = \"\";\n");
      out.write("\t                            \tcancelaReserva(idReserva, cdReservaOrigem, cdOperador, cdTelevenda, cdFluxo, cdFilial);\n");
      out.write("\t                            }\n");
      out.write("\t                        });\n");
      out.write("\t                    } else {\n");
      out.write("\t\t\t                dialogos.exibeInfo('Você deseja cancelar esse pedido por falta de estoque?', {\n");
      out.write("\t                            'Sim': function () {\n");
      out.write("\t                            \tvar cdFilial = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filial.cdFilial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\n");
      out.write("\t\t\t\t\t\t\t\t\tcancelarPedidoEcommerceCompreRetireNovo(idReserva, cdOperador);\n");
      out.write("\t                            },\n");
      out.write("\t                            'Não': function () {\n");
      out.write("\t                                document.getElementById(imgAprovada).style.display = \"none\";\n");
      out.write("\t                                document.getElementById(imgReprovada).style.display = \"block\";\n");
      out.write("\t\t                            document.getElementById(imgAprovadaParcial).style.display = \"none\";\n");
      out.write("\t                                document.getElementById(idCheckbox).checked = false;\n");
      out.write("\t                                $j(this).dialog(\"close\");\n");
      out.write("\t                                document.getElementById(idElemento).focus();\n");
      out.write("\t\t                            document.getElementById(idElemento).value = \"\";\n");
      out.write("\t                            }\n");
      out.write("\t                        });\n");
      out.write("\t                    }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            } else {\n");
      out.write("                document.getElementById(imgAprovada).style.display = \"block\";\n");
      out.write("                document.getElementById(imgReprovada).style.display = \"none\";\n");
      out.write("                document.getElementById(imgAprovadaParcial).style.display = \"none\";\n");
      out.write("                document.getElementById(idCheckbox).checked = true;\n");
      out.write("                document.getElementById(idProximoElemento).focus();\n");
      out.write("            }\n");
      out.write("        } else {\n");
      out.write("            document.getElementById(imgAprovada).style.display = \"none\";\n");
      out.write("            document.getElementById(imgReprovada).style.display = \"block\";\n");
      out.write("            document.getElementById(imgAprovadaParcial).style.display = \"none\";\n");
      out.write("            document.getElementById(idCheckbox).checked = false;\n");
      out.write("            document.getElementById(idElemento).focus();\n");
      out.write("        }\n");
      out.write("        /* Bug correção - função para parar o refresh na página quando é\n");
      out.write("           feita a validação do produto sem botão - window.stop()\n");
      out.write("        */\n");
      out.write("\t\tstopBrowser();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function aprovaReserva(idReserva, count, i, nome, idReserva, filial, cpf, dataReserva, nrPedido, celularComDDD, controlado, cdFluxo, cdTelevenda) {\n");
      out.write("    \tvar token = verificarToken();\n");
      out.write("        console.log(\"nrPedido = \" + nrPedido + \" - controlado = \" + controlado);\n");
      out.write("        var reservaChecada = true;\n");
      out.write("        var reservaParcial = false;\n");
      out.write("        var listPedidos = $j('[name=checkList]');\n");
      out.write("        var listBackOrder = new Array();\n");
      out.write("        var listReservaItens = new Array();\n");
      out.write("        var contador = 0;\n");
      out.write("\n");
      out.write("        if (count == 1) {\n");
      out.write("            var validaCodUnicoProduto = document.getElementById(\"validaCodUnicoProduto\" + idReserva).innerHTML;\n");
      out.write("            var validaEanUnicoProduto = document.getElementById(\"validaEanUnicoProduto\" + idReserva).innerHTML;\n");
      out.write("            var idElemento = \"\" + i + (count - 1) + \"\";\n");
      out.write("            var checkSituacao = document.getElementById(\"chk\" + idElemento).checked;\n");
      out.write("            var txtValidacao = document.getElementById(idElemento).value;\n");
      out.write("            if (( txtValidacao == validaEanUnicoProduto ) || ( txtValidacao == validaCodUnicoProduto )) {\n");
      out.write("                reservaChecada = true;\n");
      out.write("                if(pedidoParcial && checkSituacao){\n");
      out.write("                \treservaChecada = false;\n");
      out.write("                }else if(pedidoParcial){\n");
      out.write("                \tpedidoParcial = false;\n");
      out.write("                \tjAlert(\"O pedido nº \" + nrPedido + \" não foi aprovado, por favor, verifique a situa&ccedil;&atilde;o.\");\n");
      out.write("                \treturn;\n");
      out.write("                }\n");
      out.write("            } else {\n");
      out.write("                reservaChecada = false;\n");
      out.write("                jAlert(\"O pedido nº \" + nrPedido + \" não foi aprovado, por favor, confirme o código do produto ou seu EAN.\");\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("        } else {\n");
      out.write("            for (var j = 0; j < count; j++) {\n");
      out.write("            \tif(cdFluxo==3){\n");
      out.write("            \t\tif(document.getElementById(\"chk\" + i + j + \"\").checked == true){\n");
      out.write("\t                    contador ++;\n");
      out.write("\t                    if(contador==count){\n");
      out.write("\t                    \treservaParcial = false;\n");
      out.write("\t                    \treservaChecada = true;\n");
      out.write("\t                    \tbreak;\n");
      out.write("\t                    }else{\n");
      out.write("\t                    \treservaChecada = false;\n");
      out.write("\t                    \treservaParcial = true;\n");
      out.write("\t                    }\n");
      out.write("                \t}else{\n");
      out.write("                \t\t if(contador==0){\n");
      out.write("\t                    \treservaParcial = false;\n");
      out.write("\t                   \t\treservaChecada = false;\n");
      out.write("\t                   \t}\n");
      out.write("\t                }\n");
      out.write("            \t}else{\n");
      out.write("\t                if (document.getElementById(\"chk\" + i + j + \"\").checked == false) {\n");
      out.write("\t                    reservaChecada = false;\n");
      out.write("\t                    break;\n");
      out.write("\t                }\n");
      out.write("            \t}\n");
      out.write("        \t}\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        if (reservaChecada == true && pedidoParcial == false) {\n");
      out.write("            dialogos.exibeInfo('Você deseja aprovar esse pedido?', {\n");
      out.write("                'Sim': function () {\n");
      out.write("                    $(\"#btnCancelar\" + i + \"\" + count).attr('disabled', 'disabled').css('cursor', 'not-allowed');\n");
      out.write("                    $(\"#btnCheckList\" + idReserva).attr('disabled', 'disabled').css('cursor', 'not-allowed');\n");
      out.write("                    $(\"#\" + i + \"\" + count).attr('disabled', 'disabled').css('cursor', 'progress');\n");
      out.write("                    dialogos.fecharAction.apply(this);\n");
      out.write("                   if(cdFluxo==3){\n");
      out.write("\t                   \tif(verficarVolume(i, count)){\n");
      out.write("\t                   \t\tcriarVolume(token, cdTelevenda);\n");
      out.write("\t                   \t}else{\n");
      out.write("\t\t        \t\t\talterarStatusPedidoSeparado(token, cdTelevenda, cdFluxo);\n");
      out.write("\t\t        \t\t}\n");
      out.write("       \t\t\t\t}\n");
      out.write("                },\n");
      out.write("                'Não': function () {\n");
      out.write("                    $j(this).dialog(\"close\");\n");
      out.write("                    jAlert(\"O pedido esta pendente de confirmação\");\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        } else if (reservaParcial == true || pedidoParcial == true) {\n");
      out.write("        \t dialogos.exibeInfo('Você deseja aprovar esse pedido parcial?', {\n");
      out.write("\t                'Sim': function () {\n");
      out.write("\t                    $(\"#btnCancelar\" + i + \"\" + count).attr('disabled', 'disabled').css('cursor', 'not-allowed');\n");
      out.write("\t                    $(\"#btnCheckList\" + idReserva).attr('disabled', 'disabled').css('cursor', 'not-allowed');\n");
      out.write("\t                    $(\"#\" + i + \"\" + count).attr('disabled', 'disabled').css('cursor', 'progress');\n");
      out.write("\t                    dialogos.fecharAction.apply(this);\n");
      out.write("\n");
      out.write("\t                    for(var j = 0 ; j < listPedidos.length; j++){\n");
      out.write("\t\t\t\t\t\t\tvar pedido = listPedidos[j];\n");
      out.write("\t\t\t\t\t\t\tif(pedido.checked) {\n");
      out.write("\t\t\t\t\t\t\t\tvar cdProduto = pedido.getAttribute('data-cdProduto');\n");
      out.write("\t\t\t\t\t\t\t\tvar cdEan = pedido.getAttribute('data-cdEan');\n");
      out.write("\t\t\t\t\t\t\t\tvar valor = \"qtDisponivel-\" + cdEan + \"-\" + cdProduto + i + \"\";\n");
      out.write("\t\t\t\t\t\t\t\tvar qtDisponivel = document.getElementById(valor).value;\n");
      out.write("\t\t\t\t\t\t\t\tvar qtItens = pedido.getAttribute('data-qtItem');\n");
      out.write("\t\t\t\t\t\t\t\tvar vlDisponivel = \"\";\n");
      out.write("\t\t\t\t\t\t\t\tif(qtDisponivel<qtItens && qtDisponivel != \"\"){\n");
      out.write("\t\t\t\t\t\t\t\t\tvlDisponivel = qtDisponivel;\n");
      out.write("\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\tvlDisponivel = qtItens;\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\tvar body = {\n");
      out.write("\t\t\t\t\t\t\t\t\t'cdProduto': cdProduto.toString(),\n");
      out.write("\t\t\t\t\t\t\t\t\t'quantidade': vlDisponivel.toString()\n");
      out.write("\t\t\t\t\t\t\t\t};\n");
      out.write("\t\t\t\t\t\t\t\tlistBackOrder.push(body);\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t                    var json = {'itens':listBackOrder};\n");
      out.write("\t                    enviarPedidoBackOrder(token, cdTelevenda, JSON.stringify(json));\n");
      out.write("\t                    if(cdFluxo==3){\n");
      out.write("\t\t\t        \t\tif(verficarVolume(i, count)){\n");
      out.write("\t                    \t\tcriarVolume(token, cdTelevenda);\n");
      out.write("\t                    \t}\n");
      out.write("\t        \t\t\t}\n");
      out.write("                },\n");
      out.write("                'Não': function () {\n");
      out.write("                    $j(this).dialog(\"close\");\n");
      out.write("                   \tjAlert(\"O pedido esta pendente de confirmação\")\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        } else {\n");
      out.write("            jAlert(\"O pedido nº \" + nrPedido + \" não foi aprovado, por favor, confirme os campos em aberto.\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\tfunction populaDadosOrigemFluxo(cpf, dsFluxo, i){\n");
      out.write("\t\t var seletor = cpf + i;\n");
      out.write("\t\t $(\".\" + seletor + \"\").attr(\"title\", dsFluxo);\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("    function cancelaReserva(idReserva, cdReservaOrigem, cdOperador, cdTelevenda, cdFluxo, cdFilial) {\n");
      out.write("       var token = verificarToken();\n");
      out.write("       dialogos.exibeInfo('Você deseja realmente cancelar o pedido?', {\n");
      out.write("               'Sim': function () {\n");
      out.write("               \t   if(cdFluxo==3){\n");
      out.write("               \t   \t\tabrirDialogCancelarPedido(idReserva, cdReservaOrigem, cdOperador, cdTelevenda, cdFluxo, cdFilial);\n");
      out.write("               \t   }\n");
      out.write("\n");
      out.write("                   $j(this).dialog(\"close\");\n");
      out.write("               },\n");
      out.write("               'Não': function () {\n");
      out.write("                       $j(this).dialog(\"close\");\n");
      out.write("                   }\n");
      out.write("           }\n");
      out.write("       );\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function verificarBtnImprimirEtiqueta(cdTelevenda){\n");
      out.write("    \tvar url = TERMINAL_CONSULTA_SERVICOS_URL + PATH_VERIFICAR_IMPRESSAO_ETIQUETA + cdTelevenda ;\n");
      out.write("    \tconsole.log(\"url servico verificar impressao etiqueta = \" + url);\n");
      out.write("    \t$j.ajax({\n");
      out.write("    \t    type: 'GET',\n");
      out.write("    \t    url: url,\n");
      out.write("    \t    dataType: 'text',\n");
      out.write("            cache: false,\n");
      out.write("    \t    success: function (ret) {\n");
      out.write("    \t       var prontaImpressao = ret;\n");
      out.write("    \t       if(prontaImpressao == \"true\"){\n");
      out.write("    \t    \t   exibirBtnEtiqueta(cdTelevenda);\n");
      out.write("    \t       }\n");
      out.write("    \t    },error: function (jqXHR, exception) {\n");
      out.write("    \t    \treturn false;\n");
      out.write("    \t        console.log(\"Erro ao verificar Impressa Etiqueta \" + jqXHR.status);\n");
      out.write("    \t    }\n");
      out.write("    \t});\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\t$(document).ready(function () {\n");
      out.write("\t\tccIntializer.initialize();\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\"#btnExpandirEmProcesamento\").click(function () {\n");
      out.write("            $(\"#tbl_em_processamento\").toggle();\n");
      out.write("            var x = document.getElementById(\"btnExpandirEmProcesamento\");\n");
      out.write("\t\t\tif ( x.value === \"Mais detalhes\") {\n");
      out.write("\t\t\t\tx.className = \"btnExpandirEmProcesamentoMinus\";\n");
      out.write("\t\t\t\tx.value = \"Menos detalhes\";\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tx.value = \"Mais detalhes\";\n");
      out.write("\t\t\t\tx.className = \"btnExpandirEmProcesamentoPlus\";\n");
      out.write("\t\t\t}\n");
      out.write("            // getHistorico(idReserva);\n");
      out.write("            // formatDescPedido(idReserva);\n");
      out.write("            // if(cdTelevenda != undefined){\n");
      out.write("            //     verificarBtnImprimirEtiqueta(cdTelevenda);\n");
      out.write("            // }\n");
      out.write("        });\n");
      out.write("        // Formata??o de Tarja para Medicamento Controlado - C&C\n");
      out.write("        // ccIntializer.initialize();\n");
      out.write("        // Bloqueia o botao \"enter\"\n");
      out.write("        document.onkeypress = stopEnterKey;\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $(\"#btnExpandirPendencias\").click(function () {\n");
      out.write("            $(\"#tbl_pendencias\").toggle();\n");
      out.write("            var x = document.getElementById(\"btnExpandirPendencias\");\n");
      out.write("\t\t\tif ( x.value === \"Mais detalhes\") {\n");
      out.write("\t\t\t\tx.className = \"btnExpandirPendenciasMinus\";\n");
      out.write("\t\t\t\tx.value = \"Menos detalhes\";\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tx.value = \"Mais detalhes\";\n");
      out.write("\t\t\t\tx.className = \"btnExpandirPendenciasPlus\";\n");
      out.write("\t\t\t}\n");
      out.write("            // getHistorico(idReserva);\n");
      out.write("            // formatDescPedido(idReserva);\n");
      out.write("            // if(cdTelevenda != undefined){\n");
      out.write("            //     verificarBtnImprimirEtiqueta(cdTelevenda);\n");
      out.write("            // }\n");
      out.write("        });\n");
      out.write("        // Formata??o de Tarja para Medicamento Controlado - C&C\n");
      out.write("        // ccIntializer.initialize();\n");
      out.write("        // Bloqueia o botao \"enter\"\n");
      out.write("        document.onkeypress = stopEnterKey;\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f14(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f21(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f24(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f29(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<h2 class=\"titlePage\">Em processamento</h2>\n");
      out.write("<div class=\"divPrincipalEmProcessamento\">\n");
      out.write("\t<div class=\"divEmProcessamento\">\n");
      out.write("\t\t<input class=\"btnExpandirEmProcesamentoPlus\" id=\"btnExpandirEmProcesamento\" type=\"button\" value=\"Mais detalhes\"/>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div>\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t<table class=\"tbEmProcessamento\" id=\"tbl_em_processamento\" style=\"display: none\">\n");
      out.write("\t\t\t\t<tr class=\"firstLine\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f33(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f34(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f24(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div>\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td style=\"width: 79%;\"><h3 class=\"titlePage\">Separar e faturar</h3></td>\n");
      out.write("\t\t\t<td><input type=\"text\" class=\"buscaPorId\" id=\"buscaPorNrPedidoEmSeparacao\" placeholder=\"Pesquisa pelo número do pedido\" onkeypress=\"whenEnterPress(event, buscaStatusAguardandoSeparacaoPorPedido)\"/></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</div>\n");
      out.write("<div class=\"divPrincipalEmProcessamento\">\n");
      out.write("\t<div>\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t<table class=\"tbEmProcessamento\">\n");
      out.write("\t\t\t\t<table class=\"tbEmProcessamento\" id=\"tbl_em_processamento\">\n");
      out.write("\t\t\t\t<tr class=\"firstLineDivSecundaria\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f35(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f36(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f25(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div class=\"divMae\">\n");
      out.write("\t<div class=\"divSecundariaTitle\">Pedidos aguardando o cliente (C&R)</div>\n");
      out.write("\t<div><input type=\"text\" class=\"divSecundariaTitle < buscaPorId\" id=\"buscaPorNrPedidoAguardandoEntrega\" placeholder=\"Pesquisa pelo número do pedido\" onkeypress=\"whenEnterPress(event, buscaStatusAguardandoRetiradaPorPedido)\"/></div>\n");
      out.write("\t<div class=\"divSecundariaLateralTitle\">Pedidos aguardando despacho (MP)</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"divMae\">\n");
      out.write("\t<div class=\"divSecundaria\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fset_005f7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t<table class=\"tbEmProcessamento\" cellpadding=\"10\">\n");
      out.write("\t\t\t\t<tr class=\"firstLineDivSecundaria\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f37(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f38(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f26(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t<tr></tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fset_005f11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"divSecundariaLateral\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fset_005f12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t<table class=\"tbEmProcessamento\" cellpadding=\"17\">\n");
      out.write("\t\t\t\t<tr class=\"firstLineDivSecundaria\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f39(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f40(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f27(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f41(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fset_005f13(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<div>\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td style=\"width: 79%;\"><h3 class=\"titlePage\">Lotes Aguardando Despacho</h3></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</div>\n");
      out.write("<div class=\"divPrincipalEmProcessamento\">\n");
      out.write("\t<div>\n");
      out.write("\t\t<table class=\"tbEmProcessamento\" id=\"tbl_lotes_despachos\">\n");
      out.write("\t\t\t<tr class=\"firstLine\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f42(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f43(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f28(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<h2 class=\"titlePage\">Pendências</h2>\n");
      out.write("<div class=\"divPrincipalEmProcessamento\">\n");
      out.write("\t<div class=\"divEmProcessamento\">\n");
      out.write("\t\t<input class=\"btnExpandirPendenciasPlus\" id=\"btnExpandirPendencias\" type=\"button\" value=\"Mais detalhes\"/>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div>\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<table class=\"tbEmProcessamento\" id=\"tbl_pendencias\" style=\"display: none\">\n");
      out.write("\t\t\t<tr class=\"firstLine\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f44(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f45(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f29(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f15(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- DIALOG - IMPRIMIR COMPROVANTE DE SEPARACAO -->\n");
      out.write("<div id=\"idDialogImprimirEtiqueta\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("\" alt=\"Imprimir etiqueta\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span>Enviando etiqueta para impressão...</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"idDialogLoteDespachado\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img style=\"margin-left: auto; margin-right: auto;\" src=\"");
      if (_jspx_meth_c_005furl_005f10(_jspx_page_context))
        return;
      out.write("\" alt=\"Imprimir etiqueta\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span id=\"msgDialogLoteDespachado\"></span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- DIALOG - CONFIRMAR SEPARACAO COM SUCESSO -->\n");
      out.write("<div id=\"idDialogCancelarPedido\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f11(_jspx_page_context))
        return;
      out.write("\" alt=\"Cancelar pedido\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-separa-pedido\">\n");
      out.write("\t\t<span>O pedido todo será CANCELADO confirmar cancelamento do pedido?</span></br>\n");
      out.write("\t\t<h1 class=\"cr-h1-combo-cancelamento\">Selecione um motivo:</h1>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<select id=\"cmdMotivoCancPed\" name=\"cmdMotivoCancPed\" class=\"wrapped cmdMotivoCancPed\"></select>\n");
      out.write("\t\t\t<textarea id=\"txtAreaMotivoCancel\" placeholder=\"Observa&ccedil;&atilde;o:\" rows=\"4\" cols=\"50\" maxlength=\"160\"></textarea>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- DIALOG - ERRO CANCELAMENTO -->\n");
      out.write("<div id=\"idDialogErroCancelaPedido\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f12(_jspx_page_context))
        return;
      out.write("\" alt=\"Cancelar pedido\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-separa-pedido\">\n");
      out.write("\t\t<span>Erro ao atualizar o status para cancelado no ecommerce.</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- DIALOG - CONFIRMAR CANCELADO - FINALIZACAO -->\n");
      out.write("<div id=\"idDialogSucessoCancelaPedido\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f13(_jspx_page_context))
        return;
      out.write("\" alt=\"Cancelar pedido\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-separa-pedido\">\n");
      out.write("\t\t<span>Pedido CANCELADO com sucesso!</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- DIALOG - CONFIRMAR SEPARACAO -->\n");
      out.write("<div id=\"idDialogConfirmarSeparacao\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f14(_jspx_page_context))
        return;
      out.write("\" alt=\"Confirmar separação\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-separa-pedido\">\n");
      out.write("\t\t<span>Deseja confirmar a separação do pedido?</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- DIALOG - CONFIRMAR ENTREGA PARCIAL -->\n");
      out.write("<div id=\"idDialogConfirmarSeparacaoParcial\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f15(_jspx_page_context))
        return;
      out.write("\" alt=\"Confirmar separação parcial\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-separa-pedido\">\n");
      out.write("\t\t<span>Este pedido está <b>parcialmente</b> completo,</span></br>\n");
      out.write("\t\t<span>deseja confirmar a separação mesmo assim?</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- DIALOG - CONFIRMAR SEPARACAO COM SUCESSO -->\n");
      out.write("<div id=\"idDialogSucessoConfirmarSeparacao\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f16(_jspx_page_context))
        return;
      out.write("\" alt=\"Confirmar entrega\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span>Pedido separado com sucesso!</span></br>\n");
      out.write("\t\t<span>Novo status do pedido:</span></br>\n");
      out.write("\t\t<h1 class=\"cc-h1-dialog-sucess\">AGUARDANDO A RETIRADA DO CLIENTE</h1>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- DIALOG - CONFIRMAR SEPARACAO COM SUCESSO -->\n");
      out.write("<div id=\"idDialogSucessoConfirmarSeparacaoNovo\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f17(_jspx_page_context))
        return;
      out.write("\" alt=\"Confirmar entrega\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span>Pedido separado com sucesso!</span></br>\n");
      out.write("\t\t<span>Novo status do pedido:</span></br>\n");
      out.write("\t\t<h1 class=\"cc-h1-dialog-sucess\">Pedido emitindo Nota fiscal após a conclusão irá para pedido aguardando o cliente (retirada)</h1>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- DIALOG - ERRO AO CONFIRMAR SEPARACAO -->\n");
      out.write("<div id=\"idDialogErroConfirmarSeparacao\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f18(_jspx_page_context))
        return;
      out.write("\" alt=\"Erro na separação do pedido\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span>Erro na separação do pedido!</span></br>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- DIALOG - VAL. RECEITA -->\n");
      out.write("<div id=\"idDialogValidaReceita\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"cc-receita-carimbo\">\n");
      out.write("\t\t<h2>O Pedido contém medicamento controlado</h2>\n");
      out.write("\t\t<span>Por favor valide a receita para concluir a entrega</span>\n");
      out.write("\t</div>\n");
      out.write("\t<h1>Receita Carimbo</h1>\n");
      out.write("\t");
      if (_jspx_meth_c_005fchoose_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<div style=\"margin-left: 0px;\" align=\"center\">\n");
      out.write("\t\t<fieldset>\n");
      out.write("\t\t\t<ol class=\"form\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"nrEtiqueta\" id=\"nrEtiqueta\" style=\"display: none\"/>\n");
      out.write("\t\t\t\t\t<label class=\"label120\" style=\"width:85px;text-align: left\" for=\"txtNome\">Nome:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtNome\" id=\"txtNome\" size=\"28\" maxlength=\"70\" />\n");
      out.write("\t\t\t\t\t<label class=\"label20\" style=\"width:30px;text-align: left\" for=\"numRg\">RG:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"numRg\" id=\"numRg\" onKeyPress=\"Mascara(this,Rg);\" size=\"10\" maxlength=\"12\" minlength= \"10\" />\n");
      out.write("\t\t\t\t\t<label class=\"label60\" style=\"text-align: left\" for=\"ufRg\">Emissor:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"ufRg\" id=\"ufRg\" size=\"4\" maxlength=\"8\"/>\n");
      out.write("\t\t\t\t\t<label class=\"label60\" style=\"text-align: left\" for=\"dtNasc\">Dt Nasc:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"dtNasc\" id=\"dtNasc\" onKeyPress=\"Mascara(this,Data);\" size=\"8\" maxlength=\"10\" />\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<label class=\"label60\" style=\"width:85px;text-align: left\" for=\"numCep\">CEP:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" style=\"text-align: left\" name=\"numCep\" id=\"numCep\" onkeyup=\"Mascara(this,Integer);\" onKeyPress=\"Mascara(this,Cep); whenEnterExec(event, buscaNovoCep);\"\n");
      out.write("\t\t\t\t\t\t   onblur=\"buscaNovoCep();\" size=\"5\" maxlength=\"9\" minlength= \"9\"/>\n");
      out.write("\t\t\t\t\t<label class=\"label80\" for=\"txtLogra\">Endereço:</label>\n");
      out.write("\t\t\t\t\t<input\ttype=\"text\" name=\"txtLogra\" id=\"txtLogra\" size=\"30\" maxlength=\"60\" />\n");
      out.write("\t\t\t\t\t<label class=\"label60\" style=\"text-align: left\" for=\"numNumero\">Número:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" style=\"text-align: left\" name=\"numNumero\" id=\"numNumero\" onKeyPress=\"Mascara(this,Integer);\" size=\"5\" maxlength=\"6\" />\n");
      out.write("\t\t\t\t\t<label class=\"label40\" for=\"txtComplemento\">Compl:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtComplemento\" id=\"txtComplemento\" size=\"5\" maxlength=\"40\" value=\"Add\"/>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<label class=\"label120\" style=\"width:85px;text-align: left\" for=\"txtBairro\">Bairro:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtBairro\" id=\"txtBairro\" size=\"25\" maxlength=\"20\" />\n");
      out.write("\t\t\t\t\t<label class=\"label60\"  for=\"txtCidade\">Cidade:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtCidade\" id=\"txtCidade\" size=\"31\" maxlength=\"30\" />\n");
      out.write("\t\t\t\t\t<label class=\"label20\" style=\"text-align: left\" for=\"txtUf\">UF:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtUf\" id=\"txtUf\" size=\"3\" maxlength=\"2\" />\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<label class=\"label120\" style=\"width:85px;text-align: left\" for=\"numTpFone\">Contato:</label>\n");
      out.write("\t\t\t\t\t<select  id=\"numTpFone\" name=\"numTpFone\">\n");
      out.write("\t\t\t\t\t\t<option value=\"0\"></option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">RESIDENCIAL</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">COMERCIAL</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">CELULAR</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t<label class=\"label40\" style=\"text-align: right;\" for=\"numDDD\">DDD:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" style=\"text-align: right;\" name=\"numDDD\" id=\"numDDD\" onKeyPress=\"Mascara(this,Integer);\" size=\"2\" maxlength=\"2\" minlength= \"2\" />\n");
      out.write("\t\t\t\t\t<label class=\"label60\" for=\"numTel\">Telefone:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" style=\"text-align: left\" name=\"numTel\" id=\"numTel\" onKeyPress=\"Mascara(this, Telefone);\"size=\"15\" maxlength=\"10\" minlength= \"8\" />\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<label class=\"label120\" style=\"width:85px;text-align: left\" for=\"txtCRM\">CRM:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtCRM\" id=\"txtCRM\" size=\"10\" maxlength=\"6\" />\n");
      out.write("\t\t\t\t\t<label class=\"label60\" style=\"text-align: left\" for=\"txtUfCrm\">UF CRM:</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"txtUfCrm\" id=\"txtUfCrm\" size=\"3\" maxlength=\"2\" />\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<label class=\"label120\" style=\"width:85px;text-align: left\" for=\"txtProd\">Produto:</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" onkeypress=\"whenEnterExec(event, buscar)\" maxlength=\"18\" onkeyup=\"Mascara(this,Integer);\" name=\"txtProd\" id=\"txtProd\" class=\"miniInput2\">\n");
      out.write("\t\t\t\t\t\t<!-- <label class=label20 style=\"MARGIN-BOTTOM: -5px; PADDING-LEFT: 5px\">\n");
      out.write("                            <input type=\"button\" onclick=\"buscar()\" class=\"buttonSearchProduto\" id=\"buttonProdutoCC\" style=\"display: inline;\">\n");
      out.write("                        </label> -->\n");
      out.write("\t\t\t\t\t\t<button class=\"cc-btn-custom-default btn-size-default ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"buttonProdutoCC\" role=\"button\" aria-disabled=\"false\" type=\"button\" onClick=\"buscar();\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ui-button-text\" style=\"height: auto; width: auto; padding: 4px 15px 3px 15px !important;\">Add</span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<label class=\"label120\" style=\"width:85px;text-align: left;\" for=\"txtMed\">Medicamento</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"txtMed\" id=\"txtMed\" size=\"97\" maxlength=\"90\" disabled=\"disabled\"/>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"label120\" style=\"width:90px;text-align: left\" for=\"txtMs\">MS:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"txtMs\" id=\"txtMs\" size=\"13\" maxlength=\"20\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"label40\" style=\"text-align: left\" for=\"txtLote\">Lote:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"txtLote\" id=\"txtLote\" size=\"14\" maxlength=\"15\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"label60\" style=\"text-align: left\" for=\"txtVal\">Validade:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"txtVal\" id=\"txtVal\" onKeyPress=\"Mascara(this, DataMmYyyy);\" size=\"6\" maxlength=\"7\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"label40\" style=\"text-align: left\" for=\"txtQtd\">Qtd.:</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"txtQtd\" id=\"txtQtd\" size=\"3\" onKeyPress=\"Mascara(this,Integer);\" maxlength=\"02\" />+\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"txtCat\" id=\"txtCat\" size=\"04\" maxlength=\"04\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"txtEan\" id=\"txtEan\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"txtCodProduto\" id=\"txtCodProduto\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <input id=\"addBut\" type=\"button\" value=\"Inserir\" class=\"buttonAddProduto\" onClick=\"addRow();\"/> -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"cc-btn-custom-red btn-size-default ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"addBut\" role=\"button\" aria-disabled=\"false\" type=\"button\" onClick=\"addRow();\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"ui-button-text\" style=\"height: auto; width: auto; padding: 4px 15px 4px 15px !important;\">Inserir</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t<!--  <input id=\"addBut\" type=\"button\" value=\"Inserir\" class=\"buttonAdd\" onClick=\"addRow();\"/> -->\n");
      out.write("\t\t\t\t\t<table align=\"left\" width=\"100%\" id=\"tabelaDetalhe\" class=\"cc-receita-item-produto\">\n");
      out.write("\t\t\t\t\t\t<tr class=\"cabecalhoTabela\">\n");
      out.write("\t\t\t\t\t\t\t<th width=\"10%\" align=\"left\"><b>Produto</b></th>\n");
      out.write("\t\t\t\t\t\t\t<th width=\"40%\" align=\"left\"><b>Medicamento</b></th>\n");
      out.write("\t\t\t\t\t\t\t<th width=\"5%\" align=\"left\"><b>Cat</b></th>\n");
      out.write("\t\t\t\t\t\t\t<th width=\"15%\" align=\"left\"><b>MS</b></th>\n");
      out.write("\t\t\t\t\t\t\t<th width=\"15%\" align=\"left\"><b>Lote</b></th>\n");
      out.write("\t\t\t\t\t\t\t<th width=\"15%\" align=\"left\"><b>Validade</b></th>\n");
      out.write("\t\t\t\t\t\t\t<th width=\"5%\" align=\"left\"><b>Qtd</b></th>\n");
      out.write("\t\t\t\t\t\t\t<th></th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr class=\"linhaTabela\">\n");
      out.write("\t\t\t\t\t\t\t<td width=\"10%\" align=\"left\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td width=\"40%\" align=\"left\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td width=\"5%\" align=\"left\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td width=\"15%\" align=\"left\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td width=\"15%\" align=\"left\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td width=\"15%\" align=\"left\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td width=\"5%\" align=\"left\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</fieldset>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- FIM - RECEITA CONTROLADA -->\n");
      out.write("\n");
      out.write("<!-- DIALOG - INFO RECEITA -->\n");
      out.write("<div id=\"idDialogVisualizaReceitaNovo\" class=\"dialog\" style=\"display:none\"></div>\n");
      out.write("\n");
      out.write("<!-- DIALOG - CONFIRMAR ENTREGA -->\n");
      out.write("<div id=\"idDialogRetiradaPedido\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f19(_jspx_page_context))
        return;
      out.write("\" alt=\"Confirmar entrega\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span><b>Confirmar entrega</b> do pedido para o cliente?</span></br>\n");
      out.write("\t\t<span>A oferta Exclusiva será impressa automaticamente.</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"idReloadPedidos\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f20(_jspx_page_context))
        return;
      out.write("\" alt=\"Reload\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span>Aguarde a atualização dos pedidos...</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"idReceitaRecebida\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span>Receita Recebida com sucesso</span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"idDialogReceitaConfirmada\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f21(_jspx_page_context))
        return;
      out.write("\" alt=\"Confirmar entrega\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span>Receita Aprovada</span></br>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"idDialogFalarComSuporte\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f22(_jspx_page_context))
        return;
      out.write("\" alt=\"Support\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span id=\"msgDialogFalarComSuporte\"></span>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"idDialogConfirmarEntregaClienteComSucesso\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f23(_jspx_page_context))
        return;
      out.write("\" alt=\"Confirmar entrega\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span>Pedido entregue com sucesso!</span></br>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"idDialogConfirmarReceita\" class=\"dialog\" style=\"display: none\">\n");
      out.write("\t<div class=\"img-ico-fix-center\" style=\"display: flex; text-align: center; padding-bottom: 15px;\">\n");
      out.write("\t\t<img class=\"img-ico-custom\" src=\"");
      if (_jspx_meth_c_005furl_005f24(_jspx_page_context))
        return;
      out.write("\" alt=\"Confirmar entrega\"/>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"cc-valida-receita\">\n");
      out.write("\t\t<span>Deseja Confirmar a Receita!</span></br>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tfunction addRow() {\n");
      out.write("\tvar prod = $j.trim($j('#txtProd').val());\n");
      out.write("\tvar dsProd = $j.trim($j('#txtMed').val());\n");
      out.write("\tvar ms = $j.trim($j('#txtMs').val());\n");
      out.write("\tvar lote = $j.trim($j('#txtLote').val());\n");
      out.write("\tvar val = $j.trim($j('#txtVal').val());\n");
      out.write("\tvar qtd = $j.trim($j('#txtQtd').val());\n");
      out.write("\tvar cat = $j.trim($j('#txtCat').val());\n");
      out.write("\tvar ean = $j.trim($j('#txtEan').val());\n");
      out.write("\tvar cdProd = $j.trim($j('#txtCodProduto').val());\n");
      out.write("\n");
      out.write("\tif(ms ==='' || lote === '' || val === ''|| qtd === '' || qtd <= 0 || prod === ''|| dsProd === ''){\n");
      out.write("\tjAlert('Preencha os Campos Obrigatórios.', \"Receita Carimbo\");\n");
      out.write("\treturn;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tif(isNaN(ms)){\n");
      out.write("\tjAlert('O Campo MS só aceita números.',\"Receita Carimbo\");\n");
      out.write("\treturn;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tvar str = val.split(\"/\");\n");
      out.write("\n");
      out.write("\tif ((str[0] <= 0 || str[0] > 12 ) || (str[1] < 2010 || str[1] > 2100 ) || (val.length<7)) {\n");
      out.write("\tjAlert('Data de validade inválida.',\"Receita Carimbo\");\n");
      out.write("\treturn;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tdataMenosUmMes = subtrairMes(val);\n");
      out.write("\tdataMenosDoisMeses = subtrairMes(dataMenosUmMes);\n");
      out.write("\tdataAtual = new Date();\n");
      out.write("\tmesAtual = String(dataAtual.getMonth()+1);\n");
      out.write("\tif (mesAtual.length==1) {\n");
      out.write("\tmesAtual=\"0\"+mesAtual;\n");
      out.write("\t}\n");
      out.write("\tdataAtualForm = mesAtual+\"/\"+dataAtual.getFullYear();\n");
      out.write("\n");
      out.write("\tvar mesSelecionado = val.substring(0, 2);\n");
      out.write("\tvar anoSelecionado = val.substring(3, 8);\n");
      out.write("\tvar dataVenc       = new Date(anoSelecionado, mesSelecionado);\n");
      out.write("\n");
      out.write("\tif(dataVenc < dataAtual){\n");
      out.write("\tjAlert('ATENÇÃO! Este item está com a validade vencida', \"Receita Carimbo\");\n");
      out.write("\treturn;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tif (val.split(\"/\")[1]<dataAtualForm.split(\"/\")[1]) {\n");
      out.write("\tjAlert('ATENÇÃO! Este item está com a validade em \\\"'+dataString(val.split(\"/\")[0])+' de '+val.split(\"/\")[1]+'\\\". ',\"Receita Carimbo\");\n");
      out.write("\t} else {\n");
      out.write("\tif (val.split(\"/\")[1]==dataAtualForm.split(\"/\")[1]) {\n");
      out.write("\tif (val.split(\"/\")[0]<=dataAtualForm.split(\"/\")[0]) {\n");
      out.write("\tjAlert('ATENÇÃO! Este item está com a validade em \\\"'+dataString(val.split(\"/\")[0])+' de '+val.split(\"/\")[1]+'\\\". ',\"Receita Carimbo\");\n");
      out.write("\t}\n");
      out.write("\t}\n");
      out.write("\t}\n");
      out.write("\tif (dataAtualForm==dataMenosUmMes||dataAtualForm==dataMenosDoisMeses) {\n");
      out.write("\tjAlert('ATENÇÃO! Este item está com a validade em \\\"'+dataString(val.split(\"/\")[0])+' de '+val.split(\"/\")[1]+'\\\". ',\"Receita Carimbo\");\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tvar tbl = document.getElementById(\"tabelaDetalhe\");\n");
      out.write("\tvar id = tbl.rows.length;\n");
      out.write("\tvar line = tbl.insertRow(-1);\n");
      out.write("\tvar cell;\n");
      out.write("\n");
      out.write("\tline.className = (id % 2 == 0) ? 'oddRow' : 'evenRow';\n");
      out.write("\tline.id = \"row_\"+id;\n");
      out.write("\n");
      out.write("\tcell = line.insertCell(0);\n");
      out.write("\tcell.align = \"left\";\n");
      out.write("\tcell.innerHTML = prod;\n");
      out.write("\n");
      out.write("\tcell = line.insertCell(1);\n");
      out.write("\tcell.align = \"left\";\n");
      out.write("\tcell.innerHTML = dsProd;\n");
      out.write("\n");
      out.write("\tcell = line.insertCell(2);\n");
      out.write("\tcell.align = \"left\";\n");
      out.write("\tcell.innerHTML = cat + \"<div style='display:none'>\"+ean+\"</div>\" + \"<div style='display:none'>\"+cdProd+\"</div>\";\n");
      out.write("\n");
      out.write("\tcell = line.insertCell(3);\n");
      out.write("\tcell.align = \"left\";\n");
      out.write("\tcell.innerHTML = ms;\n");
      out.write("\n");
      out.write("\tcell = line.insertCell(4);\n");
      out.write("\tcell.align = \"left\";\n");
      out.write("\tcell.innerHTML = lote.toUpperCase();\n");
      out.write("\n");
      out.write("\tcell = line.insertCell(5);\n");
      out.write("\tcell.align = \"left\";\n");
      out.write("\tcell.innerHTML = val;\n");
      out.write("\n");
      out.write("\tcell = line.insertCell(6);\n");
      out.write("\tcell.align = \"left\";\n");
      out.write("\tcell.innerHTML = qtd;\n");
      out.write("\n");
      out.write("\tcell = line.insertCell(7);\n");
      out.write("\tcell.align = \"left\";\n");
      out.write("\tcell.innerHTML = '<span class=\"alteraCursor\" onclick=\"remRow('+id+');\"><img src=\"");
      if (_jspx_meth_c_005furl_005f25(_jspx_page_context))
        return;
      out.write("/images/xbox.png\"/></span>';\n");
      out.write("\n");
      out.write("\t$j('#txtLote').val('');\n");
      out.write("\t$j('#txtVal').val('');\n");
      out.write("\t$j('#txtQtd').val('');\n");
      out.write("\t$j('#txtProd').val('');\n");
      out.write("\t$j('#txtMed').val('');\n");
      out.write("\t$j('#txtMs').val('');\n");
      out.write("\t$j('#txtCat').val('');\n");
      out.write("\t$j('#txtEan').val('');\n");
      out.write("}\n");
      out.write("</script>");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(6,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(7,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(7,67) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(8,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/js/script-tc30.js");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(9,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/js/script-compre-retire.js");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(10,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/js/script-tc-servicos.js");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(11,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/js/script-micro-polo.js");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(12,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/js/script-autorizador-microservice.js");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(13,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f7.setValue("/js/dialogosCompreRetire-MicroPolo.js");
    int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
    if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(14,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f8.setValue("/js/FileSaver.js");
    int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
    if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
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
        out.write('	');
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(17,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty operadorVO}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<script>\n");
        out.write("\t\t\toperadorVO = {cdOperador : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operadorVO.cdOperador}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(", nmOperador: '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operadorVO.nmOperador}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'};\n");
        out.write("\t   </script>\n");
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
        out.write("\t\t<script>\n");
        out.write("\t\t\toperadorVO = getAtendente();\n");
        out.write("\t   </script>\n");
        out.write("\t");
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

  private boolean _jspx_meth_c_005fchoose_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent(null);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write('	');
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write('\n');
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(29,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty filial}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<script>\n");
        out.write("\t\t\tfilialTc = {cdFilial : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filial.cdFilial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(", logoMarca: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filial.logoMarca}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("};\n");
        out.write("\t\t\tsetFilialLogomarca(filialTc.cdFilial);\n");
        out.write("\t\t\tcdLogoMarca = getFilialLogomarca(filialTc.cdFilial);\n");
        out.write("\t\t\tfilialTc.logoMarca = cdLogoMarca;\n");
        out.write("\t   </script>\n");
        out.write("\t");
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
        out.write("\t\t<script>\n");
        out.write("\t\t\tfilialTc = getFilialLogada();\n");
        out.write("\t   </script>\n");
        out.write("\t");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(43,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaVersaoOrderPriority}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<script>lojaVersaoOrderPriority = true;</script>");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(55,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty listaDeReservas}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\tjsonDataReservas = {\n");
        out.write("\t\t  \t ");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t    };\n");
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(57,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(57,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(57,6) '${listaDeReservas}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaDeReservas}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(57,6) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("statusReserva");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t    \t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" : {\n");
          out.write("\t\t    \tcdOperador : operadorVO.cdOperador,\n");
          out.write("\t\t    \tnrAutorizacao : 0,\n");
          out.write("\t\t    \tcdFilialNfe : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filial.cdFilial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t    \ttipoNF : 0,\n");
          out.write("\t\t\t    reserva : {\n");
          out.write("\t\t\t\t    cdFilial : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filial.cdFilial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t    idReserva : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t    idCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t    cdReservaOrigem : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\tcdStatusReserva : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.statusReserva.cdStatusReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\tcdTelevenda : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\tcdFluxo : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\titens : [");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("]\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t  }\n");
          out.write("\t\t\t  }");
          if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/crSepararFaturar.jsp(71,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("item");
    // /WEB-INF/jsp/crSepararFaturar.jsp(71,14) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(71,14) '${reserva.reservaProdutoAppItens}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.reservaProdutoAppItens}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(71,14) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("statusItem");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\tidReserva : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tcdProduto : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.produto.codProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tqtItens : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.qtItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tqtItensDisponivel : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.qtItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tvlTotalItens : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.vlTotalItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tvlUnitario : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.vlUnitario}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tcodTarja : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.produto.codTarja}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tdescricaoDet : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.produto.descricaoDet}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/crSepararFaturar.jsp(81,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusItem.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/crSepararFaturar.jsp(83,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.controlado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(",itensIncor : [\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f2(_jspx_th_c_005fif_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("]\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /WEB-INF/jsp/crSepararFaturar.jsp(84,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("itensIncor");
    // /WEB-INF/jsp/crSepararFaturar.jsp(84,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(84,7) '${reserva.reservaProdutoAppItens}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.reservaProdutoAppItens}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(84,7) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVarStatus("statusItemIncor");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\tnrNfItem : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusItemIncor.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tqtItem : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itensIncor.qtItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tcdProduto : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itensIncor.produto.codProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tvlUnitario : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itensIncor.vlUnitario}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tnrLoteItemCompl : \"0\",\n");
          out.write("\t\t\t\t\t\t\t\t\tcodTarja : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itensIncor.produto.codTarja}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/jsp/crSepararFaturar.jsp(92,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusItemIncor.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/crSepararFaturar.jsp(96,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReserva.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /WEB-INF/jsp/crSepararFaturar.jsp(100,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(100,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(100,2) '${listaDeReservas}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaDeReservas}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(100,2) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write('\n');
          out.write('	');
          out.write('	');
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/jsp/crSepararFaturar.jsp(101,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty reserva.omsAnotacoes}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f4(_jspx_th_c_005fif_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /WEB-INF/jsp/crSepararFaturar.jsp(102,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("anotacao");
    // /WEB-INF/jsp/crSepararFaturar.jsp(102,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(102,4) '${reserva.omsAnotacoes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.omsAnotacoes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f7(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write("\n");
          out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    // /WEB-INF/jsp/crSepararFaturar.jsp(103,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty anotacao}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\tvar anotacao = {\n");
        out.write("\t\t\t\t\t\t\tidReserva: \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\",\n");
        out.write("\t\t\t\t\t\t\tcdTelevenda: \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anotacao.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\",\n");
        out.write("\t\t\t\t\t\t\tcdAnotacao: \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anotacao.cdAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\",\n");
        out.write("\t\t\t\t\t\t\tdsAnotacao: \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anotacao.dsAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\",\n");
        out.write("\t\t\t\t\t\t\tdsMensagem: \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${anotacao.dsMensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\n");
        out.write("\t\t\t\t\t\t};\n");
        out.write("\t\t\t\t\t\tomsAnotacoes.push(anotacao);\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/jsp/crSepararFaturar.jsp(115,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty reserva.cliente.telefones}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t        \t");
        if (_jspx_meth_c_005fforEach_005f5(_jspx_th_c_005fif_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write("\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /WEB-INF/jsp/crSepararFaturar.jsp(116,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVar("telefone");
    // /WEB-INF/jsp/crSepararFaturar.jsp(116,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(116,10) '${reserva.cliente.telefones}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.cliente.telefones}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(116,10) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\tvar telefone = {\n");
          out.write("\t\t\t\t\t\tidReserva: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tidCliente: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnrPrefixo: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnrTelefone: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdTipoTelefone: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.cdTipoTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t};\n");
          out.write("\t\t\t\t\tlistaTelefonesCliente.push(telefone);\n");
          out.write("\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(499,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty listaAguardandoSeparacao}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\tlistaAguardandoSeparacao =\n");
        out.write("\t\t{\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fforEach_005f6(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t};\n");
        out.write("\t");
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

  private boolean _jspx_meth_c_005fforEach_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /WEB-INF/jsp/crSepararFaturar.jsp(502,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(502,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(502,3) '${listaAguardandoSeparacao}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaAguardandoSeparacao}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(502,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setVarStatus("statusReserva");
    int[] _jspx_push_body_count_c_005fforEach_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f6 = _jspx_th_c_005fforEach_005f6.doStartTag();
      if (_jspx_eval_c_005fforEach_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" :\n");
          out.write("\t\t\t{\n");
          out.write("\t\t\t\tidReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdFilial:filialTc.cdFilial,\n");
          out.write("\t\t\t\tdtReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdtPrazoRetirada:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtPrazoRetirada}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdOperador:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdOperador}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdtAtualizacao:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtAtualizacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdsReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tnrPedido:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tidNF:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idNF}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdtEmissaoNf:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtEmissaoNf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tnrCnpjFilial:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrCnpjFilial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdtReservaDate:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReservaDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcontrolado:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.controlado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdFluxo:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdsFluxo:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdStatusTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdsStatusTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdChaveAcessoNfe:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdChaveAcessoNfe}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdOrigemTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdOrigemTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tnmServEnt:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmServEnt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\titemVazio:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.itemVazio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tnmServEnt : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmServEnt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\titemVazio : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.itemVazio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdStatusReserva : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.statusReserva.cdStatusReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdsReservaStatus : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.statusReserva.dsReservaStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\treservaProdutoAppItens:\n");
          out.write("\t\t\t\t[\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f7(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write("\n");
          out.write("\t\t\t\t],\n");
          out.write("\t\t\t\tomsAnotacoes :\n");
          out.write("\t\t\t\t[\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f8(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write("\n");
          out.write("\t\t\t\t],\n");
          out.write("\t\t\t\tcliente :\n");
          out.write("\t\t\t\t[\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tnome : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcpf : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\trg : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.rg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tddd : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.ddd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\temail : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\ttelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.telefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcelular : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.celular}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcpfComMascara : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpfComMascara}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnomeFormatado : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nomeFormatado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\ttelefones :\n");
          out.write("\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f9(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t]\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t]\n");
          out.write("\t\t\t}");
          if (_jspx_meth_c_005fif_005f13(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write("\n");
          out.write("\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    // /WEB-INF/jsp/crSepararFaturar.jsp(534,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setVar("reservaProdutoAppItens");
    // /WEB-INF/jsp/crSepararFaturar.jsp(534,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(534,4) '${reserva.reservaProdutoAppItens}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.reservaProdutoAppItens}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(534,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setVarStatus("statusReservaProduto");
    int[] _jspx_push_body_count_c_005fforEach_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f7 = _jspx_th_c_005fforEach_005f7.doStartTag();
      if (_jspx_eval_c_005fforEach_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tqtItens : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.qtItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tqtItensDisponivel : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.qtItensDisponivel}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tvlUnitario : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.vlUnitario}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tvlTotalItens : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.vlTotalItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tproduto :\n");
          out.write("\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\tcodProduto : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.codProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tcodEan : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.codEan}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tdescricao : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tdescricaoDet : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.descricaoDet}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tcodTarja : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.codTarja}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t},\n");
          out.write("\t\t\t\t\t\t],\n");
          out.write("\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f10(_jspx_th_c_005fforEach_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f7))
            return true;
          out.write("\n");
          out.write("\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f7);
    // /WEB-INF/jsp/crSepararFaturar.jsp(550,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaProduto.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fforEach_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    // /WEB-INF/jsp/crSepararFaturar.jsp(555,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f8.setVar("omsAnotacoes");
    // /WEB-INF/jsp/crSepararFaturar.jsp(555,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f8.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(555,4) '${reserva.omsAnotacoes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.omsAnotacoes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(555,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f8.setVarStatus("statusReservaOms");
    int[] _jspx_push_body_count_c_005fforEach_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f8 = _jspx_th_c_005fforEach_005f8.doStartTag();
      if (_jspx_eval_c_005fforEach_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tcdTelevenda : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdAnotacao : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.cdAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdsAnotacao : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.dsAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdsMensagem : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.dsMensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f11(_jspx_th_c_005fforEach_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f8))
            return true;
          out.write("\n");
          out.write("\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f8);
    // /WEB-INF/jsp/crSepararFaturar.jsp(561,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaOms.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fforEach_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    // /WEB-INF/jsp/crSepararFaturar.jsp(579,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f9.setVar("telefones");
    // /WEB-INF/jsp/crSepararFaturar.jsp(579,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f9.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(579,6) '${reserva.cliente.telefones}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.cliente.telefones}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(579,6) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f9.setVarStatus("statusReservaTelefone");
    int[] _jspx_push_body_count_c_005fforEach_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f9 = _jspx_th_c_005fforEach_005f9.doStartTag();
      if (_jspx_eval_c_005fforEach_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tnrPrefixo : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tnrTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tcdTipoTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.cdTipoTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f12(_jspx_th_c_005fforEach_005f9, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f9))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f9);
    // /WEB-INF/jsp/crSepararFaturar.jsp(585,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaTelefone.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    // /WEB-INF/jsp/crSepararFaturar.jsp(590,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReserva.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
    if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f14.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(595,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty listaAguardandoRetirada}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\tlistaAguardandoRetirada =\n");
        out.write("\t\t{\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fforEach_005f10(_jspx_th_c_005fif_005f14, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t};\n");
        out.write("\t");
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

  private boolean _jspx_meth_c_005fforEach_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f14);
    // /WEB-INF/jsp/crSepararFaturar.jsp(598,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f10.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(598,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f10.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(598,3) '${listaAguardandoRetirada}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaAguardandoRetirada}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(598,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f10.setVarStatus("statusReserva");
    int[] _jspx_push_body_count_c_005fforEach_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f10 = _jspx_th_c_005fforEach_005f10.doStartTag();
      if (_jspx_eval_c_005fforEach_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" :\n");
          out.write("\t\t\t{\n");
          out.write("\t\t\t\tidReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdFilial:filialTc.cdFilial,\n");
          out.write("\t\t\t\tdtReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdtPrazoRetirada:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtPrazoRetirada}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdOperador:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdOperador}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdtAtualizacao:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtAtualizacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdsReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tnrPedido:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tidNF:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idNF}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdtEmissaoNf:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtEmissaoNf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tnrCnpjFilial:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrCnpjFilial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdtReservaDate:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReservaDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcontrolado:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.controlado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdFluxo:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdsFluxo:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdStatusTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdsStatusTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdChaveAcessoNfe:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdChaveAcessoNfe}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdOrigemTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdOrigemTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tnmServEnt:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmServEnt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\titemVazio:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.itemVazio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tcdStatusReserva : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.statusReserva.cdStatusReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\tdsReservaStatus : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.statusReserva.dsReservaStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\treservaProdutoAppItens:\n");
          out.write("\t\t\t\t[\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f11(_jspx_th_c_005fforEach_005f10, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f10))
            return true;
          out.write("\n");
          out.write("\t\t\t\t],\n");
          out.write("\t\t\t\tomsAnotacoes :\n");
          out.write("\t\t\t\t[\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f13(_jspx_th_c_005fforEach_005f10, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f10))
            return true;
          out.write("\n");
          out.write("\t\t\t\t],\n");
          out.write("\t\t\t\tcliente :\n");
          out.write("\t\t\t\t[\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tnome : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcpf : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\trg : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.rg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tddd : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.ddd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\temail : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\ttelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.telefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcelular : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.celular}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcpfComMascara : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpfComMascara}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnomeFormatado : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nomeFormatado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\ttelefones :\n");
          out.write("\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f14(_jspx_th_c_005fforEach_005f10, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f10))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t]\n");
          out.write("\t\t\t\t\t}\n");
          out.write("\t\t\t\t]\n");
          out.write("\t\t\t}");
          if (_jspx_meth_c_005fif_005f20(_jspx_th_c_005fforEach_005f10, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f10))
            return true;
          out.write("\n");
          out.write("\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f11 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f10);
    // /WEB-INF/jsp/crSepararFaturar.jsp(628,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f11.setVar("reservaProdutoAppItens");
    // /WEB-INF/jsp/crSepararFaturar.jsp(628,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f11.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(628,4) '${reserva.reservaProdutoAppItens}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.reservaProdutoAppItens}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(628,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f11.setVarStatus("statusReservaProduto");
    int[] _jspx_push_body_count_c_005fforEach_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f11 = _jspx_th_c_005fforEach_005f11.doStartTag();
      if (_jspx_eval_c_005fforEach_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tqtItens : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.qtItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tqtItensDisponivel : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.qtItensDisponivel}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tvlUnitario : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.vlUnitario}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tvlTotalItens : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.vlTotalItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f15(_jspx_th_c_005fforEach_005f11, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f11))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\tproduto :\n");
          out.write("\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\tcodProduto : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.codProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tcodEan : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.codEan}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tdescricao : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tdescricaoDet : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.descricaoDet}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tcodTarja : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.codTarja}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t},\n");
          out.write("\t\t\t\t\t\t],\n");
          out.write("\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f17(_jspx_th_c_005fforEach_005f11, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f11))
            return true;
          out.write("\n");
          out.write("\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f11);
    // /WEB-INF/jsp/crSepararFaturar.jsp(634,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.controlado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
    if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("itensIncor :\n");
        out.write("\t\t\t\t\t\t\t[\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f12(_jspx_th_c_005fif_005f15, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f11))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t],\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f12 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f15);
    // /WEB-INF/jsp/crSepararFaturar.jsp(636,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f12.setVar("itensIncor");
    // /WEB-INF/jsp/crSepararFaturar.jsp(636,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f12.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(636,8) '${reserva.reservaProdutoAppItens}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.reservaProdutoAppItens}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(636,8) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f12.setVarStatus("statusItemIncor");
    int[] _jspx_push_body_count_c_005fforEach_005f12 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f12 = _jspx_th_c_005fforEach_005f12.doStartTag();
      if (_jspx_eval_c_005fforEach_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\tnrNfItem : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${statusItemIncor.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tqtItem : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itensIncor.qtItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tcdProduto : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itensIncor.produto.codProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tvlUnitario : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itensIncor.vlUnitario}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tnrLoteItemCompl : \"0\",\n");
          out.write("\t\t\t\t\t\t\t\t\tcodTarja : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${itensIncor.produto.codTarja}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f16(_jspx_th_c_005fforEach_005f12, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f12))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f12);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f12);
    // /WEB-INF/jsp/crSepararFaturar.jsp(644,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusItemIncor.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f11);
    // /WEB-INF/jsp/crSepararFaturar.jsp(658,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaProduto.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
    if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fforEach_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f13 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f10);
    // /WEB-INF/jsp/crSepararFaturar.jsp(663,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f13.setVar("omsAnotacoes");
    // /WEB-INF/jsp/crSepararFaturar.jsp(663,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f13.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(663,4) '${reserva.omsAnotacoes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.omsAnotacoes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(663,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f13.setVarStatus("statusReservaOms");
    int[] _jspx_push_body_count_c_005fforEach_005f13 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f13 = _jspx_th_c_005fforEach_005f13.doStartTag();
      if (_jspx_eval_c_005fforEach_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tcdTelevenda : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdAnotacao : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.cdAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdsAnotacao : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.dsAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdsMensagem : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.dsMensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f18(_jspx_th_c_005fforEach_005f13, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f13))
            return true;
          out.write("\n");
          out.write("\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f13);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f13);
    // /WEB-INF/jsp/crSepararFaturar.jsp(669,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaOms.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f18 = _jspx_th_c_005fif_005f18.doStartTag();
    if (_jspx_eval_c_005fif_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fforEach_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f14 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f10);
    // /WEB-INF/jsp/crSepararFaturar.jsp(687,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f14.setVar("telefones");
    // /WEB-INF/jsp/crSepararFaturar.jsp(687,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f14.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(687,6) '${reserva.cliente.telefones}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.cliente.telefones}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(687,6) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f14.setVarStatus("statusReservaTelefone");
    int[] _jspx_push_body_count_c_005fforEach_005f14 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f14 = _jspx_th_c_005fforEach_005f14.doStartTag();
      if (_jspx_eval_c_005fforEach_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tnrPrefixo : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tnrTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\tcdTipoTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.cdTipoTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f19(_jspx_th_c_005fforEach_005f14, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f14))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f14);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f14, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f14);
    // /WEB-INF/jsp/crSepararFaturar.jsp(693,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaTelefone.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f19 = _jspx_th_c_005fif_005f19.doStartTag();
    if (_jspx_eval_c_005fif_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f10, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f10);
    // /WEB-INF/jsp/crSepararFaturar.jsp(698,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReserva.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f20 = _jspx_th_c_005fif_005f20.doStartTag();
    if (_jspx_eval_c_005fif_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(703,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty listaLotesDeDespacho}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f21 = _jspx_th_c_005fif_005f21.doStartTag();
    if (_jspx_eval_c_005fif_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\tlistaLotesDeDespacho =\n");
        out.write("\t\t\t[\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f15(_jspx_th_c_005fif_005f21, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t];\n");
        out.write("\t");
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

  private boolean _jspx_meth_c_005fforEach_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f21, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f15 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f21);
    // /WEB-INF/jsp/crSepararFaturar.jsp(706,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f15.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(706,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f15.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(706,5) '${listaLotesDeDespacho}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaLotesDeDespacho}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(706,5) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f15.setVarStatus("statusReserva");
    int[] _jspx_push_body_count_c_005fforEach_005f15 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f15 = _jspx_th_c_005fforEach_005f15.doStartTag();
      if (_jspx_eval_c_005fforEach_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tidReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdFilial:filialTc.cdFilial,\n");
          out.write("\t\t\t\t\t\tidTransportadora:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idTransportadora}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdtReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdsReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnrPedido:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnrRastreio:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrRastreio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnmTransportadora:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmTransportadora}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnmServEntrega:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmServEntrega}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcliente :\n");
          out.write("\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\tnome : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tcpf : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\trg : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.rg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tddd : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.ddd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tcpfComMascara : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpfComMascara}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\tnomeFormatado : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nomeFormatado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\ttelefones :\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f16(_jspx_th_c_005fforEach_005f15, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f15))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t],\n");
          out.write("\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f23(_jspx_th_c_005fforEach_005f15, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f15))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f15);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f16 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f15);
    // /WEB-INF/jsp/crSepararFaturar.jsp(730,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f16.setVar("telefones");
    // /WEB-INF/jsp/crSepararFaturar.jsp(730,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f16.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(730,12) '${reserva.cliente.telefones}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.cliente.telefones}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(730,12) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f16.setVarStatus("statusReservaTelefone");
    int[] _jspx_push_body_count_c_005fforEach_005f16 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f16 = _jspx_th_c_005fforEach_005f16.doStartTag();
      if (_jspx_eval_c_005fforEach_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tnrPrefixo : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tnrTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcdTipoTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.cdTipoTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f22(_jspx_th_c_005fforEach_005f16, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f16))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f16);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f16);
    // /WEB-INF/jsp/crSepararFaturar.jsp(736,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaTelefone.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f22 = _jspx_th_c_005fif_005f22.doStartTag();
    if (_jspx_eval_c_005fif_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f15, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f15);
    // /WEB-INF/jsp/crSepararFaturar.jsp(740,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReserva.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f23 = _jspx_th_c_005fif_005f23.doStartTag();
    if (_jspx_eval_c_005fif_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f24.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(745,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty listaPedidosMPComPendencias}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f24 = _jspx_th_c_005fif_005f24.doStartTag();
    if (_jspx_eval_c_005fif_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\tlistaPedidosMPComPendencias =\n");
        out.write("\t\t{\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fforEach_005f17(_jspx_th_c_005fif_005f24, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t};\n");
        out.write("\t");
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

  private boolean _jspx_meth_c_005fforEach_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f17 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f24);
    // /WEB-INF/jsp/crSepararFaturar.jsp(748,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f17.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(748,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f17.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(748,3) '${listaPedidosMPComPendencias}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaPedidosMPComPendencias}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(748,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f17.setVarStatus("statusReserva");
    int[] _jspx_push_body_count_c_005fforEach_005f17 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f17 = _jspx_th_c_005fforEach_005f17.doStartTag();
      if (_jspx_eval_c_005fforEach_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" :\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tidReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdFilial:filialTc.cdFilial,\n");
          out.write("\t\t\t\t\t\tdtReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdtPrazoRetirada:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtPrazoRetirada}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdOperador:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdOperador}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdtAtualizacao:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtAtualizacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdsReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnrPedido:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tidNF:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idNF}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdtEmissaoNf:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtEmissaoNf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnrCnpjFilial:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrCnpjFilial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdtReservaDate:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReservaDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcontrolado:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.controlado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdFluxo:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdsFluxo:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdStatusTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdsStatusTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdChaveAcessoNfe:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdChaveAcessoNfe}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdOrigemTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdOrigemTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnmServEnt:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmServEnt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\titemVazio:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.itemVazio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnmServEnt : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmServEnt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\titemVazio : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.itemVazio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdStatusReserva : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.statusReserva.cdStatusReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdsReservaStatus : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.statusReserva.dsReservaStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\treservaProdutoAppItens:\n");
          out.write("\t\t\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f18(_jspx_th_c_005fforEach_005f17, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f17))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t],\n");
          out.write("\t\t\t\t\t\tomsAnotacoes :\n");
          out.write("\t\t\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f19(_jspx_th_c_005fforEach_005f17, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f17))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t],\n");
          out.write("\t\t\t\t\t\tcliente :\n");
          out.write("\t\t\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\t\tnome : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcpf : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\trg : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.rg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tddd : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.ddd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\temail : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\ttelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.telefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcelular : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.celular}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcpfComMascara : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpfComMascara}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tnomeFormatado : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nomeFormatado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\ttelefones :\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f20(_jspx_th_c_005fforEach_005f17, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f17))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t]\n");
          out.write("\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t]\n");
          out.write("\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f28(_jspx_th_c_005fforEach_005f17, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f17))
            return true;
          out.write("\n");
          out.write("\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f17);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f18 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f17);
    // /WEB-INF/jsp/crSepararFaturar.jsp(780,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f18.setVar("reservaProdutoAppItens");
    // /WEB-INF/jsp/crSepararFaturar.jsp(780,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f18.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(780,9) '${reserva.reservaProdutoAppItens}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.reservaProdutoAppItens}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(780,9) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f18.setVarStatus("statusReservaProduto");
    int[] _jspx_push_body_count_c_005fforEach_005f18 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f18 = _jspx_th_c_005fforEach_005f18.doStartTag();
      if (_jspx_eval_c_005fforEach_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\t\tqtItens : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.qtItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tqtItensDisponivel : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.qtItensDisponivel}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvlUnitario : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.vlUnitario}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvlTotalItens : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.vlTotalItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tproduto :\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tcodProduto : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.codProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tcodEan : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.codEan}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdescricao : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdescricaoDet : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.descricaoDet}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tcodTarja : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reservaProdutoAppItens.produto.codTarja}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t],\n");
          out.write("\t\t\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f25(_jspx_th_c_005fforEach_005f18, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f18))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f18);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f18, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f18)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f18);
    // /WEB-INF/jsp/crSepararFaturar.jsp(796,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaProduto.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f25 = _jspx_th_c_005fif_005f25.doStartTag();
    if (_jspx_eval_c_005fif_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fforEach_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f19 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f17);
    // /WEB-INF/jsp/crSepararFaturar.jsp(801,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f19.setVar("omsAnotacoes");
    // /WEB-INF/jsp/crSepararFaturar.jsp(801,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f19.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(801,9) '${reserva.omsAnotacoes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.omsAnotacoes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(801,9) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f19.setVarStatus("statusReservaOms");
    int[] _jspx_push_body_count_c_005fforEach_005f19 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f19 = _jspx_th_c_005fforEach_005f19.doStartTag();
      if (_jspx_eval_c_005fforEach_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcdTelevenda : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcdAnotacao : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.cdAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tdsAnotacao : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.dsAnotacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tdsMensagem : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${omsAnotacoes.dsMensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f26(_jspx_th_c_005fforEach_005f19, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f19))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f19);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f19, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f19)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f19);
    // /WEB-INF/jsp/crSepararFaturar.jsp(807,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaOms.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f26 = _jspx_th_c_005fif_005f26.doStartTag();
    if (_jspx_eval_c_005fif_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fforEach_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f20 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f17);
    // /WEB-INF/jsp/crSepararFaturar.jsp(825,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f20.setVar("telefones");
    // /WEB-INF/jsp/crSepararFaturar.jsp(825,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f20.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(825,13) '${reserva.cliente.telefones}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.cliente.telefones}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(825,13) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f20.setVarStatus("statusReservaTelefone");
    int[] _jspx_push_body_count_c_005fforEach_005f20 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f20 = _jspx_th_c_005fforEach_005f20.doStartTag();
      if (_jspx_eval_c_005fforEach_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tnrPrefixo : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tnrTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tcdTipoTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.cdTipoTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f27(_jspx_th_c_005fforEach_005f20, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f20))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f20);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f20, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f20)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f27 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f20);
    // /WEB-INF/jsp/crSepararFaturar.jsp(831,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaTelefone.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f27 = _jspx_th_c_005fif_005f27.doStartTag();
    if (_jspx_eval_c_005fif_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f17, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f17)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f28 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f17);
    // /WEB-INF/jsp/crSepararFaturar.jsp(836,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReserva.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f28 = _jspx_th_c_005fif_005f28.doStartTag();
    if (_jspx_eval_c_005fif_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f29 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f29.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(841,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty listaLotesAguardandoDepacho}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f29 = _jspx_th_c_005fif_005f29.doStartTag();
    if (_jspx_eval_c_005fif_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\tlistaLotesAguardandoDepacho =\n");
        out.write("\t\t\t{\t\t");
        if (_jspx_meth_c_005fforEach_005f21(_jspx_th_c_005fif_005f29, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t};\n");
        out.write("\t");
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

  private boolean _jspx_meth_c_005fforEach_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f29, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f21 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f29);
    // /WEB-INF/jsp/crSepararFaturar.jsp(843,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f21.setVar("lote");
    // /WEB-INF/jsp/crSepararFaturar.jsp(843,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f21.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(843,6) '${listaLotesAguardandoDepacho}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaLotesAguardandoDepacho}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(843,6) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f21.setVarStatus("statusLote");
    int[] _jspx_push_body_count_c_005fforEach_005f21 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f21 = _jspx_th_c_005fforEach_005f21.doStartTag();
      if (_jspx_eval_c_005fforEach_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lote.idLote}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" :\n");
          out.write("\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\tidLote:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lote.idLote}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tidLoteStatus:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lote.idLoteStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tcdFilial:filialTc.cdFilial,\n");
          out.write("\t\t\t\t\t\tnmTransportadora:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lote.nmTransportadora}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tnmLoteStatus:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lote.nmLoteStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tdtCadastroString:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lote.dtCadastroString}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\tlotes :\n");
          out.write("\t\t\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f22(_jspx_th_c_005fforEach_005f21, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f21))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t],\n");
          out.write("\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f32(_jspx_th_c_005fforEach_005f21, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f21))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f21);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f21, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f21)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f22 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f21);
    // /WEB-INF/jsp/crSepararFaturar.jsp(854,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f22.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(854,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f22.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(854,8) '${lote.lotes}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${lote.lotes}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(854,8) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f22.setVarStatus("statusReserva");
    int[] _jspx_push_body_count_c_005fforEach_005f22 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f22 = _jspx_th_c_005fforEach_005f22.doStartTag();
      if (_jspx_eval_c_005fforEach_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\t\tidReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tidTransportadora:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idTransportadora}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcdTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcdReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tdsReservaOrigem:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tnrPedido:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tnrRastreio:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrRastreio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tnmTransportadora:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmTransportadora}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tdtReserva:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcdStatusTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tdsStatusTelevenda:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tdsFluxo:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcdFluxo:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcdChaveAcessoNfe:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cdChaveAcessoNfe}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tdtEmissaoNf:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtEmissaoNf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcliente :\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tnome : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcpf : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\trg : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.rg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tddd : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.ddd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcpfComMascara : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpfComMascara}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tnomeFormatado : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nomeFormatado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttelefones :\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t[\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f23(_jspx_th_c_005fforEach_005f22, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f22))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t],\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f31(_jspx_th_c_005fforEach_005f22, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f22))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f22);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f22, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f22)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f23 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f22);
    // /WEB-INF/jsp/crSepararFaturar.jsp(882,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f23.setVar("telefones");
    // /WEB-INF/jsp/crSepararFaturar.jsp(882,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f23.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(882,16) '${reserva.cliente.telefones}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.cliente.telefones}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(882,16) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f23.setVarStatus("statusReservaTelefone");
    int[] _jspx_push_body_count_c_005fforEach_005f23 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f23 = _jspx_th_c_005fforEach_005f23.doStartTag();
      if (_jspx_eval_c_005fforEach_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tidCliente : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tnrPrefixo : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tnrTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\",\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tcdTipoTelefone : \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefones.cdTipoTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}");
          if (_jspx_meth_c_005fif_005f30(_jspx_th_c_005fforEach_005f23, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f23))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f23.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f23[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f23.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f23.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f23);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f23, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f23)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f30 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f30.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f23);
    // /WEB-INF/jsp/crSepararFaturar.jsp(888,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReservaTelefone.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f30 = _jspx_th_c_005fif_005f30.doStartTag();
    if (_jspx_eval_c_005fif_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f22, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f22)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f31 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f31.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f22);
    // /WEB-INF/jsp/crSepararFaturar.jsp(892,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f31.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusReserva.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f31 = _jspx_th_c_005fif_005f31.doStartTag();
    if (_jspx_eval_c_005fif_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fif_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f21, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f21)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f32 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f32.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f21);
    // /WEB-INF/jsp/crSepararFaturar.jsp(895,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f32.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!statusLote.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f32 = _jspx_th_c_005fif_005f32.doStartTag();
    if (_jspx_eval_c_005fif_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(',');
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(911,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(911,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(911,2) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(911,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("page");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f33 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f33.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f33.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(914,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f33.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty listaEmProcessamento}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f33 = _jspx_th_c_005fif_005f33.doStartTag();
    if (_jspx_eval_c_005fif_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<th class=\"listaVazia\">Não há pedidos em processamento</th>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f34 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f34.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f34.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(917,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f34.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty listaEmProcessamento}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f34 = _jspx_th_c_005fif_005f34.doStartTag();
    if (_jspx_eval_c_005fif_005f34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Data &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Serviço &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Fluxo &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Canal &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Pedido &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Cliente &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Status do pedido &#x25BE;</th>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f24 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f24.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(927,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f24.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(927,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f24.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(927,4) '${listaEmProcessamento}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaEmProcessamento}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f24 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f24 = _jspx_th_c_005fforEach_005f24.doStartTag();
      if (_jspx_eval_c_005fforEach_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr class=\"trEmProcessamento\">\n");
          out.write("\t\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReservaDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmServEnt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.canal}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"tdEmProcessamento\" style=\"cursor: pointer;\">\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onmouseover=\"populaDadosCliente('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nomeFormatado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</div>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t\t<td class=\"tdEmProcessamento\"  style=\"cursor: pointer;\">\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onmouseover=\"populaDadosOrigemFluxo('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\">Em Processamento</div>\n");
          out.write("\t\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f24.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f24[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f24.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f24.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f24);
    }
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(944,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(944,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(944,2) '${i + 1}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${i + 1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(944,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(959,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(959,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(959,2) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(959,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setScope("page");
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f35 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f35.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f35.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(963,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f35.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty listaAguardandoSeparacao}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f35 = _jspx_th_c_005fif_005f35.doStartTag();
    if (_jspx_eval_c_005fif_005f35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<th class=\"listaVazia\">Não há pedidos aguardando Separação</th>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f36 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f36.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f36.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(966,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f36.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty listaAguardandoSeparacao}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f36 = _jspx_th_c_005fif_005f36.doStartTag();
    if (_jspx_eval_c_005fif_005f36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Em espera &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Prazo &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Serviço &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Bandeira &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Fluxo &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Pedido &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Cliente &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\" style=\"text-align: center;\">Ação</th>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f25 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f25.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(978,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f25.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(978,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f25.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(978,4) '${listaAguardandoSeparacao}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaAguardandoSeparacao}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f25 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f25 = _jspx_th_c_005fforEach_005f25.doStartTag();
      if (_jspx_eval_c_005fforEach_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f3(_jspx_th_c_005fforEach_005f25, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f25))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f4(_jspx_th_c_005fforEach_005f25, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f25))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f5(_jspx_th_c_005fforEach_005f25, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f25))
            return true;
          out.write('\n');
          out.write("\n");
          out.write("\t\t\t\t\t<tr class=\"trEmProcessamento mp-order-priority\" data-orderPriorityId=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.orderPriority.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-orderPriorityBg=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.orderPriority.hex.bg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-orderPriorityCl=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.orderPriority.hex.cl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, mp-order-priority-item\" id=\"display_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, mp-order-priority-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtPrazoRetirada}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, mp-order-priority-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nmServEnt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, mp-order-priority-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, mp-order-priority-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, mp-order-priority-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, mp-order-priority-item\">\n");
          out.write("\t\t\t\t\t\t\t<div class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onmouseover=\"populaDadosCliente('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\" style=\"cursor: pointer; \">");
          if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f25, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f25))
            return true;
          out.write(" <span class=\"cc-msg-controlado\" data-ccControlado=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.controlado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></span> </div>\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, mp-order-priority-item\" style=\"text-align: center;\"><input type=\"button\" class=\"btnSeparaFatura\" onclick=\"montaDialogoSepararFaturar(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(");\" value=\"Separar e faturar\"/></td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<script>display(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(");</script>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f25.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f25[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f25.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f25.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f25);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f25)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f25);
    // /WEB-INF/jsp/crSepararFaturar.jsp(979,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setVar("isControladoDisp");
    // /WEB-INF/jsp/crSepararFaturar.jsp(979,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(979,5) '${reserva.controlado}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.controlado}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(979,5) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setScope("page");
    int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
    if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f25)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f25);
    // /WEB-INF/jsp/crSepararFaturar.jsp(980,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setVar("isFilialVersao");
    // /WEB-INF/jsp/crSepararFaturar.jsp(980,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(980,5) '${((lojaVersaoParcialSemControlado && !isControladoDisp) || (lojaVersaoParcialComControlado && isControladoDisp))}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${((lojaVersaoParcialSemControlado && !isControladoDisp) || (lojaVersaoParcialComControlado && isControladoDisp))}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(980,5) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setScope("page");
    int _jspx_eval_c_005fset_005f4 = _jspx_th_c_005fset_005f4.doStartTag();
    if (_jspx_th_c_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f25)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f25);
    // /WEB-INF/jsp/crSepararFaturar.jsp(981,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f5.setVar("isPedidoUrgente");
    // /WEB-INF/jsp/crSepararFaturar.jsp(981,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f5.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(981,5) '${reserva.cdOrigemTelevenda == 8}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.cdOrigemTelevenda == 8}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(981,5) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f5.setScope("page");
    int _jspx_eval_c_005fset_005f5 = _jspx_th_c_005fset_005f5.doStartTag();
    if (_jspx_th_c_005fset_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f25)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f25);
    // /WEB-INF/jsp/crSepararFaturar.jsp(991,196) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nomeFormatado}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f6.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(998,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f6.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(998,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f6.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(998,2) '${i + 1}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${i + 1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(998,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f6.setScope("page");
    int _jspx_eval_c_005fset_005f6 = _jspx_th_c_005fset_005f6.doStartTag();
    if (_jspx_th_c_005fset_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f7.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1011,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f7.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1011,3) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f7.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1011,3) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(1011,3) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f7.setScope("page");
    int _jspx_eval_c_005fset_005f7 = _jspx_th_c_005fset_005f7.doStartTag();
    if (_jspx_th_c_005fset_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f37 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f37.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f37.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1014,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f37.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty listaAguardandoRetirada}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f37 = _jspx_th_c_005fif_005f37.doStartTag();
    if (_jspx_eval_c_005fif_005f37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<th class=\"listaVazia\">Não há pedidos aguardando retirada</th>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f38 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f38.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f38.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1017,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f38.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty listaAguardandoRetirada}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f38 = _jspx_th_c_005fif_005f38.doStartTag();
    if (_jspx_eval_c_005fif_005f38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Em espera &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Data &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Pedido &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Cliente &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\"></th>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f26 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f26.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1025,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f26.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1025,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f26.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1025,4) '${listaAguardandoRetirada}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaAguardandoRetirada}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f26 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f26 = _jspx_th_c_005fforEach_005f26.doStartTag();
      if (_jspx_eval_c_005fforEach_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f8(_jspx_th_c_005fforEach_005f26, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f26))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f9(_jspx_th_c_005fforEach_005f26, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f26))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f10(_jspx_th_c_005fforEach_005f26, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f26))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t<tr class=\"trEmProcessamento\">\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, \"  id=\"display_ret-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtPrazoRetirada}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, \">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, \">\n");
          out.write("\t\t\t\t\t\t\t<div class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onmouseover=\"populaDadosCliente('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\"\t\t\t\t\t\t\t style=\"cursor: pointer; \">");
          if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f26, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f26))
            return true;
          out.write(" <span class=\"cc-msg-controlado\" data-ccControlado=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.controlado}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></span> </div>\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento, \" style=\"text-align: center;\"><input type=\"button\" class=\"btnSeparaFatura\" onclick=\"montaDialogoAguardandoCliente(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(");\" value=\"Resolver\"/></td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<script>displayRet(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(");</script>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f26.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f26[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f26.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f26.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f26);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f26)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f8 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f26);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1026,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f8.setVar("isControladoDisp");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1026,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f8.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1026,5) '${reserva.controlado}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.controlado}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(1026,5) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f8.setScope("page");
    int _jspx_eval_c_005fset_005f8 = _jspx_th_c_005fset_005f8.doStartTag();
    if (_jspx_th_c_005fset_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f26)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f9 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f26);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1027,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f9.setVar("isFilialVersao");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1027,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f9.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1027,5) '${((lojaVersaoParcialSemControlado && !isControladoDisp) || (lojaVersaoParcialComControlado && isControladoDisp))}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${((lojaVersaoParcialSemControlado && !isControladoDisp) || (lojaVersaoParcialComControlado && isControladoDisp))}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(1027,5) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f9.setScope("page");
    int _jspx_eval_c_005fset_005f9 = _jspx_th_c_005fset_005f9.doStartTag();
    if (_jspx_th_c_005fset_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f26)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f10 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f26);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1028,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f10.setVar("isPedidoUrgente");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1028,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f10.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1028,5) '${reserva.cdOrigemTelevenda == 8}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${reserva.cdOrigemTelevenda == 8}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(1028,5) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f10.setScope("page");
    int _jspx_eval_c_005fset_005f10 = _jspx_th_c_005fset_005f10.doStartTag();
    if (_jspx_th_c_005fset_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f26, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f26)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f26);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1034,203) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nomeFormatado}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f11 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f11.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1042,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f11.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1042,3) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f11.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1042,3) '${i + 1}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${i + 1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(1042,3) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f11.setScope("page");
    int _jspx_eval_c_005fset_005f11 = _jspx_th_c_005fset_005f11.doStartTag();
    if (_jspx_th_c_005fset_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f12 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f12.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1048,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f12.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1048,3) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f12.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1048,3) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(1048,3) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f12.setScope("page");
    int _jspx_eval_c_005fset_005f12 = _jspx_th_c_005fset_005f12.doStartTag();
    if (_jspx_th_c_005fset_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f12);
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1051,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f39.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty listaLotesDeDespacho}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f39 = _jspx_th_c_005fif_005f39.doStartTag();
    if (_jspx_eval_c_005fif_005f39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<th class=\"listaVazia\">Não há pedidos aguardando despacho</th>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f40 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f40.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f40.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1054,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f40.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty listaLotesDeDespacho}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f40 = _jspx_th_c_005fif_005f40.doStartTag();
    if (_jspx_eval_c_005fif_005f40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Data &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Bandeira &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Pedido &#x25BE;</th>\n");
        out.write("\t\t\t\t\t\t<th class=\"thEmProcessamento\">Cliente &#x25BE;</th>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f27 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f27.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1061,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f27.setVar("listMicroPolo");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1061,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f27.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1061,4) '${listaLotesDeDespacho}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaLotesDeDespacho}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f27 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f27 = _jspx_th_c_005fforEach_005f27.doStartTag();
      if (_jspx_eval_c_005fforEach_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<tr class=\"trEmProcessamento\">\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMicroPolo.dtReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMicroPolo.dsReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMicroPolo.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMicroPolo.cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f27.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f27[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f27.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f27.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f27);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f41 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f41.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f41.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1070,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f41.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty listaLotesDeDespacho}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f41 = _jspx_th_c_005fif_005f41.doStartTag();
    if (_jspx_eval_c_005fif_005f41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<td colspan=\"4\" class=\"tdEmProcessamento\" style=\"text-align: center;\"><input type=\"button\" class=\"btnSeparaFatura\" onclick=\"montaDialogoCriarLote();\" value=\"Criar Lote\"/></td>\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fset_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f13 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f13.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1075,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f13.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1075,3) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f13.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1075,3) '${i + 1}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${i + 1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(1075,3) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f13.setScope("page");
    int _jspx_eval_c_005fset_005f13 = _jspx_th_c_005fset_005f13.doStartTag();
    if (_jspx_th_c_005fset_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f42 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f42.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f42.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1092,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f42.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty listaLotesAguardandoDepacho}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f42 = _jspx_th_c_005fif_005f42.doStartTag();
    if (_jspx_eval_c_005fif_005f42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<th class=\"listaVazia\">Não há lotes à serem despachados</th>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f43 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f43.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f43.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1095,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f43.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty listaLotesAguardandoDepacho}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f43 = _jspx_th_c_005fif_005f43.doStartTag();
    if (_jspx_eval_c_005fif_005f43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Id Lote &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Data &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Trasnportadora &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Status Lote &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\"></th>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f28 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f28.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1103,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f28.setVar("listMicroPolo");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1103,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f28.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1103,3) '${listaLotesAguardandoDepacho}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaLotesAguardandoDepacho}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f28 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f28 = _jspx_th_c_005fforEach_005f28.doStartTag();
      if (_jspx_eval_c_005fforEach_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<tr class=\"trEmProcessamento\">\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMicroPolo.idLote}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMicroPolo.dtCadastroString}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMicroPolo.nmTransportadora}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMicroPolo.nmLoteStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\"><input type=\"button\" class=\"btnSeparaFatura\" onclick=\"montaDialogoLotesAguardandoDespacho(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMicroPolo.idLote}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\" value=\"Abrir lote\"/></td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f28.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f28[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f28.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f28.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f28);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f14 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f14.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1124,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f14.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1124,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f14.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1124,2) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(1124,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f14.setScope("page");
    int _jspx_eval_c_005fset_005f14 = _jspx_th_c_005fset_005f14.doStartTag();
    if (_jspx_th_c_005fset_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f14);
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1127,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f44.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty listaPedidosMPComPendencias}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f44 = _jspx_th_c_005fif_005f44.doStartTag();
    if (_jspx_eval_c_005fif_005f44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<th class=\"listaVazia\">Não há pedidos com pendência</th>\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f45 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f45.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f45.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1130,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f45.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty listaPedidosMPComPendencias}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f45 = _jspx_th_c_005fif_005f45.doStartTag();
    if (_jspx_eval_c_005fif_005f45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Data &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Bandeira &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Fluxo &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Pedido &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Cliente &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\">Status &#x25BE;</th>\n");
        out.write("\t\t\t\t\t<th class=\"thEmProcessamento\"></th>\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f45.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f45);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f29 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f29.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1140,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f29.setVar("reserva");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1140,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f29.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1140,3) '${listaPedidosMPComPendencias}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listaPedidosMPComPendencias}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f29 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f29 = _jspx_th_c_005fforEach_005f29.doStartTag();
      if (_jspx_eval_c_005fforEach_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<tr class=\"trEmProcessamento\">\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dtReservaDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsReservaOrigem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsFluxo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.nrPedido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.dsStatusTelevenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"tdEmProcessamento\"><span class=\"verResolver\" onclick=\"montaDialogoPendencia(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reserva.idReserva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\">Ver / resolver</span></td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f29.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f29[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f29.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f29.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f29);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f15 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f15.setParent(null);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1152,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f15.setVar("i");
    // /WEB-INF/jsp/crSepararFaturar.jsp(1152,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f15.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/crSepararFaturar.jsp(1152,2) '${i + 1}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${i + 1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/crSepararFaturar.jsp(1152,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f15.setScope("page");
    int _jspx_eval_c_005fset_005f15 = _jspx_th_c_005fset_005f15.doStartTag();
    if (_jspx_th_c_005fset_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f15);
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1159,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f9.setValue("/images/ico-print.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1168,59) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f10.setValue("/images/happyfolder.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1177,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f11.setValue("/images/ico-cancela-pedido.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1191,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f12.setValue("/images/ico-cancela-pedido.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1200,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f13.setValue("/images/ico-cancela-pedido.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1209,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f14.setValue("/images/ico-check.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1218,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f15.setValue("/images/ico-parcial.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1228,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f16.setValue("/images/ico-check.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1239,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f17.setValue("/images/ico-check.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1250,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f18.setValue("/images/ico-cancela-pedido.png");
    int _jspx_eval_c_005furl_005f18 = _jspx_th_c_005furl_005f18.doStartTag();
    if (_jspx_th_c_005furl_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f2.setParent(null);
    int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
    if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write('	');
        out.write('	');
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1266,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msgErro != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<script>\n");
        out.write("\t\t\t\tjAlert('");
        if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fwhen_005f2, _jspx_page_context))
          return true;
        out.write("',\"Impressão Receita\");\n");
        out.write("\t\t\t</script>\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    // /WEB-INF/jsp/crSepararFaturar.jsp(1268,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msgErro}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1425,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f19.setValue("/images/ico-person.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1434,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f20.setValue("/images/reload.gif");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1448,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f21.setValue("/images/document-2-48.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1457,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f22.setValue("/images/online-support-48.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1466,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f23.setValue("/images/ico-check.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1475,35) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f24.setValue("/images/ico-check.png");
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
    // /WEB-INF/jsp/crSepararFaturar.jsp(1580,82) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f25.setValue("/");
    int _jspx_eval_c_005furl_005f25 = _jspx_th_c_005furl_005f25.doStartTag();
    if (_jspx_th_c_005furl_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f25);
    return false;
  }
}
