package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM49 {

    @EJB
    private HelperBeanL49 helperBeanL49;

    public String identify() {
        return "HelperBeanM49";
    }
}
