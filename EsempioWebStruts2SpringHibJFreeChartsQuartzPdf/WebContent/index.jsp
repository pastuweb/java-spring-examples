<%@include file="/common/header.jsp" %>
<title>Esempio Wellness - Gestione Utente</title>
</head>
<body>

<br />
<div style="width:500px;padding:10px;border:1px solid #000000;">
	<p>Crea nuovo utente:</p>
	<p>
	<s:form namespace="/utenteCRUD" action="createUtenteCRUD" >
		<s:textfield  name="utente.nome" label="Nome" value=""/>		
		<s:textfield name="utente.cognome" label="Cognome" value=""/>
		<s:textfield name="utente.cellulare" label="Cellulare" value=""/>
		<s:textfield name="utente.telefono" label="Telefono" value=""/>
		<s:select name="utente.sesso" label="Sesso" value="1" 
			list="#{'1':'M', '2':'F'}" />
		<s:textfield name="utente.altezza" label="Altezza" value=""/>
		<s:textfield name="utente.peso" label="Peso" value=""/>
		<br/><br/>
		<s:textfield name="utente.username" label="Username" value=""/>
		<s:textfield name="utente.email" label="Email" value=""/>
		<s:password name="utente.password" label="Password" value=""/>
		<s:submit />
	</s:form>
	</p>
	<p>Cerca utente:</p>
	<p>
	<s:form action="getUtenteByUsername" >
		<s:textfield name="user" label="Username" value=""/>
		<s:submit />
	</s:form>
	</p>
</div>

<%@include file="/common/footer.jsp" %>