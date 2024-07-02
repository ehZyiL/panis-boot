package com.izpan.modules.system.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.izpan.infrastructure.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.time.LocalDateTime;

/**
 * 用户管理 Entity 实体类
 *
 * @Author payne.zhuang <paynezhuang@gmail.com>
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.system.domain.entity.SysUser
 * @CreateTime 2023/7/6 - 15:55
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_user")
public class SysUser extends BaseEntity {

    @Serial
    private static final long serialVersionUID = -8785649008167413252L;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * GitHub ID
     */
    private String githubId;

    /**
     * 微信ID
     */
    private String wechatId;

    /**
     * Telegram ID
     */
    private String telegramId;

    /**
     * 访问令牌
     */
    private String accessToken;

    /**
     * 配额
     */
    private Long quota;

    /**
     * 已用配额
     */
    private Long usedQuota;

    /**
     * 请求数量
     */
    private Long requestCount;

    /**
     * 分组
     */
    private String group;

    /**
     * 邀请码
     */
    private String affCode;

    /**
     * 邀请数量
     */
    private Long affCount;

    /**
     * 邀请配额
     */
    private Long affQuota;

    /**
     * 邀请历史
     */
    private Long affHistory;

    /**
     * 邀请人ID
     */
    private Long inviterId;

    /**
     * MD5的盐值
     */
    private String salt;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 修改密码时间
     */
    private LocalDateTime updatePasswordTime;

    /**
     * 是否启用(0:禁用,1:启用)
     */
    private String status;
}
