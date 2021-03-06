/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCounterGuaranteeReleaseDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_counter_guarantee_release</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_counter_guarantee_release.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FCounterGuaranteeReleaseDAO {
	/**
	 *  Insert one <tt>FCounterGuaranteeReleaseDO</tt> object to DB table <tt>f_counter_guarantee_release</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_counter_guarantee_release(form_id,project_code,project_name,customer_id,customer_name,contract_number,credit_amount,time_limit,time_unit,busi_type,busi_type_name,remark,released_amount,releasing_amount,apply_amount,release_balance,form_change,risk_council_summary,project_approval,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCounterGuaranteeRelease
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCounterGuaranteeReleaseDO FCounterGuaranteeRelease) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_counter_guarantee_release</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_counter_guarantee_release set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, contract_number=?, credit_amount=?, time_limit=?, time_unit=?, busi_type=?, busi_type_name=?, remark=?, released_amount=?, releasing_amount=?, apply_amount=?, release_balance=?, form_change=?, risk_council_summary=?, project_approval=? where (id = ?)</tt>
	 *
	 *	@param FCounterGuaranteeRelease
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCounterGuaranteeReleaseDO FCounterGuaranteeRelease) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_counter_guarantee_release</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_counter_guarantee_release where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCounterGuaranteeReleaseDO
	 *	@throws DataAccessException
	 */	 
    public FCounterGuaranteeReleaseDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_counter_guarantee_release</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_counter_guarantee_release where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FCounterGuaranteeReleaseDO
	 *	@throws DataAccessException
	 */	 
    public FCounterGuaranteeReleaseDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_counter_guarantee_release</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_counter_guarantee_release where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FCounterGuaranteeReleaseDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCounterGuaranteeReleaseDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_counter_guarantee_release</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_counter_guarantee_release where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_counter_guarantee_release</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_counter_guarantee_release where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_counter_guarantee_release</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_counter_guarantee_release where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

}