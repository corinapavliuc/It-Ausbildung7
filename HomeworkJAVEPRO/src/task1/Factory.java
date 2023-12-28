package task1;

public class Factory {






        public void beep() {

            System.out.println("Car sounds Beep- Beep");

        }



        public void goFast(int limit) {

            if (limit > 100) {

                System.out.println("Car goes too fast");

            } else if (limit < 100 && limit > 0) {

                System.out.println("Car goes slow");

            } else

                System.out.println("Car parked"); //pochemu ne rabotaet  pri takom uslovii????

        }



        public void roll(String carType) {

            System.out.println(carType + " " + "wheels roll");

        }

    }
