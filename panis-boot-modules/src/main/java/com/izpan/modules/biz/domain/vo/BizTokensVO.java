package com.izpan.modules.biz.domain.vo;

import com.izpan.infrastructure.domain.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * VO 展示类
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.vo.BizTokensVO
 * @CreateTime 2024-07-01 - 22:03:03
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BizTokensVO", description = " VO 对象")
public class BizTokensVO extends BaseVO {

    private Long userId;

    private String key;

    private Long status;

    private String name;

    private Long createdTime;

    private Long accessedTime;

    private Long expiredTime;

    private Long remainQuota;

    private Boolean unlimitedQuota;

    private Boolean modelLimitsEnabled;

    private String modelLimits;

    private Long usedQuota;

    private LocalDateTime deletedAt;
}