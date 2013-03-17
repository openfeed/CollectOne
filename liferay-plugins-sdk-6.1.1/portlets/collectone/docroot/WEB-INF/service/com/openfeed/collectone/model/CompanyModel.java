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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Company service. Represents a row in the &quot;collectone_Company&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.openfeed.collectone.model.impl.CompanyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.openfeed.collectone.model.impl.CompanyImpl}.
 * </p>
 *
 * @author sy
 * @see Company
 * @see com.openfeed.collectone.model.impl.CompanyImpl
 * @see com.openfeed.collectone.model.impl.CompanyModelImpl
 * @generated
 */
public interface CompanyModel extends BaseModel<Company> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a company model instance should use the {@link Company} interface instead.
	 */

	/**
	 * Returns the primary key of this company.
	 *
	 * @return the primary key of this company
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this company.
	 *
	 * @param primaryKey the primary key of this company
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the company_id of this company.
	 *
	 * @return the company_id of this company
	 */
	public int getCompany_id();

	/**
	 * Sets the company_id of this company.
	 *
	 * @param company_id the company_id of this company
	 */
	public void setCompany_id(int company_id);

	/**
	 * Returns the name of this company.
	 *
	 * @return the name of this company
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this company.
	 *
	 * @param name the name of this company
	 */
	public void setName(String name);

	/**
	 * Returns the date of this company.
	 *
	 * @return the date of this company
	 */
	public Date getDate();

	/**
	 * Sets the date of this company.
	 *
	 * @param date the date of this company
	 */
	public void setDate(Date date);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Company company);

	public int hashCode();

	public CacheModel<Company> toCacheModel();

	public Company toEscapedModel();

	public String toString();

	public String toXmlString();
}