package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM114 {

    @EJB
    private HelperBeanL114 helperBeanL114;

    public String identify() {
        return "HelperBeanM114";
    }
}
