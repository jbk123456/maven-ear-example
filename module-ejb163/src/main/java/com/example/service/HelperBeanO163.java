package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO163 {

    @EJB
    private HelperBeanN163 helperBeanN163;

    public String identify() {
        return "HelperBeanO163";
    }
}
