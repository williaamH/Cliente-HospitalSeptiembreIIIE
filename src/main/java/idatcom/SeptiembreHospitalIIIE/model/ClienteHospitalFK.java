package idatcom.SeptiembreHospitalIIIE.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClienteHospitalFK implements Serializable{

	private static final long serialVersionUID = -7831879737668425927L;

	@Column(name = "id_hospital", nullable = false)
	private Integer idHospital;
	
	@Column(name = "id_cliente", nullable = false)
	private Integer idCliente;

	public Integer getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
}
