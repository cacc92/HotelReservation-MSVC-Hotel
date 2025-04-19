package com.ccarrasco.springcloud.msvc.hotel.services;

import com.ccarrasco.springcloud.msvc.hotel.models.Hotel;
import com.ccarrasco.springcloud.msvc.hotel.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Service -> Nos permite definir un componente del tipo service
 * Se implementan los métodos que son definidos en Hotel Service
 */
@Service
public class HotelServiceImpl implements HotelService {

    /**
     * @Autowired -> Nos permite generar la asociacion entre el componente service y el componente repository
     */
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> findAll() {
        return  hotelRepository.findAll();
    }
}
