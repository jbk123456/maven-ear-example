package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO67 {

    @EJB
    private HelperBeanN67 helperBeanN67;

    public String identify() {
        return "HelperBeanO67";
    }
}
