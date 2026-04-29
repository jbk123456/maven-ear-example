package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM149 {

    @EJB
    private HelperBeanL149 helperBeanL149;

    public String identify() {
        return "HelperBeanM149";
    }
}
