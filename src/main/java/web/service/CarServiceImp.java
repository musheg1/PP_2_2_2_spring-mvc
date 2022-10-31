package web.service;

import web.dao.CarDao;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarDao dao;

    public CarServiceImp(CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getListCar(int count) {
        return dao.getListCar().stream().limit(count).toList();
    }
}
