/**
 * 
 */
package com.narendra.services.room;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Narendra Reddyvaari
 *
 */
@RestController
@RequestMapping(value="/rooms")
@CrossOrigin(origins = "*")
public class RoomController {
	
	@Autowired
	private RoomRepository repository;
	
	@GetMapping("")
	public List<Room> findAll(@RequestParam(name="roomNumber",required=false)String roomNUmber){
		
		if(StringUtils.isNotEmpty(roomNUmber)) {
			return Collections.singletonList(this.repository.findByRoomNumber(roomNUmber));
		}
		
		return (List<Room>) this.repository.findAll();
	}
	

}
