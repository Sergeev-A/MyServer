<%--
  Created by IntelliJ IDEA.
  User: Sergeev
  Date: 04.04.2017
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="es">
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
<form method=get action="$/MyServer/en">


    <c:out value=
                   "${requestScope.qwerty}"/>
    <br>
    <c:out value=
                   "${requestScope.index}"/>

        <%--
        <c:out value=
                       "${requestScope.qwerty}" escapeXml="false"/>
${qwerty};--%>

</body>
</html>
