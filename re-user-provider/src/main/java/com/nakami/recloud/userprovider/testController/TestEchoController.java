package com.nakami.recloud.userprovider.testController;

import com.nakami.recloud.userprovider.api.EchoService;
import com.nakami.recloud.userprovider.service.EchoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class TestEchoController {
    @Autowired
    TestEchoService testEchoService;

    @GetMapping("getEcho")
    public String getEcho(){
        return testEchoService.Echo();
    }
}
