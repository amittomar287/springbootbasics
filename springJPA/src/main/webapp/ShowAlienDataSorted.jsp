<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
   <head>
      <title><c:forTokens> Tag Example</c:forTokens></title>
   </head>

   <body>
     Hi ${lists[0].name} & id: ${lists[0].id}
   </body>
</html>