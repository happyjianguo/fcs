/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FProjectContractItemInvalidDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FProjectContractItemInvalidDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FProjectContractItemInvalidDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_project_contract_item_invalid.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFProjectContractItemInvalidDAO extends SqlMapClientDaoSupport implements FProjectContractItemInvalidDAO {
	/**
	 *  Insert one <tt>FProjectContractItemInvalidDO</tt> object to DB table <tt>f_project_contract_item_invalid</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_project_contract_item_invalid(id,form_id,project_code,project_name,customer_id,customer_name,contract_code,contract_name,invalid_reason,withdraw_all,cnt,file_url,contract_scan_url,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FProjectContractItemInvalid
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FProjectContractItemInvalidDO FProjectContractItemInvalid) throws DataAccessException {
    	if (FProjectContractItemInvalid == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-PROJECT-CONTRACT-ITEM-INVALID-INSERT", FProjectContractItemInvalid);

        return FProjectContractItemInvalid.getId();
    }

	/**
	 *  Update DB table <tt>f_project_contract_item_invalid</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_contract_item_invalid set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, contract_code=?, contract_name=?, invalid_reason=?, withdraw_all=?, cnt=?, file_url=?, contract_scan_url=?, remark=? where (id = ?)</tt>
	 *
	 *	@param FProjectContractItemInvalid
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FProjectContractItemInvalidDO FProjectContractItemInvalid) throws DataAccessException {
    	if (FProjectContractItemInvalid == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-PROJECT-CONTRACT-ITEM-INVALID-UPDATE", FProjectContractItemInvalid);
    }

	/**
	 *  Query DB table <tt>f_project_contract_item_invalid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, form_id, project_code, project_name, customer_id, customer_name, contract_code, contract_name, invalid_reason, withdraw_all, cnt, file_url, contract_scan_url, remark, raw_add_time, raw_update_time from f_project_contract_item_invalid where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FProjectContractItemInvalidDO
	 *	@throws DataAccessException
	 */	 
    public FProjectContractItemInvalidDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FProjectContractItemInvalidDO) getSqlMapClientTemplate().queryForObject("MS-F-PROJECT-CONTRACT-ITEM-INVALID-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_project_contract_item_invalid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, form_id, project_code, project_name, customer_id, customer_name, contract_code, contract_name, invalid_reason, withdraw_all, cnt, file_url, contract_scan_url, remark, raw_add_time, raw_update_time from f_project_contract_item_invalid where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FProjectContractItemInvalidDO
	 *	@throws DataAccessException
	 */	 
    public FProjectContractItemInvalidDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FProjectContractItemInvalidDO) getSqlMapClientTemplate().queryForObject("MS-F-PROJECT-CONTRACT-ITEM-INVALID-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_project_contract_item_invalid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, form_id, project_code, project_name, customer_id, customer_name, contract_code, contract_name, invalid_reason, withdraw_all, cnt, file_url, contract_scan_url, remark, raw_add_time, raw_update_time from f_project_contract_item_invalid where (contract_code = ?)</tt>
	 *
	 *	@param contractCode
	 *	@return FProjectContractItemInvalidDO
	 *	@throws DataAccessException
	 */	 
    public FProjectContractItemInvalidDO findByContractCode(String contractCode) throws DataAccessException {

        return (FProjectContractItemInvalidDO) getSqlMapClientTemplate().queryForObject("MS-F-PROJECT-CONTRACT-ITEM-INVALID-FIND-BY-CONTRACT-CODE", contractCode);

    }

	/**
	 *  Delete records from DB table <tt>f_project_contract_item_invalid</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_contract_item_invalid where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-CONTRACT-ITEM-INVALID-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>f_project_contract_item_invalid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_contract_item_invalid where (id = ?)</tt>
	 *
	 *	@param FProjectContractItemInvalid
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FProjectContractItemInvalidDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectContractItemInvalidDO> findByCondition(FProjectContractItemInvalidDO FProjectContractItemInvalid, long limitStart, long pageSize) throws DataAccessException {
    	if (FProjectContractItemInvalid == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FProjectContractItemInvalid", FProjectContractItemInvalid);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-F-PROJECT-CONTRACT-ITEM-INVALID-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_project_contract_item_invalid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_contract_item_invalid where (id = ?)</tt>
	 *
	 *	@param FProjectContractItemInvalid
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FProjectContractItemInvalidDO FProjectContractItemInvalid) throws DataAccessException {
    	if (FProjectContractItemInvalid == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-PROJECT-CONTRACT-ITEM-INVALID-FIND-BY-CONDITION-COUNT", FProjectContractItemInvalid);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}