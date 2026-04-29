package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG100 {

    @EJB
    private HelperBeanF100 helperBeanF100;

    public String identify() {
        return "HelperBeanG100";
    }
}
