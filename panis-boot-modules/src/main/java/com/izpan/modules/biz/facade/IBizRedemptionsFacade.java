package com.izpan.modules.biz.facade;

import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsAddDTO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsDeleteDTO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsSearchDTO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizRedemptionsVO;

/**
 * 兑换管理 门面接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.IBizRedemptionsFacade
 * @CreateTime 2024-07-02 - 12:37:47
 */

public interface IBizRedemptionsFacade {

    /**
     * 兑换管理 - 分页查询
     *
     * @param pageQuery               分页对象
     * @param bizRedemptionsSearchDTO 查询对象
     * @return {@link RPage} 查询结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:37:47
     */
    RPage<BizRedemptionsVO> listBizRedemptionsPage(PageQuery pageQuery, BizRedemptionsSearchDTO bizRedemptionsSearchDTO);

    /**
     * 根据 ID 获取详情信息
     *
     * @param id 兑换管理ID
     * @return {@link BizRedemptionsVO} 兑换管理 VO 对象
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:37:47
     */
    BizRedemptionsVO get(Long id);

    /**
     * 新增兑换管理
     *
     * @param bizRedemptionsAddDTO 新增兑换管理 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:37:47
     */
    boolean add(BizRedemptionsAddDTO bizRedemptionsAddDTO);

    /**
     * 编辑更新兑换管理信息
     *
     * @param bizRedemptionsUpdateDTO 编辑更新 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:37:47
     */
    boolean update(BizRedemptionsUpdateDTO bizRedemptionsUpdateDTO);

    /**
     * 批量删除兑换管理信息
     *
     * @param bizRedemptionsDeleteDTO 删除 DTO 对象
     * @return @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:37:47
     */
    boolean batchDelete(BizRedemptionsDeleteDTO bizRedemptionsDeleteDTO);

}