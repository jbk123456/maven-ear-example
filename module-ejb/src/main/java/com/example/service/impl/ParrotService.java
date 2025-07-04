package com.example.service.impl;

import javax.ejb.Stateless;

import com.example.service.IParrotService;

@Stateless
public class ParrotService implements IParrotService {

		@Override
		public String askMeAnything(String question) {
			return String.format("Answer to %s is %s ", question, "42");
		}

}
