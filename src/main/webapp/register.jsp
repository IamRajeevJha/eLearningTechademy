<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title> 
RegistrationPage</title>
<style>
div{
border-radius:5px;
background-color: #f2f2f2;
padding: 20px;
width:80%;
margin:auto;
display:flex;
align-items:center;
}
input{
width :100%;
padding 12px 20px;
margin: 8px 0;
box-sizing : border-box;
line-height: 2em;
}
.button {
background-color: #716F81;
border: none;
color: white;
padding: 15px 32px;
text-align : center;
font-size: 16px;
margin-left : 20%;
cursor: pointer;
}
</style>
</head>
<body>
<div>
<form action="registerUser">
 
    <h1>Registration Form</h1>
 
    
     <label for="id"><b>UserId</b></label>
    <input type="text" placeholder="Enter UserId" name="id" id="id" required><br>
    
     <label for="name"><b>UserName</b></label>
    <input type="text" placeholder="Enter User Name" name="name" id="name" required><br>
    
     <label for="registrationDate"><b>Registration Date</b></label>
    <input type="text" placeholder="Enter Registration Date" name="registrationDate" id="registrationDate" required><br>
    
     <label for="address"><b>Address</b></label>
    <input type="text" placeholder="Enter Address" name="address" id="address" required><br>
    
     <label for="phone"><b>Phone</b></label>
    <input type="text" placeholder="Enter Phone number" name="phone" id="phone" required><br>
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required><br>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" id="password" required><br>
    
    <label for="picture"><b> Upload Picture</b></label>
    <input type="file"  name = "picture" id="picture"> <br>


    <button class="button">Register</button>

 
</form>
</div>

</body>
</html>
