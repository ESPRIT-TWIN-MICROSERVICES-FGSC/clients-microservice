package esprit.fgsc.clientsmicroservice.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import esprit.fgsc.clientsmicroservice.entities.Client;
import esprit.fgsc.clientsmicroservice.repository.IClientRepository;



@Service
public class ClientService {
	
	@Autowired
	private IClientRepository clientRepository;
	
	public Client addClient(Client client) {
		return clientRepository.save(client);
		
	}
	
	public List<Client>getAllClients(){
		 Sort sortByJoinDateDesc = Sort.by(Sort.Direction.DESC, "joinDate");
		 return clientRepository.findAll(sortByJoinDateDesc);
	}
	
	public String deleteClient(String id) {   

    	clientRepository.deleteById(id);
    	return "client deleted"+id;
	}
           
public Client updateClient(String id,Client newClient) {
	if(clientRepository.findById(id).isPresent()) {
		Client existingClient = clientRepository.findById(id).get();
		existingClient.setFirsttName(newClient.getFirsttName());
		existingClient.setLastName(newClient.getLastName());
		existingClient.setAddress(newClient.getAddress());
		existingClient.setEmail(newClient.getEmail());
		existingClient.setTel(newClient.getTel());
		existingClient.setDesignation(newClient.getDesignation());
		existingClient.setWebSite(newClient.getWebSite());
		existingClient.setGender(newClient.getGender());
		existingClient.setCountry(newClient.getCountry());
		return clientRepository.save(newClient);
		
	}else {
		return null;
	}
}

public Client getClientById(String id) {
	return clientRepository.findById(id).get();
	
}

}
