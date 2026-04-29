package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO108 {

    @EJB
    private HelperBeanN108 helperBeanN108;

    public String identify() {
        return "HelperBeanO108";
    }
}
