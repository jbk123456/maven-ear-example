package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO142 {

    @EJB
    private HelperBeanN142 helperBeanN142;

    public String identify() {
        return "HelperBeanO142";
    }
}
