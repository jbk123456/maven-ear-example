package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG82 {

    @EJB
    private HelperBeanF82 helperBeanF82;

    public String identify() {
        return "HelperBeanG82";
    }
}
