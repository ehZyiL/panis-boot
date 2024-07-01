package com.izpan.modules.biz.facade;

import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataAddDTO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataDeleteDTO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataSearchDTO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizQuotaDataVO;

/**
 * 门面接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.IBizQuotaDataFacade
 * @CreateTime 2024-07-01 - 22:02:37
 */

public interface IBizQuotaDataFacade {

    /**
     * - 分页查询
     *
     * @param pageQuery             分页对象
     * @param bizQuotaDataSearchDTO 查询对象
     * @return {@link RPage} 查询结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:37
     */
    RPage<BizQuotaDataVO> listBizQuotaDataPage(PageQuery pageQuery, BizQuotaDataSearchDTO bizQuotaDataSearchDTO);

    /**
     * 根据 ID 获取详情信息
     *
     * @param id ID
     * @return {@link BizQuotaDataVO}  VO 对象
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:37
     */
    BizQuotaDataVO get(Long id);

    /**
     * 新增
     *
     * @param bizQuotaDataAddDTO 新增 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:37
     */
    boolean add(BizQuotaDataAddDTO bizQuotaDataAddDTO);

    /**
     * 编辑更新信息
     *
     * @param bizQuotaDataUpdateDTO 编辑更新 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:37
     */
    boolean update(BizQuotaDataUpdateDTO bizQuotaDataUpdateDTO);

    /**
     * 批量删除信息
     *
     * @param bizQuotaDataDeleteDTO 删除 DTO 对象
     * @return @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:37
     */
    boolean batchDelete(BizQuotaDataDeleteDTO bizQuotaDataDeleteDTO);

}