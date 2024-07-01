package com.izpan.modules.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizTokensBO;
import com.izpan.modules.biz.domain.entity.BizTokens;
import com.izpan.modules.biz.repository.mapper.BizTokensMapper;
import com.izpan.modules.biz.service.IBizTokensService;
import org.springframework.stereotype.Service;

/**
 * Service 服务接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.impl.BizTokensServiceImpl
 * @CreateTime 2024-07-01 - 22:03:03
 */

@Service
public class BizTokensServiceImpl extends ServiceImpl<BizTokensMapper, BizTokens> implements IBizTokensService {

    @Override
    public IPage<BizTokens> listBizTokensPage(PageQuery pageQuery, BizTokensBO bizTokensBO) {
        return baseMapper.selectPage(pageQuery.buildPage(), new LambdaQueryWrapper<>());
    }

}

