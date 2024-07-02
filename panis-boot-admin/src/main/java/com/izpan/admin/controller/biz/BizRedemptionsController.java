package com.izpan.admin.controller.biz;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.izpan.common.api.Result;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsAddDTO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsDeleteDTO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsSearchDTO;
import com.izpan.modules.biz.domain.dto.redemptions.BizRedemptionsUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizRedemptionsVO;
import com.izpan.modules.biz.facade.IBizRedemptionsFacade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 兑换管理 Controller 控制层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.admin.controller.biz.BizRedemptionsController
 * @CreateTime 2024-07-02 - 12:37:47
 */

@RestController
@Tag(name = "兑换管理")
@RequiredArgsConstructor
@RequestMapping("/biz_redemptions")
public class BizRedemptionsController {

    @NonNull
    private IBizRedemptionsFacade bizRedemptionsFacade;

    @GetMapping("/page")
    @SaCheckPermission("biz:redemptions:page")
    @Operation(operationId = "1", summary = "获取兑换管理列表")
    public Result<RPage<BizRedemptionsVO>> page(@Parameter(description = "分页对象", required = true) PageQuery pageQuery,
                                                @Parameter(description = "查询对象") BizRedemptionsSearchDTO bizRedemptionsSearchDTO) {
        return Result.data(bizRedemptionsFacade.listBizRedemptionsPage(pageQuery, bizRedemptionsSearchDTO));
    }

    @GetMapping("/{id}")
    @SaCheckPermission("biz:redemptions:get")
    @Operation(operationId = "2", summary = "根据ID获取兑换管理详细信息")
    public Result<BizRedemptionsVO> get(@Parameter(description = "ID") @PathVariable("id") Long id) {
        return Result.data(bizRedemptionsFacade.get(id));
    }

    @PostMapping("/")
    @SaCheckPermission("biz:redemptions:add")
    @Operation(operationId = "3", summary = "新增兑换管理")
    public Result<Boolean> add(@Parameter(description = "新增对象") @RequestBody BizRedemptionsAddDTO bizRedemptionsAddDTO) {
        return Result.status(bizRedemptionsFacade.add(bizRedemptionsAddDTO));
    }

    @PutMapping("/")
    @SaCheckPermission("biz:redemptions:update")
    @Operation(operationId = "4", summary = "更新兑换管理信息")
    public Result<Boolean> update(@Parameter(description = "更新对象") @RequestBody BizRedemptionsUpdateDTO bizRedemptionsUpdateDTO) {
        return Result.status(bizRedemptionsFacade.update(bizRedemptionsUpdateDTO));
    }

    @DeleteMapping("/")
    @SaCheckPermission("biz:redemptions:delete")
    @Operation(operationId = "5", summary = "批量删除兑换管理信息")
    public Result<Boolean> batchDelete(@Parameter(description = "删除对象") @RequestBody BizRedemptionsDeleteDTO bizRedemptionsDeleteDTO) {
        return Result.status(bizRedemptionsFacade.batchDelete(bizRedemptionsDeleteDTO));
    }

}