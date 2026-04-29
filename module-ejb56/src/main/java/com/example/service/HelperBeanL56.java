package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL56 {

    @EJB
    private HelperBeanK56 helperBeanK56;

    public String identify() {
        return "HelperBeanL56";
    }
}
