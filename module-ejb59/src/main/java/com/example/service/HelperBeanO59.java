package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO59 {

    @EJB
    private HelperBeanN59 helperBeanN59;

    public String identify() {
        return "HelperBeanO59";
    }
}
