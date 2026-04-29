package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC73 {

    @EJB
    private HelperBeanB73 helperBeanB73;

    public String identify() {
        return "HelperBeanC73";
    }
}
