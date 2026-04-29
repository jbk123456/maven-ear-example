package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH43 {

    @EJB
    private HelperBeanG43 helperBeanG43;

    public String identify() {
        return "HelperBeanH43";
    }
}
