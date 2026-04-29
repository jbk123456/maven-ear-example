package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD150 {

    @EJB
    private HelperBeanC150 helperBeanC150;

    public String identify() {
        return "HelperBeanD150";
    }
}
