package ro.jademy.dataSource;

import ro.jademy.carData.Audi.AudiA3Sportback;
import ro.jademy.carData.Car;
import ro.jademy.carData.Dacia.DaciaDokker;
import ro.jademy.carData.Dacia.DaciaDuster;
import ro.jademy.carData.Dacia.DaciaLogan;
import ro.jademy.carData.Dacia.DaciaSandero;
import ro.jademy.carData.Hyundai.HyundaiI20;
import ro.jademy.carData.Hyundai.HyundaiKona;
import ro.jademy.carData.Hyundai.HyundaiSantaFe;
import ro.jademy.carData.Toyota.ToyotaLandCruiser;
import ro.jademy.carData.Toyota.ToyotaTundra;
import ro.jademy.carData.Toyota.ToyotaYaris;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarsInShop {



    public static List<Car> allCars() {
        List<Car> carList = new ArrayList<>();

       Car audiA3Sportback1=new AudiA3Sportback( LocalDate.of(2015,1,1),"gasoline",25000,4,5);
       Car audiA71=new AudiA3Sportback( LocalDate.of(2015,1,1),"gasoline",25000,4,5);
       Car audiQ31=new AudiA3Sportback( LocalDate.of(2015,1,1),"gasoline",25000,4,5);
       Car audiTTScoupe1=new AudiA3Sportback(LocalDate.of(2015,1,1),"gasoline",25000,4,5);

        Car daciaDokker1=new DaciaDokker(LocalDate.of(2015,1,1),"gasoline",25000,4,5);
        Car daciaDuster1=new DaciaDuster(LocalDate.of(2015,1,1),"gasoline",25000,4,5);
        Car daciaLogan1=new DaciaLogan(LocalDate.of(2015,1,1),"gasoline",25000,4,5);
        Car daciaSandero1=new DaciaSandero(LocalDate.of(2015,1,1),"gasoline",25000,4,5);

        Car hyundaiI201=new HyundaiI20(LocalDate.of(2015,1,1),"gasoline",25000,4,5);
        Car hyundaiKona=new HyundaiKona(LocalDate.of(2015,1,1),"gasoline",25000,4,5);
        Car hyundaiSantaFe=new HyundaiSantaFe(LocalDate.of(2015,1,1),"gasoline",25000,4,5);


        Car toyotaLandCruiser=new ToyotaLandCruiser(LocalDate.of(2015,1,1),"gasoline",25000,4,5);
        Car toyotaTundra=new ToyotaTundra(LocalDate.of(2015,1,1),"gasoline",25000,4,5);
        Car toyotaYaris=new ToyotaYaris(LocalDate.of(2015,1,1),"gasoline",25000,4,5);

        carList.add(audiA3Sportback1);
        carList.add(audiA71);
        carList.add(audiQ31);
        carList.add(audiTTScoupe1);

        carList.add(daciaDokker1);
        carList.add(daciaDuster1);
        carList.add(daciaLogan1);
        carList.add(daciaSandero1);

        carList.add(hyundaiI201);
        carList.add(hyundaiKona);
        carList.add(hyundaiSantaFe);

        carList.add(toyotaLandCruiser);
        carList.add(toyotaTundra);
        carList.add(toyotaYaris);

        return carList;

    }

}
