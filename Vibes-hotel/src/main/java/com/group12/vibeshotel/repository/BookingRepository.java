package com.group12.vibeshotel.repository;

import com.group12.vibeshotel.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author nganhthu
 */

public interface BookingRepository extends JpaRepository<BookedRoom, Long> {

    List<BookedRoom> findByRoomId(Long roomId);

    Optional<BookedRoom> findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> findByGuestEmail(String email);
}
