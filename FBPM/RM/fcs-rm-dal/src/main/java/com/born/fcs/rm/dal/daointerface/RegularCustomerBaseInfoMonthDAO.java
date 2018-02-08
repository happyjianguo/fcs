/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.daointerface;

// auto generated imports
import com.born.fcs.rm.dal.dataobject.RegularCustomerBaseInfoMonthDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>regular_customer_base_info_month</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/regular_customer_base_info_month.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface RegularCustomerBaseInfoMonthDAO {
	/**
	 *  Insert one <tt>RegularCustomerBaseInfoMonthDO</tt> object to DB table <tt>regular_customer_base_info_month</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into regular_customer_base_info_month(report_date,report_year,report_month,customer_id,customer_name,customer_type,busi_license_no,industry_code,industry_name,industry_big_code,industry_big_name,industry_medium_code,industry_medium_name,country_code,country_name,province_code,province_name,city_code,city_name,county_code,county_name,address,register_capital,money_type,register_date,enterprise_type,staff_num,scale,first_add_date,is_local_gov_platform,is_export_oriented_economy,is_new,is_insurance,balance,occur_amount,release_amount,total_asset,net_asset,asset_liability_ratio,income,profit,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param regularCustomerBaseInfoMonth
	 *	@return String
	 *	@throws DataAccessException
	 */	 
    public String insert(RegularCustomerBaseInfoMonthDO regularCustomerBaseInfoMonth) throws DataAccessException;

	/**
	 *  Update DB table <tt>regular_customer_base_info_month</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update regular_customer_base_info_month set report_year=?, report_month=?, customer_name=?, customer_type=?, busi_license_no=?, industry_code=?, industry_name=?, industry_big_code=?, industry_big_name=?, industry_medium_code=?, industry_medium_name=?, country_code=?, country_name=?, province_code=?, province_name=?, city_code=?, city_name=?, county_code=?, county_name=?, address=?, register_capital=?, money_type=?, register_date=?, enterprise_type=?, staff_num=?, scale=?, first_add_date=?, is_local_gov_platform=?, is_export_oriented_economy=?, is_new=?, is_insurance=?, balance=?, occur_amount=?, release_amount=?, total_asset=?, net_asset=?, asset_liability_ratio=?, income=?, profit=? where ((report_date = ?) AND (customer_id = ?))</tt>
	 *
	 *	@param regularCustomerBaseInfoMonth
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(RegularCustomerBaseInfoMonthDO regularCustomerBaseInfoMonth) throws DataAccessException;

	/**
	 *  Query DB table <tt>regular_customer_base_info_month</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from regular_customer_base_info_month where ((report_date = ?) AND (customer_id = ?))</tt>
	 *
	 *	@param reportDate
	 *	@param customerId
	 *	@return RegularCustomerBaseInfoMonthDO
	 *	@throws DataAccessException
	 */	 
    public RegularCustomerBaseInfoMonthDO findByPrimary(String reportDate, long customerId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>regular_customer_base_info_month</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from regular_customer_base_info_month where (report_date = ?)</tt>
	 *
	 *	@param reportDate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByReportDate(String reportDate) throws DataAccessException;

}