package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC74 {

    @EJB
    private HelperBeanB74 helperBeanB74;

    public String identify() {
        return "HelperBeanC74";
    }
}
