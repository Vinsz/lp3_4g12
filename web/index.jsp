<%-- 
    Document   : index
    Created on : Aug 11, 2015, 8:37:44 AM
    Author     : cacique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LP3 - 04G - Proj 1</title>
    </head>
    <body>
        <section>
            <h1>LOGIN</h1>
            <form method="POST" action="FrontController">
                <input type="hidden" name="command" value="login.login"/>
                <p>Nome:<br><input type="text" name="username" placeholder="username" required/></p>
                <p>Senha:<br><input type="password" name="password" placeholder="password" required/></p>
                <p><input type="submit" value="LOGIN"/></p>
            </form>
        </section>
    </body>
</html>
