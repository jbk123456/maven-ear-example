package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB147 {

    @EJB
    private HelperBeanA147 helperBeanA147;

    public String identify() {
        return "HelperBeanB147";
    }
}
