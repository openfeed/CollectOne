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

package com.openfeed.collectone.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the account local service. This utility wraps {@link com.openfeed.collectone.service.impl.AccountLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sy
 * @see AccountLocalService
 * @see com.openfeed.collectone.service.base.AccountLocalServiceBaseImpl
 * @see com.openfeed.collectone.service.impl.AccountLocalServiceImpl
 * @generated
 */
public class AccountLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.openfeed.collectone.service.impl.AccountLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the account to the database. Also notifies the appropriate model listeners.
	*
	* @param account the account
	* @return the account that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.openfeed.collectone.model.Account addAccount(
		com.openfeed.collectone.model.Account account)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAccount(account);
	}

	/**
	* Creates a new account with the primary key. Does not add the account to the database.
	*
	* @param account_id the primary key for the new account
	* @return the new account
	*/
	public static com.openfeed.collectone.model.Account createAccount(
		int account_id) {
		return getService().createAccount(account_id);
	}

	/**
	* Deletes the account with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param account_id the primary key of the account
	* @return the account that was removed
	* @throws PortalException if a account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.openfeed.collectone.model.Account deleteAccount(
		int account_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccount(account_id);
	}

	/**
	* Deletes the account from the database. Also notifies the appropriate model listeners.
	*
	* @param account the account
	* @return the account that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.openfeed.collectone.model.Account deleteAccount(
		com.openfeed.collectone.model.Account account)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAccount(account);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.openfeed.collectone.model.Account fetchAccount(
		int account_id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAccount(account_id);
	}

	/**
	* Returns the account with the primary key.
	*
	* @param account_id the primary key of the account
	* @return the account
	* @throws PortalException if a account with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.openfeed.collectone.model.Account getAccount(
		int account_id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccount(account_id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<com.openfeed.collectone.model.Account> getAccounts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccounts(start, end);
	}

	/**
	* Returns the number of accounts.
	*
	* @return the number of accounts
	* @throws SystemException if a system exception occurred
	*/
	public static int getAccountsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAccountsCount();
	}

	/**
	* Updates the account in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param account the account
	* @return the account that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.openfeed.collectone.model.Account updateAccount(
		com.openfeed.collectone.model.Account account)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAccount(account);
	}

	/**
	* Updates the account in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param account the account
	* @param merge whether to merge the account with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the account that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.openfeed.collectone.model.Account updateAccount(
		com.openfeed.collectone.model.Account account, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAccount(account, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.openfeed.collectone.model.Account> getByCompanyId(
		int companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByCompanyId(companyId);
	}

	public static void clearService() {
		_service = null;
	}

	public static AccountLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AccountLocalService.class.getName());

			if (invokableLocalService instanceof AccountLocalService) {
				_service = (AccountLocalService)invokableLocalService;
			}
			else {
				_service = new AccountLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AccountLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(AccountLocalService service) {
	}

	private static AccountLocalService _service;
}