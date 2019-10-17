package cn.eleven.springcloud.provider.repository;


import cn.eleven.springcloud.provider.bean.Depart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description: dao
 * @date:        2019-10-15
 * @author:      十一
 */
public interface DepartRepository extends JpaRepository<Depart, Integer> {
}
