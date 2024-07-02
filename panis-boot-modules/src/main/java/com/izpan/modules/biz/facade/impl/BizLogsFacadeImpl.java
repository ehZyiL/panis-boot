package com.izpan.modules.biz.facade.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.izpan.common.util.CglibUtil;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.bo.BizLogsBO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsAddDTO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsDeleteDTO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsSearchDTO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsUpdateDTO;
import com.izpan.modules.biz.domain.entity.BizLogs;
import com.izpan.modules.biz.domain.vo.BizLogsVO;
import com.izpan.modules.biz.facade.IBizLogsFacade;
import com.izpan.modules.biz.service.IBizLogsService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 日志管理 门面接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.impl.BizLogsFacadeImpl
 * @CreateTime 2024-07-02 - 12:39:07
 */

@Service
@RequiredArgsConstructor
public class BizLogsFacadeImpl implements IBizLogsFacade {

    @NonNull
    private IBizLogsService bizLogsService;

    @Override
    public RPage<BizLogsVO> listBizLogsPage(PageQuery pageQuery, BizLogsSearchDTO bizLogsSearchDTO) {
        BizLogsBO bizLogsBO = CglibUtil.convertObj(bizLogsSearchDTO, BizLogsBO::new);
        IPage<BizLogs> bizLogsIPage = bizLogsService.listBizLogsPage(pageQuery, bizLogsBO);
        return RPage.build(bizLogsIPage, BizLogsVO::new);
    }

    @Override
    public BizLogsVO get(Long id) {
        BizLogs byId = bizLogsService.getById(id);
        return CglibUtil.convertObj(byId, BizLogsVO::new);
    }

    @Override
    @Transactional
    public boolean add(BizLogsAddDTO bizLogsAddDTO) {
        BizLogsBO bizLogsBO = CglibUtil.convertObj(bizLogsAddDTO, BizLogsBO::new);
        return bizLogsService.save(bizLogsBO);
    }

    @Override
    @Transactional
    public boolean update(BizLogsUpdateDTO bizLogsUpdateDTO) {
        BizLogsBO bizLogsBO = CglibUtil.convertObj(bizLogsUpdateDTO, BizLogsBO::new);
        return bizLogsService.updateById(bizLogsBO);
    }

    @Override
    @Transactional
    public boolean batchDelete(BizLogsDeleteDTO bizLogsDeleteDTO) {
        BizLogsBO bizLogsBO = CglibUtil.convertObj(bizLogsDeleteDTO, BizLogsBO::new);
        return bizLogsService.removeBatchByIds(bizLogsBO.getIds(), true);
    }

}