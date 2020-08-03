<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>iframe体验页面无刷新</title>

    <script>
        function go() {
            var url=document.getElementById("url").value;
            document.getElementById("iframe1").src=url;
        }
    </script>
</head>
<body>
<div>
    <p>请输入地址: </p>
    <p>
        <input type="text" id="url" value="https://www.163.com">
        <input type="button" value="提交" onclick="go()">
    </p>

</div>
<div>
    <iframe id="iframe1" style="width: 100%;height: 500px">

    </iframe>
</div>
</body>
</html>
