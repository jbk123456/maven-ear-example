package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN105 {

    @EJB
    private HelperBeanM105 helperBeanM105;

    public String identify() {
        return "HelperBeanN105";
    }
}
