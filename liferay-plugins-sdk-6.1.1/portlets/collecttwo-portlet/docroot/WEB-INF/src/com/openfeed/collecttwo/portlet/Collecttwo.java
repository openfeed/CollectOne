package com.openfeed.collecttwo.portlet;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.openfeed.collectone.model.Company;
import com.openfeed.collectone.service.CompanyLocalServiceUtil;

/**
 * Portlet implementation class Collecttwo
 */
public class Collecttwo extends MVCPortlet {
	
	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.processAction(actionRequest, actionResponse);
		
		Company company = CompanyLocalServiceUtil.createCompany(0);
		String name = actionRequest.getParameter("name");
		company.setName(name);
		company.setDate(new Date());
		try {
			CompanyLocalServiceUtil.addCompany(company);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

}
