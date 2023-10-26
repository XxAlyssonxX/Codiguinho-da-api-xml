package com.projetopedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopedido.entities.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido,Long> {

}

