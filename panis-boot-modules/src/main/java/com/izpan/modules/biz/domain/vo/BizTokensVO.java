package com.izpan.modules.biz.domain.vo;

import com.izpan.infrastructure.domain.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * 令牌管理 VO 展示类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.vo.BizTokensVO
 * @CreateTime 2024-07-02 - 12:20:18
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BizTokensVO", description = "令牌管理 VO 对象")
public class BizTokensVO extends BaseVO {

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "密钥")
    private String key;

    @Schema(description = "状态")
    private Long status;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "创建时间")
    private Long createdTime;

    @Schema(description = "访问时间")
    private Long accessedTime;

    @Schema(description = "过期时间")
    private Long expiredTime;

    @Schema(description = "剩余配额")
    private Long remainQuota;

    @Schema(description = "无限配额")
    private Boolean unlimitedQuota;

    @Schema(description = "模型限制启用")
    private Boolean modelLimitsEnabled;

    @Schema(description = "模型限制")
    private String modelLimits;

    @Schema(description = "已用配额")
    private Long usedQuota;

    @Schema(description = "删除时间")
    private LocalDateTime deletedAt;
}