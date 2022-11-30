package idatcom.SeptiembreHospitalIIIE.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import idatcom.SeptiembreHospitalIIIE.dto.ClienteDTO;

@FeignClient(name = "cliente-microservicio", url = "localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/cliente/v1/listar")
	public List<ClienteDTO> listarClientes();

}
