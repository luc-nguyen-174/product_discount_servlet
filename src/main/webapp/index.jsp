<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
    <style type="text/css">
        form {
            height:180px; width:230px;
            margin:0;
            padding:20px;
            border:1px #CCC solid;
            border-radius: 5px;
        }
        form input{
            padding:5px;
            margin: 5px;
            width: 200px;
        }
        #submit{
            width: 70px;
            margin-left: 35%;
        }
    </style>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post" action="/display-discount">
    <label>Product Description:</label><br>
    <label>
        <input id="des" type="text" name="product_des" placeholder="Description">
    </label><br>

    <label>List Price: </label><br>
    <label>
        <input id="price" type="number" name="price" value="0">
    </label>
    <br>

    <label>Discount Percent:</label><br>
    <label>
        <input id="discount" type="number" name="discount" value="0">
    </label><br>

    <input type="submit" id="submit" value="Converter">
</form>

</body>
</html>