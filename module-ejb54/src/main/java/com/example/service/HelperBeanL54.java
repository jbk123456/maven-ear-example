package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL54 {

    @EJB
    private HelperBeanK54 helperBeanK54;

    public String identify() {
        return "HelperBeanL54";
    }
}
