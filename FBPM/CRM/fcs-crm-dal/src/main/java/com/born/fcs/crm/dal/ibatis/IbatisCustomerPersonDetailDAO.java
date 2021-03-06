/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.crm.dal.daointerface.CustomerPersonDetailDAO;


// auto generated imports
import com.born.fcs.crm.dal.dataobject.CustomerPersonDetailDO;
import org.springframework.dao.DataAccessException;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.crm.dal.daointerface.CustomerPersonDetailDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_person_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 

public class IbatisCustomerPersonDetailDAO extends SqlMapClientDaoSupport implements CustomerPersonDetailDAO {
	/**
	 *  Insert one <tt>CustomerPersonDetailDO</tt> object to DB table <tt>customer_person_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into customer_person_detail(customer_id,customer_name,customer_name_px,county_code,county_name,citizen_type,nation,birthDay,marital_status,mobile,mobile_bond,email,email_bond,fix,address,origin_place,registered_address,postcode,company,job,technical,customer_job_type,relation,spo_realName,spo_sex,spo_citizen_type,spo_nation,spo_cert_type,spo_cert_no,spo_marital_status,spo_education,spo_birthDay,spo_mobile,spo_email,spo_fix,spo_address,spo_origin_place,spo_registered_address,spo_postcode,spo_company,spo_job,spo_technical,spo_customer_type,total_asset,family_asset,total_loan,total_outcome,bank_account,account_no,account_holder,bank_account_wages,account_no_wages,account_holder_wages,spo_bank_account_wages,spo_account_no_wages,spo_account_holder_wages,house,car,memo,info1,info2,info3,cert_img,cert_img_font,cert_img_back,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param customerPersonDetail
	 *	@return String
	 *	@throws DataAccessException
	 */	 
    public String insert(CustomerPersonDetailDO customerPersonDetail) throws DataAccessException {
    	if (customerPersonDetail == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-CUSTOMER-PERSON-DETAIL-INSERT", customerPersonDetail);

        return customerPersonDetail.getCustomerId();
    }

	/**
	 *  Query DB table <tt>customer_person_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select customer_id, customer_name, customer_name_px, county_code, county_name, citizen_type, nation, birthDay, marital_status, mobile, mobile_bond, email, email_bond, fix, address, origin_place, registered_address, postcode, company, job, technical, customer_job_type, relation, spo_realName, spo_sex, spo_citizen_type, spo_nation, spo_cert_type, spo_cert_no, spo_marital_status, spo_education, spo_birthDay, spo_mobile, spo_email, spo_fix, spo_address, spo_origin_place, spo_registered_address, spo_postcode, spo_company, spo_job, spo_technical, spo_customer_type, total_asset, family_asset, total_loan, total_outcome, bank_account, account_no, account_holder, bank_account_wages, account_no_wages, account_holder_wages, spo_bank_account_wages, spo_account_no_wages, spo_account_holder_wages, house, car, memo, info1, info2, info3, cert_img, cert_img_font, cert_img_back, raw_add_time, raw_update_time from customer_person_detail where (customer_id = ?)</tt>
	 *
	 *	@param customerId
	 *	@return CustomerPersonDetailDO
	 *	@throws DataAccessException
	 */	 
    public CustomerPersonDetailDO findByCustomerId(String customerId) throws DataAccessException {

        return (CustomerPersonDetailDO) getSqlMapClientTemplate().queryForObject("MS-CUSTOMER-PERSON-DETAIL-FIND-BY-CUSTOMER-ID", customerId);

    }

	/**
	 *  Delete records from DB table <tt>customer_person_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_person_detail where (customer_id = ?)</tt>
	 *
	 *	@param customerId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCustomerId(String customerId) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-CUSTOMER-PERSON-DETAIL-DELETE-BY-CUSTOMER-ID", customerId);
    }

	/**
	 *  Update DB table <tt>customer_person_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update customer_person_detail set customer_name=?, customer_name_px=?, county_code=?, county_name=?, citizen_type=?, nation=?, birthDay=?, marital_status=?, mobile=?, mobile_bond=?, email=?, email_bond=?, fix=?, address=?, origin_place=?, registered_address=?, postcode=?, company=?, job=?, technical=?, customer_job_type=?, relation=?, spo_realName=?, spo_sex=?, spo_citizen_type=?, spo_nation=?, spo_cert_type=?, spo_cert_no=?, spo_marital_status=?, spo_education=?, spo_birthDay=?, spo_mobile=?, spo_email=?, spo_fix=?, spo_address=?, spo_origin_place=?, spo_registered_address=?, spo_postcode=?, spo_company=?, spo_job=?, spo_technical=?, spo_customer_type=?, total_asset=?, family_asset=?, total_loan=?, total_outcome=?, bank_account=?, account_no=?, account_holder=?, bank_account_wages=?, account_no_wages=?, account_holder_wages=?, spo_bank_account_wages=?, spo_account_no_wages=?, spo_account_holder_wages=?, house=?, car=?, memo=?, info1=?, info2=?, info3=?, cert_img=?, cert_img_font=?, cert_img_back=? where (customer_id = ?)</tt>
	 *
	 *	@param customerPersonDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByCustomerId(CustomerPersonDetailDO customerPersonDetail) throws DataAccessException {
    	if (customerPersonDetail == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-CUSTOMER-PERSON-DETAIL-UPDATE-BY-CUSTOMER-ID", customerPersonDetail);
    }

}