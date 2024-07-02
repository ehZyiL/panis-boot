package com.izpan.modules.biz.domain.vo;

import com.izpan.infrastructure.domain.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * 配额数据管理 VO 展示类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.vo.BizQuotaDataVO
 * @CreateTime 2024-07-02 - 12:19:52
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BizQuotaDataVO", description = "配额数据管理 VO 对象")
public class BizQuotaDataVO extends BaseVO {

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "模型名称")
    private String modelName;

    @Schema(description = "创建时间")
    private Long createdAt;

    @Schema(description = "已用量")
    private Long tokenUsed;

    @Schema(description = "请求数量")
    private Long count;

    @Schema(description = "配额")
    private Long quota;
}