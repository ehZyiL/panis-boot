package com.izpan.modules.biz.domain.vo;

import com.izpan.infrastructure.domain.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * VO 展示类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.vo.BizQuotaDataVO
 * @CreateTime 2024-07-01 - 22:02:37
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BizQuotaDataVO", description = " VO 对象")
public class BizQuotaDataVO extends BaseVO {

    private Long userId;

    private String username;

    private String modelName;

    private Long createdAt;

    private Long tokenUsed;

    private Long count;

    private Long quota;
}