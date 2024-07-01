

package ${cfg.facadePackageName};

/**
 * ${table.comment!} 门面接口层
 *
 * @Author ${author}
 * @ProjectName panis-boot
 * @ClassName  ${cfg.facadePackageName}.I${entity}Facade
 * @CreateTime ${date}
 */

public interface I${entity}Facade {

    /**
     * ${table.comment!} - 分页查询
     *
     * @param pageQuery        分页对象
     * @param ${table.entityPath!}SearchDTO 查询对象
     * @return {@link RPage} 查询结果
     * @author payne.zhuang
     * @CreateTime ${date}
     */
    RPage<${entity}VO> list${entity}Page(PageQuery pageQuery, ${entity}SearchDTO ${table.entityPath!}SearchDTO);

    /**
     * 根据 ID 获取详情信息
     *
     * @param id ${table.comment!}ID
     * @return {@link ${entity}VO} ${table.comment!} VO 对象
     * @author payne.zhuang
     * @CreateTime ${date}
     */
    ${entity}VO get(Long id);

    /**
     * 新增${table.comment!}
     *
     * @param ${table.entityPath!}AddDTO 新增${table.comment!} DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime ${date}
     */
    boolean add(${entity}AddDTO ${table.entityPath!}AddDTO);

    /**
     * 编辑更新${table.comment!}信息
     *
     * @param ${table.entityPath!}UpdateDTO 编辑更新 DTO 对象
     * @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime ${date}
     */
    boolean update(${entity}UpdateDTO ${table.entityPath!}UpdateDTO);

    /**
     * 批量删除${table.comment!}信息
     *
     * @param ${table.entityPath!}DeleteDTO 删除 DTO 对象
     * @return @return {@link Boolean} 结果
     * @author payne.zhuang
     * @CreateTime ${date}
     */
    boolean batchDelete(${entity}DeleteDTO ${table.entityPath!}DeleteDTO);

}