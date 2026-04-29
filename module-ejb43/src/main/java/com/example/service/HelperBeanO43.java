package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO43 {

    @EJB
    private HelperBeanN43 helperBeanN43;

    public String identify() {
        return "HelperBeanO43";
    }
}
