package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG73 {

    @EJB
    private HelperBeanF73 helperBeanF73;

    public String identify() {
        return "HelperBeanG73";
    }
}
