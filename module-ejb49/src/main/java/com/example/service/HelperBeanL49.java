package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL49 {

    @EJB
    private HelperBeanK49 helperBeanK49;

    public String identify() {
        return "HelperBeanL49";
    }
}
