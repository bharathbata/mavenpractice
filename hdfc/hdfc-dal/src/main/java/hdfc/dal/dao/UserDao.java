/*
 * 作者：钟勋 (email:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2022-11-02 15:41 创建
 */
package hdfc.dal.dao;

import hdfc.dal.entity.User;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * 用户Dao
 */
@RepositoryDefinition(domainClass = User.class, idClass = Long.class)
public interface UserDao {

    User findByUserId(String userId);
}
