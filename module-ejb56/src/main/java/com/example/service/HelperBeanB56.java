package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB56 {

    @EJB
    private HelperBeanA56 helperBeanA56;

    public String identify() {
        return "HelperBeanB56";
    }
}
