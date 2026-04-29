package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG2 {

    @EJB
    private HelperBeanF2 helperBeanF2;

    public String identify() {
        return "HelperBeanG2";
    }
}
