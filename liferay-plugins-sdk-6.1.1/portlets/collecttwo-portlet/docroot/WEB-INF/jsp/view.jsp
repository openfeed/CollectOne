<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ page import="javax.portlet.*"%>
<%@ page import="com.openfeed.collectone.service.*"%>
<%@ page import="com.openfeed.collectone.model.*"%>
<portlet:defineObjects />

<%
	PortletPreferences prefs = renderRequest.getPreferences();
	List<Company> compnaies = CompanyLocalServiceUtil.getCompanies(0,
			CompanyLocalServiceUtil.getCompaniesCount());
%>
<table>
	<form method="POST" action="<portlet:actionURL name="add"/>">
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
	<form method="POST" action="<portlet:actionURL name="search"/>">
		<tr>

			<td>Search Accounts By Company:</td>
			<td><aui:select name="companyId">
					<aui:option value="-1">
						<liferay-ui:message key="select.something" />
					</aui:option>
					<%
						for (Company company : compnaies) {
					%>
					<aui:option value="<%=company.getCompany_id()%>">
						<%=company.getName()%>
					</aui:option>
					<%
						}
					%>
				</aui:select></td>
		</tr>
		<tr>
			<td><Input type="submit" /></td>
		</tr>
</table>
<%
	if (renderRequest.getAttribute("accounts") != null) {
%>
<table>
	<tr>
		<td>AccountID</td>
		<td>CompanyId</td>
		<td>First Name</td>
		<td>Last Name</td>
	</tr>
	<%
		for (Account account : (List<Account>) renderRequest
					.getAttribute("accounts")) {
	%>
	<tr>
		<td><%=account.getAccount_id()%></td>
		<td><%=account.getCompany_Id()%></td>
		<td><%=account.getFirst_name()%></td>
		<td><%=account.getLast_name()%></td>
	</tr>
	<%
		}
	%>
</table>
<%
	}
%>

<H3>
	No of Companies in Database :
	<%
	out.println(CompanyLocalServiceUtil.getCompaniesCount());
%>
</H3>
