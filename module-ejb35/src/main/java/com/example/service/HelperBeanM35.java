package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM35 {

    @EJB
    private HelperBeanL35 helperBeanL35;

    public String identify() {
        return "HelperBeanM35";
    }
}
