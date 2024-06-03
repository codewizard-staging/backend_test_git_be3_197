package com.app.test_git_be3.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.test_git_be3.model.Pet;
import com.app.test_git_be3.model.PetCareCenter;
import com.app.test_git_be3.model.PetOwner;
import com.app.test_git_be3.model.Document;
import com.app.test_git_be3.model.PetService;
import com.app.test_git_be3.enums.PetServiceType;
import com.app.test_git_be3.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"test_git_be3\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}