package com.narendra.services.room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Narendra Reddyvaari
 *
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
	
	Room findByRoomNumber(String roomNumber);

}
