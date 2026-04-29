package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB114 {

    @EJB
    private HelperBeanA114 helperBeanA114;

    public String identify() {
        return "HelperBeanB114";
    }
}
