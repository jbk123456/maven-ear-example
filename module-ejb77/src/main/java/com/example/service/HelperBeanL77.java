package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL77 {

    @EJB
    private HelperBeanK77 helperBeanK77;

    public String identify() {
        return "HelperBeanL77";
    }
}
