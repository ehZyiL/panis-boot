package com.izpan.modules.biz.domain.dto.quota.data;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 配额数据管理 删除 DTO 对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.dto.quota.data.BizQuotaDataDeleteDTO
 * @CreateTime 2024-07-02 - 12:19:52
 */

@Getter
@Setter
@Schema(name = "BizQuotaDataDeleteDTO", description = "配额数据管理 删除 DTO 对象")
public class BizQuotaDataDeleteDTO implements Serializable {

    @Schema(description = "IDs")
    private List<Long> ids;

}