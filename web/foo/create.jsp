<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Lodour
  Date: 17/7/4
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<s:url namespace="/foo" action="createFoo"/>" method="post">
    <label>
        <input name="bar" type="text"/>
    </label>
    <input name="submit" type="submit" value="submit">
</form>
</body>
</html>
