package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC95 {

    @EJB
    private HelperBeanB95 helperBeanB95;

    public String identify() {
        return "HelperBeanC95";
    }
}
