package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC147 {

    @EJB
    private HelperBeanB147 helperBeanB147;

    public String identify() {
        return "HelperBeanC147";
    }
}
