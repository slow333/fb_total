package spring.frontend_backend.rest.dao;

import spring.frontend_backend.rest.data.ProductEntity;
import spring.frontend_backend.rest.repository.ProductRepository;
import spring.frontend_backend.system.exceptions.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductDao {

  private final ProductRepository productRepository;

  public ProductEntity saveProduct(ProductEntity productEntity) {
    return this.productRepository.save(productEntity);
  }

  public ProductEntity getProduct(String productID) {
    Optional<ProductEntity> productEntity = this.productRepository.findById(productID);
    if (productEntity.isEmpty()) {
      throw new DataNotFoundException("찾는 제품이 없습니다.");
    }
    ProductEntity product = productEntity.get();
    return product;
  }
  public List<ProductEntity> getProductList() {
    return this.productRepository.findAll();
  }
}
