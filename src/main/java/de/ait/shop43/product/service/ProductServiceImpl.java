package de.ait.shop43.product.service;

import de.ait.shop43.product.dto.RequestProductDTO;
import de.ait.shop43.product.dto.ResponseProductDTO;
import de.ait.shop43.product.entity.Product;
import de.ait.shop43.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<ResponseProductDTO> findAll() {
        // здесь пропишем позднее реализацию метода
        return repository.findAll().stream()
                .map(e->mapper.map(e,ResponseProductDTO.class))
                .toList();
    }

    @Override
    public ResponseProductDTO save(RequestProductDTO dto) {
        // превращает RequestProductDTO в entity Product
        Product entity = mapper.map(dto, Product.class);
        Product newProduct = repository.save(entity);
        // сделали обратное преобразование Product to ResponseProductDTO
        return mapper.map(newProduct,ResponseProductDTO.class);
    }


}
