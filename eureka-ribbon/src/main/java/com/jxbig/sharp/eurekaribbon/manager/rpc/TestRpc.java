package com.jxbig.sharp.eurekaribbon.manager.rpc;

import com.jxbig.sharp.eurekaribbon.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/${request.prefix}")
public class TestRpc {

    @Autowired
    private TestService testService;

    @RequestMapping("/oneHi")
    public String oneHi() {
        return testService.oneHi();
    }

}
