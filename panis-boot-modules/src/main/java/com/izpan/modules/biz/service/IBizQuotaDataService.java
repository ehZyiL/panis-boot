package com.izpan.modules.biz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizQuotaDataBO;
import com.izpan.modules.biz.domain.entity.BizQuotaData;

/**
 * Service 服务接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.IBizQuotaDataService
 * @CreateTime 2024-07-01 - 22:02:37
 */

public interface IBizQuotaDataService extends IService<BizQuotaData> {

    /**
     * - 分页查询
     *
     * @param pageQuery      分页对象
     * @param bizQuotaDataBO BO 查询对象
     * @return {@link IPage} 分页结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:37
     */
    IPage<BizQuotaData> listBizQuotaDataPage(PageQuery pageQuery, BizQuotaDataBO bizQuotaDataBO);
}
