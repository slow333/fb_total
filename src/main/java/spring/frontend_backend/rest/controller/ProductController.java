package spring.frontend_backend.rest.controller;

import spring.frontend_backend.rest.data.ProductDto;
import spring.frontend_backend.rest.data.ProductEntity;
import spring.frontend_backend.rest.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;
  private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

  @GetMapping("/product/{productId}")
  public ResponseEntity<ProductEntity> getProduct(
          @PathVariable("productId") String productId) {
    long startTime = System.currentTimeMillis();
    LOGGER.info("[ProductController] perform {} of REst api", "getProduct");
    ProductEntity productEntity = this.productService.getProduct(productId);
    LOGGER.info("[ProductController] productId = {}, productName = {}, ResponseTime = {}",
            productId, productEntity.getProductName(), System.currentTimeMillis() - startTime);
    return ResponseEntity.ok(productEntity);
  }

  @GetMapping("/products")
  public List<ProductEntity> getProductList() {
    return this.productService.getProductList();
  }

  @PostMapping("/product")
  public ResponseEntity<ProductEntity> createProduct(
          @Valid @RequestBody ProductDto productDto)
//          BindingResult bindingResult)
//          throws MyRestException
          {

//    if (bindingResult.hasErrors()) {
//      throw new MyRestException(Constants.ExceptionClass.PRODUCT, HttpStatus.BAD_REQUEST, "뭔가 이상해요");

    ProductEntity productEntity = productService.saveProduct(
            productDto.getProductId(), productDto.getProductName(),
            productDto.getProductPrice(), productDto.getProductStock(), LocalDateTime.now());
    return ResponseEntity.status(HttpStatus.CREATED).body(productEntity);
  }
}
