package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM105 {

    @EJB
    private HelperBeanL105 helperBeanL105;

    public String identify() {
        return "HelperBeanM105";
    }
}
