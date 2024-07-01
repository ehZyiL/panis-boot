package com.izpan.modules.biz.facade.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.izpan.common.util.CglibUtil;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.bo.BizQuotaDataBO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataAddDTO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataDeleteDTO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataSearchDTO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataUpdateDTO;
import com.izpan.modules.biz.domain.entity.BizQuotaData;
import com.izpan.modules.biz.domain.vo.BizQuotaDataVO;
import com.izpan.modules.biz.facade.IBizQuotaDataFacade;
import com.izpan.modules.biz.service.IBizQuotaDataService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 门面接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.impl.BizQuotaDataFacadeImpl
 * @CreateTime 2024-07-01 - 22:02:37
 */

@Service
@RequiredArgsConstructor
public class BizQuotaDataFacadeImpl implements IBizQuotaDataFacade {

    @NonNull
    private IBizQuotaDataService bizQuotaDataService;

    @Override
    public RPage<BizQuotaDataVO> listBizQuotaDataPage(PageQuery pageQuery, BizQuotaDataSearchDTO bizQuotaDataSearchDTO) {
        BizQuotaDataBO bizQuotaDataBO = CglibUtil.convertObj(bizQuotaDataSearchDTO, BizQuotaDataBO::new);
        IPage<BizQuotaData> bizQuotaDataIPage = bizQuotaDataService.listBizQuotaDataPage(pageQuery, bizQuotaDataBO);
        return RPage.build(bizQuotaDataIPage, BizQuotaDataVO::new);
    }

    @Override
    public BizQuotaDataVO get(Long id) {
        BizQuotaData byId = bizQuotaDataService.getById(id);
        return CglibUtil.convertObj(byId, BizQuotaDataVO::new);
    }

    @Override
    @Transactional
    public boolean add(BizQuotaDataAddDTO bizQuotaDataAddDTO) {
        BizQuotaDataBO bizQuotaDataBO = CglibUtil.convertObj(bizQuotaDataAddDTO, BizQuotaDataBO::new);
        return bizQuotaDataService.save(bizQuotaDataBO);
    }

    @Override
    @Transactional
    public boolean update(BizQuotaDataUpdateDTO bizQuotaDataUpdateDTO) {
        BizQuotaDataBO bizQuotaDataBO = CglibUtil.convertObj(bizQuotaDataUpdateDTO, BizQuotaDataBO::new);
        return bizQuotaDataService.updateById(bizQuotaDataBO);
    }

    @Override
    @Transactional
    public boolean batchDelete(BizQuotaDataDeleteDTO bizQuotaDataDeleteDTO) {
        BizQuotaDataBO bizQuotaDataBO = CglibUtil.convertObj(bizQuotaDataDeleteDTO, BizQuotaDataBO::new);
        return bizQuotaDataService.removeBatchByIds(bizQuotaDataBO.getIds(), true);
    }

}