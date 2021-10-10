package esprit.fgsc.clientsmicroservice.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value="client")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Client {

	@Id
	private String clientId;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String tel;
	private String designation;
	private String webSite;
	private String gender;
	private String country;
	private Date joiningDate;
	
}
