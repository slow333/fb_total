package spring.frontend_backend.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.frontend_backend.rest.data.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}
