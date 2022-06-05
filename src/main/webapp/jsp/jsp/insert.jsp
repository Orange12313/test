<%--
  Created by IntelliJ IDEA.
  User: 86175
  Date: 2022/5/30
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>插入</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/insertGoods">
    <label>
        账号:<input name="goods" type="text"/>
    </label>
    <br/>
    <br/>
    <label>
        名称:<input name="userName" type="text"/>
    </label>
    <br/>
    <br/>
    <label>
        密码:<input name="userPassword" type="text"/>
    </label>
    <br/>
    <br/>
    <label>
        <input name="提交" type="submit"/>
    </label>

</form>
</body>
</html>
