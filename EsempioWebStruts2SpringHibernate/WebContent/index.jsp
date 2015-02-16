<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Esempio Struts2 Spring e Hibernate - Inserimento</title>
</head>
<body>

<br />
<div style="width:500px;padding:10px;border:1px solid #000000;">
	<h3>Crea nuovo sito:</h3>
	
	
	<%-- 
	Nota:
	action="saveSito" equivale al name della Action nel file "struts.xml"
	--%>
	<s:form action="saveSito">
		<s:textfield  name="sito.dominio" label="Dominio" value=""/><br/><br/>		
		<s:textfield name="sito.tipologia" label="Tipologia" value=""/><br/><br/>
		<s:submit />
	</s:form>
	
</div>
</body>
</html>



