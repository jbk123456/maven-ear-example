package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM131 {

    @EJB
    private HelperBeanL131 helperBeanL131;

    public String identify() {
        return "HelperBeanM131";
    }
}
