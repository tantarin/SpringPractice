package com.example.repositories;

import com.example.entities.FruitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository//помечаем что этот бин - репозиторий
public interface FruitRepository extends JpaRepository<FruitEntity,Integer> {
//репозиторий является интерфейсом, который наследуется от другого интерфейса JpaRepository<>
//для него необходимо указать с какой сущность он должен работать, у нас это FruitEntity
//и тип данных у поля id данной сущности, у нас это Integer
}
