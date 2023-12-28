package task2;

public class Student {




        private String name;

        private String surname;

        private int groupNumber;



        public Student(String name, String surname) {

            this.name = name;

            this.surname = surname;

        }



        public Student(String surname, int groupNumber) {

            this.surname = surname;

            this.groupNumber = groupNumber;

        }



        public String getName() {

            return name;

        }



        public void setName(String name) {

            this.name = name;

        }



        public String getSurname() {

            return surname;

        }



        public void setSurname(String surname) {

            this.surname = surname;

        }



        public int getGroupNumber() {

            return groupNumber;

        }



        public void setGroupNumber(int groupNumber) {

            if (groupNumber < 0) {

                throw new RuntimeException("Group number must be positive");



            } else this.groupNumber = groupNumber;

        }









        public static int increase (int studentGroupNumber) {

            return studentGroupNumber + 1;





        }

    }

