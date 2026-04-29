package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC45 {

    @EJB
    private HelperBeanB45 helperBeanB45;

    public String identify() {
        return "HelperBeanC45";
    }
}
