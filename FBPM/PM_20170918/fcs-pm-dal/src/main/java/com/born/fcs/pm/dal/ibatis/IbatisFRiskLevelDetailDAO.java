/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FRiskLevelDetailDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FRiskLevelDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FRiskLevelDetailDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_risk_level_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisFRiskLevelDetailDAO extends SqlMapClientDaoSupport implements FRiskLevelDetailDAO {
	/**
	 *  Insert one <tt>FRiskLevelDetailDO</tt> object to DB table <tt>f_risk_level_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_risk_level_detail(risk_level_id,score_template_id,evaluation,reevaluation,evaluation_reason,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FRiskLevelDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FRiskLevelDetailDO FRiskLevelDetail) throws DataAccessException {
    	if (FRiskLevelDetail == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-RISK-LEVEL-DETAIL-INSERT", FRiskLevelDetail);

        return FRiskLevelDetail.getId();
    }

	/**
	 *  Update DB table <tt>f_risk_level_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_risk_level_detail set risk_level_id=?, score_template_id=?, evaluation=?, reevaluation=?, evaluation_reason=? where (id = ?)</tt>
	 *
	 *	@param FRiskLevelDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FRiskLevelDetailDO FRiskLevelDetail) throws DataAccessException {
    	if (FRiskLevelDetail == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-RISK-LEVEL-DETAIL-UPDATE", FRiskLevelDetail);
    }

	/**
	 *  Query DB table <tt>f_risk_level_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_risk_level_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FRiskLevelDetailDO
	 *	@throws DataAccessException
	 */	 
    public FRiskLevelDetailDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FRiskLevelDetailDO) getSqlMapClientTemplate().queryForObject("MS-F-RISK-LEVEL-DETAIL-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_risk_level_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_risk_level_detail where (risk_level_id = ?)</tt>
	 *
	 *	@param riskLevelId
	 *	@return List<FRiskLevelDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FRiskLevelDetailDO> findByRiskLevelId(long riskLevelId) throws DataAccessException {
        Long param = new Long(riskLevelId);

        return getSqlMapClientTemplate().queryForList("MS-F-RISK-LEVEL-DETAIL-FIND-BY-RISK-LEVEL-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_risk_level_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_risk_level_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-RISK-LEVEL-DETAIL-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_risk_level_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_risk_level_detail where (risk_level_id = ?)</tt>
	 *
	 *	@param riskLevelId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRiskLevelId(long riskLevelId) throws DataAccessException {
        Long param = new Long(riskLevelId);

        return getSqlMapClientTemplate().delete("MS-F-RISK-LEVEL-DETAIL-DELETE-BY-RISK-LEVEL-ID", param);
    }

}