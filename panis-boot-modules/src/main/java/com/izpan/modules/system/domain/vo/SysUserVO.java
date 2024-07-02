package com.izpan.modules.system.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.izpan.infrastructure.domain.BaseVO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户管理 VO 类
 *
 * @Author payne.zhuang <paynezhuang@gmail.com>
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.system.domain.vo.SysUserVO
 * @CreateTime 2023/7/10 - 14:45
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "SysUserVO", description = "用户管理 VO 对象")
public class SysUserVO extends BaseVO {

    @Serial
    private static final long serialVersionUID = -3621474283154332722L;
    @Schema(description = "用户名称")
    private String userName;

    @Schema(description = "昵称")
    private String nickName;

    @Schema(description = "头像")
    private String avatar;

    @Schema(description = "邮箱")
    private String email;

    @Schema(description = "GitHub ID")
    private String githubId;

    @Schema(description = "微信ID")
    private String wechatId;

    @Schema(description = "Telegram ID")
    private String telegramId;

    @Schema(description = "访问令牌")
    private String accessToken;

    @Schema(description = "配额")
    private Long quota;

    @Schema(description = "已用配额")
    private Long usedQuota;

    @Schema(description = "请求数量")
    private Long requestCount;

    @Schema(description = "分组")
    private String group;

    @Schema(description = "邀请码")
    private String affCode;

    @Schema(description = "邀请数量")
    private Long affCount;

    @Schema(description = "邀请配额")
    private Long affQuota;

    @Schema(description = "邀请历史")
    private Long affHistory;

    @Schema(description = "邀请人ID")
    private Long inviterId;

    @Schema(description = "MD5的盐值")
    private String salt;

    @Schema(description = "最后登录时间")
    private LocalDateTime lastLoginTime;

    @Schema(description = "修改密码时间")
    private LocalDateTime updatePasswordTime;

    @Schema(description = "是否启用(0:禁用,1:启用)")
    private String status;

    @Schema(description = "路由权限按钮")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> permissions;
}
