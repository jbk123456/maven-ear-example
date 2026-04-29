package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF150 {

    @EJB
    private HelperBeanE150 helperBeanE150;

    public String identify() {
        return "HelperBeanF150";
    }
}
