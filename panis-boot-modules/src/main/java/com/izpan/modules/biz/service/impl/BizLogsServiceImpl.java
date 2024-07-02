package com.izpan.modules.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizLogsBO;
import com.izpan.modules.biz.domain.entity.BizLogs;
import com.izpan.modules.biz.repository.mapper.BizLogsMapper;
import com.izpan.modules.biz.service.IBizLogsService;
import org.springframework.stereotype.Service;

/**
 * 日志管理 Service 服务接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.impl.BizLogsServiceImpl
 * @CreateTime 2024-07-02 - 12:39:07
 */

@Service
public class BizLogsServiceImpl extends ServiceImpl<BizLogsMapper, BizLogs> implements IBizLogsService {

    @Override
    public IPage<BizLogs> listBizLogsPage(PageQuery pageQuery, BizLogsBO bizLogsBO) {
        return baseMapper.selectPage(pageQuery.buildPage(), new LambdaQueryWrapper<>());
    }

}

