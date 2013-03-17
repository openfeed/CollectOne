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

import com.openfeed.collectone.model.Account;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Account in entity cache.
 *
 * @author sy
 * @see Account
 * @generated
 */
public class AccountCacheModel implements CacheModel<Account>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{account_id=");
		sb.append(account_id);
		sb.append(", company_Id=");
		sb.append(company_Id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", first_name=");
		sb.append(first_name);
		sb.append(", last_name=");
		sb.append(last_name);
		sb.append(", date=");
		sb.append(date);
		sb.append(", active=");
		sb.append(active);
		sb.append("}");

		return sb.toString();
	}

	public Account toEntityModel() {
		AccountImpl accountImpl = new AccountImpl();

		accountImpl.setAccount_id(account_id);
		accountImpl.setCompany_Id(company_Id);

		if (name == null) {
			accountImpl.setName(StringPool.BLANK);
		}
		else {
			accountImpl.setName(name);
		}

		if (first_name == null) {
			accountImpl.setFirst_name(StringPool.BLANK);
		}
		else {
			accountImpl.setFirst_name(first_name);
		}

		if (last_name == null) {
			accountImpl.setLast_name(StringPool.BLANK);
		}
		else {
			accountImpl.setLast_name(last_name);
		}

		if (date == Long.MIN_VALUE) {
			accountImpl.setDate(null);
		}
		else {
			accountImpl.setDate(new Date(date));
		}

		accountImpl.setActive(active);

		accountImpl.resetOriginalValues();

		return accountImpl;
	}

	public int account_id;
	public int company_Id;
	public String name;
	public String first_name;
	public String last_name;
	public long date;
	public boolean active;
}