package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO16 {

    @EJB
    private HelperBeanN16 helperBeanN16;

    public String identify() {
        return "HelperBeanO16";
    }
}
