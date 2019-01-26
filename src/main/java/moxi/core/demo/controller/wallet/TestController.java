package moxi.core.demo.controller.wallet;


import lombok.extern.slf4j.Slf4j;
import moxi.core.demo.controller.BaseController;
import moxi.core.demo.entity.ResponseData;
import moxi.core.demo.service.customer.ITBizCustomerService;
import moxi.core.demo.remoteservice.CustomerWalletLogOuterService;
import moxi.core.demo.service.wallet.ITCustomerWalletLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@RestController
@RequestMapping("/tCustomerWalletLog")
@Slf4j
public class TestController extends BaseController {

    @Resource(name = "TBizCustomerServiceImpl")
    private ITBizCustomerService bizCustomerService;

    @Resource(name = "TCustomerWalletLogServiceImpl")
    private ITCustomerWalletLogService customerWalletLogService;

    @Resource
    private CustomerWalletLogOuterService customerWalletLogOuterService;

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

        Boolean customerList = customerWalletLogService.insetLogThreadQueue();
        return success(customerList);
    }

    @GetMapping("/walletLog")
    @ResponseBody
    public ResponseData walletLog(@NotNull String passwd){

        if (!passwd.equals("yesheis")) return fail(400,"暗号错误");

        Boolean customerList = customerWalletLogOuterService.subtractCustomerAvailble("123", "sadf",new BigDecimal("2"), "PENALTY", "2asdf");
//        Boolean customerList = customerWalletLogService.insetLogThreadQueue();
//        List<TBizCustomer> customerIdList = bizCustomerService.list();
        return success(customerList);
    }

}
