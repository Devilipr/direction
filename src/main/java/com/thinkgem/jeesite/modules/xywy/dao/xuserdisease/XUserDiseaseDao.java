/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.dao.xuserdisease;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.xywy.entity.xuserdisease.XUserDisease;

/**
 * 用户健康履历DAO接口
 * @author zyb
 * @version 2018-04-03
 */
@MyBatisDao
public interface XUserDiseaseDao extends CrudDao<XUserDisease> {
	
}