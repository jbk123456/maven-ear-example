package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF60 {

    @EJB
    private HelperBeanE60 helperBeanE60;

    public String identify() {
        return "HelperBeanF60";
    }
}
