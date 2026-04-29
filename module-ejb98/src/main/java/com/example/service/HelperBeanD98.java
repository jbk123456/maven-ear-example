package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD98 {

    @EJB
    private HelperBeanC98 helperBeanC98;

    public String identify() {
        return "HelperBeanD98";
    }
}
