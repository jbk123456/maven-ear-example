package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC83 {

    @EJB
    private HelperBeanB83 helperBeanB83;

    public String identify() {
        return "HelperBeanC83";
    }
}
