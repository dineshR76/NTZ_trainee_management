<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add Trainee</title>
    </head>
    <body>

        <div class="admission">
            <div class="title">Add Trainee</div>
            <form action="/sucess">
                <div class="user">
            <div class="box">
        <label for="fname">First Name</label><input type="text" id="fname" name="fname" required><br>
    </div>
    <div class="box">
        <label for="lname">Last Name</label><input type="text" id="lname" name="lname" required><br>
    </div>
    <div class="box">
        <label for="mob">Mobile number:</label><input type="text" id="mob" name="mobile" pattern="(0|91)?[5-9][0-9]{9}" required><br>
        </div>
        <div class="box">
        <label for="email">Email</label><input type="email" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2, 4}$" required><br>
        </div>
        <div class="box">
    <label for="in">Gender</label>
    <div class="custom_select">
    <select id="in" name="gender">
        <option value: "M">Male</option>
        <option value: :"F">Female</option>
    </select>
</div><br>
</div>
<div class="box">
    <label for="course">Graduation course</label><input type="text" id="course" name="course"  required><br>
    </div>
    <!-- <div class="box">
</div> -->
    </div>
        <button>Register</button>
    </div>
</div>
    </form>
</body>
</html>
<style>
 *
 {
     margin:0;
     padding:0;
     box-sizing: border-box;
 }

 body{
     display:flex;
     height:100vh;
     justify-content: center;
     align-items: center;
     background: linear-gradient(135deg, #71b7e6, #9b59b6);
 }
 .admission .title{
    text-align: center;
    margin-bottom: 5%;
 }
 .admission
 {
     width:50%;
     background: #fff;
     padding:25px 30px;
     border-radius: 5px;
 }
 .admission .title
 {
     font-size: 30px;
     font-weight:500;
 }
 
.admission .user .box
{
    margin-bottom: 15px;
    display: flex;
    align-items: center;
}
.admission .user .box label{
    width: 200px;
    color: #757575;
    margin-right: 10px;
    font-size: 18px;
}
.admission .user .box input{
    width:100%;
    outline: none;
    border: 1px solid #d5dbd9;
    font-size: 15px;
    padding: 8px 10px;
    border-radius: 3px;
    transition: all 0.3s ease;

}
.admission .user .box .custom_select{
    position:relative;
    width:100%;
    height:37px;

}
.admission .user .box  select{
  
    border:1px solid #d5dbd9;
    width: 100%;
    height: 100%;
    outline: none;
    padding: 8px 10px;

}
.admission .user .box input:hover, .admission .user .box  select:hover
{
border: 3px solid rgb(235, 207, 48);
}
button{
    width:100%;
    padding: 8px 10px;
    font-size: 15px;
    cursor: pointer;
    border-radius: 3px;
}
button:hover{
    background-color: #b08ebd;
}
</style>