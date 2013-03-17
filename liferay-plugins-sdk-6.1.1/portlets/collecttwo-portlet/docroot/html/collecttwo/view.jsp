<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ page import="javax.portlet.*"%>
<%@ page import="com.openfeed.collectone.service.*"%>
<%@ page import="com.openfeed.collectone.model.*"%>
<portlet:defineObjects />

<%
	PortletPreferences prefs = renderRequest.getPreferences();
	List<Company> compnaies = CompanyLocalServiceUtil.getCompanies(0, CompanyLocalServiceUtil.getCompaniesCount());
%>
<table>
	<form method="POST" action="<portlet:actionURL/>">
		<tr>
			<td>Name:</td>
			<td><Input type="text" name="name" /></td>
		</tr>
		<tr>
			<td><Input type="submit" /></td>
		</tr>
	</form>
</table>

<table>

</table>

<H3>
	Number of Companies in Database :
	<%
	out.println(CompanyLocalServiceUtil.getCompaniesCount());
%>
</H3>
