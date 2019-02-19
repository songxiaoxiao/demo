package moxi.core.demo.controller.wallet;


import lombok.extern.slf4j.Slf4j;
import moxi.core.demo.controller.BaseController;
import moxi.core.demo.entity.ResponseData;
import moxi.core.demo.service.customer.ITBizCustomerService;
import moxi.core.demo.service.wallet.ITCustomerWalletService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

@Controller
@RequestMapping("/tCustomerWalletLog")
@Slf4j
public class TestController extends BaseController {

    @Resource(name = "TBizCustomerServiceImpl")
    private ITBizCustomerService bizCustomerService;

//    @Resource(name = "TCustomerWalletLogServiceImpl")
//    private ITCustomerWalletLogService customerWalletLogService;
    @Resource(name = "TCustomerWalletServiceImpl")
    private ITCustomerWalletService customerWalletService;

//    @Resource
//    private CustomerWalletLogOuterService customerWalletLogOuterService;

    @GetMapping("/customer")
    @ResponseBody
    public ResponseData customer(@NotNull String passwd){
        if (!passwd.equals("xxIsHandsomeGuy")) return fail(400,"暗号错误");

        Boolean customerList = bizCustomerService.setThreadQueue();
        return success(customerList);
    }
    @GetMapping("/insertLog")
    @ResponseBody
    public ResponseData insertLog(@NotNull String passwd){

        if (!passwd.equals("yesheis")) return fail(400,"暗号错误");

        Boolean customerList = customerWalletService.insetLogThreadQueue();
        return success(customerList);
    }

    @GetMapping("/update")
    @ResponseBody
    public ResponseData update(@NotNull String passwd){

        if (!passwd.equals("yesheis")) return fail(400,"暗号错误");

        Boolean customerList = customerWalletService.updateCustomerAvailble();
        return success(customerList);
    }

    @GetMapping("/rever")
    @ResponseBody
    public ResponseData rever(@NotNull String passwd){

        if (!passwd.equals("yesheis")) return fail(400,"暗号错误");

        Boolean customerList = customerWalletService.reverWalletLog();
        return success(customerList);
    }

}
