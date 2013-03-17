package com.openfeed.collecttwo.controller;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.exception.SystemException;
import com.openfeed.collectone.model.Company;
import com.openfeed.collectone.service.AccountLocalServiceUtil;
import com.openfeed.collectone.service.CompanyLocalServiceUtil;

/**
 * 
 * @author sy
 * 
 */

@Controller
@RequestMapping("VIEW")
public class Collect2Controller {

	@RenderMapping
	public String listEquities(RenderRequest request, Model model) {
		String companyId = (String)request.getAttribute("companyId");
		if (companyId!=null){
			try {
				model.addAttribute("accounts",
						AccountLocalServiceUtil.getByCompanyId(Integer.valueOf(companyId)));
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "view";
	}

	@ActionMapping(params = "action=add")
	// action phase
	public void addSubmit(ActionRequest request, ActionResponse response,
			SessionStatus sessionStatus) {
		Company company = CompanyLocalServiceUtil.createCompany(0);
		String name = request.getParameter("name");
		company.setName(name);
		company.setDate(new Date());
		try {
			CompanyLocalServiceUtil.addCompany(company);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@ActionMapping(params = "action=search")
	// action phase
	public void search(@RequestParam int companyId, ActionRequest request,
			ActionResponse response, Model model) {
		request.setAttribute("companyId", companyId);
	}

}
