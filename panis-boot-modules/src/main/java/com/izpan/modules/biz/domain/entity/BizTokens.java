package com.izpan.modules.biz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.izpan.infrastructure.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Entity 实体类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.entity.BizTokens
 * @CreateTime 2024-07-01 - 22:03:03
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_tokens")
public class BizTokens extends BaseEntity {

    private Long userId;

    private String key;

    private Long status;

    private String name;

    private Long createdTime;

    private Long accessedTime;

    private Long expiredTime;

    private Long remainQuota;

    private Boolean unlimitedQuota;

    private Boolean modelLimitsEnabled;

    private String modelLimits;

    private Long usedQuota;

    private LocalDateTime deletedAt;
}