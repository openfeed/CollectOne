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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.openfeed.collectone.model.Company;

import java.util.List;

/**
 * The persistence utility for the company service. This utility wraps {@link CompanyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sy
 * @see CompanyPersistence
 * @see CompanyPersistenceImpl
 * @generated
 */
public class CompanyUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Company company) {
		getPersistence().clearCache(company);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Company> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Company> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Company> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Company update(Company company, boolean merge)
		throws SystemException {
		return getPersistence().update(company, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Company update(Company company, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(company, merge, serviceContext);
	}

	/**
	* Caches the company in the entity cache if it is enabled.
	*
	* @param company the company
	*/
	public static void cacheResult(
		com.openfeed.collectone.model.Company company) {
		getPersistence().cacheResult(company);
	}

	/**
	* Caches the companies in the entity cache if it is enabled.
	*
	* @param companies the companies
	*/
	public static void cacheResult(
		java.util.List<com.openfeed.collectone.model.Company> companies) {
		getPersistence().cacheResult(companies);
	}

	/**
	* Creates a new company with the primary key. Does not add the company to the database.
	*
	* @param company_id the primary key for the new company
	* @return the new company
	*/
	public static com.openfeed.collectone.model.Company create(int company_id) {
		return getPersistence().create(company_id);
	}

	/**
	* Removes the company with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param company_id the primary key of the company
	* @return the company that was removed
	* @throws com.openfeed.collectone.NoSuchCompanyException if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.openfeed.collectone.model.Company remove(int company_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.openfeed.collectone.NoSuchCompanyException {
		return getPersistence().remove(company_id);
	}

	public static com.openfeed.collectone.model.Company updateImpl(
		com.openfeed.collectone.model.Company company, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(company, merge);
	}

	/**
	* Returns the company with the primary key or throws a {@link com.openfeed.collectone.NoSuchCompanyException} if it could not be found.
	*
	* @param company_id the primary key of the company
	* @return the company
	* @throws com.openfeed.collectone.NoSuchCompanyException if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.openfeed.collectone.model.Company findByPrimaryKey(
		int company_id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.openfeed.collectone.NoSuchCompanyException {
		return getPersistence().findByPrimaryKey(company_id);
	}

	/**
	* Returns the company with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param company_id the primary key of the company
	* @return the company, or <code>null</code> if a company with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.openfeed.collectone.model.Company fetchByPrimaryKey(
		int company_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(company_id);
	}

	/**
	* Returns all the companies.
	*
	* @return the companies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.openfeed.collectone.model.Company> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.openfeed.collectone.model.Company> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.openfeed.collectone.model.Company> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the companies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of companies.
	*
	* @return the number of companies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the accounts associated with the company.
	*
	* @param pk the primary key of the company
	* @return the accounts associated with the company
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.openfeed.collectone.model.Account> getAccounts(
		int pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAccounts(pk);
	}

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
	public static java.util.List<com.openfeed.collectone.model.Account> getAccounts(
		int pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAccounts(pk, start, end);
	}

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
	public static java.util.List<com.openfeed.collectone.model.Account> getAccounts(
		int pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAccounts(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of accounts associated with the company.
	*
	* @param pk the primary key of the company
	* @return the number of accounts associated with the company
	* @throws SystemException if a system exception occurred
	*/
	public static int getAccountsSize(int pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getAccountsSize(pk);
	}

	/**
	* Returns <code>true</code> if the account is associated with the company.
	*
	* @param pk the primary key of the company
	* @param accountPK the primary key of the account
	* @return <code>true</code> if the account is associated with the company; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsAccount(int pk, int accountPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsAccount(pk, accountPK);
	}

	/**
	* Returns <code>true</code> if the company has any accounts associated with it.
	*
	* @param pk the primary key of the company to check for associations with accounts
	* @return <code>true</code> if the company has any accounts associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsAccounts(int pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsAccounts(pk);
	}

	public static CompanyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CompanyPersistence)PortletBeanLocatorUtil.locate(com.openfeed.collectone.service.ClpSerializer.getServletContextName(),
					CompanyPersistence.class.getName());

			ReferenceRegistry.registerReference(CompanyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(CompanyPersistence persistence) {
	}

	private static CompanyPersistence _persistence;
}