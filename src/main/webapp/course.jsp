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
<form action="addCourse">
 
    <h1> Course Form</h1>
 
    
     <label for="id"><b>Course Id</b></label>
    <input type="text" placeholder="Enter CourseId" name="id" id="id" required><br>
    
     <label for="name"><b>Course Name</b></label>
    <input type="text" placeholder="Enter course Name" name="name" id="name" required><br>
    
     <label for="desc"><b>Course description </b></label><br>
    <textarea rows = "5" cols ="30"  name="desc" id="desc">Write course description here!</textarea><br>
   
     <label for="resources"><b>Course resources</b></label><br>
    <input type="file" name="resources" id="resources"><br>
    
    <label for="fee"><b>Course Fee</b></label>
    <input type="text" placeholder="Enter Course fee" name="fee" id="fee"><br>

   
    


    <button class="button">Submit</button>

 
</form>
</div>

</body>
</html>
