package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizQuotaData;
import lombok.Data;

import java.util.List;

/**
 * BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.domain.bo.BizQuotaDataBO
 * @CreateTime 2024-07-01 - 22:02:37
 */

@Data
public class BizQuotaDataBO extends BizQuotaData {

    /**
     * Ids
     */
    private List<Long> ids;

}