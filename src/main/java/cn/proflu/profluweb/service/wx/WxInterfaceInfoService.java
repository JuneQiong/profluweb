package cn.proflu.profluweb.service.wx;

import cn.proflu.profluweb.pojo.wx.WxInterfaceInfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 存放所有的第三方接口信息 服务类
 * </p>
 *
 * @author Wu Huiqiong
 * @since 2018-11-04
 */
public interface WxInterfaceInfoService extends IService<WxInterfaceInfo> {

    /**
     *
     * @Title: findByCode
     * @Description: TODO(查询单个对象的用户的数据 用于页面显示
     * @param: @param id_code  String类型的id  显示的标题信息
     * @param: @return
     * @return: InterfaceInfo      查询出来的用户数据
     * @throws   建议抛异常
     */
    public WxInterfaceInfo findByCode(String id_code)throws Exception;
}
