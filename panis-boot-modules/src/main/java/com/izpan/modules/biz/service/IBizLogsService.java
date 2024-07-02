package com.izpan.modules.biz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.modules.biz.domain.bo.BizLogsBO;
import com.izpan.modules.biz.domain.entity.BizLogs;

/**
 * 日志管理 Service 服务接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.service.IBizLogsService
 * @CreateTime 2024-07-02 - 12:39:07
 */

public interface IBizLogsService extends IService<BizLogs> {

    /**
     * 日志管理 - 分页查询
     *
     * @param pageQuery 分页对象
     * @param bizLogsBO BO 查询对象
     * @return {@link IPage} 分页结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:39:07
     */
    IPage<BizLogs> listBizLogsPage(PageQuery pageQuery, BizLogsBO bizLogsBO);
}
