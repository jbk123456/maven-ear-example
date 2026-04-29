package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO89 {

    @EJB
    private HelperBeanN89 helperBeanN89;

    public String identify() {
        return "HelperBeanO89";
    }
}
