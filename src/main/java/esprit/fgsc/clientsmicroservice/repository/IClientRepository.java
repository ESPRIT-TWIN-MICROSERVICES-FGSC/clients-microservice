package esprit.fgsc.clientsmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import esprit.fgsc.clientsmicroservice.entities.Client;


public interface IClientRepository extends MongoRepository<Client, String>{

}
