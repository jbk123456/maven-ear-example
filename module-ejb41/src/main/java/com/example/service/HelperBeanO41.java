package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO41 {

    @EJB
    private HelperBeanN41 helperBeanN41;

    public String identify() {
        return "HelperBeanO41";
    }
}
