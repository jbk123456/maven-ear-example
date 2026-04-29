package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF104 {

    @EJB
    private HelperBeanE104 helperBeanE104;

    public String identify() {
        return "HelperBeanF104";
    }
}
