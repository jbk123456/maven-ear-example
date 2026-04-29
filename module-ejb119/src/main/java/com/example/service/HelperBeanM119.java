package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM119 {

    @EJB
    private HelperBeanL119 helperBeanL119;

    public String identify() {
        return "HelperBeanM119";
    }
}
