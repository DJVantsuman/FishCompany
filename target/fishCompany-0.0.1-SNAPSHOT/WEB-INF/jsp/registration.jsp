<%-- 
    Document   : registration
    Created on : 04.08.2016, 17:40:27
    Author     : Ivan
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="form"%>
<html>
    <head>
        <title>Registration Page</title>
    </head>
    <body>
        <h1 align="center">Регистрация</h1>
        <form  method="POST">
            <table border="1" cellpadding="5" align="center" >
                <tbody>
                    <tr>
                        <th>Имя:</th>
                        <th><input type="text" name="firstName" size="15" placeholder="введите имя"/></th>
                    </tr>
                    <tr>
                        <th>Фамилия:</th>
                        <th><input type="text" name="lastName" size="15" placeholder="введите фамилию"/></th>
                    </tr>
                    <tr>
                        <th>Пароль:</th>
                        <th><input type="text" name="password" size="15" placeholder="введите пароль"/></th>
                    </tr>
                    <tr>
                        <td align="center" colspan="2">
                            <input type="submit" value="Зарегистрировать" />
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>	
