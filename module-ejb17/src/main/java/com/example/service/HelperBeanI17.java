package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI17 {

    @EJB
    private HelperBeanH17 helperBeanH17;

    public String identify() {
        return "HelperBeanI17";
    }
}
