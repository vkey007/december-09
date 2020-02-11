<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>

<%@ page isELIgnored="false"%>
<nav class="navbar  navbar-light navbar-fixed-top"
	style="background-color: gray">
	<%@ page isELIgnored="false"%>
<nav class="navbar  navbar-light navbar-fixed-top"
	style="background-color: gray">

	<!-- Collect the nav links, forms, and other content for toggling -->
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav">
			<li style="margin-left: 50px"><img alt="Brand"
				src="http://localhost:8080/ORS_Proj0/resources/img/customLogo.png"
				width="100px" height="50px" style="background-color: white;"
				class="img-rounded"></li>
			<li>
			<a href="<c:url value="/Welcome" />" style="color: white;"><span
					class="glyphicon glyphicon-home" style="color: white;"></span> <s:message
						code="label.home" /> <span class="sr-only"></span></a>
						</li>


			<c:if test="${not empty sessionScope.user}">
				<c:if test="${sessionScope.user.roleId == 1}">
					<li class="dropdown">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white;"> <s:message code="label.user" /> <span class="caret"></span></a>
						
						<ul class="dropdown-menu"> 
						    <li><a href="<c:url value="/ctl/User" />"><span class="glyphicon glyphicon-plus"></span> <s:message code="label.addUser" /></a></li>
						    <li><a href="<c:url value="/ctl/User/search" />"> <span class="glyphicon glyphicon-list"></span> <s:message code="label.UserList" /></a></li>
						</ul>
						
					</li>

					<li class="dropdown">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white;"><s:message code="label.role" /> <span class="caret"></span></a>
						
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/Role" />"><span class="glyphicon glyphicon-plus"></span> <s:message code="label.addRole" /></a></li>
							<li><a href="<c:url value="/ctl/Role/search" />"><span class="glyphicon glyphicon-list"></span> <s:message code="label.roleList" /> </a></li>

						</ul>
						
					</li>
					
					<li class="dropdown">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white"><s:message code="label.collage" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/College" />"><span class="glyphicon glyphicon-plus"></span> <s:message code="label.addCollage" /></a></li>
							<li><a href="<c:url value="/ctl/College/search" />"><span class="glyphicon glyphicon-list"></span> <s:message code="label.collegeList" /> </a></li>

						</ul>
					</li>

					<li class="dropdown">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white;"><s:message code="label.student1" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/Student" />"><span class="glyphicon glyphicon-plus"></span> <s:message code="label.addSatudent" /></a></li>
							<li><a href="<c:url value="/ctl/Student/search" />"><span class="glyphicon glyphicon-list"></span> <s:message code="label.studentList" /></a></li>

						</ul>
					</li>
					
					<li class="dropdown">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white;"><s:messagecode="label.marksheet" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/Marksheet" />"><span class="glyphicon glyphicon-plus"></span> <s:message code="label.addMarksheet" /></a></li>
							<li><a href="<c:url value="/ctl/Marksheet/get" />"><span class="glyphicon glyphicon-search"></span> <s:message code="label.getMarksheet" /> </a></li>
							<li><a href="<c:url value="/ctl/Marksheet/search" />"><span class="glyphicon glyphicon-list"></span> <s:message code="label.marksheetlist" /> </a></li>
							<li><a href="<c:url value="/ctl/Marksheet/meritlist" />"><span class="glyphicon glyphicon-list"></span> <s:messag code="label.merit" /> </a></li>

						</ul>
					</li>
					<li class="dropdown">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white;"><s:message code="label.course" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/Course" />"><span class="glyphicon glyphicon-plus"></span> <s:message code="label.addCourse" /></a></li>
							<li><a href="<c:url value="/ctl/Course/search" />"><spa class="glyphicon glyphicon-list"></span> <s:message code="label.courseList" /></a></li>
						</ul>
					</li>
					<li class="dropdown">
					 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white;"><s:message code="label.faculty" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/Faculty" />"><span class="glyphicon glyphicon-plus"></span> <s:message code="label.addFaculty" /> </a></li>
							<li><a href="<c:url value="/ctl/Faculty/search" />"><span class="glyphicon glyphicon-list"></span> <s:message code="label.facultyList" /> </a></li>

						</ul></li>
						
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false" style="color: white;"><s:message
								code="label.timetable" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/TimeTable" />"><span
									class="glyphicon glyphicon-plus"></span> <s:message
										code="label.addTimetable" /> </a></li>
							<li><a href="<c:url value="/ctl/TimeTable/search" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.timetableList" /> </a></li>
							<%-- <li><a href="<c:url value="/ctl/TimeTable/get" />"><span
									class="glyphicon glyphicon-search"></span> <s:message
										code="label.getTimetable" /> </a></li> --%>
						</ul></li>
				</c:if>

				<c:if test="${sessionScope.user.roleId == 2}">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false" style="color: white;"><s:message
								code="label.collage" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/College/search" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.collegeList" /> </a></li>

						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false" style="color: white;"><s:message
								code="label.marksheet" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">

							<li><a href="<c:url value="/ctl/Marksheet/get" />"><span
									class="glyphicon glyphicon-search"></span> <s:message
										code="label.getMarksheet" /> </a></li>
							<li><a href="<c:url value="/ctl/Marksheet/search" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.marksheetlist" /> </a></li>
							<li><a href="<c:url value="/ctl/Marksheet/meritlist" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.merit" /></a></li>

						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false" style="color: white;"><s:message
								code="label.course" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/Course/search" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.courseList" /></a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false"><s:message code="label.faculty" /> <span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/Faculty/search" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.facultyList" /></a></li>

						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false" style="color: white;"><s:message
								code="label.timetable" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/Timetable/search" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.timetableList" /> </a></li>

							<li><a href="<c:url value="/ctl/Timetable/get" />"><span
									class="glyphicon glyphicon-search"></span> <s:message
										code="label.getTimetable" /> </a></li>
						</ul></li>




				</c:if>
				<c:if
					test="${sessionScope.user.roleId == 2|| sessionScope.user.roleId == 5}">

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false" style="color: white;"><s:message
								code="label.collage" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/College/search" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.collegeList" /> </a></li>

						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false" style="color: white;"><s:message
								code="label.marksheet" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">

							<li><a href="<c:url value="/ctl/Marksheet/get" />"><span
									class="glyphicon glyphicon-search"></span> <s:message
										code="label.getMarksheet" /> </a></li>
							<li><a href="<c:url value="/ctl/Marksheet/search" />"> <span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.marksheetlist" />
							</a></li>
							<li><a href="<c:url value="/ctl/Marksheet/meritlist" />">
									<span class="glyphicon glyphicon-list"></span> <s:message
										code="label.merit" />
							</a></li>

						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false" style="color: white;"><s:message
								code="label.course" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/Course/search" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.courseList" /> </a></li>
						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false" style="color: white;"><s:message
								code="label.timetable" /> <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="<c:url value="/ctl/TimeTable/search" />"><span
									class="glyphicon glyphicon-list"></span> <s:message
										code="label.timetableList" /> </a></li>

							<li><a href="<c:url value="/ctl/TimeTable/get" />"><span
									class="glyphicon glyphicon-search"></span> <s:message
										code="label.getTimetable" /> </a></li>
						</ul></li>



				</c:if>
			</c:if>
			<c:choose>
				<c:when test="${empty sessionScope.user}">
					<li class="dropdown">
					  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white;"><s:message code="label.user" /> <span class="caret"></span></a>
						<ul class="dropdown-menu"> 
						    <li><a href="<c:url value="/Login" />"><span class="glyphicon glyphicon-log-in"></span> <s:message code="label.log" /></a></li>
							<li><a href="<c:url value="/SignUp" />"><span class="glyphicon glyphicon-user"></span> <s:message code="label.userReg" /></a></li>
						</ul>
					</li>


			    </c:when>
				
				<c:otherwise>
				    <ul class="nav navbar-nav navbar-right" style="margin-right: 30px">
						<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color: white;"> <%-- <img src="/ORS_Proj0/resources/img/${sessionScope.user.fileName}" class="img-circle" width="30" height="30"> --%> <span class="glyphicon glyphicon-user"></span>Hi, <c:out value="${sessionScope.user.firstName}" /> ( <c:out value="${sessionScope.role}" /> ) <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<c:if test="${sessionScope.user.roleId == 1}">
									<li><a
										href="<c:url value="http://localhost:8080/ORS_Proj0/resources/doc/index.html" />"
										target="_blank"> <span class="glyphicon glyphicon-th"></span>
											<s:message code="label.doc" />
									</a></li>
								</c:if>
								<li><a href="<c:url value="/ctl/User/profile" />"><span
										class="glyphicon glyphicon-cog"></span> <s:message
											code="label.profile" /></a></li>

								<li><a href="<c:url value="/ctl/User/changepassword" />">
										<span class="glyphicon glyphicon-lock"></span> <s:message
											code="label.change" />
								</a></li>
								<li><a href="<c:url value="/Login" />"><span
										class="glyphicon glyphicon-off"></span> <s:message
											code="label.logout" /></a></li>
							</ul></li>

					</ul>
				</c:otherwise>
			</c:choose>
		</ul>

	</div>
	<!-- /.navbar-collapse -->

	<!-- /.container-fluid -->
</nav>
<div id="first3">
	<%-- <div class="row">
  <div class="col-md-6"><h1 align="left" style="margin-top: 70px"><%=welcomeMsg%></h1></div>
  <div class="col-md-6"><h1 align="Right" >
			<img src="<%=ORSView.APP_CONTEXT%>/img/Logo.png" width="350"
				height="90" style="margin-top: 70px" >
		</h1>
	</div>
</div>	 --%>

</div>

</body>
</html>
