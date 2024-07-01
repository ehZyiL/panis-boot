package com.izpan.modules.biz.facade;

import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesAddDTO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesDeleteDTO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesSearchDTO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizAbilitiesVO;

/**
 * 门面接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.IBizAbilitiesFacade
 * @CreateTime 2024-07-01 - 22:02:52
 */

public interface IBizAbilitiesFacade {

    /**
     * - 分页查询
     *
     * @param pageQuery             分页对象
     * @param bizAbilitiesSearchDTO 查询对象
     * @return {@link RPage} 查询结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:52
     */
    RPage<BizAbilitiesVO> listBizAbilitiesPage(PageQuery pageQuery, BizAbilitiesSearchDTO bizAbilitiesSearchDTO);

    /**
     * 根据 ID 获取详情信息
     *
     * @param id ID
     * @return {@link BizAbilitiesVO}  VO 对象
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:52
     */
    BizAbilitiesVO get(Long id);

    /**
     * 新增
     *
     * @param bizAbilitiesAddDTO 新增 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:52
     */
    boolean add(BizAbilitiesAddDTO bizAbilitiesAddDTO);

    /**
     * 编辑更新信息
     *
     * @param bizAbilitiesUpdateDTO 编辑更新 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:52
     */
    boolean update(BizAbilitiesUpdateDTO bizAbilitiesUpdateDTO);

    /**
     * 批量删除信息
     *
     * @param bizAbilitiesDeleteDTO 删除 DTO 对象
     * @return @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:02:52
     */
    boolean batchDelete(BizAbilitiesDeleteDTO bizAbilitiesDeleteDTO);

}