package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO94 {

    @EJB
    private HelperBeanN94 helperBeanN94;

    public String identify() {
        return "HelperBeanO94";
    }
}
