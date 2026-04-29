package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL169 {

    @EJB
    private HelperBeanK169 helperBeanK169;

    public String identify() {
        return "HelperBeanL169";
    }
}
