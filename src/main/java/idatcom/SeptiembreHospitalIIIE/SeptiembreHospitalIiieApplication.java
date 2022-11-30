package idatcom.SeptiembreHospitalIIIE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SeptiembreHospitalIiieApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeptiembreHospitalIiieApplication.class, args);
	}

}
