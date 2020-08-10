package kr.co.jhta.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jhta.service.ProductService;
import kr.co.jhta.vo.Product;

/*
 * @RestController
 * 		- REST 요청과 응답을 처리하는 컨트롤러 클래스를 나타낸다.
 * 		- @ResponseBody 어노테이션을 생략해도 요청핸들러 메소드가 반환하는 객체가 JSON/XML 응답으로 제공된다.
 * 		- 클라이언트와 서버가 JSON 형식의 데이터를 주고 받기 위해서는 jack-databin.jar 라이브러리가 필요하다.
 * REST형식의 URL
 * 		- URL Mapping
 * 			"/자원이름/파라미터값"
 * 			예)  /rest/products/				- 모든 상품
 * 				@GetMapping("/rest/products/")
 * 				public List<Products> getAllProducts() { ... }
 * 
 * 				/rest/products/10			- 10번 상품
 * 				@GetMapping("/rest/products/{no}")
 * 				public Product getProductDetail(@PathVariable("no") long productNo) { ... }		--> 경로에서 값(no)을 가져오는 것
 * 
 * 				/rest/products/3/10/가구		- 가구 중에서 10개 표시했을 때 3번째 페이지
 * 				@GetMapping("/rest/products/{pageNo}/{rows}/{category}")
 * 				public List<Product> getProducts(@PathVariable("pageNo") int pageNo,
 * 						@PathVariable("rows") int rows,
 * 						@PathVariable("category") String category) { ... }
 * @PathVariable
 */

@RestController
@RequestMapping("/rest")
public class RestProductController {
	
	@Autowired
	ProductService productService;
	
	// 모든 상품 정보 조회
	// 요청 방식 : GET
	// 요청 URL : /rest/products
	// 요청 데이터 : 없음
	// 응답 데이터 : [상품정보, 상품정보 , 상품정보]
	@GetMapping("/products/")
	public List<Product> products() {
		List<Product> products = productService.getAllProducts();
		return products;
	}

	// 지정된 번호의 상품정보 조회
	// 요청 방식 : GET
	// 요청 URL : /rest/product/상품번호
	// 요청 데이터 : 없음
	// 응답 데이터 : 상품정보
	@GetMapping("/products/{no}")
	public Product product(@PathVariable("no") int productNo) {
		Product product = productService.getProductDetail(productNo);
		return product;
	}
	
	// 새로운 상품 정보 추가
	// 요청방식 : POST
	// 요청 URL : /rest/products/
	// 요청 데이터 : 상품정보(추가할)
	// 응답 데이터 : 상품정보(추가된)
	
	// 지정된 상품번호의 상품정보 삭제
	// 요청방식 : DELETE
	// 요청 URL : /rest/products/상품번호
	// 요청 데이터 : 없음
	// 응답 데이터 : 없음 혹은 상품정보(삭제처리된)
	
	// 지정된 상품번호의 상품정보 변경
	// 요청 방식 : PUT
	// 요청 URL : /rest/products/상품번호
	// 요청 데이터 : 상품정보(변경할)
	// 응답 데이터 : 상품정보(변경된)
}
