package com.example.service;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class StartupBean112 {

    private long initResult;

    @PostConstruct
    public void init() {
        // CPU-intensive work: forces Liberty to spend time in @PostConstruct
        long result = 0;
        for (int i = 0; i < 20_000_000; i++) {
            result += Integer.bitCount(i * 1337 + 112);
        }
        this.initResult = result;
    }

    public long getInitResult() {
        return initResult;
    }
}
