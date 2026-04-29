package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE141 {

    @EJB
    private HelperBeanD141 helperBeanD141;

    public String identify() {
        return "HelperBeanE141";
    }
}
