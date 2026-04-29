package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE25 {

    @EJB
    private HelperBeanD25 helperBeanD25;

    public String identify() {
        return "HelperBeanE25";
    }
}
