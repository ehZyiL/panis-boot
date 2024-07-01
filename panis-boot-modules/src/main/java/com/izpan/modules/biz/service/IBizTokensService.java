package com.izpan.modules.biz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizTokensBO;
import com.izpan.modules.biz.domain.entity.BizTokens;


/**
 * Service 服务接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.IBizTokensService
 * @CreateTime 2024-07-01 - 22:03:03
 */

public interface IBizTokensService extends IService<BizTokens> {

    /**
     * - 分页查询
     *
     * @param pageQuery   分页对象
     * @param bizTokensBO BO 查询对象
     * @return {@link IPage} 分页结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:03:03
     */
    IPage<BizTokens> listBizTokensPage(PageQuery pageQuery, BizTokensBO bizTokensBO);
}
