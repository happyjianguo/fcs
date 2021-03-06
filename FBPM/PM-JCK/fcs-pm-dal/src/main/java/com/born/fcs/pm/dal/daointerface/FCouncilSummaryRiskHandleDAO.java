/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCouncilSummaryRiskHandleDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_council_summary_risk_handle</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_summary_risk_handle.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FCouncilSummaryRiskHandleDAO {
	/**
	 *  Insert one <tt>FCouncilSummaryRiskHandleDO</tt> object to DB table <tt>f_council_summary_risk_handle</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_council_summary_risk_handle(handle_id,summary_id,project_code,project_name,customer_id,customer_name,customer_type,is_extend,extend_principal,extend_time_limit,extend_time_unit,extend_remark,is_comp,comp_principal,comp_interest,comp_penalty,comp_penalty_interest,comp_other,comp_end_time,comp_remark,is_other,other,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCouncilSummaryRiskHandle
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCouncilSummaryRiskHandleDO FCouncilSummaryRiskHandle) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_council_summary_risk_handle</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_summary_risk_handle set summary_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, customer_type=?, is_extend=?, extend_principal=?, extend_time_limit=?, extend_time_unit=?, extend_remark=?, is_comp=?, comp_principal=?, comp_interest=?, comp_penalty=?, comp_penalty_interest=?, comp_other=?, comp_end_time=?, comp_remark=?, is_other=?, other=? where (handle_id = ?)</tt>
	 *
	 *	@param FCouncilSummaryRiskHandle
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCouncilSummaryRiskHandleDO FCouncilSummaryRiskHandle) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_risk_handle</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_risk_handle where (handle_id = ?)</tt>
	 *
	 *	@param handleId
	 *	@return FCouncilSummaryRiskHandleDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryRiskHandleDO findById(long handleId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_risk_handle</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_risk_handle where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FCouncilSummaryRiskHandleDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilSummaryRiskHandleDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_risk_handle</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_risk_handle where (summary_id = ?)</tt>
	 *
	 *	@param summaryId
	 *	@return List<FCouncilSummaryRiskHandleDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilSummaryRiskHandleDO> findBySummaryId(long summaryId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_risk_handle</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_risk_handle where (handle_id = ?)</tt>
	 *
	 *	@param handleId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long handleId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_risk_handle</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_risk_handle where (summary_id = ?)</tt>
	 *
	 *	@param summaryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteBySummaryId(long summaryId) throws DataAccessException;

}