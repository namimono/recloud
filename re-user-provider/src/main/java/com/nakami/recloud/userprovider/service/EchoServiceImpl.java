package com.nakami.recloud.userprovider.service;

import com.nakami.recloud.userprovider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class EchoServiceImpl implements EchoService {

    @Override
    public String Echo() {
        return "Echo--------------------++";
    }
}
