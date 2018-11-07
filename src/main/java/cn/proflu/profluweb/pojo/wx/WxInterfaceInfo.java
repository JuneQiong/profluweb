package cn.proflu.profluweb.pojo.wx;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 *
 *<p>Title: InterfaceInfo.java<／p>
 *<p>Description:  接口的实体类 <／p>
 * @ClassName:  InterfaceInfo
 * @author Wu Huiqiong
 * @date 2018年11月4日
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("wx_interface_info")

public class WxInterfaceInfo extends Model<WxInterfaceInfo> {

    private static final long serialVersionUID = 1L;


    /**
     * @Fields inId : TODO(用户的编号
     */
    @TableId(value = "IN_ID", type = IdType.AUTO)
    private Integer inId;


    /**
     * @Fields inId : TODO(用户的编号
     */
    @TableField("IN_CODE")
    private String inCode;

    @TableField("IN_URL")
    private String inUrl;

    @TableField("IN_ROLE")
    private String inRole;

    @TableField("IN_PARMS")
    private String inParms;

    @TableField("IN_ISUSE")
    private Integer inIsuse;


    @Override
    protected Serializable pkVal() {
        return this.inId;
    }

}
