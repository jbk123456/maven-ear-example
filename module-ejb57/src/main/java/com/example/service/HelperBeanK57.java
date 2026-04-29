package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK57 {

    @EJB
    private HelperBeanJ57 helperBeanJ57;

    public String identify() {
        return "HelperBeanK57";
    }
}
