

package ${cfg.dtoPackageName};

<#if springdoc>
import io.swagger.v3.oas.annotations.media.Schema;
</#if>
<#if entityLombokModel>
import lombok.Getter;
import lombok.Setter;
</#if>
import java.io.Serializable;

/**
 * ${table.comment!} 编辑更新 DTO 对象
 *
 * @Author ${author}
 * @ProjectName panis-boot
 * @ClassName ${cfg.dtoPackageName}.${entity}UpdateDTO
 * @CreateTime ${date}
 */

<#if entityLombokModel>
@Getter
@Setter
</#if>
<#if springdoc>
@Schema(name = "${entity}UpdateDTO", description = "${table.comment!} 编辑更新 DTO 对象")
<#elseif swagger>
@ApiModel(value = "${entity}对象", description = "${table.comment!}")
</#if>
<#if activeRecord>
public class ${entity} extends Model<${entity}> {
<#elseif entitySerialVersionUID>
public class ${entity}UpdateDTO implements Serializable {
<#else>
public class ${entity} {
</#if>
<#if entitySerialVersionUID>

</#if>

}