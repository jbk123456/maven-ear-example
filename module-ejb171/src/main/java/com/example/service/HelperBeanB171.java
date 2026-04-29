package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB171 {

    @EJB
    private HelperBeanA171 helperBeanA171;

    public String identify() {
        return "HelperBeanB171";
    }
}
