package com.app.test_git_be3.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.test_git_be3.model.Pet;
import com.app.test_git_be3.model.PetCareCenter;
import com.app.test_git_be3.model.PetOwner;
import com.app.test_git_be3.model.Document;
import com.app.test_git_be3.model.PetService;
import com.app.test_git_be3.enums.PetServiceType;
import com.app.test_git_be3.converter.PetServiceTypeConverter;
import com.app.test_git_be3.converter.DurationConverter;
import com.app.test_git_be3.converter.UUIDToByteConverter;
import com.app.test_git_be3.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "PetCareCenter")
@Table(name = "\"PetCareCenter\"", schema =  "\"test_git_be3\"")
@Data
                        
public class PetCareCenter {
	public PetCareCenter () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"PcId\"", nullable = true )
  private Integer pcId;
	  
  @Column(name = "\"Address\"", nullable = true )
  private String address;
  
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"Description\"", nullable = true )
  private String description;
  
	  
  @Column(name = "\"BranchName\"", nullable = true )
  private String branchName;
  
	  
  @Column(name = "\"Latitude\"", nullable = true )
  private Float latitude;
  
	  
  @Column(name = "\"Longitude\"", nullable = true )
  private Float longitude;
  
	  
  @Column(name = "\"Pincode\"", nullable = true )
  private Integer pincode;
  
	  
  @Column(name = "\"IsOperational\"", nullable = true )
  private Boolean isOperational;
  
	  
	
@Column(name = "\"BusinessHours\"")
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(schema = "\"test_git_be3\"", name = "\"PetCareCenterBusinessHours\"",joinColumns = @JoinColumn(name = "\"PcId\""))
    private List<String> businessHours = new ArrayList<>();
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"PetCareCenterLogo\"", referencedColumnName = "\"DocId\"", insertable = false, updatable = false)
	private Document logo;
	
	@Column(name = "\"PetCareCenterLogo\"")
	private Integer petCareCenterLogo;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"PetCareCenterService\"", referencedColumnName = "\"ServiceId\"", insertable = false, updatable = false)
	private PetService service;
	
	@Column(name = "\"PetCareCenterService\"")
	private Integer petCareCenterService;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"PetCareCenterPeet\"", referencedColumnName = "\"PetId\"", insertable = false, updatable = false)
	private Pet peet;
	
	@Column(name = "\"PetCareCenterPeet\"")
	private Integer petCareCenterPeet;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"PetCareCenterImages\"",
            joinColumns = @JoinColumn( name="\"PcId\""),
            inverseJoinColumns = @JoinColumn( name="\"DocId\""), schema = "\"test_git_be3\"")
private List<Document> images = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "PetCareCenter [" 
  + "PcId= " + pcId  + ", " 
  + "Address= " + address  + ", " 
  + "Name= " + name  + ", " 
  + "Description= " + description  + ", " 
  + "BranchName= " + branchName  + ", " 
  + "Latitude= " + latitude  + ", " 
  + "Longitude= " + longitude  + ", " 
  + "Pincode= " + pincode  + ", " 
  + "IsOperational= " + isOperational  + ", " 
  + "BusinessHours= " + businessHours 
 + "]";
	}
	
}