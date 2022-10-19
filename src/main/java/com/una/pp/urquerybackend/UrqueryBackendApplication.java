package com.una.pp.urquerybackend;
import com.una.pp.urquerybackend.data.Documents;
import com.una.pp.urquerybackend.logic.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.FileNotFoundException;
@SpringBootApplication
public class UrqueryBackendApplication {
	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(UrqueryBackendApplication.class, args);
	}
}
