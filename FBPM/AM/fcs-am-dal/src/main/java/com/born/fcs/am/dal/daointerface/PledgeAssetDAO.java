/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.am.dal.daointerface;

// auto generated imports
import com.born.fcs.am.dal.dataobject.PledgeAssetDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>pledge_asset</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/pledge_asset.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface PledgeAssetDAO {
	/**
	 *  Insert one <tt>PledgeAssetDO</tt> object to DB table <tt>pledge_asset</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into pledge_asset(type_id,asset_type,asset_type_desc,project_code,project_name,ownership_id,ownership_name,is_customer,warrant_no,evaluation_price,status,longitude,latitude,user_id,user_account,user_name,search_key,ralate_video,asset_remark_info,remark,attach,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param pledgeAsset
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PledgeAssetDO pledgeAsset) throws DataAccessException;

	/**
	 *  Update DB table <tt>pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update pledge_asset set type_id=?, asset_type=?, asset_type_desc=?, project_code=?, project_name=?, ownership_id=?, ownership_name=?, is_customer=?, warrant_no=?, evaluation_price=?, status=?, longitude=?, latitude=?, user_id=?, user_account=?, user_name=?, search_key=?, ralate_video=?, asset_remark_info=?, remark=?, attach=? where (assets_id = ?)</tt>
	 *
	 *	@param pledgeAsset
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PledgeAssetDO pledgeAsset) throws DataAccessException;

	/**
	 *  Query DB table <tt>pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_asset where (assets_id = ?)</tt>
	 *
	 *	@param assetsId
	 *	@return PledgeAssetDO
	 *	@throws DataAccessException
	 */	 
    public PledgeAssetDO findById(long assetsId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from pledge_asset where (assets_id = ?)</tt>
	 *
	 *	@param assetsId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long assetsId) throws DataAccessException;

	/**
	 *  Query DB table <tt>pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_asset where (1 = 1)</tt>
	 *
	 *	@param pledgeAsset
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortOrder
	 *	@param sortCol
	 *	@param assetsIdList
	 *	@return List<PledgeAssetDO>
	 *	@throws DataAccessException
	 */	 
    public List<PledgeAssetDO> findByCondition(PledgeAssetDO pledgeAsset, long limitStart, long pageSize, String sortOrder, String sortCol, List assetsIdList) throws DataAccessException;

	/**
	 *  Query DB table <tt>pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from pledge_asset where (1 = 1)</tt>
	 *
	 *	@param pledgeAsset
	 *	@param assetsIdList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PledgeAssetDO pledgeAsset, List assetsIdList) throws DataAccessException;

}