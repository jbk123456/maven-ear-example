package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC162 {

    @EJB
    private HelperBeanB162 helperBeanB162;

    public String identify() {
        return "HelperBeanC162";
    }
}
