package com.izpan.modules.biz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.izpan.infrastructure.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Entity 实体类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.entity.BizQuotaData
 * @CreateTime 2024-07-01 - 22:02:37
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_quota_data")
public class BizQuotaData extends BaseEntity {

    private Long userId;

    private String username;

    private String modelName;

    private Long createdAt;

    private Long tokenUsed;

    private Long count;

    private Long quota;
}