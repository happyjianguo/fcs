/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.rm.dal.daointerface.RegularProjectStoreInfoMonthDAO;


// auto generated imports
import com.born.fcs.rm.dal.dataobject.RegularProjectStoreInfoMonthDO;
import org.springframework.dao.DataAccessException;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.rm.dal.daointerface.RegularProjectStoreInfoMonthDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/regular_project_store_info_month.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("rawtypes") 
public class IbatisRegularProjectStoreInfoMonthDAO extends SqlMapClientDaoSupport implements RegularProjectStoreInfoMonthDAO {
	/**
	 *  Insert one <tt>RegularProjectStoreInfoMonthDO</tt> object to DB table <tt>regular_project_store_info_month</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into regular_project_store_info_month(report_date,report_year,report_month,customer_id,customer_name,busi_license_no,project_code,project_name,amount,fee_rate,fee_type,fee_describe,time_limit,time_unit,month_num,progress,conucil_finish_date,council_type,full_sign,contract_status,credit_status,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param regularProjectStoreInfoMonth
	 *	@return String
	 *	@throws DataAccessException
	 */	 
    public String insert(RegularProjectStoreInfoMonthDO regularProjectStoreInfoMonth) throws DataAccessException {
    	if (regularProjectStoreInfoMonth == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-REGULAR-PROJECT-STORE-INFO-MONTH-INSERT", regularProjectStoreInfoMonth);

        return regularProjectStoreInfoMonth.getReportDate();
    }

	/**
	 *  Update DB table <tt>regular_project_store_info_month</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update regular_project_store_info_month set report_year=?, report_month=?, customer_id=?, customer_name=?, busi_license_no=?, project_name=?, amount=?, fee_rate=?, fee_type=?, fee_describe=?, time_limit=?, time_unit=?, month_num=?, progress=?, conucil_finish_date=?, council_type=?, full_sign=?, contract_status=?, credit_status=? where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param regularProjectStoreInfoMonth
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(RegularProjectStoreInfoMonthDO regularProjectStoreInfoMonth) throws DataAccessException {
    	if (regularProjectStoreInfoMonth == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-REGULAR-PROJECT-STORE-INFO-MONTH-UPDATE", regularProjectStoreInfoMonth);
    }

	/**
	 *  Query DB table <tt>regular_project_store_info_month</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from regular_project_store_info_month where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param reportDate
	 *	@param projectCode
	 *	@return RegularProjectStoreInfoMonthDO
	 *	@throws DataAccessException
	 */	 
    public RegularProjectStoreInfoMonthDO findByPrimary(String reportDate, String projectCode) throws DataAccessException {
        Map param = new HashMap();

        param.put("reportDate", reportDate);
        param.put("projectCode", projectCode);

        return (RegularProjectStoreInfoMonthDO) getSqlMapClientTemplate().queryForObject("MS-REGULAR-PROJECT-STORE-INFO-MONTH-FIND-BY-PRIMARY", param);

    }

	/**
	 *  Delete records from DB table <tt>regular_project_store_info_month</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from regular_project_store_info_month where (report_date = ?)</tt>
	 *
	 *	@param reportDate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByReportDate(String reportDate) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-REGULAR-PROJECT-STORE-INFO-MONTH-DELETE-BY-REPORT-DATE", reportDate);
    }

}