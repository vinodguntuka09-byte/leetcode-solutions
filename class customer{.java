class customer {
    void details(){
        System.out.println("customer details");
    }
}
class employee extends customer {
    void work (){
        System.out.println("employee work");
    }
    class ceo extends employee {
        void alldetails(){
            System.out.println("they know all details");
                }
    }
    class Main {
        public static void main(string{[] args) {
            ceo h=new ceo();
            h.alldetails();
            h.details();
            h.work();
            employee e = new employee();
            e.work();
            e.details();
            customer c=new customer();
            c.details();
        }
    }
}