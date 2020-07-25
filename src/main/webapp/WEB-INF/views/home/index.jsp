<%@ include file="../includes/head.jsp" %>
<%@ include file="../includes/header.jsp" %>
    <div class="jumbotron">
        <h2>${messageTitle}</h2>
        <p>${messageBody}</p>
        <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/greetings" role="button">Go to greetings &raquo;</a></p>
    </div>
<%@ include file="../includes/footer.jsp" %>