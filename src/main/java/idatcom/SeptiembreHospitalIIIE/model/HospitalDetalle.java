package idatcom.SeptiembreHospitalIIIE.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_hospital")
public class HospitalDetalle {

	@Id
	private ClienteHospitalFK fk = new ClienteHospitalFK();

	public ClienteHospitalFK getFk() {
		return fk;
	}

	public void setFk(ClienteHospitalFK fk) {
		this.fk = fk;
	}
	
	
}
