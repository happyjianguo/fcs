/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectChannelRelationDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectChannelRelationDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectChannelRelationDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_channel_relation.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisProjectChannelRelationDAO extends SqlMapClientDaoSupport implements ProjectChannelRelationDAO {
	/**
	 *  Insert one <tt>ProjectChannelRelationDO</tt> object to DB table <tt>project_channel_relation</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_channel_relation(id,biz_no,phases,project_code,busi_type,busi_type_name,channel_relation,channel_id,channel_code,channel_type,channel_name,sub_channel_id,sub_channel_code,sub_channel_type,sub_channel_name,contract_amount,liquidity_loans_amount,financial_amount,acceptance_bill_amount,credit_amount,loaned_amount,loan_liquidity_loans_amount,loan_financial_amount,loan_acceptance_bill_amount,loan_credit_amount,used_amount,comp_amount,comp_liquidity_loans_amount,comp_financial_amount,comp_acceptance_bill_amount,comp_credit_amount,releasable_amount,released_amount,release_liquidity_loans_amount,release_financial_amount,release_acceptance_bill_amount,release_credit_amount,repayed_amount,in_amount,new_customer,new_project,in_cutomer,in_project,latest,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectChannelRelation
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectChannelRelationDO projectChannelRelation) throws DataAccessException {
    	if (projectChannelRelation == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-CHANNEL-RELATION-INSERT", projectChannelRelation);

        return projectChannelRelation.getId();
    }

	/**
	 *  Update DB table <tt>project_channel_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_channel_relation set biz_no=?, phases=?, project_code=?, busi_type=?, busi_type_name=?, channel_relation=?, channel_id=?, channel_code=?, channel_type=?, channel_name=?, sub_channel_id=?, sub_channel_code=?, sub_channel_type=?, sub_channel_name=?, contract_amount=?, liquidity_loans_amount=?, financial_amount=?, acceptance_bill_amount=?, credit_amount=?, loaned_amount=?, loan_liquidity_loans_amount=?, loan_financial_amount=?, loan_acceptance_bill_amount=?, loan_credit_amount=?, used_amount=?, comp_amount=?, comp_liquidity_loans_amount=?, comp_financial_amount=?, comp_acceptance_bill_amount=?, comp_credit_amount=?, releasable_amount=?, released_amount=?, release_liquidity_loans_amount=?, release_financial_amount=?, release_acceptance_bill_amount=?, release_credit_amount=?, repayed_amount=?, in_amount=?, new_customer=?, new_project=?, in_cutomer=?, in_project=?, latest=? where (id = ?)</tt>
	 *
	 *	@param projectChannelRelation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectChannelRelationDO projectChannelRelation) throws DataAccessException {
    	if (projectChannelRelation == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-CHANNEL-RELATION-UPDATE", projectChannelRelation);
    }

	/**
	 *  Update DB table <tt>project_channel_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_channel_relation set latest='NO' where ((project_code = ?) AND (channel_relation = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param channelRelation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateVersion(String projectCode, String channelRelation) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("channelRelation", channelRelation);

        return getSqlMapClientTemplate().update("MS-PROJECT-CHANNEL-RELATION-UPDATE-VERSION", param);
    }

	/**
	 *  Query DB table <tt>project_channel_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_channel_relation where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectChannelRelationDO
	 *	@throws DataAccessException
	 */	 
    public ProjectChannelRelationDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (ProjectChannelRelationDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-CHANNEL-RELATION-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_channel_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_channel_relation where (biz_no = ?)</tt>
	 *
	 *	@param bizNo
	 *	@return List<ProjectChannelRelationDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectChannelRelationDO> findByBizNo(String bizNo) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-CHANNEL-RELATION-FIND-BY-BIZ-NO", bizNo);

    }

	/**
	 *  Query DB table <tt>project_channel_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_channel_relation where (latest = 'YES') order by project_code ASC</tt>
	 *
	 *	@return List<ProjectChannelRelationDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectChannelRelationDO> findAll() throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-CHANNEL-RELATION-FIND-ALL", null);

    }

	/**
	 *  Query DB table <tt>project_channel_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_channel_relation where ((biz_no = ?) AND (channel_relation = ?))</tt>
	 *
	 *	@param bizNo
	 *	@param channelRelation
	 *	@return List<ProjectChannelRelationDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectChannelRelationDO> findByBizNoAndType(String bizNo, String channelRelation) throws DataAccessException {
        Map param = new HashMap();

        param.put("bizNo", bizNo);
        param.put("channelRelation", channelRelation);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-CHANNEL-RELATION-FIND-BY-BIZ-NO-AND-TYPE", param);

    }

	/**
	 *  Query DB table <tt>project_channel_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_channel_relation where ((project_code = ?) AND (channel_relation = ?) AND (latest = 'YES'))</tt>
	 *
	 *	@param projectCode
	 *	@param channelRelation
	 *	@return List<ProjectChannelRelationDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectChannelRelationDO> findByProjectlatest(String projectCode, String channelRelation) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("channelRelation", channelRelation);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-CHANNEL-RELATION-FIND-BY-PROJECTLATEST", param);

    }

	/**
	 *  Delete records from DB table <tt>project_channel_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_channel_relation where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PROJECT-CHANNEL-RELATION-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>project_channel_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_channel_relation where (biz_no = ?)</tt>
	 *
	 *	@param bizNo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByBizNo(String bizNo) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-PROJECT-CHANNEL-RELATION-DELETE-BY-BIZ-NO", bizNo);
    }

	/**
	 *  Delete records from DB table <tt>project_channel_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_channel_relation where ((biz_no = ?) AND (channel_relation = ?))</tt>
	 *
	 *	@param bizNo
	 *	@param channelRelation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByBizNoAndType(String bizNo, String channelRelation) throws DataAccessException {
        Map param = new HashMap();

        param.put("bizNo", bizNo);
        param.put("channelRelation", channelRelation);

        return getSqlMapClientTemplate().delete("MS-PROJECT-CHANNEL-RELATION-DELETE-BY-BIZ-NO-AND-TYPE", param);
    }

	/**
	 *  Query DB table <tt>project_channel_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_channel_relation where (1 = 1)</tt>
	 *
	 *	@param projectChannelRelation
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectChannelRelationDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectChannelRelationDO> findByCondition(ProjectChannelRelationDO projectChannelRelation, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (projectChannelRelation == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectChannelRelation", projectChannelRelation);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-CHANNEL-RELATION-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>project_channel_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_channel_relation where (1 = 1)</tt>
	 *
	 *	@param projectChannelRelation
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectChannelRelationDO projectChannelRelation) throws DataAccessException {
    	if (projectChannelRelation == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PROJECT-CHANNEL-RELATION-FIND-BY-CONDITION-COUNT", projectChannelRelation);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}