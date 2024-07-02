package com.izpan.modules.biz.domain.vo;

import com.izpan.infrastructure.domain.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * 兑换管理 VO 展示类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.vo.BizRedemptionsVO
 * @CreateTime 2024-07-02 - 12:20:01
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BizRedemptionsVO", description = "兑换管理 VO 对象")
public class BizRedemptionsVO extends BaseVO {

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "兑换码")
    private String key;

    @Schema(description = "状态")
    private Long status;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "配额")
    private Long quota;

    @Schema(description = "创建时间")
    private Long createdTime;

    @Schema(description = "兑换时间")
    private Long redeemedTime;

    @Schema(description = "使用用户ID")
    private Long usedUserId;

    @Schema(description = "删除时间")
    private LocalDateTime deletedAt;
}