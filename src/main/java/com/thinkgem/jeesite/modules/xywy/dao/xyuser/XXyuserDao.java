/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.xywy.dao.xyuser;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.xywy.entity.xyuser.XXyuser;

/**
 * 用户基本信息DAO接口
 * @author zyb
 * @version 2018-04-03
 */
@MyBatisDao
public interface XXyuserDao extends CrudDao<XXyuser> {
	
}