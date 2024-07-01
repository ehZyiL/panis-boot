package com.izpan.modules.biz.facade;

import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensAddDTO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensDeleteDTO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensSearchDTO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizTokensVO;

/**
 * 门面接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.IBizTokensFacade
 * @CreateTime 2024-07-01 - 22:03:03
 */

public interface IBizTokensFacade {

    /**
     * - 分页查询
     *
     * @param pageQuery          分页对象
     * @param bizTokensSearchDTO 查询对象
     * @return {@link RPage} 查询结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:03:03
     */
    RPage<BizTokensVO> listBizTokensPage(PageQuery pageQuery, BizTokensSearchDTO bizTokensSearchDTO);

    /**
     * 根据 ID 获取详情信息
     *
     * @param id ID
     * @return {@link BizTokensVO}  VO 对象
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:03:03
     */
    BizTokensVO get(Long id);

    /**
     * 新增
     *
     * @param bizTokensAddDTO 新增 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:03:03
     */
    boolean add(BizTokensAddDTO bizTokensAddDTO);

    /**
     * 编辑更新信息
     *
     * @param bizTokensUpdateDTO 编辑更新 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:03:03
     */
    boolean update(BizTokensUpdateDTO bizTokensUpdateDTO);

    /**
     * 批量删除信息
     *
     * @param bizTokensDeleteDTO 删除 DTO 对象
     * @return @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-01 - 22:03:03
     */
    boolean batchDelete(BizTokensDeleteDTO bizTokensDeleteDTO);

}