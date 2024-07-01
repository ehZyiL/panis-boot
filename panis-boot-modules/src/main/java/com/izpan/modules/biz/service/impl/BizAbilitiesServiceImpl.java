package com.izpan.modules.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizAbilitiesBO;
import com.izpan.modules.biz.domain.entity.BizAbilities;
import com.izpan.modules.biz.repository.mapper.BizAbilitiesMapper;
import com.izpan.modules.biz.service.IBizAbilitiesService;
import org.springframework.stereotype.Service;

/**
 * Service 服务接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.impl.BizAbilitiesServiceImpl
 * @CreateTime 2024-07-01 - 22:02:52
 */

@Service
public class BizAbilitiesServiceImpl extends ServiceImpl<BizAbilitiesMapper, BizAbilities> implements IBizAbilitiesService {

    @Override
    public IPage<BizAbilities> listBizAbilitiesPage(PageQuery pageQuery, BizAbilitiesBO bizAbilitiesBO) {
        return baseMapper.selectPage(pageQuery.buildPage(), new LambdaQueryWrapper<>());
    }

}

