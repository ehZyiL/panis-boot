package com.izpan.modules.biz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizAbilitiesBO;
import com.izpan.modules.biz.domain.entity.BizAbilities;

/**
 * Service 服务接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.IBizAbilitiesService
 * @CreateTime 2024-07-01 - 22:02:52
 */

public interface IBizAbilitiesService extends IService<BizAbilities> {

    /**
     * - 分页查询
     *
     * @param pageQuery      分页对象
     * @param bizAbilitiesBO BO 查询对象
     * @return {@link IPage} 分页结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:52
     */
    IPage<BizAbilities> listBizAbilitiesPage(PageQuery pageQuery, BizAbilitiesBO bizAbilitiesBO);
}
