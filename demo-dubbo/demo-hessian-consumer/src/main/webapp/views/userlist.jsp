<%@page pageEncoding="UTF-8" language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	
<table>
  <c:forEach items="${list}" var="user">
    <tr><td align="left" class="blogTitle">
      <c:out value="${user.realname}" escapeXml="false"/>
    </td>
	</tr>
  </c:forEach>
</table>
</body>
</html>