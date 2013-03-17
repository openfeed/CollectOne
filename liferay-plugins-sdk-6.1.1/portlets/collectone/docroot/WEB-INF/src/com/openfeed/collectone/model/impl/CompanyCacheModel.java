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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.openfeed.collectone.model.Company;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Company in entity cache.
 *
 * @author sy
 * @see Company
 * @generated
 */
public class CompanyCacheModel implements CacheModel<Company>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{company_id=");
		sb.append(company_id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", date=");
		sb.append(date);
		sb.append("}");

		return sb.toString();
	}

	public Company toEntityModel() {
		CompanyImpl companyImpl = new CompanyImpl();

		companyImpl.setCompany_id(company_id);

		if (name == null) {
			companyImpl.setName(StringPool.BLANK);
		}
		else {
			companyImpl.setName(name);
		}

		if (date == Long.MIN_VALUE) {
			companyImpl.setDate(null);
		}
		else {
			companyImpl.setDate(new Date(date));
		}

		companyImpl.resetOriginalValues();

		return companyImpl;
	}

	public int company_id;
	public String name;
	public long date;
}