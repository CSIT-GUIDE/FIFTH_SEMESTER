<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Zephyr
  Date: 2/13/2015
  Time: 7:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title>ANN for AND gate</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css"/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/custom.css" />"/>
  <script type="text/javascript" src="js/respond.js"></script>
</head>
<body>
<div class="wrapper">
  <div class="row">
    <div class="container col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
      <div class="title">
        Training
      </div>
      <form class="form-login" method="post" action="train">
        <div class="Input-0">
          <label>Input 1: </label>
          <input type="text" name="input00" required autofocus>
          <input type="text" name="input01" required autofocus>
          <input type="text" name="input02" required autofocus>
          <input type="text" name="input03" required autofocus>
        </div>
        <div class="input-1">
          <label>Input 2: </label>
          <input type="text" name="input10" required autofocus>
          <input type="text" name="input11" required autofocus>
          <input type="text" name="input12" required autofocus>
          <input type="text" name="input13" required autofocus>
        </div>
        <div class="row">
          <div class="row weight pull-left">
            <div class="input-w0">
              <label>Initial-weight 1: </label>
              <input type="text" name="initweight0" required autofocus>
            </div>
            <div class="input-w1">
              <label>Initial-weight 2: </label>
              <input type="text" name="initweight1" required autofocus>
            </div>

            <button type="submit" class="btn btn-primary button" name="btn-train">
              Train
            </button>
          </div>
        </div>
      </form>
      <div class="row pull-right right-box" id="complete">
        <form class="form-login" action="/test" method="post">
          <div class="form-fix">
          <div class="label training" name="training">
            Training Complete
          </div>
          <div class="iterate">
            <label id="label-iterate">Iteration</label>
            <label class="iterate-value label" name="iteration"><c:out value="${iter}"></c:out></label>
          </div>
          <div class="final-w0">
            <label id="label-weight0">Final Weight0</label>
            <label class="w0-value label" name="finalweight0"><c:out value="${weight1}"></c:out></label>
          </div>
          <div class="final-w1">
            <label id="label-weight1">Final Weight1</label>
            <label class="w1-value label" name="finalweight1"><c:out value="${weight2}"></c:out></label>
          </div>
          <button type="submit" class="btn btn-success button pull-right" name="btn-test">
            Test
          </button>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>

<script src="js/jquery-2.1.3.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/train.js"></script>

</body>
</html>
