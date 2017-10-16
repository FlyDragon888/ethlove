<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/layui/css/layui.css" rel="stylesheet" type="text/css" />

<style type="text/css">
#main {
	background: url("pic/bg/bg.jpg");
	height: 700px;
	width: 1920;
}
#index-bottom{
	height: 200px;
	width: 1920;
	background: url("pic/bg/bg-bottom.jpg");
}
</style>

</head>
<body>
	<div id="main">
			<div>
			<ul class="layui-nav" style="background: none">
				<li class="layui-nav-item"><a href=""
					style="padding-left: 0px; padding-right: 0px;"><img
						src="pic/bg/logo.png" /></a></li>
				<li class="layui-nav-item"><a href="">产品</a></li>
				<li class="layui-nav-item"><a href="">大数据</a></li>
				<!--  <li class="layui-nav-item">
			    <a href="javascript:;">解决方案</a>
			    <dl class="layui-nav-child">
			      <dd><a href="">移动模块</a></dd>
			      <dd><a href="">后台模版</a></dd>
			      <dd><a href="">电商平台</a></dd>
			    </dl>
			  </li> -->
				<li class="layui-nav-item"><a href="">社 区</a></li>
				<li class="layui-nav-item"><div style="width: 850px"></div></li>
				<li class="layui-nav-item"><a href= "javascript:void(0);" onclick ="goToLogin()">登 录</a></li>
				<li class="layui-nav-item"><a href ="javascript:void(0);" onclick ="goToRegister()">注 册</a></li>
			</ul>
		</div>
		
		
	</div>
	
	<div id="index-bottom">
		<div class="layui-container" style="padding-top: 30px;">  
		  <div class="layui-row">
		    <div class="layui-col-md9" style="height:60px;font-size:x-large;">
		      最 近 的 一 次 交 易 ： ￥  36000
		    </div>
		    <div class="layui-col-md3" style="height:60px;font-size:x-large;text-align:center; ">
		 <a href=""> 进入广场</a>
		    </div>
		  </div>
		 </div>
		
		<div>
			<div class="" style="text-align:center;padding-top: 80px;height:36px;">
	                <span>Copyright © <a href="http://expo.bootcss.com" >优站精选</a></span> |
	                <span><a href="http://www.miibeian.gov.cn/" target="_blank" >京ICP备xsxxxxx号</a></span>
	         </div>
		</div>
	</div>

	<script type="text/javascript" src="<%=request.getContextPath()%>/layui/layui.js"></script>
	<script>
		layui.use([ 'element', 'form' ], function() {
			var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
		});
		
		function goToRegister() {
			window.location.href = "<%=request.getContextPath()%>/userSelfService/userRegister.jsp";
		}

		function goToLogin() {
			window.location.href = "<%=request.getContextPath()%>/userSelfService/userLogin.jsp";
		}
		
	</script>
</body>
</html>