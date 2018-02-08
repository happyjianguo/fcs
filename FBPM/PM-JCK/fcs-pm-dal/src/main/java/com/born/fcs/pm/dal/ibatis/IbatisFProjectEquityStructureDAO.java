/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FProjectEquityStructureDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FProjectEquityStructureDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FProjectEquityStructureDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_project_equity_structure.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisFProjectEquityStructureDAO extends SqlMapClientDaoSupport implements FProjectEquityStructureDAO {
	/**
	 *  Insert one <tt>FProjectEquityStructureDO</tt> object to DB table <tt>f_project_equity_structure</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_project_equity_structure(form_id,project_code,project_name,customer_id,customer_name,stockholder,capital_contributions,contribution_way,equity_ratio,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FProjectEquityStructure
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FProjectEquityStructureDO FProjectEquityStructure) throws DataAccessException {
    	if (FProjectEquityStructure == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-PROJECT-EQUITY-STRUCTURE-INSERT", FProjectEquityStructure);

        return FProjectEquityStructure.getId();
    }

	/**
	 *  Update DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_equity_structure set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, stockholder=?, capital_contributions=?, contribution_way=?, equity_ratio=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FProjectEquityStructure
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FProjectEquityStructureDO FProjectEquityStructure) throws DataAccessException {
    	if (FProjectEquityStructure == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-PROJECT-EQUITY-STRUCTURE-UPDATE", FProjectEquityStructure);
    }

	/**
	 *  Update DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_equity_structure set project_code=?, project_name=?, customer_id=?, customer_name=? where (form_id = ?)</tt>
	 *
	 *	@param FProjectEquityStructure
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateProjectAndCustomerInfoByFormId(FProjectEquityStructureDO FProjectEquityStructure) throws DataAccessException {
    	if (FProjectEquityStructure == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-PROJECT-EQUITY-STRUCTURE-UPDATE-PROJECT-AND-CUSTOMER-INFO-BY-FORM-ID", FProjectEquityStructure);
    }

	/**
	 *  Query DB table <tt>f_project_equity_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_equity_structure where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FProjectEquityStructureDO
	 *	@throws DataAccessException
	 */	 
    public FProjectEquityStructureDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FProjectEquityStructureDO) getSqlMapClientTemplate().queryForObject("MS-F-PROJECT-EQUITY-STRUCTURE-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_project_equity_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_equity_structure where (form_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param formId
	 *	@return List<FProjectEquityStructureDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectEquityStructureDO> findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().queryForList("MS-F-PROJECT-EQUITY-STRUCTURE-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_project_equity_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_equity_structure where (project_code = ?) order by sort_order ASC</tt>
	 *
	 *	@param projectCode
	 *	@return List<FProjectEquityStructureDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectEquityStructureDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-PROJECT-EQUITY-STRUCTURE-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_equity_structure where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-EQUITY-STRUCTURE-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_equity_structure where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-EQUITY-STRUCTURE-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_equity_structure where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-EQUITY-STRUCTURE-DELETE-BY-PROJECT-CODE", projectCode);
    }

}