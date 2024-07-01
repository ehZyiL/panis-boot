package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizTokens;
import lombok.Data;

import java.util.List;

/**
 * BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.domain.bo.BizTokensBO
 * @CreateTime 2024-07-01 - 22:03:03
 */

@Data
public class BizTokensBO extends BizTokens {

    /**
     * Ids
     */
    private List<Long> ids;

}