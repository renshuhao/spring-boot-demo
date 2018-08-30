/*
 * Powered By [cfth]
 * Web Site: 财富天湖
 * Since 2018 - 2018
 */

package com.wealthlake.sb_demo.core.service;

import com.wealthlake.sb_demo.common.core.service.BaseService;
import com.wealthlake.sb_demo.common.dataaccess.mysql.config.FilterRule;
import com.wealthlake.sb_demo.common.dataaccess.mysql.config.PageQuery;
import com.wealthlake.sb_demo.dataaccess.domain.UserDO;

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

public interface UserService extends BaseService {

    /**
     * 新增一条数据
     *
     * @param userDO
     * @return
     */
    Integer save(UserDO userDO);

    /**
     * 更新一条数据
     *
     * @param userDO
     * @return
     */
    int update(UserDO userDO);

    /**
     * 删除一条数据
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据id查找一条数据
     *
     * @param id
     * @return
     */
    UserDO findById(Integer id);

    /**
     * 查找所有
     *
     * @return
     */
    List<UserDO> findAll(List<FilterRule> filterRules);

    /**
     * 删除所有
     *
     * @return
     */
    void deleteAll(List<FilterRule> filterRules);

    /**
     * 分页查找
     *
     * @param filterRules
     * @param pageQuery
     * @return
     */
    List<UserDO> findByPage(List<FilterRule> filterRules, PageQuery pageQuery);

    /**
     * 获取个数
     *
     * @param filterRules
     * @return
     */
    Integer getTotalCount(List<FilterRule> filterRules);


}
