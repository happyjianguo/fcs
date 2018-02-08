/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCouncilSummaryProjectPledgeAssetDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_council_summary_project_pledge_asset</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_summary_project_pledge_asset.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FCouncilSummaryProjectPledgeAssetDAO {
	/**
	 *  Insert one <tt>FCouncilSummaryProjectPledgeAssetDO</tt> object to DB table <tt>f_council_summary_project_pledge_asset</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_council_summary_project_pledge_asset(id,sp_id,type,type_desc,assets_id,asset_type,ownership_name,evaluation_price,pledge_rate,syn_position,postposition,debted_amount,asset_remark,remark,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCouncilSummaryProjectPledgeAsset
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCouncilSummaryProjectPledgeAssetDO FCouncilSummaryProjectPledgeAsset) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_council_summary_project_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_summary_project_pledge_asset set sp_id=?, type=?, type_desc=?, assets_id=?, asset_type=?, ownership_name=?, evaluation_price=?, pledge_rate=?, syn_position=?, postposition=?, debted_amount=?, asset_remark=?, remark=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FCouncilSummaryProjectPledgeAsset
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCouncilSummaryProjectPledgeAssetDO FCouncilSummaryProjectPledgeAsset) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_council_summary_project_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_summary_project_pledge_asset set ownership_name=?, asset_remark=?, evaluation_price=?, pledge_rate=? where (assets_id = ?)</tt>
	 *
	 *	@param FCouncilSummaryProjectPledgeAsset
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByAssertsId(FCouncilSummaryProjectPledgeAssetDO FCouncilSummaryProjectPledgeAsset) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project_pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project_pledge_asset where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCouncilSummaryProjectPledgeAssetDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryProjectPledgeAssetDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project_pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project_pledge_asset where (sp_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param spId
	 *	@return List<FCouncilSummaryProjectPledgeAssetDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilSummaryProjectPledgeAssetDO> findBySpId(long spId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project_pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project_pledge_asset where ((sp_id = ?) AND (type = ?)) order by sort_order ASC</tt>
	 *
	 *	@param spId
	 *	@param type
	 *	@return List<FCouncilSummaryProjectPledgeAssetDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilSummaryProjectPledgeAssetDO> findBySpIdAndType(long spId, String type) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_project_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project_pledge_asset where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_project_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project_pledge_asset where (sp_id = ?)</tt>
	 *
	 *	@param spId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteBySpId(long spId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_project_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project_pledge_asset where ((sp_id = ?) AND (type = ?))</tt>
	 *
	 *	@param spId
	 *	@param type
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteBySpIdAndType(long spId, String type) throws DataAccessException;

}