package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF46 {

    @EJB
    private HelperBeanE46 helperBeanE46;

    public String identify() {
        return "HelperBeanF46";
    }
}
