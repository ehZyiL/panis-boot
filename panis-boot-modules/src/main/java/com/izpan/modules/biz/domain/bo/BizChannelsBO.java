package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizChannels;
import lombok.Data;

import java.util.List;

/**
 * 业务渠道管理 BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.bo.BizChannelsBO
 * @CreateTime 2024-07-02 - 12:19:10
 */

@Data
public class BizChannelsBO extends BizChannels {

    /**
     * Ids
     */
    private List<Long> ids;

}