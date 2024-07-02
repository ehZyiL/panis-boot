package com.izpan.modules.biz.domain.dto.redemptions;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 兑换管理 删除 DTO 对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.dto.redemptions.BizRedemptionsDeleteDTO
 * @CreateTime 2024-07-02 - 12:20:01
 */

@Getter
@Setter
@Schema(name = "BizRedemptionsDeleteDTO", description = "兑换管理 删除 DTO 对象")
public class BizRedemptionsDeleteDTO implements Serializable {

    @Schema(description = "IDs")
    private List<Long> ids;

}