package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO68 {

    @EJB
    private HelperBeanN68 helperBeanN68;

    public String identify() {
        return "HelperBeanO68";
    }
}
