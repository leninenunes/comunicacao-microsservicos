package br.com.lenine.product_api.modules.produto.repository;

import br.com.lenine.product_api.modules.produto.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
