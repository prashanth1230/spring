<html>
<head>
<title>SpringMVC Framework Implementation</title>
</head>
<%@page isELIgnored="false" %>
<body>
<h2>${message}</h2>
<form action="submitAgain.htm" method="post">
   <input type="hidden" value="submittedAgain" name="hiddeninput"/>
   <input type="submit" value="Click Again">
</form>
</body>
</html>