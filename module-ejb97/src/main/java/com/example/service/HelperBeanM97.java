package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM97 {

    @EJB
    private HelperBeanL97 helperBeanL97;

    public String identify() {
        return "HelperBeanM97";
    }
}
