<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<body>

<div class = "container" style="max-width: 40%;vertical-align: middle !important;">
    <div class="wrapper" >
        <form action="" method="post" name="Login_Form" class="form-signin">
            <h3 class="form-signin-heading">Welcome Back! Please Sign In</h3>
            <hr class="colorgraph"><br>

            <input type="text" class="form-control" name="Username" placeholder="Username" required="" autofocus="" />
            <input type="password" class="form-control" name="Password" placeholder="Password" required=""/>

            <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Login</button>
        </form>
    </div>
</div>
</body>

</html>