package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO13 {

    @EJB
    private HelperBeanN13 helperBeanN13;

    public String identify() {
        return "HelperBeanO13";
    }
}
