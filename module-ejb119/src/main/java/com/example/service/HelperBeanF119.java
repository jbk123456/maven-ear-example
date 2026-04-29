package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF119 {

    @EJB
    private HelperBeanE119 helperBeanE119;

    public String identify() {
        return "HelperBeanF119";
    }
}
