package moxi.core.demo.controller;

import lombok.extern.slf4j.Slf4j;
import moxi.core.demo.entity.ResponseData;
import moxi.core.demo.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;

@Controller
@RequestMapping("/tCustomerWalletLog")
@Slf4j
public class SeanController extends BaseController {

    @Autowired
    private IContractService iContractService;

    @GetMapping("/contractSubUpdateState")
    @ResponseBody
    public ResponseData update(@NotNull String passwd) {

        if (!passwd.equals("sean666")) return fail(400,"暗号错误");

        Boolean result = iContractService.updateContractState();

        return success(result);
    }

}
