package cn.eleven.springcloud.provider.service;


import cn.eleven.springcloud.provider.bean.Depart;

import java.util.List;

/**
 * @description: service
 * @date: 2019-10-15
 * @author: 十一
 */
public interface DepartService {
    boolean saveDepart(Depart depart);

    boolean removeDepartById(int id);

    boolean modifyDepart(Depart depart);

    Depart getDepartById(int id);

    List<Depart> listAllDeparts();
}
