package com.izpan.modules.biz.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.izpan.infrastructure.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 日志管理 Entity 实体类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.entity.BizLogs
 * @CreateTime 2024-07-02 - 12:19:18
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@TableName("biz_logs")
public class BizLogs extends BaseEntity {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Long createdAt;

    /**
     * 日志类型
     */
    private Long type;

    /**
     * 内容
     */
    private String content;

    /**
     * 用户名
     */
    private String username;

    /**
     * 令牌名称
     */
    private String tokenName;

    /**
     * 模型名称
     */
    private String modelName;

    /**
     * 配额
     */
    private Long quota;

    /**
     * 提示令牌数
     */
    private Long promptTokens;

    /**
     * 完成令牌数
     */
    private Long completionTokens;

    /**
     * 使用时间
     */
    private Long useTime;

    /**
     * 是否为流式
     */
    private Boolean isStream;

    /**
     * 渠道ID
     */
    private Long channelId;

    /**
     * 令牌ID
     */
    private Long tokenId;

    /**
     * 其他
     */
    private String other;
}