<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h4 {
            color: #333;
            text-align: center;
            margin-top: 30px;
        }

        form {
            width: 50%;
            margin: 20px auto;
            background-color: #fff;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }

        table {
            width: 100%;
        }

        tr, td {
            padding: 10px;
        }

        td:first-child {
            width: 30%;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h4>UPDATE INVENTORY SYSTEM</h4>
<form action="update" method="post">
    <table>
        <tr>
            <td>Product Name</td>
            <td><input type="text" name="productName" value="${product.productName}" required></td>
        </tr>

        <tr>
            <td>Stock</td>
            <td><input type="number" name="stock" value="${product.stock}" required></td>
        </tr>
        <tr>
            <td>Ratings</td>
            <td><input type="text" name="ratings" value="${product.ratings}"></td>
        </tr>
        <tr>
            <td>Items Sold</td>
            <td><input type="number" name="itemsSold" value="${product.itemsSold}"></td>
        </tr>
        <tr>
            <td>Revenue Generated</td>
            <td><input type="text" name="revenueGenerated" value="${product.revenueGenerated}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update Product"></td>
        </tr>
    </table>
</form>
</body>
</html>
