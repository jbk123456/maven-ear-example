package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO125 {

    @EJB
    private HelperBeanN125 helperBeanN125;

    public String identify() {
        return "HelperBeanO125";
    }
}
