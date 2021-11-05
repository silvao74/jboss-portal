package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.drogaraia.tc.vo.Cliente;
import br.com.drogaraia.tc.vo.Endereco;
import br.com.drogaraia.tc.vo.pbmr.ContatosNovartisVO;

public final class cadastroClientePbmr_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.release();
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
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\t\t<!-- <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\" /> -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("\t\t\tvar $j = jQuery.noConflict();\r\n");
      out.write("\t\t\t$j.support.cors = true;\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar TERMINAL_CONSULTA_SERVICOS_URL = '");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\tvar RDAUTHORIZATORCUSTOMER_URL = '");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\tvar lojaFilialVersaoCustomerMS = '");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction buscaMedico(){\r\n");
      out.write("\t\t\tstartBuscaCrmLoadingAnimation();\r\n");
      out.write("\t\t    $j('#medicoNome').find('option').remove();\r\n");
      out.write("\t\t    if($j('#medicoCrm').val() == \"\"  || $j('#medicoUf').val() == \"0\"){\r\n");
      out.write("// \t\t        $('#msgMedico').html(\"Campo CRM/Nome ou UF vazio.\").css({\"font\":\"bold 14px Georgia, serif\", \"color\":\"#3399cc\", \"padding-top\": \"7px\"});\r\n");
      out.write("\t\t\t\talert(\"Campo CRM ou UF vazio.\");\r\n");
      out.write("\t\t        stopBuscaCrmLoadingAnimation();\r\n");
      out.write("\t\t    }else{\r\n");
      out.write("\t\t        var url = TERMINAL_CONSULTA_SERVICOS_URL + \"aderenciaTratamento\" + \"/medico/\" + $j('#medicoCrm').val() + \"/\" +  $j('#medicoUf').val() ;\r\n");
      out.write("\t\t        $j.ajax({\r\n");
      out.write("\t\t            type: 'GET',\r\n");
      out.write("\t\t            async: false,\r\n");
      out.write("\t\t            cache: false,\r\n");
      out.write("\t\t            contentType: 'application/json',\r\n");
      out.write("\t\t            url:  url,\r\n");
      out.write("\t\t            success: function (medicoJson) {\r\n");
      out.write("\t\t            \tstopBuscaCrmLoadingAnimation();\r\n");
      out.write("\t\t                var toAppend = '';\r\n");
      out.write("\t\t                if(medicoJson.length == 1){\r\n");
      out.write("\t\t                    toAppend += '<option data-id=\"'+medicoJson[0].idProfissionalCr+' \"data-name=\"'+medicoJson[0].nmProfissional+'\" title=\"CRM '+medicoJson[0].nrCrm+'\">'+medicoJson[0].nmProfissional+'</option>';\r\n");
      out.write("\t\t                    $j('#medicoNome').append(toAppend);\r\n");
      out.write("\t\t                }else{\r\n");
      out.write("\t\t                    for(var i=0;i<medicoJson.length;i++){\r\n");
      out.write("\t\t                        toAppend += '<option data-id=\"'+medicoJson[i].idProfissionalCr+' \"data-name=\"'+medicoJson[i].nmProfissional+'\" title=\"CRM '+medicoJson[i].nrCrm+'\">'+medicoJson[i].nmProfissional+'</option>';\r\n");
      out.write("\t\t                    }\r\n");
      out.write("\t\t                    $j('#medicoNome').append(toAppend);\r\n");
      out.write("\t\t                }\r\n");
      out.write("\t\t            },error: function (jqXHR, exception) {\r\n");
      out.write("\t\t            \tstopBuscaCrmLoadingAnimation();\r\n");
      out.write("\t\t                var obj = JSON.parse(jqXHR.responseText);\r\n");
      out.write("\t\t                console.log(\"Status Code: \" + jqXHR.status);\r\n");
      out.write("\t\t                alert(obj.messageReturn);\r\n");
      out.write("\t\t                $j('#medicoCrm').val('');\r\n");
      out.write("\t\t                $j('#medicoUf').val('');\r\n");
      out.write("\t\t                $j('#medicoNome').val('');\r\n");
      out.write("\r\n");
      out.write("\t\t            }\r\n");
      out.write("\t\t        });\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction editarDadosContatoPbm(){\r\n");
      out.write("\t\t\tvar json = {\r\n");
      out.write("\t\t            'isContatos': document.formCadastro.isContatos.value,\r\n");
      out.write("\t\t            'contatoEmail': $j('#contatoEmail').val(),\r\n");
      out.write("\t\t            'contatoCelular': $j('#contatoCelular').val(),\r\n");
      out.write("\t\t            'contatoCorreio': $j('#contatoCorreio').val(),\r\n");
      out.write("\t\t            'contatoPermissao': $j('#contatoPermissao').val(),\r\n");
      out.write("\t\t            'idCliente': document.formCadastro.idCliente.value\r\n");
      out.write("\t\t        };\r\n");
      out.write("\t       var url = TERMINAL_CONSULTA_SERVICOS_URL + \"pbmr/contatosPbm\";\r\n");
      out.write("\t        $j.ajax({\r\n");
      out.write("\t            type: 'POST',\r\n");
      out.write("\t            async: false,\r\n");
      out.write("\t            cache: false,\r\n");
      out.write("\t            dataType: \"json\",\r\n");
      out.write("\t            contentType: 'application/json',\r\n");
      out.write("\t            data: JSON.stringify(json),\r\n");
      out.write("\t            url:  url,\r\n");
      out.write("\t            success: function (response, textStatus, jqXHR ) {\r\n");
      out.write("\t                console.log(\"sucesso:\" + JSON.stringify(response));\r\n");
      out.write("\t            }, error: function (jqXHR, exception) {\r\n");
      out.write("\t                var msgErro = 'Erro ao atualizar/inserir contatos pbm';\r\n");
      out.write("\t                console.log(msgErro);\r\n");
      out.write("\t            }\r\n");
      out.write("\t        });\r\n");
      out.write("\t    }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction startBuscaCrmLoadingAnimation() {\r\n");
      out.write("\t\t    $j('#imgLupaCrm').hide();\r\n");
      out.write("\t\t    var load = document.getElementById(\"imgCrmLoad\");\r\n");
      out.write("\t\t    if (load) {\r\n");
      out.write("\t\t    \t$j('#imgCrmLoad').show();\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction stopBuscaCrmLoadingAnimation () {\r\n");
      out.write("\t\t    $j('#imgLupaCrm').show();\r\n");
      out.write("\t\t    var load = document.getElementById(\"imgCrmLoad\");\r\n");
      out.write("\t\t    if (load) {\r\n");
      out.write("\t\t    \t$j('#imgCrmLoad').hide();\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction habilitaCamposCRM(tipo){\r\n");
      out.write("\t\t\tif(tipo === '1'){\r\n");
      out.write("\t\t\t\tdocument.getElementById('imgLupaCrm').style.display = 'none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('medicoNome').style.display = 'none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('labelNome').style.display = 'none';\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tdocument.getElementById('imgLupaCrm').style.display = 'inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('medicoNome').style.display = 'inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('labelNome').style.display = 'inline';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction habilitaCamposCRMEpharma(tipo){\r\n");
      out.write("\t\t\tif(tipo === '2'){\r\n");
      out.write("\t\t\t\tdocument.getElementById('imgLupaCrm').style.display = 'none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('medicoNome').style.display = 'none';\r\n");
      out.write("\t\t\t\tdocument.getElementById('labelNome').style.display = 'none';\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tdocument.getElementById('imgLupaCrm').style.display = 'inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('medicoNome').style.display = 'inline';\r\n");
      out.write("\t\t\t\tdocument.getElementById('labelNome').style.display = 'inline';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t    function validarContatoCorreio(sel) {\r\n");
      out.write("\t\t    \tvar selectCorrreio = sel.options[sel.selectedIndex].value;\r\n");
      out.write("\t            if ( selectCorrreio == 'S' ) {\r\n");
      out.write("\t                var endereco = document.formCadastro.endereco.value;\r\n");
      out.write("\t                if ( stringTrim(endereco) == \"\") {\r\n");
      out.write("\t                   alert(\"Por favor informe o endereco.\");\r\n");
      out.write("\t                   sel.options[0].selected=true;\r\n");
      out.write("\t                }\r\n");
      out.write("\t            }\r\n");
      out.write("\t\t    }\t\t\r\n");
      out.write("\t\t    function validarContatoEmail(sel) {\r\n");
      out.write("\t\t    \tvar selectEmail = sel.options[sel.selectedIndex].value;\r\n");
      out.write("                if ( selectEmail == '1' ) {\r\n");
      out.write("                    var email = document.formCadastro.email.value;\r\n");
      out.write("                    if ( stringTrim(email) == \"\" ) {\r\n");
      out.write("                       alert(\"Por favor informe o Email.\");\r\n");
      out.write("                       sel.options[0].selected=true;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    function validarContatoCelular(sel) {\r\n");
      out.write("\t\t    \tvar selectCelular = sel.options[sel.selectedIndex].value;\r\n");
      out.write("                if ( selectCelular == '1' ) {\r\n");
      out.write("                    var celular = document.formCadastro.celular.value;\r\n");
      out.write("                    if ( stringTrim(celular) == \"\" ) {\r\n");
      out.write("                       alert(\"Por favor informe o celular.\");\r\n");
      out.write("                       sel.options[0].selected=true;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function startImgLoad(ligarDesligar) {\r\n");
      out.write("\t\t    \tif (ligarDesligar) {\r\n");
      out.write("\t\t\t    \tdocument.getElementById(\"vms\").style.display = \"none\";\r\n");
      out.write("\t\t\t    \tdocument.getElementById(\"imgLoad\").style.display = \"\";\t\t    \t\t\r\n");
      out.write("\t\t    \t}else {\r\n");
      out.write("\t\t\t    \tdocument.getElementById(\"vms\").style.display = \"\";\r\n");
      out.write("\t\t\t    \tdocument.getElementById(\"imgLoad\").style.display = \"none\";\t\t    \t\t\r\n");
      out.write("\t\t    \t}\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\tfunction upperCase(elem){\r\n");
      out.write("\t\t\telem.value = elem.value.toUpperCase();\r\n");
      out.write("\t\t\telem.value = elem.value.replace(/[^\\D]/, \"\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction validarDataNascimento(data){\r\n");
      out.write("\t\t\tif (data.length < 10) {\r\n");
      out.write("\t\t\t\t$j(\"#dataNascimento\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t \t\tif(data == null || data == \"\"){\r\n");
      out.write("\t\t\t\t$j(\"#dataNascimento\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t} else if (!isValidaData(data)) {\r\n");
      out.write("\t\t\t\t$j(\"#dataNascimento\").focus();\r\n");
      out.write("\t\t\t\treturn false;\t\t\t\r\n");
      out.write("\t\t\t} \t\t\r\n");
      out.write("\t\t\treturn true; \t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction isValidaData(data){\r\n");
      out.write("\t\t\tif(data.indexOf(\"*\") == 0){\r\n");
      out.write("\t\t\t\tdata = $j.trim($j('#dataNascimentoEsc').val());\r\n");
      out.write("\t\t\t\tvar arrayData = data.split('/');\r\n");
      out.write("\t\t\t\tvar campoDia = parseInt(arrayData[0], 10); \r\n");
      out.write("\t\t\t\tvar campoMes = parseInt(arrayData[1], 10); \r\n");
      out.write("\t\t\t\tvar campAno = parseInt(arrayData[2]);\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\tvar dataUsuario = new Date();\r\n");
      out.write("\t\t\t\tdataUsuario.setDate(campoDia);\r\n");
      out.write("\t\t\t\tdataUsuario.setMonth(campoMes-1);\r\n");
      out.write("\t\t\t\tdataUsuario.setFullYear(campAno);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\tvar dataLimite = new Date();\r\n");
      out.write("\t\t\t\tdataLimite.setDate(dataLimite.getDate());\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar timeDiff = Math.abs(dataLimite.getTime() - dataUsuario.getTime());\r\n");
      out.write("\t\t\t\tvar diffAnos = Math.ceil((timeDiff / (1000 * 3600 * 24) / 365));\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar ExpReg=new RegExp(\"(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}\");\r\n");
      out.write("\t\t\t\tif (data.search(ExpReg)==-1){\r\n");
      out.write("\t\t\t\t\talert(\"Data invalida\");\r\n");
      out.write("\t\t\t\t\treturn false;\t\t\r\n");
      out.write("\t\t\t\t} else if(diffAnos >= 120) {\r\n");
      out.write("\t\t\t\t\talert(\"Data invalida. Cliente com mais de 120 anos\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t} else if(dataUsuario.getTime() >= dataLimite.getTime()){\r\n");
      out.write("\t\t\t\t\talert(\"Data acima da data limite\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t} else if (campoMes==2) {\r\n");
      out.write("\t\t\t\t\tif ((campoDia > 28) && ((campAno%4) !=0)) {\r\n");
      out.write("\t\t\t\t\t\talert(\"Data invalida. Data deve ser 28/02 em ano nao bisexto.\");\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t// Ano bissexto\r\n");
      out.write("\t\t\t\t\tif ((campoDia > 29) && ((campAno%4) == 0)) { \r\n");
      out.write("\t\t\t\t\t\talert(\"Data invalida. Data deve ser 29/02 em ano bisexto\");\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar arrayData = data.split('/');\r\n");
      out.write("\t\t\t\tvar campoDia = parseInt(arrayData[0], 10); \r\n");
      out.write("\t\t\t\tvar campoMes = parseInt(arrayData[1], 10); \r\n");
      out.write("\t\t\t\tvar campAno = parseInt(arrayData[2]);\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\tvar dataUsuario = new Date();\r\n");
      out.write("\t\t\t\tdataUsuario.setDate(campoDia);\r\n");
      out.write("\t\t\t\tdataUsuario.setMonth(campoMes-1);\r\n");
      out.write("\t\t\t\tdataUsuario.setFullYear(campAno);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\tvar dataLimite = new Date();\r\n");
      out.write("\t\t\t\tdataLimite.setDate(dataLimite.getDate());\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar timeDiff = Math.abs(dataLimite.getTime() - dataUsuario.getTime());\r\n");
      out.write("\t\t\t\tvar diffAnos = Math.ceil((timeDiff / (1000 * 3600 * 24) / 365));\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction validoDdd(ddd){\r\n");
      out.write("\t\t\tvar dddp = ddd.substring(0, 2);\r\n");
      out.write("\t\t\tvar validos = '|11|12|13|14|15|16|17|18|19|21|22|24|27|28|31|32|33|34|35|37|38|41|42|43|44|45|46|47|48|49|51|53|54|55|61|62|63|64|65|66|67|68|69|71|73|74|75|77|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|';\r\n");
      out.write("\t\t\tif (validos.indexOf(dddp) > -1) {\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction temNumerosRepetidos(numero){\r\n");
      out.write("\t\t\tvar primeiro = numero.substring(0, 1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar repeticoes = 1;\r\n");
      out.write("\t\t\tfor (var i = 1; i < numero.length; i++) {\r\n");
      out.write("\t\t\t\tvar parte = numero.substring(i, i + 1);\r\n");
      out.write("\t\t\t\tif (parte == primeiro) {\r\n");
      out.write("\t\t\t\t\trepeticoes++;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (repeticoes == numero.length) {\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction emailValido(email){\r\n");
      out.write("\t\t\tvar mensagem = '';\r\n");
      out.write("\t\t\tvar regex = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\r\n");
      out.write("\t\t    if (!regex.test(email)) {\r\n");
      out.write("\t\t\t\tif (email.length == 0) {\r\n");
      out.write("\t\t\t\t\talert(\"E-mail nao pode estar vazio\");\r\n");
      out.write("\t\t\t\t\t$j(\"#email\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t\talert(\"E-mail invalido\");\r\n");
      out.write("\t\t\t\t$j(\"#email\").focus();\r\n");
      out.write("\t\t    \treturn false;\r\n");
      out.write("\t\t    } else {\r\n");
      out.write("\t\t    \treturn true;\r\n");
      out.write("\t\t    }\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction somenteLetras(nome){\r\n");
      out.write("\t\t\tvar regexp = new RegExp(/[A-Z]\\s*$/);\r\n");
      out.write("\t\t\tif(regexp.test(nome)){\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction validarAbreviacao(nome){\r\n");
      out.write("\t\t\tvar regexp = new RegExp(/[A-Z\\u00C0-\\u00FF]{2,}\\s*$/);\r\n");
      out.write("\t\t\tvar arrayNome = nome.split(' ');\r\n");
      out.write("\t\t\tfor ( var i = 0; i < arrayNome.length; i++){\r\n");
      out.write("\t\t\t\tif(!regexp.test(arrayNome[i])){\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(arrayNome.length == 1){\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function validarForm(tela) {\r\n");
      out.write("\r\n");
      out.write("            var regexp = new RegExp(/([A-Z])\\1{2}/);\r\n");
      out.write("\t\t\t\tstartImgLoad(true);\r\n");
      out.write("\t\t\tvar nome = $j('#txtNome').val();\r\n");
      out.write("\t\t\tif (!somenteLetras(nome)) {\r\n");
      out.write("\t\t\t\talert(\"Permitido somente letras!\");\r\n");
      out.write("\t\t\t\t$j(\"#txtNome\").focus();\r\n");
      out.write("\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else if ($j.trim($j('#txtNome').val()) === \"\") {\r\n");
      out.write("\t\t\t\talert(\"O campo Nome deve ser preenchido!\");\r\n");
      out.write("\t\t\t\t$j(\"#txtNome\").focus();\r\n");
      out.write("\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}else if(regexp.test($j.trim($j('#txtNome').val()))){\r\n");
      out.write("\t\t\t\talert(\"Nome com sequencia invalida!\");\r\n");
      out.write("\t\t\t\t$j(\"#txtNome\").focus();\r\n");
      out.write("\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("// \t\t\telse if(!validarAbreviacao(nome)) {\r\n");
      out.write("// \t\t\t\talert(\"Nome nao pode ser abreviado!\");\r\n");
      out.write("// \t\t\t\t$j(\"#txtNome\").focus();\r\n");
      out.write("// \t\t\t\tstartImgLoad(false);\r\n");
      out.write("// \t\t\t\treturn false;\r\n");
      out.write("// \t\t\t} \r\n");
      out.write("\t\t\t\tif (stringTrim(tela.cep.value) == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"Informe o Cep.\");\r\n");
      out.write("\t\t\t\t\ttela.cep.focus();\r\n");
      out.write("\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (stringTrim(tela.endereco.value) == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"Informe o Endereco.\");\r\n");
      out.write("\t\t\t\t\ttela.endereco.focus();\r\n");
      out.write("\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (stringTrim(tela.numero.value) == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"Informe o Numero.\");\r\n");
      out.write("\t\t\t\t\ttela.numero.focus();\r\n");
      out.write("\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (stringTrim(tela.cidade.value) == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"Informe a Cidade.\");\r\n");
      out.write("\t\t\t\t\ttela.cidade.focus();\r\n");
      out.write("\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (stringTrim(tela.bairro.value) == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"Informe o Bairro.\");\r\n");
      out.write("\t\t\t\t\ttela.bairro.focus();\r\n");
      out.write("\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (stringTrim(tela.uf.value) == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"Informe o Estado.\");\r\n");
      out.write("\t\t\t\t\ttela.uf.focus();\r\n");
      out.write("\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar fixo = document.formCadastro.telefone.value;\r\n");
      out.write("\t\t\t\tvar dddFixo = document.formCadastro.dddTelefone.value;\r\n");
      out.write("\t\t\t\tif (stringTrim(fixo) != \"\" && stringTrim(dddFixo) != \"\") {\r\n");
      out.write("\t\t\t\t\tif(temNumerosRepetidos(fixo)){\r\n");
      out.write("\t\t\t\t\t\talert(\"Telefone nao pode ter todos os numeros repetidos\");\r\n");
      out.write("\t\t\t\t\t\t$j(\"#telefone\").focus();\r\n");
      out.write("\t\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(!validoDdd(dddFixo)){\r\n");
      out.write("\t\t\t\t\t\talert(\"Ddd invalido\");\r\n");
      out.write("\t\t\t\t\t\t$j(\"#dddFixo\").focus();\r\n");
      out.write("\t\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"Por favor informe o DDD e Telefone\");\r\n");
      out.write("\t\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar celular = document.formCadastro.celular.value;\r\n");
      out.write("\t\t\t\tvar dddCelular = document.formCadastro.dddCelular.value;\r\n");
      out.write("\t\t\t\tif (stringTrim(celular) != \"\" && stringTrim(dddCelular) != \"\") {\r\n");
      out.write("\t\t           \tif(temNumerosRepetidos(celular)){\r\n");
      out.write("\t\t\t\t\t\talert(\"Celular nao pode ter todos os numeros repetidos\");\r\n");
      out.write("\t\t\t\t\t\t$j(\"#celular\").focus();\r\n");
      out.write("\t\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t            if(!validoDdd(dddCelular)){\r\n");
      out.write("\t\t\t\t\t\talert(\"Ddd invalido\");\r\n");
      out.write("\t\t\t\t\t\t$j(\"#dddCelular\").focus();\r\n");
      out.write("\t\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"Por favor informe o DDD e Celular\");\r\n");
      out.write("\t\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (stringTrim(tela.dataNascimento.value) == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"Informe a Data de Nascimento.\");\r\n");
      out.write("\t\t\t\t\ttela.dataNascimento.focus();\r\n");
      out.write("\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t    \tif(!validarDataNascimento($j.trim($j('#dataNascimento').val()))){\r\n");
      out.write("\t\t\t\t\t$j(\"#dataNascimento\").focus();\r\n");
      out.write("\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tif(!emailValido($j.trim($j('#email').val()))){\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tvar sel = document.formCadastro.contatoCelular;\r\n");
      out.write("\t\t\t\tvar selectCelular = sel.options[sel.selectedIndex].value;\r\n");
      out.write("\t\t\t\tif (selectCelular == '1') {\r\n");
      out.write("\t\t\t\t\tvar celular = document.formCadastro.celular.value;\r\n");
      out.write("\t\t\t\t\tif (stringTrim(celular) == \"\") {\r\n");
      out.write("\t\t\t\t\t\talert(\"Por favor informe o celular.\");\r\n");
      out.write("\t\t\t\t\t\tsel.options[0].selected = true;\r\n");
      out.write("\t\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar selEmail = document.formCadastro.contatoEmail;\r\n");
      out.write("\t\t\t\tvar selectEmail = selEmail.options[selEmail.selectedIndex].value;\r\n");
      out.write("\t\t\t\tif (selectEmail == '1') {\r\n");
      out.write("\t\t\t\t\tvar email = document.formCadastro.email.value;\r\n");
      out.write("\t\t\t\t\tif (stringTrim(email) == \"\") {\r\n");
      out.write("\t\t\t\t\t\talert(\"Por favor informe o Email.\");\r\n");
      out.write("\t\t\t\t\t\tselEmail.options[0].selected = true;\r\n");
      out.write("\t\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar selEnd = document.formCadastro.contatoCorreio;\r\n");
      out.write("\t\t\t\tvar selectEnd = selEnd.options[selEnd.selectedIndex].value;\r\n");
      out.write("\t\t\t\tif (selectEnd == '1') {\r\n");
      out.write("\t\t\t\t\tvar end = document.formCadastro.endereco.value;\r\n");
      out.write("\t\t\t\t\tif (stringTrim(end) == \"\") {\r\n");
      out.write("\t\t\t\t\t\talert(\"Por favor informe o Endereco.\");\r\n");
      out.write("\t\t\t\t\t\tselEnd.options[0].selected = true;\r\n");
      out.write("\t\t\t\t\t\tstartImgLoad(false);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (lojaFilialVersaoCustomerMS == 'true') {\r\n");
      out.write("\t\t\t\t\tvar cdFilial = document.getElementById('cdFilial').value;\r\n");
      out.write("\t\t\t\t\tvar fixo = document.formCadastro.telefone.value;\r\n");
      out.write("\t\t\t\t\tfixo = fixo.replace('-','');\r\n");
      out.write("\t\t\t\t\tvar celular = document.formCadastro.celular.value;\r\n");
      out.write("\t\t\t\t\tcelular = celular.replace('-','');\r\n");
      out.write("\t\t\t\t\tvar idMongo = document.getElementById('idCustomerMongo').value;\r\n");
      out.write("\t\t\t\t\tif(document.getElementById('idTelefoneRes').value == \"\"){\r\n");
      out.write("\t\t\t\t\t\tadicionandoTelefoneMicroServicoCustomerPBM(dddFixo,'R',fixo,idMongo);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(document.getElementById('idTelefoneCel').value == \"\"){\r\n");
      out.write("\t\t\t\t\t\tadicionandoTelefoneMicroServicoCustomerPBM(dddCelular,'M',celular,idMongo);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(document.getElementById('idTelefoneRes').value != null && document.getElementById('idTelefoneCel').value != null){\r\n");
      out.write("\t\t\t\t\t\teditarTelefoneBPMMiscroServico('R', dddFixo, fixo);\r\n");
      out.write("\t\t\t\t\t\teditarTelefoneBPMMiscroServico('M', dddCelular, celular);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\teditarDadosPrincipaisCustomerPBMMicroServico(cdFilial);\r\n");
      out.write("\t\t\t\t\t\teditarEnderecoBPMMicroServico();\r\n");
      out.write("\t\t\t\t\t\teditarDadosContatoPbm();\r\n");
      out.write("\t\t\t\t\tvar prof = {\r\n");
      out.write("\t\t\t\t\t\t\t'codigo': document.getElementById('medicoCrm').value,\r\n");
      out.write("\t\t\t\t\t\t\t'uf': document.getElementById('medicoUf').value,\r\n");
      out.write("\t\t\t\t\t\t\t'nome': document.getElementById('medicoNome').value\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\tparent.cuponavelSevenPdv.setProfissional(prof);\r\n");
      out.write("\t\t\t\t\tparent.cuponavelSevenPdv.setCartaoPbm(document.getElementById('cartaoPbm').value);\r\n");
      out.write("\t\t\t\t\tparent.fecharVmsFrame();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar dadosProdutoModal = JSON.parse(localStorage.getItem('dadosProdutoModal'))\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif($j(\"#cdPbm\").val() == \"7\" && dadosProdutoModal != null){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar prof = {\r\n");
      out.write("\t\t\t\t\t\t'codigo': document.getElementById('medicoCrm').value,\r\n");
      out.write("\t\t\t\t\t\t'uf': document.getElementById('medicoUf').value,\r\n");
      out.write("\t\t\t\t\t\t'nome': document.getElementById('medicoNome').value,\r\n");
      out.write("\t\t\t\t\t\t'tipoConselho': ''\r\n");
      out.write("\t\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tparent.cuponavelFuncional.setProfissional(prof);\r\n");
      out.write("\t\t\t\t\t\tvar resultCadastrarCliente = parent.cuponavelFuncional.cadastrarClientePrograma(dadosProdutoModal,$j(\"#cdEmpresaPbm\").val(),$j(\"#cdPbm\").val());\r\n");
      out.write("\t\t\t\t\t\tstopCuponavelLoadingAnimation($j(\"#cdProduto\").val());\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function stringTrim(texto) {\r\n");
      out.write("\t\t        return texto.replace(/^\\s+|\\s+$/g,\"\");\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    function maskIt(w,e,m,r,a) {\r\n");
      out.write("\t\t        // Cancela se o evento for Backspace\r\n");
      out.write("\t\t        if (!e) var e = window.event\r\n");
      out.write("\t\t        if (e.keyCode) code = e.keyCode;\r\n");
      out.write("\t\t        else if (e.which) code = e.which;\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        // Variaveis da funcao\r\n");
      out.write("\t\t        var txt  = (!r) ? w.value.replace(/[^\\d]+/gi,'') : w.value.replace(/[^\\d]+/gi,'').reverse();\r\n");
      out.write("\t\t        var mask = (!r) ? m : m.reverse();\r\n");
      out.write("\t\t        var pre  = (a ) ? a.pre : \"\";\r\n");
      out.write("\t\t        var pos  = (a ) ? a.pos : \"\";\r\n");
      out.write("\t\t        var ret  = \"\";\r\n");
      out.write("\r\n");
      out.write("\t\t        if(code == 9 || code == 8 || txt.length == mask.replace(/[^#]+/g,'').length) return false;\r\n");
      out.write("\r\n");
      out.write("\t\t        // Loop na mascara para aplicar os caracteres\r\n");
      out.write("\t\t        for(var x=0,y=0, z=mask.length;x<z && y<txt.length;) {\r\n");
      out.write("\t\t\t\t\tif (mask.charAt(x)!='#') {\r\n");
      out.write("\t\t\t\t\t\tret += mask.charAt(x); x++;\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tret += txt.charAt(y); y++; x++;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        // Retorno da funcao\r\n");
      out.write("\t\t        ret = (!r) ? ret : ret.reverse()        \r\n");
      out.write("\t\t        w.value = pre+ret+pos;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t// Novo metodo para o objeto 'String'\r\n");
      out.write("\t\t\tString.prototype.reverse = function(){\r\n");
      out.write("\t\t\t\treturn this.split('').reverse().join('');\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t$j(document).ready(function() {\r\n");
      out.write("\t\t\t\tif(document.getElementById('dataNascimento').value != ''){\r\n");
      out.write("\t\t\t\t\t    var arrDataIni = document.getElementById('dataNascimento').value.split(\"/\");\r\n");
      out.write("\t\t\t\t\t    return document.getElementById('dataNascimento').value = (\"**/\").concat(arrDataIni[1]).concat(\"/\").concat(arrDataIni[2]);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif ($j('#tipoInclusaoForm').val() === 'ApenasRaia') {\r\n");
      out.write("\t\t\t\t\t$j('#acaoForm').val('gravarClientRaiaDrogasil');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t<script type=\"text/javascript\" DEFER=\"DEFER\" src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" DEFER=\"DEFER\" src=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" charset=\"UTF-8\"></script>\r\n");
      out.write("\t\t      \r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" bgcolor=\"#F5FAFD\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t  <!-- <form action=\"ValidarDadosClientePbmrServlet\" method=\"post\" name=\"formCadastro\" onSubmit=\"return validarForm(this)\" > -->\r\n");
      out.write("\t  <!-- <form action=\"ValidarDadosClientePbmrServlet\" method=\"post\" name=\"formCadastro\" > -->\r\n");
      out.write("\t       <input type=\"hidden\" name=\"acao\" id=\"acaoForm\" value=\"gravarClient\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"idCliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"tipoLogradouro\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.tipoLogradouro}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"cdProduto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"precoBruto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${precoBruto}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"precoLiquido\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${precoLiquido}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"isContatos\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isContatos}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"nrSequenciaEndereco\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"nroCartao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nroCartao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"tipoInclusao\" id=\"tipoInclusaoForm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoInclusao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"cdEmpresaPbm\" id=\"cdEmpresaPbm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdEmpresaPbm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t       <input type=\"hidden\" name=\"cdFilial\" id=\"cdFilial\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdFilial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("               <input type=\"hidden\" name=\"cdPbm\" id=\"cdPbm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdPbm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t   <input type=\"hidden\" name=\"idCustomerMongo\" id=\"idCustomerMongo\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCustomerMongo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("\t       <table id=\"tableCadastroCliente\" width=\"98%\" border=\"0\" align=\"center\" cellpadding=\"5\" cellspacing=\"0\" bordercolor=\"#333399\">\r\n");
      out.write("\t\t    \t<tr height=\"25px\">\r\n");
      out.write("\t\t          \t<td colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td width=\"5px\"><span class=\"campo\">Nome:</span></td>\r\n");
      out.write("\t\t          <td width=\"150px\"><input id=\"txtNome\" name=\"nome\" class=\"campo\" size=\"40\" maxlength=\"60\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onkeyup=\"return upperCase(this);\"/></td>\r\n");
      out.write("\t\t          <td width=\"5px\"><span class=\"campo\">Sexo:</span></td>\r\n");
      out.write("                  ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t          ");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t          ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t          ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t          <td width=\"300px\"><input id=\"sexoF\" name=\"sexo\" class=\"campo\" type=\"radio\" value=\"M\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sexoMchecked}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" /> Masculino &nbsp;&nbsp;\r\n");
      out.write("\t\t              <input id=\"sexoM\" name=\"sexo\" class=\"campo\" type=\"radio\" value=\"F\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sexoFchecked}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" /> Feminino</td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td><span class=\"campo\">CPF:</span></td>\r\n");
      out.write("\t\t          <td><input id=\"cpf\" name=\"cpf\" class=\"campo\" size=\"40\" maxlength=\"60\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.cpf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\" style=\"background: #D8D8D8;\"/></td>\r\n");
      out.write("\t\t          <td colspan=\"2\"><span class=\"campo\">Data Nasc.*:</span>&nbsp;<input id=\"dataNascimento\" name=\"dataNascimento\" class=\"campo\" size=\"10\" maxlength=\"10\" type=\"text\" value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\" onkeyup=\"maskIt(this,event,'##/##/####')\"/> <font size=\"2\">(dd/mm/aaaa)</font></td>\r\n");
      out.write("\t\t          <input type=\"hidden\" id=\"dataNascimentoEsc\" name=\"dataNascimentoEsc\" class=\"campo\" size=\"10\" maxlength=\"10\" type=\"text\" value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_page_context))
        return;
      out.write("\" onkeyup=\"maskIt(this,event,'##/##/####')\"/>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t\t   <!--");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("-->\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <input id=\"idEndereco\" name=\"idEndereco\"  type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.idEndereco}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t          <td><span class=\"campo\">Endere&ccedil;o*:</span></td>\r\n");
      out.write("\t\t          <td><input id=\"endereco\" name=\"endereco\" class=\"campo\" size=\"40\" maxlength=\"60\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.logradouro}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t          <td><span class=\"campo\">Num.*:</span></td>\r\n");
      out.write("\t\t          <td><input id=\"numero\" name=\"numero\" class=\"campo\" size=\"6\" maxlength=\"6\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.numero}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td><span class=\"campo\">Compl.*:</span></td>\r\n");
      out.write("\t\t          <td><input id=\"complemento\" name=\"complemento\" class=\"campo\" size=\"20\" maxlength=\"20\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.complemento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t          <td><span class=\"campo\">Cep*:</span></td>\r\n");
      out.write("\t\t          <td colspan=\"4\" bordercolor=\"black\"><input id=\"cep\" name=\"cep\" class=\"campo\" size=\"9\" maxlength=\"9\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.cep}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onkeyup=\"maskIt(this,event,'#####-###')\" /></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td><span class=\"campo\">Bairro*:</span></td>\r\n");
      out.write("\t\t          <td colspan=\"3\"><input id=\"bairro\" name=\"bairro\" class=\"campo\" size=\"30\" maxlength=\"30\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.bairro}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td><span class=\"campo\">Cidade*:</span></td>\r\n");
      out.write("\t\t          <td><input id=\"cidade\" name=\"cidade\" class=\"campo\" size=\"30\" maxlength=\"30\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.cidade}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t          <td><span class=\"campo\">UF*:</span></td>\r\n");
      out.write("\t\t          <td><input id=\"uf\" name=\"uf\" class=\"campo\" size=\"2\" maxlength=\"2\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.uf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("                          <input id=\"idTelefoneRes\" name=\"idTelefoneRes\"  type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telResidencial.idTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                          <input id=\"idTelefoneCel\" name=\"idTelefoneCel\"  type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telCelular.idTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                          <input id=\"email-hidden\" name=\"email-hidden\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t          <td><span class=\"campo\">DDD*:</span></td>\r\n");
      out.write("\t\t          <td><input id=\"dddTelefone\" name=\"dddTelefone\" class=\"campo\" size=\"2\" maxlength=\"2\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telResidencial.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onkeyup=\"maskIt(this,event,'##')\"/>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t              <span class=\"campo\">Telefone*:</span>&nbsp;<input id=\"telefone\" name=\"telefone\" class=\"campo\" size=\"12\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telResidencial.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  onkeyup=\"maskIt(this,event,'####-####')\"/>\r\n");
      out.write("\t\t          <td><span class=\"campo\">DDD*:</span></td>\r\n");
      out.write("\t\t          <td><input id=\"dddCelular\" name=\"dddCelular\" class=\"campo\" size=\"2\" maxlength=\"2\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telCelular.nrPrefixo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onkeyup=\"maskIt(this,event,'##')\"/>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t              Celular*:&nbsp;<input id=\"celular\" name=\"celular\" class=\"campo\" size=\"12\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telCelular.nrTelefone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  onkeyup=\"maskIt(this,event,'#####-####')\"/></td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td><span class=\"campo\">Email*:</span></td>\r\n");
      out.write("\t\t          <td colspan=\"3\"><input id=\"email\" name=\"email\" class=\"campo\" size=\"50\" maxlength=\"100\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\t\t          \r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t   ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t   ");
      if (_jspx_meth_c_005fif_005f8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t   ");
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t   \r\n");
      out.write("\r\n");
      out.write("\t\t\t   ");
      if (_jspx_meth_c_005fif_005f10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td>&nbsp;</td>\r\n");
      out.write("\r\n");
      out.write("\t\t          <td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\tCorreio:\r\n");
      out.write("\t\t\t\t\t<select id=\"contatoCorreio\" name=\"contatoCorreio\" onChange=\"validarContatoCorreio(this)\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">N&atilde;o</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.ctCorreio == '1' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Sim</option>\r\n");
      out.write("\t\t\t\t\t</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\tEmail:\r\n");
      out.write("\t\t\t\t\t<select id=\"contatoEmail\" name=\"contatoEmail\" onChange=\"validarContatoEmail(this)\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">N&atilde;o</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.ctEmail == '1' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Sim</option>\r\n");
      out.write("\t\t\t\t\t</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f12(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<select id=\"contatoCelular\" name=\"contatoCelular\" onChange=\"validarContatoCelular(this)\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">N&atilde;o</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.ctCelular == '1' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Sim</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t        ");
      if (_jspx_meth_c_005fif_005f13(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t           <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f14(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f15(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t   &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t   <select id=\"contatoPermissao\" name=\"contatoPermissao\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">N&atilde;o</option>\r\n");
      out.write("\t\t\t\t\t\t   \t<option selected=\"selected\" value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.ctPermissao == '1' ? 'selected=\"selected\"' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Sim</option>\r\n");
      out.write("\t\t\t\t\t   </select></font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t          <td colspan=\"4\" align=\"center\">\r\n");
      out.write("\t\t            <img id=\"imgLoad\" style=\"vertical-align: middle;display:none;\" src=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f16(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f17(_jspx_page_context))
        return;
      out.write("\t\t          \t\r\n");
      out.write("\t\t          \t<input type=\"button\" name=\"\" value=\"Sair\" onClick=\"parent.fecharVmsFrame()\">\r\n");
      out.write("\t\t      \t  </td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t      </table>\t       \t       \t       \t     \r\n");
      out.write("       </form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(11,38) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(12,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/js/jquery.postmessage.js");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(13,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/js/jquery-ui.min.js");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(14,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(21,40) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${terminalConsultaServicosUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(22,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdAuthorizatorCustomerUrl}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(23,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoCustomerMS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(577,52) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/js/base64.js");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(578,52) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/js/cadastro-cliente-pbm-microservico.js");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(582,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoCustomerMS == 'false'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t  <form action=\"ValidarDadosClientePbmrServlet\" method=\"post\" name=\"formCadastro\" onSubmit=\"return validarForm(this)\" >\r\n");
        out.write("\t\t");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(585,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoCustomerMS == 'true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t<form action=\"ValidarDadosClientePbmrServlet\" method=\"post\" name=\"formCadastro\" >\r\n");
        out.write("\t\t");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(608,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${habilitaIntegracaoSevenPdv}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t          \t\t\t<font size=\"4\" color=\"#A00000\">Cadastro de Cliente:</font>\r\n");
        out.write("\t\t\t\t\t\t");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(611,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not habilitaIntegracaoSevenPdv}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t          \t\t\t<font size=\"4\" color=\"#A00000\">Cadastro de Cliente VMS:</font>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(620,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("sexoMchecked");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(620,18) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/cadastroClientePbmr.jsp(620,18) ''",_el_expressionfactory.createValueExpression("",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(621,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("sexoFchecked");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(621,12) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/cadastroClientePbmr.jsp(621,12) ''",_el_expressionfactory.createValueExpression("",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(622,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.sexo == 'M'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                      ");
        if (_jspx_meth_c_005fset_005f2(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t              ");
        if (_jspx_meth_c_005fset_005f3(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t          ");
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

  private boolean _jspx_meth_c_005fset_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(623,22) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("sexoMchecked");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(623,22) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/cadastroClientePbmr.jsp(623,22) 'checked='checked''",_el_expressionfactory.createValueExpression("checked='checked'",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(624,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setVar("sexoFchecked");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(624,16) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/cadastroClientePbmr.jsp(624,16) ''",_el_expressionfactory.createValueExpression("",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
    if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(626,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.sexo == 'F'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                      ");
        if (_jspx_meth_c_005fset_005f4(_jspx_th_c_005fif_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t              ");
        if (_jspx_meth_c_005fset_005f5(_jspx_th_c_005fif_005f5, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t          ");
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

  private boolean _jspx_meth_c_005fset_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(627,22) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setVar("sexoMchecked");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(627,22) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/cadastroClientePbmr.jsp(627,22) ''",_el_expressionfactory.createValueExpression("",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f4 = _jspx_th_c_005fset_005f4.doStartTag();
    if (_jspx_th_c_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(628,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f5.setVar("sexoFchecked");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(628,16) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f5.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/cadastroClientePbmr.jsp(628,16) 'checked='checked''",_el_expressionfactory.createValueExpression("checked='checked'",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f5 = _jspx_th_c_005fset_005f5.doStartTag();
    if (_jspx_th_c_005fset_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(636,180) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setType("date");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(636,180) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(636,180) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataNascimento}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(637,139) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setType("date");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(637,139) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setPattern("dd/MM/yyyy");
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(637,139) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.dataNascimento}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(639,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${habilitaIntegracaoSevenPdv}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("-->\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td><span class=\"campo\">Cart&atilde;o Pbm:</span></td>\r\n");
        out.write("\t\t\t\t\t   <td><input id=\"cartaoPbm\" name=\"cartaoPbm\" class=\"campo\" size=\"40\" maxlength=\"20\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartaoPbm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  onkeyup=\"maskIt(this,event,'####################')\"/></td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t   <!--");
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

  private boolean _jspx_meth_c_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(684,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdPbm == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td colspan=\"4\" class=\"separador-linha\">\r\n");
        out.write("\t\t\t\t\t\t   <b>Dados do M&eacute;dico</b>\r\n");
        out.write("\t\t\t\t\t   </td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td><span class=\"campo\">CRM:&nbsp;</span></td>\r\n");
        out.write("\t\t\t\t\t   <td colspan=\"5\"><input id=\"medicoCrm\" name=\"medicoCrm\" class=\"campo\" size=\"10\" maxlength=\"10\" onkeyup=\"maskIt(this,event,'####################')\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.crMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t\t\t   \t\t&nbsp;UF:&nbsp;<select name=\"medicoUf\" id=\"medicoUf\">\r\n");
        out.write("\t    \t                                <option value=\"0\" selected=\"selected\">Selecione</option><option value=\"AC\">AC</option>\r\n");
        out.write("\t\t\t                                <option value=\"AL\">AL</option><option value=\"AM\">AM</option>\r\n");
        out.write("\t\t\t                                <option value=\"AP\">AP</option><option value=\"BA\">BA</option>\r\n");
        out.write("\t\t\t                                <option value=\"CE\">CE</option><option value=\"DF\">DF</option>\r\n");
        out.write("\t\t\t                                <option value=\"ES\">ES</option><option value=\"GO\">GO</option>\r\n");
        out.write("\t\t\t                                <option value=\"MA\">MA</option><option value=\"MG\">MG</option>\r\n");
        out.write("\t\t\t                                <option value=\"MS\">MS</option><option value=\"MT\">MT</option>\r\n");
        out.write("\t\t\t                                <option value=\"PA\">PA</option><option value=\"PB\">PB</option>\r\n");
        out.write("\t\t\t                                <option value=\"PE\">PE</option><option value=\"PI\">PI</option>\r\n");
        out.write("\t\t\t                                <option value=\"PR\">PR</option><option value=\"RJ\">RJ</option>\r\n");
        out.write("\t\t\t                                <option value=\"RN\">RN</option><option value=\"RS\">RS</option>\r\n");
        out.write("\t\t\t                                <option value=\"RO\">RO</option><option value=\"RR\">RR</option>\r\n");
        out.write("\t\t\t                                <option value=\"SC\">SC</option><option value=\"SE\">SE</option>\r\n");
        out.write("\t\t\t                                <option value=\"SP\">SP</option><option value=\"TO\">TO</option>\r\n");
        out.write("                           \t\t\t\t</select>\r\n");
        out.write("        \t\t\t\t&nbsp;<img onclick=\"buscaMedico()\" id=\"imgLupaCrm\"  title=\"Buscar Medico\" src=\"/tc-core-portlets_1.0/images/buttons/search-2-16.png\" style=\"cursor:pointer\" />\r\n");
        out.write("        \t\t\t\t\t  <img id=\"imgCrmLoad\" style=\"vertical-align: middle; display: none;\" src=\"/tc-core-portlets_1.0/images/ajaxLoader.gif\" />\r\n");
        out.write("\t\t\t\t\t\t   &nbsp;&nbsp;&nbsp;Nome:&nbsp;<select name=\"medicoNome\" id=\"medicoNome\" class=\"medicoNome\" style=\"height: 19px;width: 300px\"></select>\r\n");
        out.write("\t\t\t\t\t   </td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td colspan=\"4\" class=\"separador-linha\">\r\n");
        out.write("\t\t\t\t\t\t   <b>Permiss&atilde;o</b>\r\n");
        out.write("\t\t\t\t\t   </td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td></td>\r\n");
        out.write("\t\t\t\t\t   <td width=\"\" colspan=\"3\"><font size=\"2\">Autoriza a Ind&uacute;stria enviar gratuitamente informa&ccedil;&otilde;es sobre sa&uacute;de e seu tratamento?</font></td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t   ");
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

  private boolean _jspx_meth_c_005fif_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(725,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdPbm == 7}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t   \t\t<tr>\r\n");
        out.write("\t\t\t\t\t   <td colspan=\"4\" class=\"separador-linha\">\r\n");
        out.write("\t\t\t\t\t\t   <b>Dados do M&eacute;dico</b>\r\n");
        out.write("\t\t\t\t\t   </td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t   \t   <td><span class=\"campo\">&nbsp;&nbsp;</span></td>\r\n");
        out.write("\t\t\t\t   \t   <td colspan=\"5\"><select id=\"tpCr\" name=\"tpCr\" onchange=\"habilitaCamposCRM(this.value)\"><option value=\"0\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.tpMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">CRM</option><option value=\"1\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.tpMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">CRO</option></select>\r\n");
        out.write("\t\t\t\t\t   <input id=\"medicoCrm\" name=\"medicoCrm\" class=\"campo\" size=\"10\" maxlength=\"10\" onkeyup=\"maskIt(this,event,'####################')\" style=\"width:60px;\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.crMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t\t\t   &nbsp;UF:&nbsp;<select name=\"medicoUf\" id=\"medicoUf\" style=\"width:85px;\">\r\n");
        out.write("\t    \t                                <option value=\"0\" selected=\"selected\">Selecione</option><option value=\"AC\">AC</option>\r\n");
        out.write("\t\t\t                                <option value=\"AL\">AL</option><option value=\"AM\">AM</option>\r\n");
        out.write("\t\t\t                                <option value=\"AP\">AP</option><option value=\"BA\">BA</option>\r\n");
        out.write("\t\t\t                                <option value=\"CE\">CE</option><option value=\"DF\">DF</option>\r\n");
        out.write("\t\t\t                                <option value=\"ES\">ES</option><option value=\"GO\">GO</option>\r\n");
        out.write("\t\t\t                                <option value=\"MA\">MA</option><option value=\"MG\">MG</option>\r\n");
        out.write("\t\t\t                                <option value=\"MS\">MS</option><option value=\"MT\">MT</option>\r\n");
        out.write("\t\t\t                                <option value=\"PA\">PA</option><option value=\"PB\">PB</option>\r\n");
        out.write("\t\t\t                                <option value=\"PE\">PE</option><option value=\"PI\">PI</option>\r\n");
        out.write("\t\t\t                                <option value=\"PR\">PR</option><option value=\"RJ\">RJ</option>\r\n");
        out.write("\t\t\t                                <option value=\"RN\">RN</option><option value=\"RS\">RS</option>\r\n");
        out.write("\t\t\t                                <option value=\"RO\">RO</option><option value=\"RR\">RR</option>\r\n");
        out.write("\t\t\t                                <option value=\"SC\">SC</option><option value=\"SE\">SE</option>\r\n");
        out.write("\t\t\t                                <option value=\"SP\">SP</option><option value=\"TO\">TO</option>\r\n");
        out.write("                           \t\t\t\t</select>\r\n");
        out.write("        \t\t\t\t    &nbsp;<img onclick=\"buscaMedico()\" id=\"imgLupaCrm\"  title=\"Buscar Medico\" src=\"/tc-core-portlets_1.0/images/buttons/search-2-16.png\" style=\"cursor:pointer\" />\r\n");
        out.write("        \t\t\t\t   <img id=\"imgCrmLoad\" style=\"vertical-align: middle; display: none;\" src=\"/tc-core-portlets_1.0/images/ajaxLoader.gif\" />\r\n");
        out.write("\t\t\t\t\t\t   &nbsp;&nbsp;&nbsp;<label id=\"labelNome\">Nome:&nbsp;</label><select name=\"medicoNome\" id=\"medicoNome\" class=\"medicoNome\" style=\"height: 19px;width: 300px\"></select>\r\n");
        out.write("\t\t\t\t\t   </td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td colspan=\"4\" class=\"separador-linha\">\r\n");
        out.write("\t\t\t\t\t\t     <b>Permiss&atilde;o</b>\r\n");
        out.write("\t\t\t\t\t   </td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td></td>\r\n");
        out.write("\t\t\t\t\t   <td width=\"\" colspan=\"3\"><font size=\"2\">Autoriza a Ind&uacute;stria enviar gratuitamente informa&ccedil;&otilde;es sobre sa&uacute;de e seu tratamento?</font></td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t   ");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(766,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdPbm == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t   \t\t<tr>\r\n");
        out.write("\t\t\t\t\t   <td colspan=\"4\" class=\"separador-linha\">\r\n");
        out.write("\t\t\t\t\t\t  <b>Dados do M&eacute;dico</b>\r\n");
        out.write("\t\t\t\t\t   </td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t   \t   <td><span class=\"campo\">&nbsp;&nbsp;</span></td>\r\n");
        out.write("\t\t\t\t   \t   <td colspan=\"5\"><select id=\"tpCr\" name=\"tpCr\" onchange=\"habilitaCamposCRMEpharma(this.value)\"><option value=\"1\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.tpMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">CRM</option><option value=\"2\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.tpMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(">CRO</option></select>\r\n");
        out.write("\t\t\t\t\t   <input id=\"medicoCrm\" name=\"medicoCrm\" class=\"campo\" size=\"10\" maxlength=\"10\" onkeyup=\"maskIt(this,event,'####################')\" style=\"width:60px;\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.crMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t\t\t   &nbsp;UF:&nbsp;<select name=\"medicoUf\" id=\"medicoUf\" style=\"width:85px;\">\r\n");
        out.write("\t    \t                                <option value=\"\" selected=\"selected\">Selecione</option><option value=\"AC\">AC</option>\r\n");
        out.write("\t\t\t                                <option value=\"AL\">AL</option><option value=\"AM\">AM</option>\r\n");
        out.write("\t\t\t                                <option value=\"AP\">AP</option><option value=\"BA\">BA</option>\r\n");
        out.write("\t\t\t                                <option value=\"CE\">CE</option><option value=\"DF\">DF</option>\r\n");
        out.write("\t\t\t                                <option value=\"ES\">ES</option><option value=\"GO\">GO</option>\r\n");
        out.write("\t\t\t                                <option value=\"MA\">MA</option><option value=\"MG\">MG</option>\r\n");
        out.write("\t\t\t                                <option value=\"MS\">MS</option><option value=\"MT\">MT</option>\r\n");
        out.write("\t\t\t                                <option value=\"PA\">PA</option><option value=\"PB\">PB</option>\r\n");
        out.write("\t\t\t                                <option value=\"PE\">PE</option><option value=\"PI\">PI</option>\r\n");
        out.write("\t\t\t                                <option value=\"PR\">PR</option><option value=\"RJ\">RJ</option>\r\n");
        out.write("\t\t\t                                <option value=\"RN\">RN</option><option value=\"RS\">RS</option>\r\n");
        out.write("\t\t\t                                <option value=\"RO\">RO</option><option value=\"RR\">RR</option>\r\n");
        out.write("\t\t\t                                <option value=\"SC\">SC</option><option value=\"SE\">SE</option>\r\n");
        out.write("\t\t\t                                <option value=\"SP\">SP</option><option value=\"TO\">TO</option>\r\n");
        out.write("                           \t\t\t\t</select>\r\n");
        out.write("        \t\t\t\t    &nbsp;<img onclick=\"buscaMedico()\" id=\"imgLupaCrm\"  title=\"Buscar Medico\" src=\"/tc-core-portlets_1.0/images/buttons/search-2-16.png\" style=\"cursor:pointer\" />\r\n");
        out.write("        \t\t\t\t   <img id=\"imgCrmLoad\" style=\"vertical-align: middle; display: none;\" src=\"/tc-core-portlets_1.0/images/ajaxLoader.gif\" />\r\n");
        out.write("\t\t\t\t\t\t   &nbsp;&nbsp;&nbsp;<label id=\"labelNome\">Nome:&nbsp;</label><select name=\"medicoNome\" id=\"medicoNome\" class=\"medicoNome\" style=\"height: 19px;width: 300px\"></select>\r\n");
        out.write("\t\t\t\t\t   </td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td colspan=\"4\" class=\"separador-linha\">\r\n");
        out.write("\t\t\t\t\t\t   <b>Permissão</b>\r\n");
        out.write("\t\t\t\t\t   </td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td></td>\r\n");
        out.write("\t\t\t\t\t   <td width=\"\" colspan=\"3\"><font size=\"2\">Autoriza a Indústria enviar gratuitamente informações sobre saúde e seu tratamento?</font></td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t   ");
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

  private boolean _jspx_meth_c_005fif_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(810,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not habilitaIntegracaoSevenPdv}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td><span class=\"campo\">M&eacute;dico:</span></td>\r\n");
        out.write("\t\t\t\t\t   <td colspan=\"3\">CRM:&nbsp;<input id=\"medicoCrm\" name=\"medicoCrm\" class=\"campo\" size=\"10\" maxlength=\"10\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.crMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t\t\t   &nbsp;UF:&nbsp;<input id=\"medicoUf\" name=\"medicoUf\" class=\"campo\" size=\"2\" maxlength=\"2\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.ufMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t   &nbsp;&nbsp;&nbsp;Nome:&nbsp;<input id=\"medicoNome\" name=\"medicoNome\" class=\"campo\" size=\"50\" maxlength=\"50\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contato.nmMedico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/></td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t\t   <tr>\r\n");
        out.write("\t\t\t\t\t   <td><span class=\"campo\">Permiss&tilde;o:</span></td>\r\n");
        out.write("\t\t\t\t\t   <td width=\"\" colspan=\"3\"><font size=\"2\">Autoriza a Novartis enviar gratuitamente informa&ccedil;&otilde;es sobre sa&uacute;de e seu tratamento?</font></td>\r\n");
        out.write("\t\t\t\t   </tr>\r\n");
        out.write("\t\t\t   ");
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

  private boolean _jspx_meth_c_005fif_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(836,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${habilitaIntegracaoSevenPdv}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\tCelular/SMS:\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(839,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not habilitaIntegracaoSevenPdv}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t    Celular:\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(848,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdEmpresaPbm == 500}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
    if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t        <tr>\r\n");
        out.write("\t\t\t        \t<td>&nbsp;</td>\r\n");
        out.write("\t\t\t        \t\t<td colspan=\"3\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<font size=\"2\">Termo do Programa*</br>\r\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"https://www.bayerparavoce.com.br\" target=\"_blank\">https://www.bayerparavoce.com.br</a></font>\r\n");
        out.write("\t\t\t        </tr>\r\n");
        out.write("\t\t\t\t");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(858,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${habilitaIntegracaoSevenPdv}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t   \t\t<td colspan=\"3\">\r\n");
        out.write("\t\t\t\t\t\t\t<font size=\"2\">Autoriza a Ind&uacute;stria ou empresas parceiras autorizadas a entrar em contato para saber sua opini&atilde;o sobre o programa, oferecer servi&ccedil;os gratuitos de apoio ao tratamento e realizar eventuais pesquisas?\r\n");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(862,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not habilitaIntegracaoSevenPdv}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
    if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<td colspan=\"3\">\r\n");
        out.write("\t\t\t\t\t\t\t<font size=\"2\">Autoriza a Novartis ou empresas parceiras autorizadas a entrar em contato para saber sua opini&atilde;o sobre o programa Vale Mais Sa&uacute;de, oferecer servi&ccedil;os gratuitos de apoio ao tratamento e realizar eventuais pesquisas?\r\n");
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

  private boolean _jspx_meth_c_005furl_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(874,82) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/images/ajaxLoader.gif");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(875,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoCustomerMS == 'true'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t        \t<input type=\"button\" class=\"buttonG\" name=\"vms\" id=\"vms\" value=\"Salvar\" onClick=\"validarForm(document.formCadastro);\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t\t\t\t\t");
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
    // /WEB-INF/jsp/cadastroClientePbmr.jsp(878,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lojaFilialVersaoCustomerMS == 'false'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
    if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t          \t<input type=\"submit\" class=\"buttonG\" name=\"vms\" id=\"vms\" value=\"Salvar\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t\t\t\t\t");
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
}
