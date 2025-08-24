package com.eventosTec.api.repositories;

import com.eventosTec.api.domain.address.Address;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.cglib.transform.impl.AddStaticInitTransformer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
