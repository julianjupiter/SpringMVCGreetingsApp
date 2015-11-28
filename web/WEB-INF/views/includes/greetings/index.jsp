<div class="container">
			<div class="jumbotron">
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#greetings">Click me &raquo;</button>
				<div id="greetings" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					<div class="modal-dialog" role="document">
				    	<div class="modal-content">
				      		<div class="modal-header">
				        		<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        		<h4 class="modal-title" id="myModalLabel">${messageTitle}</h4>
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
    	</div>