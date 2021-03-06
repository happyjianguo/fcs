/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectRecoveryLitigationRefereeDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRecoveryLitigationRefereeDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectRecoveryLitigationRefereeDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_litigation_referee.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisProjectRecoveryLitigationRefereeDAO extends SqlMapClientDaoSupport implements ProjectRecoveryLitigationRefereeDAO {
	/**
	 *  Insert one <tt>ProjectRecoveryLitigationRefereeDO</tt> object to DB table <tt>project_recovery_litigation_referee</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_recovery_litigation_referee(project_recovery_id,project_recovery_referee_type,referee_clerk,arrived_time,notice_time,effective_time,memo,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRecoveryLitigationReferee
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRecoveryLitigationRefereeDO projectRecoveryLitigationReferee) throws DataAccessException {
    	if (projectRecoveryLitigationReferee == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-RECOVERY-LITIGATION-REFEREE-INSERT", projectRecoveryLitigationReferee);

        return projectRecoveryLitigationReferee.getId();
    }

	/**
	 *  Update DB table <tt>project_recovery_litigation_referee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_recovery_litigation_referee set project_recovery_id=?, project_recovery_referee_type=?, referee_clerk=?, arrived_time=?, notice_time=?, effective_time=?, memo=? where (id = ?)</tt>
	 *
	 *	@param projectRecoveryLitigationReferee
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRecoveryLitigationRefereeDO projectRecoveryLitigationReferee) throws DataAccessException {
    	if (projectRecoveryLitigationReferee == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-RECOVERY-LITIGATION-REFEREE-UPDATE", projectRecoveryLitigationReferee);
    }

	/**
	 *  Query DB table <tt>project_recovery_litigation_referee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_referee where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectRecoveryLitigationRefereeDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryLitigationRefereeDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (ProjectRecoveryLitigationRefereeDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RECOVERY-LITIGATION-REFEREE-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery_litigation_referee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_referee where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return List<ProjectRecoveryLitigationRefereeDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryLitigationRefereeDO> findByRecoveryId(long projectRecoveryId) throws DataAccessException {
        Long param = new Long(projectRecoveryId);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RECOVERY-LITIGATION-REFEREE-FIND-BY-RECOVERY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_referee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_referee where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-LITIGATION-REFEREE-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_referee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_referee where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRecoveryId(long projectRecoveryId) throws DataAccessException {
        Long param = new Long(projectRecoveryId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-LITIGATION-REFEREE-DELETE-BY-RECOVERY-ID", param);
    }

}