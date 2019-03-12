<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11.03.2019
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>My super blog!</title>
  </head>
  <body class="w3-light-grey">
  <!-- header -->
  <div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Super app!</h1>
  </div>

  <div class="w3-container w3-center">       <!-- content -->
    <div class="w3-bar w3-padding-large w3-padding-24">
      <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/list'">List of posts</button>
      <button class="w3-btn w3-hover-green w3-round-large" onclick="location.href='/add'">Add post</button>
    </div>
  </div>
  </body>
</html>
