package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL121 {

    @EJB
    private HelperBeanK121 helperBeanK121;

    public String identify() {
        return "HelperBeanL121";
    }
}
