package com.izpan.admin.controller.biz;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.izpan.common.api.Result;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataAddDTO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataDeleteDTO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataSearchDTO;
import com.izpan.modules.biz.domain.dto.quota.data.BizQuotaDataUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizQuotaDataVO;
import com.izpan.modules.biz.facade.IBizQuotaDataFacade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Controller 控制层
 *
 * @Author ehzyil
 * @ProjectName panis-boot
 * @ClassName com.izpan.admin.controller.biz.BizQuotaDataController
 * @CreateTime 2024-07-01 - 22:02:37
 */

@RestController
@Tag(name = "")
@RequiredArgsConstructor
@RequestMapping("/biz_quota_data")
public class BizQuotaDataController {

    @NonNull
    private IBizQuotaDataFacade bizQuotaDataFacade;

    @GetMapping("/page")
    @SaCheckPermission("biz:quota:data:page")
    @Operation(operationId = "1", summary = "获取列表")
    public Result<RPage<BizQuotaDataVO>> page(@Parameter(description = "分页对象", required = true) PageQuery pageQuery,
                                              @Parameter(description = "查询对象") BizQuotaDataSearchDTO bizQuotaDataSearchDTO) {
        return Result.data(bizQuotaDataFacade.listBizQuotaDataPage(pageQuery, bizQuotaDataSearchDTO));
    }

    @GetMapping("/{id}")
    @SaCheckPermission("biz:quota:data:get")
    @Operation(operationId = "2", summary = "根据ID获取详细信息")
    public Result<BizQuotaDataVO> get(@Parameter(description = "ID") @PathVariable("id") Long id) {
        return Result.data(bizQuotaDataFacade.get(id));
    }

    @PostMapping("/")
    @SaCheckPermission("biz:quota:data:add")
    @Operation(operationId = "3", summary = "新增")
    public Result<Boolean> add(@Parameter(description = "新增对象") @RequestBody BizQuotaDataAddDTO bizQuotaDataAddDTO) {
        return Result.status(bizQuotaDataFacade.add(bizQuotaDataAddDTO));
    }

    @PutMapping("/")
    @SaCheckPermission("biz:quota:data:update")
    @Operation(operationId = "4", summary = "更新信息")
    public Result<Boolean> update(@Parameter(description = "更新对象") @RequestBody BizQuotaDataUpdateDTO bizQuotaDataUpdateDTO) {
        return Result.status(bizQuotaDataFacade.update(bizQuotaDataUpdateDTO));
    }

    @DeleteMapping("/")
    @SaCheckPermission("biz:quota:data:delete")
    @Operation(operationId = "5", summary = "批量删除信息")
    public Result<Boolean> batchDelete(@Parameter(description = "删除对象") @RequestBody BizQuotaDataDeleteDTO bizQuotaDataDeleteDTO) {
        return Result.status(bizQuotaDataFacade.batchDelete(bizQuotaDataDeleteDTO));
    }

}