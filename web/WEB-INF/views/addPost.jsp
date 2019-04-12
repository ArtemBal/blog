<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Add your post!</title>
</head>
<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Super app!</h1>
</div>

<div class="w3-container w3-padding">
    <c:set var="postName" value='${requestScope["postName"]}' />
        <c:if test="${postName != null}">
            <div class="w3-panel w3-green w3-display-container w3-card-4 w3-round">
            <span onclick="this.parentElement.style.display='none'"
                  class="w3-button w3-margin-right w3-display-right w3-round-large w3-hover-green w3-border w3-border-green w3-hover-border-grey">×</span>
            <h5>Post ${postName} added!</h5>
            </div>
        </c:if>
<div class="w3-card-4">
    <div class="w3-container w3-center w3-green">
        <h2>Add post!</h2>
    </div>
</div>
<div>       <!-- content -->
    <form method="post" class="w3-selection w3-light-grey w3-padding">
        <p>What is the name of your article?</p>
        <div>
            <input type="text" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%" name="name">
        </div><!-- /input-group -->
        <br />
        <p>What is the description?</p>
        <div>
            <textarea class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%" name="text"> </textarea>
        </div><!-- /input-group -->
        <br />
        <p>Who is the author?</p>
        <div>
            <input type="text" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%" name="author">
        </div><!-- /input-group -->
        <br />
        <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Locate</button>
        <br />
        <br />
    </form>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>