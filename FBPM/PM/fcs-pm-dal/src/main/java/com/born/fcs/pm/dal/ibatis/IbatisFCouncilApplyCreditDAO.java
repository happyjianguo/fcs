/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FCouncilApplyCreditDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCouncilApplyCreditDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FCouncilApplyCreditDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_apply_credit.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisFCouncilApplyCreditDAO extends SqlMapClientDaoSupport implements FCouncilApplyCreditDAO {
	/**
	 *  Insert one <tt>FCouncilApplyCreditDO</tt> object to DB table <tt>f_council_apply_credit</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_council_apply_credit(id,handle_id,project_code,project_name,dept_name,credit_amount,guarantee_rate,bulgaria_balance,funding_sources,issue_date,expire_date,loan_amount,debit_interest,sort_order,json_data,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCouncilApplyCredit
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCouncilApplyCreditDO FCouncilApplyCredit) throws DataAccessException {
    	if (FCouncilApplyCredit == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-COUNCIL-APPLY-CREDIT-INSERT", FCouncilApplyCredit);

        return FCouncilApplyCredit.getId();
    }

	/**
	 *  Update DB table <tt>f_council_apply_credit</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_apply_credit set handle_id=?, project_code=?, project_name=?, dept_name=?, credit_amount=?, guarantee_rate=?, bulgaria_balance=?, funding_sources=?, issue_date=?, expire_date=?, loan_amount=?, debit_interest=?, sort_order=?, json_data=? where (id = ?)</tt>
	 *
	 *	@param FCouncilApplyCredit
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCouncilApplyCreditDO FCouncilApplyCredit) throws DataAccessException {
    	if (FCouncilApplyCredit == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-COUNCIL-APPLY-CREDIT-UPDATE", FCouncilApplyCredit);
    }

	/**
	 *  Query DB table <tt>f_council_apply_credit</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_apply_credit where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCouncilApplyCreditDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilApplyCreditDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FCouncilApplyCreditDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-APPLY-CREDIT-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_council_apply_credit</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_apply_credit where (handle_id = ?)</tt>
	 *
	 *	@param handleId
	 *	@return List<FCouncilApplyCreditDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilApplyCreditDO> findByHandleId(long handleId) throws DataAccessException {
        Long param = new Long(handleId);

        return getSqlMapClientTemplate().queryForList("MS-F-COUNCIL-APPLY-CREDIT-FIND-BY-HANDLE-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_council_apply_credit</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_apply_credit where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-COUNCIL-APPLY-CREDIT-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_council_apply_credit</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_apply_credit where (handle_id = ?)</tt>
	 *
	 *	@param handleId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByHandleId(long handleId) throws DataAccessException {
        Long param = new Long(handleId);

        return getSqlMapClientTemplate().delete("MS-F-COUNCIL-APPLY-CREDIT-DELETE-BY-HANDLE-ID", param);
    }

}