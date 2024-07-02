package com.izpan.modules.biz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.izpan.infrastructure.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * 兑换管理 Entity 实体类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.entity.BizRedemptions
 * @CreateTime 2024-07-02 - 12:20:01
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_redemptions")
public class BizRedemptions extends BaseEntity {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 兑换码
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
     * 配额
     */
    private Long quota;

    /**
     * 创建时间
     */
    private Long createdTime;

    /**
     * 兑换时间
     */
    private Long redeemedTime;

    /**
     * 使用用户ID
     */
    private Long usedUserId;

    /**
     * 删除时间
     */
    private LocalDateTime deletedAt;
}