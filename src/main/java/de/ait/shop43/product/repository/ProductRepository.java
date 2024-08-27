package de.ait.shop43.product.repository;

import de.ait.shop43.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


// JpaRepository<Product, Long> - Product - тип сущности, Long - тип id
public interface ProductRepository extends JpaRepository<Product, Long> {
    // все репозиторий написан и больше ничего не надо
}
