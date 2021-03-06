/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.crm.dal.daointerface.BusyRegionDAO;


// auto generated imports
import com.born.fcs.crm.dal.dataobject.BusyRegionDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.crm.dal.daointerface.BusyRegionDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/busy_region.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisBusyRegionDAO extends SqlMapClientDaoSupport implements BusyRegionDAO {
	/**
	 *  Insert one <tt>BusyRegionDO</tt> object to DB table <tt>busy_region</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into busy_region(id,dep_name,dep_path,code,name,status,raw_add_time) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param busyRegion
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(BusyRegionDO busyRegion) throws DataAccessException {
    	if (busyRegion == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-BUSY-REGION-INSERT", busyRegion);

        return busyRegion.getId();
    }

	/**
	 *  Delete records from DB table <tt>busy_region</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from busy_region where (dep_path = ?)</tt>
	 *
	 *	@param depPath
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByDepPath(String depPath) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-BUSY-REGION-DELETE-BY-DEP-PATH", depPath);
    }

	/**
	 *  Update DB table <tt>busy_region</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update busy_region set status=?</tt>
	 *
	 *	@param busyRegion
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateStatus(BusyRegionDO busyRegion) throws DataAccessException {
    	if (busyRegion == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-BUSY-REGION-UPDATE-STATUS", busyRegion);
    }

	/**
	 *  Update DB table <tt>busy_region</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update busy_region set status=? where (dep_path = ?)</tt>
	 *
	 *	@param busyRegion
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateStatusByPath(BusyRegionDO busyRegion) throws DataAccessException {
    	if (busyRegion == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-BUSY-REGION-UPDATE-STATUS-BY-PATH", busyRegion);
    }

	/**
	 *  Query DB table <tt>busy_region</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, dep_name, dep_path, code, name, status, raw_add_time, raw_update_time from busy_region</tt>
	 *
	 *	@param busyRegion
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<BusyRegionDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusyRegionDO> findWithCondition(BusyRegionDO busyRegion, long limitStart, long pageSize) throws DataAccessException {
    	if (busyRegion == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("busyRegion", busyRegion);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-BUSY-REGION-FIND-WITH-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>busy_region</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select count(distinct dep_path) from busy_region</tt>
	 *
	 *	@param busyRegion
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long countWithCondition(BusyRegionDO busyRegion) throws DataAccessException {
    	if (busyRegion == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-BUSY-REGION-COUNT-WITH-CONDITION", busyRegion);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>busy_region</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, dep_name, dep_path, code, name, status, raw_add_time, raw_update_time from busy_region</tt>
	 *
	 *	@param busyRegion
	 *	@return List<BusyRegionDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusyRegionDO> findAllByPath(BusyRegionDO busyRegion) throws DataAccessException {
    	if (busyRegion == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


        return getSqlMapClientTemplate().queryForList("MS-BUSY-REGION-FIND-ALL-BY-PATH", busyRegion);

    }

}