package cn.eleven.springcloud.provider.service;


import cn.eleven.springcloud.provider.bean.Depart;
import cn.eleven.springcloud.provider.repository.DepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 实现类
 * @date:        2019-10-15
 * @author:      十一
 */
@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartRepository repository;

    // 插入
    @Override
    public boolean saveDepart(Depart depart) {
        Depart obj = repository.save(depart);
        if(obj != null) {
            return true;
        }
        return false;
    }

    // 根据id删除
    @Override
    public boolean removeDepartById(int id) {

        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    // 修改
    @Override
    public boolean modifyDepart(Depart depart) {
        Depart obj = repository.save(depart);
        if(obj != null) {
            return true;
        }
        return false;
    }

    // 根据id查询
    @Override
    public Depart getDepartById(int id) {
        if(repository.existsById(id)) {
            return repository.getOne(id);
        }
        Depart depart = new Depart();
        depart.setName("no this depart");
        return depart;
    }

    // 查询所有
    @Override
    public List<Depart> listAllDeparts() {
        return repository.findAll();
    }
}
