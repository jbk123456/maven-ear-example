package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB105 {

    @EJB
    private HelperBeanA105 helperBeanA105;

    public String identify() {
        return "HelperBeanB105";
    }
}
