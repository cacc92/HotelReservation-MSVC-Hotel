package com.ccarrasco.springcloud.msvc.hotel.services;


import com.ccarrasco.springcloud.msvc.hotel.models.Hotel;

import java.util.List;

/**
 * ¿Porqué se genera Hotel Service como interfaz?
 *
 * 1. Principio de programación orientada a interfaces (SOLID)
 * Se basa en el principio de inversión de dependencias (D) del modelo SOLID.
 * Esto permite que otras capas (como el controller o incluso otros servicios) dependan de abstracciones (interfaces) y
 * no de implementaciones concretas (ServiceImpl).
 *
 * 2. Facilita el testing
 * Cuando haces tests unitarios, puedes mockear fácilmente la interfaz en lugar de la implementación.
 *
 * 3. Posibilidad de múltiples implementaciones
 * Si en algún momento necesitas dos formas distintas de implementar una lógica, puedes tener múltiples ServiceImpl y
 * elegir cuál inyectar según el contexto (por ejemplo, por perfil de Spring o por uso de @Qualifier).
 *
 * 4. Mejora el desacoplamiento
 * El Controller no necesita saber cómo funciona el servicio, solo qué métodos ofrece.
 * Si el día de mañana cambias la lógica interna (por ejemplo, pasar de MySQL a Mongo), no afecta al controller.
 *
 */

public interface HotelService {

    List<Hotel> findAll();

}
