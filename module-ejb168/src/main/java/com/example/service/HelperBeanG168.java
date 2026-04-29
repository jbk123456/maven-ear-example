package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG168 {

    @EJB
    private HelperBeanF168 helperBeanF168;

    public String identify() {
        return "HelperBeanG168";
    }
}
