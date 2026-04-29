package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO48 {

    @EJB
    private HelperBeanN48 helperBeanN48;

    public String identify() {
        return "HelperBeanO48";
    }
}
