<%-- 
    Document   : indexSuccess
    Created on : 11.08.2016, 0:06:11
    Author     : Ivan
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<jsp:include page="headerIndexSuccess.jsp">
    <jsp:param name="title" value="Стартовая страница"/>
</jsp:include>
            <tbody align="center">
                <tr>
                    <td height="50px"> <h4>Новые поступления </h4></td>
                    <td colspan="6" rowspan="3">Контент</td>
                </tr>
                <tr>
                    <td height="200px"> Ссылка 1 </td>
                </tr>
                <tr>
                    <td height="200px"> Ссылка 2 </td>
                </tr>            
            </tbody>
            <jsp:include page="footer.jsp" />