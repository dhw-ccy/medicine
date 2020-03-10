package com.medicine.medicineserver.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 员工表实体类
 *
 */
@Data
@Entity//@Entity：告诉JPA这个一个实体类（和数据表映射的类）
@Table(name = "employee")//@Table：来指定和哪个数据表对应,如果省略默认表名是 employee（类名小写）
/**
 * @DynamicInsert 属性：设置为true，表示insert对象的时候，生成动态的insert语句，
 * 如果这个字段的值是null就不会加入到insert语句中，默认false。
 */
@DynamicInsert
public class Employee implements Serializable {
	/**
	 * 员工Id
	 */
	@Id//@Id：这个是一个主键
	@GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
	private Integer employeeId;
	/**
	 * 账号名字
	 */
	@Column(name = "employee_Name")//@Column：这个和数据表对应的一个列,省略默认列名就是属性名
	private String employeeName;
	/**
	 * 密码
	 */
	@Column(name = "employee_password")
	private String employeePassword;
	/**
	 * 二级隐藏密码
	 */
	@Column(name = "employee_salt")
	private String employeeSalt;
	/**
	 * 年龄
	 */
	@Column(name = "employee_age")
	private Integer employeeAge;
	/**
	 * 性别
	 */
	@Column(name = "employee_sex")
	private String employeeSex;
	/**
	 * 联系方式
	 */
	@Column(name = "employee_tel")
	private String employeeTel;
	/**
	 * 员工头像
	 */
	@Column(name = "head_url")
	private String headUrl;
	/**
	 * 身份证号码
	 */
	@Column(name = "idCard")
	private String idCard;
	/**
	 * 地址
	 */
	@Column(name = "addr")
	private String addr;
	/**
	 * 学历
	 */
	@Column(name = "study_undergo")
	private String studyUndergo;
	/**
	 * 角色id
	 */
	@Column(name = "role_Id")
	private Integer roleId;
	/**
	 * 部门id
	 */
	@Column(name = "dep_Id")
	private Integer depId;

	/**
	 * 角色表
	 */
	//private Role role;
	
	
	
}
