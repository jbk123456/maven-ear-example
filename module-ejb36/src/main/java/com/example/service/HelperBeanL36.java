package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL36 {

    @EJB
    private HelperBeanK36 helperBeanK36;

    public String identify() {
        return "HelperBeanL36";
    }
}
