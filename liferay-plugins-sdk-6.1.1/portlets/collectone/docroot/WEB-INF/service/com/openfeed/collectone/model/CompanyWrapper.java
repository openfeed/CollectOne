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
 * This class is a wrapper for {@link Company}.
 * </p>
 *
 * @author    sy
 * @see       Company
 * @generated
 */
public class CompanyWrapper implements Company, ModelWrapper<Company> {
	public CompanyWrapper(Company company) {
		_company = company;
	}

	public Class<?> getModelClass() {
		return Company.class;
	}

	public String getModelClassName() {
		return Company.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("company_id", getCompany_id());
		attributes.put("name", getName());
		attributes.put("date", getDate());

		return attributes;
	}

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

	/**
	* Returns the primary key of this company.
	*
	* @return the primary key of this company
	*/
	public int getPrimaryKey() {
		return _company.getPrimaryKey();
	}

	/**
	* Sets the primary key of this company.
	*
	* @param primaryKey the primary key of this company
	*/
	public void setPrimaryKey(int primaryKey) {
		_company.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the company_id of this company.
	*
	* @return the company_id of this company
	*/
	public int getCompany_id() {
		return _company.getCompany_id();
	}

	/**
	* Sets the company_id of this company.
	*
	* @param company_id the company_id of this company
	*/
	public void setCompany_id(int company_id) {
		_company.setCompany_id(company_id);
	}

	/**
	* Returns the name of this company.
	*
	* @return the name of this company
	*/
	public java.lang.String getName() {
		return _company.getName();
	}

	/**
	* Sets the name of this company.
	*
	* @param name the name of this company
	*/
	public void setName(java.lang.String name) {
		_company.setName(name);
	}

	/**
	* Returns the date of this company.
	*
	* @return the date of this company
	*/
	public java.util.Date getDate() {
		return _company.getDate();
	}

	/**
	* Sets the date of this company.
	*
	* @param date the date of this company
	*/
	public void setDate(java.util.Date date) {
		_company.setDate(date);
	}

	public boolean isNew() {
		return _company.isNew();
	}

	public void setNew(boolean n) {
		_company.setNew(n);
	}

	public boolean isCachedModel() {
		return _company.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_company.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _company.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _company.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_company.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _company.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_company.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CompanyWrapper((Company)_company.clone());
	}

	public int compareTo(Company company) {
		return _company.compareTo(company);
	}

	@Override
	public int hashCode() {
		return _company.hashCode();
	}

	public com.liferay.portal.model.CacheModel<Company> toCacheModel() {
		return _company.toCacheModel();
	}

	public Company toEscapedModel() {
		return new CompanyWrapper(_company.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _company.toString();
	}

	public java.lang.String toXmlString() {
		return _company.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_company.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Company getWrappedCompany() {
		return _company;
	}

	public Company getWrappedModel() {
		return _company;
	}

	public void resetOriginalValues() {
		_company.resetOriginalValues();
	}

	private Company _company;
}