/*
 * Powered By [cfth]
 * Web Site: 财富天湖
 * Since 2018 - 2018
 */

package com.wealthlake.sb_demo.dataaccess.domain;

import com.wealthlake.common.util.date.DateConvertUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018 </p>
 * <p>Company: cfth </p>
 *
 * @author xxx
 * @version 1.0
 * @date 2018/06/22
 * @since 1.0
 */

@ApiModel(value = "用户信息", description = "用户信息")
public class UserDO implements Serializable {
    private static final long serialVersionUID = 5454155825314635342L;

    //alias
    public static final String TABLE_ALIAS = "User";
    public static final String ALIAS_ID = "id";
    public static final String ALIAS_NAME = "姓名";
    public static final String ALIAS_PHONE = "手机号";
    public static final String ALIAS_SEX = "性别，1：男，2：女";
    public static final String ALIAS_BIRTHDAY = "出生日期";
    public static final String ALIAS_CREATE_TIME = "创建时间";
    public static final String ALIAS_PASSWORD = "密码";
    public static final String ALIAS_PASSWORD_TYPE = "密码类型：MD5，SHA256";
    public static final String ALIAS_PASSWORD_SALT = "密码盐值";
    public static final String ALIAS_LAST_LOGIN_TIME = "最后一次登录时间";
    public static final String ALIAS_LAST_LOGIN_IP = "最后一次登录ip";

    //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
    //columns START
    /**
     * id       db_column: id
     */
    @ApiModelProperty(value = "用户标识")
    private Integer id;
    /**
     * 姓名       db_column: name
     */
    @ApiModelProperty(value = "姓名")
    private String name;
    /**
     * 手机号       db_column: phone
     */
    @ApiModelProperty(value = "手机号")
    private String phone;
    /**
     * 性别，1：男，2：女       db_column: sex
     */
    @ApiModelProperty(value = "性别")
    private Integer sex;
    /**
     * 出生日期       db_column: birthday
     */
    @ApiModelProperty(value = "出生日期")
    private Date birthday;
    /**
     * 创建时间       db_column: create_time
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    /**
     * 密码       db_column: password
     */
    @ApiModelProperty(value = "密码")
    private String password;
    /**
     * 密码类型：MD5，SHA256       db_column: password_type
     */
    @ApiModelProperty(value = "密码类型")
    private String passwordType;
    /**
     * 密码盐值       db_column: password_salt
     */
    @ApiModelProperty(value = "密码盐值", hidden = true)
    private String passwordSalt;
    /**
     * 最后一次登录时间       db_column: last_login_time
     */
    @ApiModelProperty(value = "最后一次登录时间")
    private Date lastLoginTime;
    /**
     * 最后一次登录ip       db_column: last_login_ip
     */
    @ApiModelProperty(value = "最后一次登录ip")
    private String lastLoginIp;
    //columns END

    public UserDO() {

    }

    public UserDO(Integer id) {
        this.id = id;
    }

    public void setId(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return this.id;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(String value) {
        this.phone = value;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setSex(Integer value) {
        this.sex = value;
    }

    public Integer getSex() {
        return this.sex;
    }

    @ApiModelProperty(hidden = true)
    public String getBirthdayString() {
        if (getBirthday() != null) {
            return DateConvertUtils.format(getBirthday(), DateConvertUtils.FORMAT_SECOND);
        } else {
            return null;
        }
    }

    public void setBirthdayString(String value) {
        if (value != null) {
            setBirthday(DateConvertUtils.parse(value, DateConvertUtils.FORMAT_SECOND));
        }
    }

    public void setBirthday(Date value) {
        this.birthday = value;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    @ApiModelProperty(hidden = true)
    public String getCreateTimeString() {
        if (getCreateTime() != null) {
            return DateConvertUtils.format(getCreateTime(), DateConvertUtils.FORMAT_SECOND);
        } else {
            return null;
        }
    }

    public void setCreateTimeString(String value) {
        if (value != null) {
            setCreateTime(DateConvertUtils.parse(value, DateConvertUtils.FORMAT_SECOND));
        }
    }

    public void setCreateTime(Date value) {
        this.createTime = value;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPasswordType(String value) {
        this.passwordType = value;
    }

    public String getPasswordType() {
        return this.passwordType;
    }

    public void setPasswordSalt(String value) {
        this.passwordSalt = value;
    }

    public String getPasswordSalt() {
        return this.passwordSalt;
    }

    @ApiModelProperty(hidden = true)
    public String getLastLoginTimeString() {
        if (getLastLoginTime() != null) {
            return DateConvertUtils.format(getLastLoginTime(), DateConvertUtils.FORMAT_SECOND);
        } else {
            return null;
        }
    }

    public void setLastLoginTimeString(String value) {
        if (value != null) {
            setLastLoginTime(DateConvertUtils.parse(value, DateConvertUtils.FORMAT_SECOND));
        }
    }

    public void setLastLoginTime(Date value) {
        this.lastLoginTime = value;
    }

    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginIp(String value) {
        this.lastLoginIp = value;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("Id", getId())
                .append("Name", getName())
                .append("Phone", getPhone())
                .append("Sex", getSex())
                .append("Birthday", getBirthday())
                .append("CreateTime", getCreateTime())
                .append("Password", getPassword())
                .append("PasswordType", getPasswordType())
                .append("PasswordSalt", getPasswordSalt())
                .append("LastLoginTime", getLastLoginTime())
                .append("LastLoginIp", getLastLoginIp())
                .toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UserDO == false) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        UserDO other = (UserDO) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }
}

