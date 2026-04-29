package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ126 {

    @EJB
    private HelperBeanI126 helperBeanI126;

    public String identify() {
        return "HelperBeanJ126";
    }
}
