package com.wojucai.export.api;

import com.wojucai.entity.Result;
import com.wojucai.entity.codeEnum.ResultEnum;
import com.wojucai.entity.reqParam.ClientQuery;
import com.wojucai.service.ClientService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.wojucai.util.ParamsVerify.verifyString;

/**
 * @description: 客户端控制类
 * @author: xuyujie
 * @date: 2023/06/11
 **/
@Api(tags = "Controller-Client")
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/queryClientByName")
    public Result queryClientByName(ClientQuery clientQuery) {
        if (!verifyString(clientQuery.getClientName())) {
            return Result.fail(ResultEnum.ParamIllegal);
        }
        return Result.success(clientService.queryByClientName(clientQuery.getClientName(),
                clientQuery.getPageNow(), clientQuery.getPageNumber()), ResultEnum.RequestSuccess);
    }


}
