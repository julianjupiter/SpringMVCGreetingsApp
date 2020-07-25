        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
          <a class="navbar-brand" href="${pageContext.request.contextPath}/">Spring MVC Greetings Application</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav mr-auto">
              <li class="${pageTitle == 'Home' ? 'nav-item active': 'nav-item'}">
                <a class="nav-link" href="${pageContext.request.contextPath}/">Home <span class="sr-only">(current)</span></a>
              </li>
              <li class="${pageTitle == 'Greetings' ? 'nav-item active': 'nav-item'}">
                <a class="nav-link" href="${pageContext.request.contextPath}/greetings">Greetings</a>
              </li>
            </ul>
          </div>
        </nav>
        <main role="main" class="flex-shrink-0">
            <div class="container">