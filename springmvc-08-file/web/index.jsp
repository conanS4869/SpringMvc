<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit" value="upload"/>
  </form>
<%--  从web下下载--%>
  <a href="${pageContext.request.contextPath}/statics/1.txt">下载</a>
  </body>
</html>
