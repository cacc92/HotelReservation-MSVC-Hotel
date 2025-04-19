package com.ccarrasco.springcloud.msvc.hotel.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
* Se genera la Anotacion de entity, cuando una clase tenga esta anotación el paquete de JPA de Spring detectará que esta
* clase sera una tabla de la base de datos.
 */
@Entity

/**
 * Se genera las anotaciones de Lombok, con estas anotaciones Spring autogenera los metodos:
 * @Getter -> Anotación para generar los Getters
 * @Setter -> Anotacion para generar los Setters
 * @ToString -> Anotacion para generar automaticamente el ToString
 */
@Getter @Setter @ToString
public class Hotel {

    /**
     * Se generar las anotaciones para que se generen las tablas en el modelo
     * @Id -> Define que esta es la llave primaria del modelo.
     * @GeneratedValue -> Permite la generación automática de la llave primaria.
     * (strategy = GenerationType.AUTO) -> Cuando se utiliza la GenerationType.AUTO selecciona la mejor estrategia para
     * la base de datos que se selcciona.
     * @Column -> Esta anotación permite generar las configuracion de la columna como por ejemplo, el nombre de la
     * columna, si la columna no puede ser nula o tiene que ser unica.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hotel_id")
    private Long hotelId;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "hotel_address")
    private String hotelAddress;

}
