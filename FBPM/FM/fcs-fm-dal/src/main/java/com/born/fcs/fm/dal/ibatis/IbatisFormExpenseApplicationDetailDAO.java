/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.fm.dal.daointerface.FormExpenseApplicationDetailDAO;


// auto generated imports
import com.born.fcs.fm.dal.dataobject.FormExpenseApplicationDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.fm.dal.daointerface.FormExpenseApplicationDetailDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_expense_application_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFormExpenseApplicationDetailDAO extends SqlMapClientDaoSupport implements FormExpenseApplicationDetailDAO {
	/**
	 *  Insert one <tt>FormExpenseApplicationDetailDO</tt> object to DB table <tt>form_expense_application_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form_expense_application_detail(detail_id,expense_application_id,expense_type,amount,reverse,tax_amount,fp_amount,xj_amount,dept_id,dept_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param formExpenseApplicationDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormExpenseApplicationDetailDO formExpenseApplicationDetail) throws DataAccessException {
    	if (formExpenseApplicationDetail == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-FORM-EXPENSE-APPLICATION-DETAIL-INSERT", formExpenseApplicationDetail);

        return formExpenseApplicationDetail.getDetailId();
    }

	/**
	 *  Update DB table <tt>form_expense_application_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_expense_application_detail set expense_application_id=?, expense_type=?, amount=?, reverse=?, tax_amount=?, fp_amount=?, xj_amount=?, dept_id=?, dept_name=? where (detail_id = ?)</tt>
	 *
	 *	@param formExpenseApplicationDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormExpenseApplicationDetailDO formExpenseApplicationDetail) throws DataAccessException {
    	if (formExpenseApplicationDetail == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-FORM-EXPENSE-APPLICATION-DETAIL-UPDATE", formExpenseApplicationDetail);
    }

	/**
	 *  Query DB table <tt>form_expense_application_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_expense_application_detail where (detail_id = ?)</tt>
	 *
	 *	@param detailId
	 *	@return FormExpenseApplicationDetailDO
	 *	@throws DataAccessException
	 */	 
    public FormExpenseApplicationDetailDO findById(long detailId) throws DataAccessException {
        Long param = new Long(detailId);

        return (FormExpenseApplicationDetailDO) getSqlMapClientTemplate().queryForObject("MS-FORM-EXPENSE-APPLICATION-DETAIL-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>form_expense_application_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_expense_application_detail where (detail_id = ?)</tt>
	 *
	 *	@param detailId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long detailId) throws DataAccessException {
        Long param = new Long(detailId);

        return getSqlMapClientTemplate().delete("MS-FORM-EXPENSE-APPLICATION-DETAIL-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>form_expense_application_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_expense_application_detail where (expense_application_id = ?)</tt>
	 *
	 *	@param expenseApplicationId
	 *	@return List<FormExpenseApplicationDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormExpenseApplicationDetailDO> findByExpenseApplicationId(long expenseApplicationId) throws DataAccessException {
        Long param = new Long(expenseApplicationId);

        return getSqlMapClientTemplate().queryForList("MS-FORM-EXPENSE-APPLICATION-DETAIL-FIND-BY-EXPENSE-APPLICATION-ID", param);

    }

	/**
	 *  Query DB table <tt>form_expense_application_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form_expense_application_detail where (expense_type = ?)</tt>
	 *
	 *	@param expenseType
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findCountByExpenseType(String expenseType) throws DataAccessException {

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-FORM-EXPENSE-APPLICATION-DETAIL-FIND-COUNT-BY-EXPENSE-TYPE", expenseType);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>form_expense_application_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select d.* from form_expense_application e, form_expense_application_detail d, form f where ((d.expense_application_id = e.expense_application_id) AND (e.form_id = f.form_id) AND (f.status IN ('APPROVAL', 'SUBMIT', 'AUDITING')))</tt>
	 *
	 *	@param deptId
	 *	@param categoryId
	 *	@param applyTimeStart
	 *	@param applyTimeEnd
	 *	@return List<FormExpenseApplicationDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormExpenseApplicationDetailDO> findSublInfoByDeptCategory(long deptId, long categoryId, String applyTimeStart, String applyTimeEnd) throws DataAccessException {
        Map param = new HashMap();

        param.put("deptId", new Long(deptId));
        param.put("categoryId", new Long(categoryId));
        param.put("applyTimeStart", applyTimeStart);
        param.put("applyTimeEnd", applyTimeEnd);

        return getSqlMapClientTemplate().queryForList("MS-FORM-EXPENSE-APPLICATION-DETAIL-FIND-SUBL-INFO-BY-DEPT-CATEGORY", param);

    }

}