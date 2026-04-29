package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG46 {

    @EJB
    private HelperBeanF46 helperBeanF46;

    public String identify() {
        return "HelperBeanG46";
    }
}
