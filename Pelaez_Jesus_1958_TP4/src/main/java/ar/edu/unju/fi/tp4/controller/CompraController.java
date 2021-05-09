package ar.edu.unju.fi.tp4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.tp4.model.Compra;
import ar.edu.unju.fi.tp4.service.ICompraService;

@Controller
public class CompraController {
	@Autowired
	private Compra compra;
	@Autowired
	@Qualifier("compraUtilService")
	private ICompraService compraService;
	
	 @GetMapping("/compra")
	public String getFormCompraPage(Model model) {
		 model.addAttribute("compra",compra);
		return("compra");
	}

}
