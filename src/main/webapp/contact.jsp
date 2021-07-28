<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title> 
ContactPage</title>
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
<form action="addContact">
 
    <h1> Contact Form</h1>
 
    
     <label for="userId"><b>UserId</b></label>
    <input type="text" placeholder="Enter UserId" name="userId" id="userId" required><br>
    
     <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter User Name" name="name" id="name" required><br>
   
     <label for="phone"><b>Phone</b></label>
    <input type="text" placeholder="Enter Phone number" name="phone" id="phone"><br>
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email"><br>

    <label for="message"><b>Message</b></label><br>
    <textarea rows = "5" cols ="30"  name="message" id="message">Write your message here!</textarea><br>
    


    <button class="button">Submit</button>

 
</form>
</div>

</body>
</html>
