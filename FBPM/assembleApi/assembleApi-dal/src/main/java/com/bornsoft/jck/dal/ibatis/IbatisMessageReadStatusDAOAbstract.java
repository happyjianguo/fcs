/**
 * www.yiji.com Inc.
 * Copyright (c) 2013 All Rights Reserved.
 */
package com.bornsoft.jck.dal.ibatis;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.bornsoft.jck.dal.daointerface.MessageReadStatusDAOAbstract;
import com.bornsoft.jck.dal.dataobject.MessageReadStatusDO;

/**
 * An ibatis based implementation of dao interface <tt>com.bornsoft.jck.dal.daointerface.MessageReadStatusDAO</tt>.
 *
 * This file is generated by <tt>CodeMaker</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>yjh</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>CodeMaker/src/main/resources/templete/dao</tt>, and 
 * find the corresponding configuration file (<tt>daoAbstract.vm</tt>). 
 * Modify the vm file according to your needs, then run <tt>CodeMaker</tt> 
 * to generate this file.
 *
 * @author jlcon@qq.com
 */ 
@SuppressWarnings("deprecation")
public abstract class IbatisMessageReadStatusDAOAbstract extends SqlMapClientDaoSupport implements MessageReadStatusDAOAbstract {

	/**
	 *  Update DB table <tt>message_read_status</tt>.
	 *
	 *	@param messageReadStatus
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(MessageReadStatusDO messageReadStatus) throws DataAccessException {
    	if (messageReadStatus == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}

        return getSqlMapClientTemplate().update("MS-MESSAGE-READ-STATUS-UPDATE", messageReadStatus);
    }

	/**
	 *	@param messageReadStatus
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public java.lang.Long insert(MessageReadStatusDO messageReadStatus) throws DataAccessException {
    	if (messageReadStatus == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-MESSAGE-READ-STATUS-INSERT", messageReadStatus);

        return messageReadStatus.getMId();
    }

	/**
	 *	@param MId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(String MId) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-MESSAGE-READ-STATUS-DELETE-BY-ID", MId);
    }
	
}