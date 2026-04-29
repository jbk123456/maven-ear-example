package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN94 {

    @EJB
    private HelperBeanM94 helperBeanM94;

    public String identify() {
        return "HelperBeanN94";
    }
}
