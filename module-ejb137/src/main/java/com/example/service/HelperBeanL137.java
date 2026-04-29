package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL137 {

    @EJB
    private HelperBeanK137 helperBeanK137;

    public String identify() {
        return "HelperBeanL137";
    }
}
