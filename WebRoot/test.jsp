<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
    	<title>数据操作例程</title>
    	<script>
		$(document).ready(function() {
			$('#myUsers').DataTable({
				"scrollCollapse": true,
				"paging": false,
				"searching": false
			});
		});
		</script>
	</head>
  
	<body>  
		<div class="container">
			<form id="myForm">
				<table id="myUsers" class="dataTable striped border bordered" cellspacing="0" width="100%" data-auto-width="false">
					<thead>
						<tr>
							<th class="sortable-column">用户账号</th>
							<th class="sortable-column">自我介绍</th>
							<th class="sortable-column">曾经工作过的公司</th>
							<th class="sortable-column">曾经工作过的时间</th>
							<th class="sortable-column">毕业于</th>
							<th class="sortable-column">获奖情况</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="%{uid}" id="uid" status="status">
							<tr>
								<td><s:property value='%{id}' /></td>
								<td><s:property value='%{introduce[#status.index]}' /></td>
								<td><s:property value='%{workedfor[#status.index]}' /></td>
								<td><s:property value='%{workedtime[#status.index]}' /></td>
								<td><s:property value='%{graduatedfrom[#status.index]}' /></td>
								<td><s:property value='%{prize[#status.index]}' /></td>
								<td>
									<input type="button" class="btn btn-danger" value="发送简历" onClick="updatex(<s:property value='%{id[#status.index]}' />);">
									"<s:property value='%{introduce[#status.index]}' />",
									<s:property value='%{workedfor[#status.index]}' />,
									<s:property value='%{workedtime[#status.index]}'/>,
									<s:property value='%{graduatedfrom[#status.index]}'/>,
									<s:property value='%{prize[#status.index]}'/>)'>
									</input>
								</td>>
							</tr>>
						</s:iterator>
					</tbody>>
				</table>>
			</form>>
		</div>
    	<script language="javascript">
    	function updatex(uid,introduce,workedfor,workedtime,graduatedfrom,prize) {
			alert();
			resume.uid = uid;
			resume.introduce = introduce;
			resume.workedfor = workedfor;
			resume.workedtime = workedtime;
			resume.graduatedfrom = graduatedfrom;
			resume.prize = prize; 
			document.getElementById("myForm").action = "insertCom_resume.action";
			document.getElementById("myForm").submit();
		}
    </script>
	</body>
</html>
