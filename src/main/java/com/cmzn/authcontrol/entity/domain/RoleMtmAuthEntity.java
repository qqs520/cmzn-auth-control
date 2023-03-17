package com.cmzn.authcontrol.entity.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 角色与权限中间表(多对多)
 * 
 * @author hhc
 * @email 12487489@qq.com
 * @date 2023-03-16 16:28:54
 */
@Data
@TableName("role_mtm_auth")
public class RoleMtmAuthEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 是否删除
	 */
	private Integer del;
	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	private LocalDateTime createTime;
	/**
	 * 修改时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updateTime;
	/**
	 * 关联role表
	 */
	private Long roleId;
	/**
	 * 关联auth表
	 */
	private Long authId;

}
