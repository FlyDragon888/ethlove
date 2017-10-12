<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="layui/css/layui.css" rel="stylesheet" type="text/css" />

<style type="text/css">
#main {
	background: url("pic/bg/bg.jpg");
	height: 431px;
	width: 1920;
}
</style>

</head>
<body>
	<div>
		<ul class="layui-nav layui-bg-blue">
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
			<li class="layui-nav-item"><a href="">登 录</a></li>
			<li class="layui-nav-item"><a href="">注 册</a></li>
		</ul>
	</div>
	<div id="main">goods</div>
	111111


	<script type="text/javascript" src="layui/layui.js"></script>
	<script>
		layui.use([ 'element', 'form' ], function() {
			var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
		});
	</script>
</body>
</html>