<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            margin-left: 300px;
        }
        input{
            height: 30px;
            width: 300px;
            border: solid 0px;
            border-radius: 10px;
            background-color: rgb(241, 202, 233);
            text-align: center;
        }
        button{
            height: 30px;
            width: 200px;
            border: solid 0px;
            background-color: rgb(93, 216, 238);
            color: rebeccapurple;
            margin-left: 50px;
            border-radius: 10px;
        }
        button:hover{
            color: red;
            background-color: black;
        }
       
    </style>
</head>
<body  style=" background-image: url(https://static.scientificamerican.com/sciam/cache/file/4AC9C323-EF15-4344-BF4D79E5A5F152EA_source.jpg?w=1220&h=490);">
    <div>
        <h1 style="color: rgb(240, 214, 111);">Fill the form to update</h1>
<br>
<form action="update">
    <input type="text" placeholder="Student Id" name="id">
    <br>
    <br>
    <input type="text" placeholder="Student Name" name="name">
    <br>
    <br>
    <input type="text" placeholder="Student Age" name="age">
    <br>
    <br>
    <input type="text" placeholder="Student Mail Id" name="email">
    <br>
    <br>
    <button style="size: 20px;">submit</button>
</form>
<br>
<br>
<h2 style="color:black; margin-left: 50px; font-size: 43px;">${updatemsg}</h2>
<br><br><br>
<form action="home.jsp">
    <button>Go Back</button>
</form>
    </div>
</body>
</html>