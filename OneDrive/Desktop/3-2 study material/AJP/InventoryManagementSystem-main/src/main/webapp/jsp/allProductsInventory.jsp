<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products Inventory List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h2 {
            color: #333;
            text-align: center;
            margin-top: 30px;
        }

        table {
            width: 90%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        td a {
            color: #007bff;
            text-decoration: none;
        }

        td a:hover {
            color: #0056b3;
            text-decoration: underline;
        }

        td:last-child a {
            color: #dc3545;
        }

        td:last-child a:hover {
            color: #bd2130;
            text-decoration: underline;
        }

        .home-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            color: #007bff;
        }

        .home-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<h2>Products Inventory List</h2>

<table border="1">
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Product Stock</th>
        <th>Product Ratings</th>
        <th>Items Sold</th>
        <th>Revenue Generated</th>
        <th>Update Product Details</th>
        <th>Delete Product</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.productName}</td>
            <td>${product.stock}</td>
            <td>${product.ratings}</td>
            <td>${product.itemsSold}</td>
            <td>${product.revenueGenerated}</td>
            <td><a href="/editProductDetails/${product.id}/">Edit product details</a></td>
            <td><a href="/delete/${product.id}/">Delete Product</a></td>
        </tr>
    </c:forEach>
</table>

<a href="home" class="home-link">Home</a>

</body>
</html>
