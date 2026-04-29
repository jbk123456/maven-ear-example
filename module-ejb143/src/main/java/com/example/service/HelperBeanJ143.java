package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ143 {

    @EJB
    private HelperBeanI143 helperBeanI143;

    public String identify() {
        return "HelperBeanJ143";
    }
}
