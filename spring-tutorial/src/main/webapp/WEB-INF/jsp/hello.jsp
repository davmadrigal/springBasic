<%@include file="includes/header.jsp"%>
		<spring:message code="hello" />
		<p>Hola, esto es una p�gina JSP.</p>
		<p>
			La hora del servidor es
			<%=new Date()%></p>
<%@include file="includes/footer.jsp"%>