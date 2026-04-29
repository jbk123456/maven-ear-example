package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG119 {

    @EJB
    private HelperBeanF119 helperBeanF119;

    public String identify() {
        return "HelperBeanG119";
    }
}
