package br.com.lenine.product_api.modules.produto.repository;

import br.com.lenine.product_api.modules.produto.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
