/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FLoanUseApplyReceiptDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FLoanUseApplyReceiptDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FLoanUseApplyReceiptDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_loan_use_apply_receipt.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisFLoanUseApplyReceiptDAO extends SqlMapClientDaoSupport implements FLoanUseApplyReceiptDAO {
	/**
	 *  Insert one <tt>FLoanUseApplyReceiptDO</tt> object to DB table <tt>f_loan_use_apply_receipt</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_loan_use_apply_receipt(id,apply_id,project_code,actual_amount,actual_loan_time,actual_deposit_amount,liquidity_loan_amount,fixed_assets_financing_amount,acceptance_bill_amount,credit_letter_amount,busi_sub_type,busi_sub_type_name,voucher_url,other_url,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FLoanUseApplyReceipt
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FLoanUseApplyReceiptDO FLoanUseApplyReceipt) throws DataAccessException {
    	if (FLoanUseApplyReceipt == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-LOAN-USE-APPLY-RECEIPT-INSERT", FLoanUseApplyReceipt);

        return FLoanUseApplyReceipt.getId();
    }

	/**
	 *  Update DB table <tt>f_loan_use_apply_receipt</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_loan_use_apply_receipt set apply_id=?, project_code=?, actual_amount=?, actual_loan_time=?, actual_deposit_amount=?, liquidity_loan_amount=?, fixed_assets_financing_amount=?, acceptance_bill_amount=?, credit_letter_amount=?, busi_sub_type=?, busi_sub_type_name=?, voucher_url=?, other_url=?, remark=? where (id = ?)</tt>
	 *
	 *	@param FLoanUseApplyReceipt
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FLoanUseApplyReceiptDO FLoanUseApplyReceipt) throws DataAccessException {
    	if (FLoanUseApplyReceipt == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-LOAN-USE-APPLY-RECEIPT-UPDATE", FLoanUseApplyReceipt);
    }

	/**
	 *  Update DB table <tt>f_loan_use_apply_receipt</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_loan_use_apply_receipt set project_code=?, actual_amount=?, actual_loan_time=?, actual_deposit_amount=?, liquidity_loan_amount=?, fixed_assets_financing_amount=?, acceptance_bill_amount=?, credit_letter_amount=?, busi_sub_type=?, busi_sub_type_name=?, voucher_url=?, other_url=?, remark=? where (apply_id = ?)</tt>
	 *
	 *	@param FLoanUseApplyReceipt
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByApplyId(FLoanUseApplyReceiptDO FLoanUseApplyReceipt) throws DataAccessException {
    	if (FLoanUseApplyReceipt == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-LOAN-USE-APPLY-RECEIPT-UPDATE-BY-APPLY-ID", FLoanUseApplyReceipt);
    }

	/**
	 *  Query DB table <tt>f_loan_use_apply_receipt</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_loan_use_apply_receipt where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FLoanUseApplyReceiptDO
	 *	@throws DataAccessException
	 */	 
    public FLoanUseApplyReceiptDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FLoanUseApplyReceiptDO) getSqlMapClientTemplate().queryForObject("MS-F-LOAN-USE-APPLY-RECEIPT-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_loan_use_apply_receipt</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_loan_use_apply_receipt where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return FLoanUseApplyReceiptDO
	 *	@throws DataAccessException
	 */	 
    public FLoanUseApplyReceiptDO findByApplyId(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return (FLoanUseApplyReceiptDO) getSqlMapClientTemplate().queryForObject("MS-F-LOAN-USE-APPLY-RECEIPT-FIND-BY-APPLY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_loan_use_apply_receipt</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_loan_use_apply_receipt where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FLoanUseApplyReceiptDO>
	 *	@throws DataAccessException
	 */	 
    public List<FLoanUseApplyReceiptDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-LOAN-USE-APPLY-RECEIPT-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_loan_use_apply_receipt</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_loan_use_apply_receipt where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-LOAN-USE-APPLY-RECEIPT-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_loan_use_apply_receipt</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_loan_use_apply_receipt where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteApplyId(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return getSqlMapClientTemplate().delete("MS-F-LOAN-USE-APPLY-RECEIPT-DELETE-APPLY-ID", param);
    }

}