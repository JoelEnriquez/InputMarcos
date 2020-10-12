<%-- 
    Document   : index
    Created on : 11/10/2020, 21:26:16
    Author     : Joel Enriquez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="/WEB-INF/Extras/CSS.jsp"/> 
    </head>
    <body>
        <h1>Andate a la chingada marcos</h1>
        <img src="https://ih1.redbubble.net/image.593454446.0583/flat,550x550,075,f.u1.jpg">
        <ul class="list-group">
            <li class="list-group-item">
                <a href="${pageContext.request.contextPath}/Forms/RegistroLaboratoristas.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Form Lab</a>
            </li>
            <li class="list-group-item">
                <a href="${pageContext.request.contextPath}/Forms/RegistroMedicos.jsp" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Form Doc</a>
            </li>
        </ul>
        
        <jsp:include page="/WEB-INF/Extras/JS.jsp"/>
    </body>
</html>
