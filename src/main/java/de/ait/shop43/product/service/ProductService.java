package de.ait.shop43.product.service;

import de.ait.shop43.product.dto.RequestProductDTO;
import de.ait.shop43.product.dto.ResponseProductDTO;
import de.ait.shop43.product.entity.Product;

import java.util.List;

public interface ProductService {
// получить все из репозитория:
    List<ResponseProductDTO> findAll();
    ResponseProductDTO save(RequestProductDTO dto);
}
