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

package com.openfeed.collectone.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.openfeed.collectone.model.Company;

/**
 * The persistence interface for the company service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sy
 * @see CompanyPersistenceImpl
 * @see CompanyUtil
 * @generated
 */
public interface CompanyPersistence extends BasePersistence<Company> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CompanyUtil} to access the company persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the company in the entity cache if it is enabled.
	*
	* @param company the company
	*/
	public void cacheResult(com.openfeed.collectone.model.Company company);

	/**
	* Caches the companies in the entity cache if it is enabled.
	*
	* @param companies the companies
	*/
	public void cacheResult(
		java.util.List<com.openfeed.collectone.model.Company> companies);

	/**
	* Creates a new company with the primary key. Does not add the company to the database.
	*
	* @param company_id the primary key for the new company
	* @return the new company
	*/
	public com.openfeed.collectone.model.Company create(int company_id);

	/**
	* Removes the company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param company_id the primary key of the company
	* @return the company that was removed
	* @throws com.openfeed.collectone.NoSuchCompanyException if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Company remove(int company_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.openfeed.collectone.NoSuchCompanyException;

	public com.openfeed.collectone.model.Company updateImpl(
		com.openfeed.collectone.model.Company company, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the company with the primary key or throws a {@link com.openfeed.collectone.NoSuchCompanyException} if it could not be found.
	*
	* @param company_id the primary key of the company
	* @return the company
	* @throws com.openfeed.collectone.NoSuchCompanyException if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Company findByPrimaryKey(
		int company_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.openfeed.collectone.NoSuchCompanyException;

	/**
	* Returns the company with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param company_id the primary key of the company
	* @return the company, or <code>null</code> if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Company fetchByPrimaryKey(
		int company_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the companies.
	*
	* @return the companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Company> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of companies
	* @param end the upper bound of the range of companies (not inclusive)
	* @return the range of companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Company> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the companies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of companies
	* @param end the upper bound of the range of companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of companies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Company> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the companies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of companies.
	*
	* @return the number of companies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the accounts associated with the company.
	*
	* @param pk the primary key of the company
	* @return the accounts associated with the company
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Account> getAccounts(
		int pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the accounts associated with the company.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the company
	* @param start the lower bound of the range of companies
	* @param end the upper bound of the range of companies (not inclusive)
	* @return the range of accounts associated with the company
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Account> getAccounts(
		int pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the accounts associated with the company.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the company
	* @param start the lower bound of the range of companies
	* @param end the upper bound of the range of companies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of accounts associated with the company
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Account> getAccounts(
		int pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of accounts associated with the company.
	*
	* @param pk the primary key of the company
	* @return the number of accounts associated with the company
	* @throws SystemException if a system exception occurred
	*/
	public int getAccountsSize(int pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the account is associated with the company.
	*
	* @param pk the primary key of the company
	* @param accountPK the primary key of the account
	* @return <code>true</code> if the account is associated with the company; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsAccount(int pk, int accountPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the company has any accounts associated with it.
	*
	* @param pk the primary key of the company to check for associations with accounts
	* @return <code>true</code> if the company has any accounts associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsAccounts(int pk)
		throws com.liferay.portal.kernel.exception.SystemException;
}