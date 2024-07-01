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
 * @ClassName com.izpan.modules.biz.domain.entity.BizChannels
 * @CreateTime 2024-07-01 - 22:02:12
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_channels")
public class BizChannels extends BaseEntity {

    private Long type;

    private String key;

    private String openAiOrganization;

    private String testModel;

    private Long status;

    private String name;

    private Long weight;

    private Long createdTime;

    private Long testTime;

    private Long responseTime;

    private String baseUrl;

    private String other;

    private Double balance;

    private Long balanceUpdatedTime;

    private String models;

    private String group;

    private Long usedQuota;

    private String modelMapping;

    private String statusCodeMapping;

    private Long priority;

    private Long autoBan;

    private String otherInfo;
}