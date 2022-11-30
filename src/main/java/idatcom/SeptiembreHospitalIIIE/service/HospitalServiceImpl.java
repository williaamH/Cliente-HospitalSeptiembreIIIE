package idatcom.SeptiembreHospitalIIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idatcom.SeptiembreHospitalIIIE.client.OpenFeignClient;
import idatcom.SeptiembreHospitalIIIE.dto.ClienteDTO;
import idatcom.SeptiembreHospitalIIIE.model.ClienteHospitalFK;
import idatcom.SeptiembreHospitalIIIE.model.Hospital;
import idatcom.SeptiembreHospitalIIIE.model.HospitalDetalle;
import idatcom.SeptiembreHospitalIIIE.repository.DetalleHospitalRepository;
import idatcom.SeptiembreHospitalIIIE.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	private HospitalRepository hosRepo;
	
	@Autowired
	private DetalleHospitalRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;

	@Override
	public void guardarHospital(Hospital hospital) {
		
		hosRepo.save(hospital);

	}

	@Override
	public void asignarClienteHospital() {
		
		List<ClienteDTO> listado = client.listarClientes();
		ClienteHospitalFK fk = null;
		HospitalDetalle detalle = null;
		
		for (ClienteDTO clienteDTO : listado) {
			fk = new ClienteHospitalFK();
			fk.setIdCliente(clienteDTO.getCod());
			fk.setIdHospital(1);
			
			detalle = new HospitalDetalle();
			detalle.setFk(fk);
			
			detalleRepo.save(detalle);
		}

	}

}
