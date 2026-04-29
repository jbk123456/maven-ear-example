package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK102 {

    @EJB
    private HelperBeanJ102 helperBeanJ102;

    public String identify() {
        return "HelperBeanK102";
    }
}
