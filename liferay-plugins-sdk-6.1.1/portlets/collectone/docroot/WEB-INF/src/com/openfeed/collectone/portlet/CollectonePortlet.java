package com.openfeed.collectone.portlet;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.util.bridges.mvc.MVCPortlet;
import com.openfeed.collectone.model.Account;
import com.openfeed.collectone.service.AccountLocalServiceUtil;
import com.openfeed.collectone.service.persistence.AccountUtil;

public class CollectonePortlet extends MVCPortlet {

	@Override
	public void processAction(ActionRequest request,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.processAction(request, actionResponse);
		if (request.getParameter("companyId") != null) {
			try {
				int companyId = Integer.parseInt(request
						.getParameter("companyId"));
				String name = request.getParameter("name");
				String firstName = request.getParameter("first_name");
				String lastName = request.getParameter("last_name");
				Account account = AccountLocalServiceUtil.createAccount(0);
				account.setCompany_Id(companyId);
				account.setName(name);
				account.setFirst_name(firstName);
				account.setLast_name(lastName);
				account.setDate(new Date());
				account.setActive(true);
				AccountLocalServiceUtil.addAccount(account);
				actionResponse.setRenderParameter("companyId",
						String.valueOf(companyId));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

}
