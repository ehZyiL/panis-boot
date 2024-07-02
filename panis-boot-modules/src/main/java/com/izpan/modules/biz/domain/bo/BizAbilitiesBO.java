package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizAbilities;
import lombok.Data;

import java.util.List;

/**
 * 能力管理 BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.bo.BizAbilitiesBO
 * @CreateTime 2024-07-02 - 12:19:01
 */

@Data
public class BizAbilitiesBO extends BizAbilities {

    /**
     * Ids
     */
    private List<Long> ids;

}