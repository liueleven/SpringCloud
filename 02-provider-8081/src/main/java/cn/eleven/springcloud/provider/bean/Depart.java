package cn.eleven.springcloud.provider.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Entity 指定自动生成表的名称为当前类的类名
 * @JsonIgnoreProperties JPA默认的底层实现是Hibernate，其默认采用延迟加载策略, 转换实体时忽略json中不存在的字段
 */
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "fieldHandler"})
public class Depart {
    /**
     * 指定当前属性为生成表的主键
     * 主键自动递增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
