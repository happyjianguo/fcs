/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.daointerface;

// auto generated imports
import com.born.fcs.fm.dal.dataobject.SysSubjectMessageDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>sys_subject_message</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/sys_subject_message.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface SysSubjectMessageDAO {
	/**
	 *  Insert one <tt>SysSubjectMessageDO</tt> object to DB table <tt>sys_subject_message</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into sys_subject_message(subject_type,subject_cost_type,at_code,at_name,adjust_project,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param sysSubjectMessage
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(SysSubjectMessageDO sysSubjectMessage) throws DataAccessException;

	/**
	 *  Update DB table <tt>sys_subject_message</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update sys_subject_message set subject_type=?, subject_cost_type=?, at_code=?, at_name=?, adjust_project=? where (id = ?)</tt>
	 *
	 *	@param sysSubjectMessage
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SysSubjectMessageDO sysSubjectMessage) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_subject_message</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_subject_message where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return SysSubjectMessageDO
	 *	@throws DataAccessException
	 */	 
    public SysSubjectMessageDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>sys_subject_message</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from sys_subject_message where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_subject_message</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_subject_message where (1 = 1)</tt>
	 *
	 *	@param sysSubjectMessage
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<SysSubjectMessageDO>
	 *	@throws DataAccessException
	 */	 
    public List<SysSubjectMessageDO> findByCondition(SysSubjectMessageDO sysSubjectMessage, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_subject_message</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from sys_subject_message where (1 = 1)</tt>
	 *
	 *	@param sysSubjectMessage
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(SysSubjectMessageDO sysSubjectMessage) throws DataAccessException;

}