package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF66 {

    @EJB
    private HelperBeanE66 helperBeanE66;

    public String identify() {
        return "HelperBeanF66";
    }
}
