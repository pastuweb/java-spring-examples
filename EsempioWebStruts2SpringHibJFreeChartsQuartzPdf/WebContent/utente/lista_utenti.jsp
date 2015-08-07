<%@include file="/common/header.jsp" %>
<title>Esempio Wellness - Gestione Utenti</title>
</head>
<body>
	<h3>Elenco Utenti</h3>
	<br>
	<table>
		<tr>
			<th>ID_UTENTE</th>
			<th>NOME</th>
			<th>COGNOME</th>
		</tr>
		<s:iterator value="listaUtenti">
			<tr>
				<td><s:property value="id_utente" />
				</td>
				<td><s:property value="nome" />
				</td>
				<td><s:property value="cognome" />
				</td>
			</tr>
		</s:iterator>
	</table>

<%@include file="/common/footer.jsp" %>