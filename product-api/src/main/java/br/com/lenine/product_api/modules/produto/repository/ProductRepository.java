package br.com.lenine.product_api.modules.produto.repository;

import br.com.lenine.product_api.modules.produto.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
