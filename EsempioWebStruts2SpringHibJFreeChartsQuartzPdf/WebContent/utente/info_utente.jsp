<%@include file="/common/header.jsp" %>
<title>Esempio Wellness - Gestione Utenti</title>
</head>
<body>
	<h3>Utente:</h3>
	<br>
	<p>Nome: <s:property value="utente.nome" /></p>
	<p>Cognome: <s:property value="utente.cognome" /></p>
	<hr>
	<p style="width:100%; text-align:center;">		
	<img style="margin:auto;width:700px;" 
		alt="Grafico Comparazione Ruoli Utenti" 
		src="charts/PieChartPNG.jsp?totPA=10&totME=20&totSE=30" />
	</p>
	<p>
		<a href="downloadPdfChart.servlet?totPA=10&totME=20&totSE=30">
		<img style="margin:auto;" 
			alt="Download Grafico in PDF" 
			src="images/download_pdf.png" />
		</a>
	</p>
	<br>
<%@include file="/common/footer.jsp" %>