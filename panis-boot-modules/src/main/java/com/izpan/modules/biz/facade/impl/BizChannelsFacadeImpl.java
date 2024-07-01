package com.izpan.modules.biz.facade.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.izpan.common.util.CglibUtil;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.bo.BizChannelsBO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsAddDTO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsDeleteDTO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsSearchDTO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsUpdateDTO;
import com.izpan.modules.biz.domain.entity.BizChannels;
import com.izpan.modules.biz.domain.vo.BizChannelsVO;
import com.izpan.modules.biz.facade.IBizChannelsFacade;
import com.izpan.modules.biz.service.IBizChannelsService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 门面接口实现层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.impl.BizChannelsFacadeImpl
 * @CreateTime 2024-07-01 - 22:02:12
 */

@Service
@RequiredArgsConstructor
public class BizChannelsFacadeImpl implements IBizChannelsFacade {

    @NonNull
    private IBizChannelsService bizChannelsService;

    @Override
    public RPage<BizChannelsVO> listBizChannelsPage(PageQuery pageQuery, BizChannelsSearchDTO bizChannelsSearchDTO) {
        BizChannelsBO bizChannelsBO = CglibUtil.convertObj(bizChannelsSearchDTO, BizChannelsBO::new);
        IPage<BizChannels> bizChannelsIPage = bizChannelsService.listBizChannelsPage(pageQuery, bizChannelsBO);
        return RPage.build(bizChannelsIPage, BizChannelsVO::new);
    }

    @Override
    public BizChannelsVO get(Long id) {
        BizChannels byId = bizChannelsService.getById(id);
        return CglibUtil.convertObj(byId, BizChannelsVO::new);
    }

    @Override
    @Transactional
    public boolean add(BizChannelsAddDTO bizChannelsAddDTO) {
        BizChannelsBO bizChannelsBO = CglibUtil.convertObj(bizChannelsAddDTO, BizChannelsBO::new);
        return bizChannelsService.save(bizChannelsBO);
    }

    @Override
    @Transactional
    public boolean update(BizChannelsUpdateDTO bizChannelsUpdateDTO) {
        BizChannelsBO bizChannelsBO = CglibUtil.convertObj(bizChannelsUpdateDTO, BizChannelsBO::new);
        return bizChannelsService.updateById(bizChannelsBO);
    }

    @Override
    @Transactional
    public boolean batchDelete(BizChannelsDeleteDTO bizChannelsDeleteDTO) {
        BizChannelsBO bizChannelsBO = CglibUtil.convertObj(bizChannelsDeleteDTO, BizChannelsBO::new);
        return bizChannelsService.removeBatchByIds(bizChannelsBO.getIds(), true);
    }

}