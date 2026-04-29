package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG94 {

    @EJB
    private HelperBeanF94 helperBeanF94;

    public String identify() {
        return "HelperBeanG94";
    }
}
