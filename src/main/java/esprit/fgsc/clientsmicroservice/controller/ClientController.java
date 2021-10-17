package esprit.fgsc.clientsmicroservice.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import esprit.fgsc.clientsmicroservice.entities.Client;
import esprit.fgsc.clientsmicroservice.services.ClientService;


@CrossOrigin(origins = "*")
@RestController
public class ClientController {
	@Autowired
private  ClientService clientService;
	
@GetMapping
@ResponseStatus(HttpStatus.OK)
public ResponseEntity<List<Client> >getAllClients(){
	 return new ResponseEntity<>(clientService.getAllClients(),HttpStatus.OK);
		}

@PostMapping("/add")
@ResponseStatus(HttpStatus.CREATED)
public Client addClient(@RequestBody Client client) {
    return  clientService.addClient(client);
}

@DeleteMapping("/delete-client/{id}")
public String deleteClient(@PathVariable String id) {
    return clientService.deleteClient(id.toString());
}

@PutMapping(value="/update/{id}")
@ResponseStatus(HttpStatus.OK)
public ResponseEntity<Client> updateClient(@PathVariable("id") String id,@Valid @RequestBody Client client) {
	return new ResponseEntity<>(clientService.updateClient(id, client),HttpStatus.OK);
}

@GetMapping("/client/{id}")
@ResponseStatus(HttpStatus.OK)
public ResponseEntity<Client >getClientById(@PathVariable("id") String id){
	 return new ResponseEntity<>(clientService.getClientById(id),HttpStatus.OK);
		}

}