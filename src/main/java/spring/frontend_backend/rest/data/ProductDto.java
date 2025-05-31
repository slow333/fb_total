package spring.frontend_backend.rest.data;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {

  @NotEmpty(message = "아이디는 필수항목입니다.")
  private String productId;

  @NotEmpty(message = "이름은 필수항목입니다.")
  private String productName;

  @NotNull(message = "가격은 필수항목입니다.")
  @Max(value = 9000000, message = "900만원 이하입니다.")
  private int productPrice;

  @NotNull(message = "제고는 필수항목입니다.")
  @Max(value = 9999, message = "최대 9999 입니다.")
  private int productStock;

  private LocalDateTime createDate;

//  public ProductEntity toEntity(){
//    return ProductEntity.builder()
//            .productId(productId)
//            .productName(productName)
//            .productPrice(productPrice)
//            .productStock(productStock)
//            .build();
//  }
}
