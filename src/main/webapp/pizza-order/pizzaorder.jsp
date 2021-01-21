<%--
  Created by IntelliJ IDEA.
  User: Eleanor
  Date: 1/21/21
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<h1>Create your pizza!</h1>
<form method="post" action="/pizzaorder">

    <div>
        <h2>Choose your crust</h2>
        <select name="crust">
            <option value="original">Original</option>
            <option value="thincrust">Thin Crust</option>
        </select>
    </div>
    <div>
        <h2>Choose your sauce</h2>
        <select name="sauce">
            <option value="red">Red</option>
            <option value="creamygarlic">Creamy Garlic</option>
        </select>
    <div>
    </div>
        <h2>Choose your size</h2>
        <select name="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
    </div>
    <div>
        <h2>Choose your toppings</h2>
        <input name="toppings" value="Cheese" type="checkbox">Cheese
        <input name="toppings" value="Pepperoni" type="checkbox">Pepperoni
        <input name="toppings" value="Sausage" type="checkbox">Sausage
        <input name="toppings" value="Canadian Bacon" type="checkbox">Canadian Bacon
        <input name="toppings" value="Olives" type="checkbox">Olives
        <input name="toppings" value="Peppers" type="checkbox">Peppers
        <input name="toppings" value="Mushrooms" type="checkbox">Mushrooms
        <input name="toppings" value="Onions" type="checkbox">Onions
        <input name="toppings" value="Pineapple" type="checkbox">Pineapple

    </div>
    <div>
        <h2>Enter your delivery address</h2>
        <input type="text" name="address" placeholder="Please enter the delivery address">
    </div>
    <div>
        <input type="submit">
    </div>
</form>

</body>
</html>
