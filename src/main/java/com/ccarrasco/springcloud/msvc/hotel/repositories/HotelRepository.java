package com.ccarrasco.springcloud.msvc.hotel.repositories;

import com.ccarrasco.springcloud.msvc.hotel.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Repository -> Nos permite definir que el componente HotelRepository sera un componente del tipo repository, por ende
 * nos permitira generar todas las consultas DAO con CRUD a la base de datos que se encuentre definida
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    /**
     * Esta interface se extiende de JpaRepository donde pose dos argumentos
     * < NOMBRE DE LA CLASE QUE HACE REFERENCIA A LA TABLA , TIPO DE DATO DE LA LLAVE PRIMARIA DE LA TABLA >
     */

}
