<%-- 
    Document   : headerCustomerSuccess
    Created on : 11.08.2016, 1:43:31
    Author     : Ivan
--%>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
    <head>
        <title> Fish Trade Company</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <!--Создание таблицы-->
    <center>
        <table border="1" width="1000px">
            <thead align="center">
                <!--Строка регистрации-->
                <tr height="20px" >
                    <td rowspan="3" width="200px" > image </td>
                    <td colspan="5"> </td>
                    <td width="100px" >Здравствуйте, <pre>${lastName} ${firstName}</pre></td>
                </tr>
                <!--Название компании-->
                <tr height="100px" align="center">
                    <td colspan="6"> <h1>Fish Trade Company</h1> </td>
                </tr>
                <!--Меню-->
                <tr height="20px" align="center">
                    <td><h4>Главная</h4></td>
                    <td><h4>Продукция</h4></td>
                    <td><h4>Производство</h4></td>
                    <td><h4>Новости</h4></td>
                    <td><h4>Партнерам</h4></td>
                    <td><h4>Контакты</h4></td>
                </tr>
            </thead>
