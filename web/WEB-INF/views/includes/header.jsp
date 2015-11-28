<!-- Fixed navbar -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> 
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="<c:url value='/' />">Spring MVC Greetings App</a>
				</div>
				<div id="navbar" class="collapse navbar-collapse">
					<ul class="nav navbar-nav">
						<li<c:if test="${pageTitle == 'Home'}"> class="active"</c:if>><a href="<c:url value='/' />">Home</a></li>
						<li<c:if test="${pageTitle == 'Greetings'}"> class="active"</c:if>><a href="<c:url value='/greetings' />">Greetings</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</nav> <!-- /navbar -->