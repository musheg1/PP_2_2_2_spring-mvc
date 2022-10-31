package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getListCar() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("LADA", 2000, 0.9));
        list.add(new Car("HYUNDAI", 1980, 1.3));
        list.add(new Car("TOYOTA", 1996, 2.1));
        list.add(new Car("BMW", 2010, 3.2));
        list.add(new Car("MERCEDES", 2015, 5.7));
        return list;
    }
}
