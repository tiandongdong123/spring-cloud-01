package com.tiandd.springcloud01.service.impl;

import com.tiandd.springcloud01.dao.slave.ProductDao;
import com.tiandd.springcloud01.pojo.master.User;
import com.tiandd.springcloud01.pojo.slave.Product;
import com.tiandd.springcloud01.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;
    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }

}
