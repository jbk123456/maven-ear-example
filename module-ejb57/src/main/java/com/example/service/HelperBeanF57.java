package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF57 {

    @EJB
    private HelperBeanE57 helperBeanE57;

    public String identify() {
        return "HelperBeanF57";
    }
}
