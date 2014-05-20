<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title> UleBank</title></head>
  <body>
    <h1>Ulebank :: Office</h1>
    <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
    <h3>Oficinas</h3>
    <c:forEach items="${model.products}" var="prod">
      <c:out value="${prod.description}"/><br/> <a>Calle :  </a> <c:out value="${prod.address}"/> <br/>
      <a>Ciudad :  </a><c:out value="${prod.ciudad}"/><br/><a>Gastos de Oficina :  </a><c:out value="${prod.totalExpenses}"/><br/>
       <a>Beneficio Total :  </a><c:out value="${prod.balance}"/><br/>
    </c:forEach>
    <br>
    <a href="<c:url value="addressChange.htm"/>">Cambiar Direccion Postal</a>
    <br>
  </body>
</html>