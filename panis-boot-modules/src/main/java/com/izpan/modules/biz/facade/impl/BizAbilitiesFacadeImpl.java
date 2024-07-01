package com.izpan.modules.biz.facade.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.izpan.common.util.CglibUtil;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.bo.BizAbilitiesBO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesAddDTO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesDeleteDTO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesSearchDTO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesUpdateDTO;
import com.izpan.modules.biz.domain.entity.BizAbilities;
import com.izpan.modules.biz.domain.vo.BizAbilitiesVO;
import com.izpan.modules.biz.facade.IBizAbilitiesFacade;
import com.izpan.modules.biz.service.IBizAbilitiesService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 门面接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.impl.BizAbilitiesFacadeImpl
 * @CreateTime 2024-07-01 - 22:02:52
 */

@Service
@RequiredArgsConstructor
public class BizAbilitiesFacadeImpl implements IBizAbilitiesFacade {

    @NonNull
    private IBizAbilitiesService bizAbilitiesService;

    @Override
    public RPage<BizAbilitiesVO> listBizAbilitiesPage(PageQuery pageQuery, BizAbilitiesSearchDTO bizAbilitiesSearchDTO) {
        BizAbilitiesBO bizAbilitiesBO = CglibUtil.convertObj(bizAbilitiesSearchDTO, BizAbilitiesBO::new);
        IPage<BizAbilities> bizAbilitiesIPage = bizAbilitiesService.listBizAbilitiesPage(pageQuery, bizAbilitiesBO);
        return RPage.build(bizAbilitiesIPage, BizAbilitiesVO::new);
    }

    @Override
    public BizAbilitiesVO get(Long id) {
        BizAbilities byId = bizAbilitiesService.getById(id);
        return CglibUtil.convertObj(byId, BizAbilitiesVO::new);
    }

    @Override
    @Transactional
    public boolean add(BizAbilitiesAddDTO bizAbilitiesAddDTO) {
        BizAbilitiesBO bizAbilitiesBO = CglibUtil.convertObj(bizAbilitiesAddDTO, BizAbilitiesBO::new);
        return bizAbilitiesService.save(bizAbilitiesBO);
    }

    @Override
    @Transactional
    public boolean update(BizAbilitiesUpdateDTO bizAbilitiesUpdateDTO) {
        BizAbilitiesBO bizAbilitiesBO = CglibUtil.convertObj(bizAbilitiesUpdateDTO, BizAbilitiesBO::new);
        return bizAbilitiesService.updateById(bizAbilitiesBO);
    }

    @Override
    @Transactional
    public boolean batchDelete(BizAbilitiesDeleteDTO bizAbilitiesDeleteDTO) {
        BizAbilitiesBO bizAbilitiesBO = CglibUtil.convertObj(bizAbilitiesDeleteDTO, BizAbilitiesBO::new);
        return bizAbilitiesService.removeBatchByIds(bizAbilitiesBO.getIds(), true);
    }

}