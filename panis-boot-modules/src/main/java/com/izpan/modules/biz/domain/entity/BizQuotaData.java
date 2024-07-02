package com.izpan.modules.biz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.izpan.infrastructure.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 配额数据管理 Entity 实体类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.entity.BizQuotaData
 * @CreateTime 2024-07-02 - 12:19:52
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_quota_data")
public class BizQuotaData extends BaseEntity {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 模型名称
     */
    private String modelName;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 已用量
     */
    private Long tokenUsed;

    /**
     * 请求数量
     */
    private Long count;

    /**
     * 配额
     */
    private Long quota;
}