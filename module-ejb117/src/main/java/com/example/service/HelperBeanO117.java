package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO117 {

    @EJB
    private HelperBeanN117 helperBeanN117;

    public String identify() {
        return "HelperBeanO117";
    }
}
