package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM150 {

    @EJB
    private HelperBeanL150 helperBeanL150;

    public String identify() {
        return "HelperBeanM150";
    }
}
