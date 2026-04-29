package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC143 {

    @EJB
    private HelperBeanB143 helperBeanB143;

    public String identify() {
        return "HelperBeanC143";
    }
}
