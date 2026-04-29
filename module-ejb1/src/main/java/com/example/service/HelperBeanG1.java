package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG1 {

    @EJB
    private HelperBeanF1 helperBeanF1;

    public String identify() {
        return "HelperBeanG1";
    }
}
