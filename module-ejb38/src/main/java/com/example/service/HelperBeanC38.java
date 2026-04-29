package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC38 {

    @EJB
    private HelperBeanB38 helperBeanB38;

    public String identify() {
        return "HelperBeanC38";
    }
}
