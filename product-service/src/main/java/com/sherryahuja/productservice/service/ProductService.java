package com.sherryahuja.productservice.service;

import com.sherryahuja.productservice.dto.ProductRequest;
import com.sherryahuja.productservice.dto.ProductResponse;
import com.sherryahuja.productservice.model.Product;
import com.sherryahuja.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor    //builds constructors for all req objects
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest)
    {
        Product product =  Product.builder().
                name(productRequest.getName())
                        .price(productRequest.getPrice())
                                .description(productRequest.getDescription())
                                    .build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }


    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return  products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product)
    {
            return ProductResponse.builder().id(product.getId())
                    .description(product.getDescription())
                    .name(product.getName())
                    .price(product.getPrice())
                    .build();
    }
}
