package io.mosip.kernel.masterdata.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Entity class for IdType.
 * 
 * @author Sagar Mahapatra
 * @since 1.0.0
 *
 */
@Data
@Entity
@Table(name = "id_type", schema = "master")
@IdClass(CodeAndLanguageCodeId.class)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class IdType extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -97767928612692201L;

	@Id
	@AttributeOverrides({ @AttributeOverride(name = "code", column = @Column(name = "code", length = 36)),
			@AttributeOverride(name = "langCode", column = @Column(name = "lang_code", nullable = false, length = 3)) })
	private String code;
	private String langCode;
	@Column(name = "name", nullable = false, length = 64)
	private String name;

	@Column(name = "descr", length = 128)
	private String descr;
}
