/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FInternalOpinionExchangeUserDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInternalOpinionExchangeUserDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FInternalOpinionExchangeUserDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_internal_opinion_exchange_user.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFInternalOpinionExchangeUserDAO extends SqlMapClientDaoSupport implements FInternalOpinionExchangeUserDAO {
	/**
	 *  Insert one <tt>FInternalOpinionExchangeUserDO</tt> object to DB table <tt>f_internal_opinion_exchange_user</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_internal_opinion_exchange_user(id,form_id,user_id,user_account,user_name,user_mobile,user_email,ex_type,feedback_time,feedback,is_notified,is_principal,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInternalOpinionExchangeUser
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInternalOpinionExchangeUserDO FInternalOpinionExchangeUser) throws DataAccessException {
    	if (FInternalOpinionExchangeUser == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-INTERNAL-OPINION-EXCHANGE-USER-INSERT", FInternalOpinionExchangeUser);

        return FInternalOpinionExchangeUser.getId();
    }

	/**
	 *  Update DB table <tt>f_internal_opinion_exchange_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_internal_opinion_exchange_user set form_id=?, user_id=?, user_account=?, user_name=?, user_mobile=?, user_email=?, ex_type=?, feedback_time=?, feedback=?, is_notified=?, is_principal=? where (id = ?)</tt>
	 *
	 *	@param FInternalOpinionExchangeUser
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInternalOpinionExchangeUserDO FInternalOpinionExchangeUser) throws DataAccessException {
    	if (FInternalOpinionExchangeUser == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INTERNAL-OPINION-EXCHANGE-USER-UPDATE", FInternalOpinionExchangeUser);
    }

	/**
	 *  Query DB table <tt>f_internal_opinion_exchange_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_internal_opinion_exchange_user where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FInternalOpinionExchangeUserDO
	 *	@throws DataAccessException
	 */	 
    public FInternalOpinionExchangeUserDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FInternalOpinionExchangeUserDO) getSqlMapClientTemplate().queryForObject("MS-F-INTERNAL-OPINION-EXCHANGE-USER-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_internal_opinion_exchange_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_internal_opinion_exchange_user where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return List<FInternalOpinionExchangeUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInternalOpinionExchangeUserDO> findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().queryForList("MS-F-INTERNAL-OPINION-EXCHANGE-USER-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_internal_opinion_exchange_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_internal_opinion_exchange_user where ((form_id = ?) AND (user_id = ?))</tt>
	 *
	 *	@param formId
	 *	@param userId
	 *	@return List<FInternalOpinionExchangeUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInternalOpinionExchangeUserDO> findByFormIdAndUser(long formId, long userId) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("userId", new Long(userId));

        return getSqlMapClientTemplate().queryForList("MS-F-INTERNAL-OPINION-EXCHANGE-USER-FIND-BY-FORM-ID-AND-USER", param);

    }

	/**
	 *  Query DB table <tt>f_internal_opinion_exchange_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_internal_opinion_exchange_user</tt>
	 *
	 *	@param limit
	 *	@param beforeDays
	 *	@return List<FInternalOpinionExchangeUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInternalOpinionExchangeUserDO> findNeedNofity(long limit, int beforeDays) throws DataAccessException {
        Map param = new HashMap();

        param.put("limit", new Long(limit));
        param.put("beforeDays", new Integer(beforeDays));

        return getSqlMapClientTemplate().queryForList("MS-F-INTERNAL-OPINION-EXCHANGE-USER-FIND-NEED-NOFITY", param);

    }

	/**
	 *  Delete records from DB table <tt>f_internal_opinion_exchange_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_internal_opinion_exchange_user where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-INTERNAL-OPINION-EXCHANGE-USER-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_internal_opinion_exchange_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_internal_opinion_exchange_user where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-INTERNAL-OPINION-EXCHANGE-USER-DELETE-BY-ID", param);
    }

}