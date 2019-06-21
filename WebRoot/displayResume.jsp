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

<title>数据操作例程</title>

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
width:20em;
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
		<div class="container">
			<form id="myForm" action="updateUser.jsp">
			<input type="text" name="id" id="id" hidden>
			<input type="text" name="introduce" id="introduce" hidden>
			<input type="text" name="workedfor" id="workedfor" hidden>
			<input type="text" name="workedtime" id="workedtime" hidden>
			<input type="text" name="graduatedfrom" id="graduatedfrom" hidden>
			<input type="text" name="prize" id="prize" hidden>
			
			
			<input type="text" name="name" id="name" value=<s:property value='#session.name'/> hidden>
			<input type="text" name="age" id="age" value=<s:property value='#session.age'/> hidden>
			<input type="text" name="location" id="location" value=<s:property value='#session.location'/> hidden>
			<input type="text" name="tel" id="tel" value=<s:property value='#session.tel'/> hidden>
			<input type="text" name="email" id="email" value=<s:property value='#session.tel'/> hidden>
			<input type="text" name="want1" id="want1" value=<s:property value='#session.want1'/> hidden>
			<input type="text" name="want2" id="want2" value=<s:property value='#session.want2'/> hidden>
			<input type="text" name="want3" id="want3" value=<s:property value='#session.want3'/> hidden>
			
			<ul><!--无序表，里面只能放li p可以放在li中，前面小点样子在css中改-->
				<li><span >姓名：<s:property value='#session.name'/></span> </li>
				<li><span>性别：<s:property value='#session.male'/>         年龄：<s:property value='#session.age'/> </span></li>
				<li><span>所在城市：<s:property value='#session.location'/>  电话：<s:property value='#session.tel'/> 邮箱：<s:property value='#session.email'/> </span></li>
				<li><span>预期职位1 ：<s:property value='#session.want1'/></span></li>
				<li><span>预期职位2 ：<s:property value='#session.want2'/></span></li>
				<li><span>预期职位3 ：<s:property value='#session.want3'/></span></li>
			</ul>
			<!-- <input type="button" class="btn btn-danger" value="编辑"  onClick="change();"> -->
			<input type="button" class="btn btn-danger" value="编辑" onclick='change(
				"<s:property value='#session.userid'/>",
				"<s:property value='#session.name'/>",
				"<s:property value='#session.age'/>",
				"<s:property value='#session.location'/>",
				"<s:property value='#session.tel'/>",
				"<s:property value='#session.email'/>",
				"<s:property value='#session.want1'/>",
				"<s:property value='#session.want2'/>",
				"<s:property value='#session.want3'/>");'> 
				
				<input type="button" class="btn btn-danger" value="查看已发送的简历" onClick='state("<s:property value='#session.userid'/>");'>
				
			
				<table id="myUsers" class="dataTable striped border bordered" cellspacing="0" width="250px" data-auto-width="false">
					<thead>
						<tr>
							<th class="sortable-column">用户账号</th>
							<th class="sortable-column">自我介绍</th>
							<th class="sortable-column">曾经工作过的公司</th>
							<th class="sortable-column">曾经工作过的时间</th>
							<th class="sortable-column">毕业于</th>
							<th class="sortable-column">获奖情况</th>
							<th class="sortable-column"  style="width: 350px; ">操作</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="%{id}" id="id" status="status">
							<tr>
								<td><s:property value='%{uid[#status.index]}' /></td>
								<td><s:property value='%{introduce[#status.index]}' /></td>
								<td><s:property value='%{workedfor[#status.index]}' /></td>
								<td><s:property value='%{workedtime[#status.index]}' /></td>
								<td><s:property value='%{graduatedfrom[#status.index]}' /></td>
								<td><s:property value='%{prize[#status.index]}' /></td>
								<td> <!-- 发送简历 -->
									<input type="button" class="btn btn-danger" value="发送简历" onClick='updatex(
										"<s:property value='%{id[#status.index]}' />",
										"<s:property value='%{introduce[#status.index]}' />",
										"<s:property value='%{workedfor[#status.index]}' />",
										"<s:property value='%{workedtime[#status.index]}'/>",
										"<s:property value='%{graduatedfrom[#status.index]}'/>",
										"<s:property value='%{prize[#status.index]}'/>");'>
										<!-- 修改简历 -->
									<input type="button" class="btn btn-danger" value="修改简历" onClick='update(
										"<s:property value='%{id[#status.index]}' />",
										"<s:property value='%{introduce[#status.index]}' />",
										"<s:property value='%{workedfor[#status.index]}' />",
										"<s:property value='%{workedtime[#status.index]}'/>",
										"<s:property value='%{graduatedfrom[#status.index]}'/>",
										"<s:property value='%{prize[#status.index]}'/>");'>
										<!-- 删除简历 -->
									<input type="button" class="btn btn-danger" value="删除简历" onClick='deleteresume(
										"<s:property value='%{id[#status.index]}' />");'>
									
								</td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
				<p>第<s:property value='#session.page'/>页/共<s:property value='#session.large'/>页 &nbsp;&nbsp;&nbsp;
				<span id="nextpage" onclick='nextpage("<s:property value='#session.page'/>");'>下一页</span> 
				<span id="lastpage" onclick='lastpage("<s:property value='#session.page'/>");'>上一页</span> 
				<input type="text" name="number" id="number" style="width: 50px; height: 20px" value=<s:property value='#session.page'/>>/<s:property value='#session.large'/>页
				<input type="button" class="btn btn-danger" value="go" onClick="go();">
				</p>
				<input type="text" name="page" id="page" hidden>
				<input type="text" name="next" id="next" hidden>
				<input type="text" name="jid" id="jid" hidden>
				<input type="text" name="cid" id="cid" hidden>
			
			<table id="Send" class="dataTable striped border bordered" cellspacing="0" width="250px" data-auto-width="false" style="display:none;">
					<thead>
						<tr>
							<th class="sortable-column">公司名</th>
							<th class="sortable-column">职位名</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="%{cid}" id="companyid" status="status">
							<tr>
								<td><s:property value='%{comname[#status.index]}' /></td>
								<td><s:property value='%{jobname[#status.index]}' /></td>
								<td>
									<input type="button" class="btn btn-danger" value="发送" onClick='sendto(
									"<s:property value='%{cid[#status.index]}' />",
									"<s:property value='%{jid[#status.index]}' />")'>
									
								</td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
			</form>
		</div>
    	<script language="javascript">
    	function updatex(id,introduce,workedfor,workedtime,graduatedfrom,prize) {
			Send.style.display = '';
			document.getElementById("id").value = id;
			document.getElementById("introduce").value = introduce;
			document.getElementById("workedfor").value = workedfor;
			document.getElementById("workedtime").value = workedtime;
			document.getElementById("graduatedfrom").value = graduatedfrom;
			document.getElementById("prize").value = prize;
			/* resume.uid = uid;
			resume.introduce = introduce;
			resume.workedfor = workedfor;
			resume.workedtime = workedtime;
			resume.graduatedfrom = graduatedfrom;
			resume.prize = prize;  */
			
		}
    	
    	function update(id,introduce,workedfor,workedtime,graduatedfrom,prize) {
    		
			document.getElementById("id").value = id;
			document.getElementById("introduce").value = introduce;
			document.getElementById("workedfor").value = workedfor;
			document.getElementById("workedtime").value = workedtime;
			document.getElementById("graduatedfrom").value = graduatedfrom;
			document.getElementById("prize").value = prize;
			document.getElementById("myForm").action = "display.action";
			document.getElementById("myForm").submit();
		}
    	
		function nextpage(page){
			document.getElementById("page").value = page;
			document.getElementById("next").value = 1;	
			document.getElementById("myForm").action = "displayResume.action";
			document.getElementById("myForm").submit();
			
		}
		
		function lastpage(page){
			document.getElementById("page").value = page;
			document.getElementById("next").value = 0;	
			
			document.getElementById("myForm").action = "displayResume.action";
			document.getElementById("myForm").submit();
		}
		
		function go(page){	
			document.getElementById("next").value =2;	
			document.getElementById("myForm").action = "displayResume.action";
			document.getElementById("myForm").submit();
		}
		
		function sendto(cid,jid){	
			document.getElementById("cid").value =cid;	
			document.getElementById("jid").value =jid;
			
			document.getElementById("myForm").action = "insertCom_resume.action";
			document.getElementById("myForm").submit();
		}
		
		function change(id,name,age,location,tel,email,want1,want2,want3){
			 document.getElementById("id").value =id;
			 document.getElementById("name").value =name;	
			 document.getElementById("age").value =age;	
			 document.getElementById("location").value =location;	
			 document.getElementById("tel").value =tel;	
			 document.getElementById("email").value =email;	
			 document.getElementById("want1").value =want1;	
			 document.getElementById("want2").value =want2;	
			 document.getElementById("want3").value =want3;	
			 document.getElementById("myForm").action = "displayUser.action";
			 document.getElementById("myForm").submit();
		} 
		
		function deleteresume(id){
			 document.getElementById("id").value =id;
			 document.getElementById("myForm").action = "deleteResume.action";
			 document.getElementById("myForm").submit();
		} 
		
		function state(userid){
			alert();
			 document.getElementById("id").value =userid;
			 document.getElementById("myForm").action = "selectState.action";
			 document.getElementById("myForm").submit();
		} 
		 
    </script>
	</body>
</html>
