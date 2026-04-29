package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH100 {

    @EJB
    private HelperBeanG100 helperBeanG100;

    public String identify() {
        return "HelperBeanH100";
    }
}
