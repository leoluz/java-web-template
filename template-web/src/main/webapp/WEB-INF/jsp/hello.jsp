<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
  <head><title>Hello :: Spring Application</title></head>
  <body>
    <h1>Hello - Spring Application</h1>
    <p>Greetings. Now: <c:out default="teste" value="${now}" /></p>
    <p>My name is <c:out default="null" value="${user.name}" /></p>
  </body>
</html>