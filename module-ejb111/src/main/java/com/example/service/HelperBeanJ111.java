package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ111 {

    @EJB
    private HelperBeanI111 helperBeanI111;

    public String identify() {
        return "HelperBeanJ111";
    }
}
