package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL114 {

    @EJB
    private HelperBeanK114 helperBeanK114;

    public String identify() {
        return "HelperBeanL114";
    }
}
