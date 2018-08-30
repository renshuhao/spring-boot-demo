/*
 * Powered By [cfth]
 * Web Site: 财富天湖
 * Since 2018 - 2018
 */

package com.wealthlake.sb_demo.core.service.impl;

import com.wealthlake.sb_demo.common.core.service.impl.BaseServiceImpl;
import com.wealthlake.sb_demo.common.dataaccess.mysql.config.FilterRule;
import com.wealthlake.sb_demo.common.dataaccess.mysql.config.PageQuery;
import com.wealthlake.sb_demo.core.service.UserService;
import com.wealthlake.sb_demo.dataaccess.dao.mysql.UserMysqlDAO;
import com.wealthlake.sb_demo.dataaccess.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>Title:  </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018 </p>
 * <p>Company: cfth </p>
 *
 * @author xxx
 * @version 1.0
 * @date 2018/06/22
 * @since 1.0
 */

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements UserService {

    @Autowired
    private UserMysqlDAO userMysqlDAO;

    @Override
    public Integer save(UserDO userDO) {
        if (userDO == null) {
            return 0;
        }
        return userMysqlDAO.save(userDO);
    }

    @Override
    public int update(UserDO userDO) {
        if (userDO == null) {
            return 0;
        }
        return userMysqlDAO.update(userDO);
    }

    @Override
    public void delete(Integer id) {
        userMysqlDAO.delete(id);
    }

    @Override
    public UserDO findById(Integer id) {
        return userMysqlDAO.findById(id);
    }

    @Override
    public List<UserDO> findAll(List<FilterRule> filterRules) {
        return userMysqlDAO.findAll(filterRules);
    }

    @Override
    public void deleteAll(List<FilterRule> filterRules) {
        userMysqlDAO.deleteAll(filterRules);
    }

    @Override
    public List<UserDO> findByPage(List<FilterRule> filterRules, PageQuery pageQuery) {
        return userMysqlDAO.findByPage(filterRules, pageQuery);
    }

    @Override
    public Integer getTotalCount(List<FilterRule> filterRules) {
        return userMysqlDAO.getTotalCount(filterRules);
    }


}
