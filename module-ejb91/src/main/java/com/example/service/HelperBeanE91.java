package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE91 {

    @EJB
    private HelperBeanD91 helperBeanD91;

    public String identify() {
        return "HelperBeanE91";
    }
}
