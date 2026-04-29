package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO134 {

    @EJB
    private HelperBeanN134 helperBeanN134;

    public String identify() {
        return "HelperBeanO134";
    }
}
