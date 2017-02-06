<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Zephyr
  Date: 2/16/2015
  Time: 3:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css"/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/custom.css" />"/>
  <title>And</title>
</head>
<body>
<div class="wrapper">
  <div class="row">
    <div class="container col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
      <div class="title">
        OR Gate
      </div>
      <form class="form-login" method="post" action="/test">
        <div class="row">

          <div class="row pull-left">
            <div class="Input-0">
              <label>Input 0: </label>
              <input type="text" name="input0" required autofocus>
            </div>
            <div class="input-1">
              <label>Input 1: </label>
              <input type="text" name="input1" required autofocus>
            </div>
          </div>
        </div>
        <button type="submit" class="btn btn-primary button" id="btn-test">
          Test
        </button>
      </form>
    </div>
  </div>
</div>
</body>
</html>