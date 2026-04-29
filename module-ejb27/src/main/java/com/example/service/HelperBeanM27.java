package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM27 {

    @EJB
    private HelperBeanL27 helperBeanL27;

    public String identify() {
        return "HelperBeanM27";
    }
}
