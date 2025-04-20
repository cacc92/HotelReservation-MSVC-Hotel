package com.ccarrasco.springcloud.msvc.hotel.controllers;


import com.ccarrasco.springcloud.msvc.hotel.models.Hotel;
import com.ccarrasco.springcloud.msvc.hotel.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RestController -> Nos permite realizar un controlador del tipo REST, recordar que el controlador el puerta de
 * entrada y salida de la información de nuestra aplicación
 * @RequestMapping -> Es el elemento que nos permite definir el Path o URL padre de los endpoints que maneja el
 * controlador.
 */
@RestController
@RequestMapping("/api/v1/hotels")
public class HotelController {


    /**
     * Se genera con la anotacion @Autowired la conexion entre el repositorio y el controlador, ojo al momenot de llamar
     * al service se llama la interface del service dado que el controller no necesita saber como esta implementado el
     * servicio.
     */
    @Autowired
    private HotelRepository hotelRepository;

    /**
     *  Se genera un get mapping para obtener el listado de los hoteles
     *  Recordar que el ResponseEntity contiene el codigo de resultado de la transaccción, el header y el body (el cual
     *  seria la data que nosotros le devolvemos)
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(hotels);
    }
}
