package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO138 {

    @EJB
    private HelperBeanN138 helperBeanN138;

    public String identify() {
        return "HelperBeanO138";
    }
}
