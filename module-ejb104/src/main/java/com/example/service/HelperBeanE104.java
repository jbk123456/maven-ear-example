package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE104 {

    @EJB
    private HelperBeanD104 helperBeanD104;

    public String identify() {
        return "HelperBeanE104";
    }
}
