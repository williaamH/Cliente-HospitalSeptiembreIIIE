package idatcom.SeptiembreHospitalIIIE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import idatcom.SeptiembreHospitalIIIE.model.Hospital;
import idatcom.SeptiembreHospitalIIIE.service.HospitalService;

@Controller
@RequestMapping("/api/hospital/v1")
public class HospitalController {
	
	@Autowired
	private HospitalService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Hospital hospital) {
		service.guardarHospital(hospital);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarClienteHospital();
	}
}
