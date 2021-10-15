package com.demo.nandhu.ManyToMany;

import org.springframework.stereotype.Service;

@Service
public class RoadService {

	private RoadRepository roadRepo;
	
	public Road addData(Road road) {
		
		Vehicle v1=new Vehicle();
		v1.setVehiclename("Car");
		
		Vehicle v2=new Vehicle();
		v2.setVehiclename("Bike");
		
		road.getVehicles().add(v1);
		road.getVehicles().add(v2);
		
		
		return roadRepo.save(road);
	}
}
