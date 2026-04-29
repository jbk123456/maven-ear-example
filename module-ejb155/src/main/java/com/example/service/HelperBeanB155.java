package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB155 {

    @EJB
    private HelperBeanA155 helperBeanA155;

    public String identify() {
        return "HelperBeanB155";
    }
}
