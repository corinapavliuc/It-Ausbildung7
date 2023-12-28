package task1;

public class CarTest {


        public static void main(String[] args) {

            Car car = new Car();// sozdajom objekt klassa

            car.bradOfTheCar = "Mercedes";// Inicializiruem pole klassa (tak kak ono public, k nemu svobodnij dostup)

            car.model = "ML";

            car.setEnginePower(250); // tak kak pole privatnoe cherez setter ustanavlivaem znachenie

            System.out.println("Engine power is: " + car.getEnginePower());//s pomoshju get obrashaemsja k znacheniju "EnginePower"



            Factory pkw = new Factory();

            Factory sportCar = new Factory();

            Factory lkw = new Factory();



            pkw.beep();

            sportCar.goFast(150);

            lkw.roll("LKW");



        }

    }
}
