package com.izpan.modules.biz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizRedemptionsBO;
import com.izpan.modules.biz.domain.entity.BizRedemptions;

/**
 * 兑换管理 Service 服务接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.IBizRedemptionsService
 * @CreateTime 2024-07-02 - 12:37:47
 */

public interface IBizRedemptionsService extends IService<BizRedemptions> {

    /**
     * 兑换管理 - 分页查询
     *
     * @param pageQuery        分页对象
     * @param bizRedemptionsBO BO 查询对象
     * @return {@link IPage} 分页结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:37:47
     */
    IPage<BizRedemptions> listBizRedemptionsPage(PageQuery pageQuery, BizRedemptionsBO bizRedemptionsBO);
}
