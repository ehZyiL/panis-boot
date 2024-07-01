package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizAbilities;
import lombok.Data;

import java.util.List;

/**
 * BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.domain.bo.BizAbilitiesBO
 * @CreateTime 2024-07-01 - 22:02:52
 */

@Data
public class BizAbilitiesBO extends BizAbilities {

    /**
     * Ids
     */
    private List<Long> ids;

}