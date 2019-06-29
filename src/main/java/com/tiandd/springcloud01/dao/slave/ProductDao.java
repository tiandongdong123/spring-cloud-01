package com.tiandd.springcloud01.dao.slave;

import com.tiandd.springcloud01.pojo.slave.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {
    List<Product> getAllProduct();
}
