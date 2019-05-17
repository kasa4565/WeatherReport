<%@ page import="services.HtmlBuilder" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="style.css">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Weather Report</title>
  </head>
  <body>
    <div align="center">
      <div class="title"><h1>Weather Report</h1></div><br><br>

        <%
          HtmlBuilder htmlBuilder = new HtmlBuilder();
          String weatherReportTable = htmlBuilder.buildWeatherReportTable();
        %>

        <%=weatherReportTable%>

    </div>
  </body>
</html>
