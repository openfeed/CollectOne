
<%@page import="java.util.List"%>
<%
	/**
	 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
	 *
	 * This library is free software; you can redistribute it and/or modify it under
	 * the terms of the GNU Lesser General Public License as published by the Free
	 * Software Foundation; either version 2.1 of the License, or (at your option)
	 * any later version.
	 *
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details.
	 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ page import="javax.portlet.*"%>
<%@ page import="com.openfeed.collectone.service.*"%>
<%@ page import="com.openfeed.collectone.model.*"%>

<portlet:defineObjects />

<liferay-ui:message key="of.account.portlet" />
<%
	PortletPreferences prefs = renderRequest.getPreferences();
	List<Company> compnaies = CompanyLocalServiceUtil.getCompanies(0,
			CompanyLocalServiceUtil.getCompaniesCount());
%>
<table>
	<form method="POST" action="<portlet:actionURL/>">
		<tr>

			<td>Company:</td>
			<td><aui:select name="companyId" title="" label="">
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
			<td>Name:</td>
			<td><Input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>First Name:</td>
			<td><Input type="text" name="first_name" /></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td><Input type="text" name="last_name" /></td>
		</tr>
		<tr>
			<td><Input type="submit" /></td>
		</tr>
	</form>
</table>
<%
	if (renderRequest.getParameter("companyId") != null) {
		List<Account> accounts = AccountLocalServiceUtil
				.getByCompanyId(Integer.valueOf((String) renderRequest
						.getParameter("companyId")));
%>
<br/>
<br/>
<div style="font-weight: bold;">Accounts</div>
<table border="1">
<tr>
	<td style="width:10px">AccountID</td>
	<td style="width:10px">CompanyId</td>
	<td style="width:100px">First Name</td>
	<td style="width:100px">Last Name</td>
</tr>
<%
	for (Account account : accounts) {
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
	Number of Accounts in Database :
	<%
	out.println(AccountLocalServiceUtil.getAccountsCount());
%>
</H3>