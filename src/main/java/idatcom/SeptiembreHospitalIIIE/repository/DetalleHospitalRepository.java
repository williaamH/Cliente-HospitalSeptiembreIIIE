package idatcom.SeptiembreHospitalIIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idatcom.SeptiembreHospitalIIIE.model.HospitalDetalle;

@Repository
public interface DetalleHospitalRepository extends JpaRepository<HospitalDetalle, Integer>{

}
