package cn.proflu.profluweb.service.wx.impl;

import cn.proflu.profluweb.pojo.wx.WxInterfaceInfo;
import cn.proflu.profluweb.dao.wx.WxInterfaceInfoMapper;
import cn.proflu.profluweb.service.wx.WxInterfaceInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 *<p>Title: WxInterfaceInfoServiceImpl.java<／p>
 *<p>Description:  接口的实体类 <／p>
 * @ClassName:  WxInterfaceInfoServiceImpl
 * @author Wu Huiqiong
 * @date 2018年11月4日
 * @version 1.0
 */
@Service
public class WxInterfaceInfoServiceImpl extends ServiceImpl<WxInterfaceInfoMapper, WxInterfaceInfo> implements WxInterfaceInfoService {

    /**
	 *
             *
             * <p>Title: findByCode</p>
            * <p>Description:  查询用户信息接口InterfaceInfoService的实现类
	 *     用于XXXXX
	 *    </p>
            * @param id_code    用户标题编号Stirng类型
	 * @return       查询用户的信息
	 * @see  cn.proflu.profluweb.service.wx.impl.WxInterfaceInfoServiceImpl#findByCode(java.lang.String)
	 */

    @Override
    public WxInterfaceInfo findByCode(String id_code)throws Exception{
        QueryWrapper<WxInterfaceInfo> queryWrapper =  new QueryWrapper<>();

        WxInterfaceInfo wxInterfaceInfo = new WxInterfaceInfo();
        wxInterfaceInfo.setInCode(id_code);
        queryWrapper.setEntity(wxInterfaceInfo);
        WxInterfaceInfo one =  getOne(queryWrapper);
        return one;
    }
}
