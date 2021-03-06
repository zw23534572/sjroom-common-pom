package ${currentPackage};

import ${config.voPackage}.${upperModelName}PageReqVo;
import ${config.voPackage}.${upperModelName}ReqVo;
import ${config.voPackage}.${upperModelName}RespVo;
import ${config.servicePackage}.I${upperModelName}ServiceComp;
import github.sjroom.core.mybatis.page.PageResult;
import github.sjroom.core.mybatis.page.PageUtil;
import github.sjroom.web.vo.IdStatusListVo;
import github.sjroom.web.vo.IdListVo;
import github.sjroom.web.vo.IdVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * <B>说明：${dbTableInfo.comment} 控制器</B><BR>
 *
 * @author ${config.author}
 * @version 1.0.0
 * @since ${date}
 */
@Slf4j
@Validated
@RestController
@RequestMapping("${controllerMappingHyphen}")
@Api("${dbTableInfo.comment} 控制器")
public class ${upperModelName}Controller {
	@Autowired
	private I${upperModelName}ServiceComp i${upperModelName}ServiceComp;

	@ApiOperation(value = "查看", notes = "传入id")
	@PostMapping("find")
	@PreAuthorize("hasRole('ROLE_${strutil.toUpperCase(dbTableInfo.tableName)}_SELECT')")
	public ${upperModelName}RespVo find(@Validated @RequestBody IdVo<Long> idVo) {
		return i${upperModelName}ServiceComp.find(idVo);
	}

	@ApiOperation("分页")
	@PostMapping("page")
	@PreAuthorize("hasRole('ROLE_${strutil.toUpperCase(dbTableInfo.tableName)}_SELECT')")
	public PageResult page(@Validated @RequestBody ${upperModelName}PageReqVo reqVo) {
		return PageUtil.toPageResult(i${upperModelName}ServiceComp.page(reqVo), ${upperModelName}RespVo.class);
	}

	@ApiOperation("列表")
	@PostMapping("list")
	@PreAuthorize("hasRole('ROLE_${strutil.toUpperCase(dbTableInfo.tableName)}_SELECT')")
	public List<${upperModelName}RespVo> list(@RequestBody ${upperModelName}ReqVo reqVo) {
		return i${upperModelName}ServiceComp.list(reqVo);
	}

	@ApiOperation("创建")
	@PostMapping("create")
	@PreAuthorize("hasRole('ROLE_${strutil.toUpperCase(dbTableInfo.tableName)}_CREATE')")
	public Long create(@Validated @RequestBody ${upperModelName}ReqVo ${lowerModelName}ReqVo) {
		return i${upperModelName}ServiceComp.create(${lowerModelName}ReqVo);
	}

	@ApiOperation("更新")
	@PostMapping("update")
	@PreAuthorize("hasRole('ROLE_${strutil.toUpperCase(dbTableInfo.tableName)}_UPDATE')")
	public void update(@Validated @RequestBody ${upperModelName}ReqVo ${lowerModelName}ReqVo) {
		i${upperModelName}ServiceComp.update(${lowerModelName}ReqVo);
	}

	@ApiOperation(value = "批量更新", notes = "传入id")
	@PostMapping("batch-update")
	@PreAuthorize("hasRole('ROLE_${strutil.toUpperCase(dbTableInfo.tableName)}_UPDATE')")
	public void batchUpdate(@Validated @RequestBody IdStatusListVo idStatusListVo) {
		i${upperModelName}ServiceComp.updateBatch(idStatusListVo);
	}

	@ApiOperation(value = "批量删除", notes = "传入id")
	@PostMapping("batch-remove")
	@PreAuthorize("hasRole('ROLE_${strutil.toUpperCase(dbTableInfo.tableName)}_REMOVE')")
	public void removeUpdate(@Validated @RequestBody IdListVo<Long> idListVo) {
		i${upperModelName}ServiceComp.removeBatch(idListVo);
	}
}
