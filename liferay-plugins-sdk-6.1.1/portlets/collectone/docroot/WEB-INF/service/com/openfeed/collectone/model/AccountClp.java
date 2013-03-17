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

import com.openfeed.collectone.service.AccountLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sy
 */
public class AccountClp extends BaseModelImpl<Account> implements Account {
	public AccountClp() {
	}

	public Class<?> getModelClass() {
		return Account.class;
	}

	public String getModelClassName() {
		return Account.class.getName();
	}

	public int getPrimaryKey() {
		return _account_id;
	}

	public void setPrimaryKey(int primaryKey) {
		setAccount_id(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_account_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("account_id", getAccount_id());
		attributes.put("company_Id", getCompany_Id());
		attributes.put("name", getName());
		attributes.put("first_name", getFirst_name());
		attributes.put("last_name", getLast_name());
		attributes.put("date", getDate());
		attributes.put("active", getActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer account_id = (Integer)attributes.get("account_id");

		if (account_id != null) {
			setAccount_id(account_id);
		}

		Integer company_Id = (Integer)attributes.get("company_Id");

		if (company_Id != null) {
			setCompany_Id(company_Id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String first_name = (String)attributes.get("first_name");

		if (first_name != null) {
			setFirst_name(first_name);
		}

		String last_name = (String)attributes.get("last_name");

		if (last_name != null) {
			setLast_name(last_name);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	public int getAccount_id() {
		return _account_id;
	}

	public void setAccount_id(int account_id) {
		_account_id = account_id;
	}

	public int getCompany_Id() {
		return _company_Id;
	}

	public void setCompany_Id(int company_Id) {
		_company_Id = company_Id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getFirst_name() {
		return _first_name;
	}

	public void setFirst_name(String first_name) {
		_first_name = first_name;
	}

	public String getLast_name() {
		return _last_name;
	}

	public void setLast_name(String last_name) {
		_last_name = last_name;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	public BaseModel<?> getAccountRemoteModel() {
		return _accountRemoteModel;
	}

	public void setAccountRemoteModel(BaseModel<?> accountRemoteModel) {
		_accountRemoteModel = accountRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			AccountLocalServiceUtil.addAccount(this);
		}
		else {
			AccountLocalServiceUtil.updateAccount(this);
		}
	}

	@Override
	public Account toEscapedModel() {
		return (Account)Proxy.newProxyInstance(Account.class.getClassLoader(),
			new Class[] { Account.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AccountClp clone = new AccountClp();

		clone.setAccount_id(getAccount_id());
		clone.setCompany_Id(getCompany_Id());
		clone.setName(getName());
		clone.setFirst_name(getFirst_name());
		clone.setLast_name(getLast_name());
		clone.setDate(getDate());
		clone.setActive(getActive());

		return clone;
	}

	public int compareTo(Account account) {
		int primaryKey = account.getPrimaryKey();

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

		AccountClp account = null;

		try {
			account = (AccountClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = account.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{account_id=");
		sb.append(getAccount_id());
		sb.append(", company_Id=");
		sb.append(getCompany_Id());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", first_name=");
		sb.append(getFirst_name());
		sb.append(", last_name=");
		sb.append(getLast_name());
		sb.append(", date=");
		sb.append(getDate());
		sb.append(", active=");
		sb.append(getActive());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.openfeed.collectone.model.Account");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>account_id</column-name><column-value><![CDATA[");
		sb.append(getAccount_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>company_Id</column-name><column-value><![CDATA[");
		sb.append(getCompany_Id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>first_name</column-name><column-value><![CDATA[");
		sb.append(getFirst_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_name</column-name><column-value><![CDATA[");
		sb.append(getLast_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _account_id;
	private int _company_Id;
	private String _name;
	private String _first_name;
	private String _last_name;
	private Date _date;
	private boolean _active;
	private BaseModel<?> _accountRemoteModel;
}