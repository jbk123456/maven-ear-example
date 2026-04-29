package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG121 {

    @EJB
    private HelperBeanF121 helperBeanF121;

    public String identify() {
        return "HelperBeanG121";
    }
}
