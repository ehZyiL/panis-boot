package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizQuotaData;
import lombok.Data;

import java.util.List;

/**
 * 配额数据管理 BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.bo.BizQuotaDataBO
 * @CreateTime 2024-07-02 - 12:19:52
 */

@Data
public class BizQuotaDataBO extends BizQuotaData {

    /**
     * Ids
     */
    private List<Long> ids;

}