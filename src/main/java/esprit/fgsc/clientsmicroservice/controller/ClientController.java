package esprit.fgsc.clientsmicroservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import esprit.fgsc.clientsmicroservice.entities.Client;
import esprit.fgsc.clientsmicroservice.repository.IClientRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ClientController {
private  IClientRepository clientRepository;

@GetMapping
@ResponseStatus(HttpStatus.OK)
public List<Client> getAllClients(){
	return clientRepository.findAll();
		
	}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public void createClient(@RequestBody Client client){
		clientRepository.save(client);
	}
	
}
