package com.cg.onlineplantnursery.service;

import java.util.List;

import com.cg.onlineplantnursery.dto.PlantAdminResponseDTO;
import com.cg.onlineplantnursery.entity.Plant;
import com.cg.onlineplantnursery.exception.PlantIdNotFoundException;

public interface IPlantService {
	Plant addPlant(Plant plant)throws PlantIdNotFoundException;

	Plant updatePlant(int plantId)throws PlantIdNotFoundException;

	Plant deletePlant(Plant plant)throws PlantIdNotFoundException;

	Plant viewPlant(int plantId)throws PlantIdNotFoundException;

	List<Plant> viewPlant(String plantName)throws PlantIdNotFoundException;

	List<Plant> getAllPlants()throws PlantIdNotFoundException;

	List<Plant> getPlantByTypeOfPlant(String typeOfPlant)throws PlantIdNotFoundException;

	PlantAdminResponseDTO getPlantAdminResponseDTO(Plant newPlant);

	


}
