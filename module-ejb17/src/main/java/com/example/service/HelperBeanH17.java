package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH17 {

    @EJB
    private HelperBeanG17 helperBeanG17;

    public String identify() {
        return "HelperBeanH17";
    }
}
