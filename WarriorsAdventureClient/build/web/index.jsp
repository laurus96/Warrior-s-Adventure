<%-- 
    Document   : index
    Created on : 3-gen-2020, 12.30.08
    Author     : laurus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="css/login_reg.css">
    </head>
    <body>
        
        <%String status = (String) session.getAttribute("status");
            if(status != null){
                if(status.compareTo("PASS") == 0){
                    session.removeAttribute("status");%>
                        <script>
                            alert("Registrato");
                        </script>    
                <%}%>
            <%}%>
         
        <%String login = (String) session.getAttribute("login");
            if(login != null){
                if(login.compareTo("FAIL") == 0){
                    session.removeAttribute("login");%>
                        <script>
                            alert("Username o Password errate");
                        </script>    
                <%}
                if(login.compareTo("BAN") == 0){
                    session.removeAttribute("login");%>
                        <script>
                            alert("Utente bannato");
                        </script>    
                <%}%>
            <%}%>
            
        <div>
            <h1>Login</h1> 
            <form action="LoginServlet" method="post">
                <input type="text" placeholder="Username" name="username" required><br>
                
                <input type="password" placeholder="Password" name="password" required><br>
                
                <input class="button" type="submit" value="Gioca"><br>
            </form>

            <a href="registration.jsp">Non hai un account ? Registrati ora...</a>
        </div>
        
    </body>
</html>
