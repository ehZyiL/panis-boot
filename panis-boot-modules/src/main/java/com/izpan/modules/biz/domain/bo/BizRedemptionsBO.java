package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizRedemptions;
import lombok.Data;

import java.util.List;

/**
 * 兑换管理 BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.bo.BizRedemptionsBO
 * @CreateTime 2024-07-02 - 12:20:01
 */

@Data
public class BizRedemptionsBO extends BizRedemptions {

    /**
     * Ids
     */
    private List<Long> ids;

}