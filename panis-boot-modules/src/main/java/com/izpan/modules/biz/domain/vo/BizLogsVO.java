package com.izpan.modules.biz.domain.vo;

import com.izpan.infrastructure.domain.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 日志管理 VO 展示类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.vo.BizLogsVO
 * @CreateTime 2024-07-02 - 12:19:18
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BizLogsVO", description = "日志管理 VO 对象")
public class BizLogsVO extends BaseVO {

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "创建时间")
    private Long createdAt;

    @Schema(description = "日志类型")
    private Long type;

    @Schema(description = "内容")
    private String content;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "令牌名称")
    private String tokenName;

    @Schema(description = "模型名称")
    private String modelName;

    @Schema(description = "配额")
    private Long quota;

    @Schema(description = "提示令牌数")
    private Long promptTokens;

    @Schema(description = "完成令牌数")
    private Long completionTokens;

    @Schema(description = "使用时间")
    private Long useTime;

    @Schema(description = "是否为流式")
    private Boolean isStream;

    @Schema(description = "渠道ID")
    private Long channelId;

    @Schema(description = "令牌ID")
    private Long tokenId;

    @Schema(description = "其他")
    private String other;
}