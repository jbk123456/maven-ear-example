package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF168 {

    @EJB
    private HelperBeanE168 helperBeanE168;

    public String identify() {
        return "HelperBeanF168";
    }
}
