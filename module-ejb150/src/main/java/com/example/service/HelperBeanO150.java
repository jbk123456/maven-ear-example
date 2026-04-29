package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO150 {

    @EJB
    private HelperBeanN150 helperBeanN150;

    public String identify() {
        return "HelperBeanO150";
    }
}
