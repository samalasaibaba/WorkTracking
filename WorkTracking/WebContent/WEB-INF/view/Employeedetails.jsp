<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Detailes</title>

<link rel="stylesheet" href="css/normalize.min.css">


<style>
/* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
@import url(https://fonts.googleapis.com/css?family=Open+Sans);

.btn {
	display: inline-block;
	*display: inline;
	*zoom: 1;
	padding: 4px 10px 4px;
	margin-bottom: 0;
	font-size: 13px;
	line-height: 18px;
	color: #333333;
	text-align: center;
	text-shadow: 0 1px 1px rgba(255, 255, 255, 0.75);
	vertical-align: middle;
	background-color: #f5f5f5;
	background-image: -moz-linear-gradient(top, #ffffff, #e6e6e6);
	background-image: -ms-linear-gradient(top, #ffffff, #e6e6e6);
	background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#ffffff),
		to(#e6e6e6));
	background-image: -webkit-linear-gradient(top, #ffffff, #e6e6e6);
	background-image: -o-linear-gradient(top, #ffffff, #e6e6e6);
	background-image: linear-gradient(top, #ffffff, #e6e6e6);
	background-repeat: repeat-x;
	filter: progid:dximagetransform.microsoft.gradient(startColorstr=#ffffff,
		endColorstr=#e6e6e6, GradientType=0);
	border-color: #e6e6e6 #e6e6e6 #e6e6e6;
	border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);
	border: 1px solid #e6e6e6;
	-webkit-border-radius: 4px;
	-moz-border-radius: 4px;
	border-radius: 4px;
	-webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.05);
	-moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.05);
	box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.05);
	cursor: pointer;
	*margin-left: .3em;
}

.btn:hover, .btn:active, .btn.active, .btn.disabled, .btn[disabled] {
	background-color: #e6e6e6;
}

.btn-large {
	padding: 9px 14px;
	font-size: 15px;
	line-height: normal;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
}

.btn:hover {
	color: #333333;
	text-decoration: none;
	background-color: #e6e6e6;
	background-position: 0 -15px;
	-webkit-transition: background-position 0.1s linear;
	-moz-transition: background-position 0.1s linear;
	-ms-transition: background-position 0.1s linear;
	-o-transition: background-position 0.1s linear;
	transition: background-position 0.1s linear;
}

.btn-primary, .btn-primary:hover {
	text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);
	color: #ffffff;
}

.btn-primary.active {
	color: rgba(255, 255, 255, 0.75);
}

.btn-primary {
	background-color: #4a77d4;
	background-image: -moz-linear-gradient(top, #6eb6de, #4a77d4);
	background-image: -ms-linear-gradient(top, #6eb6de, #4a77d4);
	background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#6eb6de),
		to(#4a77d4));
	background-image: -webkit-linear-gradient(top, #6eb6de, #4a77d4);
	background-image: -o-linear-gradient(top, #6eb6de, #4a77d4);
	background-image: linear-gradient(top, #6eb6de, #4a77d4);
	background-repeat: repeat-x;
	filter: progid:dximagetransform.microsoft.gradient(startColorstr=#6eb6de,
		endColorstr=#4a77d4, GradientType=0);
	border: 1px solid #3762bc;
	text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.4);
	box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.5);
}

.btn-primary:hover, .btn-primary:active, .btn-primary.active,
	.btn-primary.disabled, .btn-primary[disabled] {
	filter: none;
	background-color: #4a77d4;
}

.btn-block {
	width: 100%;
	display: block;
}

* {
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	-ms-box-sizing: border-box;
	-o-box-sizing: border-box;
	box-sizing: border-box;
}

html {
	width: 100%;
	height: 100%;
	overflow: auto;
}

body {
	width: 100%;
	height: 100%;
	font-family: 'Open Sans', sans-serif;
	background: #092756;
	background: -moz-radial-gradient(0% 100%, ellipse cover, rgba(104, 128, 138, .4)
		10%, rgba(138, 114, 76, 0) 40%),
		-moz-linear-gradient(top, rgba(57, 173, 219, .25) 0%,
		rgba(42, 60, 87, .4) 100%),
		-moz-linear-gradient(-45deg, #670d10 0%, #092756 100%);
	background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104, 128, 138, .4)
		10%, rgba(138, 114, 76, 0) 40%),
		-webkit-linear-gradient(top, rgba(57, 173, 219, .25) 0%,
		rgba(42, 60, 87, .4) 100%),
		-webkit-linear-gradient(-45deg, #670d10 0%, #092756 100%);
	background: -o-radial-gradient(0% 100%, ellipse cover, rgba(104, 128, 138, .4)
		10%, rgba(138, 114, 76, 0) 40%),
		-o-linear-gradient(top, rgba(57, 173, 219, .25) 0%,
		rgba(42, 60, 87, .4) 100%),
		-o-linear-gradient(-45deg, #670d10 0%, #092756 100%);
	background: -ms-radial-gradient(0% 100%, ellipse cover, rgba(104, 128, 138, .4)
		10%, rgba(138, 114, 76, 0) 40%),
		-ms-linear-gradient(top, rgba(57, 173, 219, .25) 0%,
		rgba(42, 60, 87, .4) 100%),
		-ms-linear-gradient(-45deg, #670d10 0%, #092756 100%);
	background: -webkit-radial-gradient(0% 100%, ellipse cover, rgba(104, 128, 138, .4)
		10%, rgba(138, 114, 76, 0) 40%),
		linear-gradient(to bottom, rgba(57, 173, 219, .25) 0%,
		rgba(42, 60, 87, .4) 100%),
		linear-gradient(135deg, #670d10 0%, #092756 100%) 100% 100%;
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#3E1D6D',
		endColorstr='#092756', GradientType=1);
}

.container {
	width: 100%;
	height: 100%;
}

.logo {
	top: 50%;
	left: 50%;
	margin: 0px 0px 0px 0px;
	width: 100%;
	height: 15%;
}

.logo img {
	margin-left: auto;
	margin-right: auto;
	display: block;
}

.middle {
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	height: 100%;
}

input, select {
	width: 100%;
	margin-bottom: 10px;
	background: rgba(0, 0, 0, 0.3);
	border: none;
	outline: none;
	padding: 10px;
	font-size: 13px;
	color: #fff;
	text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.3);
	border: 1px solid rgba(0, 0, 0, 0.3);
	border-radius: 4px;
	box-shadow: inset 0 -5px 45px rgba(100, 100, 100, 0.2), 0 1px 1px
		rgba(255, 255, 255, 0.2);
	-webkit-transition: box-shadow .5s ease;
	-moz-transition: box-shadow .5s ease;
	-o-transition: box-shadow .5s ease;
	-ms-transition: box-shadow .5s ease;
	transition: box-shadow .5s ease;
}

input:focus {
	box-shadow: inset 0 -5px 45px rgba(100, 100, 100, 0.4), 0 1px 1px
		rgba(255, 255, 255, 0.2);
}

.login h1 {
	color: #fff;
	text-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
	letter-spacing: 1px;
	text-align: center;
}

.nav {
	margin: 0px 0px 0px 0px;
	width: 25%;
	height: 100%;
	float: left;
	padding: 90px 30px 50px 80px;
	background: rgba(0, 0, 0, 0.3);
}

.right {
	margin: 0px 0px 0px 0px;
	width: 75%;
	height: 100%;
	float: right;
	background: rgba(0, 0, 0, 0.3);
}

.addemp {
	margin: 0px 0px 0px 100px;
	width: 45%;
	height: 40%;
	
}

.a1 {
	padding: 60px 0px 0px 0px;
}
</style>
<script>
	$(document).ready(function() {
		$(".newemp").click(function() {
			$("#ADDemployee").show();
			$("#ITsoftware").hide();
			$("#ITHardware").hide();
			$("#IToffice").hide();
		});
		$(".hardware").click(function() {
			$("#ADDemployee").hide();
			$("#ITsoftware").hide();
			$("#ITHardware").show();
			$("#IToffice").hide();
		});
		$(".software").click(function() {
			$("#ADDemployee").hide();
			$("#ITsoftware").show();
			$("#ITHardware").hide();
			$("#IToffice").hide();
		});
		$(".office").click(function() {
			$("#ADDemployee").hide();
			$("#ITsoftware").hide();
			$("#ITHardware").hide();
			$("#IToffice").show();
		});

	});
	<script src="js/prefixfree.min.js">
</script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="js/prefixfree.min.js"></script>
<script>
	$(document).ready(function() {
		$(".newemp").click(function() {
			$("#ADDemployee").show();
			$("#ITsoftware").hide();
			$("#ITHardware").hide();
			$("#IToffice").hide();
		});
		$(".hardware").click(function() {
			$("#ADDemployee").hide();
			$("#ITsoftware").hide();
			$("#ITHardware").show();
			$("#IToffice").hide();
		});
		$(".software").click(function() {
			$("#ADDemployee").hide();
			$("#ITsoftware").show();
			$("#ITHardware").hide();
			$("#IToffice").hide();
		});
		$(".office").click(function() {
			$("#ADDemployee").hide();
			$("#ITsoftware").hide();
			$("#ITHardware").hide();
			$("#IToffice").show();
		});

	});
</script>
</head>

<body>
	<div class="container">
		<div class="logo">
			<img src="images\svss_logo.png" alt="svss">
		</div>

		<div class="middle">

			<div class="nav">

				<a href="#" class="newemp"><font color="red">ADD NEW
						EMPLOYEE</font></a> <a href="#" class="hardware">IT-Hardware</a></br> <a href="#"
					class="software">IT-Software</a></br> <a href="#" class="office">Office</a>


			</div>
			<div class="right">





				<div class="addemp">

					<div id="ADDemployee">
						<img src="../images/svss_logo.png" alt="svss">
						<h1>SignUp</h1>
						<script src="js/emailValidation.js"></script>

						<form method="post" name="signUpForm"
							onsubmit="return validateForm();">

							<input type="text" name="EmployeeId" placeholder="EmployeeId"
								required="required" />ex:SVSS01 <input type="text"
								name="fullname" placeholder="FullName" required="required" /> <input
								type="text" name="contactnumber" maxlength="10"
								placeholder="Mobile No" required="required" /> <input
								type="text" name="email" placeholder="E-mail ID"
								required="required" /> <select name="EmployeeType">
								<option value="EmpType">Employee-Type</option>
								<option value="IT-Software">IT-SOFTWARE</option>
								<option value="IT-Hardware">IT-HARDWARE</option>
								<option value="IT-Office">IT-OFFICE</option>

							</select> <input type="text" name="username" placeholder="User Name"
								required="required" /> <input type="password" name="password"
								placeholder="Password" required="required" />
							<button type="submit" class="btn btn-primary btn-block btn-large">AddEmployee</button>
						</form>
					</div>


					<div id="ITsoftware" style="display: none">software</div>
					<div id="ITHardware" style="display: none">hardware</div>
					<div id="IToffice" style="display: none">office</div>


				</div>
			</div>
		</div>



	</div>

	<script src="js/index.js"></script>

</body>
</html>