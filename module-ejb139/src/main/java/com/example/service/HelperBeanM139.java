package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM139 {

    @EJB
    private HelperBeanL139 helperBeanL139;

    public String identify() {
        return "HelperBeanM139";
    }
}
