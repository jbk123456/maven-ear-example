package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI43 {

    @EJB
    private HelperBeanH43 helperBeanH43;

    public String identify() {
        return "HelperBeanI43";
    }
}
