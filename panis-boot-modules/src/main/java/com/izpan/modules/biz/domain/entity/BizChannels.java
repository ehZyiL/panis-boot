package com.izpan.modules.biz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.izpan.infrastructure.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 业务渠道管理 Entity 实体类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.entity.BizChannels
 * @CreateTime 2024-07-02 - 12:19:10
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_channels")
public class BizChannels extends BaseEntity {

    /**
     * 类型
     */
    private Long type;

    /**
     * 密钥
     */
    private String key;

    /**
     * OpenAI组织
     */
    private String openAiOrganization;

    /**
     * 测试模型
     */
    private String testModel;

    /**
     * 状态
     */
    private Long status;

    /**
     * 名称
     */
    private String name;

    /**
     * 权重
     */
    private Long weight;

    /**
     * 创建时间
     */
    private Long createdTime;

    /**
     * 测试时间
     */
    private Long testTime;

    /**
     * 响应时间
     */
    private Long responseTime;

    /**
     * 基础URL
     */
    private String baseUrl;

    /**
     * 其他
     */
    private String other;

    /**
     * 余额
     */
    private Double balance;

    /**
     * 余额更新时间
     */
    private Long balanceUpdatedTime;

    /**
     * 模型
     */
    private String models;

    /**
     * 分组
     */
    private String group;

    /**
     * 已用配额
     */
    private Long usedQuota;

    /**
     * 模型映射
     */
    private String modelMapping;

    /**
     * 状态码映射
     */
    private String statusCodeMapping;

    /**
     * 优先级
     */
    private Long priority;

    /**
     * 自动禁用
     */
    private Long autoBan;

    /**
     * 其他信息
     */
    private String otherInfo;
}