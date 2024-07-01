package com.izpan.modules.biz.domain.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @ClassName com.izpan.modules.biz.domain.vo.BizAbilitiesVO
 * @CreateTime 2024-07-01 - 22:02:52
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "BizAbilitiesVO", description = " VO 对象")
public class BizAbilitiesVO extends BaseVO {

    @TableId(value = "group", type = IdType.ASSIGN_ID)
    private String group;

    @TableId(value = "model", type = IdType.ASSIGN_ID)
    private String model;

    @TableId(value = "channel_id", type = IdType.ASSIGN_ID)
    private Long channelId;

    private Boolean enabled;

    private Long priority;

    private Long weight;
}