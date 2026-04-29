package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL32 {

    @EJB
    private HelperBeanK32 helperBeanK32;

    public String identify() {
        return "HelperBeanL32";
    }
}
