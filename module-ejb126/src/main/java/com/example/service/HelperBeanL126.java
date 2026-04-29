package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL126 {

    @EJB
    private HelperBeanK126 helperBeanK126;

    public String identify() {
        return "HelperBeanL126";
    }
}
