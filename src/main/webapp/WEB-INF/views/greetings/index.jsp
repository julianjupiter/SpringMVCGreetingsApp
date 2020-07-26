<%@ include file="../includes/head.jsp" %>
<%@ include file="../includes/header.jsp" %>
    <div class="jumbotron">
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#greetings">Click me &raquo;</button>
        <div id="greetings" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="myModalLabel">${messageTitle}</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                   </div>
                    <div class="modal-body">
                        <p>${messageBody}</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%@ include file="../includes/footer.jsp" %>
