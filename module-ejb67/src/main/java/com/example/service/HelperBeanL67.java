package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL67 {

    @EJB
    private HelperBeanK67 helperBeanK67;

    public String identify() {
        return "HelperBeanL67";
    }
}
