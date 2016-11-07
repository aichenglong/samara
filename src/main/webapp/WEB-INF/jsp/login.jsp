<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Bootstrap Admin</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css"
	href="${baseUrl}plugin/bootstrap/css/bootstrap.css">
<link rel="stylesheet"
	href="${baseUrl }plugin/font-awesome/css/font-awesome.css">
<link rel="stylesheet" type="text/css"
	href="${baseUrl }styles/theme.css">
<link rel="stylesheet" type="text/css"
	href="${baseUrl }styles/premium.css">
<script src="${baseUrl}plugin/jquery-1.11.1.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		var match = document.cookie.match(new RegExp('color=([^;]+)'));
		if (match)
			var color = match[1];
		if (color) {
			$('body').removeClass(function(index, css) {
				return (css.match(/\btheme-\S+/g) || []).join(' ')
			})
			$('body').addClass('theme-' + color);
		}

		$('[data-popover="true"]').popover({
			html : true
		});

	});
</script>
<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.navbar-default .navbar-brand, .navbar-default .navbar-brand:hover {
	color: #fff;
}
</style>

<script type="text/javascript">
	$(function() {
		var uls = $('.sidebar-nav > ul > *').clone();
		uls.addClass('visible-xs');
		$('#main-menu').append(uls.clone());
	});
</script>
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
<!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
<!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
<!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->

<!--<![endif]-->
</head>
<body class=" theme-blue">
	<div class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<a class="" href="index.html"><span class="navbar-brand"><span
					class="fa fa-paper-plane"></span> Aircraft</span></a>
		</div>
		<div class="navbar-collapse collapse" style="height: 1px;"></div>
	</div>

	<div class="dialog">
		<div class="panel panel-default">
			<p class="panel-heading no-collapse">用户登录</p>
			<div class="panel-body">
				<form name="loginform" action="${baseUrl}login.do" method="post">
					<div class="form-group">
						<label>用户名</label> <input type="text" class="form-control span12"
							name="username">
					</div>
					<div class="form-group">
						<label>密码</label> <input type="password" class="form-control"
							name="password">
					</div>
					<button type="submit" class="btn btn-primary pull-right">登录</button>

					<label class="remember-me"><input type="checkbox">记住我</label>
					<div class="clearfix"></div>
				</form>
			</div>
		</div>
		<p class="pull-right" style="">
			<a href="http://www.portnine.com" target="blank"
				style="font-size: .75em; margin-top: .25em;">Design by Portnine</a>
		</p>
		<p>
			<a href="reset-password.html">忘记密码?</a>
		</p>
	</div>


</body>
<script src="${baseUrl }plugin/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
	$("[rel=tooltip]").tooltip();
	$(function() {
		$('.demo-cancel-click').click(function() {
			return false;
		});
	});
</script>
</html>