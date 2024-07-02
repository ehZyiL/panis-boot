package com.izpan.modules.biz.domain.dto.logs;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 日志管理 删除 DTO 对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.modules.biz.domain.dto.logs.BizLogsDeleteDTO
 * @CreateTime 2024-07-02 - 12:19:18
 */

@Getter
@Setter
@Schema(name = "BizLogsDeleteDTO", description = "日志管理 删除 DTO 对象")
public class BizLogsDeleteDTO implements Serializable {

    @Schema(description = "IDs")
    private List<Long> ids;

}