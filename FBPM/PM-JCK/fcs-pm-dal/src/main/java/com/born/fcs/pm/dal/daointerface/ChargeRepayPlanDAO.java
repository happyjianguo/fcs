/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ChargeRepayPlanDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>charge_repay_plan</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/charge_repay_plan.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ChargeRepayPlanDAO {
	/**
	 *  Insert one <tt>ChargeRepayPlanDO</tt> object to DB table <tt>charge_repay_plan</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into charge_repay_plan(plan_id,project_code,project_name,customer_id,customer_name,busi_type,busi_type_name,is_charge_plan,is_repay_plan,user_id,user_account,user_name,dept_id,dept_code,dept_name,dept_path,dept_path_name,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param chargeRepayPlan
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ChargeRepayPlanDO chargeRepayPlan) throws DataAccessException;

	/**
	 *  Update DB table <tt>charge_repay_plan</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update charge_repay_plan set project_code=?, project_name=?, customer_id=?, customer_name=?, busi_type=?, busi_type_name=?, is_charge_plan=?, is_repay_plan=?, user_id=?, user_account=?, user_name=?, dept_id=?, dept_code=?, dept_name=?, dept_path=?, dept_path_name=?, remark=? where (plan_id = ?)</tt>
	 *
	 *	@param chargeRepayPlan
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ChargeRepayPlanDO chargeRepayPlan) throws DataAccessException;

	/**
	 *  Query DB table <tt>charge_repay_plan</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from charge_repay_plan where (plan_id = ?)</tt>
	 *
	 *	@param planId
	 *	@return ChargeRepayPlanDO
	 *	@throws DataAccessException
	 */	 
    public ChargeRepayPlanDO findById(long planId) throws DataAccessException;

	/**
	 *  Query DB table <tt>charge_repay_plan</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from charge_repay_plan where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<ChargeRepayPlanDO>
	 *	@throws DataAccessException
	 */	 
    public List<ChargeRepayPlanDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>charge_repay_plan</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from charge_repay_plan where (plan_id = ?)</tt>
	 *
	 *	@param planId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long planId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>charge_repay_plan</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from charge_repay_plan where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>charge_repay_plan</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from charge_repay_plan where (1 = 1)</tt>
	 *
	 *	@param chargeRepayPlan
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ChargeRepayPlanDO>
	 *	@throws DataAccessException
	 */	 
    public List<ChargeRepayPlanDO> findByCondition(ChargeRepayPlanDO chargeRepayPlan, long loginUserId, List deptIdList, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>charge_repay_plan</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from charge_repay_plan where (1 = 1)</tt>
	 *
	 *	@param chargeRepayPlan
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ChargeRepayPlanDO chargeRepayPlan, long loginUserId, List deptIdList) throws DataAccessException;

}