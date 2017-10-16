<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登 录</title>
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
<body>
	
	<div>
		<ul class="layui-nav">
			<li class="layui-nav-item layui-icon"><a href="javascript:void(0);" onclick ="goToHomePage()">&#xe68e;首 页</a></li>
			<li class="layui-nav-item"><div style="width:1160px;"></div></li>
			<li class="layui-nav-item"><a href="javascript:void(0);" onclick ="goToRegister()">注 册</a></li>
		</ul>
	</div>
	
	
	<div id="main" style="margin-top: 50px;">
		<form class="layui-form" action="<%=request.getContextPath()%>/userSelfService/register.do" method="post">

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
			</div>
			

			<div class="layui-form-item" style ="padding-left:40px">
				<div class="layui-input-block">
					<button type="submit" class="layui-btn" lay-submit lay-filter="" style="width:100px;">登    录</button>
				</div>
			</div>
		</form>
	</div>





	<script type="text/javascript" src="<%=request.getContextPath()%>/layui/layui.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.1.1.min.js"></script>
	<script>
		layui.use(['element','form'], function(){
		  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
		  var form = layui.form;
			});
		
		
		function goToRegister() {
			window.location.href = "<%=request.getContextPath()%>/userSelfService/userRegister.jsp";
		}
		function goToHomePage() {
			window.location.href = "<%=request.getContextPath()%>/index.jsp";
		}

		</script>
		
		
</body>
</html>