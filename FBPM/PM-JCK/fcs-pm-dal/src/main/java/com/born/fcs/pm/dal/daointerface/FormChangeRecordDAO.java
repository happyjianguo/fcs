/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FormChangeRecordDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>form_change_record</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_change_record.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FormChangeRecordDAO {
	/**
	 *  Insert one <tt>FormChangeRecordDO</tt> object to DB table <tt>form_change_record</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form_change_record(record_id,apply_form_id,tab_index,tab_desc,exe_url,form_desc,form_data,original_form_data,page_content,original_page_content,user_id,user_account,user_name,user_ip,dept_id,dept_name,session_id,access_token,status,exe_result,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param formChangeRecord
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormChangeRecordDO formChangeRecord) throws DataAccessException;

	/**
	 *  Update DB table <tt>form_change_record</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_change_record set apply_form_id=?, tab_index=?, tab_desc=?, exe_url=?, form_desc=?, form_data=?, original_form_data=?, page_content=?, original_page_content=?, user_id=?, user_account=?, user_name=?, user_ip=?, dept_id=?, dept_name=?, session_id=?, access_token=?, status=?, exe_result=? where (record_id = ?)</tt>
	 *
	 *	@param formChangeRecord
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormChangeRecordDO formChangeRecord) throws DataAccessException;

	/**
	 *  Update DB table <tt>form_change_record</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_change_record set form_data=?, page_content=? where (record_id = ?)</tt>
	 *
	 *	@param formData
	 *	@param pageContent
	 *	@param recordId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateNewData(String formData, String pageContent, long recordId) throws DataAccessException;

	/**
	 *  Update DB table <tt>form_change_record</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_change_record set access_token=? where (record_id = ?)</tt>
	 *
	 *	@param accessToken
	 *	@param recordId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateAccessToken(String accessToken, long recordId) throws DataAccessException;

	/**
	 *  Update DB table <tt>form_change_record</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_change_record set status=? where (apply_form_id = ?)</tt>
	 *
	 *	@param status
	 *	@param applyFormId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateStatus(String status, long applyFormId) throws DataAccessException;

	/**
	 *  Update DB table <tt>form_change_record</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_change_record set status=?, exe_result=? where (record_id = ?)</tt>
	 *
	 *	@param status
	 *	@param exeResult
	 *	@param recordId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateExeStatus(String status, String exeResult, long recordId) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_change_record</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_change_record where (record_id = ?)</tt>
	 *
	 *	@param recordId
	 *	@return FormChangeRecordDO
	 *	@throws DataAccessException
	 */	 
    public FormChangeRecordDO findById(long recordId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>form_change_record</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_change_record where (record_id = ?)</tt>
	 *
	 *	@param recordId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long recordId) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_change_record</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_change_record where (1 = 1)</tt>
	 *
	 *	@param formChangeRecord
	 *	@param statusList
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<FormChangeRecordDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormChangeRecordDO> findByCondition(FormChangeRecordDO formChangeRecord, List statusList, long limitStart, long pageSize, String sortCol, String sortOrder) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_change_record</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form_change_record where (1 = 1)</tt>
	 *
	 *	@param formChangeRecord
	 *	@param statusList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FormChangeRecordDO formChangeRecord, List statusList) throws DataAccessException;

}