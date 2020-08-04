package kr.co.jhta.web;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.jhta.form.ProductForm;
import kr.co.jhta.service.ProductService;
import kr.co.jhta.vo.Category;
import kr.co.jhta.vo.Product;

/*
 * @ModelAttribute
 * 		- Model 객체에 지정된 이름으로 정보를 저장한다.
 * 			@ModelAttribute("이름")
 * 			public 객체 메소드() {		// 해당 컨트롤러에 정의된 요청이 올 때 마다 이 메소드는 실행된다.
 * 				return 객체			// 메소드가 반환하는 값은 Model 객체에 저장된다.
 * 			}						// 이 컨트롤러와 관련된 모든 화면에서 Model에 저장된 정보를 사용할 수 있다.
 * 		- Model 객체에서 지정된 이름으로 정보를 가져온다.
 *			@RequestMapping("/경로")
 * 			public String 메소드(@ModelAttribute("이름") 객체 변수명, ...) {
 * 				
 * 			}
 */
@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@ModelAttribute("categories")
	public List<Category> categories() {
		System.out.println("전체 카테고리 정보 조회 -> Model 객체에 카테고리 정보 저장");
		List<Category> categories = productService.getAllCategories();
		return categories;
	}
	
	@GetMapping("/list.do")
	public String products(Model model) {
		System.out.println("/list.do 요청 처리 시작 : " + model);
		List<Category> categories = productService.getAllCategories();
		List<Product> products = productService.getAllProducts();
		
		model.addAttribute("categories", categories);
		model.addAttribute("products", products);
		
		return "product/list";	// /WEB-INF/view/product/list.jsp
	}
	
	@GetMapping("/add.do")
	public String form(Model model) {
		System.out.println("/add.do 요청 처리 시작 : " + model);
		return "product/form";
	}
	
	@PostMapping("/add.do")
	public String addProduct(ProductForm productForm) {
		Product product = new Product();
		BeanUtils.copyProperties(productForm, product);
		product.setCategory(new Category(productForm.getCatId()));
		
		productService.addNewProduct(product);
		System.out.println(product.getName());
		return "redirect:list.do";
	}
	
}