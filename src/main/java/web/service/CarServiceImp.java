package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.models.Car;

import java.util.List;
@Component
public class CarServiceImp implements CarService {
    private CarDao carDao = new CarDaoImp();
    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }
}
