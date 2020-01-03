<%-- 
    Document   : registration
    Created on : 3-gen-2020, 12.14.17
    Author     : laurus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registrazione</title>
        <link rel="stylesheet" type="text/css" href="css/login_reg.css">
    </head>
    <body>  
        <div>
            <%String status = (String) session.getAttribute("status");
            if(status != null){
                session.removeAttribute("status");
                if(status.compareTo("FE_UN") == 0){%>
                        <script>
                            alert("Formato username non valido");
                        </script>
                    <%}
                if(status.compareTo("FE_PW") == 0){%>
                        <script>
                            alert("Formato password non valido");
                        </script>
                    <%}
                if(status.compareTo("FE_EM") == 0){%>
                        <script>
                            alert("Formato email non valido");
                        </script>
                    <%}
                if(status.compareTo("DE_UN") == 0){%>
                        <script>
                            alert("Username già utilizzato");
                        </script>
                    <%}
                if(status.compareTo("DE_EM") == 0){%>
                        <script>
                            alert("Email già utilizzata");
                        </script>
                    <%}
                if(status.compareTo("PW_MS") == 0){%>
                        <script>
                            alert("Le password non corrispondono");
                        </script>
                    <%}
                }%>

            
            <h1>Registrazione</h1> 
            <form action="RegistrationServlet" method="post">
                <input type="text" placeholder="Username" name="username" required><br>

                <input type="text" placeholder="E-mail" name="email" required><br>
                
                <input type="password" placeholder="Password" name="password" required><br>
                
                <input type="password" placeholder="Re-Password" name="repassword" required><br>

                
                <input class="button" type="submit" value="Registrati"><br>
            </form>
        </div>
        
    </body>
</html>
