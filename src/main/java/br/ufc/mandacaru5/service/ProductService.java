package br.ufc.mandacaru5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.ufc.mandacaru5.dao.ProductDAO;
import br.ufc.mandacaru5.model.Product;

@Service
public class ProductService {

	ProductDAO productDAO;

	public void save(int id, Product entity) {
		if(id != 0) {
			entity.setId(id);
		}
		productDAO.save(entity);
	}

	public void delete(int id) {
		productDAO.delete(id);
	}

	public Product find(int id) {
		if(id < 1) {
			return null;
		}
		
		return productDAO.find(id);
	}

	public List<Product> findAll() {
		return productDAO.findAll();
	}

	public Product findByName(String str) {
		if(str.length() < 3) {
			return null;
		}
		
		return productDAO.findByName(str);
	}

	public List<Product> findAllByName(String str) {
		return productDAO.findAllByName(str);
	}

}
