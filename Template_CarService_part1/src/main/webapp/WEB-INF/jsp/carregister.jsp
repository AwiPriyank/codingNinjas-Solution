<!-- carregister.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Register your Car</title>
</head>
<body>
    <h1>Car Registration Form</h1>
    <form action="/register" method="post"> <!-- Assuming you handle post in your RegisterController -->
        Registration Number: <input type="text" name="registrationNumber"><br>
        Car Name: <input type="text" name="name"><br>
        Car Details: <input type="text" name="details"><br>
        Work Done: <input type="text" name="work"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
