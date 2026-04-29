package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI139 {

    @EJB
    private HelperBeanH139 helperBeanH139;

    public String identify() {
        return "HelperBeanI139";
    }
}
