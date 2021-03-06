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

package com.openfeed.collectone.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.openfeed.collectone.model.Company;
import com.openfeed.collectone.model.CompanyModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Company service. Represents a row in the &quot;collectone_Company&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.openfeed.collectone.model.CompanyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompanyImpl}.
 * </p>
 *
 * @author sy
 * @see CompanyImpl
 * @see com.openfeed.collectone.model.Company
 * @see com.openfeed.collectone.model.CompanyModel
 * @generated
 */
public class CompanyModelImpl extends BaseModelImpl<Company>
	implements CompanyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company model instance should use the {@link com.openfeed.collectone.model.Company} interface instead.
	 */
	public static final String TABLE_NAME = "collectone_Company";
	public static final Object[][] TABLE_COLUMNS = {
			{ "company_id", Types.INTEGER },
			{ "name", Types.VARCHAR },
			{ "date_", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table collectone_Company (company_id INTEGER not null primary key,name VARCHAR(75) null,date_ DATE null)";
	public static final String TABLE_SQL_DROP = "drop table collectone_Company";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.openfeed.collectone.model.Company"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.openfeed.collectone.model.Company"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.openfeed.collectone.model.Company"));

	public CompanyModelImpl() {
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

	public Class<?> getModelClass() {
		return Company.class;
	}

	public String getModelClassName() {
		return Company.class.getName();
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
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
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

	@Override
	public Company toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Company)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		CompanyImpl companyImpl = new CompanyImpl();

		companyImpl.setCompany_id(getCompany_id());
		companyImpl.setName(getName());
		companyImpl.setDate(getDate());

		companyImpl.resetOriginalValues();

		return companyImpl;
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

		Company company = null;

		try {
			company = (Company)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Company> toCacheModel() {
		CompanyCacheModel companyCacheModel = new CompanyCacheModel();

		companyCacheModel.company_id = getCompany_id();

		companyCacheModel.name = getName();

		String name = companyCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			companyCacheModel.name = null;
		}

		Date date = getDate();

		if (date != null) {
			companyCacheModel.date = date.getTime();
		}
		else {
			companyCacheModel.date = Long.MIN_VALUE;
		}

		return companyCacheModel;
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

	private static ClassLoader _classLoader = Company.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Company.class
		};
	private int _company_id;
	private String _name;
	private Date _date;
	private Company _escapedModelProxy;
}