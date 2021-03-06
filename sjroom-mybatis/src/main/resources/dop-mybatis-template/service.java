package ${currentPackage};

import com.baomidou.mybatisplus.core.metadata.IPage;
import ${config.boPackage}.${upperModelName}Bo;
import ${config.entityPackage}.${upperModelName};
import github.sjroom.core.mybatis.service.BaseService;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <B>说明：服务</B><BR>
 *
 * @author ${config.author}
 * @version 1.0.0.
 * @date ${date}
 */
public interface I${upperModelName}Service extends BaseService<${upperModelName}> {

	/**
	 * 查看
	 *
	 * @param ${lowerModelName}Id 业务主键Id
	 * @return
	 */
	${upperModelName}Bo findByBId(Long ${lowerModelName}Id);

	/**
	 * 列表
	 *
	 * @param ${lowerModelName}Ids 业务主键Id
	 * @return
	 */
	List<${upperModelName}Bo> findByBIds(Set<Long> ${lowerModelName}Ids);

	/**
	 * 列表
	 *
	 * @param ${lowerModelName}Bo 业务model
	 * @return
	 */
	List<${upperModelName}Bo> findList(${upperModelName}Bo ${lowerModelName}Bo);

	/**
	 * 列表
	 *
	 * @param ${lowerModelName}Bo 业务model
	 * @return 键值对
	 */
	Map<Long, ${upperModelName}Bo> findMap(${upperModelName}Bo ${lowerModelName}Bo);

	/**
	 * 分页
	 *
	 * @param ${lowerModelName}Bo
	 * @return
	 */
	IPage<${upperModelName}Bo> findPage(${upperModelName}Bo ${lowerModelName}Bo);

	/**
	 * 注解：@fillFieldName，填充字段的专用方法
	 * 如果不需要用该注解，直接删除该方法即可
	 *
	 * @param bIds 业务model
	 * @return 键值对
	 */
	Map<Long, String> fillFieldName(Set<Long> bIds);
}
