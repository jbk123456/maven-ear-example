package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC86 {

    @EJB
    private HelperBeanB86 helperBeanB86;

    public String identify() {
        return "HelperBeanC86";
    }
}
