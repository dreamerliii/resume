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

<title>查看简历状态</title>

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
		
		
<style type="text/css">
table{
width:8em;
table-layout:fixed;/* 只有定义了表格的布局算法为fixed，下面td的定义才能起作用。 */
}
td{
width:10%;
word-break:keep-all;/* 不换行 */
white-space:nowrap;/* 不换行 */
overflow:hidden;/* 内容超出宽度时隐藏超出部分的内容 */
text-overflow:ellipsis;/* 当对象内文本溢出时显示省略标记(...) ；需与overflow:hidden;一起使用。*/
}

</style>
	</head>
  
  <body>
    <table id="myUsers" class="dataTable striped border bordered" cellspacing="0" data-auto-width="false" style="width: 600px; ">
					<thead>
						<tr>
							<th class="sortable-column" style="width: 150px; ">用户编号</th>
							<th class="sortable-column" style="width: 300px; ">自我介绍</th>
							<th class="sortable-column" style="width: 150px; ">简历状态</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="%{uid}" id="id" status="status">
							<tr>
								<td><s:property value='%{uid[#status.index]}' /></td>	
								<td><s:property value='%{introduce[#status.index]}' /></td>	
								<td><s:property value='%{state[#status.index]}' /></td>	
							</tr>
						</s:iterator>
					</tbody>
				</table>
  </body>
</html>
