package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class receitaCarimboPharmaConnection_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/portlet_2_0.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005factionURL;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005factionURL = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fportlet_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fportlet_005factionURL.release();
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<script type=\"text/javascript\" charset=\"UTF-8\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar arrayFilial = new Array();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction buscaNovoCep() {\r\n");
      out.write("\t\t\tvar cdCep = $j(\"#numCep\").val();\r\n");
      out.write("\t\t\tvar URL = contextoUrl + \"AjaxServlet?acao=CADASTRO_CLIENTE_BUSCAR_NOVO_ENDERECO&cdCep=\" + cdCep;\r\n");
      out.write("\t\t\tfuncaoDeRetornoAjax = retAjxBuscaEndereco;\r\n");
      out.write("\t\t\tajaxCall(URL);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction retAjxBuscaEndereco(ret) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (ret.substring(0,4) == \"ERRO\" ) {\r\n");
      out.write("\t\t\t\tjAlert('CEP n\\u00e3o encontrado.',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar retCep\t \t\t= ret.split(\"<C>\")[0];\r\n");
      out.write("\t\t\tvar retCidade \t\t= ret.split(\"<C>\")[1];\r\n");
      out.write("\t\t\tvar retBairro \t\t= ret.split(\"<C>\")[2];\r\n");
      out.write("\t\t\tvar retUf \t\t\t= ret.split(\"<C>\")[3];\r\n");
      out.write("\t\t\tvar retLogradouro \t= ret.split(\"<C>\")[4];\r\n");
      out.write("\r\n");
      out.write("\t\t\tif ( retBairro == 'null' ) {\r\n");
      out.write("\t\t\t\tretBairro = '';\r\n");
      out.write("\t\t\t}\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tpopulaNovoEndereco(retCep, retCidade, retBairro, retUf, retLogradouro);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction atualizarCliente() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tvar idCliente = '");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\tvar nome = $j(\"#txtNome\").val();\r\n");
      out.write("\t\t\tvar numRg = $j(\"#numRg\").val();\r\n");
      out.write("\t\t\tvar numDDD = $j(\"#numDDD\").val();\r\n");
      out.write("\t\t\tvar numTel = $j(\"#numTel\").val();\r\n");
      out.write("\t\t\tvar numTpTel = $j(\"#numTpFone\").val();\r\n");
      out.write("\t\t\tvar logra \t= removeAcento($j.trim($j(\"#txtLogra\").val()));\r\n");
      out.write("\t\t\tvar numero \t= $j.trim($j(\"#numNumero\").val());\r\n");
      out.write("\t\t\tvar bairro \t= removeAcento($j.trim($j(\"#txtBairro\").val()));\r\n");
      out.write("\t\t\tvar cep \t= $j.trim($j(\"#numCep\").val());\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\tvar cidade \t= removeAcento($j.trim($j(\"#txtCidade\").val()));\r\n");
      out.write("\t\t\tvar uf \t\t= $j.trim($j(\"#txtUf\").val());\r\n");
      out.write("\t\t\tvar complemento = removeAcento($j.trim($j(\"#txtComplemento\").val()));\r\n");
      out.write("\t\t\tvar nrSequencia = '';\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar filial = getCookie(\"FILIAL\");\r\n");
      out.write("\t\t\tvar args = filial.split(\"%\");\r\n");
      out.write("\t\t\tvar cdFilial = args[0];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar oldNome = '");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\tvar oldNumRg = '");
      if (_jspx_meth_c_005fout_005f2(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\tvar oldTel \t\t= '");
      if (_jspx_meth_c_005fout_005f3(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\tvar oldDDD      = '");
      if (_jspx_meth_c_005fout_005f4(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\tvar oldTipoTelefone = '");
      if (_jspx_meth_c_005fout_005f5(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\tvar oldLogra = '");
      if (_jspx_meth_c_005fout_005f6(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\tvar oldNumero = '");
      if (_jspx_meth_c_005fout_005f7(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("            var oldComplemento = '");
      if (_jspx_meth_c_005fout_005f8(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\tvar oldBairro = '");
      if (_jspx_meth_c_005fout_005f9(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("            var oldCep = '");
      if (_jspx_meth_c_005fout_005f10(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("            var oldCidade = '");
      if (_jspx_meth_c_005fout_005f11(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("            var oldUf = '");
      if (_jspx_meth_c_005fout_005f12(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar camposAlterados =  oldDDD!=numDDD || oldTel!=numTel.replace('-','') || oldTipoTelefone!=numTpTel || oldNome!=nome || oldNumRg!=numRg\r\n");
      out.write("\t\t\t|| removeAcento(oldLogra)!=logra || oldNumero!=numero || removeAcento(oldComplemento)!=complemento || removeAcento(oldBairro)!=bairro\r\n");
      out.write("\t\t\t|| oldCep!=cep || removeAcento(oldCidade)!=cidade || oldUf!=uf;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif ( !camposAlterados) {\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif( $j(\"#nrSeqEndereco\") ) {\r\n");
      out.write("\t\t\t\tnrSequencia = $j(\"#nrSeqEndereco\").text();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar URL = contextoUrl + \"AjaxServlet?acao=CADASTRO_CLIENTE_ATUALIZAR_ENDERECO_TELEFONE&numTel=\" + numTel \r\n");
      out.write("\t\t\t\t\t\t\t\t  + \"&numDDD=\" + numDDD + \"&numTpTel=\" + numTpTel + \"&idCliente=\"+idCliente \r\n");
      out.write("\t\t\t\t\t\t\t\t  + \"&logra=\" + logra   + \"&numero=\" + numero + \"&bairro=\" + bairro + \"&cep=\" + cep\r\n");
      out.write("\t\t\t\t\t\t\t\t  + \"&cidade=\" + cidade + \"&uf=\" + uf  + \"&nrSequencia=\" + nrSequencia + \"&complemento=\" + complemento\r\n");
      out.write("\t\t\t\t\t\t\t\t  + \"&nome=\" + nome + \"&numRg=\" + numRg + \"&cdFilial=\" + cdFilial;\r\n");
      out.write("\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\tfuncaoDeRetornoAjax = retAjxAtualizarCliente;\r\n");
      out.write("\t\t\tajaxCall(URL);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction retAjxAtualizarCliente(ret) {\r\n");
      out.write("\t\t\tif (ret.substring(0,4) == \"ERRO\" ) {\r\n");
      out.write("\t\t\t\tjAlert('Cliente n\\u00e3o atualizado.',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction getCookie(key) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar search = key + \"=\";\r\n");
      out.write("\t\t\tvar returnvalue = \"\";\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (document.cookie.length > 0) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\toffset = document.cookie.indexOf(search);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif (offset != -1) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\toffset += search.length;\r\n");
      out.write("\t\t\t\t\tend = document.cookie.indexOf(\";\", offset);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (end == -1)\r\n");
      out.write("\t\t\t\t\t\tend = document.cookie.length;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\treturnvalue = unescape(document.cookie.substring(offset, end));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\treturn returnvalue;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction populaNovoEndereco(retCep, retCidade, retBairro, retUf, retLogradouro) {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar formLogra \t= document.getElementById('txtLogra');\r\n");
      out.write("\t\t\tvar formBairro \t= document.getElementById('txtBairro');\r\n");
      out.write("\t\t\tvar formCep \t= document.getElementById('numCep');\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\tvar formCidade \t= document.getElementById('txtCidade');\r\n");
      out.write("\t\t\tvar formUf \t\t= document.getElementById('txtUf');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tformLogra.value \t= retLogradouro;\r\n");
      out.write("\t\t\tformBairro.value \t= retBairro;\r\n");
      out.write("\t\t\tformCep.value \t\t= retCep;\r\n");
      out.write("\t\t\tformCidade.value \t= retCidade;\r\n");
      out.write("\t\t\tformUf.value \t\t= retUf;\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\tMascara(document.getElementById('numCep'), Cep, 1);\r\n");
      out.write("\r\n");
      out.write("\t\t\tformBairro.disabled = false;\r\n");
      out.write("\t\t\tformCidade.disabled = false;\r\n");
      out.write("\t\t\tformUf.disabled \t= false;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\tfunction validarCampos() {\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\tif ($j.trim($j('#txtNome').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Nome deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#txtNome\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#selectTipoDocumento').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Tipo Documento deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#selectTipoDocumento\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\t\t\t\t\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#numRg').val()) === \"\" || $j.trim($j('#numRg').val()).length < 7) {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Documento deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#numRg\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#ufRg').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Emissor deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#ufRg\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\t\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#txtUfEmissor').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo UF Emissor deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#txtUfEmissor\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#dtNasc').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Dt Nasc deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#dtNasc\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\t\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#numCep').val()).replace(/\\.|\\-/g, '').length > 8) {\r\n");
      out.write("\t\t\t\t\tjAlert('O tamanho do campo CEP são de 8 caracteres n\\u00famericos',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#numCep\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#numNumero').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Numero deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#numNumero\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#txtLogra').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Logradouro deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#txtLogra\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#txtBairro').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Bairro deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#txtBairro\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#txtCidade').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Cidade deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#txtCidade\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#txtUf').val()) === \"\" ) {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo UF deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#txtUf\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#numDDD').val()) === \"\" || $j.trim($j('#numDDD').val()).length < 2) {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo DDD deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#numDDD\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#numTel').val()) === \"\" || $j.trim($j('#numTel').val()).length < 8) {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Telefone deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#numTel\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#numTpFone').val()) < 1) {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Tipo de Telefone deve ser preenchido! (Residencial, Comercial ou Celular)',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#numTpFone\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if($j.trim($j('#txtConselho').val()) === \"\"){\r\n");
      out.write("\t\t\t\t\tjAlert('O campo Conselho CRM deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#txtConselho\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\t\t\t\t\r\n");
      out.write("\t\t\t\t}else if($j.trim($j('#txtUfCrm').val()) === \"\"){\r\n");
      out.write("\t\t\t\t\tjAlert('O campo UF CRM deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#txtUfCrm\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}else if($j.trim($j('#dtRec').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\tjAlert('O campo data receita de ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#dtRec\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t/**\r\n");
      out.write("\t\t\t* Validar data da receita e o formatado DD/MM/YYYY\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t\tvar val = $j.trim($j('#dtRec').val());\t\t\t\r\n");
      out.write("\t\t\t\tvar patternData = /^(((0[1-9]|[12][0-9]|3[01])([-.\\/])(0[13578]|10|12)([-.\\/])(\\d{4}))|(([0][1-9]|[12][0-9]|30)([-.\\/])(0[469]|11)([-.\\/])(\\d{4}))|((0[1-9]|1[0-9]|2[0-8])([-.\\/])(02)([-.\\/])(\\d{4}))|((29)(\\.|-|\\/)(02)([-.\\/])([02468][048]00))|((29)([-.\\/])(02)([-.\\/])([13579][26]00))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][0][48]))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][2468][048]))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][13579][26])))$/;;\t\t\t\r\n");
      out.write("\t\t\t\tif(!patternData.test(val)){\r\n");
      out.write("\t\t\t\t\tjAlert('O campo data da receita inv\\u00e1lido',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\treturn;\t\t\t\t\r\n");
      out.write("\t\t\t\t}\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t/**\r\n");
      out.write("\t\t\t* Validar preenchimento do campo CRM e campo nome do médico\r\n");
      out.write("\t\t\t*/\t\r\n");
      out.write("\t\t\t\tif (dsCrm == 'CRM') {\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif($j.trim($j('#txtCRM').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\t\tjAlert('O campo CRM deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t\t$j(\"#txtCRM\").focus();\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}else if ($j.trim($j('#inputCroCrmvRms').val()) === \"\"){ \r\n");
      out.write("\t\t\t\t\tjAlert('O campo CRM deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#inputCroCrmvRms\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t/**\r\n");
      out.write("\t\t\t* Validar preenchimento pelo CRM/CRO/CRMV/RMS o campo nome do médico\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (dsCrm == 'CRO' || dsCrm == 'CRMV' || dsCrm == 'RMS') {\r\n");
      out.write("\t            \tif ($j.trim($j('#inputMedicoNome').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\t\tjAlert('O campo nome do m\\u00e9dico deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t\t$j(\"#inputMedicoNome\").focus();\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t            \r\n");
      out.write("\t            } \t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t        /**\r\n");
      out.write("\t          * Validar campo data de nascimento do comprador\r\n");
      out.write("\t          */  \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t    var dataNascComp = $j.trim($j('#dtNasc').val());\t\t\t   \r\n");
      out.write("\t\t\t\tvar patternData = /^(((0[1-9]|[12][0-9]|3[01])([-.\\/])(0[13578]|10|12)([-.\\/])(\\d{4}))|(([0][1-9]|[12][0-9]|30)([-.\\/])(0[469]|11)([-.\\/])(\\d{4}))|((0[1-9]|1[0-9]|2[0-8])([-.\\/])(02)([-.\\/])(\\d{4}))|((29)(\\.|-|\\/)(02)([-.\\/])([02468][048]00))|((29)([-.\\/])(02)([-.\\/])([13579][26]00))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][0][48]))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][2468][048]))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][13579][26])))$/;;\r\n");
      out.write("\t\t\t\tif(!patternData.test(dataNascComp)){\r\n");
      out.write("\t\t\t\t    jAlert('O campo data de nascimento do comprador inv\\u00e1lido',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t$j(\"#dtNasc\").focus();\r\n");
      out.write("\t\t\t\t    return false;\r\n");
      out.write("\t\t\t\t}\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t        /**\r\n");
      out.write("\t\t\t* Validar campo nome do paciente, sexo e data nascimento se a cat for 5 e != CRMV\r\n");
      out.write("\t\t\t*/ \t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (cdCat == 5 && dsCrm != 'CRMV') {\r\n");
      out.write("\t\t\t  \t\tif ($j.trim($j('#txtNomePac').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\t\t\tjAlert('O campo Nome do Paciente deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t\t\t$j(\"#txtNomePac\").focus();\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#txtNomePac\").select();\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}else if ($j.trim($j('#dtNascPac').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\t\t\tjAlert('O campo Dt Nasc Paciente deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t\t\t$j(\"#dtNascPac\").focus();\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\t\r\n");
      out.write("\t\t\t\t\t\t}else if ($j.trim($j('#txtSexo').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\t\t\tjAlert('O campo Sexo do Paciente deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t\t\t$j(\"#txtSexo\").focus();\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar dataNasc = $j.trim($j('#dtNascPac').val());\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar patternData = /^(((0[1-9]|[12][0-9]|3[01])([-.\\/])(0[13578]|10|12)([-.\\/])(\\d{4}))|(([0][1-9]|[12][0-9]|30)([-.\\/])(0[469]|11)([-.\\/])(\\d{4}))|((0[1-9]|1[0-9]|2[0-8])([-.\\/])(02)([-.\\/])(\\d{4}))|((29)(\\.|-|\\/)(02)([-.\\/])([02468][048]00))|((29)([-.\\/])(02)([-.\\/])([13579][26]00))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][0][48]))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][2468][048]))|((29)([-.\\/])(02)([-.\\/])([0-9][0-9][13579][26])))$/;;\t\t\r\n");
      out.write("\t\t\t\t\t\tif(!patternData.test(dataNasc)){\r\n");
      out.write("\t\t\t\t\t\t\tjAlert('O campo data de nascimento do paciente inv\\u00e1lido',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\t\t\t\t\t\t\r\n");
      out.write("\t            }\t            \r\n");
      out.write("\t            \r\n");
      out.write("\t        /**\r\n");
      out.write("\t\t\t* Validar campo notificação para cat 1, 3 e 4\r\n");
      out.write("\t\t\t*/ \t\t            \r\n");
      out.write("\t            \r\n");
      out.write("\t            if (cdCat == 1 || cdCat == 3 || cdCat == 4) {\r\n");
      out.write("\t            \tif ($j.trim($j('#nrNotif').val()) === \"\") {\r\n");
      out.write("\t\t\t\t\t\tjAlert('O campo notifica\\u00e7\\u00e3o deve ser preenchido!',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t\t$j(\"#nrNotif\").focus();\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t            \r\n");
      out.write("\t            }   \t        \t               \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t        /**\r\n");
      out.write("\t\t\t* Validar se a data da receita for maior que a data atual\r\n");
      out.write("\t\t\t*/ \t   \t        \t               \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar dataReceita = document.getElementById('dtRec').value;\r\n");
      out.write("\t\t\t\tvar partesData = dataReceita.split(\"/\");\r\n");
      out.write("\t\t        var data = new Date(partesData[2], partesData[1] - 1, partesData[0]);\t\t        \r\n");
      out.write("\r\n");
      out.write("\t\t        if (data > new Date()){\r\n");
      out.write("\t\t        \tjAlert('ATEN\\u00c7\\u00c3O! O item data da receita n\\u00e3o pode ser maior que a data atual!', \"Receita Carimbo\");\r\n");
      out.write("\t\t        \t$j(\"#dtRec\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t    /**\r\n");
      out.write("\t\t\t* Valida se a cat for 5 não aceitar receita maior que 10 dias \r\n");
      out.write("\t\t\t* e as demais cat a data da receita não pode maior do que 30 dias \r\n");
      out.write("\t\t\t*/ \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\tvar date= new Date();\t\t\t\r\n");
      out.write("\t\t\t\t\tvar dataReceita = document.getElementById('dtRec').value;\r\n");
      out.write("\t\t\t\t\tvar partesData = dataReceita.split(\"/\");\r\n");
      out.write("\t\t\t        var data = new Date(partesData[2], partesData[1] - 1, partesData[0]); \t        \t\r\n");
      out.write("\t\t\t        var timeDiff = Math.abs(date.getTime() - data.getTime());\r\n");
      out.write("\t\t            var diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));        \r\n");
      out.write("\t\t\t if (cdCat == 5 && flProdutoContinuo == 1){       \r\n");
      out.write("\t\t       \tif ((diffDays-1) > 90)\t{\r\n");
      out.write("\t\t       \t\tjAlert('ATEN\\u00c7\\u00c3O! Data de valida\\u00e7\\u00e3o maior do que 90 dias!', \"Receita Carimbo\");\r\n");
      out.write("\t\t       \t\t$j(\"#dtRec\").focus();\r\n");
      out.write("\t\t\t\t    return false;\r\n");
      out.write("\t\t       \t}\r\n");
      out.write("\t\t     }else if (cdCat == 5){\t      \r\n");
      out.write("\t\t\t       \tif ((diffDays-1) > 10)\t{\r\n");
      out.write("\t\t\t       \t\tjAlert('ATEN\\u00c7\\u00c3O! Data de valida\\u00e7\\u00e3o maior do que 10 dias!', \"Receita Carimbo\");\r\n");
      out.write("\t\t\t       \t\t$j(\"#dtRec\").focus();\r\n");
      out.write("\t\t\t\t\t    return false;\r\n");
      out.write("\t\t\t       \t}\r\n");
      out.write("\t\t\t    }else {\r\n");
      out.write("\t\t\t   \t\tif ((diffDays-1) > 30) {\r\n");
      out.write("\t\t\t   \t\t\tjAlert('ATEN\\u00c7\\u00c3O! Data de valida\\u00e7\\u00e3o maior do que 30 dias!', \"Receita Carimbo\");\r\n");
      out.write("\t\t\t       \t\t$j(\"#dtRec\").focus();\r\n");
      out.write("\t\t\t\t\t    return false;\r\n");
      out.write("\t\t\t   \t\t}\r\n");
      out.write("\t\t\t   \t\t\r\n");
      out.write("\t\t\t   }\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t/**\r\n");
      out.write("\t\t\t* Validar se a data de nascimento do paciente for maior que a data atual\r\n");
      out.write("\t\t\t*/ \t   \t        \t               \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar dataReceita = document.getElementById('dtNascPac').value;\r\n");
      out.write("\t\t\t\tvar partesData = dataReceita.split(\"/\");\r\n");
      out.write("\t\t        var data = new Date(partesData[2], partesData[1] - 1, partesData[0]);\t\t        \r\n");
      out.write("\r\n");
      out.write("\t\t        if (data > new Date()){\r\n");
      out.write("\t\t        \tjAlert('ATEN\\u00c7\\u00c3O! O item data de nascimento do paciente n\\u00e3o pode ser maior que a data atual!', \"Receita Carimbo\");\r\n");
      out.write("\t\t        \t$j(\"#dtRec\").focus();\t\t        \t\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t    /**\r\n");
      out.write("\t\t\t* Validar nome e sobrenome do  médico\r\n");
      out.write("\t\t\t*/ \t\r\n");
      out.write("\t\t\tif(document.getElementById('medicoNome').value == \"\") {\t        \r\n");
      out.write("\t\t        if (dsCrm == 'CRO' || dsCrm == 'RMS' || dsCrm == 'CRMV') {\t\t\t\t   \t\r\n");
      out.write("\t\t\t\t\tvar nome = document.getElementById('inputMedicoNome').value;\t\t   \r\n");
      out.write("\t\t\t\t      if(nome.trim().split(' ').length < 2){\r\n");
      out.write("\t\t\t\t      \tjAlert('ATEN\\u00c7\\u00c3O! Favor digitar Nome com o sobrenome do m\\u00e9dico', \"Receita Carimbo\");\r\n");
      out.write("\t\t\t        \t$j(\"#inputCroCrmvRms\").focus();\t\t        \t\r\n");
      out.write("\t\t\t\t\t\treturn false;\t\r\n");
      out.write("\t\t\t\t\t   }\t\t\t\t      \r\n");
      out.write("\t\t\t\t }\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t /**\r\n");
      out.write("\t\t\t* Validar nome e sobrenome do comprador\r\n");
      out.write("\t\t\t*/\t\t\t \r\n");
      out.write("\t\t\t  var nomeComprador = document.getElementById('txtNome').value;\t\t   \r\n");
      out.write("\t\t      if(nomeComprador.trim().split(' ').length < 2) {\r\n");
      out.write("\t\t      \tjAlert('ATEN\\u00c7\\u00c3O! Favor digitar Nome com o Sobrenome do Comprador', \"Receita Carimbo\");\r\n");
      out.write("\t        \t$j(\"#inputCroCrmvRms\").focus();\t\t        \t\r\n");
      out.write("\t\t\t\treturn false;\t\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t /**\r\n");
      out.write("\t\t\t* Validar nome e sobrenome do paciente\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t if (cdCat == 5 && dsCrm != 'CRMV'){\r\n");
      out.write("\t\t\t      var nomePaciente = document.getElementById('txtNomePac').value;\t\t\t  \t\t   \r\n");
      out.write("\t\t\t      if(nomePaciente.trim().split(' ').length < 2){\r\n");
      out.write("\t\t\t      \tjAlert('ATEN\\u00c7\\u00c3O! Favor digitar Nome com o Sobrenome do Paciente', \"Receita Carimbo\");\r\n");
      out.write("\t\t        \t$j(\"#inputCroCrmvRms\").focus();\t\t        \t\r\n");
      out.write("\t\t\t\t\treturn false;\t\t\t  \r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t }\t\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t  /**\r\n");
      out.write("\t\t\t* Validar nome e sobrenome do Médico quando o conselho for CRM\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t  \t\r\n");
      out.write("\t\t\tif(document.getElementById('medicoNome').value == \"\") {\t \r\n");
      out.write("\t\t\t\t if (dsCrm == 'CRM' && document.getElementById('inputMedicoNome').name == 'inputMedicoNome'){\r\n");
      out.write("\t\t\t\t \t var nome = document.getElementById('inputMedicoNome').value;\r\n");
      out.write("\t\t\t\t\t   \t   if(nome.trim().split(' ').length < 2) {\r\n");
      out.write("\t\t\t\t\t\t       jAlert('ATEN\\u00c7\\u00c3O! Favor digitar Nome com o sobrenome do m\\u00e9dico', \"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t           $j(\"#inputCroCrmvRms\").focus();\t\t        \t\r\n");
      out.write("\t\t\t\t\t\t\t   return false;\t\r\n");
      out.write("\t\t\t\t\t        }\r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t     }\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t       /**\r\n");
      out.write("\t\t\t* Validar campo receita digital\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t     if (document.getElementById('ch_Nao').checked == false && document.getElementById('ch_Sim').checked == false) {\t     \t                   \r\n");
      out.write("                var tbDialog = \"\";  \r\n");
      out.write("                    tbDialog = '<table><tr><td><h3 class=\"titulo\">N&atilde;o foi poss&iacute;vel continuar pois &eacute; necess&aacute;rio selecionar o tipo de receita digital. Caso a receita n&atilde;o seja digital, marque \"n&atilde;o\" e tente novamente. </h3></td></tr></table>'              \r\n");
      out.write("                    + '<table style=\"width:300px;background-color:#EDF0F0;border: 1px solid #FFFFFF\";>'                        \r\n");
      out.write("                    + '</table>';  \r\n");
      out.write("                                             \r\n");
      out.write("                document.getElementById('dialog-confirm-ReceitaDigital').innerHTML = tbDialog;                  \r\n");
      out.write("\t\t\t\t$( \"#dialog-confirm-ReceitaDigital\" ).dialog({\r\n");
      out.write("\t\t\t      resizable: false,\r\n");
      out.write("\t\t\t      height: \"auto\",\r\n");
      out.write("\t\t\t      width: 400,\r\n");
      out.write("\t\t\t      modal: true,\t\t\t      \t\t\t      \t      \r\n");
      out.write("\t\t\t      buttons: {\r\n");
      out.write("\t\t\t        \"Entendi\": function() {\r\n");
      out.write("\t\t\t          \t$( this ).dialog( \"close\" );\t\t\t          \r\n");
      out.write("\t\t\t        }\t\t        \r\n");
      out.write("\t\t\t      }\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t    $j(\"#ch_Nao\").focus();\t\r\n");
      out.write("\t\t\t    return false;\r\n");
      out.write("\t\t     } else if (document.getElementById('ch_Sim').checked == true && document.getElementById('ch_Nao').checked == false)\t{\t\t     \t\r\n");
      out.write("\t\t     \t\r\n");
      out.write("\t\t     \tif (document.getElementById('recDigital').value == \"\") {\r\n");
      out.write("\t\t     \t\t   jAlert('O campo receita digital deve ser selecionado!',\"Receita Carimbo\");\r\n");
      out.write("\t\t     \t\t   $j(\"#recDigital\").focus();\t\r\n");
      out.write("\t\t\t    \t\treturn false;\r\n");
      out.write("\t\t     \t}\r\n");
      out.write("\t\t     \treturn true;\r\n");
      out.write("\t\t     \r\n");
      out.write("\t\t     }\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tif (document.getElementById('txtUf').value != \"\") {\r\n");
      out.write("\t\t\t\t\tvar listUF = new Array(\"SP\",\"RJ\",\"MG\",\"PR\",\"RS\",\"ES\",\"CE\",\"PA\",\"AM\",\"PI\",\"SC\",\"BA\",\"AC\",\"RO\",\"RN\",\"TO\",\"MS\",\"DF\",\"GO\",\"MT\",\"PE\",\"SE\",\"MA\",\"RR\",\"AP\",\"AL\",\"PB\");\r\n");
      out.write("\t\t\t\t\tvar uf = document.getElementById('txtUf').value;\r\n");
      out.write("\t\t\t\t\tvar valid = false;\r\n");
      out.write("\t\t\t\t\tfor(i=0; i < listUF.length; i++){\r\n");
      out.write("\t\t\t\t\t\tif(listUF[i] == uf.toUpperCase()){\r\n");
      out.write("\t\t\t\t\t\t\tvalid = true;\r\n");
      out.write("\t\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(!valid){\r\n");
      out.write("\t\t\t\t\t\tjAlert('O campo UF esta inv\\u00e1lido',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar tbl = document.getElementById(\"tabelaDetalhe\");\r\n");
      out.write("\t\t\t\tvar size = tbl.rows.length;\t\t\t\t\r\n");
      out.write("\t\t\t\tif(size <= 2){\r\n");
      out.write("\t\t\t\t\tjAlert('Lista vazia.',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    \r\n");
      out.write("\t\tfunction populaProduto() {\r\n");
      out.write("\t\t\tvar formMed \t= document.getElementById('txtMed');\r\n");
      out.write("\t\t\tformMed.value \t= '");
      if (_jspx_meth_c_005fout_005f13(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction maskCpf(cpf){\r\n");
      out.write("\t\t\tvar newCpf = \"\";\r\n");
      out.write("\t\t\twhile(newCpf.length < (13-cpf.length)){\r\n");
      out.write("\t\t\t\tnewCpf = newCpf+\"*\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn newCpf+\".\"+cpf;\r\n");
      out.write("\t\t}\r\n");
      out.write("\tvar flProdutoContinuo = 0;\r\n");
      out.write("\tfunction addRow(){\r\n");
      out.write("\t\t$('#tabelaDetalhe').css('display', 'inline');\t\r\n");
      out.write("\t\tvar prod \t= $j.trim($j('#txtProd').val());\r\n");
      out.write("\t\tvar dsProd \t= $j.trim($j('#txtMed').val());\r\n");
      out.write("\t\tvar ms \t \t= $j.trim($j('#txtMs').val());\r\n");
      out.write("\t\tvar lote \t= $j.trim($j('#idLote').val()).replace(/\\s+/g, '') || $j.trim($j('#inputTxtLote').val()).replace(/\\s+/g, '');\r\n");
      out.write("\t\tvar val \t= $j.trim($j('#txtVal').val());\r\n");
      out.write("\t\tvar qtd\t \t= $j.trim($j('#txtQtd').val());\r\n");
      out.write("\t\tvar cat \t= $j.trim($j('#txtCat').val());\r\n");
      out.write("\t\tvar ean \t= $j.trim($j('#txtEan').val());\r\n");
      out.write("\t\tvar cdProd \t= $j.trim($j('#txtCdProd').val());\r\n");
      out.write("\t\tvar cdPsico = $j.trim($j('#txtCdPsico').val());\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(ms ==='' || lote === '' || val === ''|| qtd === '' || qtd <= 0 || prod === ''|| dsProd === '' ){\r\n");
      out.write("\t\t\tjAlert('Preencha os Campos Obrigat\\u00f3rios.',\"Receita Carimbo\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(isNaN(ms)){\r\n");
      out.write("\t\t\tjAlert('O Campo MS s\\u00f3 aceita n\\u00fameros.',\"Receita Carimbo\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar str = val.split(\"/\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif((str[0] <= 0 || str[0] > 12 ) || (str[1] < 2010 || str[1] > 2100 )||(val.length<7)){\r\n");
      out.write("\t\t\tjAlert('Data de validade inv\\u00e1lida.',\"Receita Carimbo\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdataMenosUmMes = subtrairMes(val);\r\n");
      out.write("\t\tdataMenosDoisMeses = subtrairMes(dataMenosUmMes);\r\n");
      out.write("\t\tdataAtual = new Date();\r\n");
      out.write("\t\tmesAtual=String(dataAtual.getMonth()+1);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(mesAtual.length==1){\r\n");
      out.write("\t\t\tmesAtual=\"0\"+mesAtual;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdataAtualForm = mesAtual+\"/\"+dataAtual.getFullYear();\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar mesSelecionado = val.substring(0, 2);\r\n");
      out.write("\t\tvar anoSelecionado = val.substring(3, 8);\r\n");
      out.write("\t\tvar dataVenc       = new Date(anoSelecionado, mesSelecionado);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(dataVenc < dataAtual){\r\n");
      out.write("\t\t\tjAlert('ATEN\\u00c7\\u00c3O! Este item est\\u00e1 com a validade vencida', \"Receita Carimbo\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(val.split(\"/\")[1]<dataAtualForm.split(\"/\")[1]){\r\n");
      out.write("\t\t\tjAlert('ATEN\\u00c7\\u00c3O! Este item est\\u00e1 com a validade em \\\"'+dataString(val.split(\"/\")[0])+' de '+val.split(\"/\")[1]+'\\\". ',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}else{\t\r\n");
      out.write("\t\t\tif(val.split(\"/\")[1]==dataAtualForm.split(\"/\")[1]){\r\n");
      out.write("\t\t\t\t\tif(val.split(\"/\")[0]<=dataAtualForm.split(\"/\")[0]){\r\n");
      out.write("\t\t\t\t\t\tjAlert('ATEN\\u00c7\\u00c3O! Este item est\\u00e1 com a validade em \\\"'+dataString(val.split(\"/\")[0])+' de '+val.split(\"/\")[1]+'\\\". ',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(dataAtualForm==dataMenosUmMes||dataAtualForm==dataMenosDoisMeses){\r\n");
      out.write("\t\t\tjAlert('ATEN\\u00c7\\u00c3O! Este item est\\u00e1 com a validade em \\\"'+dataString(val.split(\"/\")[0])+' de '+val.split(\"/\")[1]+'\\\". ',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar tbl = document.getElementById(\"tabelaDetalhe\");\r\n");
      out.write("\t\tvar rows = tbl.getElementsByTagName(\"tr\");\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t     for (row = 2; row < rows.length; row++) {\r\n");
      out.write("\t        var cells = rows[row].getElementsByTagName(\"td\");\r\n");
      out.write("\t        \tif(cdProd == cells[7].innerText && lote.toUpperCase() == cells[4].innerText.toUpperCase()){\r\n");
      out.write("\t        \t\tjAlert('ATEN\\u00c7\\u00c3O! N\\u00e3o \\u00e9 permitido mais de um item com lotes iguais. Favor atualizar na quantidade!\\'\". ',\"Receita Carimbo\");\r\n");
      out.write("\t        \t\treturn;\r\n");
      out.write("\t       \t\t}\r\n");
      out.write("        \t\tif((cdPsico == cells[9].innerText) ||\r\n");
      out.write("        \t\t  (cdPsico == 2 && cells[9].innerText == 4) ||\r\n");
      out.write("        \t\t  (cdPsico == 4 && cells[9].innerText == 2)) {\r\n");
      out.write("        \t\t  \tdocument.getElementById(\"nrNotif\").disabled = true;\r\n");
      out.write("\t             } else {\r\n");
      out.write("\t             \tjAlert('ATEN\\u00c7\\u00c3O! N\\u00e3o \\u00e9 permitido psicotropicos diferentes na mesma receita. Favor fazer em uma nova receita!.',\"Receita Carimbo\");\r\n");
      out.write("\t        \t\treturn;\r\n");
      out.write("\t             }\r\n");
      out.write("\t        }        \t\r\n");
      out.write("\t     \r\n");
      out.write("\t    document.getElementById(\"rc-cabecalho\").className = \"rc-cabecalho-disp-show\";\r\n");
      out.write("\t       \t\t\r\n");
      out.write("\t\tvar id = tbl.rows.length;\r\n");
      out.write("        var line = tbl.insertRow(-1);\r\n");
      out.write("        var cell;\r\n");
      out.write("        \r\n");
      out.write("        line.id = \"row_\"+id;\r\n");
      out.write("        line.className = \"rc-tr-detalhe\";\r\n");
      out.write(" \r\n");
      out.write("        cell = line.insertCell(0);\r\n");
      out.write("        cell.innerHTML = prod;\r\n");
      out.write("\t\tcell.style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("        cell = line.insertCell(1);\r\n");
      out.write("        cell.innerHTML = dsProd;\r\n");
      out.write("        cell.className = \"rc-med-detalhe\";\r\n");
      out.write("\r\n");
      out.write("        cell = line.insertCell(2);\r\n");
      out.write("        cell.innerHTML = cat + \"<div style='display:none'>\"+ean+\"</div>\";\r\n");
      out.write("\t\tcell.style.display = \"none\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t cell = line.insertCell(3);\r\n");
      out.write("        cell.innerHTML = ms;\r\n");
      out.write("        cell.className = \"rc-med-label-detalhe\";\r\n");
      out.write("\r\n");
      out.write("        cell = line.insertCell(4);\r\n");
      out.write("        cell.innerHTML = lote.toUpperCase();\r\n");
      out.write("        cell.className = \"rc-med-label-detalhe\";\r\n");
      out.write("\r\n");
      out.write("        cell = line.insertCell(5);\r\n");
      out.write("        cell.innerHTML = val;\r\n");
      out.write("        cell.className = \"rc-med-label-detalhe\";\r\n");
      out.write("\r\n");
      out.write("        cell = line.insertCell(6);\r\n");
      out.write("        cell.innerHTML = qtd;\r\n");
      out.write("        cell.className = \"rc-med-label-detalhe\";\r\n");
      out.write("\r\n");
      out.write("        cell = line.insertCell(7);\r\n");
      out.write("        cell.align = \"left\";\r\n");
      out.write("        cell.innerHTML = \"<div style='display:none'>\"+cdProd+\"</div>\";\r\n");
      out.write("        cell.style.display = \"none\";\r\n");
      out.write("        \r\n");
      out.write("        cell = line.insertCell(8);\r\n");
      out.write("        cell.innerHTML = '<span class=\"alteraCursor\" onclick=\"remRow('+id+');\"><img src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("/images/buttons/x-delete.png\"/></span>';\r\n");
      out.write("        \r\n");
      out.write("        cell = line.insertCell(9);\r\n");
      out.write("        cell.innerHTML = cdPsico;\r\n");
      out.write("        cell.style.display = \"none\";\r\n");
      out.write("\t\t\r\n");
      out.write("        cell = line.insertCell(10);\r\n");
      out.write("        cell.innerHTML = \"<div style='display:none'>\"+flProdutoContinuo+\"</div>\";\r\n");
      out.write("        cell.style.display = \"none\";\r\n");
      out.write("        \t\t\r\n");
      out.write("\t\t$j('#inputTxtLote').val('');\r\n");
      out.write("        $j('#txtLote').val('');\r\n");
      out.write("\t\t$j('#txtVal').val('');\r\n");
      out.write("\t\t$j('#txtQtd').val('');\r\n");
      out.write("\t\t$j('#txtProd').val('');\r\n");
      out.write("\t\t$j('#txtMed').val('');\r\n");
      out.write("\t\t$j('#txtMs').val('');\r\n");
      out.write("\t\t$j('#txtCat').val('');\r\n");
      out.write("\t\t$j('#txtEan').val('');\r\n");
      out.write("\t\t$j('#txtCdProd').val('');\r\n");
      out.write("\t\t$j('#txtcdPsico').val('');\r\n");
      out.write("\t\t$j('#idLote').val('');\r\n");
      out.write("\t\t$j('#txtLoteQtd').val('');\r\n");
      out.write("\t\tregraPsico(cdCat);\r\n");
      out.write("\t\tdocument.getElementById(\"recDigital\").disabled = true;\r\n");
      out.write("\t\tdocument.getElementById(\"ch_Sim\").value = \"\"; \r\n");
      out.write("\t    document.getElementById(\"ch_Nao\").value = \"\"; \r\n");
      out.write("\t    document.getElementById('ch_Sim').checked = false;\r\n");
      out.write("\t    document.getElementById('ch_Nao').checked = false;\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction subtrairMes(dataObj){\r\n");
      out.write("\t\tdataDiv = String(dataObj).split(\"/\");\r\n");
      out.write("\t\tmes = dataDiv[0]-1;\r\n");
      out.write("\t\tano = dataDiv[1];\r\n");
      out.write("\t\tif(mes <=0){\r\n");
      out.write("\t\t\tmes=mes+12;\r\n");
      out.write("\t\t\tano = ano-1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tmesStr=String(mes);\r\n");
      out.write("\t\tif(mesStr.length<2){\r\n");
      out.write("\t\t\tmesStr=\"0\"+mesStr;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdataS=mesStr+\"/\"+ano;\r\n");
      out.write("\t\treturn dataS;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction dataString(obj){\r\n");
      out.write("\t\tvar arrayMes = new Array(12);\r\n");
      out.write("\t\tarrayMes[0] = \"Janeiro\";\r\n");
      out.write("\t\tarrayMes[1] = \"Fevereiro\";\r\n");
      out.write("\t\tarrayMes[2] = \"Março\";\r\n");
      out.write("\t\tarrayMes[3] = \"Abril\";\r\n");
      out.write("\t\tarrayMes[4] = \"Maio\";\r\n");
      out.write("\t\tarrayMes[5] = \"Junho\";\r\n");
      out.write("\t\tarrayMes[6] = \"Julho\";\r\n");
      out.write("\t\tarrayMes[7] = \"Agosto\";\r\n");
      out.write("\t\tarrayMes[8] = \"Setembro\";\r\n");
      out.write("\t\tarrayMes[9] = \"Outubro\";\r\n");
      out.write("\t\tarrayMes[10] = \"Novembro\";\r\n");
      out.write("\t\tarrayMes[11] = \"Dezembro\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn arrayMes[obj-1];\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction remRow(id){\r\n");
      out.write("\t    var size = $j('#tabelaDetalhe tbody tr').size();\r\n");
      out.write(" \t\tif (size == 3){\r\n");
      out.write(" \t\t\tvar row = \"#row_\"+id;\r\n");
      out.write("\t\t\t$j(row).remove();\r\n");
      out.write("\t\t\t$('#tabelaDetalhe').css('display', 'none');\t\r\n");
      out.write(" \t\t} else {\t \t\t\t\r\n");
      out.write("\t\tvar row = \"#row_\"+id;\t\t\r\n");
      out.write("\t\t$j(row).remove();\r\n");
      out.write("\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction buscar() {\r\n");
      out.write("\t\tlimparCampo();\r\n");
      out.write("\t\tstartBuscaProdutoLoadingAnimation();\r\n");
      out.write("\t\tvar produto = $j('#txtProd').val();\r\n");
      out.write("\t\tdocument.getElementById('chkProdContinuo').checked = false;\r\n");
      out.write("\t\tflProdutoContinuo = 0;\r\n");
      out.write("\t\tif (produto == \"\") {\r\n");
      out.write("\t\t\tjAlert('Entre com um c\\u00f3digo de produto ou EAN.',\"Receita Carimbo\");\r\n");
      out.write("\t\t\tstopBuscaProdutoLoadingAnimation();\r\n");
      out.write("\t\t\treturn false;\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (isNumeric(produto)) {\r\n");
      out.write("\t\t\tvar URL = contextoUrl + \"AjaxServlet?acao=BUSCAR_PRODUTO_PSICO&cdFilial=\" + cdFilial +\"&cdProduto=\" + produto;\r\n");
      out.write("\t\t\tfuncaoDeRetornoAjax = cadCliente_retConsultaProduto;\r\n");
      out.write("\t\t\tajaxCall(URL, false);\t\t\t\t\t\t \r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tjAlert('C\\u00f3digo inv\\u00e1lido.',\"Receita Carimbo\");\r\n");
      out.write("\t\t\tstopBuscaProdutoLoadingAnimation();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} \t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("\tfunction cadCliente_retConsultaProduto(ret) {\r\n");
      out.write("\t\t\tif (ret.substring(0,4) == \"ERRO\" ) {\r\n");
      out.write("\t\t\t\tjAlert('Produto n\\u00e3o encontrado',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtMed').value = \"\";\r\n");
      out.write("\t\t\t\tlimparCampoProduto(); \r\n");
      out.write("\t\t\t\tstopBuscaProdutoLoadingAnimation();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tpopulaProduto(ret);\t\t\t\r\n");
      out.write("\t\t\tbuscarSaldoProdutoPharmaConnection();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar cdCat = 0;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction populaProduto(ret){\r\n");
      out.write("\t\t\tvar retDesProduto\t= ret.split(\"<C>\")[0];\r\n");
      out.write("\t\t\tvar retEan\t= ret.split(\"<C>\")[1];\r\n");
      out.write("\t\t\tvar retCodProduto\t= ret.split(\"<C>\")[2];\r\n");
      out.write("\t\t\tvar retDtValidade\t= ret.split(\"<C>\")[3];\r\n");
      out.write("\t\t\tvar retMs\t= ret.split(\"<C>\")[4];\r\n");
      out.write("// \t\t\tvar retLote\t= varLote.split(\"<C>\")[5];\t\t\t\r\n");
      out.write("\t\t\tvar retRegistro\t= ret.split(\"<C>\")[6];\r\n");
      out.write("\t\t\tvar retCat = ret.split(\"<C>\")[7];\r\n");
      out.write("\t\t\tvar retCdPsicotropicos = ret.split(\"<C>\")[8];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar formProd \t= document.getElementById('txtMed');\r\n");
      out.write("\t\t\tvar formMs \t= document.getElementById('txtMs');\r\n");
      out.write("\t\t\tvar formVal \t= document.getElementById('txtVal');\r\n");
      out.write("\t\t\tvar formCat     = document.getElementById('txtCat');\t\t\t\r\n");
      out.write("\t\t\tvar formTxtEan     = document.getElementById('txtEan');\t\t\t\r\n");
      out.write("\t\t\tvar formTxtCdProd     = document.getElementById('txtCdProd');\r\n");
      out.write("\t\t\tvar formTxtCdPsico\t= document.getElementById('txtCdPsico');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tformProd.value \t= retDesProduto;\r\n");
      out.write("\t\t\tformMs.value \t= retMs;\r\n");
      out.write("\t\t\tformCat.value   = retCat;\r\n");
      out.write("\t\t\tformTxtEan.value   = retEan;\r\n");
      out.write("\t\t\tformTxtCdProd.value  = retCodProduto;\r\n");
      out.write("\t\t\tformTxtCdPsico.value = retCdPsicotropicos;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\tcdCat = retCdPsicotropicos;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction imprimir() {\t\t\t\r\n");
      out.write("\t\tvar contEtiqueta = document.getElementById('contEtiqueta').value;\r\n");
      out.write("\t\tvar ultimaNrEtiqueta = document.getElementById('ultimaNrEtiqueta').value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(validarCampos()) {\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(contEtiqueta > 0) {\r\n");
      out.write("\t\t\t\t\t\tif(imprimirNovamente()){\r\n");
      out.write("\t\t\t\t\t\t\tdadosReceita(contEtiqueta, ultimaNrEtiqueta);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tdadosReceita(contEtiqueta, ultimaNrEtiqueta);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t  }\t\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction dadosReceita(contEtiqueta, ultimaNrEtiqueta){\r\n");
      out.write("\t\t\tvar receita = new Array();\r\n");
      out.write("\t\t\tvar listProd = new Array();\r\n");
      out.write("\t\t\tvar cookie =  new Array();\t\t\t\r\n");
      out.write("\t\t\tgetDadosFilial(getCookie(\"FILIAL\").split(\"<C>\")[0]);\r\n");
      out.write("\t\t\tcookie = unescape(getCookie(\"DADOS_FILIAL\"));\t\r\n");
      out.write("\t\t\tcookie = cookie.split(\",\");\r\n");
      out.write("\t\r\n");
      out.write("\t\t\treceita[0] = document.getElementById('txtNome').value;\r\n");
      out.write("\t\t\treceita[1] = document.getElementById('numRg').value.replace(/\\.|\\-/g, '');\r\n");
      out.write("\t\t\treceita[2] = document.getElementById('txtLogra').value;\r\n");
      out.write("\t\t\treceita[3] = document.getElementById('numNumero').value;\r\n");
      out.write("\t\t\treceita[4] = document.getElementById('txtBairro').value;\r\n");
      out.write("\t\t\treceita[5] = document.getElementById('txtCidade').value;\r\n");
      out.write("\t\t\treceita[6] = document.getElementById('txtUf').value;\r\n");
      out.write("\t\t\treceita[7] = document.getElementById('numCep').value.replace(/\\.|\\-/g, '');\r\n");
      out.write("\t\t\treceita[8] = document.getElementById('numTel').value.replace(/\\.|\\-/g, '');\r\n");
      out.write("\t\t\treceita[9] =  cookie[4]; \r\n");
      out.write("\t\t\treceita[10] = cookie[5]; \r\n");
      out.write("\t\t\treceita[11] = cookie[6];\r\n");
      out.write("\t\t\treceita[15] = cookie[7];\r\n");
      out.write("\t\t\treceita[16] = cookie[8];\r\n");
      out.write("\t\t\treceita[17] = document.getElementById('ufRg').value;\t\r\n");
      out.write("\t\t\tvar listMs = \"\";\r\n");
      out.write("\t\t\tvar prod = \"\";\r\n");
      out.write("\t\t\tvar tbl = document.getElementById(\"tabelaDetalhe\");\r\n");
      out.write("\t\t\tvar size = tbl.rows.length;\r\n");
      out.write("\t\t\tvar rows = tbl.getElementsByTagName(\"tr\");\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t     for (row = 2; row < rows.length; row++) {\r\n");
      out.write("\t\t        var cells = rows[row].getElementsByTagName(\"td\");\r\n");
      out.write("\t\t        if(prod != \"\" && prod != cells[0].innerHTML){\r\n");
      out.write("\t\t        \tlistMs = listMs.concat('','<P>');\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t\t\tprod = cells[0].innerHTML;\t\t\r\n");
      out.write("\t\t        listMs = listMs.concat(cells[0].innerHTML,'<C>');\r\n");
      out.write("\t\t\t\tlistMs = listMs.concat(cells[1].innerHTML,'<C>');\r\n");
      out.write("\t\t\t\tlistMs = listMs.concat(cells[3].innerHTML,'<C>');\r\n");
      out.write("\t\t\t\tlistMs = listMs.concat(cells[4].innerHTML,'<C>');\r\n");
      out.write("\t\t\t\tlistMs = listMs.concat(cells[5].innerHTML,'<C>');\r\n");
      out.write("\t\t\t\tlistMs = listMs.concat(cells[6].innerHTML,'<C>');\t\t\t\t\r\n");
      out.write("\t\t\t\tlistMs = listMs.concat(cells[7].getElementsByTagName(\"div\")[0].innerText,'<C>');\r\n");
      out.write("\t\t\t\tlistMs = listMs.concat(cells[2].getElementsByTagName(\"div\")[0].innerText,'<C>');\r\n");
      out.write("\t\t\t\tlistMs = listMs.concat(cells[10].getElementsByTagName(\"div\")[0].innerText,'<C>');\r\n");
      out.write("\t\t\t\tlistMs = listMs.concat('','<L>'); \r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\treceita[12] = listMs;\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t    if(contEtiqueta > 0){\r\n");
      out.write("\t    \tdocument.getElementById('contEtiqueta').value = 0;\r\n");
      out.write("\t    \treceita[13] = ultimaNrEtiqueta;\r\n");
      out.write("\t    }else{\r\n");
      out.write("\t    \treceita[13] = getNrEtiquetaControlado(cookie[0]);\r\n");
      out.write("\t    \tdocument.getElementById('ultimaNrEtiqueta').value = receita[13];\r\n");
      out.write("\t    }\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t    receita[14] = document.getElementById('txtComplemento').value;\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\treceita[18] = '");
      if (_jspx_meth_c_005fout_005f14(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\treceita[19] = '");
      if (_jspx_meth_c_005fout_005f15(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t\t\treceita[20] = cookie[0];//cdFilial\r\n");
      out.write("\t\t\treceita[21] = document.getElementById(\"inputCrmImprimir\").value.replace(/\\.|\\-/g, '') || document.getElementById(\"inputCroCrmvRms\").value.replace(/\\.|\\-/g, '');\r\n");
      out.write("\t\t\treceita[22] = document.getElementById(\"dtNasc\").value;\r\n");
      out.write("\t\t\treceita[23] = document.getElementById(\"txtUfCrm\").value;\r\n");
      out.write("\t\t\treceita[24] = document.getElementById(\"inputMedicoNome\").value || document.getElementById(\"inputNomeMedicoImprimir\").value;\r\n");
      out.write("\t\t\treceita[25] = document.getElementById('txtConselho').value;\t\t\t\r\n");
      out.write("\t\t\treceita[26] = document.getElementById('txtNomePac').value;\r\n");
      out.write("\t\t\treceita[27] = document.getElementById(\"dtNascPac\").value;\r\n");
      out.write("\t\t\treceita[28] = document.getElementById(\"txtSexo\").value;\r\n");
      out.write("\t\t\treceita[29] = document.getElementById(\"nrNotif\").value;\r\n");
      out.write("\t\t\treceita[30] = document.getElementById(\"dtRec\").value;\r\n");
      out.write("\t\t\treceita[31] = document.getElementById(\"recDigital\").value;\r\n");
      out.write("\t\t\treceita[32] = document.getElementById(\"selectTipoDocumento\").value;\r\n");
      out.write("\t\t\treceita[33] = document.getElementById(\"txtUfEmissor\").value;\t\r\n");
      out.write("\t\t\tstartApplet();\t\t\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"appletTc\").imprimirReceitaCarimboEpson(receita);\r\n");
      out.write("\t\t\tdocument.getElementById('contEtiqueta').value = 1;\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t    salvarDadosReceita(receita);\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction salvarDadosReceita(receita){\r\n");
      out.write("\t\tvar semInformacao = \"-\";\r\n");
      out.write("\t\tvar json = {\r\n");
      out.write("            'idCliente': '");
      if (_jspx_meth_c_005fout_005f16(_jspx_page_context))
        return;
      out.write("',\r\n");
      out.write("            'cdsRg': receita[1],\r\n");
      out.write("            'dsEmissor': dsEmissor = (receita[17] == \"\") ? semInformacao : receita[17],\r\n");
      out.write("            'nrCep': receita[7],\r\n");
      out.write("            'dsEndereco': receita[2],\r\n");
      out.write("            'dsComplemento': dsComplemento = (receita[14] == \"\") ? semInformacao : receita[14],\r\n");
      out.write("            'dsBairro': receita[4],\r\n");
      out.write("            'dsCidade': receita[5],\r\n");
      out.write("            'sgEstado': receita[6],\r\n");
      out.write("            'nrCr': receita[21],\r\n");
      out.write("            'cdTelefoneTipo': $j(\"#numTpFone\").val(),\r\n");
      out.write("            'nrPrefixo': $j(\"#numDDD\").val(),\r\n");
      out.write("            'nrTelefone': receita[8],\r\n");
      out.write("            'nmPaciente': receita[26],\r\n");
      out.write("            'nrEndereco': receita[3],\r\n");
      out.write("            'nrEtiqueta': receita[13],\r\n");
      out.write("            'nrCpf': receita[18],\r\n");
      out.write("            'ufCrm': receita[23],\r\n");
      out.write("            'dtNasc': receita[22],\r\n");
      out.write("            'cdFilial': receita[20],\r\n");
      out.write("            'nmComprador': receita[0],\r\n");
      out.write("            'nmMedico' : receita[24],\r\n");
      out.write("            'dsTpCr' : receita[25],            \r\n");
      out.write("            'dtNascPaciente' : receita[27],\r\n");
      out.write("            'dsSexoPaciente': receita[28],\r\n");
      out.write("            'cdsNotificacao': receita[29],\r\n");
      out.write("            'dtReceita': receita[30],\r\n");
      out.write("            'cdsReceitaDigital': receita[31],\r\n");
      out.write("            'cdTipoDocumento': receita[32],\r\n");
      out.write("            'sgUfEmissor' : receita[33],\r\n");
      out.write("            'listaProd': receita[12]            \r\n");
      out.write("        };  \r\n");
      out.write("        \r\n");
      out.write("       \tconsole.log(JSON.stringify(json));\r\n");
      out.write("\t    $j.ajax({\r\n");
      out.write("\t        type: 'POST',\r\n");
      out.write("\t        contentType: 'application/json',\r\n");
      out.write("\t        async: false,\r\n");
      out.write("\t        dataType: 'text',\r\n");
      out.write("\t        url: TERMINAL_CONSULTA_SERVICOS_URL + \"receitaCarimboTC/salvarDadosPharmaConnection\",\r\n");
      out.write("\t        data: JSON.stringify(json),\r\n");
      out.write("\t        success: function (retorno) {\r\n");
      out.write("\t        \tif (retorno.length > 0) {\r\n");
      out.write("                    var msg = '';                 \r\n");
      out.write("                    msg += '<tr class=\"campoDialog\">'\r\n");
      out.write("                        + '<td>' + retorno + '</td></tr>'                    \r\n");
      out.write("                    var tbDialog = \"\";  \r\n");
      out.write("                        tbDialog = '<table><tr><td><h3 class=\"titulo\">Por favor, retire a impress&atilde;o.</h3></td></tr></table>'              \r\n");
      out.write("                        + '<table style=\"width:300px;background-color:#EDF0F0;border: 1px solid #FFFFFF\";>'\r\n");
      out.write("                        + msg\r\n");
      out.write("                        + '</table>';  \r\n");
      out.write("                                             \r\n");
      out.write("                    document.getElementById('dialog-confirm').innerHTML = tbDialog;                  \r\n");
      out.write("\t\t\t\t$( \"#dialog-confirm\" ).dialog({\r\n");
      out.write("\t\t\t      resizable: false,\r\n");
      out.write("\t\t\t      height: \"auto\",\r\n");
      out.write("\t\t\t      width: 400,\r\n");
      out.write("\t\t\t      modal: true,\t\t\t      \t\t\t      \t      \r\n");
      out.write("\t\t\t      buttons: {\r\n");
      out.write("\t\t\t        \"Entendi\": function() {\r\n");
      out.write("\t\t\t          \t$( this ).dialog( \"close\" );\t\t\t          \r\n");
      out.write("\t\t\t        }\t\t        \r\n");
      out.write("\t\t\t      }\r\n");
      out.write("\t\t\t    });\t\r\n");
      out.write("\t\t\t    }\t\t    \t    \t\t\t\r\n");
      out.write("\t        },error: function (jqXHR, exception) {\r\n");
      out.write("\t\t      \tconsole.log(\"Status Code: \" + jqXHR.status);\r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction imprimirNovamente() {\r\n");
      out.write("        dialogos.exibeInfoEtiqCont(\"Etiquetas Controlados\", {\r\n");
      out.write("            'Reimprimir a mesma etiqueta': function () {\r\n");
      out.write("            \tdadosReceita(document.getElementById('contEtiqueta').value, document.getElementById('ultimaNrEtiqueta').value);\r\n");
      out.write("                $j(this).dialog(\"close\");\r\n");
      out.write("            },\r\n");
      out.write("            'Imprimir uma Nova etiqueta': function () {\r\n");
      out.write("            \tvar size = $j('#tabelaDetalhe tbody tr').size();\r\n");
      out.write("                for ( var i = 2; i < size ; i++) {\r\n");
      out.write("                \t$j('#tabelaDetalhe tbody tr#row_'+ i +'').remove();\r\n");
      out.write("                \t$('#tabelaDetalhe').css('display', 'none');\t                \t\r\n");
      out.write("                \tlimparCampoDadosPacientes();\r\n");
      out.write("                \tlimparCampoProduto();\r\n");
      out.write("                \tlimparCampoMedico();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\tdocument.getElementById('contEtiqueta').value = 0;\r\n");
      out.write("                $j(this).dialog(\"close\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("        });\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\tfunction limparDados(){\r\n");
      out.write("\t\tdocument.getElementById('txtNome').value = '';\r\n");
      out.write("\t\tdocument.getElementById('numRg').value = '';\r\n");
      out.write("\t\tdocument.getElementById('txtLogra').value = '';\r\n");
      out.write("\t\tdocument.getElementById('numNumero').value = '';\r\n");
      out.write("\t\tdocument.getElementById('txtBairro').value = '';\r\n");
      out.write("\t\tdocument.getElementById('txtCidade').value = '';\r\n");
      out.write("\t\tdocument.getElementById('txtUf').value = '';\r\n");
      out.write("\t\tdocument.getElementById('numCep').value = '';\r\n");
      out.write("\t\tdocument.getElementById('numDDD').value = '';\r\n");
      out.write("\t\tdocument.getElementById('numTel').value = '';\r\n");
      out.write("\t\tdocument.getElementById('txtCRM').value = '';\r\n");
      out.write("\t\tdocument.getElementById('ufRg').value = '';\r\n");
      out.write("\t\tdocument.getElementById('numTpFone').value = '0';\r\n");
      out.write("\t\tdocument.getElementById('txtComplemento').value = '';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callBackDadosFilial(ret) {\r\n");
      out.write("\t\tif (ret.substring(0,4) == \"ERRO\" ) {\r\n");
      out.write("\t\t\t\tjAlert('Erro ao buscar dados da filial',\"Receita Carimbo\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\tsetCookie(\"DADOS_FILIAL\", ret);\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getDadosFilial(cdFilial){\t\t\t\r\n");
      out.write("\t\tvar URL = contextoUrl + \"AjaxServlet?acao=CONSULTAR_FILIAL&cdFilial=\"+cdFilial;\t\r\n");
      out.write("\t\tfuncaoDeRetornoAjax = callBackDadosFilial;\t\t\t\r\n");
      out.write("\t\tajaxCall(URL, false); \t\t\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getNrEtiquetaControlado(cdFilial){\t\t\t\r\n");
      out.write("\t\tvar URL = contextoUrl + \"AjaxServlet?acao=nrEtiquetaControlado&cdFilial=\"+cdFilial;\t\r\n");
      out.write("\t\tvar view_data = \"\";\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t    url:URL,\r\n");
      out.write("\t\t    async: false,\r\n");
      out.write("\t\t    type: \"POST\",\r\n");
      out.write("\t\t    dataType: \"text\",\r\n");
      out.write("\t\t    success:function(response_data) {\r\n");
      out.write("\t\t        view_data = response_data.replace(/\\r\\n/g, \"\");\r\n");
      out.write("\t\t        callBackNrEtiquetaControlado(view_data); \r\n");
      out.write("\t}\r\n");
      out.write("\t\t });\r\n");
      out.write("\t\r\n");
      out.write("\t\t return view_data;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction removeAcento(value) {\r\n");
      out.write("\t\tvar str_acento= \"áàãâäéèêëíìîïóòõôöúùûüçÁÀÃÂÄÉÈÊËÍÌÎÏÓÒÕÖÔÚÙÛÜÇÝý\";\r\n");
      out.write("\t\tvar str_sem_acento = \"aaaaaeeeeiiiiooooouuuucAAAAAEEEEIIIIOOOOOUUUUCYY\";\r\n");
      out.write("\t\tvar index;\r\n");
      out.write("\t\tfor (var i = 0; i < value.length; i++) {\t\t\t\r\n");
      out.write("\t\t\tindex = str_acento.indexOf(value.charAt(i));\t\t\t\r\n");
      out.write("\t\t\tif ( index != -1) {\r\n");
      out.write("\t\t\t\tvalue = value.replace( value.substr(i,1), str_sem_acento.substr(index,1));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tindex=-1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn value;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction abrirDialogoEnderecos(){\r\n");
      out.write("\t\t$(\"#dialogoEnderecos\").dialog({\r\n");
      out.write("\t\t\twidth: 730,\r\n");
      out.write("\t\t\theight: 200,\t       \t        \t\t\r\n");
      out.write("\t\t\tmodal : true,\t\r\n");
      out.write("\t\t\tautoOpen: true,\r\n");
      out.write("\t\t\tbuttons:{Selecionar: selecioneEndereco, Cancelar: fecharDialogEnderecos}\r\n");
      out.write("\t\t\t\t     \t        \t\t\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction selecioneEndereco(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar enderecoSelecionado = $j('input[name=enderecoSelecionado]:checked').val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(enderecoSelecionado == 'undefined' || enderecoSelecionado == null){\r\n");
      out.write("\t\t\talert(\"Selecione um endere\\u00e7o !\")\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tvar enderecoSelecionado = $j('input[name=enderecoSelecionado]:checked').val();\r\n");
      out.write("\t\t\tvar logradouro \t\t\t= $j(\"#mostraLogradouro\"+enderecoSelecionado).text();\t\t\t\r\n");
      out.write("\t\t\tvar numero\t\t\t\t= $j(\"#mostraEnderecoNumero\"+enderecoSelecionado).text();\r\n");
      out.write("\t\t\tvar complemento         = $j(\"#mostraComplemento\"+enderecoSelecionado).text();\r\n");
      out.write("\t\t\tvar bairro \t\t\t\t= $j(\"#mostraBairro\"+enderecoSelecionado).text();\r\n");
      out.write("\t\t\tvar cep\t\t\t\t\t= $j(\"#mostraCep\"+enderecoSelecionado).text();\r\n");
      out.write("\t\t\tvar cidade\t\t\t\t= $j(\"#mostraCidade\"+enderecoSelecionado).text();\r\n");
      out.write("\t\t\tvar uf\t\t\t\t\t= $j(\"#mostraUf\"+enderecoSelecionado).text();\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$j(\"#numCep\").val(cep);\t\r\n");
      out.write("\t\t\t$j(\"#txtLogra\").val(logradouro);\t\t\t\t\r\n");
      out.write("\t\t\t$j(\"#numNumero\").val(numero);\r\n");
      out.write("\t\t\t$j(\"#txtComplemento\").val(complemento);\r\n");
      out.write("\t\t\t$j(\"#txtBairro\").val(bairro);\r\n");
      out.write("\t\t\t$j(\"#txtCidade\").val(cidade);\r\n");
      out.write("\t\t\t$j(\"#txtUf\").val(uf);\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tjQuery('#dialogoEnderecos').dialog('close');\r\n");
      out.write("\t\t\t$j('#txtProd').focus();\t\t\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction preencherDadosComprador() {\r\n");
      out.write("\t\tif (cdCat == 5){\r\n");
      out.write("\t\tdocument.getElementById('txtNomePac').value = document.getElementById('txtNome').value;\r\n");
      out.write("\t\tdocument.getElementById('dtNascPac').value\t= document.getElementById('dtNasc').value;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tjAlert('Funciona apenas para antibi\\u00f3ticos',\"Receita Carimbo\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tfunction buscarHistClient(){\r\n");
      out.write("\t\tvar idCliente = ");
      if (_jspx_meth_c_005fout_005f17(_jspx_page_context))
        return;
      out.write(";\r\n");
      out.write("\t\tvar rowColor = \"evenRow\";\r\n");
      out.write("\t    $j.ajax({\r\n");
      out.write("\t        type: 'GET',\r\n");
      out.write("\t        contentType: 'application/json',\r\n");
      out.write("\t        url: TERMINAL_CONSULTA_SERVICOS_URL + \"receitaCarimboTC/clientes/\"+idCliente,\r\n");
      out.write("\t        success: function (response) {\t                       \t\r\n");
      out.write("\t\t\t\t$(\"#listaHistoricoClienteNovo\").dialog({\r\n");
      out.write("\t\t\t\t\tweight: 530,\r\n");
      out.write("\t\t\t\t\theight: 372,\r\n");
      out.write("\t\t\t\t\tmodal: true,\r\n");
      out.write("\t\t\t\t\tautoOpen: true,\r\n");
      out.write("\t\t\t\t\tcloseOnEscape: true\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#listaHistoricoClienteNovo\").parent().width(540);\r\n");
      out.write("\t\t\t\t$(\"#listaHistoricoClienteNovo\").width(530);\r\n");
      out.write("\t\t\t\t$(\"#listaHistoricoClienteNovo\").parent().height(380);\r\n");
      out.write("\t\t\t\t$(\"#listaHistoricoClienteNovo\").height(372);\r\n");
      out.write("\t        \tvar clientes = '';\r\n");
      out.write("\t            for(var i=0;i<response.length;i++){\r\n");
      out.write("\t            \tvar date = response[i].dtTransacao;\r\n");
      out.write("\t            \tvar formartDate = formatDate(date);\r\n");
      out.write("\t            \tclientes += '<tr class=\"'+rowColor+' > rc-modal-line\" >'\r\n");
      out.write("\t\t\t\t\t\t+ '<td style=\"cursor:pointer\" class=\"rc-td-corpo-modal\" onclick=\"carregarDadosCliente('+response[i].idDadosReceita+')\">'+response[i].nmComprador+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+ '<td style=\"cursor:pointer\" class=\"rc-td-corpo-modal\" onclick=\"carregarDadosCliente('+response[i].idDadosReceita+')\">'+formartDate+'</td>'\r\n");
      out.write("\t\t\t\t\t\t+ '</tr>'\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\trowColor = (rowColor == 'evenRow') ? 'oddRow' : 'evenRow';\r\n");
      out.write("\t       \t\t}\t       \t\t\t\t\r\n");
      out.write("\t       \t\tvar tbClientesHistoricoNovo = \"\";\r\n");
      out.write("\t       \t\ttbClientesHistoricoNovo = \"\"\r\n");
      out.write("\t       \t\t\t\t\r\n");
      out.write("\t       \t\t\t\t+ '<div id=\"conclusao\">'\r\n");
      out.write("\t\t\t\t\t\t\t+ '<h1 class=\"rc-modal-title\">Carregar dados do Hist&oacute;rico</h1>'\r\n");
      out.write("\t\t\t\t\t\t\t+ '<label class=\"rc-subtitle\">Clique no cliente para carregar</label>'\r\n");
      out.write("\t       \t\t\t\t\r\n");
      out.write("\t       \t\t\t\t+ '<br>'\r\n");
      out.write("\t       \t\t\t\t+ '<hr>'\r\n");
      out.write("\t\t\t\t\t\t+ '<table class=\"rc-modal-table\">'\r\n");
      out.write("\t\t\t\t\t\t\t+ '<tr>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td align=\"left\" class=\"rc-line-modal-historico\">Nome do comprador</td>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td align=\"left\" class=\"rc-line-modal-historico2\">Data da Compra</td>'\r\n");
      out.write("\t\t\t\t\t\t\t+ '</tr>'\r\n");
      out.write("\t\t\t\t\t\t\t+ clientes\r\n");
      out.write("\t\t\t\t\t\t\t+ '<tr>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td>&nbsp</td>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td>&nbsp</td>'\r\n");
      out.write("\t\t\t\t\t\t\t+ '</tr>'\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t+ '</tr>'\r\n");
      out.write("\t\t\t\t\t\t\t+ '<tr>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td>&nbsp</td>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td>&nbsp</td>'\r\n");
      out.write("\t\t\t\t\t\t\t+ '</tr>'\r\n");
      out.write("\t\t\t\t\t\t\t+ '<tr>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td>&nbsp</td>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td>&nbsp</td>'\r\n");
      out.write("\t\t\t\t\t\t\t+ '</tr>'\r\n");
      out.write("\t\t\t\t\t\t\t+ '<tr>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td>&nbsp</td>'\r\n");
      out.write("\t\t\t\t\t\t\t\t+ '<td>&nbsp</td>'\r\n");
      out.write("\t\t\t\t\t\t\t+ '</tr>'\r\n");
      out.write("\t\t           \t\t+ '</table>'\r\n");
      out.write("\t\t           \t\t+ '</div>'\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById('listaHistoricoClienteNovo').innerHTML = \"\";\r\n");
      out.write("\t\t\t\tdocument.getElementById('listaHistoricoClienteNovo').innerHTML = tbClientesHistoricoNovo;\r\n");
      out.write("\t        },error: function (jqXHR, exception) {\r\n");
      out.write("\t\t    \tconsole.log(\"Status Code: \" + jqXHR.status);\r\n");
      out.write("\t\t    \tif(jqXHR.status == 404){     \t\t                \t\r\n");
      out.write("\t                \tjAlert('Lista de Hist\\u00f3rico est\\u00e1 vazia!',\"Receita Carimbo\");\t\r\n");
      out.write("\t                \treturn;\r\n");
      out.write("\t           }    \r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction carregarDadosCliente(idDadosReceita){\r\n");
      out.write("\t    $j.ajax({\r\n");
      out.write("\t        type: 'GET',\r\n");
      out.write("\t        contentType: 'application/json',\r\n");
      out.write("\t        url: TERMINAL_CONSULTA_SERVICOS_URL + \"receitaCarimboTC/carregarDados/\"+idDadosReceita,\r\n");
      out.write("\t        success: function (ret) {\r\n");
      out.write("\t        \tlimparDados();\r\n");
      out.write("\t        \tif (document.getElementById('txtConselho').value = ret.dsTpCr == \"CRM\") {\r\n");
      out.write("\t\t        \t\tdocument.getElementById(\"medicoNome\").hidden = false;\r\n");
      out.write("\t\t\t\t\t  \tdocument.getElementById(\"imgLupaCrm\").hidden = false;\r\n");
      out.write("\t\t\t\t\t  \tdocument.getElementById('txtUfCrm').value = \"\";\r\n");
      out.write("\t\t\t\t\t  \tdocument.getElementById('txtCRM').value = \"\";\r\n");
      out.write("\t\t\t\t\t  \tdocument.getElementById('inputMedicoNome').value = \"\";\r\n");
      out.write("\t\t\t\t\t  \tdocument.getElementById('medicoNome').value = \"\";\r\n");
      out.write("\t\t\t\t\t    document.getElementById(\"inputMedicoNome\").setAttribute(\"type\", \"hidden\");\t\t    \r\n");
      out.write("\t\t\t\t\t    document.getElementById(\"inputCroCrmvRms\").setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\t\t\t\t\t    document.getElementById(\"txtCRM\").setAttribute(\"type\", \"text\");\r\n");
      out.write("\t\t\t\t\t    document.getElementById('inputCroCrmvRms').value = \"\";\t\r\n");
      out.write("\t\t\t\t\t    document.getElementById('inputNomeMedicoImprimir').value = \"\";\t\t \t  \t\t    \t\r\n");
      out.write("\t\t\t\t\t    $('#labelTxtCrm').css('display', 'inline');\t \r\n");
      out.write("\t\t\t\t\t  \t$('#labetTxtCrmHidden').css('display', 'none');\t \r\n");
      out.write("\t\t\t\t\t  \t$('#labelNome').css('display', 'inline');\t \r\n");
      out.write("\t\t\t\t\t  \t$('#labelNomeHidden').css('display', 'none');\r\n");
      out.write("\t\t\t\t\t  \t$('#txtCRM').css('display', 'inline');\r\n");
      out.write("\t\t\t\t\t  \t$('#inputCrmImprimir').css('display', 'none');\t   \t\r\n");
      out.write("\t        \t}else {\t\r\n");
      out.write("\t        \t\tdocument.getElementById(\"inputMedicoNome\").setAttribute(\"type\", \"text\");\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById(\"imgLupaCrm\").hidden = true;\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById(\"medicoNome\").hidden = true;\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById(\"inputCroCrmvRms\").setAttribute(\"type\", \"text\");\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById(\"txtCRM\").setAttribute(\"type\", \"hidden\");\t\t  \t\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById('txtCRM').value = \"\";\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById('medicoNome').value = \"\";\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById('txtUfCrm').value = \"\";\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById('inputMedicoNome').value = \"\";\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById('inputNomeMedicoImprimir').value = \"\";\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById('inputCroCrmvRms').value = \"\";\t\r\n");
      out.write("\t\t\t\t  \tdocument.getElementById('inputNomeMedicoImprimir').value = \"\";\r\n");
      out.write("\t\t\t\t  \t$('#labelTxtCrm').css('display', 'none');\t \r\n");
      out.write("\t\t\t\t  \t$('#labetTxtCrmHidden').css('display', 'inline');\t \r\n");
      out.write("\t\t\t\t  \t$('#labelNome').css('display', 'none');\t \r\n");
      out.write("\t\t\t\t  \t$('#labelNomeHidden').css('display', 'inline');\t\t  \t\r\n");
      out.write("\t\t\t\t  \t$('#inputCrmImprimir').css('display', 'none');\t        \t\r\n");
      out.write("\t        \t}\r\n");
      out.write("\t        \tdocument.getElementById(\"medicoNome\").hidden = true;\r\n");
      out.write("\t        \tdocument.getElementById(\"inputMedicoNome\").setAttribute(\"type\", \"text\");\t        \t\t  \t    \r\n");
      out.write("\t\t\t\tdocument.getElementById('txtNome').value = ret.nmComprador;\r\n");
      out.write("\t\t\t\tdocument.getElementById('selectTipoDocumento').value = ret.cdTipoDocumento;\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtUfEmissor').value = ret.sgUfEmissor;\r\n");
      out.write("\t\t\t\tdocument.getElementById('numRg').value = ret.cdsRg;\t\t\t\t\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtLogra').value = ret.dsEndereco;\r\n");
      out.write("\t\t\t\tdocument.getElementById('numNumero').value = ret.cdsNumero;\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtBairro').value = ret.dsBairro;\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtCidade').value = ret.dsCidade;\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtUf').value = ret.sgEstado;\r\n");
      out.write("\t\t\t\tdocument.getElementById('numCep').value = ret.cdsCep;\r\n");
      out.write("\t\t\t\tdocument.getElementById('numDDD').value = ret.nrPrefixo;\r\n");
      out.write("\t\t\t\tdocument.getElementById('numTel').value = ret.nrTelefone;\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtCRM').value = ret.cdsCr;\r\n");
      out.write("\t\t\t\tdocument.getElementById('inputCroCrmvRms').value = ret.cdsCr;\r\n");
      out.write("\t\t\t\tdocument.getElementById('ufRg').value = ret.dsEmissor;\r\n");
      out.write("\t\t\t\tdocument.getElementById('numTpFone').value = ret.cdTipoTelefone;\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtComplemento').value = ret.dsComplemento;\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtConselho').value = ret.dsTpCr;\r\n");
      out.write("\t\t\t\tdocument.getElementById('txtUfCrm').value = ret.ufCrm;\r\n");
      out.write("\t\t\t\tdocument.getElementById('inputMedicoNome').value = ret.nmMedico;\r\n");
      out.write("\t\t\t\tdocument.getElementById('inputNomeMedicoImprimir').value = ret.nmMedico;\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#listaHistoricoClienteNovo\").closest('.ui-dialog-content').dialog('close');\r\n");
      out.write("\t        },error: function (jqXHR, exception) {\r\n");
      out.write("\t\t    \tconsole.log(\"Status Code: \" + jqXHR.status);\r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tvar objCrm = '';\r\n");
      out.write("\tvar objResp = '';\r\n");
      out.write("\tfunction buscaMedico(){\r\n");
      out.write("\t\tstartBuscaCrmLoadingAnimation();\r\n");
      out.write("\t\tdocument.getElementById(\"inputMedicoNome\").setAttribute(\"type\", \"hidden\");\t\r\n");
      out.write("\t\tdocument.getElementById(\"medicoNome\").hidden = false;\r\n");
      out.write("\t    $j('#medicoNome').find('option').remove();\r\n");
      out.write("\t    if($j('#txtConselho').val() == \"0\" || $j('#txtCRM').val() == \"\"  || $j('#txtUfCrm').val() == \"0\"){\r\n");
      out.write("\t    \tjAlert('Campo Conselho ou CRM ou UF vazio.',\"Receita Carimbo\");\t    \t\t\r\n");
      out.write("\t        stopBuscaCrmLoadingAnimation();\r\n");
      out.write("\t        return false;\t\t\r\n");
      out.write("\t    }else if ($j('#txtConselho').val() == \"CRM\"){\r\n");
      out.write("\t        var url = TERMINAL_CONSULTA_SERVICOS_URL + \"receitaCarimboTC\" + \"/medicoCrm/\" + $j('#txtConselho').val() + \"/\" + $j('#txtCRM').val() + \"/\" +  $j('#txtUfCrm').val() ;\r\n");
      out.write("\t        $j.ajax({\r\n");
      out.write("\t            type: 'GET',\r\n");
      out.write("\t            async: false,\r\n");
      out.write("\t            cache: false,\r\n");
      out.write("\t            contentType: 'application/json',\r\n");
      out.write("\t            url:  url,\r\n");
      out.write("\t            success: function (medicoJson) {\r\n");
      out.write("\t            \tstopBuscaCrmLoadingAnimation();\r\n");
      out.write("\t                var toAppend = '';\r\n");
      out.write("\t                var nrCrm = '';\r\n");
      out.write("\t                var nmProfissional = '';                             \r\n");
      out.write("\t                objResp = medicoJson;\r\n");
      out.write("\t                if(medicoJson.length == 0){\t\r\n");
      out.write("\t                \tjAlert('CRM não encontrado. '+ \"<br>\" +'Favor digitar manualmente o CRM e o nome do Médico',\"Receita Carimbo\");\r\n");
      out.write("\t                \t$('#labelTxtCrm').css('display', 'none');\t \r\n");
      out.write("\t\t  \t            $('#labetTxtCrmHidden').css('display', 'inline');   \r\n");
      out.write("\t\t  \t            $('#inputCrmImprimir').css('display', 'none'); \r\n");
      out.write("\t\t  \t            $('#txtCRM').css('display', 'inline');\t\t  \t           \r\n");
      out.write("\t\t  \t            $j('#inputNomeMedicoImprimir').val('');\r\n");
      out.write("\t\t  \t            $j('#inputCrmImprimir').val('');\t\t  \t            \t\t  \t            \t\t  \t            \r\n");
      out.write("\t\t  \t            document.getElementById(\"imgLupaCrm\").hidden = false;           \t\t                \t\r\n");
      out.write("\t                \tdocument.getElementById(\"inputMedicoNome\").setAttribute(\"type\", \"text\");\t                \t\r\n");
      out.write("\t                \tnrCrm = document.getElementById('txtCRM').value; \r\n");
      out.write("\t                \tdocument.getElementById('inputCrmImprimir').value = nrCrm;               \t\r\n");
      out.write("\t                \t$j(\"#medicoNome\").attr('hidden', 'true');\t                \t\r\n");
      out.write("\t                \treturn;                \t                \t\t                    \t                    \r\n");
      out.write("\t                }else if (medicoJson.length == 1){\t                \t\r\n");
      out.write("\t                \t$j('#inputCroCrmvRms').val('');\t\r\n");
      out.write("\t                \t$j('#txtCRM').val('');\r\n");
      out.write("\t                \t$j('#inputMedicoNome').val('');\t\t                \t               \t\r\n");
      out.write("\t\t\t\t\t\ttoAppend += '<option data-id=\"'+medicoJson[0].idProfissionalCr+' \"data-name=\"'+medicoJson[0].nmProfissional+'\" title=\"CRM '+medicoJson[0].nrCrm+'\">'+medicoJson[0].nmProfissional+'</option>';\t\t\r\n");
      out.write("\t\t\t\t\t\t                 \t \t\r\n");
      out.write("\t\t\t\t\t\tnmProfissional = medicoJson[0].nmProfissional;\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById('inputNomeMedicoImprimir').value = nmProfissional;\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tnrCrm = medicoJson[0].nrCrm;\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById('inputCrmImprimir').value = nrCrm;\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById('txtCRM').value = nrCrm;\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"imgLupaCrm\").hidden = false;\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$j('#medicoNome').append(toAppend);\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t                }else{\t                \r\n");
      out.write("\t                \tfor(var i=0;i<medicoJson.length;i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\tif (i == 0 ) {\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$j('#inputCroCrmvRms').val('');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$j('#inputMedicoNome').val('');\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttoAppend += '<option value=\"'+i+'\" data-id=\"'+medicoJson[0].idProfissionalCr+' \"data-name=\"'+medicoJson[0].nmProfissional+'\" title=\"CRM '+medicoJson[0].nrCrm+'\" selected>'+medicoJson[0].nmProfissional+'</option>';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnmProfissional = medicoJson[0].nmProfissional;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('inputNomeMedicoImprimir').value = nmProfissional;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tnrCrm = medicoJson[0].nrCrm;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('inputCrmImprimir').value = nrCrm; \r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById('txtCRM').value = nrCrm; \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.getElementById(\"imgLupaCrm\").hidden = false;\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t                   \r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\t\t                    \t \r\n");
      out.write("\t\t\t\t\t\t\t\t\ttoAppend += '<option value=\"'+i+'\" data-id=\"'+medicoJson[i].idProfissionalCr+' \"data-name=\"'+medicoJson[i].nmProfissional+'\" title=\"CRM '+medicoJson[i].nrCrm+'\">'+medicoJson[i].nmProfissional+'</option>';                    \r\n");
      out.write("\t\t\t\t\t\t\t\t}                     \r\n");
      out.write("\t\t                }\t\r\n");
      out.write("\t\t                $j('#medicoNome').append(toAppend);\t\r\n");
      out.write("\t                }\r\n");
      out.write("\t            },error: function (jqXHR, exception) {\r\n");
      out.write("\t            \tstopBuscaCrmLoadingAnimation();\r\n");
      out.write("\t                var obj = JSON.parse(jqXHR.responseText);\r\n");
      out.write("\t                console.log(\"Status Code: \" + jqXHR.status);\r\n");
      out.write("\t                alert(obj.messageReturn);\r\n");
      out.write("\t                $j('#txtCRM').val('');\r\n");
      out.write("\t                $j('#txtUfCrm').val('');\r\n");
      out.write("\t                $j('#medicoNome').val('');\t\r\n");
      out.write("\t                $j('#inputCrmImprimir').val('');\r\n");
      out.write("\t                $j('#medicoNomeImprimi').val('');\r\n");
      out.write("\t            }\r\n");
      out.write("\t        });\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction buscarCrmMedico (i){\t\t\r\n");
      out.write("\t\tvar resp = objResp; \t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t nmProfissional = resp[i].nmProfissional;\r\n");
      out.write("         document.getElementById('inputNomeMedicoImprimir').value = nmProfissional;\r\n");
      out.write("         \r\n");
      out.write("         nrCrm = resp[i].nrCrm;\r\n");
      out.write("         document.getElementById('inputCrmImprimir').value = nrCrm;  \r\n");
      out.write("         document.getElementById('txtCRM').value = nrCrm;        \r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar dsCrm = ''; \r\n");
      out.write("\tfunction verificaCRM(value){\t   \t\t\t\t\r\n");
      out.write("\t\t  dsCrm = value;\t\t\t   \t\t\t\t\r\n");
      out.write("\t\t  if (value == \"CRM\") {\t \r\n");
      out.write("\t\t  \tdocument.getElementById(\"medicoNome\").hidden = false;\r\n");
      out.write("\t\t  \tdocument.getElementById(\"imgLupaCrm\").hidden = false;\r\n");
      out.write("\t\t  \tdocument.getElementById('txtUfCrm').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('txtCRM').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('inputMedicoNome').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('medicoNome').value = \"\";\r\n");
      out.write("\t\t    document.getElementById(\"inputMedicoNome\").setAttribute(\"type\", \"hidden\");\t\t    \r\n");
      out.write("\t\t    document.getElementById(\"inputCroCrmvRms\").setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\t\t    document.getElementById(\"txtCRM\").setAttribute(\"type\", \"text\");\r\n");
      out.write("\t\t    document.getElementById('inputCroCrmvRms').value = \"\";\t\r\n");
      out.write("\t\t    document.getElementById('inputNomeMedicoImprimir').value = \"\";\t\t \t  \t\t    \t\r\n");
      out.write("\t\t    $('#labelTxtCrm').css('display', 'inline');\t \r\n");
      out.write("\t\t  \t$('#labetTxtCrmHidden').css('display', 'none');\t \r\n");
      out.write("\t\t  \t$('#labelNome').css('display', 'inline');\t \r\n");
      out.write("\t\t  \t$('#labelNomeHidden').css('display', 'none');\r\n");
      out.write("\t\t  \t$('#txtCRM').css('display', 'inline');\r\n");
      out.write("\t\t  \t$('#inputCrmImprimir').css('display', 'none');\t\t  \t\r\n");
      out.write("\t\t  \tvalidarAntimicrobianos ();    \r\n");
      out.write("\t\t    return false;\t\t    \r\n");
      out.write("\t\t  }else if(value == \"CRMV\") {\r\n");
      out.write("\t\t  \tdocument.getElementById(\"txtNomePac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtNascPac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"txtSexo\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"recDigital\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtRec\").disabled = false;    \t\t\r\n");
      out.write("    \t\tdocument.getElementById(\"inputMedicoNome\").setAttribute(\"type\", \"text\");\r\n");
      out.write("\t\t  \tdocument.getElementById(\"imgLupaCrm\").hidden = true;\r\n");
      out.write("\t\t  \tdocument.getElementById(\"medicoNome\").hidden = true;\t\r\n");
      out.write("\t\t  \tdocument.getElementById(\"inputCroCrmvRms\").setAttribute(\"type\", \"text\");\r\n");
      out.write("\t\t  \tdocument.getElementById(\"txtCRM\").setAttribute(\"type\", \"hidden\");\t\t  \t\r\n");
      out.write("\t\t  \tdocument.getElementById('txtCRM').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('medicoNome').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('txtUfCrm').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('inputMedicoNome').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('inputNomeMedicoImprimir').value = \"\";\t\r\n");
      out.write("\t\t  \tdocument.getElementById('inputCroCrmvRms').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('inputNomeMedicoImprimir').value = \"\";\t\t  \t\t  \t\r\n");
      out.write("\t\t  \t$('#labelTxtCrm').css('display', 'none');\t \r\n");
      out.write("\t\t  \t$('#labetTxtCrmHidden').css('display', 'inline');\t \r\n");
      out.write("\t\t  \t$('#labelNome').css('display', 'none');\t \r\n");
      out.write("\t\t  \t$('#labelNomeHidden').css('display', 'inline');\r\n");
      out.write("\t\t  \tdocument.getElementById('inputCrmImprimir').value = \"\";\t\r\n");
      out.write("\t\t  \t$('#inputCrmImprimir').css('display', 'none'); \t  \t\r\n");
      out.write("\t\t  \tvalidarAntimicrobianosCRMV();\r\n");
      out.write("    \t\treturn false;    \t\t  \t\r\n");
      out.write("\t\t  } else {\r\n");
      out.write("\t\t  \tdocument.getElementById(\"inputMedicoNome\").setAttribute(\"type\", \"text\");\r\n");
      out.write("\t\t  \tdocument.getElementById(\"imgLupaCrm\").hidden = true;\r\n");
      out.write("\t\t  \tdocument.getElementById(\"medicoNome\").hidden = true;\r\n");
      out.write("\t\t  \tdocument.getElementById(\"inputCroCrmvRms\").setAttribute(\"type\", \"text\");\r\n");
      out.write("\t\t  \tdocument.getElementById(\"txtCRM\").setAttribute(\"type\", \"hidden\");\t\t  \t\r\n");
      out.write("\t\t  \tdocument.getElementById('txtCRM').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('medicoNome').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('txtUfCrm').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('inputMedicoNome').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('inputNomeMedicoImprimir').value = \"\";\r\n");
      out.write("\t\t  \tdocument.getElementById('inputCroCrmvRms').value = \"\";\t\r\n");
      out.write("\t\t  \tdocument.getElementById('inputNomeMedicoImprimir').value = \"\";\r\n");
      out.write("\t\t  \t$('#labelTxtCrm').css('display', 'none');\t \r\n");
      out.write("\t\t  \t$('#labetTxtCrmHidden').css('display', 'inline');\t \r\n");
      out.write("\t\t  \t$('#labelNome').css('display', 'none');\t \r\n");
      out.write("\t\t  \t$('#labelNomeHidden').css('display', 'inline');\r\n");
      out.write("\t\t  \tdocument.getElementById('inputCrmImprimir').value = \"\";\r\n");
      out.write("\t\t  \t$('#inputCrmImprimir').css('display', 'none');\r\n");
      out.write("\t\t  \tvalidarAntimicrobianos ();\r\n");
      out.write("\t\t  \treturn false;\t  \r\n");
      out.write("\t\t  }\t\t\t  \t  \r\n");
      out.write("\t}\t    \t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\tfunction validarAntimicrobianosCRMV () {\r\n");
      out.write("\t\tif(cdCat == 5 && dsCrm == 'CRMV') {\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtNomePac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtNascPac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"txtSexo\").disabled = true;\t\r\n");
      out.write("    \t\tdocument.getElementById('txtNomePac').value = \"\"; \r\n");
      out.write("\t\t  \tdocument.getElementById('dtNascPac').value = \"\"; \r\n");
      out.write("\t\t  \tdocument.getElementById('txtSexo').value = \"\";\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn;\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validarAntimicrobianos () {\r\n");
      out.write("\t\tif(cdCat == 5 && dsCrm != 'CRMV') {\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtNomePac\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtNascPac\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"txtSexo\").disabled = false;\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn;\t\r\n");
      out.write("\t}\t    \t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\tfunction process(txtQtd) {\r\n");
      out.write("   \t var value = parseInt(document.getElementById(\"txtQtd\").value);\r\n");
      out.write("   \t value+=txtQtd;   \t  \r\n");
      out.write("   \t if (conexaoPharma == true) {\t  \r\n");
      out.write("\t   \t  if (obj.response.total == 0) {\r\n");
      out.write("\t\t   \t  \tif(value < 1){\r\n");
      out.write("\t\t\t      \tdocument.getElementById(\"txtQtd\").value = 1;\r\n");
      out.write("\t\t\t    }else{\r\n");
      out.write("\t\t\t   \t\tdocument.getElementById(\"txtQtd\").value = value;\t\t   \r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t    return;\r\n");
      out.write("\t\t   }\t   \t    \r\n");
      out.write("\t   \t  if (value == qtd) {\r\n");
      out.write("\t   \t  \tjAlert('Quantidade m\\u00e1xima permitada!',\"Receita Carimbo\");\t \t   \t   \r\n");
      out.write("\t   \t  }\r\n");
      out.write("\t\t    if(value < 1){\r\n");
      out.write("\t\t      \tdocument.getElementById(\"txtQtd\").value = 1;\r\n");
      out.write("\t\t    }else{\r\n");
      out.write("\t\t   \t\tdocument.getElementById(\"txtQtd\").value = value;\t\t   \r\n");
      out.write("\t    }\r\n");
      out.write("      }else{\r\n");
      out.write("\t\t    if(value < 1){\r\n");
      out.write("\t\t      \tdocument.getElementById(\"txtQtd\").value = 1;\r\n");
      out.write("\t\t    }else{\r\n");
      out.write("\t\t   \t\tdocument.getElementById(\"txtQtd\").value = value;\r\n");
      out.write("\t    }\r\n");
      out.write("\t    return;\r\n");
      out.write("\t\t   \r\n");
      out.write("\t  }\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    function startBuscaCrmLoadingAnimation() {\r\n");
      out.write("\t    var load = document.getElementById(\"imgCrmLoad\");\r\n");
      out.write("\t    if (load) {\r\n");
      out.write("\t\t    $j('#imgCrmLoad').show();\r\n");
      out.write("\t\t }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction stopBuscaCrmLoadingAnimation () {\r\n");
      out.write("\t    var load = document.getElementById(\"imgCrmLoad\");\r\n");
      out.write("\t    if (load) {\r\n");
      out.write("\t    \t$j('#imgCrmLoad').hide();\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar obj = '';\t\r\n");
      out.write("\tvar conexaoPharma = false;\r\n");
      out.write("    function buscarSaldoProdutoPharmaConnection() {    \t\r\n");
      out.write("        var medMs = document.getElementById('txtMs').value; \r\n");
      out.write("        var url = TERMINAL_CONSULTA_SERVICOS_URL + \"receitaCarimboTC\" + \"/consultaSaldoPharmaConnection/\" +cdFilial+ \"/\" + medMs;                   \r\n");
      out.write("         $j.ajax({\r\n");
      out.write("\t        type: 'GET',\r\n");
      out.write("\t        async: false,\r\n");
      out.write("\t        cache: false,\r\n");
      out.write("\t        contentType: 'application/json',\t        \t        \r\n");
      out.write("\t        url:  url,\r\n");
      out.write("\t        success: function (response) {\t        \t        \t\r\n");
      out.write("\t        \tconsole.log(\"sucesso:\" + JSON.stringify(response));\t\r\n");
      out.write("\t        \tmedPsicotropicos(response);  \r\n");
      out.write("\t        \tstopBuscaProdutoLoadingAnimation();  \r\n");
      out.write("\t        \tobj = response;\r\n");
      out.write("\t        \tconexaoPharma = true;     \t\t\t\t\t     \t        \t\t        \t\t\t\t        \t      \t\t\r\n");
      out.write("\t        },error: function (jqXHR, exception) {\t\t        \t             \r\n");
      out.write("\t            console.log(\"Status Code: \" + jqXHR.status);\r\n");
      out.write("\t            jAlert('Falha na conexão com o pharmaconnection. Inserir manual o lote, a data e a quantidade',\"Receita Carimbo\");\t\r\n");
      out.write("\t            document.getElementById('txtQtd').value = 0;\r\n");
      out.write("\t\t    \t$j(\"#txtLote\").attr('hidden', 'true');\r\n");
      out.write("\t    \t\tdocument.getElementById(\"inputTxtLote\").setAttribute(\"type\", \"text\");\r\n");
      out.write("\t    \t\tstopBuscaProdutoLoadingAnimation();\r\n");
      out.write("\t    \t\tconexaoPharma = false;\r\n");
      out.write("\t       }\r\n");
      out.write("    \t});   \t\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("     function medPsicotropicos(resp) { \r\n");
      out.write("    \t$j('#txtLote').find('option').remove();    \t\r\n");
      out.write("    \tvar json = resp;\t\r\n");
      out.write("    \tvar varLote = '';\r\n");
      out.write("    \tvar med_exp = '';\r\n");
      out.write("    \tvar med_amount = '';    \t\r\n");
      out.write("    \tif (resp.response.total == 0) {\r\n");
      out.write("    \t\t$j(\"#txtLote\").attr('hidden', 'true');\r\n");
      out.write("    \t\tdocument.getElementById(\"inputTxtLote\").setAttribute(\"type\", \"text\");\r\n");
      out.write("    \t\tlimparCampo()    \t\t\r\n");
      out.write("    \t}else {\r\n");
      out.write("    \t\tdocument.getElementById('txtMs').value = json.response.result[0].med_ms\r\n");
      out.write("    \t\tfor (var i in json.response.result)\t{ \t\t\r\n");
      out.write("    \t\t  document.getElementById(\"txtLote\").removeAttribute('hidden','');\r\n");
      out.write("\t\t\t  document.getElementById(\"inputTxtLote\").setAttribute(\"type\", \"hidden\");\t  \t\t\t  \r\n");
      out.write("\t\t\t  varLote += '<option value=\"'+i+'\">'+json.response.result[i].med_batch+'</option>';\t\t    \r\n");
      out.write("\t          if (i == 0){\r\n");
      out.write("\t          var med_batch = json.response.result[i].med_batch;\r\n");
      out.write("\t          document.getElementById('idLote').value = med_batch;\r\n");
      out.write("\t          \r\n");
      out.write("\t\t      var med_amount = json.response.result[i].med_amount;\r\n");
      out.write("\t\t      document.getElementById('txtLoteQtd').value = med_amount; \r\n");
      out.write("\t\t      qtd =  med_amount; \t\t\t  \t\t\t  \r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  med_exp = json.response.result[i].med_exp;\t  \r\n");
      out.write("\t\t\t  document.getElementById('txtVal').value =formatDatePharma(med_exp);\r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t  }\t\t\r\n");
      out.write("\t\t  $j('#txtLote').append(varLote); \r\n");
      out.write("\t\t  $j('#inputTxtLote').append(varLote); \r\n");
      out.write("\t   }\r\n");
      out.write("\t   \r\n");
      out.write("    } \r\n");
      out.write("    \r\n");
      out.write("   var qtd = ''; \r\n");
      out.write("     \r\n");
      out.write("    function  buscarDataQtd(i) {        \t\r\n");
      out.write("\t   \tvar json = obj;   \r\n");
      out.write("\t   \t\r\n");
      out.write("\t   \tvar med_batch = json.response.result[i].med_batch;\r\n");
      out.write("\t    document.getElementById('idLote').value = med_batch;\r\n");
      out.write("\t   \t\t\r\n");
      out.write("\t   \tvar med_amount = json.response.result[i].med_amount;\r\n");
      out.write("\t    document.getElementById('txtLoteQtd').value = med_amount;\t  \t\r\n");
      out.write("\t  \tqtd =  med_amount;  \t\t  \r\n");
      out.write("\t \r\n");
      out.write("\t    med_exp = json.response.result[i].med_exp;\t  \r\n");
      out.write("\t    document.getElementById('txtVal').value = formatDatePharma(med_exp);   \t\r\n");
      out.write("\t   \t\r\n");
      out.write("\t    document.getElementById('txtQtd').value = 0; \t\r\n");
      out.write("\t   \t\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("     function regraPsico(retCdPsicotropicos) {\r\n");
      out.write("    \tif (retCdPsicotropicos == 1) {\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtNomePac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtNascPac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"txtSexo\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"recDigital\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtRec\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"nrNotif\").disabled = false;\r\n");
      out.write("    \t\tlimparCampoDadosPacientes();\r\n");
      out.write("    \t\treturn false;     \t\t \t\t\r\n");
      out.write("    \t} else if (retCdPsicotropicos == 2) {\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtNomePac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtNascPac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"txtSexo\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"recDigital\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtRec\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"nrNotif\").disabled = true;\r\n");
      out.write("    \t\tlimparCampoDadosPacientes();\r\n");
      out.write("    \t\treturn false;   \t\t\t\t\r\n");
      out.write("    \t}  else  if (retCdPsicotropicos == 3){\r\n");
      out.write("    \t\tdocument.getElementById(\"txtNomePac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtNascPac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"txtSexo\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"recDigital\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtRec\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"nrNotif\").disabled = false;\r\n");
      out.write("    \t\tlimparCampoDadosPacientes();\r\n");
      out.write("    \t\treturn false;    \t\t\r\n");
      out.write("    \t}  else if (retCdPsicotropicos == 4) {\t\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtNomePac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtNascPac\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"txtSexo\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById(\"recDigital\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtRec\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"nrNotif\").disabled = false;\r\n");
      out.write("    \t\tlimparCampoDadosPacientes();\r\n");
      out.write("    \t\treturn false;    \t\t     \t\t\t\r\n");
      out.write("    \t} else if (retCdPsicotropicos == 5) {\t\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtNomePac\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtNascPac\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"txtSexo\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"recDigital\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"dtRec\").disabled = false;\r\n");
      out.write("    \t\tdocument.getElementById(\"nrNotif\").disabled = true;\r\n");
      out.write("    \t\tdocument.getElementById('nrNotif').value = \"\";\r\n");
      out.write("    \t\treturn false;    \t\t  \t\t   \t\r\n");
      out.write("    \t}    \t\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    function formatDate(date) {\r\n");
      out.write("\t  var datePart = date.match(/\\d+/g),\r\n");
      out.write("\t  year = datePart[0].substring(0), \r\n");
      out.write("\t  month = datePart[1], day = datePart[2];\r\n");
      out.write("\t\r\n");
      out.write("\t  return day+'/'+month+'/'+year;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("    function formatDatePharma(date) {\r\n");
      out.write("\t  var datePart = date.match(/\\d+/g),\r\n");
      out.write("\t  year = datePart[0].substring(0), \r\n");
      out.write("\t  month = datePart[1], day = datePart[2];\r\n");
      out.write("\t\r\n");
      out.write("\t  return month+'/'+year;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function limparCampoMedico() {\r\n");
      out.write("  \tdocument.getElementById('txtConselho').value = \"\";\r\n");
      out.write("  \tdocument.getElementById('txtCRM').value = \"\";\r\n");
      out.write("  \tdocument.getElementById('txtUfCrm').value = \"\";\r\n");
      out.write("  \tdocument.getElementById('medicoNome').value = \"\";\r\n");
      out.write("  \tdocument.getElementById('inputMedicoNome').value = \"\";\r\n");
      out.write("  \tdocument.getElementById('inputCroCrmvRms').value = \"\";\r\n");
      out.write("  \tdocument.getElementById('inputCrmImprimir').value = \"\";\r\n");
      out.write("  \tdocument.getElementById('inputNomeMedicoImprimir').value = \"\";\r\n");
      out.write("  \t\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function limparCampo() {\r\n");
      out.write("  \t  document.getElementById('inputTxtLote').value = \"\";\r\n");
      out.write("  \t  document.getElementById('txtLote').value = \"\";\r\n");
      out.write("\t  document.getElementById('txtQtd').value = 0;\r\n");
      out.write("\t  document.getElementById('txtVal').value = \"\";\t\r\n");
      out.write("\t  return;\r\n");
      out.write("   \r\n");
      out.write("  } \r\n");
      out.write("  \r\n");
      out.write("  function limparCampoProduto() {\r\n");
      out.write("  \t document.getElementById('inputTxtLote').value = \"\";  \t \r\n");
      out.write("  \t document.getElementById('txtLote').value = \"\";\r\n");
      out.write("  \t document.getElementById('txtQtd').value = 0;\r\n");
      out.write("  \t document.getElementById('txtMs').value = \"\";\r\n");
      out.write("  \t document.getElementById('txtVal').value = \"\";\r\n");
      out.write("  \t document.getElementById('txtMed').value = \"\";\r\n");
      out.write("  \t document.getElementById('txtProd').value = \"\";\r\n");
      out.write("  \t return;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function limparCampoDadosPacientes() {\r\n");
      out.write("  \tdocument.getElementById('txtNomePac').value = \"\"; \r\n");
      out.write("  \tdocument.getElementById('dtNascPac').value = \"\"; \r\n");
      out.write("  \tdocument.getElementById('txtSexo').value = \"\"; \r\n");
      out.write("  \tdocument.getElementById('nrNotif').value = \"\"; \r\n");
      out.write("  \tdocument.getElementById('dtRec').value = \"\"; \r\n");
      out.write("  \tdocument.getElementById('recDigital').value = \"\"; \r\n");
      out.write("  \treturn;  \r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  function startBuscaProdutoLoadingAnimation() {\r\n");
      out.write("\t    $('#buttonProduto').css('display', 'none');\t    \r\n");
      out.write("\t    var load = document.getElementById(\"imgBuscarProdutoLoad\");\t    \r\n");
      out.write("\t    if (load) {\r\n");
      out.write("\t        load.style.display = \"inline\";\t        \r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction stopBuscaProdutoLoadingAnimation() {\r\n");
      out.write("\t    $('#buttonProduto').css('display', 'inline');\r\n");
      out.write("\t    var load = document.getElementById(\"imgBuscarProdutoLoad\");\r\n");
      out.write("\t    if (load) {\r\n");
      out.write("\t        load.style.display = \"none\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t}  \r\n");
      out.write("\t\r\n");
      out.write("\tfunction habilitar(){\r\n");
      out.write("\t\tif(document.getElementById('chkProdContinuo').checked){\r\n");
      out.write("\t\t\tflProdutoContinuo = 1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction verificaCheckbox() {\r\n");
      out.write("\t    if(document.getElementById('ch_Sim').checked){  \r\n");
      out.write("\t        document.getElementById('ch_Nao').checked = false; \r\n");
      out.write("\t        document.getElementById(\"recDigital\").disabled = false;   \r\n");
      out.write("\t    }\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   function verificaCheckboxDesabilitar(){\r\n");
      out.write("\t   \tif(document.getElementById('ch_Nao').checked){\r\n");
      out.write("\t   \t\t document.getElementById('ch_Sim').checked = false;\r\n");
      out.write("\t         document.getElementById(\"recDigital\").disabled = true;\r\n");
      out.write("\t\t\t document.getElementById(\"recDigital\").value = \"\"; \r\n");
      out.write("\t   \t}   \r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("</script>\r\n");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("css/jquery.alerts.css\" />\r\n");
      out.write("</br>\r\n");
      out.write("</br>\r\n");
      out.write("<div class=\"infoBar\"><b><h1>RECEITA CONTROLADOS</h1></b></div>\r\n");
      out.write("</br>\r\n");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/javascript\" css>\r\n");
      out.write("  #numCep:hover {\r\n");
      out.write("    background-position:0 -44px;\r\n");
      out.write("  }\r\n");
      out.write("  #numCep:focus {\r\n");
      out.write("    background-position:0 -88px;\r\n");
      out.write("  } \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div style=\"display: flex; justify-content: space-between;\"\r\n");
      out.write("\talign=\"center\">\r\n");
      out.write("\t<form name=\"formcarimbo\"\r\n");
      out.write("\t\taction=\"");
      if (_jspx_meth_portlet_005factionURL_005f0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\tmethod=\"POST\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<ol class=\"form\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<div class=\"rc-campo-azul\">\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><label class=\"rc-txt-busca\" for=\"txtProd\">Procure o produto</br>para adicionar na Receita \t\t\t\t\t\t\t\t</label></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input\" type=\"text\" onkeypress=\"whenEnterExec(event, buscar)\" maxlength=\"18\" onkeyup=\"Mascara(this,Integer);\" name=\"txtProd\" id=\"txtProd\" style=\"float: left;\" class=\"inputTextProd\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-button-buscar\" id=\"buttonProduto\" type=\"button\" value=\"Buscar\" onclick=\"buscar()\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img id=\"imgBuscarProdutoLoad\" style=\"vertical-align: middle; display: none;\"\tsrc=\"/tc-core-portlets_1.0/images/ajaxLoader.gif\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><label class=\"rc-produto-medicamento\"  for=\"txtMed\">Produtos (medicamento)</label></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"rc-tb-produto\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"rc-tb-inserir\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"rc-label\" style=\"text-align: left\" >Medicamento</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"rc-label\" style=\"text-align: left\" for=\"txtLote\">Lote</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"rc-label85\" style=\"text-align: left\" for=\"txtLoteQtd\">Lote Disponível</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"rc-label\" style=\"width: 85px; text-align: left\" for=\"txtMs\">MS</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"rc-label\" style=\"text-align: left\" for=\"txtVal\">Validade</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"rc-label80\" style=\"text-align: left\" for=\"txtQtd\">Quantidade</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"txtMed\" id=\"txtMed\" maxlength=\"90\" disabled=\"disabled\" class=\"rc-input-txtMed\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"txtLote\" id=\"txtLote\" class=\"rc-select-lote\" onchange= \"buscarDataQtd(this.value)\"></select>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"txtLote\" id=\"inputTxtLote\" size=\"20\" maxlength=\"15\" class=\"rc-input-lote\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"txtLote\" id=\"idLote\" size=\"20\" class=\"rc-input-lote\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-loteQtd\" type=\"text\" name=\"txtLoteQtd\" id=\"txtLoteQtd\" value=\"0\" onKeyPress=\"Mascara(this,Integer);\" size=\"2\" maxlength=\"2\" minlength=\"2\" disabled=\"disabled\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"txtMs\" id=\"txtMs\" size=\"25\" maxlength=\"20\" class=\"rc-input-txtMs\" disabled=\"disabled\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"txtVal\" id=\"txtVal\" pattern=\"MM/yyyy\"  onKeyPress=\"Mascara(this, DataMmYyyy);\" size=\"17\" maxlength=\"7\" class=\"rc-input-txtVal\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-btn-minus\" type=\"button\" align=\"right\" id=\"minus\" value='-' onclick=\"process(-1)\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-qtd\" type=\"text\" name=\"txtQtd\" id=\"txtQtd\" value=\"0\" onKeyPress=\"Mascara(this,Integer);\" size=\"2\" maxlength=\"2\" minlength=\"2\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-btn-plus\" type=\"button\" align=\"left\" id=\"plus\" value='+' onclick=\"process(1)\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"txtCat\" id=\"txtCat\" size=\"05\" maxlength=\"04\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"txtEan\" id=\"txtEan\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"txtCdProd\" id=\"txtCdProd\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name= \"txtCdPsico\" id=\"txtCdPsico\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name= \"txtDtTransacao\" id=\"txtDtTransacao\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-button-inserir\" id=\"addBut\" type=\"button\" value=\"Adicionar\" onClick=\"addRow();\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"chkProdContinuo\" id=\"chkProdContinuo\" onclick=\"habilitar()\" style=\"position: relative; left: 18px\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"rc-label30\" style=\"text-align: left; position: relative; left: 18px\" for=\"chkProdContinuo\">Antibi&oacute;ticos de uso cont&iacute;nuo</label>\r\n");
      out.write("\t\t\t\t\t\t</td>\t\r\n");
      out.write("\t\t\t\t\t\t<hr class=\"hr3\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"rc-tb-inserir2\" id=\"tabelaDetalhe\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"rc-cabecalho-disp-none\" id=\"rc-cabecalho\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\" style=\"display: none\"><b>Produto</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\"><b>Medicamento</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\" style=\"display: none\"><b>Cat</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\"><b>MS</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\"><b>Lote</b></th>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\"><b>Validade</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\"><b>Qtd</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\" style=\"display: none\"><b>CdPsico</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\" style=\"display: none\"><b>cdProduto</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"rc-label\" style=\"display: none\"><b>prodCont</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"linhaTabela\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"display: none\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"display: none\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"display: none\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"display: none\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"display: none\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<caption style=\"text-align: left; padding: 0px;\">\t\t\t\t\t\t\t \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"infoBar\" style=\"position: relative; top: 30px; right: 20px\"><b><h1>DADOS DO CLIENTE</h1></b></div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</caption>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"rc-button-historico\" id=\"LinkBuscaHistoricoCliente\" onClick=\"buscarHistClient();\" \r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"position: relative; left: 870px; top: -10px\">Preencher com a </br> &uacute;ltima etiqueta</button>\t\t\t\t\t\t\t \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label120\"\tstyle=\"width: 120px; text-align: left\" for=\"txtNome\">Nome do comprador</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label120\" style=\"width: 120px; text-align: left\" for=\"tipoDoc\">Tipo Documento</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label20\" style=\"width: 30px; text-align: left\" for=\"numRg\">Documento</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\" style=\"text-align: left; position: relative; right: 4px\" for=\"ufRg\">Emissor</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label80\" style=\"text-align: left\" for=\"ufRg\">UF Emissor</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\"\tstyle=\"width: 120px; text-align: left\" for=\"dtNasc\">Data Nascimento</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-txtNome\" type=\"text\" name=\"txtNome\" id=\"txtNome\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"rc-select-tipoDocumento\" id=\"selectTipoDocumento\" name=\"selectTipoDocumento\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Selecione</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t                    </select>                    \t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-numRg\" type=\"text\" name=\"numRg\" id=\"numRg\" size=\"15\" maxlength=\"38\" minlength=\"10\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"rc-select-txtEmissor\" id=\"ufRg\" name=\"ufRg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Selecione</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"rc-select-txtUfEmissor\" name=\"txtUfEmissor\" id=\"txtUfEmissor\" style=\"width: 80px;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Selecione</option><option value=\"AC\">AC</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"AL\">AL</option><option value=\"AM\">AM</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"AP\">AP</option><option value=\"BA\">BA</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"CE\">CE</option><option value=\"DF\">DF</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"ES\">ES</option><option value=\"GO\">GO</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"MA\">MA</option><option value=\"MG\">MG</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"MS\">MS</option><option value=\"MT\">MT</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PA\">PA</option><option value=\"PB\">PB</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PE\">PE</option><option value=\"PI\">PI</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PR\">PR</option><option value=\"RJ\">RJ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"RN\">RN</option><option value=\"RS\">RS</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"RO\">RO</option><option value=\"RR\">RR</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"SC\">SC</option><option value=\"SE\">SE</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"SP\">SP</option><option value=\"TO\">TO</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-dtNasc\" type=\"text\" \tname=\"dtNasc\" id=\"dtNasc\" onKeyPress=\"Mascara(this,Data);\" maxlength=\"10\" pattern=\"DD/MM/yyyy\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\" style=\"width: 85px; text-align: left\" for=\"numCep\">CEP</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label80\" style=\"width: 85px; text-align: left\" for=\"txtLogra\">Endere&ccedil;o</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\" style=\"width: 85px; text-align: left; position: relative; right: 5px\" for=\"numNumero\">N&uacute;mero</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label40\" for=\"txtComplemento\" style=\"position: relative; right: 28px\">Complemento</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label120\"\tstyle=\"width: 85px; text-align: left; position: relative; right: 33px\" for=\"txtBairro\">Bairro</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\" style=\"width: 85px; text-align: left; position: relative; right: 36px\" for=\"txtCidade\">Cidade</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label20\" style=\"text-align: left; position: relative; right: 42px\" for=\"txtUf\">UF</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-numCep\" type=\"text\" style=\"text-align: left\"\tname=\"numCep\" id=\"numCep\" onkeyup=\"Mascara(this,Integer);\" onKeyPress=\"Mascara(this,Cep); whenEnterExec(event, buscaNovoCep);\" onblur=\"buscaNovoCep();\" size=\"10\" maxlength=\"9\" minlength=\"9\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-txtLogra\" type=\"text\" name=\"txtLogra\" id=\"txtLogra\" size=\"30\" maxlength=\"60\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-numNumero\" type=\"text\" style=\"text-align: left\" name=\"numNumero\" id=\"numNumero\" onKeyPress=\"Mascara(this,Integer);\" size=\"6\" maxlength=\"6\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-txtComplemento\" type=\"text\" name=\"txtComplemento\" id=\"txtComplemento\" size=\"10\" maxlength=\"40\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-txtBairro\" type=\"text\" name=\"txtBairro\" id=\"txtBairro\" size=\"25\" maxlength=\"20\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-txtCidade\"type=\"text\" name=\"txtCidade\" id=\"txtCidade\" size=\"31\" maxlength=\"55\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"rc-select-txtUf\" name=\"txtUf\" id=\"txtUf\" style=\"width: 80px;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Selecione</option><option value=\"AC\">AC</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"AL\">AL</option><option value=\"AM\">AM</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"AP\">AP</option><option value=\"BA\">BA</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"CE\">CE</option><option value=\"DF\">DF</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"ES\">ES</option><option value=\"GO\">GO</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"MA\">MA</option><option value=\"MG\">MG</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"MS\">MS</option><option value=\"MT\">MT</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PA\">PA</option><option value=\"PB\">PB</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PE\">PE</option><option value=\"PI\">PI</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PR\">PR</option><option value=\"RJ\">RJ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"RN\">RN</option><option value=\"RS\">RS</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"RO\">RO</option><option value=\"RR\">RR</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"SC\">SC</option><option value=\"SE\">SE</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"SP\">SP</option><option value=\"TO\">TO</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label120\" style=\"width: 85px; text-align: left\" for=\"numTpFone\">Contato</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label40\" style=\"text-align: right; position: relative; right: 7px\" for=\"numDDD\">DDD</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\" style=\"position: relative; right: 10px\" for=\"numTel\">Telefone</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"rc-select-numTpFone\" id=\"numTpFone\" name=\"numTpFone\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\" selected=\"selected\">Selecione</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">RESIDENCIAL</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">COMERCIAL</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"3\">CELULAR</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-numDDD\" type=\"text\" style=\"text-align: left;\" name=\"numDDD\" id=\"numDDD\" onKeyPress=\"Mascara(this,Integer);\" size=\"2\" maxlength=\"2\" minlength=\"2\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-numTel\" type=\"text\" style=\"text-align: left\"\tname=\"numTel\" id=\"numTel\" onKeyPress=\"Mascara(this,Telefone);\"\tsize=\"15\" maxlength=\"10\" minlength=\"8\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<caption style=\"text-align: left; padding: 0px;\">\t\t\t\t\t\t\t \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"infoBar\" style=\"position: relative; top: 30px; right: 20px\"><b><h1>DADOS DA RECEITA</h1></b></div>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</caption>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"rc-button-historico\" id=\"LinkPreencherDadosComprador\" onClick=\"preencherDadosComprador();\" \r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"position: relative; left: 870px; top: -10px\">Preencher com </br> dados do comprador </button>\t\t\t\t\t\t\t \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label120\"\tstyle=\"width: 120px; text-align: left\" for=\"txtNomePaciente\">Nome do paciente</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\"\tstyle=\"width: 120px; text-align: left\" for=\"dtNasc\">Data Nascimento</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\" style=\"text-align: left; position: relative; right: 17px\"\tfor=\"sexo\">Sexo</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label120\"\tstyle=\"width: 150px; text-align: left; position: relative; right: 15px\" for=\"txtNumNotificacao\">N&uacute;mero da notifica&ccedil;&atilde;o</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-txtNomePac\" type=\"text\"  name=\"txtNomePac\" id=\"txtNomePac\" size=\"40\" maxlength=\"70\" disabled=\"disabled\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-dtNascPac\" type=\"text\" \tname=\"dtNascPac\" id=\"dtNascPac\" pattern=\"DD/MM/yyyy\" onKeyPress=\"Mascara(this,Data);\" size=\"17\" maxlength=\"10\" disabled=\"disabled\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"rc-select-sexo\" id=\"txtSexo\" name=\"txtSexo\"\tdisabled=\"disabled\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Selecione</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"F\" label=\"Feminino\">F</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"M\" label=\"Masculino\">M</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-nrNotif\" type=\"text\" name=\"nrNotif\" id=\"nrNotif\" size=\"20\" maxlength=\"10\" disabled=\"disabled\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label120\"\tstyle=\"width: 85px; text-align: left\" for=\"txtConselho\">Conselho</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label180\"\tstyle=\"width: 180px; text-align: left\" for=\"txtCRM\" id=\"labelTxtCrm\">N° ou Nome</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label180\"\tstyle=\"width: 180px; text-align: left; display: none;\" for=\"txtCRM\" id=\"labetTxtCrmHidden\">CRM</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\" style=\"text-align: left\"\tfor=\"txtUfCrm\">UF</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label120\"\tstyle=\"width: 120px; text-align: left\" id=\"labelNome\">M&eacute;dico</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label120\"\tstyle=\"width: 120px; text-align: left; display: none;\" id=\"labelNomeHidden\">Nome do M&eacute;dico</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"label60\"\tstyle=\"width: 120px; text-align: left\" for=\"dtNasc\">Data da Receita</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"rc-select-txtConselho\"name=\"txtConselho\" id=\"txtConselho\"\tonchange=\"verificaCRM(this.value)\" style=\"width: 80px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Selecione</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"CRM\">CRM</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"CRO\">CRO</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"CRMV\">CRMV</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"RMS\">RMS</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-crm\" type=\"text\" name=\"txtCRM\" id=\"txtCRM\" size=\"10\" maxlength=\"20\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-crm2\" type=\"hidden\" name=\"inputCroCrmvRms\" id=\"inputCroCrmvRms\" size=\"10\" maxlength=\"20\" onkeyup=\"Mascara(this,Integer);\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-crm3\" type=\"text\" name=\"inputCrmImprimir\" id=\"inputCrmImprimir\" size=\"10\" maxlength=\"20\" style=\"display:none;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-crm3\" type=\"text\" name=\"inputNomeMedicoImprimir\" id=\"inputNomeMedicoImprimir\" size=\"10\" maxlength=\"20\" style=\"display:none;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"rc-input-txtUfCrm\" name=\"txtUfCrm\" id=\"txtUfCrm\" style=\"width: 80px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Selecione</option><option value=\"AC\">AC</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"AL\">AL</option><option value=\"AM\">AM</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"AP\">AP</option><option value=\"BA\">BA</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"CE\">CE</option><option value=\"DF\">DF</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"ES\">ES</option><option value=\"GO\">GO</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"MA\">MA</option><option value=\"MG\">MG</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"MS\">MS</option><option value=\"MT\">MT</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PA\">PA</option><option value=\"PB\">PB</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PE\">PE</option><option value=\"PI\">PI</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PR\">PR</option><option value=\"RJ\">RJ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"RN\">RN</option><option value=\"RS\">RS</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"RO\">RO</option><option value=\"RR\">RR</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"SC\">SC</option><option value=\"SE\">SE</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"SP\">SP</option><option value=\"TO\">TO</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img onclick=\"buscaMedico()\" id=\"imgLupaCrm\" title=\"Buscar Medico\" src=\"/tc-core-portlets_1.0/images/buttons/search-2-16.png\" style=\"cursor: pointer\"/> \r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"rc-select-medicoNome\" name=\"medicoNome\" id=\"medicoNome\" style=\"height: 24px; width: 300px\" onchange= \"buscarCrmMedico(this.value)\"></select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-medicoNome\"type=\"hidden\" name=\"inputMedicoNome\" id=\"inputMedicoNome\"\tstyle=\"height: 24px; width: 300px\" class=\"inputMedicoNome\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img id=\"imgCrmLoad\" style=\"vertical-align: middle; display: none;\"\tsrc=\"/tc-core-portlets_1.0/images/ajaxLoader.gif\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"rc-input-dtRec\" type=\"text\" name=\"dtRec\" id=\"dtRec\"  pattern=\"DD/MM/yyyy\" onKeyPress=\"Mascara(this, Data);\" size=\"17\" maxlength=\"10\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"rc-label30\" style=\"text-align: left\" for=\"chkReceitaDigital\">Receita Digital?</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"label120\"\tstyle=\"width: 180px; text-align: right; position: relative; left: 15px\" for=\"txtReceitaDigital\">Tipo de receita digital (selecione)</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"ch_Sim\" value=\"ch_Sim\" id=\"ch_Sim\" onclick=\"verificaCheckbox(this.value)\" style=\"position: relative; right:5px\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"campo-checkbox1\" style=\"position:relative;right:12px\">Sim</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"ch_Nao\" value=\"ch_Nao\" id=\"ch_Nao\" onclick=\"verificaCheckboxDesabilitar(this.value)\" style=\"position: relative; left:5px\"/>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"campo-checkbox2\">Não</label>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"rc-input-recDigital\" id=\"recDigital\" name=\"recDigital\" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\">Selecione</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Memed\">Memed</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Nexodata\">Nexodata</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Albert Einstein\">Albert Einstein</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Drº Consulta\">Dr Consulta</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Receita Amigo\">Receita Amigo</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Solis\">Solis</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"CREMERS\">CREMERS</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"CREMERJ\">CREMERJ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"CREMESC\">CREMESC</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"CRMPR \">CRMPR</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"FLEURY\">FLEURY</option>\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Conselhos Regionais\">Conselhos Regionais</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Unimed\">Unimed</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"Outros\">Outros</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"rc-btn-imprimir\" id=\"btCad\" type=\"button\" value=\"Imprimir\" onclick=\"imprimir()\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"dialog-confirm\" title=\"Tudo certo!\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"dialog-confirm-ReceitaDigital\" title=\"Ops!\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t<tfoot>\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" value=\"\" id=\"contEtiqueta\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" value=\"\" id=\"ultimaNrEtiqueta\">\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"4\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</tfoot>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div id=\"listaHistoricoClienteNovo\" style=\"display: none;\"></div>\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"dialogoEnderecos\" title=\"Selecionar Endereço\"\r\n");
      out.write("\tstyle=\"display: none;\">\r\n");
      out.write("\t<table width=\"60%\" style=\"\"2\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fchoose_005f1(_jspx_page_context))
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

  private boolean _jspx_meth_c_005fout_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(41,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.idCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(60,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(61,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.rg}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(62,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(63,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrPrefixo}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(64,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.cdTipoTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(65,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.logradouro}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(66,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.numero}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(67,34) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.complemento}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(68,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.bairro}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(69,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.cep}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(70,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.cidade}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(71,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.uf}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(491,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f13 = _jspx_th_c_005fout_005f13.doStartTag();
    if (_jspx_th_c_005fout_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f13);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(631,89) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(854,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpf}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(855,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f15.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${idCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(882,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f16.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${idCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1090,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f17.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${idCliente}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f17 = _jspx_th_c_005fout_005f17.doStartTag();
    if (_jspx_th_c_005fout_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f17);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1713,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
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
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write('\r');
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1719,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msgErro != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<script>\r\n");
        out.write("\t\t\tjAlert('");
        if (_jspx_meth_c_005fout_005f18(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
          return true;
        out.write("',\"Impress\\u00e3o Receita\");\r\n");
        out.write("\t\t\tnovoAtendimento();\r\n");
        out.write("\t\t</script>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1721,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f18.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msgErro}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f18 = _jspx_th_c_005fout_005f18.doStartTag();
    if (_jspx_th_c_005fout_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f18);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1739,29) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setName("page");
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1739,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_portlet_005fparam_005f0.setValue("mainview");
    int _jspx_eval_portlet_005fparam_005f0 = _jspx_th_portlet_005fparam_005f0.doStartTag();
    if (_jspx_th_portlet_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fportlet_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_portlet_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1899,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("tipoDocumento");
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1899,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1899,10) '${comboTipoDocumento}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${comboTipoDocumento}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoDocumento.cdTipoDocumento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_005fout_005f19(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</option>\r\n");
          out.write("\t\t\t\t                        ");
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

  private boolean _jspx_meth_c_005fout_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1900,81) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f19.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tipoDocumento.dsTipoDocumento}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f19 = _jspx_th_c_005fout_005f19.doStartTag();
    if (_jspx_th_c_005fout_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f19);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1910,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("emissor");
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1910,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1910,10) '${comboEmissor}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${comboEmissor}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emissor}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_005fout_005f20(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("</option>\r\n");
          out.write("\t\t\t\t                        ");
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

  private boolean _jspx_meth_c_005fout_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(1911,59) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f20.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emissor}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f20 = _jspx_th_c_005fout_005f20.doStartTag();
    if (_jspx_th_c_005fout_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f20);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2225,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("i");
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2225,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2225,2) '0'",_el_expressionfactory.createValueExpression("0",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2225,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setScope("page");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2226,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("endereco");
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2226,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2226,2) '${enderecos}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${enderecos}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tbody>\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<th>Selecione</th>\r\n");
          out.write("\t\t\t\t\t<th>Logradouro</th>\r\n");
          out.write("\t\t\t\t\t<th>Número</th>\r\n");
          out.write("\t\t\t\t\t<th>Complemento</th>\r\n");
          out.write("\t\t\t\t\t<th>Bairro</th>\r\n");
          out.write("\t\t\t\t\t<th>CEP</th>\r\n");
          out.write("\t\t\t\t\t<th>Cidade</th>\r\n");
          out.write("\t\t\t\t\t<th>UF</th>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td nowrap><input style=\"font-weight: normal\"\r\n");
          out.write("\t\t\t\t\t\tname='enderecoSelecionado' type=\"radio\"\r\n");
          out.write("\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></input></td>\r\n");
          out.write("\t\t\t\t\t<td nowrap><label style=\"font-weight: normal\"\r\n");
          out.write("\t\t\t\t\t\tid='mostraLogradouro");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.logradouro}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t<td nowrap><label style=\"font-weight: normal\"\r\n");
          out.write("\t\t\t\t\t\tid='mostraEnderecoNumero");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.numero}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t<td nowrap><label style=\"font-weight: normal\"\r\n");
          out.write("\t\t\t\t\t\tid='mostraComplemento");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.complemento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t<td nowrap><label style=\"font-weight: normal\"\r\n");
          out.write("\t\t\t\t\t\tid='mostraBairro");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.bairro}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t<td nowrap><label style=\"font-weight: normal\"\r\n");
          out.write("\t\t\t\t\t\tid='mostraCep");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.cep}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t<td nowrap><label style=\"font-weight: normal\"\r\n");
          out.write("\t\t\t\t\t\tid='mostraCidade");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.cidade}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t\t<td nowrap><label style=\"font-weight: normal\"\r\n");
          out.write("\t\t\t\t\t\tid='mostraUf");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.uf}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</label></td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t</tbody>\r\n");
          out.write("\t\t");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2262,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<script>\r\n");
        out.write("\t\tvar formNome \t= document.getElementById('txtNome');\r\n");
        out.write("\t\tvar formRg \t\t= document.getElementById('numRg');\r\n");
        out.write("\t\tvar ufRg \t\t= document.getElementById('ufRg');\r\n");
        out.write("\t\tvar dtNasc \t\t= document.getElementById('dtNasc');\r\n");
        out.write("\r\n");
        out.write("\t\tdtNasc.value\t = '");
        if (_jspx_meth_c_005fout_005f21(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\tformNome.value \t = '");
        if (_jspx_meth_c_005fout_005f22(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\tformRg.value   \t = '");
        if (_jspx_meth_c_005fout_005f23(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\tufRg.value \t\t = '");
        if (_jspx_meth_c_005fout_005f24(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\tMascara(formRg, Rg, 1);\r\n");
        out.write("\t</script>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f21 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2269,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f21.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dtNascimento}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f21 = _jspx_th_c_005fout_005f21.doStartTag();
    if (_jspx_th_c_005fout_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f21);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f22 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2270,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f22.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.nome}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f22 = _jspx_th_c_005fout_005f22.doStartTag();
    if (_jspx_th_c_005fout_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f22);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f23 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2271,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f23.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.rg}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f23 = _jspx_th_c_005fout_005f23.doStartTag();
    if (_jspx_th_c_005fout_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f23);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f24 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2272,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f24.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cliente.ufRg}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f24 = _jspx_th_c_005fout_005f24.doStartTag();
    if (_jspx_th_c_005fout_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f24);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2277,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${enderecos != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<script>\r\n");
        out.write("// \t\tabrirDialogoEnderecos();\r\n");
        out.write("\t</script>\r\n");
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2283,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<script>\r\n");
        out.write("\t\t\tvar formTel = document.getElementById('numTel');\r\n");
        out.write("\t\t\tformTel.value = '");
        if (_jspx_meth_c_005fout_005f25(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\tMascara(formTel, Telefone, 1);\r\n");
        out.write("\t\t\tvar formDDD = document.getElementById('numDDD');\r\n");
        out.write("\t\t\tformDDD.value = '");
        if (_jspx_meth_c_005fout_005f26(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\tvar formTipoTelefone = document.getElementById('numTpFone');\r\n");
        out.write("\t\t\tformTipoTelefone.value = '");
        if (_jspx_meth_c_005fout_005f27(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("'; \t\t\t\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t</script>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f25 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2286,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f25.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f25 = _jspx_th_c_005fout_005f25.doStartTag();
    if (_jspx_th_c_005fout_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f25);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f26 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2289,20) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f26.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.nrPrefixo}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f26 = _jspx_th_c_005fout_005f26.doStartTag();
    if (_jspx_th_c_005fout_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f26);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f27 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2291,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f27.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${telefone.cdTipoTelefone}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f27 = _jspx_th_c_005fout_005f27.doStartTag();
    if (_jspx_th_c_005fout_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f27);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2295,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTC != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<script>\r\n");
        out.write("\t\t\tarrayFilial = new Array();\r\n");
        out.write("\t\t\tarrayFilial[0] = '");
        if (_jspx_meth_c_005fout_005f28(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\tarrayFilial[1] = '");
        if (_jspx_meth_c_005fout_005f29(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\tarrayFilial[2] = '");
        if (_jspx_meth_c_005fout_005f30(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("'; \r\n");
        out.write("\t\t</script>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f28 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2298,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f28.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTC.dsEndereco}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f28 = _jspx_th_c_005fout_005f28.doStartTag();
    if (_jspx_th_c_005fout_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f28);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f29 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2299,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f29.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTC.nrEndereco}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f29 = _jspx_th_c_005fout_005f29.doStartTag();
    if (_jspx_th_c_005fout_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f29);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f30 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f30.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2300,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f30.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filialTC.nrCnpj}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f30 = _jspx_th_c_005fout_005f30.doStartTag();
    if (_jspx_th_c_005fout_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f30);
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2304,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<span id=\"nrSeqEndereco\" class=\"nrSeqEndereco\" style=\"display: none\">");
        if (_jspx_meth_c_005fout_005f31(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("\t<script>\r\n");
        out.write("\t\t\tvar formLogra \t= document.getElementById('txtLogra');\r\n");
        out.write("\t\t\tvar formNumero \t= document.getElementById('numNumero');\r\n");
        out.write("\t\t\tvar formBairro \t= document.getElementById('txtBairro');\r\n");
        out.write("\t\t\tvar formCep \t= document.getElementById('numCep');\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\tvar formCidade \t= document.getElementById('txtCidade');\r\n");
        out.write("\t\t\tvar formUf \t\t= document.getElementById('txtUf');\r\n");
        out.write("\t\t\tvar formComple  = document.getElementById('txtComplemento');\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\tformLogra.value \t= '");
        if (_jspx_meth_c_005fout_005f32(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\tformNumero.value \t= '");
        if (_jspx_meth_c_005fout_005f33(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\tformBairro.value \t= '");
        if (_jspx_meth_c_005fout_005f34(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\tformCep.value \t\t= '");
        if (_jspx_meth_c_005fout_005f35(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("'\r\n");
        out.write("\t\t\tformCidade.value \t= '");
        if (_jspx_meth_c_005fout_005f36(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\t\tformUf.value \t\t= '");
        if (_jspx_meth_c_005fout_005f37(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\t\r\n");
        out.write("\t\t\tformComple.value \t= '");
        if (_jspx_meth_c_005fout_005f38(_jspx_th_c_005fif_005f4, _jspx_page_context))
          return true;
        out.write("';\r\n");
        out.write("\t\r\n");
        out.write("\t\t\tMascara(document.getElementById('numCep'), Cep, 1);\r\n");
        out.write("\t\t</script>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f31 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f31.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2305,70) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f31.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.sequencia}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f31 = _jspx_th_c_005fout_005f31.doStartTag();
    if (_jspx_th_c_005fout_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f31);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f32 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f32.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2316,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f32.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.logradouro}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f32 = _jspx_th_c_005fout_005f32.doStartTag();
    if (_jspx_th_c_005fout_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f32);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f33 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f33.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2317,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f33.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.numero}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f33 = _jspx_th_c_005fout_005f33.doStartTag();
    if (_jspx_th_c_005fout_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f33);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f34 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f34.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2318,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f34.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.bairro}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f34 = _jspx_th_c_005fout_005f34.doStartTag();
    if (_jspx_th_c_005fout_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f34);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f35 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f35.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2319,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f35.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.cep}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f35 = _jspx_th_c_005fout_005f35.doStartTag();
    if (_jspx_th_c_005fout_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f35);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f36 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f36.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2320,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f36.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.cidade}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f36 = _jspx_th_c_005fout_005f36.doStartTag();
    if (_jspx_th_c_005fout_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f36);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f37 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f37.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2321,21) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f37.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.uf}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f37 = _jspx_th_c_005fout_005f37.doStartTag();
    if (_jspx_th_c_005fout_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f37);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f38 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f38.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2322,24) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f38.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endereco.complemento}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f38 = _jspx_th_c_005fout_005f38.doStartTag();
    if (_jspx_th_c_005fout_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f38);
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
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write('\r');
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
    // /WEB-INF/jsp/receitaCarimboPharmaConnection.jsp(2328,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<script>\r\n");
        out.write("\t\t\tpopulaProduto();\r\n");
        out.write("\t\t</script>\r\n");
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
}
