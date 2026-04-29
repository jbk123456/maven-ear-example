package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM163 {

    @EJB
    private HelperBeanL163 helperBeanL163;

    public String identify() {
        return "HelperBeanM163";
    }
}
