<%-- 
    Document   : enter
    Created on : 04.08.2016, 17:53:16
    Author     : Ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Вход</title>
        <style type="text/css"> 

            body{ background-color: #E6E6FA }

            #wrapper{
                width: 1000px;
                height: 600px;
                margin: 10px auto;
                background-color: #F8F8FF;
                border-style: solid;
                border-color: #A9A9A9;
                border-width: 2px
            }
        </style>
    </head>
    <body>
        <div id="wrapper">
            <h1 align="center">Вход</h1>
            <form method="POST">
                <table border="1" cellspacing="5" align="center">
                    <tbody>
                        <tr>
                            <th>Введите имя</th>
                            <th><input type="text" name="firstName" placeholder="Имя" size="15" /></th>
                        </tr>
                        <tr>
                            <th>Введите пароль</th>
                            <td><input type="text" name="password" placeholder="пароль" size="15" /></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="Войти" />
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
