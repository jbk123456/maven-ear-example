package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG69 {

    @EJB
    private HelperBeanF69 helperBeanF69;

    public String identify() {
        return "HelperBeanG69";
    }
}
