package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ102 {

    @EJB
    private HelperBeanI102 helperBeanI102;

    public String identify() {
        return "HelperBeanJ102";
    }
}
