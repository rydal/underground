<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<%@ page import="main.*" %>

<%@ page import="javax.servlet.http.HttpServletRequest" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Your GPS Location</title>
</head>
<body>
<%

    Map<String,String> locations = Listener.getMap();
    String ip = request.getHeader("X-Forwarded-For");
    out.write(ip);
    if (locations == null) {
        out.write("Data not loaded");
        return;
    }
    if (locations.get(ip) != null) {
        out.println(locations.get(ip));
    } else {
        out.println("{ error : no location available }");
    }
%>

</body>
</html>