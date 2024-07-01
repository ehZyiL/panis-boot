package com.izpan.modules.biz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizChannelsBO;
import com.izpan.modules.biz.domain.entity.BizChannels;

/**
 * Service 服务接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.IBizChannelsService
 * @CreateTime 2024-07-01 - 22:02:12
 */

public interface IBizChannelsService extends IService<BizChannels> {

    /**
     * - 分页查询
     *
     * @param pageQuery     分页对象
     * @param bizChannelsBO BO 查询对象
     * @return {@link IPage} 分页结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:12
     */
    IPage<BizChannels> listBizChannelsPage(PageQuery pageQuery, BizChannelsBO bizChannelsBO);
}
