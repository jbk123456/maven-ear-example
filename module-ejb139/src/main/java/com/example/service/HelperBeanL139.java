package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL139 {

    @EJB
    private HelperBeanK139 helperBeanK139;

    public String identify() {
        return "HelperBeanL139";
    }
}
