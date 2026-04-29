package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM151 {

    @EJB
    private HelperBeanL151 helperBeanL151;

    public String identify() {
        return "HelperBeanM151";
    }
}
