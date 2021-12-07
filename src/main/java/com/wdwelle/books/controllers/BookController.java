package com.wdwelle.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	@RequestMapping("/books/{id}")
	public String index() {
		return "index.jsp";
	}
}
