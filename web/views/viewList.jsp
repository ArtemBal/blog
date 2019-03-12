<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>See your posts!</title>
</head>

<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Super app!</h1>
</div>

<div class="w3-container w3-center w3-margin-bottom w3-padding">
    <div class="w3-card-4">
        <div class="w3-container w3-light-blue">
            <h2>Posts</h2>
        </div>      <!-- content -->
        <c:set var="listOfPosts" value='${requestScope["postNames"]}' />
        <ul>
            <c:choose>
                <c:when test="${listOfPosts != null}">
                    <ui>
                        <c:forEach items="${requestScope.postNames}" var="posts">
                            <li>
                                ${posts}
                            </li>
                        </c:forEach>
                    </ui>
                </c:when>
                <c:otherwise>
                    <p>There are no posts yet!</p>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>