package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE95 {

    @EJB
    private HelperBeanD95 helperBeanD95;

    public String identify() {
        return "HelperBeanE95";
    }
}
