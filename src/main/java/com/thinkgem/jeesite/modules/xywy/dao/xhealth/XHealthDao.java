/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.dao.xhealth;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.xywy.entity.xhealth.XHealth;

/**
 * 用户APP上一键测量记录DAO接口
 * @author zyb
 * @version 2018-04-03
 */
@MyBatisDao
public interface XHealthDao extends CrudDao<XHealth> {
	
}