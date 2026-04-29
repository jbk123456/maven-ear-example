package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE150 {

    @EJB
    private HelperBeanD150 helperBeanD150;

    public String identify() {
        return "HelperBeanE150";
    }
}
