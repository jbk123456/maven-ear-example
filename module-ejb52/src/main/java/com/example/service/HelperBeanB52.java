package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB52 {

    @EJB
    private HelperBeanA52 helperBeanA52;

    public String identify() {
        return "HelperBeanB52";
    }
}
