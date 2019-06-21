<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加投送记录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form id="myForm1" method="post" action="insertPass.action" 
    									class="form-signin" role="form" >
	<br>要投送的简历id：<input type="text" name="resumeid">
	<br>要发送到的公司id：<input type="text" name="jid">
     <button type="button" onclick="check();">创建</button>
    </form>
    <script language="javascript">
    	function check(){
    		//alert(document.getElementById("usr").value);
    		//alert(document.getElementById("gender").value);
    		document.getElementById("myForm1").submit();
    	}
    </script>
  </body>
</html>
