package com.izpan.modules.biz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.izpan.infrastructure.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * 令牌管理 Entity 实体类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.entity.BizTokens
 * @CreateTime 2024-07-02 - 12:20:18
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_tokens")
public class BizTokens extends BaseEntity {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 密钥
     */
    private String key;

    /**
     * 状态
     */
    private Long status;

    /**
     * 名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Long createdTime;

    /**
     * 访问时间
     */
    private Long accessedTime;

    /**
     * 过期时间
     */
    private Long expiredTime;

    /**
     * 剩余配额
     */
    private Long remainQuota;

    /**
     * 无限配额
     */
    private Boolean unlimitedQuota;

    /**
     * 模型限制启用
     */
    private Boolean modelLimitsEnabled;

    /**
     * 模型限制
     */
    private String modelLimits;

    /**
     * 已用配额
     */
    private Long usedQuota;

    /**
     * 删除时间
     */
    private LocalDateTime deletedAt;
}