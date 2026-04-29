package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC47 {

    @EJB
    private HelperBeanB47 helperBeanB47;

    public String identify() {
        return "HelperBeanC47";
    }
}
