package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL27 {

    @EJB
    private HelperBeanK27 helperBeanK27;

    public String identify() {
        return "HelperBeanL27";
    }
}
