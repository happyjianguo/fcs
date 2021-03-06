/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FInvestigationCreditSchemePledgeAssetDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationCreditSchemePledgeAssetDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FInvestigationCreditSchemePledgeAssetDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_credit_scheme_pledge_asset.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFInvestigationCreditSchemePledgeAssetDAO extends SqlMapClientDaoSupport implements FInvestigationCreditSchemePledgeAssetDAO {
	/**
	 *  Insert one <tt>FInvestigationCreditSchemePledgeAssetDO</tt> object to DB table <tt>f_investigation_credit_scheme_pledge_asset</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_credit_scheme_pledge_asset(form_id,type,type_desc,assets_id,asset_type,ownership_name,evaluation_price,pledge_rate,syn_position,postposition,debted_amount,asset_remark,remark,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationCreditSchemePledgeAsset
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationCreditSchemePledgeAssetDO FInvestigationCreditSchemePledgeAsset) throws DataAccessException {
    	if (FInvestigationCreditSchemePledgeAsset == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-INVESTIGATION-CREDIT-SCHEME-PLEDGE-ASSET-INSERT", FInvestigationCreditSchemePledgeAsset);

        return FInvestigationCreditSchemePledgeAsset.getId();
    }

	/**
	 *  Update DB table <tt>f_investigation_credit_scheme_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_credit_scheme_pledge_asset set form_id=?, type=?, type_desc=?, assets_id=?, asset_type=?, ownership_name=?, evaluation_price=?, pledge_rate=?, syn_position=?, postposition=?, debted_amount=?, asset_remark=?, remark=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FInvestigationCreditSchemePledgeAsset
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationCreditSchemePledgeAssetDO FInvestigationCreditSchemePledgeAsset) throws DataAccessException {
    	if (FInvestigationCreditSchemePledgeAsset == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-CREDIT-SCHEME-PLEDGE-ASSET-UPDATE", FInvestigationCreditSchemePledgeAsset);
    }

	/**
	 *  Update DB table <tt>f_investigation_credit_scheme_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_credit_scheme_pledge_asset set ownership_name=?, asset_remark=?, evaluation_price=?, pledge_rate=? where (assets_id = ?)</tt>
	 *
	 *	@param FInvestigationCreditSchemePledgeAsset
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByAssertsId(FInvestigationCreditSchemePledgeAssetDO FInvestigationCreditSchemePledgeAsset) throws DataAccessException {
    	if (FInvestigationCreditSchemePledgeAsset == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-CREDIT-SCHEME-PLEDGE-ASSET-UPDATE-BY-ASSERTS-ID", FInvestigationCreditSchemePledgeAsset);
    }

	/**
	 *  Query DB table <tt>f_investigation_credit_scheme_pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_credit_scheme_pledge_asset where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FInvestigationCreditSchemePledgeAssetDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationCreditSchemePledgeAssetDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FInvestigationCreditSchemePledgeAssetDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-CREDIT-SCHEME-PLEDGE-ASSET-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_credit_scheme_pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_credit_scheme_pledge_asset where (form_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param formId
	 *	@return List<FInvestigationCreditSchemePledgeAssetDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationCreditSchemePledgeAssetDO> findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().queryForList("MS-F-INVESTIGATION-CREDIT-SCHEME-PLEDGE-ASSET-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_credit_scheme_pledge_asset</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_credit_scheme_pledge_asset where ((form_id = ?) AND (type = ?)) order by sort_order ASC</tt>
	 *
	 *	@param formId
	 *	@param type
	 *	@return List<FInvestigationCreditSchemePledgeAssetDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationCreditSchemePledgeAssetDO> findByFormIdAndType(long formId, String type) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("type", type);

        return getSqlMapClientTemplate().queryForList("MS-F-INVESTIGATION-CREDIT-SCHEME-PLEDGE-ASSET-FIND-BY-FORM-ID-AND-TYPE", param);

    }

	/**
	 *  Delete records from DB table <tt>f_investigation_credit_scheme_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_credit_scheme_pledge_asset where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-CREDIT-SCHEME-PLEDGE-ASSET-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_credit_scheme_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_credit_scheme_pledge_asset where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-CREDIT-SCHEME-PLEDGE-ASSET-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_credit_scheme_pledge_asset</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_credit_scheme_pledge_asset where ((form_id = ?) AND (type = ?))</tt>
	 *
	 *	@param formId
	 *	@param type
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormIdAndType(long formId, String type) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("type", type);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-CREDIT-SCHEME-PLEDGE-ASSET-DELETE-BY-FORM-ID-AND-TYPE", param);
    }

}