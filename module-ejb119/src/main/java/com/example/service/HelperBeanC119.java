package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC119 {

    @EJB
    private HelperBeanB119 helperBeanB119;

    public String identify() {
        return "HelperBeanC119";
    }
}
