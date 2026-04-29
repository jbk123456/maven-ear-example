package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM126 {

    @EJB
    private HelperBeanL126 helperBeanL126;

    public String identify() {
        return "HelperBeanM126";
    }
}
