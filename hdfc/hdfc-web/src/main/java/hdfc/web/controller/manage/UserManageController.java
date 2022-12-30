/*
 * 作者：钟勋 (email:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2022-11-02 15:54 创建
 */
package hdfc.web.controller.manage;

import lombok.AllArgsConstructor;
import hdfc.facade.api.UserService;
import hdfc.facade.order.FindUserOrder;
import hdfc.facade.result.FindUserResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理Controller
 */
@RestController
@RequestMapping("/manage/user")
@AllArgsConstructor
public class UserManageController {
    // 用户服务
    private final UserService userService;

    /**
     * 查询用户
     *
     * @param userId 用户ID
     */
    @RequestMapping("/findUser")
    public FindUserResult findUser(String userId) {
        FindUserOrder order = new FindUserOrder();
        order.setUserId(userId);

        return userService.findUser(order);
    }
}
