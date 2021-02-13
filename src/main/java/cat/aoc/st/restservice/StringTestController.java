package cat.aoc.st.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringTestController {

	@GetMapping("/stringValueOf")
	public Resultat valueOf(@RequestParam(value = "valor", defaultValue = "1") int valor) {
		long startTime = System.nanoTime();
		String v = String.valueOf(valor);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		return new Resultat(v,duration);
		
	}
	
	@GetMapping("/stringAdd")
	public Resultat add(@RequestParam(value = "valor", defaultValue = "1") int valor) {
		long startTime = System.nanoTime();
		String v =  valor + "";
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		return new Resultat(v,duration);
	}
	
	@GetMapping("/stringFormat")
	public Resultat format(@RequestParam(value = "valor", defaultValue = "1") int valor) {
		long startTime = System.nanoTime();
		String v = String.format("%d", valor);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		return new Resultat(v,duration);
	}
}
