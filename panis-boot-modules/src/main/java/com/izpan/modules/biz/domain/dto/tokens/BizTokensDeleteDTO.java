package com.izpan.modules.biz.domain.dto.tokens;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 令牌管理 删除 DTO 对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.dto.tokens.BizTokensDeleteDTO
 * @CreateTime 2024-07-02 - 12:20:18
 */

@Getter
@Setter
@Schema(name = "BizTokensDeleteDTO", description = "令牌管理 删除 DTO 对象")
public class BizTokensDeleteDTO implements Serializable {

    @Schema(description = "IDs")
    private List<Long> ids;

}