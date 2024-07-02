package com.izpan.modules.biz.facade;

import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.logs.BizLogsAddDTO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsDeleteDTO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsSearchDTO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizLogsVO;

/**
 * 日志管理 门面接口层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.facade.IBizLogsFacade
 * @CreateTime 2024-07-02 - 12:39:07
 */

public interface IBizLogsFacade {

    /**
     * 日志管理 - 分页查询
     *
     * @param pageQuery        分页对象
     * @param bizLogsSearchDTO 查询对象
     * @return {@link RPage} 查询结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:39:07
     */
    RPage<BizLogsVO> listBizLogsPage(PageQuery pageQuery, BizLogsSearchDTO bizLogsSearchDTO);

    /**
     * 根据 ID 获取详情信息
     *
     * @param id 日志管理ID
     * @return {@link BizLogsVO} 日志管理 VO 对象
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:39:07
     */
    BizLogsVO get(Long id);

    /**
     * 新增日志管理
     *
     * @param bizLogsAddDTO 新增日志管理 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:39:07
     */
    boolean add(BizLogsAddDTO bizLogsAddDTO);

    /**
     * 编辑更新日志管理信息
     *
     * @param bizLogsUpdateDTO 编辑更新 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:39:07
     */
    boolean update(BizLogsUpdateDTO bizLogsUpdateDTO);

    /**
     * 批量删除日志管理信息
     *
     * @param bizLogsDeleteDTO 删除 DTO 对象
     * @return @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime 2024-07-02 - 12:39:07
     */
    boolean batchDelete(BizLogsDeleteDTO bizLogsDeleteDTO);

}