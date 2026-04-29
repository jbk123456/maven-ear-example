package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI143 {

    @EJB
    private HelperBeanH143 helperBeanH143;

    public String identify() {
        return "HelperBeanI143";
    }
}
