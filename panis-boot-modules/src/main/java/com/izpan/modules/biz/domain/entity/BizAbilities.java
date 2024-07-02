package com.izpan.modules.biz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.izpan.infrastructure.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 能力管理 Entity 实体类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.entity.BizAbilities
 * @CreateTime 2024-07-02 - 12:19:01
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_abilities")
public class BizAbilities extends BaseEntity {

    /**
     * 分组
     */
    private String group;

    /**
     * 模型名称
     */
    private String model;

    /**
     * 渠道ID
     */
    private Long channelId;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 优先级
     */
    private Long priority;

    /**
     * 权重
     */
    private Long weight;
}