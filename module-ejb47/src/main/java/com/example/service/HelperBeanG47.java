package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG47 {

    @EJB
    private HelperBeanF47 helperBeanF47;

    public String identify() {
        return "HelperBeanG47";
    }
}
