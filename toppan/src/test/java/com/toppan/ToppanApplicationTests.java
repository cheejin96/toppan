package com.toppan;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.toppan.model.University;
import com.toppan.service.UniversityService;

@SpringBootTest
class ToppanApplicationTests {

	@Autowired
	private UniversityService universityService;
	
	@Test
	void contextLoads() {
		//Check if able to find universityService
		assertThat(universityService).isNotNull();
		
		//Get uni list before create
		List<University> uniList = universityService.getUniList("Test Case - Create uni", null, null, null, null, null, 0, 10);
		assertThat(uniList.size()).isEqualTo(0);
		
		//Create uni
		University university = universityService.createNewUni("Test Case - Create uni", "Testing env", null);
		long uniId = university.getId();
		assertThat(university).isNotEqualTo(null);
		
		//Get uni without fliter
		uniList = universityService.getUniList("Test Case - Create uni", null, null, null, null, null, 0, 10);
		assertThat(uniList.size()).isEqualTo(1);
		
		university =  uniList.get(0);
		assertThat(university.getName()).isEqualTo("Test Case - Create uni");
		assertThat(university.getCountry()).isEqualTo("Testing env");
		
		//Get uni wtih fliter
		uniList = universityService.getUniList(null, "Not Testing env", null, null, null, null, 0, 10);
		assertThat(uniList.size()).isEqualTo(0);
		
		//Get uni by id
		university = universityService.getUniById(uniId);
		assertThat(university.getName()).isEqualTo("Test Case - Create uni");
		assertThat(university.getCountry()).isEqualTo("Testing env");
		
		//Edit uni by id - only edit name, country should remain same
		university = universityService.updateUniversity(uniId, "Edit", null, null, null, null);
		assertThat(university.getName()).isEqualTo("Edit");
		assertThat(university.getCountry()).isEqualTo("Testing env");
		
		//Bookmark a specific university.
		boolean bookmarkFlag = universityService.bookmarkUniById(uniId);
		assertThat(bookmarkFlag).isEqualTo(true);
		university = universityService.getUniById(uniId);
		assertThat(university.isBookmark()).isEqualTo(true);
		assertThat(university.isActive()).isEqualTo(true);
		
		//Delete university
		boolean deleteFlag = universityService.deleteUniById(uniId);
		assertThat(deleteFlag).isEqualTo(true);
		university = universityService.getUniById(uniId);
		assertThat(university.isActive()).isEqualTo(false);
		
		//Hard delete for testing purpose
		universityService.hardDeleteUni(uniId);
		
	}

}
