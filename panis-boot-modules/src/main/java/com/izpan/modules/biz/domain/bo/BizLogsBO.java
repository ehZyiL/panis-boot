package com.izpan.modules.biz.domain.bo;

import com.izpan.modules.biz.domain.entity.BizLogs;
import lombok.Data;

import java.util.List;

/**
 * 日志管理 BO 业务处理对象
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.biz.domain.bo.BizLogsBO
 * @CreateTime 2024-07-02 - 12:19:18
 */

@Data
public class BizLogsBO extends BizLogs {

    /**
     * Ids
     */
    private List<Long> ids;

}