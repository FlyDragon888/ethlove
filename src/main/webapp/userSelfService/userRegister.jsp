<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/layui/css/layui.css" rel="stylesheet" type="text/css" />
<style type="text/css">
	#main{
		margin:0 auto;
		width:600px;
		height:238px;
	}
	/* .layui-form-label{
		text-align: center;
	} */
</style>
</head>
<body >
	<div>
		<ul class="layui-nav">
			<li class="layui-nav-item layui-icon"><a href="">&#xe68e;首 页</a></li>
			<li class="layui-nav-item"><div style="width:1160px;"></div></li>
			<!-- <li class="layui-nav-item layui-this">
		    <a href="javascript:;">随便逛逛</a>
		    <dl class="layui-nav-child">
		      <dd><a href="">选项1</a></dd>
		      <dd><a href="">选项2</a></dd>
		      <dd><a href="">选项3</a></dd>
		    </dl>
		  </li> -->
			<!--   <li class="layui-nav-item"><a href="">大数据</a></li>
		  <li class="layui-nav-item">
		    <a href="javascript:;">解决方案</a>
		    <dl class="layui-nav-child">
		      <dd><a href="">移动模块</a></dd>
		      <dd><a href="">后台模版</a></dd>
		      <dd class="layui-this"><a href="">选中项</a></dd>
		      <dd><a href="">电商平台</a></dd>
		    </dl>
		  </li> -->
			<li class="layui-nav-item"><a href="">登 录</a></li>
		</ul>
	</div>


	<div id="main" style="margin-top: 50px;">
		<form class="layui-form" action="" style="">

			<div class="layui-form-item" >
				<label class="layui-form-label">用 户 名</label>
				<div class="layui-input-inline">
					<input id="userName" type="text" name="userName" lay-verify="required"
						placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			</div>

			<!-- <div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">验证手机</label>
					<div class="layui-input-inline">
						<input type="tel" name="phone" lay-verify="phone"
							autocomplete="off" class="layui-input">
					</div>
				</div>

			</div> -->

			<div class="layui-form-item">
				<div class="layui-inline">
					<label class="layui-form-label">邮   箱</label>
					<div class="layui-input-inline">
						<input id="email" type="text" name="email" lay-verify="email"
							placeholder="请输入邮箱" autocomplete="off" class="layui-input">
					</div>
				</div>

			</div>

			<div class="layui-form-item">
				<label id="password" class="layui-form-label">密    码</label>
				<div class="layui-input-inline">
					<input type="password" name="password" lay-verify="pass"
						placeholder="请输入密码" autocomplete="off" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">请填写6到12位密码</div>
			</div>
			
			<div class="layui-form-item">
				<label id="password2" class="layui-form-label">再次输入</label>
				<div class="layui-input-inline">
					<input type="password" name="password" lay-verify="pass"
						placeholder="请输入密码" autocomplete="off" class="layui-input">
				</div>
				
			</div>

			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit lay-filter="" onclick="register()">注    册</button>
					<button type="reset" class="layui-btn layui-btn-primary">重    置</button>
				</div>
			</div>
		</form>
	</div>


	<script type="text/javascript" src="<%=request.getContextPath()%>/layui/layui.js"></script>
	<script>
		layui.use(['element','form'], function(){
		  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
		  var form = layui.form;
		  
		  form.on('submit(register)', function(data){
				console.log(data.field);
				var ctx = ${pageContext.request.contextPath};
				$.ajax({
					url : ctx+"/userSelfService/register.do",
					type : 'POST',
					dataType : 'json',
					async : false,
					data : data.field,
					success : function(res) {
						if(res.isSuss){
							window.location.href=ctx+"/index.jsp"; 
						}else{
							alert(res.message);
						}
						
					},
					error : function(msg) {
						alert(error);
					}
				});
			});
		  
		  //监听导航点击
		  /* element.on('nav(demo)', function(elem){
		    //console.log(elem)
		    layer.msg(elem.text());
		  }); */
		});
		
		function register(){
			var userName = $("#userName");
			var password = $("#password");
			var email = $("email");
			
			var ctx = ${pageContext.request.contextPath};
			$.ajax({
				url : ctx+"/userSelfService/register.do",
				type : 'POST',
				dataType : 'json',
				async : false,
				data : {
					userName:userName,
					password:password,
					email: email
				
				},
				success : function(res) {
					if(res.isSuss){
						window.location.href=ctx+"/index.jsp"; 
					}else{
						alert(res.message);
					}
					
				},
				error : function(msg) {
					alert(error);
				}
		});
		}	
		
		
		
	</script>

</body>
</html>