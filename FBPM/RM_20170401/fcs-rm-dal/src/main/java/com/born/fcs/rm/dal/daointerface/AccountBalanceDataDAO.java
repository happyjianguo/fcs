/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.daointerface;

// auto generated imports
import com.born.fcs.rm.dal.dataobject.AccountBalanceDataDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>account_balance_data</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/account_balance_data.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface AccountBalanceDataDAO {
	/**
	 *  Insert one <tt>AccountBalanceDataDO</tt> object to DB table <tt>account_balance_data</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into account_balance_data(account_balance_id,code,name,currency,initial_debit_balance,initial_credit_balance,current_debit_amount,current_credit_amount,year_debit_amount,year_credit_amount,ending_debit_balance,ending_credit_balance,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param accountBalanceData
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(AccountBalanceDataDO accountBalanceData) throws DataAccessException;

	/**
	 *  Update DB table <tt>account_balance_data</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update account_balance_data set account_balance_id=?, code=?, name=?, currency=?, initial_debit_balance=?, initial_credit_balance=?, current_debit_amount=?, current_credit_amount=?, year_debit_amount=?, year_credit_amount=?, ending_debit_balance=?, ending_credit_balance=?, sort_order=? where (account_balance_data_id = ?)</tt>
	 *
	 *	@param accountBalanceData
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(AccountBalanceDataDO accountBalanceData) throws DataAccessException;

	/**
	 *  Query DB table <tt>account_balance_data</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from account_balance_data where (account_balance_data_id = ?)</tt>
	 *
	 *	@param accountBalanceDataId
	 *	@return AccountBalanceDataDO
	 *	@throws DataAccessException
	 */	 
    public AccountBalanceDataDO findById(long accountBalanceDataId) throws DataAccessException;

	/**
	 *  Query DB table <tt>account_balance_data</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from account_balance_data where (account_balance_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param accountBalanceId
	 *	@return List<AccountBalanceDataDO>
	 *	@throws DataAccessException
	 */	 
    public List<AccountBalanceDataDO> findByAccountBalanceId(long accountBalanceId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>account_balance_data</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from account_balance_data where (account_balance_data_id = ?)</tt>
	 *
	 *	@param accountBalanceDataId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long accountBalanceDataId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>account_balance_data</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from account_balance_data where (account_balance_id = ?)</tt>
	 *
	 *	@param accountBalanceId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByAccountBalanceId(long accountBalanceId) throws DataAccessException;

	/**
	 *  Query DB table <tt>account_balance_data</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from account_balance_data where (1 = 1)</tt>
	 *
	 *	@param accountBalanceData
	 *	@param codeFull
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(AccountBalanceDataDO accountBalanceData, String codeFull) throws DataAccessException;

	/**
	 *  Query DB table <tt>account_balance_data</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from account_balance_data where (1 = 1)</tt>
	 *
	 *	@param accountBalanceData
	 *	@param codeFull
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<AccountBalanceDataDO>
	 *	@throws DataAccessException
	 */	 
    public List<AccountBalanceDataDO> findByCondition(AccountBalanceDataDO accountBalanceData, String codeFull, long limitStart, long pageSize, String sortCol, String sortOrder) throws DataAccessException;

}