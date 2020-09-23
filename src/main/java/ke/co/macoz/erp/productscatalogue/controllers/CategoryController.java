package ke.co.macoz.erp.productscatalogue.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ke.co.macoz.erp.productscatalogue.models.Category;

@RestController
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, path = "/categories")
public class CategoryController {
	@GetMapping(path = "/")
	public Category getCategories(@RequestParam("name")String categoryName) {
		if(categoryName==null) {
			// list categories
		}else {
			// fetch and return given category
		}
		return null;
	}
}
