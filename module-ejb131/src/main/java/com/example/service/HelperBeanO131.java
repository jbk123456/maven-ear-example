package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO131 {

    @EJB
    private HelperBeanN131 helperBeanN131;

    public String identify() {
        return "HelperBeanO131";
    }
}
