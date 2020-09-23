package ke.co.macoz.erp.productscatalogue.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, path = "/discounts")
public class DiscountController {

}
