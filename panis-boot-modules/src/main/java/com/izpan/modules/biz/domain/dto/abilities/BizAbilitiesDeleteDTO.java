package com.izpan.modules.biz.domain.dto.abilities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 能力管理 删除 DTO 对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.dto.abilities.BizAbilitiesDeleteDTO
 * @CreateTime 2024-07-02 - 12:19:01
 */

@Getter
@Setter
@Schema(name = "BizAbilitiesDeleteDTO", description = "能力管理 删除 DTO 对象")
public class BizAbilitiesDeleteDTO implements Serializable {

    @Schema(description = "IDs")
    private List<Long> ids;

}