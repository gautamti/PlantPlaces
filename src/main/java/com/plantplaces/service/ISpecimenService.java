package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD operations for specimen
 * @author Tulsi Gautam
 */
public interface ISpecimenService {
	/**
	 * Get specimen from persistence layer.
	 * @param id a unique lookup
	 * @return a specimen with a matching id.
	 */

	SpecimenDTO fetchByID(int id);
	/**
	 * persist the given DTO
	 * @param specimenDTO
	 */

	void save(SpecimenDTO specimenDTO);

}