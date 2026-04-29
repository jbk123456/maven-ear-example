package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN118 {

    @EJB
    private HelperBeanM118 helperBeanM118;

    public String identify() {
        return "HelperBeanN118";
    }
}
