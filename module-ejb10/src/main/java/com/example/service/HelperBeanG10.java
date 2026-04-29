package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG10 {

    @EJB
    private HelperBeanF10 helperBeanF10;

    public String identify() {
        return "HelperBeanG10";
    }
}
