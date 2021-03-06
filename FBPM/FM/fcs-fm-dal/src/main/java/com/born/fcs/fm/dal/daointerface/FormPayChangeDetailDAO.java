/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.daointerface;

// auto generated imports
import com.born.fcs.fm.dal.dataobject.FormPayChangeDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>form_pay_change_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_pay_change_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FormPayChangeDetailDAO {
	/**
	 *  Insert one <tt>FormPayChangeDetailDO</tt> object to DB table <tt>form_pay_change_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form_pay_change_detail(id,source_id,source_type,user_id,user_name,sort,document_name,document_describe,document_value_old,document_value_new,document_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param formPayChangeDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormPayChangeDetailDO formPayChangeDetail) throws DataAccessException;

	/**
	 *  Update DB table <tt>form_pay_change_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_pay_change_detail set source_id=?, source_type=?, user_id=?, user_name=?, sort=?, document_name=?, document_describe=?, document_value_old=?, document_value_new=?, document_type=? where (id = ?)</tt>
	 *
	 *	@param formPayChangeDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormPayChangeDetailDO formPayChangeDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_pay_change_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_pay_change_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FormPayChangeDetailDO
	 *	@throws DataAccessException
	 */	 
    public FormPayChangeDetailDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_pay_change_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_pay_change_detail where ((source_type = ?) AND (source_id = ?))</tt>
	 *
	 *	@param sourceType
	 *	@param sourceId
	 *	@return List<FormPayChangeDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormPayChangeDetailDO> findByTypeAndSourceId(String sourceType, long sourceId) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_pay_change_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_pay_change_detail where (1 = 1)</tt>
	 *
	 *	@param formPayChangeDetail
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FormPayChangeDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormPayChangeDetailDO> findByCondition(FormPayChangeDetailDO formPayChangeDetail, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_pay_change_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form_pay_change_detail where (1 = 1)</tt>
	 *
	 *	@param formPayChangeDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FormPayChangeDetailDO formPayChangeDetail) throws DataAccessException;

}