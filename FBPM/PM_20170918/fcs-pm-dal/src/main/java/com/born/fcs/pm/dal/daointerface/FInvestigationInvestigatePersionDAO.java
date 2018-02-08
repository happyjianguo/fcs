/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationInvestigatePersionDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_investigation_investigate_persion</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_investigate_persion.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FInvestigationInvestigatePersionDAO {
	/**
	 *  Insert one <tt>FInvestigationInvestigatePersionDO</tt> object to DB table <tt>f_investigation_investigate_persion</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_investigate_persion(investigate_id,investigate_persion_id,investigate_persion_account,investigate_persion_name,raw_add_time) values (?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationInvestigatePersion
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationInvestigatePersionDO FInvestigationInvestigatePersion) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_investigate_persion</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_investigate_persion set investigate_id=?, investigate_persion_id=?, investigate_persion_account=?, investigate_persion_name=? where (id = ?)</tt>
	 *
	 *	@param FInvestigationInvestigatePersion
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationInvestigatePersionDO FInvestigationInvestigatePersion) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_investigate_persion</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_investigate_persion where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FInvestigationInvestigatePersionDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationInvestigatePersionDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_investigate_persion</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_investigate_persion where (investigate_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param investigateId
	 *	@return List<FInvestigationInvestigatePersionDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationInvestigatePersionDO> findByInvestigateId(String investigateId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_investigate_persion</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_investigate_persion where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_investigate_persion</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_investigate_persion where (investigate_id = ?)</tt>
	 *
	 *	@param investigateId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByInvestigateId(String investigateId) throws DataAccessException;

}