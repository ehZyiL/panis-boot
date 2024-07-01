package com.izpan.modules.biz.facade.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.izpan.common.util.CglibUtil;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.bo.BizTokensBO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensAddDTO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensDeleteDTO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensSearchDTO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensUpdateDTO;
import com.izpan.modules.biz.domain.entity.BizTokens;
import com.izpan.modules.biz.domain.vo.BizTokensVO;
import com.izpan.modules.biz.facade.IBizTokensFacade;
import com.izpan.modules.biz.service.IBizTokensService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 门面接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.impl.BizTokensFacadeImpl
 * @CreateTime 2024-07-01 - 22:03:03
 */

@Service
@RequiredArgsConstructor
public class BizTokensFacadeImpl implements IBizTokensFacade {

    @NonNull
    private IBizTokensService bizTokensService;

    @Override
    public RPage<BizTokensVO> listBizTokensPage(PageQuery pageQuery, BizTokensSearchDTO bizTokensSearchDTO) {
        BizTokensBO bizTokensBO = CglibUtil.convertObj(bizTokensSearchDTO, BizTokensBO::new);
        IPage<BizTokens> bizTokensIPage = bizTokensService.listBizTokensPage(pageQuery, bizTokensBO);
        return RPage.build(bizTokensIPage, BizTokensVO::new);
    }

    @Override
    public BizTokensVO get(Long id) {
        BizTokens byId = bizTokensService.getById(id);
        return CglibUtil.convertObj(byId, BizTokensVO::new);
    }

    @Override
    @Transactional
    public boolean add(BizTokensAddDTO bizTokensAddDTO) {
        BizTokensBO bizTokensBO = CglibUtil.convertObj(bizTokensAddDTO, BizTokensBO::new);
        return bizTokensService.save(bizTokensBO);
    }

    @Override
    @Transactional
    public boolean update(BizTokensUpdateDTO bizTokensUpdateDTO) {
        BizTokensBO bizTokensBO = CglibUtil.convertObj(bizTokensUpdateDTO, BizTokensBO::new);
        return bizTokensService.updateById(bizTokensBO);
    }

    @Override
    @Transactional
    public boolean batchDelete(BizTokensDeleteDTO bizTokensDeleteDTO) {
        BizTokensBO bizTokensBO = CglibUtil.convertObj(bizTokensDeleteDTO, BizTokensBO::new);
        return bizTokensService.removeBatchByIds(bizTokensBO.getIds(), true);
    }

}