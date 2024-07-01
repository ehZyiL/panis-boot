package com.izpan.modules.biz.facade;

import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsAddDTO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsDeleteDTO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsSearchDTO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizChannelsVO;

/**
 * 门面接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.IBizChannelsFacade
 * @CreateTime 2024-07-01 - 22:02:12
 */

public interface IBizChannelsFacade {

    /**
     * - 分页查询
     *
     * @param pageQuery            分页对象
     * @param bizChannelsSearchDTO 查询对象
     * @return {@link RPage} 查询结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:12
     */
    RPage<BizChannelsVO> listBizChannelsPage(PageQuery pageQuery, BizChannelsSearchDTO bizChannelsSearchDTO);

    /**
     * 根据 ID 获取详情信息
     *
     * @param id ID
     * @return {@link BizChannelsVO}  VO 对象
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:12
     */
    BizChannelsVO get(Long id);

    /**
     * 新增
     *
     * @param bizChannelsAddDTO 新增 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:12
     */
    boolean add(BizChannelsAddDTO bizChannelsAddDTO);

    /**
     * 编辑更新信息
     *
     * @param bizChannelsUpdateDTO 编辑更新 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:12
     */
    boolean update(BizChannelsUpdateDTO bizChannelsUpdateDTO);

    /**
     * 批量删除信息
     *
     * @param bizChannelsDeleteDTO 删除 DTO 对象
     * @return @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:12
     */
    boolean batchDelete(BizChannelsDeleteDTO bizChannelsDeleteDTO);

}