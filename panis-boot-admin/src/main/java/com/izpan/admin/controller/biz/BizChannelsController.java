package com.izpan.admin.controller.biz;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.izpan.common.api.Result;
import com.izpan.infrastructure.page.PageQuery;
import com.izpan.infrastructure.page.RPage;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsAddDTO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsDeleteDTO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsSearchDTO;
import com.izpan.modules.biz.domain.dto.channels.BizChannelsUpdateDTO;
import com.izpan.modules.biz.domain.vo.BizChannelsVO;
import com.izpan.modules.biz.facade.IBizChannelsFacade;
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
 * @ClassName com.izpan.admin.controller.biz.BizChannelsController
 * @CreateTime 2024-07-01 - 22:02:12
 */

@RestController
@Tag(name = "")
@RequiredArgsConstructor
@RequestMapping("/biz_channels")
public class BizChannelsController {

    @NonNull
    private IBizChannelsFacade bizChannelsFacade;

    @GetMapping("/page")
    @SaCheckPermission("biz:channels:page")
    @Operation(operationId = "1", summary = "获取列表")
    public Result<RPage<BizChannelsVO>> page(@Parameter(description = "分页对象", required = true) PageQuery pageQuery,
                                             @Parameter(description = "查询对象") BizChannelsSearchDTO bizChannelsSearchDTO) {
        return Result.data(bizChannelsFacade.listBizChannelsPage(pageQuery, bizChannelsSearchDTO));
    }

    @GetMapping("/{id}")
    @SaCheckPermission("biz:channels:get")
    @Operation(operationId = "2", summary = "根据ID获取详细信息")
    public Result<BizChannelsVO> get(@Parameter(description = "ID") @PathVariable("id") Long id) {
        return Result.data(bizChannelsFacade.get(id));
    }

    @PostMapping("/")
    @SaCheckPermission("biz:channels:add")
    @Operation(operationId = "3", summary = "新增")
    public Result<Boolean> add(@Parameter(description = "新增对象") @RequestBody BizChannelsAddDTO bizChannelsAddDTO) {
        return Result.status(bizChannelsFacade.add(bizChannelsAddDTO));
    }

    @PutMapping("/")
    @SaCheckPermission("biz:channels:update")
    @Operation(operationId = "4", summary = "更新信息")
    public Result<Boolean> update(@Parameter(description = "更新对象") @RequestBody BizChannelsUpdateDTO bizChannelsUpdateDTO) {
        return Result.status(bizChannelsFacade.update(bizChannelsUpdateDTO));
    }

    @DeleteMapping("/")
    @SaCheckPermission("biz:channels:delete")
    @Operation(operationId = "5", summary = "批量删除信息")
    public Result<Boolean> batchDelete(@Parameter(description = "删除对象") @RequestBody BizChannelsDeleteDTO bizChannelsDeleteDTO) {
        return Result.status(bizChannelsFacade.batchDelete(bizChannelsDeleteDTO));
    }

}