<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="img/favicon.ico">

<title>修改</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/metro.css" rel="stylesheet">
<link href="css/metro-icons.css" rel="stylesheet">
<link href="css/jquery.dataTables.min.css" rel="stylesheet">

<script src="js/jquery_metro.js"></script>
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/metro.js"></script>
    	<script>
		$(document).ready(function() {
			$('#myResume').DataTable({
				"scrollCollapse": true,
				"paging": false,
				"searching": false
			});
		});
		</script>
  </head>
  
  <body>
    <form id="myForm1" method="post" action="updateUser.action" 
    									class="form-signin" role="form" >
    <input type="text" name="id" value='<s:property value='#session.id'/>' hidden>							
	<br>姓名：<input type="text" name="name" value='<s:property value='#session.name'/>'>
	<br>年龄：<input type="text" name="age" value=<s:property value='#session.age'/>>
	<br>所在地：<input type="text" name="location" value=<s:property value='#session.location'/>>
	<br>电话：<input type="text" name="tel" value=<s:property value='#session.tel'/>>
	<br>邮箱：<input type="text" name="email" value=<s:property value='#session.email'/>>
	<br>预期职位1：<input type="text" name="want1" value=<s:property value='#session.want1'/>>
	<br>预期职位2：<input type="text" name="want2" value=<s:property value='#session.want2'/>>
	<br>预期职位3：<input type="text" name="want3" value=<s:property value='#session.want3'/>>
     <button type="button" onclick="check();">修改</button>
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
