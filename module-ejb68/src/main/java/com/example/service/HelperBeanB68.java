package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB68 {

    @EJB
    private HelperBeanA68 helperBeanA68;

    public String identify() {
        return "HelperBeanB68";
    }
}
