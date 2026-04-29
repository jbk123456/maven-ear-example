package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC88 {

    @EJB
    private HelperBeanB88 helperBeanB88;

    public String identify() {
        return "HelperBeanC88";
    }
}
