/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.daointerface;

// auto generated imports
import com.born.fcs.fm.dal.dataobject.ReceiptPaymentFormDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>receipt_payment_form</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/receipt_payment_form.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ReceiptPaymentFormDAO {
	/**
	 *  Insert one <tt>ReceiptPaymentFormDO</tt> object to DB table <tt>receipt_payment_form</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into receipt_payment_form(source_id,source_form,source_form_id,source_form_sys,fund_direction,project_code,project_name,customer_id,customer_name,contract_no,contract_name,transfer_name,product_name,amount,status,user_id,user_account,user_name,dept_id,dept_code,dept_name,attach,remark,is_simple,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param receiptPaymentForm
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ReceiptPaymentFormDO receiptPaymentForm) throws DataAccessException;

	/**
	 *  Update DB table <tt>receipt_payment_form</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update receipt_payment_form set source_form=?, source_form_id=?, source_form_sys=?, fund_direction=?, project_code=?, project_name=?, customer_id=?, customer_name=?, contract_no=?, contract_name=?, transfer_name=?, product_name=?, amount=?, status=?, user_id=?, user_account=?, user_name=?, dept_id=?, dept_code=?, dept_name=?, attach=?, remark=?, is_simple=? where (source_id = ?)</tt>
	 *
	 *	@param receiptPaymentForm
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ReceiptPaymentFormDO receiptPaymentForm) throws DataAccessException;

	/**
	 *  Query DB table <tt>receipt_payment_form</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from receipt_payment_form t where (source_id = ?)</tt>
	 *
	 *	@param sourceId
	 *	@return ReceiptPaymentFormDO
	 *	@throws DataAccessException
	 */	 
    public ReceiptPaymentFormDO findById(long sourceId) throws DataAccessException;

	/**
	 *  Query DB table <tt>receipt_payment_form</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from receipt_payment_form t where ((source_form = ?) AND (source_form_id = ?))</tt>
	 *
	 *	@param sourceForm
	 *	@param sourceFormId
	 *	@return ReceiptPaymentFormDO
	 *	@throws DataAccessException
	 */	 
    public ReceiptPaymentFormDO findBySourceFormId(String sourceForm, String sourceFormId) throws DataAccessException;

	/**
	 *  Query DB table <tt>receipt_payment_form</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from receipt_payment_form t where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<ReceiptPaymentFormDO>
	 *	@throws DataAccessException
	 */	 
    public List<ReceiptPaymentFormDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>receipt_payment_form</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from receipt_payment_form where (source_id = ?)</tt>
	 *
	 *	@param sourceId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long sourceId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>receipt_payment_form</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from receipt_payment_form where ((source_form = ?) AND (source_form_id = ?))</tt>
	 *
	 *	@param sourceForm
	 *	@param sourceFormId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteBySourceFormId(String sourceForm, String sourceFormId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>receipt_payment_form</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from receipt_payment_form where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>receipt_payment_form</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from receipt_payment_form where (1 = 1)</tt>
	 *
	 *	@param receiptPaymentForm
	 *	@param statusList
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ReceiptPaymentFormDO>
	 *	@throws DataAccessException
	 */	 
    public List<ReceiptPaymentFormDO> findByCondition(ReceiptPaymentFormDO receiptPaymentForm, List statusList, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>receipt_payment_form</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from receipt_payment_form where (1 = 1)</tt>
	 *
	 *	@param receiptPaymentForm
	 *	@param statusList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ReceiptPaymentFormDO receiptPaymentForm, List statusList) throws DataAccessException;

}