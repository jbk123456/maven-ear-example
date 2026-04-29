package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO22 {

    @EJB
    private HelperBeanN22 helperBeanN22;

    public String identify() {
        return "HelperBeanO22";
    }
}
