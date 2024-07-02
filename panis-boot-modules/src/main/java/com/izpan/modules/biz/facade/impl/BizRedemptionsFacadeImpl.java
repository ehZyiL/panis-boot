package com.izpan.modules.biz.facade.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.izpan.common.util.CglibUtil;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.bo.BizRedemptionsBO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsAddDTO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsDeleteDTO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsSearchDTO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsUpdateDTO;
import com.izpan.modules.biz.domain.entity.BizRedemptions;
import com.izpan.modules.biz.domain.vo.BizRedemptionsVO;
import com.izpan.modules.biz.facade.IBizRedemptionsFacade;
import com.izpan.modules.biz.service.IBizRedemptionsService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BizRedemptionsFacadeImpl implements IBizRedemptionsFacade {

    @NonNull
    private IBizRedemptionsService bizRedemptionsService;

    @Override
    public RPage<BizRedemptionsVO> listBizRedemptionsPage(PageQuery pageQuery, BizRedemptionsSearchDTO bizRedemptionsSearchDTO) {
        BizRedemptionsBO bizRedemptionsBO = CglibUtil.convertObj(bizRedemptionsSearchDTO, BizRedemptionsBO::new);
        IPage<BizRedemptions> bizRedemptionsIPage = bizRedemptionsService.listBizRedemptionsPage(pageQuery, bizRedemptionsBO);
        return RPage.build(bizRedemptionsIPage, BizRedemptionsVO::new);
    }

    @Override
    public BizRedemptionsVO get(Long id) {
        BizRedemptions byId = bizRedemptionsService.getById(id);
        return CglibUtil.convertObj(byId, BizRedemptionsVO::new);
    }

    @Override
    @Transactional
    public boolean add(BizRedemptionsAddDTO bizRedemptionsAddDTO) {
        BizRedemptionsBO bizRedemptionsBO = CglibUtil.convertObj(bizRedemptionsAddDTO, BizRedemptionsBO::new);
        return bizRedemptionsService.save(bizRedemptionsBO);
    }

    @Override
    @Transactional
    public boolean update(BizRedemptionsUpdateDTO bizRedemptionsUpdateDTO) {
        BizRedemptionsBO bizRedemptionsBO = CglibUtil.convertObj(bizRedemptionsUpdateDTO, BizRedemptionsBO::new);
        return bizRedemptionsService.updateById(bizRedemptionsBO);
    }

    @Override
    @Transactional
    public boolean batchDelete(BizRedemptionsDeleteDTO bizRedemptionsDeleteDTO) {
        BizRedemptionsBO bizRedemptionsBO = CglibUtil.convertObj(bizRedemptionsDeleteDTO, BizRedemptionsBO::new);
        return bizRedemptionsService.removeBatchByIds(bizRedemptionsBO.getIds(), true);
    }

}