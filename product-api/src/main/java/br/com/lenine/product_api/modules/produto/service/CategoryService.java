package br.com.lenine.product_api.modules.produto.service;

import br.com.lenine.product_api.config.exception.ValidationException;
import br.com.lenine.product_api.modules.produto.dto.CategoryRequest;
import br.com.lenine.product_api.modules.produto.dto.CategoryResponse;
import br.com.lenine.product_api.modules.produto.model.Category;
import br.com.lenine.product_api.modules.produto.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.springframework.util.ObjectUtils.isEmpty;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryResponse save(CategoryRequest request){
        validateCategoryNameInformed(request);
        var category = categoryRepository.save(Category.of(request));
        return CategoryResponse.of(category);
    }

    private void validateCategoryNameInformed(CategoryRequest request){
        if(isEmpty(request.getDescription())){
            throw new ValidationException("The Category description was not informed.");
        }
    }
}
