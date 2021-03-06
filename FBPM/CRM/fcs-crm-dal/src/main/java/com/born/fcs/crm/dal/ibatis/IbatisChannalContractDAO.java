/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.ibatis;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.born.fcs.crm.dal.daointerface.ChannalContractDAO;
import com.born.fcs.crm.dal.dataobject.ChannalContractDO;

/**
 * An ibatis based implementation of dao interface
 * <tt>com.born.fcs.crm.dal.daointerface.ChannalContractDAO</tt>.
 * 
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access
 * Layer) code generation utility specially developed for <tt>paygw</tt>
 * project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may be
 * OVERWRITTEN by someone else. To modify the file, you should go to directory
 * <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and find the corresponding
 * configuration file (<tt>tables/channal_contract.xml</tt>). Modify the
 * configuration file according to your needs, then run
 * <tt>specialmer-dalgen</tt> to generate this file.
 * 
 * @author peigen
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class IbatisChannalContractDAO extends SqlMapClientDaoSupport implements ChannalContractDAO {
	/**
	 * Insert one <tt>ChannalContractDO</tt> object to DB table
	 * <tt>channal_contract</tt>, return primary key
	 * 
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>insert into channal_contract(form_id,oper_id,oper_name,contract_no,channal_code,channal_name,channal_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 * 
	 * @param channalContract
	 * @return long
	 * @throws DataAccessException
	 */
	@Override
	public long insert(ChannalContractDO channalContract) throws DataAccessException {
		if (channalContract == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		
		getSqlMapClientTemplate().insert("MS-CHANNAL-CONTRACT-INSERT", channalContract);
		
		return channalContract.getFormId();
	}
	
	/**
	 * Query DB table <tt>channal_contract</tt> for records.
	 * 
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select form_id, oper_id, oper_name, contract_no, channal_code, channal_name, channal_type, raw_add_time, raw_update_time from channal_contract where (form_id = ?)</tt>
	 * 
	 * @param formId
	 * @return ChannalContractDO
	 * @throws DataAccessException
	 */
	@Override
	public ChannalContractDO findById(long formId) throws DataAccessException {
		Long param = new Long(formId);
		
		return (ChannalContractDO) getSqlMapClientTemplate().queryForObject(
			"MS-CHANNAL-CONTRACT-FIND-BY-ID", param);
		
	}
	
	/**
	 * Delete records from DB table <tt>channal_contract</tt>.
	 * 
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>delete from channal_contract where (form_id = ?)</tt>
	 * 
	 * @param formId
	 * @return int
	 * @throws DataAccessException
	 */
	@Override
	public int deleteById(long formId) throws DataAccessException {
		Long param = new Long(formId);
		
		return getSqlMapClientTemplate().delete("MS-CHANNAL-CONTRACT-DELETE-BY-ID", param);
	}
	
	/**
	 * Query DB table <tt>channal_contract</tt> for records.
	 * 
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select form_id, oper_id, oper_name, contract_no, channal_code, channal_name, channal_type, raw_add_time, raw_update_time from channal_contract</tt>
	 * 
	 * @param channalContract
	 * @param limitStart
	 * @param pageSize
	 * @param startDate
	 * @param endDate
	 * @return List<ChannalContractDO>
	 * @throws DataAccessException
	 */
	@Override
	public List<ChannalContractDO> findWithCondition(ChannalContractDO channalContract,
														long limitStart, long pageSize,
														Date startDate, Date endDate,
														String likeChannalName,
														String likeChannalCode)
																				throws DataAccessException {
		if (channalContract == null) {
			throw new IllegalArgumentException("Can't select by a null data object.");
		}
		
		Map param = new HashMap();
		
		param.put("channalContract", channalContract);
		param.put("limitStart", new Long(limitStart));
		param.put("pageSize", new Long(pageSize));
		param.put("startDate", startDate);
		param.put("endDate", endDate);
		param.put("likeChannalName", likeChannalName);
		param.put("likeChannalCode", likeChannalCode);
		
		return getSqlMapClientTemplate().queryForList("MS-CHANNAL-CONTRACT-FIND-WITH-CONDITION",
			param);
		
	}
	
	/**
	 * Query DB table <tt>channal_contract</tt> for records.
	 * 
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select COUNT(*) from channal_contract</tt>
	 * 
	 * @param channalContract
	 * @param startDate
	 * @param endDate
	 * @return long
	 * @throws DataAccessException
	 */
	@Override
	public long countWithCondition(ChannalContractDO channalContract, Date startDate, Date endDate,
									String likeChannalName, String likeChannalCode)
																					throws DataAccessException {
		if (channalContract == null) {
			throw new IllegalArgumentException("Can't select by a null data object.");
		}
		
		Map param = new HashMap();
		
		param.put("channalContract", channalContract);
		param.put("startDate", startDate);
		param.put("endDate", endDate);
		param.put("likeChannalName", likeChannalName);
		param.put("likeChannalCode", likeChannalCode);
		Long retObj = (Long) getSqlMapClientTemplate().queryForObject(
			"MS-CHANNAL-CONTRACT-COUNT-WITH-CONDITION", param);
		
		if (retObj == null) {
			return 0;
		} else {
			return retObj.longValue();
		}
		
	}
	
	@Override
	public int updateById(ChannalContractDO channalContract) throws DataAccessException {
		if (channalContract == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		
		return getSqlMapClientTemplate().update("MS-CHANNAL-CONTRACT-UPDATE", channalContract);
	}
	
	@Override
	public int updateStatus(Long formId, String status) throws DataAccessException {
		if (formId == null || status == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		Map param = new HashMap();
		param.put("status", status);
		param.put("formId", new Long(formId));
		return getSqlMapClientTemplate().update("MS-CHANNAL-CONTRACT-STATUS-UPDATE", param);
		
	}
	
	@Override
	public String getMaxContractNo(String channalCode) {
		if (channalCode == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		
		return (String) getSqlMapClientTemplate().queryForObject("MS-CHANNAL-MAX-CONTRACT-NO",
			channalCode);
	}
	
	@Override
	public String getMaxChannalCode(String channalType) {
		
		return (String) getSqlMapClientTemplate().queryForObject("MS-CHANNAL-MAX-CHANNAL-CODE",
			channalType);
	}
	
	@Override
	public ChannalContractDO findByNO(String contractNo) throws DataAccessException {
		if (contractNo == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return (ChannalContractDO) getSqlMapClientTemplate().queryForObject(
			"MS-CHANNAL-CONTRACT-FIND-BY-NO", contractNo);
	}
}