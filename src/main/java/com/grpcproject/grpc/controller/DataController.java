package com.grpcproject.grpc.controller;


import com.grpcproject.grpc.client.KaikoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DataController {

    @Autowired
    private KaikoClient kaikoClient;

    @GetMapping("/data")
    public void getData() throws IOException {
        kaikoClient.initClient();
    }
}
