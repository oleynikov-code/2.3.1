package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImp implements CarDao{
    private List<Car> list;
    {
        list = new ArrayList<>();
        list.add(new Car("Camry",3,212432149));
        list.add(new Car("BMW",5,436535123));
        list.add(new Car("CIVIC",2,858943215));
        list.add(new Car("GLE",8,876943085));
        list.add(new Car("LADA",9,325679091));
    }

    @Override
    public List<Car> getCarList(int count) {
        return list.stream().limit(count).toList();
    }

}
