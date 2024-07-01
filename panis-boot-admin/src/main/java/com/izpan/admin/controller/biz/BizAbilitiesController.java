package com.izpan.admin.controller.biz;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.izpan.common.api.Result;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesAddDTO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesDeleteDTO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesSearchDTO;
import com.izpan.modules.biz.domain.dto.abilities.BizAbilitiesUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizAbilitiesVO;
import com.izpan.modules.biz.facade.IBizAbilitiesFacade;
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
 * @ClassName com.izpan.admin.controller.biz.BizAbilitiesController
 * @CreateTime 2024-07-01 - 22:02:52
 */

@RestController
@Tag(name = "")
@RequiredArgsConstructor
@RequestMapping("/biz_abilities")
public class BizAbilitiesController {

    @NonNull
    private IBizAbilitiesFacade bizAbilitiesFacade;

    @GetMapping("/page")
    @SaCheckPermission("biz:abilities:page")
    @Operation(operationId = "1", summary = "获取列表")
    public Result<RPage<BizAbilitiesVO>> page(@Parameter(description = "分页对象", required = true) PageQuery pageQuery,
                                              @Parameter(description = "查询对象") BizAbilitiesSearchDTO bizAbilitiesSearchDTO) {
        return Result.data(bizAbilitiesFacade.listBizAbilitiesPage(pageQuery, bizAbilitiesSearchDTO));
    }

    @GetMapping("/{id}")
    @SaCheckPermission("biz:abilities:get")
    @Operation(operationId = "2", summary = "根据ID获取详细信息")
    public Result<BizAbilitiesVO> get(@Parameter(description = "ID") @PathVariable("id") Long id) {
        return Result.data(bizAbilitiesFacade.get(id));
    }

    @PostMapping("/")
    @SaCheckPermission("biz:abilities:add")
    @Operation(operationId = "3", summary = "新增")
    public Result<Boolean> add(@Parameter(description = "新增对象") @RequestBody BizAbilitiesAddDTO bizAbilitiesAddDTO) {
        return Result.status(bizAbilitiesFacade.add(bizAbilitiesAddDTO));
    }

    @PutMapping("/")
    @SaCheckPermission("biz:abilities:update")
    @Operation(operationId = "4", summary = "更新信息")
    public Result<Boolean> update(@Parameter(description = "更新对象") @RequestBody BizAbilitiesUpdateDTO bizAbilitiesUpdateDTO) {
        return Result.status(bizAbilitiesFacade.update(bizAbilitiesUpdateDTO));
    }

    @DeleteMapping("/")
    @SaCheckPermission("biz:abilities:delete")
    @Operation(operationId = "5", summary = "批量删除信息")
    public Result<Boolean> batchDelete(@Parameter(description = "删除对象") @RequestBody BizAbilitiesDeleteDTO bizAbilitiesDeleteDTO) {
        return Result.status(bizAbilitiesFacade.batchDelete(bizAbilitiesDeleteDTO));
    }

}