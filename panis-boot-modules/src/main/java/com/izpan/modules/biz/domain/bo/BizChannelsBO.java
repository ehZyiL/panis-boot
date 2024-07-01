package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizChannels;
import lombok.Data;

import java.util.List;

/**
 * BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.domain.bo.BizChannelsBO
 * @CreateTime 2024-07-01 - 22:02:12
 */

@Data
public class BizChannelsBO extends BizChannels {

    /**
     * Ids
     */
    private List<Long> ids;

}