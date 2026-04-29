package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC172 {

    @EJB
    private HelperBeanB172 helperBeanB172;

    public String identify() {
        return "HelperBeanC172";
    }
}
