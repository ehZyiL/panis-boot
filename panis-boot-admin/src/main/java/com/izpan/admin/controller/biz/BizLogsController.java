package com.izpan.admin.controller.biz;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.izpan.common.api.Result;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.logs.BizLogsAddDTO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsDeleteDTO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsSearchDTO;
import com.izpan.modules.biz.domain.dto.logs.BizLogsUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizLogsVO;
import com.izpan.modules.biz.facade.IBizLogsFacade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 日志管理 Controller 控制层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.admin.controller.biz.BizLogsController
 * @CreateTime 2024-07-02 - 12:39:07
 */

@RestController
@Tag(name = "日志管理")
@RequiredArgsConstructor
@RequestMapping("/biz_logs")
public class BizLogsController {

    @NonNull
    private IBizLogsFacade bizLogsFacade;

    @GetMapping("/page")
    @SaCheckPermission("biz:logs:page")
    @Operation(operationId = "1", summary = "获取日志管理列表")
    public Result<RPage<BizLogsVO>> page(@Parameter(description = "分页对象", required = true) PageQuery pageQuery,
                                         @Parameter(description = "查询对象") BizLogsSearchDTO bizLogsSearchDTO) {
        return Result.data(bizLogsFacade.listBizLogsPage(pageQuery, bizLogsSearchDTO));
    }

    @GetMapping("/{id}")
    @SaCheckPermission("biz:logs:get")
    @Operation(operationId = "2", summary = "根据ID获取日志管理详细信息")
    public Result<BizLogsVO> get(@Parameter(description = "ID") @PathVariable("id") Long id) {
        return Result.data(bizLogsFacade.get(id));
    }

    @PostMapping("/")
    @SaCheckPermission("biz:logs:add")
    @Operation(operationId = "3", summary = "新增日志管理")
    public Result<Boolean> add(@Parameter(description = "新增对象") @RequestBody BizLogsAddDTO bizLogsAddDTO) {
        return Result.status(bizLogsFacade.add(bizLogsAddDTO));
    }

    @PutMapping("/")
    @SaCheckPermission("biz:logs:update")
    @Operation(operationId = "4", summary = "更新日志管理信息")
    public Result<Boolean> update(@Parameter(description = "更新对象") @RequestBody BizLogsUpdateDTO bizLogsUpdateDTO) {
        return Result.status(bizLogsFacade.update(bizLogsUpdateDTO));
    }

    @DeleteMapping("/")
    @SaCheckPermission("biz:logs:delete")
    @Operation(operationId = "5", summary = "批量删除日志管理信息")
    public Result<Boolean> batchDelete(@Parameter(description = "删除对象") @RequestBody BizLogsDeleteDTO bizLogsDeleteDTO) {
        return Result.status(bizLogsFacade.batchDelete(bizLogsDeleteDTO));
    }

}