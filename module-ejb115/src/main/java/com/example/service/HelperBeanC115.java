package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC115 {

    @EJB
    private HelperBeanB115 helperBeanB115;

    public String identify() {
        return "HelperBeanC115";
    }
}
