/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FFinanceAffirmDetailDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FFinanceAffirmDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FFinanceAffirmDetailDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_finance_affirm_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFFinanceAffirmDetailDAO extends SqlMapClientDaoSupport implements FFinanceAffirmDetailDAO {
	/**
	 *  Insert one <tt>FFinanceAffirmDetailDO</tt> object to DB table <tt>f_finance_affirm_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_finance_affirm_detail(affirm_id,detail_id,fee_type,pay_amount,return_customer_amount,pay_time,payee_account_name,deposit_account,margin_rate,deposit_time,period,period_unit,accrued_interest,attach,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FFinanceAffirmDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FFinanceAffirmDetailDO FFinanceAffirmDetail) throws DataAccessException {
    	if (FFinanceAffirmDetail == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-FINANCE-AFFIRM-DETAIL-INSERT", FFinanceAffirmDetail);

        return FFinanceAffirmDetail.getId();
    }

	/**
	 *  Update DB table <tt>f_finance_affirm_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_finance_affirm_detail set affirm_id=?, detail_id=?, fee_type=?, pay_amount=?, return_customer_amount=?, pay_time=?, payee_account_name=?, deposit_account=?, margin_rate=?, deposit_time=?, period=?, period_unit=?, accrued_interest=?, attach=? where (id = ?)</tt>
	 *
	 *	@param FFinanceAffirmDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FFinanceAffirmDetailDO FFinanceAffirmDetail) throws DataAccessException {
    	if (FFinanceAffirmDetail == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-FINANCE-AFFIRM-DETAIL-UPDATE", FFinanceAffirmDetail);
    }

	/**
	 *  Query DB table <tt>f_finance_affirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_finance_affirm_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FFinanceAffirmDetailDO
	 *	@throws DataAccessException
	 */	 
    public FFinanceAffirmDetailDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FFinanceAffirmDetailDO) getSqlMapClientTemplate().queryForObject("MS-F-FINANCE-AFFIRM-DETAIL-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_finance_affirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_finance_affirm_detail where (affirm_id = ?)</tt>
	 *
	 *	@param affirmId
	 *	@return List<FFinanceAffirmDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFinanceAffirmDetailDO> findByAffirmId(long affirmId) throws DataAccessException {
        Long param = new Long(affirmId);

        return getSqlMapClientTemplate().queryForList("MS-F-FINANCE-AFFIRM-DETAIL-FIND-BY-AFFIRM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_finance_affirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_finance_affirm_detail where ((return_customer_amount > 0) AND (fee_type IN ('DEPOSIT_PAID', 'GUARANTEE_DEPOSIT')))</tt>
	 *
	 *	@return List<FFinanceAffirmDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFinanceAffirmDetailDO> findNeedAccruedInterest() throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-FINANCE-AFFIRM-DETAIL-FIND-NEED-ACCRUED-INTEREST", null);

    }

	/**
	 *  Query DB table <tt>f_finance_affirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_finance_affirm_detail where ((affirm_id = ?) AND (detail_id = ?))</tt>
	 *
	 *	@param affirmId
	 *	@param detailId
	 *	@return FFinanceAffirmDetailDO
	 *	@throws DataAccessException
	 */	 
    public FFinanceAffirmDetailDO findByAffirmIdAndDetailId(long affirmId, long detailId) throws DataAccessException {
        Map param = new HashMap();

        param.put("affirmId", new Long(affirmId));
        param.put("detailId", new Long(detailId));

        return (FFinanceAffirmDetailDO) getSqlMapClientTemplate().queryForObject("MS-F-FINANCE-AFFIRM-DETAIL-FIND-BY-AFFIRM-ID-AND-DETAIL-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_finance_affirm_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_finance_affirm_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-FINANCE-AFFIRM-DETAIL-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_finance_affirm_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_finance_affirm_detail where (affirm_id = ?)</tt>
	 *
	 *	@param affirmId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByAffirmId(long affirmId) throws DataAccessException {
        Long param = new Long(affirmId);

        return getSqlMapClientTemplate().delete("MS-F-FINANCE-AFFIRM-DETAIL-DELETE-BY-AFFIRM-ID", param);
    }

	/**
	 *  Query DB table <tt>f_finance_affirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_finance_affirm_detail where (1 = 1)</tt>
	 *
	 *	@param FFinanceAffirmDetail
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FFinanceAffirmDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFinanceAffirmDetailDO> findByCondition(FFinanceAffirmDetailDO FFinanceAffirmDetail, long limitStart, long pageSize) throws DataAccessException {
    	if (FFinanceAffirmDetail == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FFinanceAffirmDetail", FFinanceAffirmDetail);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-F-FINANCE-AFFIRM-DETAIL-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_finance_affirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_finance_affirm_detail where (1 = 1)</tt>
	 *
	 *	@param FFinanceAffirmDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FFinanceAffirmDetailDO FFinanceAffirmDetail) throws DataAccessException {
    	if (FFinanceAffirmDetail == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-FINANCE-AFFIRM-DETAIL-FIND-BY-CONDITION-COUNT", FFinanceAffirmDetail);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}