package com.nakami.recloud.userprovider.testController;

import org.springframework.stereotype.Service;

/**
 * Created by wuxiao on 2020/4/27
 */
@Service
public class TestEchoServiceImpl implements TestEchoService{

    @Override
    public String Echo() {
        return "this is Echo Service";
    }
}
