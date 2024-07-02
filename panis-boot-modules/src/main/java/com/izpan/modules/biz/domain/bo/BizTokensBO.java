package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizTokens;
import lombok.Data;

import java.util.List;

/**
 * 令牌管理 BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.bo.BizTokensBO
 * @CreateTime 2024-07-02 - 12:20:18
 */

@Data
public class BizTokensBO extends BizTokens {

    /**
     * Ids
     */
    private List<Long> ids;

}