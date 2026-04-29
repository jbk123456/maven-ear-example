package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH2 {

    @EJB
    private HelperBeanG2 helperBeanG2;

    public String identify() {
        return "HelperBeanH2";
    }
}
