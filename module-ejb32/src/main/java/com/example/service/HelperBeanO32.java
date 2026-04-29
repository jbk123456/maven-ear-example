package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO32 {

    @EJB
    private HelperBeanN32 helperBeanN32;

    public String identify() {
        return "HelperBeanO32";
    }
}
