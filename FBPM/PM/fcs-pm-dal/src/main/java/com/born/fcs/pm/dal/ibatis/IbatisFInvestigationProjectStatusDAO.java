/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FInvestigationProjectStatusDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationProjectStatusDO;
import org.springframework.dao.DataAccessException;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FInvestigationProjectStatusDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_project_status.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 

public class IbatisFInvestigationProjectStatusDAO extends SqlMapClientDaoSupport implements FInvestigationProjectStatusDAO {
	/**
	 *  Insert one <tt>FInvestigationProjectStatusDO</tt> object to DB table <tt>f_investigation_project_status</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_project_status(form_id,project_code,project_name,customer_id,customer_name,overview,background,approval,progress,market_outlook,total_cost,cost_fundraising,benefit_review,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationProjectStatus
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationProjectStatusDO FInvestigationProjectStatus) throws DataAccessException {
    	if (FInvestigationProjectStatus == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-INVESTIGATION-PROJECT-STATUS-INSERT", FInvestigationProjectStatus);

        return FInvestigationProjectStatus.getStatusId();
    }

	/**
	 *  Update DB table <tt>f_investigation_project_status</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_project_status set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, overview=?, background=?, approval=?, progress=?, market_outlook=?, total_cost=?, cost_fundraising=?, benefit_review=? where (status_id = ?)</tt>
	 *
	 *	@param FInvestigationProjectStatus
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationProjectStatusDO FInvestigationProjectStatus) throws DataAccessException {
    	if (FInvestigationProjectStatus == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-PROJECT-STATUS-UPDATE", FInvestigationProjectStatus);
    }

	/**
	 *  Update DB table <tt>f_investigation_project_status</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_project_status set project_code=?, project_name=?, customer_id=?, customer_name=?, overview=?, background=?, approval=?, progress=?, market_outlook=?, total_cost=?, cost_fundraising=?, benefit_review=? where (form_id = ?)</tt>
	 *
	 *	@param FInvestigationProjectStatus
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInvestigationProjectStatusDO FInvestigationProjectStatus) throws DataAccessException {
    	if (FInvestigationProjectStatus == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-PROJECT-STATUS-UPDATE-BY-FORM-ID", FInvestigationProjectStatus);
    }

	/**
	 *  Update DB table <tt>f_investigation_project_status</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_project_status set form_id=?, project_name=?, customer_id=?, customer_name=?, overview=?, background=?, approval=?, progress=?, market_outlook=?, total_cost=?, cost_fundraising=?, benefit_review=? where (project_code = ?)</tt>
	 *
	 *	@param FInvestigationProjectStatus
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByProjectCode(FInvestigationProjectStatusDO FInvestigationProjectStatus) throws DataAccessException {
    	if (FInvestigationProjectStatus == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-PROJECT-STATUS-UPDATE-BY-PROJECT-CODE", FInvestigationProjectStatus);
    }

	/**
	 *  Query DB table <tt>f_investigation_project_status</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_project_status where (status_id = ?)</tt>
	 *
	 *	@param statusId
	 *	@return FInvestigationProjectStatusDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationProjectStatusDO findById(long statusId) throws DataAccessException {
        Long param = new Long(statusId);

        return (FInvestigationProjectStatusDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-PROJECT-STATUS-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_project_status</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_project_status where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FInvestigationProjectStatusDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationProjectStatusDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FInvestigationProjectStatusDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-PROJECT-STATUS-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_project_status</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_project_status where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FInvestigationProjectStatusDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationProjectStatusDO findByProjectCode(String projectCode) throws DataAccessException {

        return (FInvestigationProjectStatusDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-PROJECT-STATUS-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_investigation_project_status</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_project_status where (status_id = ?)</tt>
	 *
	 *	@param statusId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long statusId) throws DataAccessException {
        Long param = new Long(statusId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-PROJECT-STATUS-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_project_status</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_project_status where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-PROJECT-STATUS-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_project_status</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_project_status where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-PROJECT-STATUS-DELETE-BY-PROJECT-CODE", projectCode);
    }

}