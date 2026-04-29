package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG147 {

    @EJB
    private HelperBeanF147 helperBeanF147;

    public String identify() {
        return "HelperBeanG147";
    }
}
