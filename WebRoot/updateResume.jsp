<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>测试更新</title>
    
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
    <form id="myForm1" method="post" action="updateResume.action" 
    									class="form-signin" role="form" >
    			<input type="text" name="id" value='<s:property value='#session.id'/>' hidden>
	<br>自我介绍：<input type="text" name="introduce" value='<s:property value='#session.introduce'/>'>
	<br>工作过的公司：<input type="text" name="workedfor" value='<s:property value='#session.workedfor'/>'>
	<br>工作过的时间：<input type="text" name="workedtime" value='<s:property value='#session.workedtime'/>'>
	<br>毕业于：<input type="text" name="graduatedfrom" value='<s:property value='#session.graduatedfrom'/>'>
	<br>获奖情况：<input type="text" name="prize" value='<s:property value='#session.prize'/>'>
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
