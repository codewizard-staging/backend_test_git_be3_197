package com.app.test_git_be3.function;

import com.app.test_git_be3.model.Pet;
import com.app.test_git_be3.model.PetCareCenter;
import com.app.test_git_be3.model.PetOwner;
import com.app.test_git_be3.model.Document;
import com.app.test_git_be3.model.PetService;
import com.app.test_git_be3.enums.PetServiceType;
import com.app.test_git_be3.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.test_git_be3.repository.PetServiceRepository;
import com.app.test_git_be3.repository.PetOwnerRepository;
import com.app.test_git_be3.repository.PetCareCenterRepository;
import com.app.test_git_be3.repository.DocumentRepository;
import com.app.test_git_be3.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
