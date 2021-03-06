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

import com.openfeed.collectone.model.Account;

/**
 * The persistence interface for the account service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sy
 * @see AccountPersistenceImpl
 * @see AccountUtil
 * @generated
 */
public interface AccountPersistence extends BasePersistence<Account> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccountUtil} to access the account persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the account in the entity cache if it is enabled.
	*
	* @param account the account
	*/
	public void cacheResult(com.openfeed.collectone.model.Account account);

	/**
	* Caches the accounts in the entity cache if it is enabled.
	*
	* @param accounts the accounts
	*/
	public void cacheResult(
		java.util.List<com.openfeed.collectone.model.Account> accounts);

	/**
	* Creates a new account with the primary key. Does not add the account to the database.
	*
	* @param account_id the primary key for the new account
	* @return the new account
	*/
	public com.openfeed.collectone.model.Account create(int account_id);

	/**
	* Removes the account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param account_id the primary key of the account
	* @return the account that was removed
	* @throws com.openfeed.collectone.NoSuchAccountException if a account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Account remove(int account_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.openfeed.collectone.NoSuchAccountException;

	public com.openfeed.collectone.model.Account updateImpl(
		com.openfeed.collectone.model.Account account, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the account with the primary key or throws a {@link com.openfeed.collectone.NoSuchAccountException} if it could not be found.
	*
	* @param account_id the primary key of the account
	* @return the account
	* @throws com.openfeed.collectone.NoSuchAccountException if a account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Account findByPrimaryKey(
		int account_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.openfeed.collectone.NoSuchAccountException;

	/**
	* Returns the account with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param account_id the primary key of the account
	* @return the account, or <code>null</code> if a account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Account fetchByPrimaryKey(
		int account_id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the accounts where company_Id = &#63;.
	*
	* @param company_Id the company_ ID
	* @return the matching accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Account> findByCompanyId(
		int company_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the accounts where company_Id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param company_Id the company_ ID
	* @param start the lower bound of the range of accounts
	* @param end the upper bound of the range of accounts (not inclusive)
	* @return the range of matching accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Account> findByCompanyId(
		int company_Id, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the accounts where company_Id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param company_Id the company_ ID
	* @param start the lower bound of the range of accounts
	* @param end the upper bound of the range of accounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Account> findByCompanyId(
		int company_Id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first account in the ordered set where company_Id = &#63;.
	*
	* @param company_Id the company_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching account
	* @throws com.openfeed.collectone.NoSuchAccountException if a matching account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Account findByCompanyId_First(
		int company_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.openfeed.collectone.NoSuchAccountException;

	/**
	* Returns the first account in the ordered set where company_Id = &#63;.
	*
	* @param company_Id the company_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching account, or <code>null</code> if a matching account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Account fetchByCompanyId_First(
		int company_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last account in the ordered set where company_Id = &#63;.
	*
	* @param company_Id the company_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching account
	* @throws com.openfeed.collectone.NoSuchAccountException if a matching account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Account findByCompanyId_Last(
		int company_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.openfeed.collectone.NoSuchAccountException;

	/**
	* Returns the last account in the ordered set where company_Id = &#63;.
	*
	* @param company_Id the company_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching account, or <code>null</code> if a matching account could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Account fetchByCompanyId_Last(
		int company_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the accounts before and after the current account in the ordered set where company_Id = &#63;.
	*
	* @param account_id the primary key of the current account
	* @param company_Id the company_ ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next account
	* @throws com.openfeed.collectone.NoSuchAccountException if a account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.openfeed.collectone.model.Account[] findByCompanyId_PrevAndNext(
		int account_id, int company_Id,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.openfeed.collectone.NoSuchAccountException;

	/**
	* Returns all the accounts.
	*
	* @return the accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Account> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of accounts
	* @param end the upper bound of the range of accounts (not inclusive)
	* @return the range of accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Account> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the accounts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of accounts
	* @param end the upper bound of the range of accounts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of accounts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.openfeed.collectone.model.Account> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the accounts where company_Id = &#63; from the database.
	*
	* @param company_Id the company_ ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(int company_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the accounts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of accounts where company_Id = &#63;.
	*
	* @param company_Id the company_ ID
	* @return the number of matching accounts
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(int company_Id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of accounts.
	*
	* @return the number of accounts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}