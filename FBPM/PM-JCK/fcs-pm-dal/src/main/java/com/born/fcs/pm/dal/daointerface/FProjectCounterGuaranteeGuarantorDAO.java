/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FProjectCounterGuaranteeGuarantorDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_project_counter_guarantee_guarantor</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_project_counter_guarantee_guarantor.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FProjectCounterGuaranteeGuarantorDAO {
	/**
	 *  Insert one <tt>FProjectCounterGuaranteeGuarantorDO</tt> object to DB table <tt>f_project_counter_guarantee_guarantor</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_project_counter_guarantee_guarantor(form_id,project_code,project_name,customer_id,customer_name,guarantor,legal_persion,register_capital,total_asset,external_guarantee_amount,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FProjectCounterGuaranteeGuarantor
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FProjectCounterGuaranteeGuarantorDO FProjectCounterGuaranteeGuarantor) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_project_counter_guarantee_guarantor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_counter_guarantee_guarantor set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, guarantor=?, legal_persion=?, register_capital=?, total_asset=?, external_guarantee_amount=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FProjectCounterGuaranteeGuarantor
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FProjectCounterGuaranteeGuarantorDO FProjectCounterGuaranteeGuarantor) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_project_counter_guarantee_guarantor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_counter_guarantee_guarantor set project_code=?, project_name=?, customer_id=?, customer_name=? where (form_id = ?)</tt>
	 *
	 *	@param FProjectCounterGuaranteeGuarantor
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateProjectAndCustomerInfoByFormId(FProjectCounterGuaranteeGuarantorDO FProjectCounterGuaranteeGuarantor) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_counter_guarantee_guarantor</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_counter_guarantee_guarantor where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FProjectCounterGuaranteeGuarantorDO
	 *	@throws DataAccessException
	 */	 
    public FProjectCounterGuaranteeGuarantorDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_counter_guarantee_guarantor</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_counter_guarantee_guarantor where (form_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param formId
	 *	@return List<FProjectCounterGuaranteeGuarantorDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectCounterGuaranteeGuarantorDO> findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_counter_guarantee_guarantor</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_counter_guarantee_guarantor where (project_code = ?) order by sort_order ASC</tt>
	 *
	 *	@param projectCode
	 *	@return List<FProjectCounterGuaranteeGuarantorDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectCounterGuaranteeGuarantorDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_project_counter_guarantee_guarantor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_counter_guarantee_guarantor where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_project_counter_guarantee_guarantor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_counter_guarantee_guarantor where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_project_counter_guarantee_guarantor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_counter_guarantee_guarantor where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

}