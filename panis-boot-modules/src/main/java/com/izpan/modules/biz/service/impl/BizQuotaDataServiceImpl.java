package com.izpan.modules.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizQuotaDataBO;
import com.izpan.modules.biz.domain.entity.BizQuotaData;
import com.izpan.modules.biz.repository.mapper.BizQuotaDataMapper;
import com.izpan.modules.biz.service.IBizQuotaDataService;
import org.springframework.stereotype.Service;

/**
 * Service 服务接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.impl.BizQuotaDataServiceImpl
 * @CreateTime 2024-07-01 - 22:02:37
 */

@Service
public class BizQuotaDataServiceImpl extends ServiceImpl<BizQuotaDataMapper, BizQuotaData> implements IBizQuotaDataService {

    @Override
    public IPage<BizQuotaData> listBizQuotaDataPage(PageQuery pageQuery, BizQuotaDataBO bizQuotaDataBO) {
        return baseMapper.selectPage(pageQuery.buildPage(), new LambdaQueryWrapper<>());
    }

}

