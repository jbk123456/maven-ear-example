package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH46 {

    @EJB
    private HelperBeanG46 helperBeanG46;

    public String identify() {
        return "HelperBeanH46";
    }
}
