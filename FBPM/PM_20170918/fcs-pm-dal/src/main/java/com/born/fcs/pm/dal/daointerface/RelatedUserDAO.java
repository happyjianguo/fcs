/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.RelatedUserDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>related_user</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/related_user.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface RelatedUserDAO {
	/**
	 *  Insert one <tt>RelatedUserDO</tt> object to DB table <tt>related_user</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into related_user(related_id,form_id,form_code,task_id,exe_status,project_code,user_type,user_id,user_account,user_name,user_mobile,user_email,dept_id,dept_code,dept_name,transfer_time,remark,is_current,is_del,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param relatedUser
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(RelatedUserDO relatedUser) throws DataAccessException;

	/**
	 *  Update DB table <tt>related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update related_user set form_id=?, form_code=?, task_id=?, exe_status=?, project_code=?, user_type=?, user_id=?, user_account=?, user_name=?, user_mobile=?, user_email=?, dept_id=?, dept_code=?, dept_name=?, transfer_time=?, remark=?, is_current=?, is_del=? where (related_id = ?)</tt>
	 *
	 *	@param relatedUser
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(RelatedUserDO relatedUser) throws DataAccessException;

	/**
	 *  Update DB table <tt>related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update related_user set exe_status=?, remark=? where ((task_id = ?) AND (user_id = ?))</tt>
	 *
	 *	@param exeStatus
	 *	@param remark
	 *	@param taskId
	 *	@param userId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateExeStatus(String exeStatus, String remark, long taskId, long userId) throws DataAccessException;

	/**
	 *  Update DB table <tt>related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update related_user set exe_status=? where ((form_id = ?) AND (user_type = 'FLOW_SUBMIT_MAN'))</tt>
	 *
	 *	@param exeStatus
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateSubmitExeStatus(String exeStatus, long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from related_user where ((form_id = ?) AND (exe_status = 'WAITING'))</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteWhenCancel(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from related_user where (related_id = ?)</tt>
	 *
	 *	@param relatedId
	 *	@return RelatedUserDO
	 *	@throws DataAccessException
	 */	 
    public RelatedUserDO findById(long relatedId) throws DataAccessException;

	/**
	 *  Query DB table <tt>related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from related_user where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return List<RelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<RelatedUserDO> findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from related_user where (task_id = ?)</tt>
	 *
	 *	@param taskId
	 *	@return List<RelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<RelatedUserDO> findByTaskId(long taskId) throws DataAccessException;

	/**
	 *  Query DB table <tt>related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from related_user where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<RelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<RelatedUserDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from related_user where (related_id = ?)</tt>
	 *
	 *	@param relatedId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long relatedId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from related_user where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from related_user where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from related_user where ((project_code = ?) AND (user_type = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param userType
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCodeAndUserType(String projectCode, String userType) throws DataAccessException;

	/**
	 *  Query DB table <tt>related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from related_user where (1 = 1)</tt>
	 *
	 *	@param relatedUser
	 *	@param deptIdList
	 *	@param exeStatusList
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<RelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<RelatedUserDO> findByCondition(RelatedUserDO relatedUser, List deptIdList, List exeStatusList, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from related_user where (1 = 1)</tt>
	 *
	 *	@param relatedUser
	 *	@param deptIdList
	 *	@param exeStatusList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(RelatedUserDO relatedUser, List deptIdList, List exeStatusList) throws DataAccessException;

}