package comparatTorDemo;

 class Student {
    int rollNo;
    String name;
     int age;
     Student(int rollNo,String name,int age){
         this.rollNo=rollNo;
         this.name=name;
         this.age=age;
     }
     int getAge() {
         return age;
     }

      void setAge(int age) {
         this.age = age;
     }


     int getRollNo() {
        return rollNo;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
