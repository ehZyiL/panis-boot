package com.izpan.modules.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizChannelsBO;
import com.izpan.modules.biz.domain.entity.BizChannels;
import com.izpan.modules.biz.repository.mapper.BizChannelsMapper;
import com.izpan.modules.biz.service.IBizChannelsService;
import org.springframework.stereotype.Service;

/**
 * Service 服务接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.impl.BizChannelsServiceImpl
 * @CreateTime 2024-07-01 - 22:02:12
 */

@Service
public class BizChannelsServiceImpl extends ServiceImpl<BizChannelsMapper, BizChannels> implements IBizChannelsService {

    @Override
    public IPage<BizChannels> listBizChannelsPage(PageQuery pageQuery, BizChannelsBO bizChannelsBO) {
        return baseMapper.selectPage(pageQuery.buildPage(), new LambdaQueryWrapper<>());
    }

}

