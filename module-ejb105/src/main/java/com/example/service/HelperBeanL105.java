package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL105 {

    @EJB
    private HelperBeanK105 helperBeanK105;

    public String identify() {
        return "HelperBeanL105";
    }
}
