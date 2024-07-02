package com.izpan.modules.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizRedemptionsBO;
import com.izpan.modules.biz.domain.entity.BizRedemptions;
import com.izpan.modules.biz.repository.mapper.BizRedemptionsMapper;
import com.izpan.modules.biz.service.IBizRedemptionsService;
import org.springframework.stereotype.Service;

/**
 * 兑换管理 Service 服务接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.impl.BizRedemptionsServiceImpl
 * @CreateTime 2024-07-02 - 12:37:47
 */

@Service
public class BizRedemptionsServiceImpl extends ServiceImpl<BizRedemptionsMapper, BizRedemptions> implements IBizRedemptionsService {

    @Override
    public IPage<BizRedemptions> listBizRedemptionsPage(PageQuery pageQuery, BizRedemptionsBO bizRedemptionsBO) {
        return baseMapper.selectPage(pageQuery.buildPage(), new LambdaQueryWrapper<>());
    }

}

