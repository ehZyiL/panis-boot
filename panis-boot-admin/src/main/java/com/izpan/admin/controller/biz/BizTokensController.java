package com.izpan.admin.controller.biz;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.izpan.common.api.Result;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensAddDTO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensDeleteDTO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensSearchDTO;
import com.izpan.modules.biz.domain.dto.tokens.BizTokensUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizTokensVO;
import com.izpan.modules.biz.facade.IBizTokensFacade;
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
 * @ClassName com.izpan.admin.controller.biz.BizTokensController
 * @CreateTime 2024-07-01 - 22:03:03
 */

@RestController
@Tag(name = "")
@RequiredArgsConstructor
@RequestMapping("/biz_tokens")
public class BizTokensController {

    @NonNull
    private IBizTokensFacade bizTokensFacade;

    @GetMapping("/page")
    @SaCheckPermission("biz:tokens:page")
    @Operation(operationId = "1", summary = "获取列表")
    public Result<RPage<BizTokensVO>> page(@Parameter(description = "分页对象", required = true) PageQuery pageQuery,
                                           @Parameter(description = "查询对象") BizTokensSearchDTO bizTokensSearchDTO) {
        return Result.data(bizTokensFacade.listBizTokensPage(pageQuery, bizTokensSearchDTO));
    }

    @GetMapping("/{id}")
    @SaCheckPermission("biz:tokens:get")
    @Operation(operationId = "2", summary = "根据ID获取详细信息")
    public Result<BizTokensVO> get(@Parameter(description = "ID") @PathVariable("id") Long id) {
        return Result.data(bizTokensFacade.get(id));
    }

    @PostMapping("/")
    @SaCheckPermission("biz:tokens:add")
    @Operation(operationId = "3", summary = "新增")
    public Result<Boolean> add(@Parameter(description = "新增对象") @RequestBody BizTokensAddDTO bizTokensAddDTO) {
        return Result.status(bizTokensFacade.add(bizTokensAddDTO));
    }

    @PutMapping("/")
    @SaCheckPermission("biz:tokens:update")
    @Operation(operationId = "4", summary = "更新信息")
    public Result<Boolean> update(@Parameter(description = "更新对象") @RequestBody BizTokensUpdateDTO bizTokensUpdateDTO) {
        return Result.status(bizTokensFacade.update(bizTokensUpdateDTO));
    }

    @DeleteMapping("/")
    @SaCheckPermission("biz:tokens:delete")
    @Operation(operationId = "5", summary = "批量删除信息")
    public Result<Boolean> batchDelete(@Parameter(description = "删除对象") @RequestBody BizTokensDeleteDTO bizTokensDeleteDTO) {
        return Result.status(bizTokensFacade.batchDelete(bizTokensDeleteDTO));
    }

}