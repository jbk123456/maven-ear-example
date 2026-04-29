package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO54 {

    @EJB
    private HelperBeanN54 helperBeanN54;

    public String identify() {
        return "HelperBeanO54";
    }
}
