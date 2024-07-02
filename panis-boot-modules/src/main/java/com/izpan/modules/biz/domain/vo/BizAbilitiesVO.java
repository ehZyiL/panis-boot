package com.izpan.modules.biz.domain.vo;

import com.izpan.infrastructure.domain.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 能力管理 VO 展示类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.vo.BizAbilitiesVO
 * @CreateTime 2024-07-02 - 12:19:01
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BizAbilitiesVO", description = "能力管理 VO 对象")
public class BizAbilitiesVO extends BaseVO {

    @Schema(description = "分组")
    private String group;

    @Schema(description = "模型名称")
    private String model;

    @Schema(description = "渠道ID")
    private Long channelId;

    @Schema(description = "是否启用")
    private Boolean enabled;

    @Schema(description = "优先级")
    private Long priority;

    @Schema(description = "权重")
    private Long weight;
}