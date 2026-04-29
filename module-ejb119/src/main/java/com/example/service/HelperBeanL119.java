package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL119 {

    @EJB
    private HelperBeanK119 helperBeanK119;

    public String identify() {
        return "HelperBeanL119";
    }
}
