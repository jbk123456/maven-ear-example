package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC136 {

    @EJB
    private HelperBeanB136 helperBeanB136;

    public String identify() {
        return "HelperBeanC136";
    }
}
