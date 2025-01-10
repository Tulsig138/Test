<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
            width: 100%;
            text-align: center;
        }

        table {
            width: 50%;
            margin: 50px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 15px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        td {
            border-bottom: 1px solid #ddd;
        }

        a {
            color: #007bff;
            text-decoration: none;
        }

        a:hover {
            color: #0056b3;
        }

        /* Styling for the logout link */
        .logout-link {
            color: red; /* Change link color to red */
            text-decoration: none;
        }

        .logout-link:hover {
            color: darkred; /* Change hover color to darker red */
        }
    </style>
</head>
<body>
<h1>Inventory Management</h1>
<table>
    <tr>
        <td><a href="/add">Add new product to the inventory</a></td>
    </tr>
    <tr>
        <td><a href="/productsInventory">View products Inventory</a></td>
    </tr>
    <tr>
        <td class="logout-cell"><a class="logout-link" href="/logout">logout</a></td>
    </tr>
</table>
</body>
</html>
