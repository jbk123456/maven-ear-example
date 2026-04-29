package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL35 {

    @EJB
    private HelperBeanK35 helperBeanK35;

    public String identify() {
        return "HelperBeanL35";
    }
}
