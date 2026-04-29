package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC14 {

    @EJB
    private HelperBeanB14 helperBeanB14;

    public String identify() {
        return "HelperBeanC14";
    }
}
