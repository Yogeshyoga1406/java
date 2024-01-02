<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        button{
            height: 30px;
            width: 300px;
            border: solid 0px;
            border-radius: 10px;
            background-color: rgb(247, 219, 163);
        }
        form{
            padding-left: 200px;
        }
        button:hover{
            color: aqua;
            background-color: black;
        }
    </style>
</head>
<body style=" background-image: url(https://static.scientificamerican.com/sciam/cache/file/4AC9C323-EF15-4344-BF4D79E5A5F152EA_source.jpg?w=1220&h=490);">
    
<center><h1 style="color: rgb(240, 214, 111);">Welcome to Student DataBase Management System</h1></center>
<center><img src="https://tist.school/uploads/editor/classroom-teacher-and-kids_1677644328.jpeg" alt="" height="200px" width="400px"></center>
<h2 style="color: rgb(21, 199, 243); padding-left: 200px;">Start Your Resistration Now......!</h2>
<form action="add.jsp">
    <button type="submit">Add Student</button>
</form>
<br>
<form action="delete.jsp">
    <button type="submit">Delete Student</button>
</form>
<br>
<form action="get.jsp">
    <button type="submit">Get Student Details</button>
</form>
<br>
<form action="update.jsp">
    <button type="submit">Update Student Details</button>
</form>
<br>
</body>
</html>