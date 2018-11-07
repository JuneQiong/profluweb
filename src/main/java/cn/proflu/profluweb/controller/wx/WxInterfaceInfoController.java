package cn.proflu.profluweb.controller.wx;


import javax.annotation.Resource;
import javax.websocket.server.PathParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;


import cn.proflu.profluweb.common.utils.HttpUtil;
import cn.proflu.profluweb.pojo.wx.WxInterfaceInfo;
import cn.proflu.profluweb.service.wx.WxInterfaceInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 存放所有的第三方接口信息 前端控制器
 * </p>
 *
 * @author dyaln
 * @since 2018-11-03
 */
@RestController
@RequestMapping("/app/home")
//@Api(value="主页",tags="主页的接口")
//@Slf4j
public class WxInterfaceInfoController {


    @Autowired
    private WxInterfaceInfoService  wxInterfaceInfoService;



	  @GetMapping("/getByIdCode/{appid}")
	  @ResponseBody
//	 @ApiOperation(value="接口的列表",tags={"导入接口的名称"},notes="类型：appid")
//	 @ApiImplicitParams({@ApiImplicitParam(name="appid",value="表示导航栏的id标题")})
	  public  String getByIdCode(@PathVariable("appid")String  appid) throws Exception {

		  WxInterfaceInfo findByCode = wxInterfaceInfoService.findByCode(appid);
		System.out.println("findByCode"+findByCode);
		String sendGet = HttpUtil.sendGet(findByCode.getInUrl(),"appid='"+appid+"'");
		  return  sendGet;
	  }




}
