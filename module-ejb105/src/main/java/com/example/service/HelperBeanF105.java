package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF105 {

    @EJB
    private HelperBeanE105 helperBeanE105;

    public String identify() {
        return "HelperBeanF105";
    }
}
