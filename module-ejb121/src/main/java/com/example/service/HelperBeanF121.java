package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF121 {

    @EJB
    private HelperBeanE121 helperBeanE121;

    public String identify() {
        return "HelperBeanF121";
    }
}
