<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css"/>"/>
  <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/custom.css" />"/>
  <title>Or</title>
</head>
<body>
<div class="wrapper">
  <div class="row">
    <div class="container col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
      <div class="title">
        AND Gate
      </div>
      <form class="form-login" id="test">
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
          <div class="row post-execution pull-right">
            <div class="output">
              <label>Output: </label>
              <label class="label" name="output"><c:out value="${output}"></c:out></label>
            </div>
            <div class="output-error">
              <label>Error: </label>
              <label class="label" name="label-error"><c:out value="${error}"></c:out></label>
            </div>
          </div>
        </div>
        <button type="submit" class="btn btn-primary button" id="btn-test">
          Test
        </button>
      </form>
      <%--<a href="/view/test.jsp"> <button type="button" class="btn btn-primary button">
        OK
      </button></a>--%>
    </div>
  </div>
</div>
<script src="js/test.js">
  //document.getElementById('test').addEventListener('submit', findOutput);
  /*function findOutput(event)
   {
   event.preventDefault();
   var input = [];
   var output,error;


   for(i=0;i<input.length;i++){
   input[i]=parseInt(document.getElementById('text-t-input'+'-'+i).value,10);
   }

   }*/
</script>
</body>
</html>