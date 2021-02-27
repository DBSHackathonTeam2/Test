<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  margin-top:-25px;
  margin-left:-10px;
  margin-right:-10px;
   height:100%;
  min-height:500px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}
.topnav {
  width:100%;
  height:10vh;
  
  
  background-color: skyblue;
}

/* Navbar links */
.topnav a {
  float: left;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}
/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 5px;
  max-width: 300px;
  padding: 5px;
  background-color:transparent;
}
/* Full-width input fields */
input[type=text], input[type=password] , input[type=date]{
  width: 100%;
  padding: 15px;
  margin: 5px 0 12px 0;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus ,input[type=date]:focus{
  background-color: #ddd;
  outline: none;
}

/* Set a style for the submit button */
.btn {
  background-color: skyblue;
  color: black;
  padding: 11px 24px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
.topnav-centered a {
  float: none;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.topnav-right {
  float: right;
}
div {
    font-style:italic;
}

</style>
</head>
<body>
<div class="bg-img">
 <div class="topnav">
 <div class="topnav-right">
    <a href="Register.jsp"><h3>Register</h3></a>
  
  </div>
  <div class="topnav-centered">
    <a href="#home" class="active"><h1><font face="italic" color="black"></font></h1></a>
  </div>
      <a href="Register.jsp"></a>
     
    </div>
  
  <form action="LoginServlet" class="container">
    <h1>Login</h1>

    <label for="user id"><b>USER ID</b></label>
    <input type="text" placeholder="Enter user id" name="uid" required>
    <br/>

    <label for="password"><b>PASSWORD</b></label>
    <input type="password" placeholder="Enter password" name="pwd" required>
    <br/>
    <label for="login"><font color = "Black"><b>LOGIN AS  </b></font></label>
     <select name="login">
     <option value="User"><font color = "Black"> User</font></option>
     <option value="Worker"><font color = "Black"> Admin</font></option>
     </select>
     <br/>
     <br/>
    <button type="submit" class="btn">Login</button>
  </form>
</div>

</body>
</html>