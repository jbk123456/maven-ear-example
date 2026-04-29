package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL16 {

    @EJB
    private HelperBeanK16 helperBeanK16;

    public String identify() {
        return "HelperBeanL16";
    }
}
