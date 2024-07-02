package com.izpan.modules.biz.domain.vo;

import com.izpan.infrastructure.domain.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 业务渠道管理 VO 展示类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.vo.BizChannelsVO
 * @CreateTime 2024-07-02 - 12:19:10
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BizChannelsVO", description = "业务渠道管理 VO 对象")
public class BizChannelsVO extends BaseVO {

    @Schema(description = "类型")
    private Long type;

    @Schema(description = "密钥")
    private String key;

    @Schema(description = "OpenAI组织")
    private String openAiOrganization;

    @Schema(description = "测试模型")
    private String testModel;

    @Schema(description = "状态")
    private Long status;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "权重")
    private Long weight;

    @Schema(description = "创建时间")
    private Long createdTime;

    @Schema(description = "测试时间")
    private Long testTime;

    @Schema(description = "响应时间")
    private Long responseTime;

    @Schema(description = "基础URL")
    private String baseUrl;

    @Schema(description = "其他")
    private String other;

    @Schema(description = "余额")
    private Double balance;

    @Schema(description = "余额更新时间")
    private Long balanceUpdatedTime;

    @Schema(description = "模型")
    private String models;

    @Schema(description = "分组")
    private String group;

    @Schema(description = "已用配额")
    private Long usedQuota;

    @Schema(description = "模型映射")
    private String modelMapping;

    @Schema(description = "状态码映射")
    private String statusCodeMapping;

    @Schema(description = "优先级")
    private Long priority;

    @Schema(description = "自动禁用")
    private Long autoBan;

    @Schema(description = "其他信息")
    private String otherInfo;
}