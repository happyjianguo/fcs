/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.CouncilRiskDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.CouncilRiskDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.CouncilRiskDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/council_risk.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisCouncilRiskDAO extends SqlMapClientDaoSupport implements CouncilRiskDAO {
	/**
	 *  Insert one <tt>CouncilRiskDO</tt> object to DB table <tt>council_risk</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into council_risk(council_id,council_code,council_type,council_place,council_subject,begin_time,customer_id,customer_name,project_code,project_name,apply_man_id,apply_man_name,council_status,participant_ids,participant_names,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param councilRisk
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CouncilRiskDO councilRisk) throws DataAccessException {
    	if (councilRisk == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-COUNCIL-RISK-INSERT", councilRisk);

        return councilRisk.getCouncilId();
    }

	/**
	 *  Update DB table <tt>council_risk</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update council_risk set council_code=?, council_type=?, council_place=?, council_subject=?, begin_time=?, customer_id=?, customer_name=?, project_code=?, project_name=?, apply_man_id=?, apply_man_name=?, council_status=?, participant_ids=?, participant_names=? where (council_id = ?)</tt>
	 *
	 *	@param councilRisk
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CouncilRiskDO councilRisk) throws DataAccessException {
    	if (councilRisk == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-COUNCIL-RISK-UPDATE", councilRisk);
    }

	/**
	 *  Query DB table <tt>council_risk</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from council_risk where (council_id = ?)</tt>
	 *
	 *	@param councilId
	 *	@return CouncilRiskDO
	 *	@throws DataAccessException
	 */	 
    public CouncilRiskDO findById(long councilId) throws DataAccessException {
        Long param = new Long(councilId);

        return (CouncilRiskDO) getSqlMapClientTemplate().queryForObject("MS-COUNCIL-RISK-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>council_risk</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from council_risk where (council_id = ?)</tt>
	 *
	 *	@param councilId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long councilId) throws DataAccessException {
        Long param = new Long(councilId);

        return getSqlMapClientTemplate().delete("MS-COUNCIL-RISK-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>council_risk</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select council_id, council_code, council_type, council_place, council_subject, begin_time, customer_id, customer_name, project_code, project_name, apply_man_id, apply_man_name, council_status, participant_ids, participant_names, raw_add_time, raw_update_time from council_risk risk where (1 = 1)</tt>
	 *
	 *	@param councilRisk
	 *	@param limitStart
	 *	@param pageSize
	 *	@param startTimeBegin
	 *	@param startTimeEnd
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param relatedRoleList
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<CouncilRiskDO>
	 *	@throws DataAccessException
	 */	 
    public List<CouncilRiskDO> findByCondition(CouncilRiskDO councilRisk, long limitStart, long pageSize, Date startTimeBegin, Date startTimeEnd, long loginUserId, List deptIdList, List relatedRoleList, String sortCol, String sortOrder) throws DataAccessException {
    	if (councilRisk == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("councilRisk", councilRisk);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("startTimeBegin", startTimeBegin);
        param.put("startTimeEnd", startTimeEnd);
        param.put("loginUserId", new Long(loginUserId));
        param.put("deptIdList", deptIdList);
        param.put("relatedRoleList", relatedRoleList);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);

        return getSqlMapClientTemplate().queryForList("MS-COUNCIL-RISK-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>council_risk</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from council_risk risk where (1 = 1)</tt>
	 *
	 *	@param councilRisk
	 *	@param startTimeBegin
	 *	@param startTimeEnd
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param relatedRoleList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(CouncilRiskDO councilRisk, Date startTimeBegin, Date startTimeEnd, long loginUserId, List deptIdList, List relatedRoleList) throws DataAccessException {
    	if (councilRisk == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("councilRisk", councilRisk);
        param.put("startTimeBegin", startTimeBegin);
        param.put("startTimeEnd", startTimeEnd);
        param.put("loginUserId", new Long(loginUserId));
        param.put("deptIdList", deptIdList);
        param.put("relatedRoleList", relatedRoleList);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-COUNCIL-RISK-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}