package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH42 {

    @EJB
    private HelperBeanG42 helperBeanG42;

    public String identify() {
        return "HelperBeanH42";
    }
}
