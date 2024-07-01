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
 * @ClassName com.izpan.modules.biz.domain.entity.BizAbilities
 * @CreateTime 2024-07-01 - 22:02:52
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_abilities")
public class BizAbilities extends BaseEntity {

    private String group;

    private String model;

    private Long channelId;

    private Boolean enabled;

    private Long priority;

    private Long weight;
}