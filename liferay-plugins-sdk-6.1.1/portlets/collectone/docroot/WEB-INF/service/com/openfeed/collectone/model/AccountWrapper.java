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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Account}.
 * </p>
 *
 * @author    sy
 * @see       Account
 * @generated
 */
public class AccountWrapper implements Account, ModelWrapper<Account> {
	public AccountWrapper(Account account) {
		_account = account;
	}

	public Class<?> getModelClass() {
		return Account.class;
	}

	public String getModelClassName() {
		return Account.class.getName();
	}

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

	/**
	* Returns the primary key of this account.
	*
	* @return the primary key of this account
	*/
	public int getPrimaryKey() {
		return _account.getPrimaryKey();
	}

	/**
	* Sets the primary key of this account.
	*
	* @param primaryKey the primary key of this account
	*/
	public void setPrimaryKey(int primaryKey) {
		_account.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the account_id of this account.
	*
	* @return the account_id of this account
	*/
	public int getAccount_id() {
		return _account.getAccount_id();
	}

	/**
	* Sets the account_id of this account.
	*
	* @param account_id the account_id of this account
	*/
	public void setAccount_id(int account_id) {
		_account.setAccount_id(account_id);
	}

	/**
	* Returns the company_ ID of this account.
	*
	* @return the company_ ID of this account
	*/
	public int getCompany_Id() {
		return _account.getCompany_Id();
	}

	/**
	* Sets the company_ ID of this account.
	*
	* @param company_Id the company_ ID of this account
	*/
	public void setCompany_Id(int company_Id) {
		_account.setCompany_Id(company_Id);
	}

	/**
	* Returns the name of this account.
	*
	* @return the name of this account
	*/
	public java.lang.String getName() {
		return _account.getName();
	}

	/**
	* Sets the name of this account.
	*
	* @param name the name of this account
	*/
	public void setName(java.lang.String name) {
		_account.setName(name);
	}

	/**
	* Returns the first_name of this account.
	*
	* @return the first_name of this account
	*/
	public java.lang.String getFirst_name() {
		return _account.getFirst_name();
	}

	/**
	* Sets the first_name of this account.
	*
	* @param first_name the first_name of this account
	*/
	public void setFirst_name(java.lang.String first_name) {
		_account.setFirst_name(first_name);
	}

	/**
	* Returns the last_name of this account.
	*
	* @return the last_name of this account
	*/
	public java.lang.String getLast_name() {
		return _account.getLast_name();
	}

	/**
	* Sets the last_name of this account.
	*
	* @param last_name the last_name of this account
	*/
	public void setLast_name(java.lang.String last_name) {
		_account.setLast_name(last_name);
	}

	/**
	* Returns the date of this account.
	*
	* @return the date of this account
	*/
	public java.util.Date getDate() {
		return _account.getDate();
	}

	/**
	* Sets the date of this account.
	*
	* @param date the date of this account
	*/
	public void setDate(java.util.Date date) {
		_account.setDate(date);
	}

	/**
	* Returns the active of this account.
	*
	* @return the active of this account
	*/
	public boolean getActive() {
		return _account.getActive();
	}

	/**
	* Returns <code>true</code> if this account is active.
	*
	* @return <code>true</code> if this account is active; <code>false</code> otherwise
	*/
	public boolean isActive() {
		return _account.isActive();
	}

	/**
	* Sets whether this account is active.
	*
	* @param active the active of this account
	*/
	public void setActive(boolean active) {
		_account.setActive(active);
	}

	public boolean isNew() {
		return _account.isNew();
	}

	public void setNew(boolean n) {
		_account.setNew(n);
	}

	public boolean isCachedModel() {
		return _account.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_account.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _account.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _account.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_account.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _account.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_account.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AccountWrapper((Account)_account.clone());
	}

	public int compareTo(Account account) {
		return _account.compareTo(account);
	}

	@Override
	public int hashCode() {
		return _account.hashCode();
	}

	public com.liferay.portal.model.CacheModel<Account> toCacheModel() {
		return _account.toCacheModel();
	}

	public Account toEscapedModel() {
		return new AccountWrapper(_account.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _account.toString();
	}

	public java.lang.String toXmlString() {
		return _account.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_account.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Account getWrappedAccount() {
		return _account;
	}

	public Account getWrappedModel() {
		return _account;
	}

	public void resetOriginalValues() {
		_account.resetOriginalValues();
	}

	private Account _account;
}