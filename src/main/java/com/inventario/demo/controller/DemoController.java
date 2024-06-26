package com.inventario.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.demo.bean.Activos;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@RequestMapping(value="/activo", method = RequestMethod.GET)
	public Activos obtenerActivos(HttpServletRequest request) {
		
		Activos actv = new Activos();
		actv.setNombre("Clark");
		actv.setDescripcion("Telefono");
		actv.setNumeroSerial(12345);
		actv.setYear(2020);
		actv.setValorCompra(1500000);
		
		return actv;
	}
	
	@RequestMapping("/calculo")
	public double calcular() {

		Activos actv = new Activos();
		
		int valorActivo = actv.valorCompra;
		int year = actv.anio;
		double resultado = 0;
		
		if (year >= 2020) {
			resultado = valorActivo * 0.04;
		} else if( year >=2015 && year < 2020) {
			resultado = valorActivo * 0.08;
		}
		
		return year;
	}
	
}
