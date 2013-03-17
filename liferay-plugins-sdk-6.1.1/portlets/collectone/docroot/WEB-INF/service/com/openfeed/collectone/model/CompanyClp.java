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

package com.openfeed.collectone.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.openfeed.collectone.service.CompanyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sy
 */
public class CompanyClp extends BaseModelImpl<Company> implements Company {
	public CompanyClp() {
	}

	public Class<?> getModelClass() {
		return Company.class;
	}

	public String getModelClassName() {
		return Company.class.getName();
	}

	public int getPrimaryKey() {
		return _company_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setCompany_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_company_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("company_id", getCompany_id());
		attributes.put("name", getName());
		attributes.put("date", getDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer company_id = (Integer)attributes.get("company_id");

		if (company_id != null) {
			setCompany_id(company_id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}
	}

	public int getCompany_id() {
		return _company_id;
	}

	public void setCompany_id(int company_id) {
		_company_id = company_id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public BaseModel<?> getCompanyRemoteModel() {
		return _companyRemoteModel;
	}

	public void setCompanyRemoteModel(BaseModel<?> companyRemoteModel) {
		_companyRemoteModel = companyRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			CompanyLocalServiceUtil.addCompany(this);
		}
		else {
			CompanyLocalServiceUtil.updateCompany(this);
		}
	}

	@Override
	public Company toEscapedModel() {
		return (Company)Proxy.newProxyInstance(Company.class.getClassLoader(),
			new Class[] { Company.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CompanyClp clone = new CompanyClp();

		clone.setCompany_id(getCompany_id());
		clone.setName(getName());
		clone.setDate(getDate());

		return clone;
	}

	public int compareTo(Company company) {
		int primaryKey = company.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		CompanyClp company = null;

		try {
			company = (CompanyClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = company.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{company_id=");
		sb.append(getCompany_id());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", date=");
		sb.append(getDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.openfeed.collectone.model.Company");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>company_id</column-name><column-value><![CDATA[");
		sb.append(getCompany_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _company_id;
	private String _name;
	private Date _date;
	private BaseModel<?> _companyRemoteModel;
}