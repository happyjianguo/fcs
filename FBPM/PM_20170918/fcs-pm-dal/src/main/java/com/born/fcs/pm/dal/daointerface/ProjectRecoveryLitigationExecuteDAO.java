/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRecoveryLitigationExecuteDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>project_recovery_litigation_execute</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_litigation_execute.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ProjectRecoveryLitigationExecuteDAO {
	/**
	 *  Insert one <tt>ProjectRecoveryLitigationExecuteDO</tt> object to DB table <tt>project_recovery_litigation_execute</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_recovery_litigation_execute(project_recovery_id,execute_apply,place_on_file,accepting_court,compromise,conciliation,estimate,recovery_total_amount,memo,litigation_index,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRecoveryLitigationExecute
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRecoveryLitigationExecuteDO projectRecoveryLitigationExecute) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_recovery_litigation_execute</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_recovery_litigation_execute set project_recovery_id=?, execute_apply=?, place_on_file=?, accepting_court=?, compromise=?, conciliation=?, estimate=?, recovery_total_amount=?, memo=?, litigation_index=? where (id = ?)</tt>
	 *
	 *	@param projectRecoveryLitigationExecute
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRecoveryLitigationExecuteDO projectRecoveryLitigationExecute) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_recovery_litigation_execute</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_execute where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectRecoveryLitigationExecuteDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryLitigationExecuteDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_recovery_litigation_execute</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_execute where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return List<ProjectRecoveryLitigationExecuteDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryLitigationExecuteDO> findByRecoveryId(long projectRecoveryId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_execute</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_execute where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_execute</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_execute where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRecoveryId(long projectRecoveryId) throws DataAccessException;

}