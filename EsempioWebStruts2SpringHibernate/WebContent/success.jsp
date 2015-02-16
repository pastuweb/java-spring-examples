<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Esempio Struts2 Spring e Hibernate - Lista</title>
</head>
<body>
	<h3>Elenco Siti</h3>
	<br>
	<table>
		<tr>
			<th>ID_SITO</th>
			<th>DOMINIO</th>
			<th>TIPOLOGIA</th>
		</tr>
		<s:iterator value="listaSiti">
			<tr>
				<td><s:property value="id_sito" />
				</td>
				<td><s:property value="dominio" />
				</td>
				<td><s:property value="tipologia" />
				</td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>