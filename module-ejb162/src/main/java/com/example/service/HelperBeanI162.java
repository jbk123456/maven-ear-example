package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI162 {

    @EJB
    private HelperBeanH162 helperBeanH162;

    public String identify() {
        return "HelperBeanI162";
    }
}
