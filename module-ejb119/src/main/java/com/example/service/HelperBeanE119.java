package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE119 {

    @EJB
    private HelperBeanD119 helperBeanD119;

    public String identify() {
        return "HelperBeanE119";
    }
}
