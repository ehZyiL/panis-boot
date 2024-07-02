package com.izpan.modules.biz.domain.dto.channels;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 业务渠道管理 删除 DTO 对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.dto.channels.BizChannelsDeleteDTO
 * @CreateTime 2024-07-02 - 12:19:10
 */

@Getter
@Setter
@Schema(name = "BizChannelsDeleteDTO", description = "业务渠道管理 删除 DTO 对象")
public class BizChannelsDeleteDTO implements Serializable {

    @Schema(description = "IDs")
    private List<Long> ids;

}