<%-- 
    Document   : Home
    Created on : 14/08/2015, 09:58:52
    Author     : 31431038
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bem Vindo, 
            <c:out value="$(username)"></c:out>
        </h1>
    </body>
</html>
