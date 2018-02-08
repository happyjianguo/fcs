/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCreditConditionConfirmItemDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_credit_condition_confirm_item</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_credit_condition_confirm_item.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FCreditConditionConfirmItemDAO {
	/**
	 *  Insert one <tt>FCreditConditionConfirmItemDO</tt> object to DB table <tt>f_credit_condition_confirm_item</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_credit_condition_confirm_item(confirm_id,project_code,asset_id,item_id,item_desc,type,is_confirm,confirm_man_id,confirm_man_account,confirm_man_name,confirm_date,contract_no,contract_agreement_url,text_info,right_vouche,remark,status,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCreditConditionConfirmItem
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCreditConditionConfirmItemDO FCreditConditionConfirmItem) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_credit_condition_confirm_item</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_credit_condition_confirm_item set confirm_id=?, project_code=?, asset_id=?, item_id=?, item_desc=?, type=?, is_confirm=?, confirm_man_id=?, confirm_man_account=?, confirm_man_name=?, confirm_date=?, contract_no=?, contract_agreement_url=?, text_info=?, right_vouche=?, remark=?, status=? where (id = ?)</tt>
	 *
	 *	@param FCreditConditionConfirmItem
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCreditConditionConfirmItemDO FCreditConditionConfirmItem) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm_item where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCreditConditionConfirmItemDO
	 *	@throws DataAccessException
	 */	 
    public FCreditConditionConfirmItemDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm_item where (item_id = ?)</tt>
	 *
	 *	@param itemId
	 *	@return FCreditConditionConfirmItemDO
	 *	@throws DataAccessException
	 */	 
    public FCreditConditionConfirmItemDO findByItemId(long itemId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm_item where ((item_id = ?) AND (type = ?))</tt>
	 *
	 *	@param itemId
	 *	@param type
	 *	@return FCreditConditionConfirmItemDO
	 *	@throws DataAccessException
	 */	 
    public FCreditConditionConfirmItemDO findByItemIdAndType(long itemId, String type) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm_item where (confirm_id = ?)</tt>
	 *
	 *	@param confirmId
	 *	@return List<FCreditConditionConfirmItemDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCreditConditionConfirmItemDO> findByConfirmId(long confirmId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm_item where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FCreditConditionConfirmItemDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCreditConditionConfirmItemDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_credit_condition_confirm_item</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_credit_condition_confirm_item where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_credit_condition_confirm_item</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_credit_condition_confirm_item where (confirm_id = ?)</tt>
	 *
	 *	@param confirmId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByConfirmId(long confirmId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm_item where ((project_code = ?) AND (item_id = ?) AND (type = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param itemId
	 *	@param type
	 *	@return List<FCreditConditionConfirmItemDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCreditConditionConfirmItemDO> findByProjectCodeAndItemIdAndType(String projectCode, long itemId, String type) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm_item where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FCreditConditionConfirmItemDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCreditConditionConfirmItemDO> findFCreditConditionConfirmItemByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm_item where ((project_code = ?) AND (status = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param status
	 *	@return List<FCreditConditionConfirmItemDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCreditConditionConfirmItemDO> findFCreditConditionConfirmItemByProjectCodeAndStauts(String projectCode, String status) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm_item where (1 = 1)</tt>
	 *
	 *	@param FCreditConditionConfirmItem
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FCreditConditionConfirmItemDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCreditConditionConfirmItemDO> findByCondition(FCreditConditionConfirmItemDO FCreditConditionConfirmItem, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_condition_confirm_item</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_credit_condition_confirm_item where (1 = 1)</tt>
	 *
	 *	@param FCreditConditionConfirmItem
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FCreditConditionConfirmItemDO FCreditConditionConfirmItem) throws DataAccessException;

}