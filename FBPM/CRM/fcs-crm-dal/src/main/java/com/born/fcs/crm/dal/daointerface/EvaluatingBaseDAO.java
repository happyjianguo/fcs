/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.daointerface;

// auto generated imports
import com.born.fcs.crm.dal.dataobject.EvaluatingBaseDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>evaluating_base</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/evaluating_base.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface EvaluatingBaseDAO {
	/**
	 *  Insert one <tt>EvaluatingBaseDO</tt> object to DB table <tt>evaluating_base</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into evaluating_base(id,form_id,customer_id,year,evalueting_id,evalueting_key,actual_value,this_score,memo,evalue_type,evalue_type_child,input_person,step,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param evaluatingBase
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(EvaluatingBaseDO evaluatingBase) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>evaluating_base</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from evaluating_base where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>evaluating_base</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from evaluating_base where ((step != "0") AND (form_id = ?))</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteAuditEvalue(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>evaluating_base</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete evaluating_base</tt>
	 *
	 *	@param evaluatingBase
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCondition(EvaluatingBaseDO evaluatingBase) throws DataAccessException;

	/**
	 *  Update DB table <tt>evaluating_base</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update evaluating_base set form_id=?, customer_id=?, year=?, evalueting_id=?, evalueting_key=?, actual_value=?, this_score=?, memo=?, evalue_type=?, evalue_type_child=?, input_person=?, step=? where (id = ?)</tt>
	 *
	 *	@param evaluatingBase
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateById(EvaluatingBaseDO evaluatingBase) throws DataAccessException;

	/**
	 *  Query DB table <tt>evaluating_base</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, form_id, customer_id, year, evalueting_id, evalueting_key, actual_value, this_score, memo, evalue_type, evalue_type_child, input_person, step, raw_add_time, raw_update_time from evaluating_base</tt>
	 *
	 *	@param evaluatingBase
	 *	@return List<EvaluatingBaseDO>
	 *	@throws DataAccessException
	 */	 
    public List<EvaluatingBaseDO> findAllWithCondition(EvaluatingBaseDO evaluatingBase) throws DataAccessException;

	/**
	 *  Query DB table <tt>evaluating_base</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select SUM(this_score) from evaluating_base</tt>
	 *
	 *	@param evaluatingBase
	 *	@return String
	 *	@throws DataAccessException
	 */	 
    public String countScoreWithCondition(EvaluatingBaseDO evaluatingBase) throws DataAccessException;

}