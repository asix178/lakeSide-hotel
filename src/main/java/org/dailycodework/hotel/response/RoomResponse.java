package org.dailycodework.hotel.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor

public class RoomResponse {
    private Long id;
    private String roomType;
    private BigDecimal price;
    private boolean isBooked ;
    private String photo;
    private List<BookingResponse> bookings;

    public RoomResponse(String roomType, Long id, BigDecimal price) {
        this.roomType = roomType;
        this.id = id;
        this.price = price;
    }

    public RoomResponse(Long id, String roomType, BigDecimal price, boolean isBooked,
                        byte[] photoBytes, List<BookingResponse> bookings) {
        this.id = id;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = isBooked;
        this.photo = photoBytes != null ? Base64.encodeBase64String(photoBytes) : null;
        this.bookings = bookings;
    }
}
