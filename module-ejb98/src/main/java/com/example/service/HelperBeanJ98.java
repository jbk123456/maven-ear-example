package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ98 {

    @EJB
    private HelperBeanI98 helperBeanI98;

    public String identify() {
        return "HelperBeanJ98";
    }
}
