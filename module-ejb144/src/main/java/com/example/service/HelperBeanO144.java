package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO144 {

    @EJB
    private HelperBeanN144 helperBeanN144;

    public String identify() {
        return "HelperBeanO144";
    }
}
