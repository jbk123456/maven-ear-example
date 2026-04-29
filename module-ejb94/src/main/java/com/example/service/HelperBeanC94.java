package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC94 {

    @EJB
    private HelperBeanB94 helperBeanB94;

    public String identify() {
        return "HelperBeanC94";
    }
}
