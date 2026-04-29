package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO95 {

    @EJB
    private HelperBeanN95 helperBeanN95;

    public String identify() {
        return "HelperBeanO95";
    }
}
